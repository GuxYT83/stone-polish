package org.gux83.sp.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import org.gux83.sp.Sp;

import static net.minecraft.block.Blocks.*;


public class ModBlocks {

    // Polished Calcite
    public static final Block POLISHED_CALCITE = registerBlock("polished_calcite",
             new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .sounds(BlockSoundGroup.CALCITE)
                    .requiresTool()
                    .strength(0.75f)
            )
    );

    // Polished Calcite Brick
    public static final Block POLISHED_CALCITE_BRICKS = registerBlock("polished_calcite_bricks",
             new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .sounds(BlockSoundGroup.CALCITE)
                    .requiresTool()
                    .strength(0.75f)
            )
    );

    // Chiseled Polished Calcite
    public static final Block CHISELED_POLISHED_CALCITE = registerBlock("chiseled_polished_calcite",
             new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .sounds(BlockSoundGroup.CALCITE)
                    .requiresTool()
                    .strength(0.75f)
            )
    );

    // Polished Calcite Pillar
    public static final Block POLISHED_CALCITE_PILLAR = registerBlock("polished_calcite_pillar",
             new PillarBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .sounds(BlockSoundGroup.CALCITE)
                    .requiresTool()
                    .strength(0.75f)
            )
    );

    // Variants Normal
    public static final Block POLISHED_CALCITE_STAIRS = registerBlock("polished_calcite_stairs",
             new StairsBlock(POLISHED_CALCITE.getDefaultState(), AbstractBlock.Settings.copy(POLISHED_CALCITE))
    );

    public static final Block POLISHED_CALCITE_SLAB = registerBlock("polished_calcite_slab",
             new SlabBlock(AbstractBlock.Settings.copy(POLISHED_CALCITE))
    );

    public static final Block POLISHED_CALCITE_WALL = registerBlock("polished_calcite_wall",
             new WallBlock(AbstractBlock.Settings.copy(POLISHED_CALCITE))
    );

    // Variants Bricks
    public static final Block POLISHED_CALCITE_BRICK_STAIRS = registerBlock("polished_calcite_brick_stairs",
            new StairsBlock(POLISHED_CALCITE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(POLISHED_CALCITE_BRICKS))
    );

    public static final Block POLISHED_CALCITE_BRICK_SLAB = registerBlock("polished_calcite_brick_slab",
             new SlabBlock(AbstractBlock.Settings.copy(POLISHED_CALCITE_BRICKS))
    );

    public static final Block POLISHED_CALCITE_BRICK_WALL = registerBlock("polished_calcite_brick_wall",
             new WallBlock(AbstractBlock.Settings.copy(POLISHED_CALCITE_BRICKS))
    );

    // Variants Raw
    public static final Block CALCITE_STAIRS = registerBlock("calcite_stairs",
             new StairsBlock(CALCITE.getDefaultState(), AbstractBlock.Settings.copy(CALCITE))
    );

    public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
             new SlabBlock(AbstractBlock.Settings.copy(CALCITE))
    );

    public static final Block CALCITE_WALL = registerBlock("calcite_wall",
             new WallBlock(AbstractBlock.Settings.copy(CALCITE))
    );


    public static final Block NETHERRACK_STAIRS = registerBlock("netherrack_stairs",
             new StairsBlock(NETHERRACK.getDefaultState(), AbstractBlock.Settings.copy(NETHERRACK))
    );

    public static final Block NETHERRACK_SLAB = registerBlock("netherrack_slab",
             new SlabBlock(AbstractBlock.Settings.copy(NETHERRACK))
    );

    public static final Block NETHERRACK_WALL = registerBlock("netherrack_wall",
            new WallBlock(AbstractBlock.Settings.copy(NETHERRACK))
    );

    // Polished Netherrack
    public static final Block POLISHED_NETHERRACK = registerBlock("polished_netherrack",
             new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED)
                    .sounds(BlockSoundGroup.NETHERRACK)
                    .requiresTool()
                    .strength(0.5f)
            )
    );


    public static final Block POLISHED_NETHERRACK_STAIRS = registerBlock("polished_netherrack_stairs",
             new StairsBlock(POLISHED_NETHERRACK.getDefaultState(), AbstractBlock.Settings.copy(POLISHED_NETHERRACK))
    );


    public static final Block POLISHED_NETHERRACK_SLAB = registerBlock("polished_netherrack_slab",
             new SlabBlock(AbstractBlock.Settings.copy(POLISHED_NETHERRACK))
    );


    public static final Block POLISHED_NETHERRACK_WALL = registerBlock("polished_netherrack_wall",
            new WallBlock(AbstractBlock.Settings.copy(POLISHED_NETHERRACK))
    );


    // Netherrack Bricks
    public static final Block NETHERRACK_BRICKS = registerBlock("netherrack_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED)
                    .sounds(BlockSoundGroup.NETHERRACK)
                    .requiresTool()
                    .strength(0.5f)
            )
    );







    public static final Block SHALE_BLOCK = registerBlock("shale_block",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_BROWN)
                    .sounds(BlockSoundGroup.DEEPSLATE)
                    .requiresTool()
                    .strength(0.8f)
            )
    );


    public static final Block POLISHED_SHALE_BLOCK = registerBlock("polished_shale_block",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_BROWN)
                    .sounds(BlockSoundGroup.DEEPSLATE)
                    .requiresTool()
                    .strength(0.8f)
            )
    );


    public static final Block SHALE_BRICKS = registerBlock("shale_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_BROWN)
                    .sounds(BlockSoundGroup.DEEPSLATE)
                    .requiresTool()
                    .strength(0.8f)
            )
    );




    public static final Block CHISELED_SHALE = registerBlock("chiseled_shale",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_BROWN)
                    .sounds(BlockSoundGroup.DEEPSLATE)
                    .requiresTool()
                    .strength(0.8f)
            )
    );


    public static final Block SHALE_TILES = registerBlock("shale_tiles",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_BROWN)
                    .sounds(BlockSoundGroup.DEEPSLATE)
                    .requiresTool()
                    .strength(0.8f)
            )
    );


    public static final Block CRACKED_SHALE_BRICKS = registerBlock("cracked_shale_bricks",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_BROWN)
                    .sounds(BlockSoundGroup.DEEPSLATE)
                    .requiresTool()
                    .strength(0.8f)
            )
    );




    public static final Block SHALE_PILLAR = registerBlock("shale_pillar",  new PillarBlock(AbstractBlock
            .Settings.create()
            .requiresTool().strength(0.8F)
            .sounds(BlockSoundGroup.DEEPSLATE)));




    public static final Block SHALE_STAIRS = registerBlock("shale_stairs",
            new StairsBlock(SHALE_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(SHALE_BLOCK))
    );


    public static final Block SHALE_SLAB = registerBlock("shale_slab",
            new SlabBlock(AbstractBlock.Settings.copy(SHALE_BLOCK))
    );


    public static final Block SHALE_WALL = registerBlock("shale_wall",
            new WallBlock(AbstractBlock.Settings.copy(SHALE_BLOCK))
    );



    public static final Block POLISHED_SHALE_STAIRS = registerBlock("polished_shale_stairs",
            new StairsBlock(POLISHED_SHALE_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(POLISHED_SHALE_BLOCK))
    );


    public static final Block POLISHED_SHALE_SLAB = registerBlock("polished_shale_slab",
            new SlabBlock(AbstractBlock.Settings.copy(POLISHED_SHALE_BLOCK))
    );


    public static final Block POLISHED_SHALE_WALL = registerBlock("polished_shale_wall",
            new WallBlock(AbstractBlock.Settings.copy(POLISHED_SHALE_BLOCK))
    );



    public static final Block SHALE_BRICK_STAIRS = registerBlock("shale_brick_stairs",
            new StairsBlock(SHALE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(SHALE_BRICKS))
    );


    public static final Block SHALE_BRICK_SLAB = registerBlock("shale_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(SHALE_BRICKS))
    );


    public static final Block SHALE_BRICK_WALL = registerBlock("shale_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(SHALE_BRICKS))
    );



    public static final Block SHALE_TILE_STAIRS = registerBlock("shale_tile_stairs",
            new StairsBlock(SHALE_TILES.getDefaultState(), AbstractBlock.Settings.copy(SHALE_TILES))
    );


    public static final Block SHALE_TILE_SLAB = registerBlock("shale_tile_slab",
            new SlabBlock(AbstractBlock.Settings.copy(SHALE_BRICKS))
    );


    public static final Block SHALE_TILE_WALL = registerBlock("shale_tile_wall",
            new WallBlock(AbstractBlock.Settings.copy(SHALE_TILES))
    );









    public static final Block NETHERRACK_BRICK_STAIRS = registerBlock("netherrack_brick_stairs",
             new StairsBlock(NETHERRACK_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(NETHERRACK_BRICKS))
    );


    public static final Block NETHERRACK_BRICK_SLAB = registerBlock("netherrack_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(NETHERRACK_BRICKS))
    );


    public static final Block NETHERRACK_BRICK_WALL = registerBlock("netherrack_brick_wall",
             new WallBlock(AbstractBlock.Settings.copy(NETHERRACK_BRICKS))
    );



    // Cracked Netherrack Bricks
    public static final Block CRACKED_NETHERRACK_BRICKS = registerBlock("cracked_netherrack_bricks",
             new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED)
                    .sounds(BlockSoundGroup.NETHERRACK)
                    .requiresTool()
                    .strength(0.5f)
            )
    );



    // Chiseled Netherrack Bricks
    public static final Block CHISELED_NETHERRACK_BRICKS = registerBlock("chiseled_netherrack_bricks",
             new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED)
                    .sounds(BlockSoundGroup.NETHERRACK)
                    .requiresTool()
                    .strength(0.5f)
            )
    );



    // Polished Netherrack Pillar
    public static final Block POLISHED_NETHERRACK_PILLAR = registerBlock("polished_netherrack_pillar",
             new PillarBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.RED)
                    .sounds(BlockSoundGroup.NETHERRACK)
                    .requiresTool()
                    .strength(0.5f)));




    public static final Block POLISHED_PACKED_MUD = registerBlock("polished_packed_mud",  new Block(AbstractBlock
            .Settings.create()
            .strength(1.0F, 3.0F)
            .requiresTool().sounds(BlockSoundGroup.PACKED_MUD)));




    public static final Block CHISELED_MUD_BRICKS = registerBlock("chiseled_mud_bricks",  new Block(AbstractBlock
            .Settings.create()
            .requiresTool().strength(1.0F, 3.0F)
            .sounds(BlockSoundGroup.MUD_BRICKS)));



    public static final Block MUD_BRICK_PILLAR = registerBlock("mud_brick_pillar",  new PillarBlock(AbstractBlock
            .Settings.create()
            .requiresTool().strength(1.0F, 3.0F)
            .sounds(BlockSoundGroup.MUD_BRICKS)));




    public static final Block MOSSY_MUD_BRICKS = registerBlock("mossy_mud_bricks",  new Block(AbstractBlock
            .Settings.create()
            .requiresTool().strength(1.0F, 3.0F)
            .sounds(BlockSoundGroup.MUD_BRICKS)));




    public static final Block POLISHED_STONE = registerBlock("polished_stone",  new Block(AbstractBlock
            .Settings.create()
            .mapColor(MapColor
                    .STONE_GRAY)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));




    public static final Block POLISHED_END_STONE = registerBlock("polished_end_stone",  new Block(AbstractBlock
            .Settings.create()
            .mapColor(MapColor
                    .PALE_YELLOW)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 9.0F)));



    public static final Block POLISHED_END_STONE_PILLAR = registerBlock("polished_end_stone_pillar",  new PillarBlock(AbstractBlock
            .Settings.create()
            .mapColor(MapColor
                    .PALE_YELLOW)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 9.0F)));




    public static final Block CHISELED_END_STONE = registerBlock("chiseled_end_stone",  new Block(AbstractBlock
            .Settings.create()
            .mapColor(MapColor
                    .PALE_YELLOW)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 9.0F)));


    public static final Block CRACKED_END_STONE_BRICKS = registerBlock("cracked_end_stone_bricks",  new Block(AbstractBlock
            .Settings.create()
            .mapColor(MapColor
                    .PALE_YELLOW)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 9.0F)));





    public static final Block POLISHED_SMOOTH_BASALT = registerBlock("polished_smooth_basalt",  new Block(AbstractBlock
            .Settings.create()
            .mapColor(MapColor
                    .CYAN)
            .sounds(BlockSoundGroup.BASALT).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));




    public static final Block SMOOTH_BASALT_BRICKS = registerBlock("smooth_basalt_bricks",  new Block(AbstractBlock
            .Settings.create()
            .mapColor(MapColor
                    .CYAN)
            .sounds(BlockSoundGroup.BASALT).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));


    public static final Block SMOOTH_BASALT_PILLAR = registerBlock("smooth_basalt_pillar",  new PillarBlock(AbstractBlock
            .Settings.create()
            .mapColor(MapColor
                    .CYAN)
            .sounds(BlockSoundGroup.BASALT).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));




    public static final Block CRACKED_SMOOTH_BASALT_BRICKS = registerBlock("cracked_smooth_basalt_bricks",  new Block(AbstractBlock
            .Settings.create()
            .mapColor(MapColor
                    .CYAN)
            .sounds(BlockSoundGroup.BASALT).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));




    public static final Block CHISELED_POLISHED_BASALT = registerBlock("chiseled_polished_basalt",  new Block(AbstractBlock
            .Settings.create()
            .mapColor(MapColor
                    .CYAN)
            .sounds(BlockSoundGroup.BASALT).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));












    public static final Block POLISHED_DRIPSTONE_BLOCK = registerBlock("polished_dripstone_block",  new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.DRIPSTONE_BLOCK).mapColor(MapColor
                    .TERRACOTTA_BROWN)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 1.0F)));



    public static final Block POLISHED_DRIPSTONE_PILLAR = registerBlock("polished_dripstone_pillar",  new PillarBlock(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.DRIPSTONE_BLOCK).mapColor(MapColor
                    .TERRACOTTA_BROWN)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 1.0F)));



    public static final Block CHISELED_DRIPSTONE_BRICKS = registerBlock("chiseled_dripstone_bricks",  new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.DRIPSTONE_BLOCK).mapColor(MapColor
                    .TERRACOTTA_BROWN)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 1.0F)));



    public static final Block ANDESITE_BRICKS = registerBlock("andesite_bricks",  new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .STONE_GRAY)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));


    public static final Block CRACKED_ANDESITE_BRICKS = registerBlock("cracked_andesite_bricks",  new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .STONE_GRAY)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));



    public static final Block CHISELED_ANDESITE_BRICKS = registerBlock("chiseled_andesite_bricks", new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .STONE_GRAY)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));




    public static final Block GRANITE_BRICKS = registerBlock("granite_bricks", new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .STONE_GRAY)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));




    public static final Block GRANITE_BRICK_PILLAR = registerBlock("granite_brick_pillar",  new PillarBlock(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .STONE_GRAY)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));



    public static final Block ANDESITE_BRICK_PILLAR = registerBlock("andesite_brick_pillar",  new PillarBlock(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .STONE_GRAY)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));



    public static final Block DIORITE_BRICK_PILLAR = registerBlock("diorite_brick_pillar",  new PillarBlock(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .STONE_GRAY)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));



    public static final Block STONE_PILLAR = registerBlock("stone_pillar",  new PillarBlock(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .STONE_GRAY)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));






    public static final Block CRACKED_GRANITE_BRICKS = registerBlock("cracked_granite_bricks",  new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .STONE_GRAY)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));



    public static final Block CHISELED_GRANITE_BRICKS = registerBlock("chiseled_granite_bricks",  new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .STONE_GRAY)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));



    public static final Block DIORITE_BRICKS = registerBlock("diorite_bricks", new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .STONE_GRAY)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));


    public static final Block CRACKED_DIORITE_BRICKS = registerBlock("cracked_diorite_bricks",  new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .STONE_GRAY)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));



    public static final Block CHISELED_DIORITE_BRICKS = registerBlock("chiseled_diorite_bricks",  new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .STONE_GRAY)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));






    public static final Block CHISELED_PRISMARINE_BRICKS = registerBlock("chiseled_prismarine_bricks",  new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .DIAMOND_BLUE)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));



    public static final Block CRACKED_QUARTZ_BRICKS = registerBlock("cracked_quartz_bricks",  new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .OFF_WHITE)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F, 6.0F)));



    public static final Block MOSSY_PRISMARINE_BRICKS = registerBlock("mossy_prismarine_bricks",  new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .DIAMOND_BLUE)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));




    public static final Block POLISHED_PRISMARINE = registerBlock("polished_prismarine",  new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .DIAMOND_BLUE)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));


    public static final Block POLISHED_DARK_PRISMARINE = registerBlock("polished_dark_prismarine",  new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .DARK_AQUA)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));



    public static final Block CRACKED_DARK_PRISMARINE_PAVERS = registerBlock("cracked_dark_prismarine_pavers",  new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .DARK_AQUA)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));


    public static final Block CHISELED_DARK_PRISMARINE_PAVERS = registerBlock("chiseled_dark_prismarine_pavers",  new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .DARK_AQUA)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));



    public static final Block DARK_PRISMARINE = registerBlock("dark_prismarine",  new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .DARK_AQUA)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));


    public static final Block PRISMARINE_PILLAR = registerBlock("prismarine_pillar",  new PillarBlock(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .DIAMOND_BLUE)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));



    public static final Block DARK_PRISMARINE_PILLAR = registerBlock("dark_prismarine_pillar",  new PillarBlock(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .DIAMOND_BLUE)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));



    public static final Block DEEPSLATE_PILLAR = registerBlock("deepslate_pillar",  new PillarBlock(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.DEEPSLATE_TILES).mapColor(MapColor
                    .DEEPSLATE_GRAY)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.5F, 6.0F)));








    public static final Block DRIPSTONE_BRICKS = registerBlock("dripstone_bricks",  new Block(AbstractBlock
            .Settings.create()
            .mapColor(MapColor
                    .TERRACOTTA_BROWN)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 1.0F).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));






    public static final Block CRACKED_DRIPSTONE_BRICKS = registerBlock("cracked_dripstone_bricks",  new Block(AbstractBlock
            .Settings.create()
            .mapColor(MapColor
                    .TERRACOTTA_BROWN)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 1.0F).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));


    public static final Block CRACKED_POLISHED_CALCITE_BRICKS = registerBlock("cracked_polished_calcite_bricks",
             new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .sounds(BlockSoundGroup.CALCITE)
                    .requiresTool()
                    .strength(0.75f)
            )
    );



    public static final Block CRACKED_TUFF_BRICKS = registerBlock("cracked_tuff_bricks",
             new Block(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .sounds(BlockSoundGroup.TUFF_BRICKS)
                    .requiresTool()
                    .strength(1.5f)
            )
    );



    public static final Block TUFF_BRICK_PILLAR = registerBlock("tuff_brick_pillar",
             new PillarBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .sounds(BlockSoundGroup.TUFF_BRICKS)
                    .requiresTool()
                    .strength(1.5f)
            )
    );




    public static final Block CHISELED_PURPUR_BLOCK = registerBlock("chiseled_purpur_block", new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .MAGENTA)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));



    public static final Block CRACKED_PURPUR_TILES = registerBlock("cracked_purpur_tiles",  new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .MAGENTA)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));




    public static final Block PURPUR_BLOCK = registerBlock("purpur_block",  new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .MAGENTA)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.0F, 6.0F)));



    public static final Block POLISHED_PURPUR_BLOCK = registerBlock("polished_purpur_block",  new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .MAGENTA)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.0F, 6.0F)));






    public static final Block CHISELED_BRICKS = registerBlock("chiseled_bricks",  new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .RED)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));








    public static final Block TERRACOTTA_BRICKS = registerBlock("terracotta_bricks",  new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .TERRACOTTA_ORANGE)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));


    public static final Block BLACK_TERRACOTTA_BRICKS = registerBlock("black_terracotta_bricks",  new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .TERRACOTTA_ORANGE)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));


    public static final Block BLUE_TERRACOTTA_BRICKS = registerBlock("blue_terracotta_bricks",  new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .TERRACOTTA_ORANGE)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));


    public static final Block BROWN_TERRACOTTA_BRICKS = registerBlock("brown_terracotta_bricks",  new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .TERRACOTTA_ORANGE)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));


    public static final Block CYAN_TERRACOTTA_BRICKS = registerBlock("cyan_terracotta_bricks",  new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .TERRACOTTA_ORANGE)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));


    public static final Block GRAY_TERRACOTTA_BRICKS = registerBlock("gray_terracotta_bricks",  new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .TERRACOTTA_ORANGE)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));


    public static final Block GREEN_TERRACOTTA_BRICKS = registerBlock("green_terracotta_bricks",  new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .TERRACOTTA_ORANGE)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));


    public static final Block LIGHT_BLUE_TERRACOTTA_BRICKS = registerBlock("light_blue_terracotta_bricks",  new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .TERRACOTTA_ORANGE)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));


    public static final Block LIGHT_GRAY_TERRACOTTA_BRICKS = registerBlock("light_gray_terracotta_bricks",  new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .TERRACOTTA_ORANGE)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));


    public static final Block LIME_TERRACOTTA_BRICKS = registerBlock("lime_terracotta_bricks",  new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .TERRACOTTA_ORANGE)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));


    public static final Block MAGENTA_TERRACOTTA_BRICKS = registerBlock("magenta_terracotta_bricks",  new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .TERRACOTTA_ORANGE)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));


    public static final Block ORANGE_TERRACOTTA_BRICKS = registerBlock("orange_terracotta_bricks",  new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .TERRACOTTA_ORANGE)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));


    public static final Block PINK_TERRACOTTA_BRICKS = registerBlock("pink_terracotta_bricks",  new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .TERRACOTTA_ORANGE)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));


    public static final Block WHITE_TERRACOTTA_BRICKS = registerBlock("white_terracotta_bricks",  new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .TERRACOTTA_ORANGE)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));


    public static final Block RED_TERRACOTTA_BRICKS = registerBlock("red_terracotta_bricks",  new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .TERRACOTTA_ORANGE)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));


    public static final Block YELLOW_TERRACOTTA_BRICKS = registerBlock("yellow_terracotta_bricks",  new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .TERRACOTTA_ORANGE)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));


    public static final Block PURPLE_TERRACOTTA_BRICKS = registerBlock("purple_terracotta_bricks",  new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .TERRACOTTA_ORANGE)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));


    public static final Block CHISELED_TERRACOTTA_BRICKS = registerBlock("chiseled_terracotta_bricks",  new Block(AbstractBlock
            .Settings.create()
            .sounds(BlockSoundGroup.STONE).mapColor(MapColor
                    .TERRACOTTA_ORANGE)
            .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.25F, 4.2F)));







    public static final Block DRIPSTONE_BRICK_STAIRS = registerBlock("dripstone_brick_stairs",
            new StairsBlock(DRIPSTONE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(DRIPSTONE_BRICKS))
    );


    public static final Block DRIPSTONE_BRICK_SLAB = registerBlock("dripstone_brick_slab",
             new SlabBlock(AbstractBlock.Settings.copy(DRIPSTONE_BRICKS))
    );


    public static final Block DRIPSTONE_BRICK_WALL = registerBlock("dripstone_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(DRIPSTONE_BRICKS))
    );




    public static final Block GRANITE_BRICK_STAIRS = registerBlock("granite_brick_stairs",
            new StairsBlock(GRANITE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(GRANITE_BRICKS))
    );


    public static final Block GRANITE_BRICK_SLAB = registerBlock("granite_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(GRANITE_BRICKS))
    );


    public static final Block GRANITE_BRICK_WALL = registerBlock("granite_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(GRANITE_BRICKS))
    );



    public static final Block ANDESITE_BRICK_STAIRS = registerBlock("andesite_brick_stairs",
            new StairsBlock(ANDESITE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(ANDESITE_BRICKS))
    );


    public static final Block ANDESITE_BRICK_SLAB = registerBlock("andesite_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ANDESITE_BRICKS))
    );


    public static final Block ANDESITE_BRICK_WALL = registerBlock("andesite_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(ANDESITE_BRICKS))
    );



    public static final Block DIORITE_BRICK_STAIRS = registerBlock("diorite_brick_stairs",
            new StairsBlock(DIORITE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(DIORITE_BRICKS))
    );


    public static final Block DIORITE_BRICK_SLAB = registerBlock("diorite_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DIORITE_BRICKS))
    );


    public static final Block DIORITE_BRICK_WALL = registerBlock("diorite_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(DIORITE_BRICKS))
    );




    public static final Block STONE_WALL = registerBlock("stone_wall",
            new WallBlock(AbstractBlock.Settings.copy(STONE))
    );





    public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            new WallBlock(AbstractBlock.Settings.copy(POLISHED_ANDESITE))
    );


    public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            new WallBlock(AbstractBlock.Settings.copy(POLISHED_DIORITE))
    );


    public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            new WallBlock(AbstractBlock.Settings.copy(POLISHED_GRANITE))
    );






    public static final Block SMOOTH_BASALT_BRICK_STAIRS = registerBlock("smooth_basalt_brick_stairs",
            new StairsBlock(SMOOTH_BASALT_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(SMOOTH_BASALT_BRICKS))
    );


    public static final Block SMOOTH_BASALT_BRICK_SLAB = registerBlock("smooth_basalt_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(SMOOTH_BASALT_BRICKS))
    );


    public static final Block SMOOTH_BASALT_BRICK_WALL = registerBlock("smooth_basalt_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(SMOOTH_BASALT_BRICKS))
    );



    public static final Block POLISHED_STONE_STAIRS = registerBlock("polished_stone_stairs",
            new StairsBlock(POLISHED_STONE.getDefaultState(), AbstractBlock.Settings.copy(POLISHED_STONE))
    );


    public static final Block POLISHED_STONE_SLAB = registerBlock("polished_stone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(POLISHED_STONE))
    );


    public static final Block POLISHED_STONE_WALL = registerBlock("polished_stone_wall",
            new WallBlock(AbstractBlock.Settings.copy(POLISHED_STONE))
    );




    public static final Block PACKED_MUD_STAIRS = registerBlock("packed_mud_stairs",
            new StairsBlock(PACKED_MUD.getDefaultState(), AbstractBlock.Settings.copy(PACKED_MUD))
    );


    public static final Block PACKED_MUD_SLAB = registerBlock("packed_mud_slab",
            new SlabBlock(AbstractBlock.Settings.copy(PACKED_MUD))
    );


    public static final Block PACKED_MUD_WALL = registerBlock("packed_mud_wall",
            new WallBlock(AbstractBlock.Settings.copy(PACKED_MUD))
    );



    public static final Block POLISHED_PACKED_MUD_STAIRS = registerBlock("polished_packed_mud_stairs",
            new StairsBlock(POLISHED_PACKED_MUD.getDefaultState(), AbstractBlock.Settings.copy(POLISHED_PACKED_MUD))
    );


    public static final Block POLISHED_PACKED_MUD_SLAB = registerBlock("polished_packed_mud_slab",
            new SlabBlock(AbstractBlock.Settings.copy(POLISHED_PACKED_MUD))
    );


    public static final Block POLISHED_PACKED_MUD_WALL = registerBlock("polished_packed_mud_wall",
            new WallBlock(AbstractBlock.Settings.copy(POLISHED_PACKED_MUD))
    );





    public static final Block POLISHED_SMOOTH_BASALT_STAIRS = registerBlock("polished_smooth_basalt_stairs",
            new StairsBlock(POLISHED_SMOOTH_BASALT.getDefaultState(), AbstractBlock.Settings.copy(POLISHED_SMOOTH_BASALT))
    );


    public static final Block POLISHED_SMOOTH_BASALT_SLAB = registerBlock("polished_smooth_basalt_slab",
            new SlabBlock(AbstractBlock.Settings.copy(POLISHED_SMOOTH_BASALT))
    );


    public static final Block POLISHED_SMOOTH_BASALT_WALL = registerBlock("polished_smooth_basalt_wall",
            new WallBlock(AbstractBlock.Settings.copy(POLISHED_SMOOTH_BASALT))
    );




    public static final Block SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs",
            new StairsBlock(SMOOTH_BASALT.getDefaultState(), AbstractBlock.Settings.copy(SMOOTH_BASALT))
    );


    public static final Block SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            new SlabBlock(AbstractBlock.Settings.copy(SMOOTH_BASALT))
    );


    public static final Block SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall",
            new WallBlock(AbstractBlock.Settings.copy(SMOOTH_BASALT))
    );




    public static final Block END_STONE_STAIRS = registerBlock("end_stone_stairs",
            new StairsBlock(END_STONE.getDefaultState(), AbstractBlock.Settings.copy(END_STONE))
    );


    public static final Block END_STONE_SLAB = registerBlock("end_stone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(END_STONE))
    );


    public static final Block END_STONE_WALL = registerBlock("end_stone_wall",
            new WallBlock(AbstractBlock.Settings.copy(END_STONE))
    );




    public static final Block POLISHED_END_STONE_STAIRS = registerBlock("polished_end_stone_stairs",
            new StairsBlock(POLISHED_END_STONE.getDefaultState(), AbstractBlock.Settings.copy(POLISHED_END_STONE))
    );


    public static final Block POLISHED_END_STONE_SLAB = registerBlock("polished_end_stone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(POLISHED_END_STONE))
    );


    public static final Block POLISHED_END_STONE_WALL = registerBlock("polished_end_stone_wall",
            new WallBlock(AbstractBlock.Settings.copy(POLISHED_END_STONE))
    );




    public static final Block POLISHED_DRIPSTONE_STAIRS = registerBlock("polished_dripstone_stairs",
            new StairsBlock(POLISHED_DRIPSTONE_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(POLISHED_DRIPSTONE_BLOCK))
    );


    public static final Block POLISHED_DRIPSTONE_SLAB = registerBlock("polished_dripstone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(POLISHED_DRIPSTONE_BLOCK))
    );


    public static final Block POLISHED_DRIPSTONE_WALL = registerBlock("polished_dripstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(POLISHED_DRIPSTONE_BLOCK))
    );



    public static final Block DRIPSTONE_STAIRS = registerBlock("dripstone_stairs",
            new StairsBlock(DRIPSTONE_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(DRIPSTONE_BLOCK))
    );


    public static final Block DRIPSTONE_SLAB = registerBlock("dripstone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DRIPSTONE_BLOCK))
    );


    public static final Block DRIPSTONE_WALL = registerBlock("dripstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(DRIPSTONE_BLOCK))
    );




    public static final Block DEEPSLATE_STAIRS = registerBlock("deepslate_stairs",
            new StairsBlock(DEEPSLATE.getDefaultState(), AbstractBlock.Settings.copy(DEEPSLATE))
    );


    public static final Block DEEPSLATE_SLAB = registerBlock("deepslate_slab",
            new SlabBlock(AbstractBlock.Settings.copy(DEEPSLATE))
    );


    public static final Block DEEPSLATE_WALL = registerBlock("deepslate_wall",
            new WallBlock(AbstractBlock.Settings.copy(DEEPSLATE))
    );



    public static final Block QUARTZ_BRICK_STAIRS = registerBlock("quartz_brick_stairs",
            new StairsBlock(QUARTZ_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(QUARTZ_BRICKS))
    );


    public static final Block QUARTZ_BRICK_SLAB = registerBlock("quartz_brick_slab",
            new SlabBlock(AbstractBlock.Settings.copy(QUARTZ_BRICKS))
    );


    public static final Block QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(QUARTZ_BRICKS))
    );





    public static final Block PURPUR_STAIRS = registerBlock("purpur_stairs",
            new StairsBlock(PURPUR_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(PURPUR_BLOCK))
    );


    public static final Block PURPUR_SLAB = registerBlock("purpur_slab",
            new SlabBlock(AbstractBlock.Settings.copy(PURPUR_BLOCK))
    );


    public static final Block PURPUR_WALL = registerBlock("purpur_wall",
            new WallBlock(AbstractBlock.Settings.copy(PURPUR_BLOCK))
    );




    public static final Block POLISHED_PURPUR_STAIRS = registerBlock("polished_purpur_stairs",
            new StairsBlock(POLISHED_PURPUR_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(POLISHED_PURPUR_BLOCK))
    );


    public static final Block POLISHED_PURPUR_SLAB = registerBlock("polished_purpur_slab",
            new SlabBlock(AbstractBlock.Settings.copy(POLISHED_PURPUR_BLOCK))
    );


    public static final Block POLISHED_PURPUR_WALL = registerBlock("polished_purpur_wall",
            new WallBlock(AbstractBlock.Settings.copy(POLISHED_PURPUR_BLOCK))
    );




    public static final Block POLISHED_PRISMARINE_STAIRS = registerBlock("polished_prismarine_stairs",
            new StairsBlock(POLISHED_PRISMARINE.getDefaultState(), AbstractBlock.Settings.copy(POLISHED_PRISMARINE))
    );


    public static final Block POLISHED_PRISMARINE_SLAB = registerBlock("polished_prismarine_slab",
            new SlabBlock(AbstractBlock.Settings.copy(POLISHED_PRISMARINE))
    );


    public static final Block POLISHED_PRISMARINE_WALL = registerBlock("polished_prismarine_wall",
            new WallBlock(AbstractBlock.Settings.copy(POLISHED_PRISMARINE))
    );





    public static final Block PURPUR_TILE_WALL = registerBlock("purpur_tile_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK))
    );


    public static final Block PRISMARINE_BRICK_WALL = registerBlock("prismarine_brick_wall",
            new WallBlock(AbstractBlock.Settings.copy(PRISMARINE_BRICKS))
    );



    public static final Block QUARTZ_WALL = registerBlock("quartz_wall",
            new WallBlock(AbstractBlock.Settings.copy(QUARTZ_BLOCK))
    );









    // Registers block and its BlockItem
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Sp.MOD_ID, name), block);
    }


    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Sp.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }



    // Adds blocks to creative tab
    public static void registerModBlocks() {
        Sp.LOGGER.info("Registering Mod Blocks for " + Sp.MOD_ID);


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            // -------------------- CALCITE --------------------
            entries.addAfter(Blocks.CHISELED_TUFF_BRICKS, CALCITE);
            entries.addAfter(CALCITE, CALCITE_STAIRS);
            entries.addAfter(CALCITE_STAIRS, CALCITE_SLAB);
            entries.addAfter(CALCITE_SLAB, CALCITE_WALL);

            entries.addAfter(CALCITE_WALL, POLISHED_CALCITE);
            entries.addAfter(POLISHED_CALCITE, POLISHED_CALCITE_STAIRS);
            entries.addAfter(POLISHED_CALCITE_STAIRS, POLISHED_CALCITE_SLAB);
            entries.addAfter(POLISHED_CALCITE_SLAB, POLISHED_CALCITE_WALL);
            entries.addAfter(POLISHED_CALCITE_WALL, CHISELED_POLISHED_CALCITE);
            entries.addAfter(CHISELED_POLISHED_CALCITE, POLISHED_CALCITE_PILLAR);

            entries.addAfter(POLISHED_CALCITE_PILLAR, POLISHED_CALCITE_BRICKS);
            entries.addAfter(POLISHED_CALCITE_BRICKS, POLISHED_CALCITE_BRICK_STAIRS);
            entries.addAfter(POLISHED_CALCITE_BRICK_STAIRS, POLISHED_CALCITE_BRICK_SLAB);
            entries.addAfter(POLISHED_CALCITE_BRICK_SLAB, POLISHED_CALCITE_BRICK_WALL);
            entries.addAfter(POLISHED_CALCITE_BRICK_WALL, CRACKED_POLISHED_CALCITE_BRICKS);

            // -------------------- NETHERRACK --------------------
            entries.addAfter(NETHERRACK, NETHERRACK_STAIRS);
            entries.addAfter(NETHERRACK_STAIRS, NETHERRACK_SLAB);
            entries.addAfter(NETHERRACK_SLAB, NETHERRACK_WALL);

            entries.addAfter(NETHERRACK_WALL, POLISHED_NETHERRACK);
            entries.addAfter(POLISHED_NETHERRACK, POLISHED_NETHERRACK_STAIRS);
            entries.addAfter(POLISHED_NETHERRACK_STAIRS, POLISHED_NETHERRACK_SLAB);
            entries.addAfter(POLISHED_NETHERRACK_SLAB, POLISHED_NETHERRACK_WALL);
            entries.addAfter(POLISHED_NETHERRACK_WALL, POLISHED_NETHERRACK_PILLAR);

            entries.addAfter(POLISHED_NETHERRACK_PILLAR, NETHERRACK_BRICKS);
            entries.addAfter(NETHERRACK_BRICKS, NETHERRACK_BRICK_STAIRS);
            entries.addAfter(NETHERRACK_BRICK_STAIRS, NETHERRACK_BRICK_SLAB);
            entries.addAfter(NETHERRACK_BRICK_SLAB, NETHERRACK_BRICK_WALL);
            entries.addAfter(NETHERRACK_BRICK_WALL, CRACKED_NETHERRACK_BRICKS);
            entries.addAfter(CRACKED_NETHERRACK_BRICKS, CHISELED_NETHERRACK_BRICKS);

            // -------------------- MUD --------------------
            entries.addAfter(PACKED_MUD, POLISHED_PACKED_MUD);
            entries.addAfter(POLISHED_PACKED_MUD, POLISHED_PACKED_MUD_STAIRS);
            entries.addAfter(POLISHED_PACKED_MUD_STAIRS, POLISHED_PACKED_MUD_SLAB);
            entries.addAfter(POLISHED_PACKED_MUD_SLAB, POLISHED_PACKED_MUD_WALL);

            entries.addAfter(POLISHED_PACKED_MUD_WALL, PACKED_MUD_STAIRS);
            entries.addAfter(PACKED_MUD_STAIRS, PACKED_MUD_SLAB);
            entries.addAfter(PACKED_MUD_SLAB, PACKED_MUD_WALL);

            entries.addAfter(MUD_BRICKS, CHISELED_MUD_BRICKS);
            entries.addAfter(CHISELED_MUD_BRICKS, MOSSY_MUD_BRICKS);
            entries.addAfter(TUFF_BRICK_WALL, CRACKED_TUFF_BRICKS);

            // -------------------- STONE --------------------
            entries.addAfter(STONE_BUTTON, POLISHED_STONE);
            entries.addAfter(POLISHED_STONE, POLISHED_STONE_STAIRS);
            entries.addAfter(POLISHED_STONE_STAIRS, POLISHED_STONE_SLAB);
            entries.addAfter(POLISHED_STONE_SLAB, POLISHED_STONE_WALL);
            entries.addAfter(POLISHED_STONE_WALL, STONE_WALL);

            // -------------------- GRANITE / ANDESITE / DIORITE --------------------
            entries.addAfter(POLISHED_GRANITE, GRANITE_BRICKS);
            entries.addAfter(GRANITE_BRICKS, GRANITE_BRICK_STAIRS);
            entries.addAfter(GRANITE_BRICK_STAIRS, GRANITE_BRICK_SLAB);
            entries.addAfter(GRANITE_BRICK_SLAB, GRANITE_BRICK_WALL);
            entries.addAfter(GRANITE_BRICK_WALL, CHISELED_GRANITE_BRICKS);
            entries.addAfter(CHISELED_GRANITE_BRICKS, CRACKED_GRANITE_BRICKS);
            entries.addAfter(CRACKED_GRANITE_BRICKS, POLISHED_GRANITE_WALL);

            entries.addAfter(POLISHED_ANDESITE, ANDESITE_BRICKS);
            entries.addAfter(ANDESITE_BRICKS, ANDESITE_BRICK_STAIRS);
            entries.addAfter(ANDESITE_BRICK_STAIRS, ANDESITE_BRICK_SLAB);
            entries.addAfter(ANDESITE_BRICK_SLAB, ANDESITE_BRICK_WALL);
            entries.addAfter(ANDESITE_BRICK_WALL, CHISELED_ANDESITE_BRICKS);
            entries.addAfter(CHISELED_ANDESITE_BRICKS, CRACKED_ANDESITE_BRICKS);
            entries.addAfter(CRACKED_ANDESITE_BRICKS, POLISHED_ANDESITE_WALL);

            entries.addAfter(POLISHED_DIORITE, DIORITE_BRICKS);
            entries.addAfter(DIORITE_BRICKS, DIORITE_BRICK_STAIRS);
            entries.addAfter(DIORITE_BRICK_STAIRS, DIORITE_BRICK_SLAB);
            entries.addAfter(DIORITE_BRICK_SLAB, DIORITE_BRICK_WALL);
            entries.addAfter(DIORITE_BRICK_WALL, CHISELED_DIORITE_BRICKS);
            entries.addAfter(CHISELED_DIORITE_BRICKS, CRACKED_DIORITE_BRICKS);
            entries.addAfter(CRACKED_DIORITE_BRICKS, POLISHED_DIORITE_WALL);

            // -------------------- END STONE --------------------
            entries.addAfter(END_STONE, POLISHED_END_STONE);
            entries.addAfter(POLISHED_END_STONE, CHISELED_END_STONE);
            entries.addAfter(CHISELED_END_STONE, CRACKED_END_STONE_BRICKS);
            entries.addAfter(CRACKED_END_STONE_BRICKS, END_STONE_STAIRS);
            entries.addAfter(END_STONE_STAIRS, END_STONE_SLAB);
            entries.addAfter(END_STONE_SLAB, END_STONE_WALL);
            entries.addAfter(END_STONE_WALL, POLISHED_END_STONE_STAIRS);
            entries.addAfter(POLISHED_END_STONE_STAIRS, POLISHED_END_STONE_SLAB);
            entries.addAfter(POLISHED_END_STONE_SLAB, POLISHED_END_STONE_WALL);

            // -------------------- BASALT --------------------
            entries.addAfter(SMOOTH_BASALT, POLISHED_SMOOTH_BASALT);
            entries.addAfter(POLISHED_SMOOTH_BASALT, SMOOTH_BASALT_BRICKS);
            entries.addAfter(SMOOTH_BASALT_BRICKS, CRACKED_SMOOTH_BASALT_BRICKS);
            entries.addAfter(CRACKED_SMOOTH_BASALT_BRICKS, CHISELED_POLISHED_BASALT);
            entries.addAfter(CHISELED_POLISHED_BASALT, SMOOTH_BASALT_STAIRS);
            entries.addAfter(SMOOTH_BASALT_STAIRS, SMOOTH_BASALT_SLAB);
            entries.addAfter(SMOOTH_BASALT_SLAB, SMOOTH_BASALT_WALL);
            entries.addAfter(SMOOTH_BASALT_WALL, POLISHED_SMOOTH_BASALT_STAIRS);
            entries.addAfter(POLISHED_SMOOTH_BASALT_STAIRS, POLISHED_SMOOTH_BASALT_SLAB);
            entries.addAfter(POLISHED_SMOOTH_BASALT_SLAB, POLISHED_SMOOTH_BASALT_WALL);
            entries.addAfter(POLISHED_SMOOTH_BASALT_WALL, SMOOTH_BASALT_BRICK_STAIRS);
            entries.addAfter(SMOOTH_BASALT_BRICK_STAIRS, SMOOTH_BASALT_BRICK_SLAB);
            entries.addAfter(SMOOTH_BASALT_BRICK_SLAB, SMOOTH_BASALT_BRICK_WALL);

            // -------------------- DRIPSTONE --------------------
            entries.addAfter(CRACKED_POLISHED_CALCITE_BRICKS, DRIPSTONE_BLOCK);
            entries.addAfter(Blocks.DRIPSTONE_BLOCK, POLISHED_DRIPSTONE_BLOCK);
            entries.addAfter(POLISHED_DRIPSTONE_BLOCK, POLISHED_DRIPSTONE_STAIRS);
            entries.addAfter(POLISHED_DRIPSTONE_STAIRS, POLISHED_DRIPSTONE_SLAB);
            entries.addAfter(POLISHED_DRIPSTONE_SLAB, POLISHED_DRIPSTONE_WALL);
            entries.addAfter(POLISHED_DRIPSTONE_WALL, DRIPSTONE_BLOCK);
            entries.addAfter(DRIPSTONE_BLOCK, DRIPSTONE_STAIRS);
            entries.addAfter(DRIPSTONE_STAIRS, DRIPSTONE_SLAB);
            entries.addAfter(DRIPSTONE_SLAB, DRIPSTONE_WALL);
            entries.addAfter(DRIPSTONE_WALL, DRIPSTONE_BRICKS);
            entries.addAfter(DRIPSTONE_BRICKS, DRIPSTONE_BRICK_STAIRS);
            entries.addAfter(DRIPSTONE_BRICK_STAIRS, DRIPSTONE_BRICK_SLAB);
            entries.addAfter(DRIPSTONE_BRICK_SLAB, DRIPSTONE_BRICK_WALL);
            entries.addAfter(DRIPSTONE_BRICK_WALL, CRACKED_DRIPSTONE_BRICKS);
            entries.addAfter(CRACKED_DRIPSTONE_BRICKS, CHISELED_DRIPSTONE_BRICKS);


            entries.addAfter(QUARTZ_SLAB, QUARTZ_WALL);
            entries.addAfter(QUARTZ_BRICKS, QUARTZ_BRICK_STAIRS);
            entries.addAfter(QUARTZ_BRICK_STAIRS, QUARTZ_BRICK_SLAB);
            entries.addAfter(QUARTZ_BRICK_SLAB, QUARTZ_BRICK_WALL);


            entries.addAfter(DEEPSLATE, DEEPSLATE_STAIRS);
            entries.addAfter(DEEPSLATE_STAIRS, DEEPSLATE_SLAB);
            entries.addAfter(DEEPSLATE_SLAB, DEEPSLATE_WALL);

            entries.addAfter(PRISMARINE_BRICK_SLAB, PRISMARINE_BRICK_WALL);

            entries.addAfter(PRISMARINE_WALL, POLISHED_PRISMARINE);
            entries.addAfter(POLISHED_PRISMARINE, POLISHED_PRISMARINE_STAIRS);
            entries.addAfter(POLISHED_PRISMARINE_STAIRS, POLISHED_PRISMARINE_SLAB);
            entries.addAfter(POLISHED_PRISMARINE_SLAB, POLISHED_PRISMARINE_WALL);

            entries.addAfter(END_STONE_BRICK_WALL, PURPUR_BLOCK);
            entries.addAfter(PURPUR_BLOCK, PURPUR_STAIRS);
            entries.addAfter(PURPUR_STAIRS, PURPUR_SLAB);
            entries.addAfter(PURPUR_SLAB, PURPUR_WALL);

            entries.addAfter(PURPUR_WALL, POLISHED_PURPUR_BLOCK);
            entries.addAfter(POLISHED_PURPUR_BLOCK, POLISHED_PURPUR_STAIRS);
            entries.addAfter(POLISHED_PURPUR_STAIRS, POLISHED_PURPUR_SLAB);
            entries.addAfter(POLISHED_PURPUR_SLAB, POLISHED_PURPUR_WALL);
            entries.addAfter(Blocks.PURPUR_SLAB, PURPUR_TILE_WALL);
            entries.addAfter(PURPUR_TILE_WALL, CRACKED_PURPUR_TILES);
            entries.addAfter(CRACKED_PURPUR_TILES, CHISELED_PURPUR_BLOCK);


            entries.addAfter(CHISELED_STONE_BRICKS, STONE_PILLAR);
            entries.addAfter(CHISELED_ANDESITE_BRICKS, ANDESITE_BRICK_PILLAR);
            entries.addAfter(CHISELED_DIORITE_BRICKS, DIORITE_BRICK_PILLAR);
            entries.addAfter(CHISELED_GRANITE_BRICKS, GRANITE_BRICK_PILLAR);

            entries.addAfter(CHISELED_TUFF_BRICKS, TUFF_BRICK_PILLAR);
            entries.addAfter(CHISELED_MUD_BRICKS, MUD_BRICK_PILLAR);
            entries.addAfter(CHISELED_END_STONE, POLISHED_END_STONE_PILLAR);
            entries.addAfter(CHISELED_DRIPSTONE_BRICKS, POLISHED_DRIPSTONE_PILLAR);
            entries.addAfter(PRISMARINE_BRICK_WALL, MOSSY_PRISMARINE_BRICKS);
            entries.addAfter(MOSSY_PRISMARINE_BRICKS, CHISELED_PRISMARINE_BRICKS);
            entries.addAfter(CHISELED_PRISMARINE_BRICKS, PRISMARINE_PILLAR);
            entries.addAfter(CHISELED_DEEPSLATE, DEEPSLATE_PILLAR);
            entries.addAfter(CHISELED_QUARTZ_BLOCK, CRACKED_QUARTZ_BRICKS);


            entries.addAfter(BRICK_WALL, CHISELED_BRICKS);

            entries.addAfter(TUFF_BRICK_PILLAR, SHALE_BLOCK);
            entries.addAfter(SHALE_BLOCK, SHALE_STAIRS);
            entries.addAfter(SHALE_STAIRS, SHALE_SLAB);
            entries.addAfter(SHALE_SLAB, SHALE_WALL);
            entries.addAfter(SHALE_WALL, POLISHED_SHALE_BLOCK);
            entries.addAfter(POLISHED_SHALE_BLOCK, POLISHED_SHALE_STAIRS);
            entries.addAfter(POLISHED_SHALE_STAIRS, POLISHED_SHALE_SLAB);
            entries.addAfter(POLISHED_SHALE_SLAB, POLISHED_SHALE_WALL);
            entries.addAfter(POLISHED_SHALE_WALL, SHALE_BRICKS);
            entries.addAfter(SHALE_BRICKS, SHALE_BRICK_STAIRS);
            entries.addAfter(SHALE_BRICK_STAIRS, SHALE_BRICK_SLAB);
            entries.addAfter(SHALE_BRICK_SLAB, SHALE_BRICK_WALL);
            entries.addAfter(SHALE_BRICK_WALL, CRACKED_SHALE_BRICKS);
            entries.addAfter(CRACKED_SHALE_BRICKS, CHISELED_SHALE);
            entries.addAfter(CHISELED_SHALE, SHALE_TILES);
            entries.addAfter(SHALE_TILES, SHALE_TILE_STAIRS);
            entries.addAfter(SHALE_TILE_STAIRS, SHALE_TILE_SLAB);
            entries.addAfter(SHALE_TILE_SLAB, SHALE_TILE_WALL);
            entries.addAfter(SHALE_TILE_WALL, SHALE_PILLAR);

            entries.addAfter(CHISELED_POLISHED_BASALT, SMOOTH_BASALT_PILLAR);
            entries.addAfter(PRISMARINE_PILLAR, DARK_PRISMARINE);
            entries.addAfter(DARK_PRISMARINE, POLISHED_DARK_PRISMARINE);
            entries.addAfter(POLISHED_DARK_PRISMARINE, Blocks.DARK_PRISMARINE);
            entries.addAfter(Blocks.DARK_PRISMARINE, CRACKED_DARK_PRISMARINE_PAVERS);
            entries.addAfter(CRACKED_DARK_PRISMARINE_PAVERS, CHISELED_DARK_PRISMARINE_PAVERS);
            entries.addAfter(CHISELED_DARK_PRISMARINE_PAVERS, DARK_PRISMARINE_PILLAR);


        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(entries -> {

            entries.addAfter(PINK_TERRACOTTA, CHISELED_TERRACOTTA_BRICKS);
            entries.addAfter(CHISELED_TERRACOTTA_BRICKS, TERRACOTTA_BRICKS);
            entries.addAfter(TERRACOTTA_BRICKS, WHITE_TERRACOTTA_BRICKS);
            entries.addAfter(WHITE_TERRACOTTA_BRICKS, LIGHT_GRAY_TERRACOTTA_BRICKS);
            entries.addAfter(LIGHT_GRAY_TERRACOTTA_BRICKS, GRAY_TERRACOTTA_BRICKS);
            entries.addAfter(GRAY_TERRACOTTA_BRICKS, BLACK_TERRACOTTA_BRICKS);
            entries.addAfter(BLACK_TERRACOTTA_BRICKS, BROWN_TERRACOTTA_BRICKS);
            entries.addAfter(BROWN_TERRACOTTA_BRICKS, RED_TERRACOTTA_BRICKS);
            entries.addAfter(RED_TERRACOTTA_BRICKS, ORANGE_TERRACOTTA_BRICKS);
            entries.addAfter(ORANGE_TERRACOTTA_BRICKS, YELLOW_TERRACOTTA_BRICKS);
            entries.addAfter(YELLOW_TERRACOTTA_BRICKS, LIME_TERRACOTTA_BRICKS);
            entries.addAfter(LIME_TERRACOTTA_BRICKS, GREEN_TERRACOTTA_BRICKS);
            entries.addAfter(GREEN_TERRACOTTA_BRICKS, CYAN_TERRACOTTA_BRICKS);
            entries.addAfter(CYAN_TERRACOTTA_BRICKS, LIGHT_BLUE_TERRACOTTA_BRICKS);
            entries.addAfter(LIGHT_BLUE_TERRACOTTA_BRICKS, BLUE_TERRACOTTA_BRICKS);
            entries.addAfter(BLUE_TERRACOTTA_BRICKS, PURPLE_TERRACOTTA_BRICKS);
            entries.addAfter(PURPLE_TERRACOTTA_BRICKS, MAGENTA_TERRACOTTA_BRICKS);
            entries.addAfter(MAGENTA_TERRACOTTA_BRICKS, PINK_TERRACOTTA_BRICKS);


        });


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {

            entries.addAfter(TUFF, SHALE_BLOCK);

        });
    }
}
