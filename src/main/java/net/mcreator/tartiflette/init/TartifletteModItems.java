
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
import net.mcreator.tartiflette.item.AbbyzzeItem;
import net.mcreator.tartiflette.item.AbbyzzSwordItem;
import net.mcreator.tartiflette.item.AbbyzzShovelItem;
import net.mcreator.tartiflette.item.AbbyzzPickaxeItem;
import net.mcreator.tartiflette.item.AbbyzzItem;
import net.mcreator.tartiflette.item.AbbyzzHoeItem;
import net.mcreator.tartiflette.item.AbbyzzAxeItem;
import net.mcreator.tartiflette.item.AbbyzzArmorItem;
import net.mcreator.tartiflette.TartifletteMod;

public class TartifletteModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TartifletteMod.MODID);
	public static final RegistryObject<Item> ABBYZZE = REGISTRY.register("abbyzze", () -> new AbbyzzeItem());
	public static final RegistryObject<Item> DEEPWATER_BUCKET = REGISTRY.register("deepwater_bucket", () -> new DeepwaterItem());
	public static final RegistryObject<Item> ABBYZZ = REGISTRY.register("abbyzz", () -> new AbbyzzItem());
	public static final RegistryObject<Item> ABBYZZ_ORE = block(TartifletteModBlocks.ABBYZZ_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ABBYZZ_BLOCK = block(TartifletteModBlocks.ABBYZZ_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ABBYZZ_PICKAXE = REGISTRY.register("abbyzz_pickaxe", () -> new AbbyzzPickaxeItem());
	public static final RegistryObject<Item> ABBYZZ_AXE = REGISTRY.register("abbyzz_axe", () -> new AbbyzzAxeItem());
	public static final RegistryObject<Item> ABBYZZ_SWORD = REGISTRY.register("abbyzz_sword", () -> new AbbyzzSwordItem());
	public static final RegistryObject<Item> ABBYZZ_SHOVEL = REGISTRY.register("abbyzz_shovel", () -> new AbbyzzShovelItem());
	public static final RegistryObject<Item> ABBYZZ_HOE = REGISTRY.register("abbyzz_hoe", () -> new AbbyzzHoeItem());
	public static final RegistryObject<Item> ABBYZZ_ARMOR_HELMET = REGISTRY.register("abbyzz_armor_helmet", () -> new AbbyzzArmorItem.Helmet());
	public static final RegistryObject<Item> ABBYZZ_ARMOR_CHESTPLATE = REGISTRY.register("abbyzz_armor_chestplate",
			() -> new AbbyzzArmorItem.Chestplate());
	public static final RegistryObject<Item> ABBYZZ_ARMOR_LEGGINGS = REGISTRY.register("abbyzz_armor_leggings", () -> new AbbyzzArmorItem.Leggings());
	public static final RegistryObject<Item> ABBYZZ_ARMOR_BOOTS = REGISTRY.register("abbyzz_armor_boots", () -> new AbbyzzArmorItem.Boots());
	public static final RegistryObject<Item> ABBYZZE_WOOD_WOOD = block(TartifletteModBlocks.ABBYZZE_WOOD_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ABBYZZE_WOOD_LOG = block(TartifletteModBlocks.ABBYZZE_WOOD_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ABBYZZE_WOOD_PLANKS = block(TartifletteModBlocks.ABBYZZE_WOOD_PLANKS,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ABBYZZE_WOOD_LEAVES = block(TartifletteModBlocks.ABBYZZE_WOOD_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> ABBYZZE_WOOD_STAIRS = block(TartifletteModBlocks.ABBYZZE_WOOD_STAIRS,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ABBYZZE_WOOD_SLAB = block(TartifletteModBlocks.ABBYZZE_WOOD_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ABBYZZE_WOOD_FENCE = block(TartifletteModBlocks.ABBYZZE_WOOD_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> ABBYZZE_WOOD_FENCE_GATE = block(TartifletteModBlocks.ABBYZZE_WOOD_FENCE_GATE,
			CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> ABBYZZE_WOOD_PRESSURE_PLATE = block(TartifletteModBlocks.ABBYZZE_WOOD_PRESSURE_PLATE,
			CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> ABBYZZE_WOOD_BUTTON = block(TartifletteModBlocks.ABBYZZE_WOOD_BUTTON,
			CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
