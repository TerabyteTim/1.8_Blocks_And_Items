package com.jim.blocksanditems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockSeaLantern extends Block {
    private static final String name = "sea_lantern";

    public BlockSeaLantern() {
        super(Material.rock);
        GameRegistry.registerBlock(this, name);
        this.setBlockName(name);
        this.setBlockTextureName(BlocksAndItemsMain.MODID + ":" + name);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setLightLevel(1.0F);
    }

}
