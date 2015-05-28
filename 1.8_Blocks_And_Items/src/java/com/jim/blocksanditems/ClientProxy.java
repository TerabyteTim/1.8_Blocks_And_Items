package com.jim.blocksanditems;

import com.jim.blocks.ModBlocks;
import com.jim.items.ItemBannerRenderer;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerRenderers() {
        this.registerItemRenderers();
        //registerBlockRenderers();
        this.registerEntityRenderers();
    }

    private void registerItemRenderers() {
            MinecraftForgeClient.registerItemRenderer(
                    Item.getItemFromBlock(ModBlocks.banner),
                    new ItemBannerRenderer());
    }

//	private void registerBlockRenderers() {
//		if (EtFuturum.enableSlimeBlock)
//			RenderingRegistry.registerBlockHandler(new BlockSlimeBlockRender());
//
//		if (EtFuturum.enableDoors)
//			RenderingRegistry.registerBlockHandler(new BlockDoorRenderer());
//
//		if (EtFuturum.enableBanners)
//			ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBanner.class, new TileEntityBannerRenderer());
//
//		if (EtFuturum.enableFancySkulls)
//			ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySkull.class, new TileEntityFancySkullRenderer());
//
//		RenderingRegistry.registerBlockHandler(new BlockChestRenderer());
//	}

    private void registerEntityRenderers() {
        /*if (EtFuturum.enableArmourStand) {
            RenderingRegistry.registerEntityRenderingHandler(
                    EntityArmourStand.class, new ArmourStandRenderer());
        }
        if (EtFuturum.enableEndermite) {
            RenderingRegistry.registerEntityRenderingHandler(
                    EntityEndermite.class, new EndermiteRenderer());
        }*/
    }
}