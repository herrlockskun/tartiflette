
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tartiflette.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.tartiflette.world.features.plants.AbbyzzewoodFeature;
import net.mcreator.tartiflette.world.features.ores.AbbyzzOreFeature;
import net.mcreator.tartiflette.world.features.lakes.DeepwaterFeature;
import net.mcreator.tartiflette.TartifletteMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class TartifletteModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, TartifletteMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> DEEPWATER = register("deepwater", DeepwaterFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.LAKES, DeepwaterFeature.GENERATE_BIOMES, DeepwaterFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ABBYZZ_ORE = register("abbyzz_ore", AbbyzzOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, AbbyzzOreFeature.GENERATE_BIOMES, AbbyzzOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ABBYZZEWOOD = register("abbyzzewood", AbbyzzewoodFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, AbbyzzewoodFeature.GENERATE_BIOMES, AbbyzzewoodFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
