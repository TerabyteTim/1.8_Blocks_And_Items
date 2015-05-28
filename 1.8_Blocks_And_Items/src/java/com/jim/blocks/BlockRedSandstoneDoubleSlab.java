package com.jim.blocks;

import java.util.Random;

import com.jim.items.ItemRedSandstoneSlab;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockRedSandstoneDoubleSlab extends Block {
	
    private static final String name = "red_sandstone_slab_double";
    private IIcon icon;
    private IIcon botIcon;
    private IIcon topIcon;

    public BlockRedSandstoneDoubleSlab() {
        super(Material.rock);
        GameRegistry.registerBlock(this, name);
        
        this.setBlockName(name);
        this.setBlockTextureName(BlocksAndItemsMain.MODID + ":red_sandstone");
        this.setStepSound(soundTypeStone);
        this.setResistance(30);
        this.setHardness(2);
    }
    
    /**
     * Gets the block's texture. Args: side, meta
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        IIcon icon = this.icon;
        
        if (p_149691_1_ == 0) {
        	icon = this.botIcon;
        } else if (p_149691_1_ == 1) {
        	icon = this.topIcon;
        }
        
        return icon;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
    	this.icon = p_149651_1_.registerIcon(this.getTextureName() + "_normal");        
        this.botIcon = p_149651_1_.registerIcon(BlocksAndItemsMain.MODID + ":red_sandstone_bottom");
        this.topIcon = p_149651_1_.registerIcon(BlocksAndItemsMain.MODID + ":red_sandstone_top");
    }
    
    @Override
    public Item getItemDropped(int meta, Random random, int fortune) {
    	return new ItemRedSandstoneSlab(ModBlocks.red_sandstone_slab);
    }
    
    /**
     * Returns the quantity of items to drop on block destruction.
     */
    @Override
    public int quantityDropped(Random random)
    {
        return 2;
    }
}
