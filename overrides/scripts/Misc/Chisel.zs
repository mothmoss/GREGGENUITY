import mods.jei.JEI.removeAndHide as rh;
import crafttweaker.item.IItemStack;
import crafttweaker.item.IItemDefinition;
import crafttweaker.item.IIngredient;
import crafttweaker.oredict.IOreDict;
import crafttweaker.oredict.IOreDictEntry;
import mods.gregtech.recipe.RecipeMaps;
import mods.gregtech.recipe.RecipeMap;

// ================ Chisel ================ //
    // ======== Recipes ======== //
        // Default Removal
            recipes.remove(<chisel:chisel_diamond>);
            rh(<chisel:chisel_diamond>);
            recipes.remove(<chisel:chisel_iron>);
            rh(<chisel:chisel_iron>);
        // iChisel
            recipes.remove(<chisel:chisel_hitech>);
            recipes.addShaped("GGNchisel_backup", <chisel:chisel_hitech>, [
                [<ore:gtFile>, <ore:gemLazurite>],
                [<ore:stickIron>, <ore:gtScrewdriver>]
            ]);
    // ======== Chisel Molds ======== //
        var GTChisel as IItemStack[] = [
            <metaitem:shape.mold.plate>,
            <metaitem:shape.mold.gear>,
            <metaitem:shape.mold.credit>,
            <metaitem:shape.mold.bottle>,
            <metaitem:shape.mold.ingot>,
            <metaitem:shape.mold.ball>,
            <metaitem:shape.mold.block>,
            <metaitem:shape.mold.nugget>,
            <metaitem:shape.mold.cylinder>,
            <metaitem:shape.mold.anvil>,
            <metaitem:shape.mold.name>,
            <metaitem:shape.mold.gear.small>,
            <metaitem:shape.mold.rotor>,
            <metaitem:shape.extruder.plate>,
            <metaitem:shape.extruder.rod>,
            <metaitem:shape.extruder.bolt>,
            <metaitem:shape.extruder.ring>,
            <metaitem:shape.extruder.cell>,
            <metaitem:shape.extruder.ingot>,
            <metaitem:shape.extruder.wire>,
            <metaitem:shape.extruder.pipe.tiny>,
            <metaitem:shape.extruder.pipe.small>,
            <metaitem:shape.extruder.pipe.normal>,
            <metaitem:shape.extruder.pipe.large>,
            <metaitem:shape.extruder.pipe.huge>,
            <metaitem:shape.extruder.block>,
            <metaitem:shape.extruder.gear>,
            <metaitem:shape.extruder.bottle>,
            <metaitem:shape.extruder.foil>,
            <metaitem:shape.extruder.gear_small>,
            <metaitem:shape.extruder.rod_long>,
            <metaitem:shape.extruder.rotor>,
            ];
        for i in GTChisel {
        i.addTooltip(format.green("Start with an Empty Shape Plate!"));
        mods.chisel.Carving.addVariation("GTMolds", i);
        recipes.remove(i);
        }
        mods.chisel.Carving.addVariation("GTMolds", <metaitem:shape.empty>);
    // ======== Chisel Fixes ======== //
        // ==== Gregtech ==== //
            // Basalt
                mods.chisel.Carving.addVariation("basalt", <gregtech:stone_smooth:3>);
            // Marble
                mods.chisel.Carving.addVariation("marble", <gregtech:stone_smooth:2>);
            // Treated Wood
                mods.chisel.Carving.addVariation("immersiveengineering:treated_wood_0", <gregtech:planks:1>);

        // ==== Immersive Engineering ==== //
            // Lead
                recipes.remove(<immersiveengineering:storage:2>);
            // Silver
                recipes.remove(<immersiveengineering:storage:3>);
            // Nickel
                recipes.remove(<immersiveengineering:storage:4>);
            // Uranium
                recipes.remove(<immersiveengineering:storage:5>);
            // Steel 
                recipes.remove(<immersiveengineering:storage:8>);

// ================ Chisel ================ //
