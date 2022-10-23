
package net.mcreator.tartiflette.fluid;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.BlockPos;

import net.mcreator.tartiflette.init.TartifletteModItems;
import net.mcreator.tartiflette.init.TartifletteModFluids;
import net.mcreator.tartiflette.init.TartifletteModBlocks;
import net.mcreator.tartiflette.fluid.attributes.DeepwaterFluidAttributes;

public abstract class DeepwaterFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(TartifletteModFluids.DEEPWATER,
			TartifletteModFluids.FLOWING_DEEPWATER,
			DeepwaterFluidAttributes
					.builder(new ResourceLocation("tartiflette:blocks/deep_water"), new ResourceLocation("tartiflette:blocks/jesaispas"))

					.sound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.deepslate_bricks.fall"))).color(-13083194))
			.explosionResistance(100f).canMultiply().tickRate(1)

			.bucket(TartifletteModItems.DEEPWATER_BUCKET).block(() -> (LiquidBlock) TartifletteModBlocks.DEEPWATER.get());

	private DeepwaterFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.ASH;
	}

	@Override
	public Vec3 getFlow(BlockGetter world, BlockPos pos, FluidState fluidstate) {
		return super.getFlow(world, pos, fluidstate).scale(0);
	}

	public static class Source extends DeepwaterFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends DeepwaterFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
