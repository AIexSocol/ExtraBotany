package com.meteor.extrabotany.common.item;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.meteor.extrabotany.common.item.basic.ItemBox;
import com.meteor.extrabotany.common.item.basic.ItemBullet;
import com.meteor.extrabotany.common.item.basic.ItemMaterial;
import com.meteor.extrabotany.common.item.basic.ItemNightmarefuel;
import com.meteor.extrabotany.common.item.basic.ItemRecordA;
import com.meteor.extrabotany.common.item.basic.ItemRecordB;
import com.meteor.extrabotany.common.item.basic.ItemRecordC;
import com.meteor.extrabotany.common.item.equipment.ItemBaubleDog;
import com.meteor.extrabotany.common.item.equipment.ItemGaiaWise;
import com.meteor.extrabotany.common.item.relic.ItemGunPhoenixBlaster;
import com.meteor.extrabotany.common.item.relic.ItemGunSnowballCannon;
import com.meteor.extrabotany.common.item.relic.ItemGunTacticalShotgun;
import com.meteor.extrabotany.common.item.relic.ItemVHandgun;
import com.meteor.extrabotany.common.item.relic.ItemVPowerBattleaxe;
import com.meteor.extrabotany.common.item.relic.legendary.ItemAphroditeGrace;
import com.meteor.extrabotany.common.item.relic.legendary.ItemAthenaBless;
import com.meteor.extrabotany.common.item.relic.legendary.ItemCronusPhantom;
import com.meteor.extrabotany.common.item.relic.legendary.ItemCthulhuEye;
import com.meteor.extrabotany.common.item.relic.legendary.ItemDice20;
import com.meteor.extrabotany.common.item.relic.legendary.ItemEternalSlience;
import com.meteor.extrabotany.common.item.relic.legendary.ItemExcaliber;
import com.meteor.extrabotany.common.item.relic.legendary.ItemExcaliberFake;
import com.meteor.extrabotany.common.item.relic.legendary.ItemHermesTravelClothing;
import com.meteor.extrabotany.common.item.relic.legendary.ItemHermesWand;
import com.meteor.extrabotany.common.item.relic.legendary.ItemHestiaChastity;
import com.meteor.extrabotany.common.item.relic.legendary.ItemLokiGhostrick;
import com.meteor.extrabotany.common.item.relic.legendary.ItemMaxwellDemon;
import com.meteor.extrabotany.common.item.relic.legendary.ItemOlympusGuard;
import com.meteor.extrabotany.common.item.relic.legendary.ItemTheseusShip;
import com.meteor.extrabotany.common.item.relic.legendary.ItemVRangerBoots;
import com.meteor.extrabotany.common.item.relic.legendary.ItemValkyrieCombatUniform;
import com.meteor.extrabotany.common.item.weapon.ItemGunBoomstick;
import com.meteor.extrabotany.common.item.weapon.ItemGunFlintlock;
import com.meteor.extrabotany.common.item.weapon.ItemGunPistol;
import com.meteor.extrabotany.common.item.weapon.ItemGunShotgun;
import com.meteor.extrabotany.common.item.weapon.ItemScissorBladePurple;
import com.meteor.extrabotany.common.item.weapon.ItemScissorBladeRed;
import com.meteor.extrabotany.common.lib.LibEntityName;
import com.meteor.extrabotany.common.lib.LibItemName;
import com.meteor.extrabotany.common.lib.LibOreDictName;

import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
	public static Item pill;
	
	public static Item manapotato;
	public static Item gaiatablet;
	public static Item dice20;
	public static Item excaliber;
	public static Item excaliberfake;
	public static Item vpowerbattleaxe;
	public static Item vhandgun;
	public static Item vrangerboots;
	public static Item lycorisgreen;
	public static Item lycorispurple;
	public static Item lycorisred;
	public static Item lycorisrandom;
	public static Item hestiachastity;
	public static Item maxwelldemon;
	public static Item athenabless;
	public static Item lokighostrick;
	public static Item aphroditegrace;
	public static Item cronusphantom;
	public static Item hermestravelclothing;
	public static Item cthulhueye;
	public static Item teleportpearl;
	public static Item gaianecklacebroken;
	public static Item olympusguard;
	public static Item dog;
	public static Item hermeswand;
	public static Item theseusship;
	public static Item eternalslience;
	public static Item valkyriecombatuniform;
	
	public static Item gaiawise;
	public static Item angelwand;
	public static Item heliacalclaymore;
	
	public static Item itemtest;
	public static Item material;
	public static Item bullet;
	public static Item dungeonbox;
	public static Item boxs;
	
	public static Item scissorred;
	public static Item scissorpurple;
	
	public static Item gunphoenixblaster;
	public static Item guntacticalshotgun;
	public static Item snowballlauncher;
	public static Item gunboomstick;
	public static Item gunflintlock;
	public static Item gunshotgun;
	public static Item gunpistol;
	public static Item recordB;
	public static Item recordA;
	public static Item recordC;
	
	public static Item nightmarefuel;
	public static Item darksword;
	
	public static Item key;
	
	public static void init() {
		registerFuel();
		recordA = new ItemRecordA("A", LibItemName.RECORD_A);
		recordB = new ItemRecordB("B", LibItemName.RECORD_B);
		recordC = new ItemRecordC("C", LibItemName.RECORD_C);
		
		nightmarefuel = new ItemNightmarefuel();
		darksword = new ItemDarksword();
		
		itemtest = new ItemTest("test");
		
		dungeonbox = new ItemDungeonBox(LibItemName.DUNGEONBOX);
		boxs = new ItemBox(LibItemName.BOX);
		pill = new ItemPill(0,0,false,LibItemName.PILL);
		
		scissorred = new ItemScissorBladeRed(ToolMaterial.WOOD, LibItemName.SCISSORBLADERED);
		scissorpurple = new ItemScissorBladePurple(ToolMaterial.WOOD, LibItemName.SCISSORBLADEPURPLE);
		gunphoenixblaster = new ItemGunPhoenixBlaster(LibItemName.PHOENIXBLASTER);
		guntacticalshotgun = new ItemGunTacticalShotgun(LibItemName.TACTICALSHOTGUN);
		snowballlauncher = new ItemGunSnowballCannon(LibItemName.SNOWBALLLAUNCHER);
		gunboomstick = new ItemGunBoomstick(LibItemName.BOOMSTICK);
		gunflintlock = new ItemGunFlintlock(LibItemName.FLINTLOCK);
		gunshotgun = new ItemGunShotgun(LibItemName.SHOTGUN);
		gunpistol = new ItemGunPistol(LibItemName.PISTOL);

		material = new ItemMaterial(LibItemName.MATERIAL);
		bullet = new ItemBullet(LibItemName.BULLET);
				
		heliacalclaymore = new ItemHeliacalClaymore();
		dog = new ItemBaubleDog();
		gaiawise = new ItemGaiaWise(LibItemName.GAIAWISE);
		angelwand = new ItemAngelWand(LibItemName.ANGELWAND);
		
		lokighostrick = new ItemLokiGhostrick(LibItemName.LOKIGHOSTRICK);
		cthulhueye = new ItemCthulhuEye();
		cronusphantom = new ItemCronusPhantom(LibItemName.CRONUSPHANTOM);
		athenabless = new ItemAthenaBless();
		maxwelldemon = new ItemMaxwellDemon();
		excaliber = new ItemExcaliber();
		excaliberfake = new ItemExcaliberFake();
		vpowerbattleaxe = new ItemVPowerBattleaxe();
		vhandgun = new ItemVHandgun();
		vrangerboots = new ItemVRangerBoots(3, LibItemName.VRANGERBOOTS);
		dice20 = new ItemDice20();
		hestiachastity = new ItemHestiaChastity(0, LibItemName.HESTIACHASTITY);
		aphroditegrace = new ItemAphroditeGrace(2, LibItemName.APHRODITEGRACE);
		olympusguard = new ItemOlympusGuard(LibItemName.OLYMPUSGUARD);
		hermestravelclothing = new ItemHermesTravelClothing(1, LibItemName.HERMESTRAVELCLOTHING);
		hermeswand = new ItemHermesWand(LibItemName.HERMESWAND);
		theseusship = new ItemTheseusShip(LibItemName.THESEUSSHIP);
		eternalslience = new ItemEternalSlience(LibItemName.ETERNALSLIENCE);
		valkyriecombatuniform = new ItemValkyrieCombatUniform(LibItemName.VALKYRIECOMBATUNIFORM);
		
		manapotato = new ItemManaPotato(LibItemName.MANAPOTATO);
		gaiatablet = new ItemGaiaTablet();
		teleportpearl = new ItemTeleportPearl(LibItemName.TELEPORTPEARL);
		
		lycorisgreen = new ItemSpawnCardLycorisGreen(LibEntityName.LYCORISGREEN);
		lycorisred = new ItemSpawnCardLycorisRed(LibEntityName.LYCORISRED);
		lycorispurple = new ItemSpawnCardLycorisPurple(LibEntityName.LYCORISPURPLE);
		lycorisrandom = new ItemSpawnCardLycorisRandom("lycorisrandom");
		
		key = new ItemMods("key");
		
		//OreDict
		OreDictionary.registerOre(LibOreDictName.DOG, new ItemStack(dog, 1, 0));
		OreDictionary.registerOre(LibOreDictName.DOG, new ItemStack(dog, 1, 1));
		OreDictionary.registerOre(LibOreDictName.DOG, new ItemStack(dog, 1, 2));
		OreDictionary.registerOre(LibOreDictName.DOG, new ItemStack(dog, 1, 3));
		OreDictionary.registerOre(LibOreDictName.PRISMATIC_SHARD, new ItemStack(material, 1, 0));
		OreDictionary.registerOre(LibOreDictName.BLANK_CARD, new ItemStack(material, 1, 1));
		OreDictionary.registerOre(LibOreDictName.GAIA_ESSENCE, new ItemStack(material, 1, 2));
		OreDictionary.registerOre(LibOreDictName.ASTRAL_FORCE, new ItemStack(material, 1, 3));
		OreDictionary.registerOre(LibOreDictName.LYCORIS_RED, new ItemStack(material, 1, 4));
		OreDictionary.registerOre(LibOreDictName.LYCORIS_GREEN, new ItemStack(material, 1, 5));
		OreDictionary.registerOre(LibOreDictName.LYCORIS_PURPLE, new ItemStack(material, 1, 6));
		OreDictionary.registerOre(LibOreDictName.QUARTZ_GAIA, new ItemStack(material, 1, 7));
		OreDictionary.registerOre(LibOreDictName.QUARTZ_ELEMENTIUM, new ItemStack(material, 1, 8));
		OreDictionary.registerOre(LibOreDictName.STRING_GOLD, new ItemStack(material, 1, 9));
		OreDictionary.registerOre(LibOreDictName.DICE_EMPTY, new ItemStack(material, 1, 10));
	}
	
	private static void registerFuel()
	{
	    GameRegistry.registerFuelHandler(new IFuelHandler()
	    {
	        @Override
	        public int getBurnTime(ItemStack fuel)
	        {
	            return nightmarefuel != fuel.getItem() ? 0 : 40000;
	        }
	    });
	}

}
