package com.github.wiadufachen.mobkillers;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * Created by win7 on 2014-05-08.
 */
public class EntityWitchKiller extends EntityWitch {
    public EntityWitchKiller(World par1World)
    {
        super(par1World);
        this.tasks.taskEntries.clear();
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIArrowAttack(this, 1.0D, 60, 10.0F));
        // this.tasks.addTask(2, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(3, new EntityAIWatchClosest(this, IMob.class, 8.0F));
        this.tasks.addTask(3, new EntityAILookIdle(this));
        this.targetTasks.taskEntries.clear();
        // this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new MyEntityAINearestAttackableTarget(this, Entity.class, 0, true, false, null));
    }

    protected boolean canDespawn() {
        return false;
    }
}
