package com.jim.blocksanditems;

import java.util.Random;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
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
			
			if (evt.source.getEntity() instanceof EntityPlayer) {
				EntityPlayer player = (EntityPlayer) evt.source.getEntity();

				player.getFoodStats().setFoodLevel(0);
			}
		}
	}
}
