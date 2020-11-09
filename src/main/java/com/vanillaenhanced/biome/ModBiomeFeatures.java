package com.vanillaenhanced.biome;

import com.vanillaenhanced.world.Features;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.ConfiguredStructureFeatures;
import net.minecraft.world.gen.feature.Feature;

public class ModBiomeFeatures {
    public static void addWolves(net.minecraft.world.biome.SpawnSettings.Builder builder) {
        builder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.WOLF, 8, 4, 4));
    }
    public static void addTaigaMobs(net.minecraft.world.biome.SpawnSettings.Builder builder) {
        builder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.WOLF, 8, 4, 4));
        builder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.FOX, 8, 2, 4));
    }
    public static void addFrozenDesertMobs(net.minecraft.world.biome.SpawnSettings.Builder builder) {
        builder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.RABBIT, 6, 2, 3));
        builder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.STRAY, 80, 4, 4));
        builder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.HUSK, 80, 4, 4));

    }
    public static void addMountainMobs(net.minecraft.world.biome.SpawnSettings.Builder builder) {
        builder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.LLAMA, 5, 4, 6));
    }
    public static void addRedwoodTrees(GenerationSettings.Builder builder) {
        builder.feature(GenerationStep.Feature.SURFACE_STRUCTURES, Feature.TREE.configure(Features.REDWOOD_TREE_FEATURE.config));

    }
    public static void addJungleMobsExtra(net.minecraft.world.biome.SpawnSettings.Builder builder) {
        builder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.OCELOT, 2, 1, 3));
        builder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.PARROT, 40, 1, 2));
    }
    public static void addDefaultPortal(GenerationSettings.Builder builder){
        builder.structureFeature(ConfiguredStructureFeatures.RUINED_PORTAL);
    }
    public static void addJunglePortal(GenerationSettings.Builder builder){
        builder.structureFeature(ConfiguredStructureFeatures.RUINED_PORTAL_JUNGLE);
    }
    public static void addDesertPortal(GenerationSettings.Builder builder){
        builder.structureFeature(ConfiguredStructureFeatures.RUINED_PORTAL_DESERT);
    }
    public static void addMountainPortal(GenerationSettings.Builder builder){
        builder.structureFeature(ConfiguredStructureFeatures.RUINED_PORTAL_MOUNTAIN);
    }
    public static void addDesertVillage(GenerationSettings.Builder builder){
        builder.structureFeature(ConfiguredStructureFeatures.VILLAGE_DESERT);
    }
    public static void addMegaSpruce(GenerationSettings.Builder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, ConfiguredFeatures.TREES_GIANT_SPRUCE);

    }
}