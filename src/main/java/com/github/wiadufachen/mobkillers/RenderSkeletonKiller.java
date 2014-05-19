package com.github.wiadufachen.mobkillers;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.RenderSkeleton;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.util.ResourceLocation;

/**
 * Created by win7 on 2014-05-06.
 */
@SideOnly(Side.CLIENT)
public class RenderSkeletonKiller extends RenderSkeleton {
    private static final ResourceLocation skeletonTextures = new ResourceLocation("mobkillers:textures/entity/skeleton/skeleton.png");
    private static final ResourceLocation witherSkeletonTextures = new ResourceLocation("mobkillers:textures/entity/skeleton/wither_skeleton.png");

    protected ResourceLocation getEntityTexture(EntitySkeleton par1EntitySkeleton) {
        return par1EntitySkeleton.getSkeletonType() == 1 ? witherSkeletonTextures : skeletonTextures;
    }
}
