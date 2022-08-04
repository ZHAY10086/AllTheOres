package net.allthemods.alltheores.datagen.server;

import net.allthemods.alltheores.blocks.BlockList;
import net.allthemods.alltheores.infos.ItemTagRegistry;
import net.allthemods.alltheores.infos.Reference;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Consumer;

public class BlastingRecipes extends RecipeProvider {
    public BlastingRecipes(DataGenerator generator) {
        super(generator);
    }
    private ResourceLocation recipeDir(String typeIn, String typeOut) {
        return new ResourceLocation(Reference.MOD_ID,typeIn + "_from_" + typeOut + "_blasting");
    }
    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

        final String hasCondition = "has_item";

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(ItemTagRegistry.BRONZE_DUST),BlockList.BRONZE_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.BRONZE_DUST.get()))
                .save(consumer,recipeDir("bronze_ingot","dust"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(ItemTagRegistry.BRASS_DUST),BlockList.BRASS_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.BRASS_DUST.get()))
                .save(consumer,recipeDir("brass_ingot","dust"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(ItemTagRegistry.CONSTANTAN_DUST),BlockList.CONSTANTAN_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.CONSTANTAN_DUST.get()))
                .save(consumer,recipeDir("constantan_ingot","dust"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(ItemTagRegistry.INVAR_DUST),BlockList.INVAR_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.INVAR_DUST.get()))
                .save(consumer,recipeDir("invar_ingot","dust"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(ItemTagRegistry.STEEL_DUST),BlockList.STEEL_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.STEEL_DUST.get()))
                .save(consumer,recipeDir("steel_ingot","dust"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(ItemTagRegistry.LUMIUM_DUST),BlockList.LUMIUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.LUMIUM_DUST.get()))
                .save(consumer,recipeDir("lumium_ingot","dust"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(ItemTagRegistry.IRIDIUM_DUST),BlockList.IRIDIUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.IRIDIUM_DUST.get()))
                .save(consumer,recipeDir("iridium_ingot","dust"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(ItemTagRegistry.ENDERIUM_DUST),BlockList.ENDERIUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ENDERIUM_DUST.get()))
                .save(consumer,recipeDir("enderium_ingot","dust"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(ItemTagRegistry.SIGNALUM_DUST),BlockList.SIGNALUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.SIGNALUM_DUST.get()))
                .save(consumer,recipeDir("signalum_ingot","dust"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(ItemTagRegistry.ELECTRUM_DUST),BlockList.ELECTRUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ELECTRUM_DUST.get()))
                .save(consumer,recipeDir("electrum_ingot","dust"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(ItemTagRegistry.IRON_DUST), Items.IRON_INGOT,0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.IRON_DUST.get()))
                .save(consumer,recipeDir("iron_ingot","dust"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(ItemTagRegistry.GOLD_DUST), Items.GOLD_INGOT,0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.GOLD_DUST.get()))
                .save(consumer,recipeDir("gold_ingot","dust"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(ItemTagRegistry.COPPER_DUST), Items.COPPER_INGOT,0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.COPPER_DUST.get()))
                .save(consumer,recipeDir("copper_ingot","dust"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.ALUMINUM_RAW.get()),BlockList.ALUMINUM_INGOT.get(),0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ALUMINUM_RAW.get()))
                .save(consumer,recipeDir("aluminum_ingot","raw"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.IRIDIUM_RAW.get()),BlockList.IRIDIUM_INGOT.get(),0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.IRIDIUM_RAW.get()))
                .save(consumer,recipeDir("iridium_ingot","raw"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.LEAD_RAW.get()),BlockList.LEAD_INGOT.get(),0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.LEAD_RAW.get()))
                .save(consumer,recipeDir("lead_ingot","raw"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.OSMIUM_RAW.get()),BlockList.OSMIUM_INGOT.get(),0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.OSMIUM_RAW.get()))
                .save(consumer,recipeDir("osmium_ingot","raw"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.NICKEL_RAW.get()),BlockList.NICKEL_INGOT.get(),0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.NICKEL_RAW.get()))
                .save(consumer,recipeDir("nickel_ingot","raw"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.PLATINUM_RAW.get()),BlockList.PLATINUM_INGOT.get(),0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.PLATINUM_RAW.get()))
                .save(consumer,recipeDir("platinum_ingot","raw"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.SILVER_RAW.get()),BlockList.SILVER_INGOT.get(),0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.SILVER_RAW.get()))
                .save(consumer,recipeDir("silver_ingot","raw"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.TIN_RAW.get()),BlockList.TIN_INGOT.get(),0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.TIN_RAW.get()))
                .save(consumer,recipeDir("tin_ingot","raw"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.URANIUM_RAW.get()),BlockList.URANIUM_INGOT.get(),0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.URANIUM_RAW.get()))
                .save(consumer,recipeDir("uranium_ingot","raw"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.ZINC_RAW.get()),BlockList.ZINC_INGOT.get(),0.15f,100)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ZINC_RAW.get()))
                .save(consumer,recipeDir("zinc_ingot","raw"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.ALUMINUM_ORE.get()),BlockList.ALUMINUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ALUMINUM_ORE.get()))
                .save(consumer,recipeDir("aluminum_ingot","ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.IRIDIUM_ORE.get()),BlockList.IRIDIUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.IRIDIUM_ORE.get()))
                .save(consumer,recipeDir("iridium_ingot","ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.LEAD_ORE.get()),BlockList.LEAD_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.LEAD_ORE.get()))
                .save(consumer,recipeDir("lead_ingot","ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.OSMIUM_ORE.get()),BlockList.OSMIUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.OSMIUM_ORE.get()))
                .save(consumer,recipeDir("osmium_ingot","ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.NICKEL_ORE.get()),BlockList.NICKEL_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.NICKEL_ORE.get()))
                .save(consumer,recipeDir("nickel_ingot","ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.PLATINUM_ORE.get()),BlockList.PLATINUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.PLATINUM_ORE.get()))
                .save(consumer,recipeDir("platinum_ingot","ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.SILVER_ORE.get()),BlockList.SILVER_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.SILVER_ORE.get()))
                .save(consumer,recipeDir("silver_ingot","ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.TIN_ORE.get()),BlockList.TIN_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.TIN_ORE.get()))
                .save(consumer,recipeDir("tin_ingot","ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.URANIUM_ORE.get()),BlockList.URANIUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.URANIUM_ORE.get()))
                .save(consumer,recipeDir("uranium_ingot","ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.ZINC_ORE.get()),BlockList.ZINC_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ZINC_ORE.get()))
                .save(consumer,recipeDir("zinc_ingot","ore"));


        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.ALUMINUM_SLATE_ORE.get()),BlockList.ALUMINUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ALUMINUM_SLATE_ORE.get()))
                .save(consumer,recipeDir("aluminum_ingot","slate_ore"));


        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.IRIDIUM_SLATE_ORE.get()),BlockList.IRIDIUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.IRIDIUM_SLATE_ORE.get()))
                .save(consumer,recipeDir("iridium_ingot","slate_ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.LEAD_SLATE_ORE.get()),BlockList.LEAD_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.LEAD_SLATE_ORE.get()))
                .save(consumer,recipeDir("lead_ingot","slate_ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.OSMIUM_SLATE_ORE.get()),BlockList.OSMIUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.OSMIUM_SLATE_ORE.get()))
                .save(consumer,recipeDir("osmium_ingot","slate_ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.NICKEL_SLATE_ORE.get()),BlockList.NICKEL_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.NICKEL_SLATE_ORE.get()))
                .save(consumer,recipeDir("nickel_ingot","slate_ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.PLATINUM_SLATE_ORE.get()),BlockList.PLATINUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.PLATINUM_SLATE_ORE.get()))
                .save(consumer,recipeDir("platinum_ingot","slate_ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.SILVER_SLATE_ORE.get()),BlockList.SILVER_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.SILVER_SLATE_ORE.get()))
                .save(consumer,recipeDir("silver_ingot","slate_ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.TIN_SLATE_ORE.get()),BlockList.TIN_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.TIN_SLATE_ORE.get()))
                .save(consumer,recipeDir("tin_ingot","slate_ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.URANIUM_SLATE_ORE.get()),BlockList.URANIUM_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.URANIUM_SLATE_ORE.get()))
                .save(consumer,recipeDir("uranium_ingot","slate_ore"));

        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(BlockList.ZINC_SLATE_ORE.get()),BlockList.ZINC_INGOT.get(),0.15f,200)
                .unlockedBy(hasCondition,RecipeProvider.has(BlockList.ZINC_SLATE_ORE.get()))
                .save(consumer,recipeDir("zinc_ingot","slate_ore"));


    }
}
