package com.jim.blocksanditems;

import com.jim.blocks.BlocksAndItemsMain;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy implements IGuiHandler {

	public void registerEntities() {
		GameRegistry.registerTileEntity(TileEntityBanner.class, BlocksAndItemsMain.MODID + "." + "banner");
		EntityRegistry.registerModEntity(EntityArmourStand.class, "wooden_armorstand", 0, BlocksAndItemsMain.instance, 64, 1, true);
	}

	public void registerRenderers() {}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		return null;
	}
}