
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tartiflette.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.tartiflette.item.DeepwaterItem;
import net.mcreator.tartiflette.item.AbbyzziumoreItem;
import net.mcreator.tartiflette.item.Abbyzzium_pickaseSwordItem;
import net.mcreator.tartiflette.item.Abbyzzium_pickaseShovelItem;
import net.mcreator.tartiflette.item.Abbyzzium_pickasePickaxeItem;
import net.mcreator.tartiflette.item.Abbyzzium_pickaseHoeItem;
import net.mcreator.tartiflette.item.Abbyzzium_pickaseAxeItem;
import net.mcreator.tartiflette.item.Abbyzzium_armorArmorItem;
import net.mcreator.tartiflette.item.AbbyzzeItem;
import net.mcreator.tartiflette.TartifletteMod;

public class TartifletteModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TartifletteMod.MODID);
	public static final RegistryObject<Item> ABBYZZE = REGISTRY.register("abbyzze", () -> new AbbyzzeItem());
	public static final RegistryObject<Item> DEEPWATER_BUCKET = REGISTRY.register("deepwater_bucket", () -> new DeepwaterItem());
	public static final RegistryObject<Item> ABBYZZIUM = block(TartifletteModBlocks.ABBYZZIUM, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ABBYZZIUMORE = REGISTRY.register("abbyzziumore", () -> new AbbyzziumoreItem());
	public static final RegistryObject<Item> ABBYZZIUM_ARMOR_ARMOR_HELMET = REGISTRY.register("abbyzzium_armor_armor_helmet",
			() -> new Abbyzzium_armorArmorItem.Helmet());
	public static final RegistryObject<Item> ABBYZZIUM_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("abbyzzium_armor_armor_chestplate",
			() -> new Abbyzzium_armorArmorItem.Chestplate());
	public static final RegistryObject<Item> ABBYZZIUM_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("abbyzzium_armor_armor_leggings",
			() -> new Abbyzzium_armorArmorItem.Leggings());
	public static final RegistryObject<Item> ABBYZZIUM_ARMOR_ARMOR_BOOTS = REGISTRY.register("abbyzzium_armor_armor_boots",
			() -> new Abbyzzium_armorArmorItem.Boots());
	public static final RegistryObject<Item> ABBYZZIUM_PICKASE_PICKAXE = REGISTRY.register("abbyzzium_pickase_pickaxe",
			() -> new Abbyzzium_pickasePickaxeItem());
	public static final RegistryObject<Item> ABBYZZIUM_PICKASE_AXE = REGISTRY.register("abbyzzium_pickase_axe", () -> new Abbyzzium_pickaseAxeItem());
	public static final RegistryObject<Item> ABBYZZIUM_PICKASE_SWORD = REGISTRY.register("abbyzzium_pickase_sword",
			() -> new Abbyzzium_pickaseSwordItem());
	public static final RegistryObject<Item> ABBYZZIUM_PICKASE_SHOVEL = REGISTRY.register("abbyzzium_pickase_shovel",
			() -> new Abbyzzium_pickaseShovelItem());
	public static final RegistryObject<Item> ABBYZZIUM_PICKASE_HOE = REGISTRY.register("abbyzzium_pickase_hoe", () -> new Abbyzzium_pickaseHoeItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
