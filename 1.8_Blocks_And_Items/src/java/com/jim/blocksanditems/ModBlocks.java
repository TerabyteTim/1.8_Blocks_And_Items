package com.jim.blocksanditems;

import cpw.mods.fml.common.registry.ExistingSubstitutionException;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModBlocks {
	
	public static Block door_spruce;
	public static Block door_birch;
	public static Block door_jungle;
	public static Block door_acacia;
	public static Block door_dark_oak;
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
        
        //Register our various doors.
        door_spruce = new BlockDoor(Material.wood, ModItems.door_spruce, "door_spruce");
        door_birch = new BlockDoor(Material.wood, ModItems.door_birch, "door_birch");
        door_jungle = new BlockDoor(Material.wood, ModItems.door_jungle, "door_jungle");
        door_acacia = new BlockDoor(Material.wood, ModItems.door_acacia, "door_acacia");
        door_dark_oak = new BlockDoor(Material.wood, ModItems.door_dark_oak, "door_dark_oak");
    	stone = new BlockStone();
    	sponge = new BlockSponge();
    }
    
    public static void postInit() {
    	//Spawn in new stones
    	try {
			GameRegistry.addSubstitutionAlias("minecraft:stone", GameRegistry.Type.BLOCK, stone);
			GameRegistry.addSubstitutionAlias("minecraft:stone", GameRegistry.Type.ITEM, new ItemBlockStone(stone));
		} catch (ExistingSubstitutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	//Spawn in new sponge
    	try {
			GameRegistry.addSubstitutionAlias("minecraft:sponge", GameRegistry.Type.BLOCK, sponge);
			GameRegistry.addSubstitutionAlias("minecraft:sponge", GameRegistry.Type.ITEM, new ItemBlockSponge(sponge));
		} catch (ExistingSubstitutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	//Spawn in new doors
    	/*try {
			GameRegistry.addSubstitutionAlias("minecraft:wooden_door", GameRegistry.Type.BLOCK, door);
			GameRegistry.addSubstitutionAlias("minecraft:wooden_door", GameRegistry.Type.ITEM, new ItemBlockDoor());
		} catch (ExistingSubstitutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
    }
}
