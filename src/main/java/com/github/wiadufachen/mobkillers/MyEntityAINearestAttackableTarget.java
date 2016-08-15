package com.github.wiadufachen.mobkillers;

import net.minecraft.command.IEntitySelector;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.monster.EntityGolem;

/**
 * Created by win7 on 2014-05-08.
 */
public class MyEntityAINearestAttackableTarget extends EntityAINearestAttackableTarget {
    public MyEntityAINearestAttackableTarget(EntityCreature par1EntityCreature, Class par2Class, int par3, boolean par4, boolean par5, final IEntitySelector par6IEntitySelector)
    {
        super(par1EntityCreature, par2Class, par3, par4, false);
    }

    protected boolean isSuitableTarget(EntityLivingBase var1, boolean par2) {
        if(var1 instanceof EntityPlayer) {
            return false;
        }
        if(var1 instanceof EntitySkeletonKiller) {
            return false;
        }
        if(var1 instanceof EntityCreeperKiller) {
            return false;
        }
        if(var1 instanceof EntityWitchKiller) {
            return false;
        }
        if (var1 instanceof EntityGolem) {
            return false;
        }
        if (var1 instanceof IMob) {
            return true;
        }
        return false;
    }
}
