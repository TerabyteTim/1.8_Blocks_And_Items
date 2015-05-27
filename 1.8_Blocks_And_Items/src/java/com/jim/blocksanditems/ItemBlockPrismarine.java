package com.jim.blocksanditems;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockPrismarine extends ItemBlock {
	
	public ItemBlockPrismarine(Block p_i45328_1_) {
		super(p_i45328_1_);
		this.setHasSubtypes(true);
		this.setUnlocalizedName("prismarine");
	}
	
	@Override
	public int getMetadata(int damageValue) {
		return damageValue;
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		return getUnlocalizedName() + "." + BlockPrismarine.typeNames[itemstack.getItemDamage()];
	}
}
