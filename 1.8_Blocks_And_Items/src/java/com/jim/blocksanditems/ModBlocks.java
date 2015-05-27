package com.jim.blocksanditems;

import cpw.mods.fml.common.registry.ExistingSubstitutionException;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.BlockObsidian;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemMultiTexture;
import net.minecraft.item.ItemStack;

public class ModBlocks {
	
    public static Block barrier;
    //public static Block coarse_dirt;
    public static Block iron_trapdoor;
    public static Block stone;
    public static Block prismarine;
    public static Block red_sandstone_normal;
    public static Block sea_lantern;
    public static Block slime;
    public static Block sponge;
    public static Block beck_block;
    public static Block Domenick;

    public static void init() {
        slime = new BlockSlime();
        barrier = new BlockBarrier();
        iron_trapdoor = new BlockIronTrapDoor();
        prismarine = new BlockPrismarine();
        sea_lantern = new BlockSeaLantern();
        
        //coarse_dirt = new BlockCoarseDirt();
        red_sandstone_normal = new BlockRedSandstone();
        /*stone_andesite = new BlockNormalAndesite();
        stone_diorite = new BlockDiorite();
        stone_granite = new BlockGranite();
        stone_andesite_smooth = new BlockPolishedAndesite();
        stone_diorite_smooth = new BlockPolishedDiorite();
        stone_granite_smooth = new BlockPolishedGranite();*/
        beck_block = new BlockBeck();
        Domenick = new BlockDom();
        
        //Spawn in new stones
    	try {
        	stone = new BlockStone();
			GameRegistry.addSubstitutionAlias("minecraft:stone", GameRegistry.Type.BLOCK, stone);
			GameRegistry.addSubstitutionAlias("minecraft:stone", GameRegistry.Type.ITEM, new ItemBlockStone(stone));
		} catch (ExistingSubstitutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	//Spawn in new sponge
    	try {
        	sponge = new BlockSponge();
			GameRegistry.addSubstitutionAlias("minecraft:sponge", GameRegistry.Type.BLOCK, sponge);
			GameRegistry.addSubstitutionAlias("minecraft:sponge", GameRegistry.Type.ITEM, new ItemBlockSponge(sponge));
			//System.out.println("TEst!! " + test.getSubItems(p_150895_1_, p_150895_2_, p_150895_3_););
		} catch (ExistingSubstitutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
