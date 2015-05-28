package com.jim.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSlime extends Block {
    private static final String name = "slime";

    public BlockSlime() {
        super(Material.rock);
        GameRegistry.registerBlock(this, name);
        this.setBlockName(name);
        this.setBlockTextureName(BlocksAndItemsMain.MODID + ":" + name);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setLightOpacity(0);
        
        this.opaque = false;
        
        //We use this function instead because it allows us to set specific ids.
       	Block.blockRegistry.addObject(165, name, this);
    }
    
    @SideOnly(Side.CLIENT)
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
    
    @Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
    public int getRenderBlockPass()
	{
            return 1;
	}
}
