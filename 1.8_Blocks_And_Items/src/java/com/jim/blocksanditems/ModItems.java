package com.jim.blocksanditems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItems {
	
	public static Item prismarine_crystals;
	public static Item prismarine_shard;
	public static Item mutton_raw;
	
	public static void init()
	{ 
		prismarine_crystals = new Item().setUnlocalizedName("prismarine_crystals").setTextureName(BlocksAndItemsMain.MODID + ":prismarine_crystals").setCreativeTab(CreativeTabs.tabMaterials);
		prismarine_shard = new Item().setUnlocalizedName("prismarine_shard").setTextureName(BlocksAndItemsMain.MODID + ":prismarine_shard").setCreativeTab(CreativeTabs.tabMaterials);
		mutton_raw = new Item().setUnlocalizedName("mutton_raw").setTextureName(BlocksAndItemsMain.MODID + ":mutton_raw").setCreativeTab(CreativeTabs.tabFood);
		
		GameRegistry.registerItem(prismarine_shard, prismarine_shard.getUnlocalizedName());
		GameRegistry.registerItem(prismarine_crystals, prismarine_crystals.getUnlocalizedName());
		GameRegistry.registerItem(mutton_raw, mutton_raw.getUnlocalizedName());
	}
}
