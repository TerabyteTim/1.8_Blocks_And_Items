package com.jim.blocksanditems;

import cpw.mods.fml.common.registry.ExistingSubstitutionException;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	
	public static Block fence_spruce;
	public static Block fence_birch;
	public static Block fence_jungle;
	public static Block fence_dark_oak;
	public static Block fence_acacia;
	public static Block fence_gate_spruce;
	public static Block fence_gate_birch;
	public static Block fence_gate_jungle;
	public static Block fence_gate_dark_oak;
	public static Block fence_gate_acacia;
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
    	BlockFenceGate tempBlock;
    	
        slime = new BlockSlime();
        barrier = new BlockBarrier();
        iron_trapdoor = new BlockIronTrapDoor();
        prismarine = new BlockPrismarine();
        sea_lantern = new BlockSeaLantern();
    	stone = new BlockStone();
    	sponge = new BlockSponge();
    	tempBlock = (BlockFenceGate) new BlockFenceGate("tempBlock1", 0).setCreativeTab(null);
        //coarse_dirt = new BlockCoarseDirt();
        red_sandstone_normal = new BlockRedSandstone();
        
    	tempBlock = (BlockFenceGate) new BlockFenceGate("tempBlock2", 0).setCreativeTab(null);
    	tempBlock = (BlockFenceGate) new BlockFenceGate("tempBlock3", 0).setCreativeTab(null);
    	tempBlock = (BlockFenceGate) new BlockFenceGate("tempBlock4", 0).setCreativeTab(null);
        
        fence_gate_spruce = new BlockFenceGate("spruce",1);
        fence_gate_birch = new BlockFenceGate("birch", 2);
        fence_gate_jungle = new BlockFenceGate("jungle", 3);
        fence_gate_dark_oak = new BlockFenceGate("big_oak",5);
        fence_gate_acacia = new BlockFenceGate("acacia", 4);
        
        fence_spruce = new BlockFence("spruce", Material.wood);
        fence_birch = new BlockFence("birch", Material.wood);
        fence_jungle = new BlockFence("jungle", Material.wood);
        fence_dark_oak = new BlockFence("big_oak", Material.wood);
        fence_acacia = new BlockFence("acacia", Material.wood);
        
        //Register our various doors.
        door_spruce = new BlockDoor(Material.wood, ModItems.door_spruce, "door_spruce");
        door_birch = new BlockDoor(Material.wood, ModItems.door_birch, "door_birch");
        door_jungle = new BlockDoor(Material.wood, ModItems.door_jungle, "door_jungle");
        door_acacia = new BlockDoor(Material.wood, ModItems.door_acacia, "door_acacia");
        door_dark_oak = new BlockDoor(Material.wood, ModItems.door_dark_oak, "door_dark_oak");
        
        beck_block = new BlockBeck();
        Domenick = new BlockDom();
    }
}
