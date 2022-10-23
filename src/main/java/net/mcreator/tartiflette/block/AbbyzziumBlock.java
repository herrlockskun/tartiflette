
package net.mcreator.tartiflette.block;

import net.minecraftforge.common.util.ForgeSoundType;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.tartiflette.init.TartifletteModItems;

import java.util.List;
import java.util.Collections;

public class AbbyzziumBlock extends Block {
	public AbbyzziumBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE)
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> new SoundEvent(new ResourceLocation("block.amethyst_cluster.hit")),
						() -> new SoundEvent(new ResourceLocation("block.amethyst_block.step")),
						() -> new SoundEvent(new ResourceLocation("block.amethyst_cluster.place")),
						() -> new SoundEvent(new ResourceLocation("block.amethyst_block.hit")),
						() -> new SoundEvent(new ResourceLocation("block.amethyst_block.fall"))))
				.strength(100f, 10f).requiresCorrectToolForDrops().speedFactor(0f).jumpFactor(0f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= 4;
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(TartifletteModItems.ABBYZZIUMORE.get()));
	}
}
