
package net.mcreator.tartiflette.world.features.plants;

import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.BlockColumnConfiguration;
import net.minecraft.world.level.levelgen.feature.RandomPatchFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.util.valueproviders.BiasedToBottomInt;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;
import net.minecraft.core.BlockPos;

import net.mcreator.tartiflette.init.TartifletteModBlocks;

import java.util.Set;
import java.util.List;

public class AbbyzzewoodFeature extends RandomPatchFeature {
	public static AbbyzzewoodFeature FEATURE = null;
	public static Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new AbbyzzewoodFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("tartiflette:abbyzzewood", FEATURE,
				FeatureUtils.simpleRandomPatchConfiguration(64,
						PlacementUtils.filtered(Feature.BLOCK_COLUMN,
								BlockColumnConfiguration.simple(BiasedToBottomInt.of(2, 4),
										BlockStateProvider.simple(TartifletteModBlocks.ABBYZZEWOOD.get().defaultBlockState())),
								BlockPredicate.allOf(BlockPredicate.ONLY_IN_AIR_PREDICATE,
										BlockPredicate.wouldSurvive(TartifletteModBlocks.ABBYZZEWOOD.get().defaultBlockState(), BlockPos.ZERO)))));
		PLACED_FEATURE = PlacementUtils.register("tartiflette:abbyzzewood", CONFIGURED_FEATURE, List.of(CountPlacement.of(5),
				RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("tartiflette:abbyzzebiome"));
	private final Set<ResourceKey<Level>> generate_dimensions = Set
			.of(ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("tartiflette:abbyzze")));

	public AbbyzzewoodFeature() {
		super(RandomPatchConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<RandomPatchConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}
}
