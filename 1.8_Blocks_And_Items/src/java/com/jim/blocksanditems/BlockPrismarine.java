package com.jim.blocksanditems;

import java.util.List;

import cpw.mods.fml.common.registry.ExistingSubstitutionException;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class BlockPrismarine extends Block
{
	//Names for all types this block has
	public static final String[] typeNames = new String[] {"rough", "bricks", "dark"};
	//Icons for all types this block has
    @SideOnly(Side.CLIENT)
    private IIcon[] typeIcons;
    private static final String name = "prismarine";
 
    public BlockPrismarine()
    {
        super(Material.rock);
        GameRegistry.registerBlock(this, ItemBlockPrismarine.class, name);
        
        setBlockName(name);
        setBlockTextureName(BlocksAndItemsMain.MODID + ":" + name);
        setCreativeTab(CreativeTabs.tabBlock);
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

        return this.typeIcons[p_149691_2_];
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
    }
}
