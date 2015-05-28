package com.jim.blocksanditems;

import com.jim.blocks.BlocksAndItemsMain;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy implements IGuiHandler {

	public void registerEvents() {
		//FMLCommonHandler.instance().bus().register(ConfigurationHandler.INSTANCE);
		//MinecraftForge.EVENT_BUS.register(new ModEventHandler());
	}

	public void registerEntities() {
		GameRegistry.registerTileEntity(TileEntityBanner.class, BlocksAndItemsMain.MODID + "." + "banner");
		/*if (EtFuturum.enableArmourStand)
			ModEntityList.registerEntity(EntityArmourStand.class, "wooden_armorstand", 0, EtFuturum.instance, 64, 1, true);
		if (EtFuturum.enableEndermite)
			ModEntityList.registerEntity(EntityEndermite.class, "endermite", 1, EtFuturum.instance, 64, 1, true, 1447446, 7237230);*/
	}

	public void registerRenderers() {
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		return null;
	}
}