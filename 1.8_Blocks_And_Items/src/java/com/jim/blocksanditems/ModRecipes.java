package com.jim.blocksanditems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void init () {
		/*
		//Diorite
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone_diorite, 2), "XY ", "YX ", "   ", 'X', Item.getItemById(4), 'Y', Item.getItemById(13));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone_diorite, 2), " XY", " YX", "   ", 'X', Item.getItemById(4), 'Y', Item.getItemById(13));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone_diorite, 2), "YX ", "XY ", "   ", 'X', Item.getItemById(4), 'Y', Item.getItemById(13));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone_diorite, 2), " YX", " XY", "   ", 'X', Item.getItemById(4), 'Y', Item.getItemById(13));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone_diorite, 2), "   ", "XY ", "YX ", 'X', Item.getItemById(4), 'Y', Item.getItemById(13));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone_diorite, 2), "   ", " XY", " YX", 'X', Item.getItemById(4), 'Y', Item.getItemById(13));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone_diorite, 2), "   ", "YX ", "XY ", 'X', Item.getItemById(4), 'Y', Item.getItemById(13));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone_diorite, 2), "   ", " YX", " XY", 'X', Item.getItemById(4), 'Y', Item.getItemById(13));
		//Polished Diorite
		GameRegistry.addRecipe(new ItemStack(Block.getBlockById(98), 4), "XX ", "XX ", "   ", 'X', ModBlocks.stone_diorite);
		GameRegistry.addRecipe(new ItemStack(Block.getBlockById(98), 4), " XX", " XX", "   ", 'X', ModBlocks.stone_diorite);
		GameRegistry.addRecipe(new ItemStack(Block.getBlockById(98), 4), "   ", "XX ", "XX ", 'X', ModBlocks.stone_diorite);
		GameRegistry.addRecipe(new ItemStack(Block.getBlockById(98), 4), "   ", " XX", " XX", 'X', ModBlocks.stone_diorite);
		//Andesite
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone_granite, 2), "XY ", "   ", "   ", 'X', ModBlocks.stone_diorite, 'Y', Item.getItemById(4));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone_granite, 2), " XY", "   ", "   ", 'X', ModBlocks.stone_diorite, 'Y', Item.getItemById(4));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone_granite, 2), "   ", "XY ", "   ", 'X', ModBlocks.stone_diorite, 'Y', Item.getItemById(4));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone_granite, 2), "   ", " XY", "   ", 'X', ModBlocks.stone_diorite, 'Y', Item.getItemById(4));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone_granite, 2), "   ", "   ", "XY ", 'X', ModBlocks.stone_diorite, 'Y', Item.getItemById(4));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone_granite, 2), "   ", "   ", " XY", 'X', ModBlocks.stone_diorite, 'Y', Item.getItemById(4));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone_granite, 2), "YX ", "   ", "   ", 'X', ModBlocks.stone_diorite, 'Y', Item.getItemById(4));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone_granite, 2), " YX", "   ", "   ", 'X', ModBlocks.stone_diorite, 'Y', Item.getItemById(4));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone_granite, 2), "   ", "YX ", "   ", 'X', ModBlocks.stone_diorite, 'Y', Item.getItemById(4));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone_granite, 2), "   ", " YX", "   ", 'X', ModBlocks.stone_diorite, 'Y', Item.getItemById(4));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone_granite, 2), "   ", "   ", "YX ", 'X', ModBlocks.stone_diorite, 'Y', Item.getItemById(4));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone_granite, 2), "   ", "   ", " YX", 'X', ModBlocks.stone_diorite, 'Y', Item.getItemById(4));
		//Polished Andesite
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone_granite_smooth, 4), "XX ", "XX ", "   ", 'X', ModBlocks.stone_granite);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone_granite_smooth, 4), " XX", " XX", "   ", 'X', ModBlocks.stone_granite);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone_granite_smooth, 4), "   ", "XX ", "XX ", 'X', ModBlocks.stone_granite);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone_granite_smooth, 4), "   ", " XX", " XX", 'X', ModBlocks.stone_granite);		
		//Granite
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone_granite), "XY ", "   ", "   ", 'X', ModBlocks.stone_diorite, 'Y', Item.getItemById(13));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone_granite), " XY", "   ", "   ", 'X', ModBlocks.stone_diorite, 'Y', Item.getItemById(13));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone_granite), "   ", "XY ", "   ", 'X', ModBlocks.stone_diorite, 'Y', Item.getItemById(13));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone_granite), "   ", " XY", "   ", 'X', ModBlocks.stone_diorite, 'Y', Item.getItemById(13));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone_granite), "   ", "   ", "XY ", 'X', ModBlocks.stone_diorite, 'Y', Item.getItemById(13));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone_granite), "   ", "   ", " XY", 'X', ModBlocks.stone_diorite, 'Y', Item.getItemById(13));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone_granite), "YX ", "   ", "   ", 'X', ModBlocks.stone_diorite, 'Y', Item.getItemById(13));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone_granite), " YX", "   ", "   ", 'X', ModBlocks.stone_diorite, 'Y', Item.getItemById(13));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone_granite), "   ", "YX ", "   ", 'X', ModBlocks.stone_diorite, 'Y', Item.getItemById(13));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone_granite), "   ", " YX", "   ", 'X', ModBlocks.stone_diorite, 'Y', Item.getItemById(13));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone_granite), "   ", "   ", "YX ", 'X', ModBlocks.stone_diorite, 'Y', Item.getItemById(13));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone_granite), "   ", "   ", " YX", 'X', ModBlocks.stone_diorite, 'Y', Item.getItemById(13));
		//Polished Diorite
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone_granite_smooth, 4), "XX ", "XX ", "   ", 'X', ModBlocks.stone_granite);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone_granite_smooth, 4), " XX", " XX", "   ", 'X', ModBlocks.stone_granite);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone_granite_smooth, 4), "   ", "XX ", "XX ", 'X', ModBlocks.stone_granite);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone_granite_smooth, 4), "   ", " XX", " XX", 'X', ModBlocks.stone_granite);		
		//Stone Bricks
		GameRegistry.addRecipe(new ItemStack(Block.getBlockById(98), 4), "XX ", "XX ", "   ", 'X', ModBlocks.stone_diorite_smooth);
		GameRegistry.addRecipe(new ItemStack(Block.getBlockById(98), 4), " XX", " XX", "   ", 'X', ModBlocks.stone_diorite_smooth);
		GameRegistry.addRecipe(new ItemStack(Block.getBlockById(98), 4), "   ", "XX ", "XX ", 'X', ModBlocks.stone_diorite_smooth);
		GameRegistry.addRecipe(new ItemStack(Block.getBlockById(98), 4), "   ", " XX", " XX", 'X', ModBlocks.stone_diorite_smooth);
		GameRegistry.addRecipe(new ItemStack(Block.getBlockById(98), 4), "XX ", "XX ", "   ", 'X', ModBlocks.stone_andesite_smooth);
		GameRegistry.addRecipe(new ItemStack(Block.getBlockById(98), 4), " XX", " XX", "   ", 'X', ModBlocks.stone_andesite_smooth);
		GameRegistry.addRecipe(new ItemStack(Block.getBlockById(98), 4), "   ", "XX ", "XX ", 'X', ModBlocks.stone_andesite_smooth);
		GameRegistry.addRecipe(new ItemStack(Block.getBlockById(98), 4), "   ", " XX", " XX", 'X', ModBlocks.stone_andesite_smooth);
		GameRegistry.addRecipe(new ItemStack(Block.getBlockById(98), 4), "XX ", "XX ", "   ", 'X', ModBlocks.stone_granite_smooth);
		GameRegistry.addRecipe(new ItemStack(Block.getBlockById(98), 4), " XX", " XX", "   ", 'X', ModBlocks.stone_granite_smooth);
		GameRegistry.addRecipe(new ItemStack(Block.getBlockById(98), 4), "   ", "XX ", "XX ", 'X', ModBlocks.stone_granite_smooth);
		GameRegistry.addRecipe(new ItemStack(Block.getBlockById(98), 4), "   ", " XX", " XX", 'X', ModBlocks.stone_granite_smooth);
		//Coarse Dirt
		GameRegistry.addRecipe(new ItemStack(ModBlocks.coarse_dirt), "XY ", "   ", "   ", 'X', Block.getBlockById(3), 'Y', Item.getItemById(13));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.coarse_dirt), " XY", "   ", "   ", 'X', Block.getBlockById(3), 'Y', Item.getItemById(13));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.coarse_dirt), "   ", "XY ", "   ", 'X', Block.getBlockById(3), 'Y', Item.getItemById(13));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.coarse_dirt), "   ", " XY", "   ", 'X', Block.getBlockById(3), 'Y', Item.getItemById(13));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.coarse_dirt), "   ", "   ", "XY ", 'X', Block.getBlockById(3), 'Y', Item.getItemById(13));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.coarse_dirt), "   ", "   ", " XY", 'X', Block.getBlockById(3), 'Y', Item.getItemById(13));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.coarse_dirt), "YX ", "   ", "   ", 'X', Block.getBlockById(3), 'Y', Item.getItemById(13));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.coarse_dirt), " YX", "   ", "   ", 'X', Block.getBlockById(3), 'Y', Item.getItemById(13));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.coarse_dirt), "   ", "YX ", "   ", 'X', Block.getBlockById(3), 'Y', Item.getItemById(13));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.coarse_dirt), "   ", " YX", "   ", 'X', Block.getBlockById(3), 'Y', Item.getItemById(13));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.coarse_dirt), "   ", "   ", "YX ", 'X', Block.getBlockById(3), 'Y', Item.getItemById(13));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.coarse_dirt), "   ", "   ", " YX", 'X', Block.getBlockById(3), 'Y', Item.getItemById(13));
		
		
		
		//Sea Lantern
		GameRegistry.addRecipe(new ItemStack(ModBlocks.sea_lantern), "XYX", "YYY", "XYX", 'X', ModItems.prismarine_shard, 'Y', ModItems.prismarine_crystals);
		//Prismarine
		GameRegistry.addRecipe(new ItemStack(ModBlocks.prismarine, 0), "   ", "XX ", "XX ", 'X', ModItems.prismarine_shard);
		//Prismarine Bricks
		GameRegistry.addRecipe(new ItemStack(ModBlocks.prismarine, 1), "XXX", "XXX", "XXX", 'X', ModItems.prismarine_shard);
		//Dark Prismarine
		GameRegistry.addRecipe(new ItemStack(ModBlocks.prismarine, 2), "XXX", "XYX", "XXX", 'X', ModItems.prismarine_shard, 'Y', Item.getItemById(351));
		//Cooked mutton
		GameRegistry.addSmelting(new ItemStack(ModItems.mutton_raw), new ItemStack(ModItems.mutton_cooked), 0.35f);*/
	}
}
