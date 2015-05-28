package com.jim.blocks;

import com.jim.blocksanditems.IConfigurable;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockStairs;
import net.minecraft.creativetab.CreativeTabs;

public class BlockRedSandstoneStairs extends BlockStairs implements IConfigurable {
	
    private static final String name = "red_sandstone_stairs";

	public BlockRedSandstoneStairs() {
		super(ModBlocks.red_sandstone, 0);
		GameRegistry.registerBlock(this, name);
		
		this.setResistance(4);
		setHardness(0.8F);
		setLightOpacity(0);
		setBlockName(name);
		setCreativeTab(CreativeTabs.tabBlock);
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}