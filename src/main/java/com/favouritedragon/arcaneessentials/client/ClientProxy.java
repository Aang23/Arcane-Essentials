package com.favouritedragon.arcaneessentials.client;

import com.favouritedragon.arcaneessentials.client.render.*;
import com.favouritedragon.arcaneessentials.common.entity.*;
import com.favouritedragon.arcaneessentials.proxy.IProxy;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy implements IProxy {
	@Override
	public void preInit(FMLPreInitializationEvent event) {

	}

	@Override
	public void Init(FMLInitializationEvent event) {

	}

	@Override
	public void postInit(FMLInitializationEvent event) {

	}

	@Override
	public void registerRender() {
		RenderingRegistry.registerEntityRenderingHandler(EntityCycloneBolt.class, RenderCycloneBolt::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityCycloneShield.class, RenderCycloneShield::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityFlamePillar.class, RenderFirePillar::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityFlamePillarSpawner.class, RenderFirePillarSpawner::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityLightningVortex.class, RenderLightningVortex::new);
		RenderingRegistry.registerEntityRenderingHandler(EntitySolarBeam.class, RenderSolarBeam::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityThunderBurst.class, RenderThunderBurst::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityWhirlpool.class, RenderWhirlpool::new);

	}


}
