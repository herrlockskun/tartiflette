
package net.mcreator.tartiflette.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.tartiflette.init.TartifletteModFluids;

public class DeepwaterBlock extends LiquidBlock {
	public DeepwaterBlock() {
		super(() -> (FlowingFluid) TartifletteModFluids.DEEPWATER.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
	}
}
