package com.github.wiadufachen.mobkillers;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.RenderCreeper;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.util.ResourceLocation;

/**
 * Created by win7 on 2014-05-05.
 */
@SideOnly(Side.CLIENT)
public class RenderCreeperKiller extends RenderCreeper {
    private static final ResourceLocation creeperTextures = new ResourceLocation("mobkillers:textures/entity/creeper/creeper.png");

    protected ResourceLocation getEntityTexture(EntityCreeper par1EntityCreeper) {
        return creeperTextures;
    }
}
