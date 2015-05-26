package com.jim.blocksanditems;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockDiorite extends Block {
	
    private static final String name = "stone_diorite";

    public BlockDiorite() {
        super(Material.rock);
        GameRegistry.registerBlock(this, name);
        this.setBlockName(name);
        this.setBlockTextureName(BlocksAndItemsMain.MODID + ":" + name);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(1.5f);
        this.setStepSound(soundTypeStone);
        this.blockResistance = 30;
    }
}
