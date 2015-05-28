package com.jim.blocks;

import com.jim.blocksanditems.CommonProxy;
import com.jim.blocksanditems.MobDropsHandler;
import com.jim.blocksanditems.ModRecipes;
import com.jim.items.ModItems;

import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

@Mod(modid = BlocksAndItemsMain.MODID, name = BlocksAndItemsMain.NAME, version = BlocksAndItemsMain.VERSION)
 
public class BlocksAndItemsMain
{
    public static final String NAME = "1.8 Blocks And Items";
    public static final String MODID = "blocksanditems";
    public static final String VERSION = "1.7.10-R1";
    
    @SidedProxy(clientSide = "com.jim.blocksanditems.ClientProxy", serverSide = "com.jim.blocksanditems.CommonProxy")
    public static CommonProxy proxy;
 
    @Mod.Instance("blocksanditems")
    public static BlocksAndItemsMain instance;
 
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) 
    {    	
    	ModItems.init();	
    	ModBlocks.init();
    	ModRecipes.init();
    }
 
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) 
    {
    	MinecraftForge.EVENT_BUS.register(new MobDropsHandler());  
    	
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, proxy);

        proxy.registerEntities();
        proxy.registerRenderers();
    }
 
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {}
}