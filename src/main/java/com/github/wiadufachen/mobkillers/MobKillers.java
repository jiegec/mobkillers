package com.github.wiadufachen.mobkillers;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;

@Mod(modid = MobKillers.MODID, version = MobKillers.VERSION)
public class MobKillers {
    public static final String MODID = "mobkillers";
    public static final String VERSION = "@MOD_VERSION";

    @SidedProxy(clientSide = "com.github.wiadufachen.mobkillers.ClientProxy", serverSide =
                "com.github.wiadufachen.mobkillers.CommonProxy")
                public static CommonProxy proxy;

    @EventHandler
    public void init(FMLInitializationEvent event) {
        int max = 255 << 16 + 255 << 8 + 255;
        EntityRegistry.registerGlobalEntityID(EntityCreeperKiller.class, "CreeperKiller", EntityRegistry.findGlobalUniqueEntityId(), max - 894731, max - 0);
        EntityRegistry.registerGlobalEntityID(EntitySkeletonKiller.class, "SkeletonKiller", EntityRegistry.findGlobalUniqueEntityId(), max - 12698049, max - 4802889);
        EntityRegistry.registerGlobalEntityID(EntityWitchKiller.class, "WitchKiller", EntityRegistry.findGlobalUniqueEntityId(), max - 3407872 , max - 5349438);
        // EntityRegistry.addSpawn(EntityCreeperKiller.class,100,4,4, EnumCreatureType.monster);
        // EntityRegistry.addSpawn(EntitySkeletonKiller.class,100,4,4, EnumCreatureType.monster);
        // EntityRegistry.addSpawn(EntityWitchKiller.class,5,1,1, EnumCreatureType.monster);
        //LanguageRegistry.instance().addStringLocalization("entity.EmptyhandedMiner.name", "en_US", "Empty-handed Miner");
        proxy.registerRenderThings();
    }
}
