package com.jim.blocksanditems;

import java.util.Random;

import com.jim.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

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
	
						//Minecraft.getMinecraft().thePlayer.sendChatMessage(new Vector3d(pos.blockX,pos.blockY, pos.blockZ).toString());
						Minecraft.getMinecraft().thePlayer.sendChatMessage(String.valueOf(Block.getIdFromBlock(b)));
					}
			}
		}
}
