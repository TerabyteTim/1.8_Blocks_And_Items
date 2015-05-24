package com.jim.blocksanditems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ModItems {
	
	public static Item prismarine_crystals;
	public static Item prismarine_shard;
	public static Item mutton_raw;
	public static Item mutton_cooked;
	
	public static void init()
	{ 
		prismarine_crystals = new Item().setUnlocalizedName("prismarine_crystals").setTextureName(BlocksAndItemsMain.MODID + ":prismarine_crystals").setCreativeTab(CreativeTabs.tabMaterials);
		prismarine_shard = new Item().setUnlocalizedName("prismarine_shard").setTextureName(BlocksAndItemsMain.MODID + ":prismarine_shard").setCreativeTab(CreativeTabs.tabMaterials);
		mutton_raw = new ItemModFood("mutton_raw", 2, 1.2f, true);
		mutton_cooked = new ItemModFood("mutton_cooked", 6, 9.6f, true);
		
		GameRegistry.registerItem(prismarine_shard, prismarine_shard.getUnlocalizedName());
		GameRegistry.registerItem(prismarine_crystals, prismarine_crystals.getUnlocalizedName());
		GameRegistry.registerItem(mutton_raw, mutton_raw.getUnlocalizedName());
		GameRegistry.registerItem(mutton_cooked, mutton_cooked.getUnlocalizedName());
	}
}
