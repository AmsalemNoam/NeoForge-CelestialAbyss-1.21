package net.penguinplay.celestialabyss.datagen;

import net.penguinplay.celestialabyss.CelestialAbyss;
import net.penguinplay.celestialabyss.block.ModBlocks;
import net.penguinplay.celestialabyss.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

/*IF the output item is the same for two recipes add this  example command:
    .save(recipeOutput, "celestialabyss:lumenite_block_from_lumenite");
    so the recipe name will save as sth else and work
 */
    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        List<ItemLike> LUMENITE_SMELTABLES = List.of(ModItems.RAW_LUMENITE,ModBlocks.LUMENITE_ORE);
        List<ItemLike> DARKITE_SMELTABLES = List.of(ModItems.RAW_DARKITE,ModBlocks.DARKITE_ORE);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LUMENITE_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.LUMENITE.get())
                .unlockedBy("has_lumenite", has(ModItems.LUMENITE)).save(recipeOutput);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LUMENITE.get(), 9)
                .requires(ModBlocks.LUMENITE_BLOCK)
                .unlockedBy("has_lumenite_block", has(ModBlocks.LUMENITE_BLOCK)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DARKITE_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.DARKITE.get())
                .unlockedBy("has_darkite", has(ModItems.DARKITE)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.DARKITE.get(), 9)
                .requires(ModBlocks.DARKITE_BLOCK)
                .unlockedBy("has_darkite_block", has(ModBlocks.DARKITE_BLOCK)).save(recipeOutput);

        oreSmelting(recipeOutput, LUMENITE_SMELTABLES, RecipeCategory.MISC, ModItems.LUMENITE.get(), 4,400,"lumenite");
        oreBlasting(recipeOutput, LUMENITE_SMELTABLES, RecipeCategory.MISC, ModItems.LUMENITE.get(), 4,200,"lumenite");

        oreSmelting(recipeOutput, DARKITE_SMELTABLES, RecipeCategory.MISC, ModItems.DARKITE.get(), 4,400,"darkite");
        oreBlasting(recipeOutput, DARKITE_SMELTABLES, RecipeCategory.MISC, ModItems.DARKITE.get(), 4,200,"darkite");

    }


    /*Helper Methods for blasting/smelting/cooking*/
    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for (ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, CelestialAbyss.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
