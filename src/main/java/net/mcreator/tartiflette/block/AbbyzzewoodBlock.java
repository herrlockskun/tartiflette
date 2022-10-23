
package net.mcreator.tartiflette.block;

import net.minecraftforge.common.PlantType;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SugarCaneBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.tartiflette.init.TartifletteModBlocks;

import java.util.Random;
import java.util.List;
import java.util.Collections;

public class AbbyzzewoodBlock extends SugarCaneBlock {
	public AbbyzzewoodBlock() {
		super(BlockBehaviour.Properties.of(Material.PLANT).randomTicks().sound(SoundType.GRASS).instabreak().noCollission());
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 60;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		BlockPos blockpos = pos.below();
		BlockState groundState = worldIn.getBlockState(blockpos);
		return groundState.is(this) || groundState.is(Blocks.DEAD_TUBE_CORAL_BLOCK) || groundState.is(Blocks.DEAD_BRAIN_CORAL_BLOCK)
				|| groundState.is(Blocks.DEAD_BUBBLE_CORAL_BLOCK) || groundState.is(Blocks.DEAD_FIRE_CORAL_BLOCK)
				|| groundState.is(Blocks.DEAD_HORN_CORAL_BLOCK)

		;
	}

	@Override
	public PlantType getPlantType(BlockGetter world, BlockPos pos) {
		return PlantType.NETHER;
	}

	@Override
	public void randomTick(BlockState blockstate, ServerLevel world, BlockPos blockpos, Random random) {
		if (world.isEmptyBlock(blockpos.above())) {
			int i = 1;
			for (; world.getBlockState(blockpos.below(i)).is(this); ++i);
			if (i < 4) {
				int j = blockstate.getValue(AGE);
				if (ForgeHooks.onCropsGrowPre(world, blockpos, blockstate, true)) {
					if (j == 15) {
						world.setBlockAndUpdate(blockpos.above(), defaultBlockState());
						world.setBlock(blockpos, blockstate.setValue(AGE, 0), 4);
					} else
						world.setBlock(blockpos, blockstate.setValue(AGE, j + 1), 4);
				}
			}
		}
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(TartifletteModBlocks.ABBYZZEWOOD.get(), renderType -> renderType == RenderType.cutout());
	}
}
