package com.jim.blocks;

import java.util.List;
import java.util.Random;

import com.jim.items.ItemBlockRedSandstone;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockRedSandstone extends Block {
	
	//Names for all types this block has
	public static final String[] typeNames = new String[] {"normal", "smooth", "carved"};
	//Icons for all types this block has
	@SideOnly(Side.CLIENT)
	private IIcon[] typeIcons;
	//Texture for our bottom
	@SideOnly(Side.CLIENT)
	private IIcon botIcon;
	//Texture for our top
	@SideOnly(Side.CLIENT)
	private IIcon topIcon;
	
    private static final String name = "red_sandstone";

    public BlockRedSandstone() {
        super(Material.rock);
        GameRegistry.registerBlock(this, ItemBlockRedSandstone.class, name);
        
        this.setBlockName(name);
        this.setBlockTextureName(BlocksAndItemsMain.MODID + ":" + name);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setStepSound(soundTypeStone);
        this.setResistance(4);
        this.setHardness(0.8f);
    }
    
    /**
     * Gets the block's texture. Args: side, meta
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        if (p_149691_2_ < 0 || p_149691_2_ >= this.typeIcons.length)
        {
            p_149691_2_ = 0;
        }

        IIcon icon = this.typeIcons[p_149691_2_];
        
        if (p_149691_1_ == 0) {
        	icon = p_149691_2_ == 0 ? this.botIcon : this.topIcon;
        } else if (p_149691_1_ == 1) {
        	icon = this.topIcon;
        }
        
        return icon;
    }
    
    @Override
    public Item getItemDropped(int meta, Random random, int fortune) {
        return null;
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int p_149692_1_)
    {
        return p_149692_1_;
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_)
    {
    	//Add each of our block types
    	for (int i = 0; i < typeNames.length; i ++) {        
    		p_149666_3_.add(new ItemStack(p_149666_1_, 1, i));
    	}
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.typeIcons = new IIcon[typeNames.length];

        for (int i = 0; i < this.typeIcons.length; ++i)
        {
            this.typeIcons[i] = p_149651_1_.registerIcon(this.getTextureName() + "_" + typeNames[i]);
        }
        
        this.botIcon = p_149651_1_.registerIcon(BlocksAndItemsMain.MODID + ":" + name + "_bottom");
        this.topIcon = p_149651_1_.registerIcon(BlocksAndItemsMain.MODID + ":" + name + "_top");
    }
}
