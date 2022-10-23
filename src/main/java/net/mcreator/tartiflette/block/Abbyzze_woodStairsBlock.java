
package net.mcreator.tartiflette.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;

public class Abbyzze_woodStairsBlock extends StairBlock {

	public Abbyzze_woodStairsBlock() {
		super(() -> Blocks.AIR.defaultBlockState(),
				BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(6f, 4f).dynamicShape());

	}

	@Override
	public float getExplosionResistance() {
		return 4f;
	}

	@Override
	public boolean isRandomlyTicking(BlockState p_56947_) {
		return false;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 10;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

}
