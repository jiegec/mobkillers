package com.github.wiadufachen.mobkillers;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.world.World;

/**
 * Created by win7 on 2014-05-05.
 */
public class EntityCreeperKiller extends EntityCreeper {
        public EntityCreeperKiller(World par1World) {
                super(par1World);
                this.tasks.taskEntries.clear();
                this.tasks.addTask(1, new EntityAISwimming(this));
                this.tasks.addTask(2, new EntityAICreeperSwell(this));
                this.tasks.addTask(3, new EntityAIAvoidEntity(this, EntityOcelot.class, 6.0F, 1.0D, 1.2D));
                this.tasks.addTask(4, new EntityAIAttackOnCollide(this, 1.0D, false));
                // this.tasks.addTask(5, new EntityAIWander(this, 0.8D));
                this.tasks.addTask(6, new EntityAIWatchClosest(this, IMob.class, 8.0F));
                this.tasks.addTask(6, new EntityAILookIdle(this));
                this.targetTasks.taskEntries.clear();
                this.targetTasks.addTask(1, new MyEntityAINearestAttackableTarget(this, Entity.class, 0, true, false, null));
                // this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, false));
        }

        protected boolean canDespawn() {
                return false;
        }
}
