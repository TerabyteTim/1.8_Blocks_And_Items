package com.jim.blocksanditems;

import java.util.Random;

import com.jim.items.ModItems;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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
		}
	}
}
