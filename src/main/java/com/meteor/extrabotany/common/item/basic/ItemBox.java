package com.meteor.extrabotany.common.item.basic;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.meteor.extrabotany.common.item.ItemMods;
import com.meteor.extrabotany.common.item.ModItems;

public class ItemBox extends ItemMods{
	
	public static ItemStack[] stacks;

	public ItemBox(String name) {
		super(name);
		this.setMaxStackSize(1);
		stacks = new ItemStack[] {
				new ItemStack(ModItems.material),
				new ItemStack(ModItems.material,1,1),
				new ItemStack(ModItems.material,1,2),
				new ItemStack(ModItems.material,1,3),
				new ItemStack(ModItems.material,1,4),
				new ItemStack(ModItems.material,1,5),
				new ItemStack(ModItems.material,1,6),
				new ItemStack(ModItems.material,1,7),
				new ItemStack(ModItems.material,1,8),
				new ItemStack(ModItems.material,1,9)
		};
	}

	private static final int[] SIDES_FOR_MOON_PHASES = new int[] {
		0, 1, 0, -1, 0, 1, 0, -1
	};
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		if(!player.worldObj.isRemote && player.inventory.hasItemStack(new ItemStack(ModItems.material,1,12))) {
			int moonPhase = world.provider.getMoonPhase(world.getWorldTime());
			int side = SIDES_FOR_MOON_PHASES[moonPhase];
			int relic = side;
				List<Integer> possible = new ArrayList();

				for(int i = 0; i < 10; i++)
					possible.add(world.rand.nextInt(10));
			
					relic = possible.get(world.rand.nextInt(possible.size()));
					world.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (world.rand.nextFloat() * 0.4F + 0.8F));
					player.inventory.consumeInventoryItem(new ItemStack(ModItems.material,1,12).getItem());
					return stacks[relic].copy();
		}

		return stack;
	}

}