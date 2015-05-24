package com.jim.blocksanditems;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class MobDropsHandler {
	@SubscribeEvent
	public void onMobDrops(LivingDropsEvent evt) 
	{
		if (evt.entity instanceof EntitySheep) {
			
			ItemStack stack = new ItemStack(ModItems.mutton_raw);
			EntityItem drop = new EntityItem(evt.entity.worldObj, evt.entity.posX, evt.entity.posY, evt.entity.posZ, stack);
			
			evt.drops.add(drop);
		}
	}
}
