package com.meteor.extrabotany.common.event;

import java.util.List;

import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import vazkii.botania.api.item.IRelic;
import vazkii.botania.common.item.relic.ItemRelic;

import com.meteor.extrabotany.common.entity.gaia.EntityGaiaIII;
import com.meteor.extrabotany.common.entity.gaia.EntityGaiaIIIDark;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EventGaiaIII{
	
	private static float rankI = 0.75F;
	private static float rankII = 0.5F;
	private static float rankIII = 0.25F;

	@SubscribeEvent
	public void GaiaHurtEvent(LivingHurtEvent event) { 
	        if(!(event.entity instanceof EntityGaiaIII)) {
	            return;
	        }
	        EntityGaiaIII gaia = (EntityGaiaIII) event.entity;
			
	        List<EntityPlayer> livings = gaia.worldObj.getEntitiesWithinAABB(EntityPlayer.class, AxisAlignedBB.getBoundingBox(gaia.posX - 12, gaia.posY - 12, gaia.posZ - 12, gaia.posX + 13, gaia.posY + 13, gaia.posZ + 13));
						for(EntityPlayer living : livings) {
							living.attackEntityFrom(DamageSource.causeMobDamage(gaia), event.ammount/6);
							if(living.worldObj.rand.nextInt(3) == 0){
								EntityLightningBolt light = new EntityLightningBolt(living.worldObj, living.posX, living.posY, living.posZ);
								if(!living.worldObj.isRemote)
									living.worldObj.spawnEntityInWorld(light);
					}
			}	
	        if(gaia.getHealth() <= gaia.getMaxHealth()*rankI){
	        	if(gaia.worldObj.rand.nextInt(4) == 1)
	        		event.ammount = 0;
		    }
	        if(gaia.getHealth() <= gaia.getMaxHealth()*rankIII){
	        	if(event.source == ItemRelic.damageSource())
	        		event.ammount = 0;
		    }
	}
	
	@SubscribeEvent
	public void GaiaDarkHurtEvent(LivingHurtEvent event) { 
	        if(!(event.entity instanceof EntityGaiaIIIDark)) {
	            return;
	        }
	        EntityGaiaIIIDark gaia = (EntityGaiaIIIDark) event.entity;
	        gaia.hurtResistantTime = 40;
	        List<EntityPlayer> livings = gaia.worldObj.getEntitiesWithinAABB(EntityPlayer.class, AxisAlignedBB.getBoundingBox(gaia.posX - 12, gaia.posY - 12, gaia.posZ - 12, gaia.posX + 13, gaia.posY + 13, gaia.posZ + 13));
						for(EntityPlayer living : livings) {
							living.attackEntityFrom(DamageSource.causeMobDamage(gaia), event.ammount/6);
							if(living.worldObj.rand.nextInt(3) == 0){
								EntityLightningBolt light = new EntityLightningBolt(living.worldObj, living.posX, living.posY, living.posZ);
								if(!living.worldObj.isRemote)
									living.worldObj.spawnEntityInWorld(light);
					}
			}	
			event.ammount = 1F;
	        if(gaia.worldObj.rand.nextInt(3) == 1)
	        	event.ammount = 0;
	        if(event.source == ItemRelic.damageSource())
	        	event.ammount = 0;
	}

}
