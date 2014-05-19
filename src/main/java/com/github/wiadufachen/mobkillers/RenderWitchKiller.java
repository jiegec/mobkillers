package com.github.wiadufachen.mobkillers;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.RenderWitch;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.util.ResourceLocation;

/**
 * Created by win7 on 2014-05-08.
 */
@SideOnly(Side.CLIENT)
public class RenderWitchKiller extends RenderWitch{
    private static final ResourceLocation witchTextures = new ResourceLocation("mobkillers:textures/entity/witch.png");
    protected ResourceLocation getEntityTexture(EntityWitch par1Entity)
    {
        return witchTextures;
    }
}
