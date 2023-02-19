import mods.jei.JEI.removeAndHide as rh;
import crafttweaker.item.IItemStack;
import crafttweaker.item.IItemDefinition;
import crafttweaker.item.IIngredient;
import crafttweaker.oredict.IOreDict;
import crafttweaker.oredict.IOreDictEntry;
import mods.gregtech.recipe.RecipeMaps;
import mods.gregtech.recipe.RecipeMap;

// ================ Tungsten ================ //
    // ======== Recipe Removal ======== //
        <recipemap:chemical_bath>.findRecipe(960, [<metaitem:dustScheelite> * 6], [<liquid:hydrochloric_acid> * 2000]).remove();
        <recipemap:chemical_bath>.findRecipe(960, [<metaitem:dustTungstate> * 7], [<liquid:hydrochloric_acid> * 2000]).remove();
        <recipemap:electrolyzer>.findRecipe(960, [<metaitem:dustTungsticAcid> * 7], null).remove();


    // ======== Tungsten Process ======== //
        // ==== Tungstate -> Sodium Tungstate ==== //
            mixer.recipeBuilder()
            .inputs(<ore:dustTungstate> * 7, <ore:dustSodiumHydroxide> * 3)
            .outputs(<ore:dustLithiumHydroxide>.firstItem * 6)
            .fluidOutputs(<liquid:sodium_tungstate> * 4000)
            .EUt(200)
            .duration(100)
            .buildAndRegister();
        // ==== Sodium Tungstate -> Calcium Tungstate ==== //
            chemreactor.recipeBuilder()
            .EUt(200)
            .duration(100)
            .inputs(<ore:dustCalciumChloride> * 3)
            .fluidInputs(<liquid:water> * 500, <liquid:sodium_tungstate> * 1000)
            .outputs(<ore:dustCalciumTungstate>.firstItem * 6)
            .fluidOutputs(<liquid:salt_water> * 500)
            .buildAndRegister();
        // ==== Calcium Tungstate -> Tungstic Acid ==== //
            lcr.recipeBuilder()
            .fluidInputs(<liquid:water> * 2000)
            .EUt(960)
            .duration(400)
            .inputs(<ore:dustCalciumTungstate> * 6)
            .outputs(<ore:dustTungsticAcid>.firstItem * 7, <ore:dustCalciumHydroxide>.firstItem * 5)
            .buildAndRegister();
        // ==== Tungstic Acid -> Tungsten Trioxide ==== //
            electrolyzer.recipeBuilder()
            .EUt(120)
            .duration(400)
            .inputs(<ore:dustTungsticAcid> * 7)
            .outputs(<ore:dustTungstenTrioxide>.firstItem * 4)
            .fluidOutputs(<liquid:water> * 1000)
            .buildAndRegister();
        // ==== Tungsten Trioxide -> Tungsten ==== //
            electrolyzer.recipeBuilder()
            .EUt(1920)
            .duration(500)
            .inputs(<ore:dustTungstenTrioxide> * 4)
            .fluidInputs(<liquid:hydrogen> * 6000)
            .outputs(<ore:dustTungsten>.firstItem)
            .fluidOutputs(<liquid:water> * 3000)
            .buildAndRegister();
        // ==== Calcium Hydroxide -> Calcium Chloride ==== //
            chemreactor.recipeBuilder()
            .EUt(200)
            .duration(200)
            .inputs(<ore:dustCalciumHydroxide> * 5)
            .fluidInputs(<liquid:hydrochloric_acid> * 2000)
            .fluidOutputs(<liquid:water> * 2000)
            .outputs(<ore:dustCalciumChloride>.firstItem * 3)
            .buildAndRegister();
        // ==== Calcite Dust -> Calcium Chloride ==== //
            chemreactor.recipeBuilder()
            .EUt(200)
            .duration(200)
            .inputs(<ore:dustCalcite> * 5)
            .fluidInputs(<liquid:hydrochloric_acid> * 2000)
            .outputs(<ore:dustCalciumChloride>.firstItem * 3)
            .fluidOutputs(<liquid:water> * 1000, <liquid:carbon_dioxide> * 1000)
            .buildAndRegister();




// ================ Tungsten ================ //
