package com.github.wiadufachen.mobkillers;

import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.IMob;
import net.minecraft.world.World;

/**
 * Created by win7 on 2014-05-06.
 */
public class EntitySkeletonKiller extends EntitySkeleton {
    public EntitySkeletonKiller(World world) {
        super(world);
        this.isImmuneToFire = true;
        this.tasks.taskEntries.clear();
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIRestrictSun(this));
        this.tasks.addTask(3, new EntityAIFleeSun(this, 1.0D));
        //this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, IMob.class, 8.0F));
        this.tasks.addTask(6, new EntityAILookIdle(this));
        this.targetTasks.taskEntries.clear();
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new MyEntityAINearestAttackableTarget(this, IMob.class, 0, true, false, null));

        if (world != null && !world.isRemote) {
            this.setCombatTask();
        }
    }
}
