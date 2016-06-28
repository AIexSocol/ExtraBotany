package com.meteor.extrabotany.common.item.relic.legendary;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import vazkii.botania.common.item.relic.ItemRelic;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.meteor.extrabotany.common.lib.LibItemName;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;

public class ItemVRangerBoots extends ItemRelicArmorSet{

	public ItemVRangerBoots(int type, String name) {
		super(3, LibItemName.VRANGERBOOTS);
		MinecraftForge.EVENT_BUS.register(this);
		FMLCommonHandler.instance().bus().register(this);
	}
	
	@Override
	public Multimap getItemAttributeModifiers() {
		Multimap multimap = HashMultimap.create();
		multimap.put(SharedMonsterAttributes.movementSpeed.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Armor modifier", 0.6, 1));
		return multimap;
	}
	
		@SubscribeEvent
		 public void FallingEvent(LivingFallEvent event) { 
		        if(!(event.entity instanceof EntityPlayerMP)) {
		            return;
		        }
		        EntityPlayer player = (EntityPlayer) event.entity;
		        for(ItemStack stack : player.inventory.armorInventory) {
		            if(stack != null && stack.getItem() instanceof ItemVRangerBoots) {
		            	if(ItemRelic.isRightPlayer(player, stack))
		            	if((int)event.distance >=10)
		            		stack.damageItem((int)event.distance/4, player);
		                
		                event.distance = 0F; 
		            }
		        }
		 }
		
		  @SubscribeEvent
			 public void JumpingEvent(LivingEvent.LivingJumpEvent event) { 
			  if (event.entity instanceof EntityPlayer) {
			        EntityPlayer player = (EntityPlayer) event.entity;
			        for(ItemStack stack : player.inventory.armorInventory) {
			            if(stack != null && stack.getItem() instanceof ItemVRangerBoots) {
			            	if(ItemRelic.isRightPlayer(player, stack)){
			            		event.entity.motionY *=1.2;
			            	}
			            }
			        }
			    }
		  }
		  
		  @SubscribeEvent
			 public void FallEvent(TickEvent.PlayerTickEvent event) { 
			  if (event.player instanceof EntityPlayer) {
			        EntityPlayer player = (EntityPlayer) event.player;
			        for(ItemStack stack : player.inventory.armorInventory) {
			            if(stack != null && stack.getItem() instanceof ItemVRangerBoots) {
			            	 if (event.player.isAirBorne&& event.player.isSneaking()){
			            		 if(ItemRelic.isRightPlayer(player, stack))
			            		 event.player.motionY = -0.2;
			            		 event.player.motionX *= 1.05;
			            		 event.player.motionZ *= 1.05;
			                 }
			            }
			        }
			 }
		}

}


