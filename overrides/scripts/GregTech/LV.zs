import mods.jei.JEI.removeAndHide as rh;
import crafttweaker.item.IItemStack;
import crafttweaker.item.IItemDefinition;
import crafttweaker.item.IIngredient;
import crafttweaker.oredict.IOreDict;
import crafttweaker.oredict.IOreDictEntry;
import mods.gregtech.recipe.RecipeMaps;
import mods.gregtech.recipe.RecipeMap;
import mods.thaumcraft.Crucible;


// ================ LV ================ //
    // ======== Nether Cake ======== //
        recipes.remove(<dimensionaledibles:nether_cake>);
        mixer.recipeBuilder()
        .EUt(32)
        .duration(2400)
        .inputs(<ore:dustBlaze> * 16, <ore:obsidian> * 16)
        .fluidInputs(<liquid:lava> * 8000, <liquid:ender> * 2304)
        .outputs(<dimensionaledibles:nether_cake>)
        .buildAndRegister();
    // ======== Sulfur ======== //
        hammer.recipeBuilder()
        .EUt(4)
        .duration(40)
        .inputs(<ore:dustTinyBlaze>)
        .outputs(<ore:dustTinySulfur>.firstItem)
        .buildAndRegister();

        mods.thaumcraft.Crucible.registerRecipe("GGNsulfurblaze", "", <ore:dustSulfur>.firstItem, <ore:dustBlaze>,
        [<aspect:permutatio> * 10, <aspect:ignis> * 10]);
    // ======== Tempered Glass ======== //
        <recipemap:arc_furnace>.findRecipe(30, [<minecraft:glass:0>], [<liquid:oxygen> * 60]).remove();
        <recipemap:electric_blast_furnace>.findRecipe(120, [<minecraft:glass:0>], [<liquid:oxygen> * 100]).remove();

        arc.recipeBuilder()
        .EUt(30)
        .duration(60)
        .fluidInputs(<liquid:oxygen> * 60)
        .inputs(<ore:glassHard>)
        .outputs(<gregtech:transparent_casing>)
        .buildAndRegister();
    // ======== Coils ======== //
        // ==== Mica ==== //
            // Mica Based Dust
                mixer.recipeBuilder()
                .inputs(<ore:dustMica> * 3, <ore:dustRawRubber> * 2)
                .EUt(8)
                .duration(400)
                .outputs(<ore:dustMicaBased>.firstItem * 5)
                .buildAndRegister();
            // Mica Based Sheet
                mixer.recipeBuilder()
                .inputs(<ore:dustMicaBased> * 4, <ore:dustAsbestos> * 1)
                .EUt(8)
                .duration(400)
                .outputs(<ore:plateMicaBased>.firstItem * 5)
                .buildAndRegister();
            // Mica Based Insulator
                alloy.recipeBuilder()
                .EUt(8)
                .duration(400)
                .inputs(<ore:plateMicaBased> * 5, <ore:dustSiliconDioxide> * 2)
                .outputs(<ore:plateMicaInsulator>.firstItem * 8)
                .buildAndRegister();
            // Mica Based Insulator Coils
                bender.recipeBuilder()
                .EUt(24)
                .duration(330)
                .circuit(1)
                .inputs(<ore:plateMicaInsulator>)
                .outputs(<ore:foilMicaInsulator>.firstItem * 4)
                .buildAndRegister();
        // ==== Cupronickel Coil ==== //
            // Cupronickel Coil
                <recipemap:assembler>.findRecipe(30, [<metaitem:wireGtDoubleCupronickel> * 8, <metaitem:foilBronze> * 8], [<liquid:tin_alloy> * 144]).remove();
                assembler.recipeBuilder()
                .EUt(30)
                .duration(200)
                .inputs(<ore:wireGtDoubleCupronickel> * 8, <ore:foilMicaInsulator> * 8)
                .fluidInputs(<liquid:tin_alloy> * 144)
                .outputs(<gregtech:wire_coil>)
                .buildAndRegister();
                // Recycling Recipe
                    <recipemap:arc_furnace>.findRecipe(30, [<gregtech:wire_coil:0>], [<liquid:oxygen> * 719]).remove();
                    arc.recipeBuilder()
                    .EUt(30)
                    .fluidInputs(<liquid:oxygen> * 719)
                    .duration(719)
                    .outputs(<ore:ingotCupronickel>.firstItem * 8, <ore:ingotTinAlloy>.firstItem, <ore:dustMicaInsulator>.firstItem * 8)
                    .inputs(<gregtech:wire_coil>)
                    .buildAndRegister();

                    <recipemap:macerator>.findRecipe(2, [<gregtech:wire_coil:0>], null).remove();
                    macerator.recipeBuilder()
                    .EUt(2)
                    .duration(719)
                    .outputs(<ore:dustCupronickel>.firstItem * 8, <ore:dustTinAlloy>.firstItem, <ore:dustMicaInsulator>.firstItem * 8)
                    .inputs(<gregtech:wire_coil>)
                    .buildAndRegister();


// ================ LV ================ //
