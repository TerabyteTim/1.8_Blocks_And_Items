package com.jim.blocksanditems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import javax.vecmath.Vector3d;
import javax.vecmath.Vector3f;

import com.google.common.collect.Lists;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IIcon;
import net.minecraft.util.Tuple;
import net.minecraft.world.World;

public class BlockSponge extends net.minecraft.block.BlockSponge
{
	//Names for all types this block has
	public static final String[] typeNames = new String[] {"dry", "wet"};
	//Icons for all types this block has
    @SideOnly(Side.CLIENT)
    private IIcon[] typeIcons;
    private static final String name = "sponge";
    private boolean fullWithWater;  
 
    public BlockSponge()
    {
        super();

        this.setBlockName(name);
        this.setBlockTextureName(BlocksAndItemsMain.MODID + ":" + name);
        this.setTickRandomly(true);
        this.fullWithWater = false;
        this.setResistance(3);
        this.setHardness(0.6f);
    }
    
    @Override
    public int tickRate(World par1World) {
        return 1;
    }

    @Override
    public void onBlockAdded(World par1World, int par2, int par3, int par4) {
    	//Set us as dry
    	this.fullWithWater = false;
    	
        if (!par1World.isRemote) {
            this.tryAbsorb(par1World, par2, par3, par4);
        }
    }

    /**
     * Attempt to absorb water around us
     * @param world
     * 		World we're in
     * @param x
     * 		X position our block is at
     * @param y
     * 		Y position our block is at
     * @param z
     * 		Z position our block is at
     */
    private void tryAbsorb(World world, int x, int y, int z) {   
    	//If we weren't wet before, and we successfully got some, soak us.
    	if (!this.fullWithWater && this.absorb(world, new Vector3d(x, y, z))) {
        	world.setBlockMetadataWithNotify(x, y, z, 1, 1);
        	world.markBlockForUpdate(x, y, z);
        	world.playAuxSFX(2001, x, y, z, Block.getIdFromBlock(Blocks.water));
        	this.fullWithWater = true;
    	}
    }
    
    /**
     * Absorbs water around us using a taxi-cab algorithm.
     * @param w 
     * 		World we're in
     * @param pos 
     * 		Vector3 position our block is at
     * @return
     * 		True if we absorbed water and are now wet like Ariel.
     */
    private boolean absorb (World w, Vector3d pos) {
    	boolean gotWet = false;
    	
    	LinkedList linkedlist = Lists.newLinkedList();
        ArrayList arraylist = Lists.newArrayList();
        linkedlist.add(new Tuple(pos, Integer.valueOf(0)));
        int i = 0;
        Vector3d blockpos1;
        
        //Iterate through blocks in each direction. We only absorb in a connected line, no skipping blocks.
        //We absorb 7 blocks in each direction, taking in no more than 65 blocks of water.
        while (!linkedlist.isEmpty())
        {
            Tuple tuple = (Tuple)linkedlist.poll();
            blockpos1 = (Vector3d)tuple.getFirst();
            int j = ((Integer)tuple.getSecond()).intValue();
            EnumFacing[] aenumfacing = EnumFacing.values();
            int k = aenumfacing.length;

            for (int l = 0; l < k; ++l)
            {
                EnumFacing enumfacing = aenumfacing[l];
                Vector3d blockpos2 = offset(blockpos1, enumfacing);
                Block b = w.getBlock((int)blockpos2.x, (int)blockpos2.y, (int)blockpos2.z);

                if (b == Block.getBlockById(8) || b == Block.getBlockById(9))
                {
                	w.setBlockToAir((int)blockpos2.x, (int)blockpos2.y, (int)blockpos2.z);
                    arraylist.add(blockpos2);
                    ++i;

                    if (j < 6)
                    {
                        linkedlist.add(new Tuple(blockpos2, Integer.valueOf(j + 1)));
                    }
                }
            }

            if (i > 64)
            {
                break;
            }
        }

        Iterator iterator = arraylist.iterator();

        while (iterator.hasNext())
        {
            blockpos1 = (Vector3d)iterator.next();
            w.notifyBlockChange((int)blockpos1.x, (int)blockpos1.y, (int)blockpos1.z, Blocks.air);
        }

        return i > 0;
    }
    
    private Vector3d offset (Vector3d in, EnumFacing dir) {
    	Vector3d newVec = new Vector3d(in);
    	
    	switch(dir) {
    		case UP:
    			newVec.add(new Vector3d(0, 1, 0));
    			break;
    		case DOWN:
    			newVec.add(new Vector3d(0, -1, 0));
    			break;
    		case NORTH:
    			newVec.add(new Vector3d(0, 0, -1));
    			break;
    		case SOUTH:
    			newVec.add(new Vector3d(0, 0, 1));
    			break;
    		case EAST:
    			newVec.add(new Vector3d(1, 0, 0));
    			break;
    		case WEST:
    			newVec.add(new Vector3d(-1, 0, 0));
    			break;
    	}
    	
    	return newVec;
    }

    public void onNeighborBlockChange(World world, int x, int y, int z,
            int neighborId) {
        this.tryAbsorb(world, x, y, z);
    }

    @Override
    public void updateTick(World world, int x, int y, int z, Random random) {
        this.tryAbsorb(world, x, y, z);
        super.updateTick(world, x, y, z, random);
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
