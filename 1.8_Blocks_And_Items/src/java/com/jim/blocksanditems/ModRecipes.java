package com.jim.blocksanditems;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void init () {
		//Sea Lantern
		//GameRegistry.addRecipe(new ItemStack(), "XYX", "YYY", "XYX", "X", ModItems.prismarine_shard, "Y", ModItems.prismarine_crystals);
		//Prismarine
		//GameRegistry.addRecipe(new ItemStack(), "   ", "XX ", "XX ", "X", ModItems.prismarine_shard);
		//Prismarine Bricks
		//GameRegistry.addRecipe(new ItemStack(), "XXX", "XXX", "XXX", "X", ModItems.prismarine_shard);
		//Dark Prismarine
		//GameRegistry.addRecipe(new ItemStack(), "XXX", "XYX", "XXX", "X", ModItems.prismarine_shard, "Y", Item.getItemById(351));
		//Cooked mutton
		GameRegistry.addSmelting(new ItemStack(ModItems.mutton_raw), new ItemStack(ModItems.mutton_cooked), 0.35f);
	}
}
