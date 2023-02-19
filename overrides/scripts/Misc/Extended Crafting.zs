import mods.jei.JEI.removeAndHide as rh;
import crafttweaker.item.IItemStack;
import crafttweaker.item.IItemDefinition;
import crafttweaker.item.IIngredient;
import crafttweaker.oredict.IOreDict;
import crafttweaker.oredict.IOreDictEntry;
import mods.gregtech.recipe.RecipeMaps;
import mods.gregtech.recipe.RecipeMap;

// ================ Extended Crafting ================ //
    // ======== Variables ======== //
        var lumin = <extendedcrafting:material:7>;
    // ======== Bulk Removal ======== //
        val ExtendedCrafting = [
            <extendedcrafting:material:8>, //catalysts
            <extendedcrafting:material:9>,
            <extendedcrafting:material:10>,
            <extendedcrafting:material:11>,
            <extendedcrafting:material:12>,
            <extendedcrafting:material:13>,
            <extendedcrafting:material:14>,
            <extendedcrafting:material:15>,
            <extendedcrafting:material:36>, //ingots
            <extendedcrafting:material:37>,
            <extendedcrafting:material:41>,
            <extendedcrafting:material:48>,
            <extendedcrafting:material:49>,
            <extendedcrafting:material>, //black iron
            <extendedcrafting:material:1>,
            <extendedcrafting:material:2>,
            <extendedcrafting:material:3>,
            <extendedcrafting:frame>,
            <extendedcrafting:lamp>,
            <extendedcrafting:lamp:1>,
            <extendedcrafting:trimmed>,
            <extendedcrafting:trimmed:1>,
            <extendedcrafting:trimmed:2>,
            <extendedcrafting:trimmed:3>,
            <extendedcrafting:trimmed:4>,
            <extendedcrafting:trimmed:5>,
            <extendedcrafting:storage>, //storage
            <extendedcrafting:storage:3>,
            <extendedcrafting:storage:5>,
            <extendedcrafting:storage:7>,
            <extendedcrafting:pedestal>, //crafting core
            <extendedcrafting:crafting_core>,
            <extendedcrafting:table_basic> //basic table
        ] as IItemStack[];
        for item in ExtendedCrafting {
            rh(item);
            recipes.remove(item);
        }
    // ======== Crafting Tables ======== //
        // ==== Lumin ==== //
            recipes.remove(lumin);
            chembath.recipeBuilder()
                .EUt(7).duration(1000)
                .inputs(<metaitem:dye.pink>)
                .fluidInputs(<liquid:glowstone> * 2000)
                .outputs(lumin)
                .buildAndRegister();
        // ==== Advanced ==== //
            recipes.remove(<extendedcrafting:table_advanced>);
            recipes.addShaped("ggn_ec_advancedtable", <extendedcrafting:table_advanced>,
            [
                [<ore:plateRoseGold>, lumin, <ore:plateRoseGold>],
                [<ore:stickDarkSteel>, <ore:blockDarkSteel>, <ore:stickDarkSteel>],
                [<ore:plateRoseGold>, lumin, <ore:plateRoseGold>],
            ]);

// ================ Extended Crafting ================ //
