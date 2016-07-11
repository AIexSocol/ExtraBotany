package com.meteor.extrabotany.common.core.handler;

import java.io.File;

import net.minecraft.util.StatCollector;
import net.minecraftforge.common.config.Configuration;

import com.meteor.extrabotany.common.lib.LibReference;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ConfigHandler {
	private static Configuration config;
	
	public static int efficiencySunshinelily;
	public static int efficiencyMoonlightlily;
	public static int efficiencyBlueenchantress;
	public static int efficiencyCandyflower;
	public static int efficiencyGeminiorchid;
	public static int efficiencyOminiviolet;
	public static int efficiencyPyschobloom;
	public static int efficiencyStonesia;
	public static int efficiencyBellflower;
	
	public static int pyschobloomMax;
	
	public static int enchGaiaBlessing;
	public static int enchDivineFavor;
	public static int enchDivineMark;
	
	public static int idPotionFPS;
	public static int idPotionSPS;
	public static int idPotionRP;
	public static int idPotionC;
	public static int idPotionD;
	
	public static int extraShieldAmount;
	public static int shieldDisplayX;
	public static int shieldDisplayY;
	
	public static boolean disableShieldDisplay;
	public static boolean disableShieldRender;
	public static boolean disableEasterEgg;
	public static boolean enableDiplopbamboo;
	public static boolean enableGuns;	
	public static boolean anotherShieldRender;

	public ConfigHandler(FMLPreInitializationEvent event){
		config = new Configuration(new File(new File(event.getModConfigurationDirectory(), "extrameteorp"), LibReference.MOD_NAME+".cfg"));
	    config.load();
	    registerConfig();
	    config.save();
	}

	private static void registerConfig(){		
		idPotionFPS = config.get(LibReference.CATEGORY_ID, "potionFPS", 100, StatCollector.translateToLocal(LibReference.PREFIX_CONFIG + "potion.desc")).getInt();
		idPotionSPS = config.get(LibReference.CATEGORY_ID, "potionSPS", 101, StatCollector.translateToLocal(LibReference.PREFIX_CONFIG + "potion.desc")).getInt();
		idPotionRP = config.get(LibReference.CATEGORY_ID, "potionRP", 102, StatCollector.translateToLocal(LibReference.PREFIX_CONFIG + "potion.desc")).getInt();
		idPotionC = config.get(LibReference.CATEGORY_ID, "potionC", 103, StatCollector.translateToLocal(LibReference.PREFIX_CONFIG + "potion.desc")).getInt();
		idPotionD = config.get(LibReference.CATEGORY_ID, "potionD", 104, StatCollector.translateToLocal(LibReference.PREFIX_CONFIG + "potion.desc")).getInt();
		
		
		enchGaiaBlessing = config.get(LibReference.CATEGORY_ID, "enchGaiaBlessing", 203, StatCollector.translateToLocal(LibReference.PREFIX_CONFIG + "ench.desc")).getInt();
		enchDivineFavor = config.get(LibReference.CATEGORY_ID, "enchDivineFavor", 204, StatCollector.translateToLocal(LibReference.PREFIX_CONFIG + "ench.desc")).getInt();
		enchDivineMark = config.get(LibReference.CATEGORY_ID, "enchDivineMark", 205, StatCollector.translateToLocal(LibReference.PREFIX_CONFIG + "ench.desc")).getInt();
		
		extraShieldAmount = config.get(LibReference.CATEGORY_COMMON, "extraShieldAmount", 0, StatCollector.translateToLocal(LibReference.PREFIX_CONFIG + "extraShieldAmount.desc")).getInt();
		
		efficiencySunshinelily = config.get(LibReference.CATEGORY_COMMON, "efficiencySunshinelily", 3, StatCollector.translateToLocal(LibReference.PREFIX_CONFIG + "efficiencySunshinelily.desc")).getInt();
		efficiencyMoonlightlily = config.get(LibReference.CATEGORY_COMMON, "efficiencyMoonlightlily", 3, StatCollector.translateToLocal(LibReference.PREFIX_CONFIG + "efficiencyMoonlightlily.desc")).getInt();
		efficiencyBlueenchantress = config.get(LibReference.CATEGORY_COMMON, "efficiencyBlueenchantress", 100, StatCollector.translateToLocal(LibReference.PREFIX_CONFIG + "efficiencyBlueenchantress.desc")).getInt();
		efficiencyCandyflower = config.get(LibReference.CATEGORY_COMMON, "efficiencyCandyflower", 8, StatCollector.translateToLocal(LibReference.PREFIX_CONFIG + "efficiencyCandyflower.desc")).getInt();
		efficiencyGeminiorchid = config.get(LibReference.CATEGORY_COMMON, "efficiencyGeminiorchid", 4, StatCollector.translateToLocal(LibReference.PREFIX_CONFIG + "efficiencyGeminiorchid.desc")).getInt();
		efficiencyOminiviolet = config.get(LibReference.CATEGORY_COMMON, "efficiencyOminiviolet", 20, StatCollector.translateToLocal(LibReference.PREFIX_CONFIG + "efficiencyOminiviolet.desc")).getInt();
		efficiencyStonesia = config.get(LibReference.CATEGORY_COMMON, "efficiencyStonesia", 8, StatCollector.translateToLocal(LibReference.PREFIX_CONFIG + "efficiencyStonesia.desc")).getInt();
		efficiencyPyschobloom = config.get(LibReference.CATEGORY_COMMON, "efficiencyPyschobloom", 3, StatCollector.translateToLocal(LibReference.PREFIX_CONFIG + "efficiencyPyschobloom.desc")).getInt();
		efficiencyBellflower = config.get(LibReference.CATEGORY_COMMON, "efficiencyBellflower", 6, StatCollector.translateToLocal(LibReference.PREFIX_CONFIG + "efficiencyBellflower.desc")).getInt();
		
		pyschobloomMax = config.get(LibReference.CATEGORY_COMMON, "pyschobloomMax", 9, StatCollector.translateToLocal(LibReference.PREFIX_CONFIG + "pyschobloomMax.desc")).getInt();
		
		shieldDisplayX = config.get(LibReference.CATEGORY_CLIENT, "shieldDisplayX", 0, StatCollector.translateToLocal(LibReference.PREFIX_CONFIG + "shieldDisplayX.desc")).getInt();
		shieldDisplayY = config.get(LibReference.CATEGORY_CLIENT, "shieldDisplayY", 0, StatCollector.translateToLocal(LibReference.PREFIX_CONFIG + "shieldDisplayY.desc")).getInt();
		
		disableShieldDisplay = config.get(LibReference.CATEGORY_CLIENT, "disableShieldDisplay", false, StatCollector.translateToLocal(LibReference.PREFIX_CONFIG + "disableShieldDisplay.desc")).getBoolean();
		disableShieldRender = config.get(LibReference.CATEGORY_CLIENT, "disableShieldRender", false, StatCollector.translateToLocal(LibReference.PREFIX_CONFIG + "disableShieldRender.desc")).getBoolean();
		disableEasterEgg = config.get(LibReference.CATEGORY_CLIENT, "disableShieldRender", false, StatCollector.translateToLocal(LibReference.PREFIX_CONFIG + "disableEasterEgg.desc")).getBoolean();
		enableDiplopbamboo = config.get(LibReference.CATEGORY_COMMON, "enableDiplopbamboo", false, StatCollector.translateToLocal(LibReference.PREFIX_CONFIG + "enableDiplopbamboo.desc")).getBoolean();
		enableGuns = config.get(LibReference.CATEGORY_COMMON, "enableGuns", false, StatCollector.translateToLocal(LibReference.PREFIX_CONFIG + "enableGuns.desc")).getBoolean();
		anotherShieldRender = config.get(LibReference.CATEGORY_CLIENT, "anotherShieldRender", false, StatCollector.translateToLocal(LibReference.PREFIX_CONFIG + "anotherShieldRender.desc")).getBoolean();
	}
}
