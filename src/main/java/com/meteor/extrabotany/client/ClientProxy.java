package com.meteor.extrabotany.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.init.Items;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;

import com.meteor.extrabotany.api.hugetools.HugeItemIcon;
import com.meteor.extrabotany.api.hugetools.HugeItemRenderer;
import com.meteor.extrabotany.client.render.RenderShield;
import com.meteor.extrabotany.client.render.entity.RenderLycorisradiataGreen;
import com.meteor.extrabotany.client.render.entity.RenderLycorisradiataPurple;
import com.meteor.extrabotany.client.render.entity.RenderLycorisradiataRed;
import com.meteor.extrabotany.client.render.entity.RenderSpear;
import com.meteor.extrabotany.client.render.entity.RenderTeleportPearl;
import com.meteor.extrabotany.client.render.tile.RenderTileRelicPlate;
import com.meteor.extrabotany.common.CommonProxy;
import com.meteor.extrabotany.common.block.tile.TileRelicPlate;
import com.meteor.extrabotany.common.entity.EntityItemUnbreakable;
import com.meteor.extrabotany.common.entity.EntityLycorisradiataGreen;
import com.meteor.extrabotany.common.entity.EntityLycorisradiataPurple;
import com.meteor.extrabotany.common.entity.EntityLycorisradiataRed;
import com.meteor.extrabotany.common.entity.EntitySpear;
import com.meteor.extrabotany.common.entity.EntityTeleportPearl;
import com.meteor.extrabotany.common.entity.bullet.EntityBulletExploding;
import com.meteor.extrabotany.common.entity.bullet.EntityBulletGold;
import com.meteor.extrabotany.common.entity.bullet.EntityBulletHighVelocity;
import com.meteor.extrabotany.common.entity.bullet.EntityBulletMeteor;
import com.meteor.extrabotany.common.entity.bullet.EntityBulletMusket;
import com.meteor.extrabotany.common.entity.bullet.EntityBulletSilver;
import com.meteor.extrabotany.common.entity.bullet.EntityBulletSnowball;
import com.meteor.extrabotany.common.integration.hugetools.ItemRender;
import com.meteor.extrabotany.common.item.ModItems;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
	}
	
	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		initRenderers();
		ItemRender.initHugeItemRender();
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}
	
	private void initRenderers() {
		MinecraftForge.EVENT_BUS.register(new RenderShield());
	    FMLCommonHandler.instance().bus().register(new RenderShield());	
		ClientRegistry.bindTileEntitySpecialRenderer(TileRelicPlate.class, new RenderTileRelicPlate());
		
		RenderingRegistry.registerEntityRenderingHandler(EntityItemUnbreakable.class, new RenderItem());
		
		RenderingRegistry.registerEntityRenderingHandler(EntityBulletExploding.class, new RenderSnowball(ModItems.itemtest));
		RenderingRegistry.registerEntityRenderingHandler(EntityBulletGold.class, new RenderSnowball(ModItems.itemtest));
		RenderingRegistry.registerEntityRenderingHandler(EntityBulletHighVelocity.class, new RenderSnowball(ModItems.itemtest));
		RenderingRegistry.registerEntityRenderingHandler(EntityBulletMeteor.class, new RenderSnowball(ModItems.itemtest));
		RenderingRegistry.registerEntityRenderingHandler(EntityBulletSilver.class, new RenderSnowball(ModItems.itemtest));
		RenderingRegistry.registerEntityRenderingHandler(EntityBulletMusket.class, new RenderSnowball(ModItems.itemtest));
		
		RenderingRegistry.registerEntityRenderingHandler(EntitySpear.class, new RenderSpear());
		RenderingRegistry.registerEntityRenderingHandler(EntityBulletSnowball.class, new RenderSnowball(Items.snowball));
		RenderingRegistry.registerEntityRenderingHandler(EntityLycorisradiataRed.class, new RenderLycorisradiataRed());
		RenderingRegistry.registerEntityRenderingHandler(EntityLycorisradiataGreen.class, new RenderLycorisradiataGreen());
		RenderingRegistry.registerEntityRenderingHandler(EntityLycorisradiataPurple.class, new RenderLycorisradiataPurple());
		RenderingRegistry.registerEntityRenderingHandler(EntityTeleportPearl.class, new RenderTeleportPearl(1.0F));
	}

}
