
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tartiflette.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.tartiflette.block.DeepwaterBlock;
import net.mcreator.tartiflette.block.AbbyzziumBlock;
import net.mcreator.tartiflette.block.AbbyzzePortalBlock;
import net.mcreator.tartiflette.TartifletteMod;

public class TartifletteModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TartifletteMod.MODID);
	public static final RegistryObject<Block> ABBYZZE_PORTAL = REGISTRY.register("abbyzze_portal", () -> new AbbyzzePortalBlock());
	public static final RegistryObject<Block> DEEPWATER = REGISTRY.register("deepwater", () -> new DeepwaterBlock());
	public static final RegistryObject<Block> ABBYZZIUM = REGISTRY.register("abbyzzium", () -> new AbbyzziumBlock());
}
