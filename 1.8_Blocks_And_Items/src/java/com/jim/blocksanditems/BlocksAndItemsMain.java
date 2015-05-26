package com.jim.blocksanditems;

import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = BlocksAndItemsMain.MODID, name = BlocksAndItemsMain.NAME, version = BlocksAndItemsMain.VERSION)
 
public class BlocksAndItemsMain
{
    public static final String NAME = "1.8 Blocks And Items";
    public static final String MODID = "blocksanditems";
    public static final String VERSION = "1.7.10-R1";
 
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
    }
 
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {}
}