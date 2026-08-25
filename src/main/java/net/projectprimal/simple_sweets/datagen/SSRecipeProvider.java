package net.projectprimal.simple_sweets.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.projectprimal.simple_sweets.registries.SSItems;

import java.util.concurrent.CompletableFuture;

public class SSRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public SSRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, SSItems.WHITE_COTTON_CANDY.get())
                .requires(Items.SUGAR, 4)
                .requires(Items.STICK)
                .unlockedBy("has_sugar", has(Items.SUGAR))
                .save(recipeOutput, "simple_sweets:white_cotton_candy_sugar");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, SSItems.WHITE_COTTON_CANDY.get())
                .requires(Items.SUGAR, 2)
                .requires(Items.WHITE_DYE, 2)
                .requires(Items.STICK)
                .unlockedBy("has_sugar", has(Items.SUGAR))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, SSItems.ORANGE_COTTON_CANDY.get())
                .requires(Items.SUGAR, 2)
                .requires(Items.ORANGE_DYE, 2)
                .requires(Items.STICK)
                .unlockedBy("has_sugar", has(Items.SUGAR))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, SSItems.MAGENTA_COTTON_CANDY.get())
                .requires(Items.SUGAR, 2)
                .requires(Items.MAGENTA_DYE, 2)
                .requires(Items.STICK)
                .unlockedBy("has_sugar", has(Items.SUGAR))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, SSItems.LIGHT_BLUE_COTTON_CANDY.get())
                .requires(Items.SUGAR, 2)
                .requires(Items.LIGHT_BLUE_DYE, 2)
                .requires(Items.STICK)
                .unlockedBy("has_sugar", has(Items.SUGAR))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, SSItems.YELLOW_COTTON_CANDY.get())
                .requires(Items.SUGAR, 2)
                .requires(Items.YELLOW_DYE, 2)
                .requires(Items.STICK)
                .unlockedBy("has_sugar", has(Items.SUGAR))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, SSItems.LIME_COTTON_CANDY.get())
                .requires(Items.SUGAR, 2)
                .requires(Items.LIME_DYE, 2)
                .requires(Items.STICK)
                .unlockedBy("has_sugar", has(Items.SUGAR))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, SSItems.PINK_COTTON_CANDY.get())
                .requires(Items.SUGAR, 2)
                .requires(Items.PINK_DYE, 2)
                .requires(Items.STICK)
                .unlockedBy("has_sugar", has(Items.SUGAR))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, SSItems.GRAY_COTTON_CANDY.get())
                .requires(Items.SUGAR, 2)
                .requires(Items.GRAY_DYE, 2)
                .requires(Items.STICK)
                .unlockedBy("has_sugar", has(Items.SUGAR))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, SSItems.LIGHT_GRAY_COTTON_CANDY.get())
                .requires(Items.SUGAR, 2)
                .requires(Items.LIGHT_GRAY_DYE, 2)
                .requires(Items.STICK)
                .unlockedBy("has_sugar", has(Items.SUGAR))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, SSItems.CYAN_COTTON_CANDY.get())
                .requires(Items.SUGAR, 2)
                .requires(Items.CYAN_DYE, 2)
                .requires(Items.STICK)
                .unlockedBy("has_sugar", has(Items.SUGAR))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, SSItems.PURPLE_COTTON_CANDY.get())
                .requires(Items.SUGAR, 2)
                .requires(Items.PURPLE_DYE, 2)
                .requires(Items.STICK)
                .unlockedBy("has_sugar", has(Items.SUGAR))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, SSItems.BLUE_COTTON_CANDY.get())
                .requires(Items.SUGAR, 2)
                .requires(Items.BLUE_DYE, 2)
                .requires(Items.STICK)
                .unlockedBy("has_sugar", has(Items.SUGAR))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, SSItems.BROWN_COTTON_CANDY.get())
                .requires(Items.SUGAR, 2)
                .requires(Items.BROWN_DYE, 2)
                .requires(Items.STICK)
                .unlockedBy("has_sugar", has(Items.SUGAR))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, SSItems.GREEN_COTTON_CANDY.get())
                .requires(Items.SUGAR, 2)
                .requires(Items.GREEN_DYE, 2)
                .requires(Items.STICK)
                .unlockedBy("has_sugar", has(Items.SUGAR))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, SSItems.RED_COTTON_CANDY.get())
                .requires(Items.SUGAR, 2)
                .requires(Items.RED_DYE, 2)
                .requires(Items.STICK)
                .unlockedBy("has_sugar", has(Items.SUGAR))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, SSItems.BLACK_COTTON_CANDY.get())
                .requires(Items.SUGAR, 2)
                .requires(Items.BLACK_DYE, 2)
                .requires(Items.STICK)
                .unlockedBy("has_sugar", has(Items.SUGAR))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SSItems.CANDY_CORN.get())
                .pattern("W")
                .pattern("O")
                .pattern("Y")
                .define('W', Items.SUGAR)
                .define('O', Items.ORANGE_DYE)
                .define('Y', Items.YELLOW_DYE)
                .unlockedBy("has_sugar", has(Items.SUGAR))
                .save(recipeOutput);
    }
}
