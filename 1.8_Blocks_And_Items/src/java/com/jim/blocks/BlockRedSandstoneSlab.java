package com.jim.blocks;

import java.util.ArrayList;
import java.util.List;

import com.jim.blocks.ModBlocks.ISubBlocksBlock;
import com.jim.blocksanditems.IConfigurable;
import com.jim.items.ItemRedSandstoneSlab;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockRedSandstoneSlab extends Block implements ISubBlocksBlock, IConfigurable {

    private static final String name = "red_sandstone_slab";
    
	public BlockRedSandstoneSlab() {
		super(Material.rock);
		GameRegistry.registerBlock(this, ItemRedSandstoneSlab.class, name);
		
		setResistance(30);
		setHardness(2.0F);
		setLightOpacity(0);
		setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
		setBlockName(name);
		setCreativeTab(CreativeTabs.tabBlock);
	}

	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z) {
		int meta = world.getBlockMetadata(x, y, z);
		if (meta == 0)
			setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
		else if (meta == 1)
			setBlockBounds(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
		else if (meta == 2)
			setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
	}

	@Override
	@SuppressWarnings("rawtypes")
	public void addCollisionBoxesToList(World world, int x, int y, int z, AxisAlignedBB box, List list, Entity entity) {
		setBlockBoundsBasedOnState(world, x, y, z);
		super.addCollisionBoxesToList(world, x, y, z, box, list, entity);
	}

	@Override
	public void setBlockBoundsForItemRender() {
		setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
	}

	@Override
	public int onBlockPlaced(World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ, int meta) {
		if (side == 1)
			return 0;
		if (side == 0 || hitY > 0.5D)
			return 1;
		return 0;
	}
	
	@Override
    public void onBlockAdded(World world, int x, int y, int z) {
		//If we're right above another slab, create a double slab.
		/*if (world.getBlock(x, y - 1, z) instanceof BlockRedSandstoneSlab) {
			world.setBlock(x, y - 1, z, ModBlocks.red_sandstone_slab_double);
			world.setBlockToAir(x, y, z);
		}*/
    }
	
	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int meta, int fortune) {
		ArrayList<ItemStack> ret = new ArrayList<ItemStack>();

		int size = 1;
		if (meta == 2)
			size = 2;

		ret.add(new ItemStack(this, size));

		return ret;
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		return ModBlocks.red_sandstone.getIcon(side, 0);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister reg) {
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, int side) {
		return true;
	}

	@Override
	public Class<? extends ItemBlock> getItemBlockClass() {
		return ItemRedSandstoneSlab.class;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}