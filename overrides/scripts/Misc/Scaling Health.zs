import mods.jei.JEI.removeAndHide as rh;
import crafttweaker.item.IItemStack;
import crafttweaker.item.IItemDefinition;
import crafttweaker.item.IIngredient;
import crafttweaker.oredict.IOreDict;
import crafttweaker.oredict.IOreDictEntry;
import mods.gregtech.recipe.RecipeMaps;
import mods.gregtech.recipe.RecipeMap;

// ================ Scaling Health ================ //
    // ======== Heart Crystals ======== //
        recipes.remove(<scalinghealth:heartdust>);
        mixer.recipeBuilder()
        .inputs(<metaitem:energium_dust> * 9, <ore:dustDiamond> * 36)
        .fluidInputs(<liquid:redstone> * 8000)
        .outputs(<scalinghealth:heartdust> * 9)
        .EUt(8)
        .duration(288000)
        .buildAndRegister();

        implosion.recipeBuilder()
        .inputs(<scalinghealth:heartdust> * 1)
        .outputs(<scalinghealth:crystalshard>)
        .property("explosives", 8)
        .EUt(32)
        .duration(100)
        .buildAndRegister();
        recipes.remove(<cyclicmagic:heart_food>);
// ================ Scaling Health ================ //






