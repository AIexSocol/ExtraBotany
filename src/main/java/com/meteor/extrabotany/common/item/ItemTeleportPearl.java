package com.meteor.extrabotany.common.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.meteor.extrabotany.common.entity.EntityTeleportPearl;
import com.meteor.extrabotany.common.item.relic.legendary.ItemHermesTravelClothing;

public class ItemTeleportPearl extends ItemMods{

	public ItemTeleportPearl(String name) {
		super(name);
	}
	
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player){
		if (player.capabilities.isCreativeMode){
			return stack;
	    }else{
	    	if(!ItemHermesTravelClothing.hasHermesTravelClothing(player))
	    		--stack.stackSize;
	        
            world.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

            if (!world.isRemote)
            	world.spawnEntityInWorld(new EntityTeleportPearl(world, player));
            return stack;
	    }
	}

}
