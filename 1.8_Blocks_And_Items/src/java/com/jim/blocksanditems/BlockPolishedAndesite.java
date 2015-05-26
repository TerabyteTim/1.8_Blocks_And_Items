package com.jim.blocksanditems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockPolishedAndesite extends Block {
    private static final String name = "stone_andesite_smooth";

    public BlockPolishedAndesite() {
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
