/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.armorplus.api.crafting.ultitechbench.recipes;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.thedragonteam.armorplus.api.crafting.ultitechbench.UltiTechBenchCraftingManager;
import net.thedragonteam.armorplus.registry.ModItems;

public class ModItemRecipes {
    public void addRecipes(UltiTechBenchCraftingManager manager) {
        manager.addRecipe(new ItemStack(ModItems.itemEnderDragonArrow, 8),
                "  EEE",
                "   SE",
                "  S E",
                " S   ",
                "S    ",
                'E', Items.DRAGON_BREATH,
                'S', ModItems.enderDragonScale);
        manager.addRecipe(new ItemStack(ModItems.itemEnderDragonArrow, 8),
                "EEE  ",
                "ES   ",
                "E S  ",
                "   S ",
                "    S",
                'E', Items.DRAGON_BREATH,
                'S', ModItems.enderDragonScale);
    }
}
