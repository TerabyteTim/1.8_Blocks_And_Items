package com.jim.blocksanditems;

import com.jim.blocks.ModBlocks;
import com.jim.items.ItemBannerRenderer;

import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {

    @Override
    public void registerRenderers() {
        this.registerItemRenderers();
        this.registerBlockRenderers();
        this.registerEntityRenderers();
    }

    private void registerItemRenderers() {
    	MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.banner), new ItemBannerRenderer());
    }

	private void registerBlockRenderers() {    
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBanner.class, new TileEntityBannerRenderer());
	}

    private void registerEntityRenderers() {
    	RenderingRegistry.registerEntityRenderingHandler(EntityArmourStand.class, new ArmorStandRenderer());
    }
}