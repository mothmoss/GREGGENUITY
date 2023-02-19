//priority 1000
import mods.jei.JEI.removeAndHide as rh;
import crafttweaker.item.IItemStack;
import crafttweaker.item.IItemDefinition;
import crafttweaker.item.IIngredient;
import crafttweaker.oredict.IOreDict;
import crafttweaker.oredict.IOreDictEntry;
import mods.gregtech.recipe.RecipeMaps;
import mods.gregtech.recipe.RecipeMap;

// ================ Catwalks ================ //
    // ======== Bulk Removal ======== //
        recipes.remove(<catwalks:stair>);
        rh(<catwalks:stair>);
        recipes.remove(<catwalks:catwalk>.withTag({material: "classic"}));
        rh(<catwalks:catwalk>.withTag({material: "classic"}));
        rh(<catwalks:catwalk>.withTag({material: "nyanwalk"}));
// ================ Catwalks ================ //

