package com.jim.blocksanditems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
public class BlockPrismarine extends Block
{
    private static final String name = "prismarine_rough";
 
    public BlockPrismarine()
    {
        super(Material.rock);
        GameRegistry.registerBlock(this, name);
        setBlockName(name);
        setBlockTextureName(BlocksAndItemsMain.MODID + ":" + name);
        setCreativeTab(CreativeTabs.tabBlock);
    }
}
