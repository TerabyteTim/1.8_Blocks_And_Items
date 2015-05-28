package com.jim.items;

import com.jim.blocks.BlockStone;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockStone extends ItemBlock {
	
	public ItemBlockStone(Block p_i45328_1_) {
		super(p_i45328_1_);
		this.setHasSubtypes(true);
		this.setUnlocalizedName("stone");
	}
	
	@Override
	public int getMetadata(int damageValue) {
		return damageValue;
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		return getUnlocalizedName() + "." + BlockStone.typeNames[itemstack.getItemDamage()];
	}
}
