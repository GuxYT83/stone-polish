package org.gux83.sp.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import org.gux83.sp.world.ModPlacedFeatures;
import net.minecraft.world.gen.GenerationStep;

public class ModOreGeneration {

    public static void generateOres() {

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                        BiomeKeys.RIVER,
                        BiomeKeys.STONY_SHORE,
                        BiomeKeys.SWAMP),
                GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.SHALE_BLOCK_PLACED_KEY);


    }
}
