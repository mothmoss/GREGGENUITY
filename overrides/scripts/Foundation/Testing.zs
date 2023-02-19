import mods.jei.JEI.removeAndHide as rh;
import crafttweaker.item.IItemStack;
import crafttweaker.item.IItemDefinition;
import crafttweaker.item.IIngredient;
import crafttweaker.oredict.IOreDict;
import crafttweaker.oredict.IOreDictEntry;
import mods.gregtech.recipe.RecipeMaps;
import mods.gregtech.recipe.RecipeMap;

// ================ Testing Scripts ================ //
/*
    var petromap as IItemStack[] = {
        <ore:crushedPurifiedAluminium>.firstItem : [<ore:crushedCentrifugedAluminium>.firstItem * 2, <ore:dustTinyBauxite>.firstItem * 6]
    };

        for ore, centrifuged in petromap {
            thermalcentrifuge.recipeBuilder()
            .EUt(120)
            .duration(200)
            .fluidInputs(<liquid:petrotheum> * 500)
            .inputs(ore)
            .outputs(centrifuged)
            .buildAndRegister();
        }
*/