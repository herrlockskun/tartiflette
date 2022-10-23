
package net.mcreator.tartiflette.world.features.plants;

import com.mojang.serialization.Codec;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

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
