package com.jim.blocksanditems;

import java.util.Iterator;
import java.util.Random;

import javax.vecmath.Vector3d;

import net.java.games.input.Keyboard;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.registry.GameData;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MobDropsHandler {
	@SubscribeEvent
	public void onMobDrops(LivingDropsEvent evt) 
	{
		Random r = new Random();
		
		if (evt.entity instanceof EntitySheep) {
			//Drop 1-2 + our looting level.
			int num = r.nextInt(2 + evt.lootingLevel) + 1;
			Item item = ModItems.mutton_raw;
			
			//If we're burning, dropped cooked mutton.
			if (evt.entity.isBurning()) {
				item = ModItems.mutton_cooked;
			}
			
			ItemStack stack = new ItemStack(item, num);
			EntityItem drop = new EntityItem(evt.entity.worldObj, evt.entity.posX, evt.entity.posY, evt.entity.posZ, stack);
			
			evt.drops.add(drop);
		}
	}
	
	@SubscribeEvent
	public void onRightClick(PlayerEvent evt) {
		if (org.lwjgl.input.Keyboard.isKeyDown(0x10) && evt.entityPlayer != null) {			
				MovingObjectPosition pos = evt.entityPlayer.rayTrace(200, 1.0f) ;

				if (pos != null) {
					World w = (World)Minecraft.getMinecraft().theWorld;
					Block b = w.getBlock(pos.blockX, pos.blockY, pos.blockZ);

					Minecraft.getMinecraft().thePlayer.sendChatMessage(new Vector3d(pos.blockX,pos.blockY, pos.blockZ).toString());
					//Minecraft.getMinecraft().thePlayer.sendChatMessage(GameRegistry.findUniqueIdentifierFor(b).toString());
				}
		}
	}
}
