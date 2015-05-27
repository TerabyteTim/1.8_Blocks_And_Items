package com.jim.blocksanditems;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init () {
		//Granite
		//GameRegistry.addRecipe(MobDropsHandler.test, "XY ", "   ", "   ", 'X', ModItems.prismarine_crystals, 'Y', Item.getItemById(406));
		/*GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 1, 1), " XY", "   ", "   ", 'X', new ItemStack(ModBlocks.stone, 1, 3), 'Y', Item.getItemById(406));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 1, 1), "   ", "XY ", "   ", 'X', new ItemStack(ModBlocks.stone, 1, 3), 'Y', Item.getItemById(406));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 1, 1), "   ", " XY", "   ", 'X', new ItemStack(ModBlocks.stone, 1, 3), 'Y', Item.getItemById(406));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 1, 1), "   ", "   ", "XY ", 'X', new ItemStack(ModBlocks.stone, 1, 3), 'Y', Item.getItemById(406));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 1, 1), "   ", "   ", " XY", 'X', new ItemStack(ModBlocks.stone, 1, 3), 'Y', Item.getItemById(406));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 1, 1), "YX ", "   ", "   ", 'X', new ItemStack(ModBlocks.stone, 1, 3), 'Y', Item.getItemById(406));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 1, 1), " YX", "   ", "   ", 'X', new ItemStack(ModBlocks.stone, 1, 3), 'Y', Item.getItemById(406));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 1, 1), "   ", "YX ", "   ", 'X', new ItemStack(ModBlocks.stone, 1, 3), 'Y', Item.getItemById(406));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 1, 1), "   ", " YX", "   ", 'X', new ItemStack(ModBlocks.stone, 1, 3), 'Y', Item.getItemById(406));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 1, 1), "   ", "   ", "YX ", 'X', new ItemStack(ModBlocks.stone, 1, 3), 'Y', Item.getItemById(406));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 1, 1), "   ", "   ", " YX", 'X', new ItemStack(ModBlocks.stone, 1, 3), 'Y', Item.getItemById(406));
		//Polished Granite
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 4, 2), "XX ", "XX ", "   ", 'X', new ItemStack(ModBlocks.stone, 1, 1));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 4, 2), " XX", " XX", "   ", 'X', new ItemStack(ModBlocks.stone, 1, 1));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 4, 2), "   ", "XX ", "XX ", 'X', new ItemStack(ModBlocks.stone, 1, 1));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 4, 2), "   ", " XX", " XX", 'X', new ItemStack(ModBlocks.stone, 1, 1));		
		//Diorite
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 2, 3), "XY ", "YX ", "   ", 'X', Item.getItemById(4), 'Y', Item.getItemById(13));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 2, 3), " XY", " YX", "   ", 'X', Item.getItemById(4), 'Y', Item.getItemById(13));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 2, 3), "YX ", "XY ", "   ", 'X', Item.getItemById(4), 'Y', Item.getItemById(13));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 2, 3), " YX", " XY", "   ", 'X', Item.getItemById(4), 'Y', Item.getItemById(13));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 2, 3), "   ", "XY ", "YX ", 'X', Item.getItemById(4), 'Y', Item.getItemById(13));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 2, 3), "   ", " XY", " YX", 'X', Item.getItemById(4), 'Y', Item.getItemById(13));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 2, 3), "   ", "YX ", "XY ", 'X', Item.getItemById(4), 'Y', Item.getItemById(13));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 2, 3), "   ", " YX", " XY", 'X', Item.getItemById(4), 'Y', Item.getItemById(13));
		//Polished Diorite
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 4, 4), "XX ", "XX ", "   ", 'X', new ItemStack(ModBlocks.stone, 1, 3));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 4, 4), " XX", " XX", "   ", 'X', new ItemStack(ModBlocks.stone, 1, 3));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 4, 4), "   ", "XX ", "XX ", 'X', new ItemStack(ModBlocks.stone, 1, 3));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 4, 4), "   ", " XX", " XX", 'X', new ItemStack(ModBlocks.stone, 1, 3));
		//Andesite
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 2, 5), "XY ", "   ", "   ", 'X', new ItemStack(ModBlocks.stone, 1, 3), 'Y', Item.getItemById(4));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 2, 5), " XY", "   ", "   ", 'X', new ItemStack(ModBlocks.stone, 1, 3), 'Y', Item.getItemById(4));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 2, 5), "   ", "XY ", "   ", 'X', new ItemStack(ModBlocks.stone, 1, 3), 'Y', Item.getItemById(4));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 2, 5), "   ", " XY", "   ", 'X', new ItemStack(ModBlocks.stone, 1, 3), 'Y', Item.getItemById(4));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 2, 5), "   ", "   ", "XY ", 'X', new ItemStack(ModBlocks.stone, 1, 3), 'Y', Item.getItemById(4));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 2, 5), "   ", "   ", " XY", 'X', new ItemStack(ModBlocks.stone, 1, 3), 'Y', Item.getItemById(4));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 2, 5), "YX ", "   ", "   ", 'X', new ItemStack(ModBlocks.stone, 1, 3), 'Y', Item.getItemById(4));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 2, 5), " YX", "   ", "   ", 'X', new ItemStack(ModBlocks.stone, 1, 3), 'Y', Item.getItemById(4));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 2, 5), "   ", "YX ", "   ", 'X', new ItemStack(ModBlocks.stone, 1, 3), 'Y', Item.getItemById(4));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 2, 5), "   ", " YX", "   ", 'X', new ItemStack(ModBlocks.stone, 1, 3), 'Y', Item.getItemById(4));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 2, 5), "   ", "   ", "YX ", 'X', new ItemStack(ModBlocks.stone, 1, 3), 'Y', Item.getItemById(4));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 2, 5), "   ", "   ", " YX", 'X', new ItemStack(ModBlocks.stone, 1, 3), 'Y', Item.getItemById(4));
		//Polished Andesite
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 4, 6), "XX ", "XX ", "   ", 'X', new ItemStack(ModBlocks.stone, 1, 5));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 4, 6), " XX", " XX", "   ", 'X', new ItemStack(ModBlocks.stone, 1, 5));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 4, 6), "   ", "XX ", "XX ", 'X', new ItemStack(ModBlocks.stone, 1, 5));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stone, 4, 6), "   ", " XX", " XX", 'X', new ItemStack(ModBlocks.stone, 1, 5));		
		//Stone Bricks
		GameRegistry.addRecipe(new ItemStack(Block.getBlockById(98), 4), "XX ", "XX ", "   ", 'X', new ItemStack(ModBlocks.stone, 1, 4));
		GameRegistry.addRecipe(new ItemStack(Block.getBlockById(98), 4), " XX", " XX", "   ", 'X', new ItemStack(ModBlocks.stone, 1, 4));
		GameRegistry.addRecipe(new ItemStack(Block.getBlockById(98), 4), "   ", "XX ", "XX ", 'X', new ItemStack(ModBlocks.stone, 1, 4));
		GameRegistry.addRecipe(new ItemStack(Block.getBlockById(98), 4), "   ", " XX", " XX", 'X', new ItemStack(ModBlocks.stone, 1, 4));
		GameRegistry.addRecipe(new ItemStack(Block.getBlockById(98), 4), "XX ", "XX ", "   ", 'X', new ItemStack(ModBlocks.stone, 1, 6));
		GameRegistry.addRecipe(new ItemStack(Block.getBlockById(98), 4), " XX", " XX", "   ", 'X', new ItemStack(ModBlocks.stone, 1, 6));
		GameRegistry.addRecipe(new ItemStack(Block.getBlockById(98), 4), "   ", "XX ", "XX ", 'X', new ItemStack(ModBlocks.stone, 1, 6));
		GameRegistry.addRecipe(new ItemStack(Block.getBlockById(98), 4), "   ", " XX", " XX", 'X', new ItemStack(ModBlocks.stone, 1, 6));
		GameRegistry.addRecipe(new ItemStack(Block.getBlockById(98), 4), "XX ", "XX ", "   ", 'X', new ItemStack(ModBlocks.stone, 1, 2));
		GameRegistry.addRecipe(new ItemStack(Block.getBlockById(98), 4), " XX", " XX", "   ", 'X', new ItemStack(ModBlocks.stone, 1, 2));
		GameRegistry.addRecipe(new ItemStack(Block.getBlockById(98), 4), "   ", "XX ", "XX ", 'X', new ItemStack(ModBlocks.stone, 1, 2));
		GameRegistry.addRecipe(new ItemStack(Block.getBlockById(98), 4), "   ", " XX", " XX", 'X', new ItemStack(ModBlocks.stone, 1, 2));
		//Coarse Dirt
		/*GameRegistry.addRecipe(new ItemStack(ModBlocks.coarse_dirt), "XY ", "   ", "   ", 'X', Block.getBlockById(3), 'Y', Item.getItemById(13));
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
		GameRegistry.addRecipe(new ItemStack(ModBlocks.coarse_dirt), "   ", "   ", " YX", 'X', Block.getBlockById(3), 'Y', Item.getItemById(13));*/
		
		//Sea Lantern
		GameRegistry.addRecipe(new ItemStack(ModBlocks.sea_lantern), "XYX", "YYY", "XYX", 'X', ModItems.prismarine_shard, 'Y', ModItems.prismarine_crystals);
		//Prismarine
		GameRegistry.addRecipe(new ItemStack(ModBlocks.prismarine, 1, 0), "   ", "XX ", "XX ", 'X', ModItems.prismarine_shard);
		//Prismarine Bricks
		GameRegistry.addRecipe(new ItemStack(ModBlocks.prismarine, 1, 1), "XXX", "XXX", "XXX", 'X', ModItems.prismarine_shard);
		//Dark Prismarine
		GameRegistry.addRecipe(new ItemStack(ModBlocks.prismarine, 1, 2), "XXX", "XYX", "XXX", 'X', ModItems.prismarine_shard, 'Y', Item.getItemById(351));
		//Cooked mutton
		GameRegistry.addSmelting(new ItemStack(ModItems.mutton_raw), new ItemStack(ModItems.mutton_cooked), 0.35f);
	}
}
