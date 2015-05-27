package com.jim.blocksanditems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockSlime extends Block {
    private static final String name = "slime";

    public BlockSlime() {
        super(Material.rock);
        GameRegistry.registerBlock(this, name);
        this.setBlockName(name);
        this.setBlockTextureName(BlocksAndItemsMain.MODID + ":" + name);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setLightOpacity(0);
        
        //We use this function instead because it allows us to set specific ids.
       	Block.blockRegistry.addObject(165, name, this);
    }
}
