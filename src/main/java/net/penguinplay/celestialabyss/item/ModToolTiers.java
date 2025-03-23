package net.penguinplay.celestialabyss.item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.penguinplay.celestialabyss.util.ModTags;

public class ModToolTiers {
    public static final Tier LUMENITE = new SimpleTier
            (ModTags.Blocks.INCORRECT_LUMENITE_TOOL,
                    5076,14,6,15,
                    () -> Ingredient.of(ModItems.LUMENITE));

    public static final Tier DARKITE = new SimpleTier
            (ModTags.Blocks.INCORRECT_DARKITE_TOOL,
                    5076,14,6,15,
                    () -> Ingredient.of(ModItems.DARKITE));
}
