package com.vanillaenhanced.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.WallBlock;

public class WallBase extends WallBlock {
    public WallBase(String name, AbstractBlock copy) {
        super(FabricBlockSettings.copy(copy));

    }
}
