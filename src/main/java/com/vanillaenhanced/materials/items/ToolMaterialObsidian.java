package com.vanillaenhanced.materials.items;

import com.vanillaenhanced.registry.ModInit;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialObsidian implements ToolMaterial {
    @Override
    public int getDurability() {
        return 1820;
    }

    @Override
    public float getAttackDamage() {
        return 5.0F;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 9;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModInit.OBSIDIAN_ALLOY_INGOT);
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 7.0F;
    }
}
