package com.github.wiadufachen.mobkillers;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.RenderWither;

/**
 * Created by win7 on 2014-05-05.
 */
@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {
    @Override
    public void registerRenderThings() {
        RenderingRegistry.registerEntityRenderingHandler(EntityCreeperKiller.class, new RenderCreeperKiller());
        RenderingRegistry.registerEntityRenderingHandler(EntitySkeletonKiller.class, new RenderSkeletonKiller());
        RenderingRegistry.registerEntityRenderingHandler(EntityWitchKiller.class, new RenderWitchKiller());
    }

}
