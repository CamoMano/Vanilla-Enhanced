package com.vanillaenhanced;

import com.vanillaenhanced.config.ModConfig;
import com.vanillaenhanced.materials.items.ArmorMaterialEmerald;
import com.vanillaenhanced.materials.items.ArmorMaterialObsidian;
import com.vanillaenhanced.materials.items.ArmorMaterialSteel;
import com.vanillaenhanced.registry.ModRegistry;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class VanillaEnhanced implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "vanillaenhanced";
    public static final String MOD_NAME = "VanillaEnhanced";
    public static final ArmorMaterial OBSIDIAN_ARMOR = new ArmorMaterialObsidian();
    public static final ArmorMaterial EMERALD_ARMOR = new ArmorMaterialEmerald();
    public static final ArmorMaterial STEEL_ARMOR = new ArmorMaterialSteel();
    public static final Item STEEL_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Block STEEL_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).build());

    @Override
    public void onInitialize() {
        log(Level.INFO, "Hello there.");

        //Config
        AutoConfig.register(ModConfig.class, GsonConfigSerializer::new);
        ModConfig config = AutoConfig.getConfigHolder(ModConfig.class).getConfig();

        if (config.enableobsidiangear == true) {
            ModRegistry.obsidian();
        }else {
            LOGGER.info("[" + MOD_NAME + "] " + "Obsidian Gear Disabled");
        }

        if (config.enableemeraldgear == true) {
            ModRegistry.emerald();
        } else{
            LOGGER.info("[" + MOD_NAME + "] " + "Emerald Gear Disabled");
    }

        if (config.enablesteelgear == true) {
            ModRegistry.steel();
        } else{
            LOGGER.info("[" + MOD_NAME + "] " + "Steel Gear Disabled");
        }

    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

}