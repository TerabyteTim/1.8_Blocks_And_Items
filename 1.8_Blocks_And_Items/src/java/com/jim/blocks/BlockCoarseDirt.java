package com.jim.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockCoarseDirt extends Block {
    private static final String name = "coarse_dirt";

    public BlockCoarseDirt() {
        super(Material.ground);
        GameRegistry.registerBlock(this, name);
        this.setBlockName(name);
        this.setBlockTextureName(BlocksAndItemsMain.MODID + ":" + name);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(0.5f);
        this.setStepSound(soundTypeGrass);
        this.blockResistance = 2.5f;
        this.canBlockGrass = false;
    }
}
