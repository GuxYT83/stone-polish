package org.gux83.sp.world;

import net.minecraft.block.Blocks;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import org.gux83.sp.Sp;
import org.gux83.sp.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> SHALE_BLOCK_KEY = registerKey("shale_block");



    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);


        List<OreFeatureConfig.Target> overworldshale = List.of(
                OreFeatureConfig.createTarget(
                        new BlockMatchRuleTest(Blocks.STONE),
                        ModBlocks.SHALE_BLOCK.getDefaultState()
                ),
                OreFeatureConfig.createTarget(
                        new BlockMatchRuleTest(Blocks.GRAVEL),
                        ModBlocks.SHALE_BLOCK.getDefaultState()
                )
        );



        register(context, SHALE_BLOCK_KEY, Feature.ORE, new OreFeatureConfig(overworldshale, 32));


    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Sp.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
