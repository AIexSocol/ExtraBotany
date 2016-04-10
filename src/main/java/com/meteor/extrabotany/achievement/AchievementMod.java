package com.meteor.extrabotany.achievement;

import java.util.ArrayList;
import java.util.List;

import vazkii.botania.api.item.IRelic;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;

public class AchievementMod extends Achievement {

	public static List<Achievement> achievements = new ArrayList();

	public AchievementMod(String name, int x, int y, ItemStack icon, Achievement parent) {
		super("achievement.botania:" + name, "botania:" + name, x, y, icon, parent);
		achievements.add(this);
		registerStat();

		if(icon.getItem() instanceof IRelic)
			((IRelic) icon.getItem()).setBindAchievement(this);
	}

	public AchievementMod(String name, int x, int y, Item icon, Achievement parent) {
		this(name, x, y, new ItemStack(icon), parent);
	}

	public AchievementMod(String name, int x, int y, Block icon, Achievement parent) {
		this(name, x, y, new ItemStack(icon), parent);
	}
}
