package net.gs.alchemined.datagen;

import java.util.concurrent.CompletableFuture;

import net.gs.alchemined.block.ModBlocks;
import net.gs.alchemined.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;

public class ModRecipeProvider  extends RecipeProvider {
    public ModRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
        super(provider, recipeOutput);
    }

    @Override
    protected void buildRecipes() {

        //electrum block <- electrum
        shaped(RecipeCategory.MISC, ModBlocks.B_ELECTRUM_BLOCK.get())
            .pattern("BBB")
            .pattern("BBB")
            .pattern("BBB")
            .define('B', ModItems.I_ELECTRUM.get())
            .unlockedBy("has_electrum", has(ModItems.I_ELECTRUM))
            .save(output);
        //electrum <- electrum block
        shapeless(RecipeCategory.MISC, ModItems.I_ELECTRUM.get(), 9)
            .requires(ModBlocks.B_ELECTRUM_BLOCK)
            .unlockedBy("has_electrum_block", has(ModBlocks.B_ELECTRUM_BLOCK))
            .save(output);
        //silver block <- silver
        shaped(RecipeCategory.MISC, ModBlocks.B_SILVER_BLOCK.get())
            .pattern("BBB")
            .pattern("BBB")
            .pattern("BBB")
            .define('B', ModItems.I_SILVER.get())
            .unlockedBy("has_silver", has(ModItems.I_SILVER))
            .save(output);
        //silker <- silver block
        shapeless(RecipeCategory.MISC, ModItems.I_SILVER.get(), 9)
            .requires(ModBlocks.B_SILVER_BLOCK)
            .unlockedBy("has_silver_block", has(ModBlocks.B_SILVER_BLOCK))
            .save(output);
    }

    public static class Runner extends RecipeProvider.Runner {
        // Get the parameters from the `GatherDataEvent`s.
        public Runner(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
            super(output, lookupProvider);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput output) {
            return new ModRecipeProvider(provider, output);
        }

        @Override
        public String getName() {
            return "Alchemined Recipes";
        }
    }
}
