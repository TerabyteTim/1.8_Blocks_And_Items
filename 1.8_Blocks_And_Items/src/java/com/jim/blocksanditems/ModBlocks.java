package com.jim.blocksanditems;

import net.minecraft.block.Block;

public class ModBlocks {
    public static Block barrier;
    public static Block coarse_dirt;
    public static Block iron_trapdoor;
    public static Block prismarine_rough;
    public static Block prismarine_bricks;
    public static Block prismarine_dark;
    public static Block red_sandstone_normal;
    public static Block sea_lantern;
    public static Block slime;
    public static Block sponge_wet;
    public static Block stone_andesite;
    public static Block stone_diorite;
    public static Block stone_granite;
    public static Block stone_andesite_smooth;
    public static Block stone_diorite_smooth;
    public static Block stone_granite_smooth;
    public static Block beck_block;
    public static Block Domenick;

    public static void init() {
        barrier = new BlockBarrier();
        coarse_dirt = new BlockCoarseDirt();
        iron_trapdoor = new BlockIronTrapdoor();
        prismarine_rough = new BlockPrismarine();
        prismarine_bricks = new BlockPrismarineBricks();
        prismarine_dark = new BlockDarkPrismarine();
        red_sandstone_normal = new BlockRedSandstone();
        sea_lantern = new BlockSeaLantern();
        slime = new BlockSlime();
        sponge_wet = new BlockWetSponge();
        stone_andesite = new BlockNormalAndesite();
        stone_diorite = new BlockDiorite();
        stone_granite = new BlockGranite();
        stone_andesite_smooth = new BlockPolishedAndesite();
        stone_diorite_smooth = new BlockPolishedDiorite();
        stone_granite_smooth = new BlockPolishedGranite();
        beck_block = new BlockBeck();
        Domenick = new BlockDom();
    }
}
