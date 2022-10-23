
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tartiflette.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.tartiflette.block.DeepwaterBlock;
import net.mcreator.tartiflette.block.Abbyzze_woodWoodBlock;
import net.mcreator.tartiflette.block.Abbyzze_woodStairsBlock;
import net.mcreator.tartiflette.block.Abbyzze_woodSlabBlock;
import net.mcreator.tartiflette.block.Abbyzze_woodPressurePlateBlock;
import net.mcreator.tartiflette.block.Abbyzze_woodPlanksBlock;
import net.mcreator.tartiflette.block.Abbyzze_woodLogBlock;
import net.mcreator.tartiflette.block.Abbyzze_woodLeavesBlock;
import net.mcreator.tartiflette.block.Abbyzze_woodFenceGateBlock;
import net.mcreator.tartiflette.block.Abbyzze_woodFenceBlock;
import net.mcreator.tartiflette.block.Abbyzze_woodButtonBlock;
import net.mcreator.tartiflette.block.AbbyzzePortalBlock;
import net.mcreator.tartiflette.block.AbbyzzOreBlock;
import net.mcreator.tartiflette.block.AbbyzzBlockBlock;
import net.mcreator.tartiflette.TartifletteMod;

public class TartifletteModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TartifletteMod.MODID);
	public static final RegistryObject<Block> ABBYZZE_PORTAL = REGISTRY.register("abbyzze_portal", () -> new AbbyzzePortalBlock());
	public static final RegistryObject<Block> DEEPWATER = REGISTRY.register("deepwater", () -> new DeepwaterBlock());
	public static final RegistryObject<Block> ABBYZZ_ORE = REGISTRY.register("abbyzz_ore", () -> new AbbyzzOreBlock());
	public static final RegistryObject<Block> ABBYZZ_BLOCK = REGISTRY.register("abbyzz_block", () -> new AbbyzzBlockBlock());
	public static final RegistryObject<Block> ABBYZZE_WOOD_WOOD = REGISTRY.register("abbyzze_wood_wood", () -> new Abbyzze_woodWoodBlock());
	public static final RegistryObject<Block> ABBYZZE_WOOD_LOG = REGISTRY.register("abbyzze_wood_log", () -> new Abbyzze_woodLogBlock());
	public static final RegistryObject<Block> ABBYZZE_WOOD_PLANKS = REGISTRY.register("abbyzze_wood_planks", () -> new Abbyzze_woodPlanksBlock());
	public static final RegistryObject<Block> ABBYZZE_WOOD_LEAVES = REGISTRY.register("abbyzze_wood_leaves", () -> new Abbyzze_woodLeavesBlock());
	public static final RegistryObject<Block> ABBYZZE_WOOD_STAIRS = REGISTRY.register("abbyzze_wood_stairs", () -> new Abbyzze_woodStairsBlock());
	public static final RegistryObject<Block> ABBYZZE_WOOD_SLAB = REGISTRY.register("abbyzze_wood_slab", () -> new Abbyzze_woodSlabBlock());
	public static final RegistryObject<Block> ABBYZZE_WOOD_FENCE = REGISTRY.register("abbyzze_wood_fence", () -> new Abbyzze_woodFenceBlock());
	public static final RegistryObject<Block> ABBYZZE_WOOD_FENCE_GATE = REGISTRY.register("abbyzze_wood_fence_gate",
			() -> new Abbyzze_woodFenceGateBlock());
	public static final RegistryObject<Block> ABBYZZE_WOOD_PRESSURE_PLATE = REGISTRY.register("abbyzze_wood_pressure_plate",
			() -> new Abbyzze_woodPressurePlateBlock());
	public static final RegistryObject<Block> ABBYZZE_WOOD_BUTTON = REGISTRY.register("abbyzze_wood_button", () -> new Abbyzze_woodButtonBlock());
}
