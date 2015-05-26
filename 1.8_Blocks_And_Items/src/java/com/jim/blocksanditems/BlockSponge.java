package com.jim.blocksanditems;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
import net.minecraft.util.Tuple;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class BlockSponge extends net.minecraft.block.BlockSponge
{
	//Names for all types this block has
	public static final String[] typeNames = new String[] {"dry", "wet"};
	//Icons for all types this block has
    @SideOnly(Side.CLIENT)
    private IIcon[] typeIcons;
    private static final String name = "sponge1";
    private int absorbtion = 3;
    private boolean fillWithWater;
 
    public BlockSponge(int absorbtionSetting, boolean fillWithWater)
    {
        super();
        //GameRegistry.registerBlock(this, ItemBlockPrismarine.class, name);

        this.absorbtion = absorbtionSetting;
        this.setBlockName(name);
        this.setBlockTextureName(BlocksAndItemsMain.MODID + ":" + name);
        this.setTickRandomly(true);
        this.fillWithWater = fillWithWater;
    }
    
    @Override
    /*public int tickRate(World par1World) {
        return 1;
    }
    
    @Override
    public void onBlockDestroyedByPlayer(World world, int x, int y, int z,
            int meta) {
        if (!world.isRemote) {
            ArrayList<Tuple> blocksToMakeAir = new ArrayList<Tuple>();
            blocksToMakeAir.clear();
            for (int yCount = this.absorbtion + 1; yCount > -this.absorbtion; yCount--) {
                for (int xCount = -this.absorbtion; xCount < this.absorbtion + 1; xCount++) {
                    for (int zCount = -this.absorbtion; zCount < this.absorbtion + 1; zCount++) {
                        if (world.getBlock(xCount + x, yCount + y, zCount + z) == ModBlocks.clearBlock) {
                            if ((world.getBlock(xCount + x, yCount + y + 1,
                                    zCount + z) == Block.getBlockById(8)
                                    || world.getBlock(xCount + x, yCount + y
                                            + 1, zCount + z) == Block
                                            .getBlockById(9)
                                            || world.isAirBlock(xCount + x, yCount + y
                                                    + 1, zCount + z) || (x == xCount
                                                    + x
                                                    && y == yCount && z == zCount))
                                                    && this.fillWithWater) {//top layer
                                world.setBlock(xCount + x, yCount + y, zCount
                                        + z, Block.getBlockById(9));
                            } else {
                                world.setBlockToAir(xCount + x, yCount + y,
                                        zCount + z);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public void onBlockDestroyedByExplosion(World world, int x, int y, int z,
            Explosion par5Explosion) {
        this.onBlockDestroyedByPlayer(world, x, y, z, 0);
    }

    @Override
    public void onBlockAdded(World par1World, int par2, int par3, int par4) {
        if (!par1World.isRemote) {
            this.suckUpWater(par1World, par2, par3, par4);
        }
    }

    private void suckUpWater(World world, int x, int y, int z) {
        for (int xCount = -this.absorbtion; xCount < this.absorbtion + 1; xCount++) {
            for (int yCount = -this.absorbtion; yCount < this.absorbtion + 1; yCount++) {
                for (int zCount = -this.absorbtion; zCount < this.absorbtion + 1; zCount++) {
                    if (world.getBlock(xCount + x, yCount + y, zCount + z) == Block
                            .getBlockById(8)
                            || world.getBlock(xCount + x, yCount + y, zCount
                                    + z) == Block.getBlockById(9)) {
                        world.setBlock(xCount + x, yCount + y, zCount + z,
                                ModBlocks.clearBlock);
                    }
                }
            }
        }
    }

    public void onNeighborBlockChange(World world, int x, int y, int z,
            int neighborId) {
        this.suckUpWater(world, x, y, z);
    }

    @Override
    public void updateTick(World world, int x, int y, int z, Random random) {
        this.suckUpWater(world, x, y, z);
        //ModLoader.getMinecraftInstance().thePlayer.addChatMessage("Ticking block");
        super.updateTick(world, x, y, z, random);
    }*/
    
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
