
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tartiflette.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.tartiflette.item.DeepwaterItem;
import net.mcreator.tartiflette.item.AbbyzzeItem;
import net.mcreator.tartiflette.TartifletteMod;

public class TartifletteModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TartifletteMod.MODID);
	public static final RegistryObject<Item> ABBYZZE = REGISTRY.register("abbyzze", () -> new AbbyzzeItem());
	public static final RegistryObject<Item> DEEPWATER_BUCKET = REGISTRY.register("deepwater_bucket", () -> new DeepwaterItem());
}
