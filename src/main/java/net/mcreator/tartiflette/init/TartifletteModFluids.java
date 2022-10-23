
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tartiflette.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.tartiflette.fluid.DeepwaterFluid;
import net.mcreator.tartiflette.TartifletteMod;

public class TartifletteModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, TartifletteMod.MODID);
	public static final RegistryObject<Fluid> DEEPWATER = REGISTRY.register("deepwater", () -> new DeepwaterFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_DEEPWATER = REGISTRY.register("flowing_deepwater", () -> new DeepwaterFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(DEEPWATER.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_DEEPWATER.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
