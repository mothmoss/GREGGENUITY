import mods.jei.JEI.removeAndHide as rh;
import crafttweaker.item.IItemStack;
import crafttweaker.item.IItemDefinition;
import crafttweaker.item.IIngredient;
import crafttweaker.oredict.IOreDict;
import crafttweaker.oredict.IOreDictEntry;
import mods.gregtech.recipe.RecipeMaps;
import mods.gregtech.recipe.RecipeMap;

// ================ Modular Machinery ================ //
    // ======== Variables ======== //
        val manaextrap = <modularmachinery:itemblueprint>.withTag({dynamicmachine: "modularmachinery:mana_extrapolator"});
        val blackpaper = <ore:paperBlack>.firstItem;
        val manadiamond = <ore:manaDiamond>.firstItem;
        val mvcircuit = <ore:circuitMv>;
        val gtorangedye = <metaitem:dye.orange>;
        val pulsatingiron = <enderio:item_alloy_ingot:5>;
        val salismundus = <ore:salismundus>.firstItem;
        val modularium = <ore:ingotModularium>.firstItem; 

        val modulvinput= <modularmachinery:blockinputbus>;
        val modlvinput= <modularmachinery:blockinputbus:1>;
        val modmvinput= <modularmachinery:blockinputbus:2>;
        val modhvinput= <modularmachinery:blockinputbus:3>;
        val modevinput= <modularmachinery:blockinputbus:4>;
        val modivinput= <modularmachinery:blockinputbus:5>;
        val modluvinput= <modularmachinery:blockinputbus:6>;
        val gtulvinput = <metaitem:item_bus.import.ulv>;
        val gtlvinput = <metaitem:item_bus.import.lv>;
        val gtmvinput = <metaitem:item_bus.import.mv>;
        val gthvinput = <metaitem:item_bus.import.hv>;
        val gtevinput = <metaitem:item_bus.import.ev>;
        val gtivinput = <metaitem:item_bus.import.iv>;
        val gtluvinput = <metaitem:item_bus.import.luv>;
        val gtzpminput = <metaitem:item_bus.import.zpm>;

        val modulvoutput= <modularmachinery:blockoutputbus>;
        val modlvoutput= <modularmachinery:blockoutputbus:1>;
        val modmvoutput= <modularmachinery:blockoutputbus:2>;
        val modhvoutput= <modularmachinery:blockoutputbus:3>;
        val modevoutput= <modularmachinery:blockoutputbus:4>;
        val modivoutput= <modularmachinery:blockoutputbus:5>;
        val modluvoutput= <modularmachinery:blockoutputbus:6>;
        val gtulvoutput = <metaitem:item_bus.export.ulv>;
        val gtlvoutput = <metaitem:item_bus.export.lv>;
        val gtmvoutput = <metaitem:item_bus.export.mv>;
        val gthvoutput = <metaitem:item_bus.export.hv>;
        val gtevoutput = <metaitem:item_bus.export.ev>;
        val gtivoutput = <metaitem:item_bus.export.iv>;
        val gtluvoutput = <metaitem:item_bus.export.luv>;
        val gtzpmoutput = <metaitem:item_bus.export.zpm>;

        val modulvfluidinput= <modularmachinery:blockfluidinputhatch>;
        val modlvfluidinput= <modularmachinery:blockfluidinputhatch:1>;
        val modmvfluidinput= <modularmachinery:blockfluidinputhatch:2>;
        val modhvfluidinput= <modularmachinery:blockfluidinputhatch:3>;
        val modevfluidinput= <modularmachinery:blockfluidinputhatch:4>;
        val modivfluidinput= <modularmachinery:blockfluidinputhatch:5>;
        val modluvfluidinput= <modularmachinery:blockfluidinputhatch:6>;
        val modzpmfluidinput= <modularmachinery:blockfluidinputhatch:7>;
        val gtulvfluidinput = <metaitem:fluid_hatch.import.ulv>;
        val gtlvfluidinput = <metaitem:fluid_hatch.import.lv>;
        val gtmvfluidinput = <metaitem:fluid_hatch.import.mv>;
        val gthvfluidinput = <metaitem:fluid_hatch.import.hv>;
        val gtevfluidinput = <metaitem:fluid_hatch.import.ev>;
        val gtivfluidinput = <metaitem:fluid_hatch.import.iv>;
        val gtluvfluidinput = <metaitem:fluid_hatch.import.luv>;
        val gtzpmfluidinput = <metaitem:fluid_hatch.import.zpm>;

        val manainputhatch = <modulardiversity:blockmanainputhatch>;
        val manaoutputhatch = <modulardiversity:blockmanaoutputhatch>;

        val modulvfluidoutput= <modularmachinery:blockfluidoutputhatch>;
        val modlvfluidoutput= <modularmachinery:blockfluidoutputhatch:1>;
        val modmvfluidoutput= <modularmachinery:blockfluidoutputhatch:2>;
        val modhvfluidoutput= <modularmachinery:blockfluidoutputhatch:3>;
        val modevfluidoutput= <modularmachinery:blockfluidoutputhatch:4>;
        val modivfluidoutput= <modularmachinery:blockfluidoutputhatch:5>;
        val modluvfluidoutput= <modularmachinery:blockfluidoutputhatch:6>;
        val modzpmfluidoutput= <modularmachinery:blockfluidoutputhatch:7>;
        val gtulvfluidoutput = <metaitem:fluid_hatch.export.ulv>;
        val gtlvfluidoutput = <metaitem:fluid_hatch.export.lv>;
        val gtmvfluidoutput = <metaitem:fluid_hatch.export.mv>;
        val gthvfluidoutput = <metaitem:fluid_hatch.export.hv>;
        val gtevfluidoutput = <metaitem:fluid_hatch.export.ev>;
        val gtivfluidoutput = <metaitem:fluid_hatch.export.iv>;
        val gtluvfluidoutput = <metaitem:fluid_hatch.export.luv>;
        val gtzpmfluidoutput = <metaitem:fluid_hatch.export.zpm>;
    // ======== Display Names ======== //
        // Fluid Output
        modulvfluidoutput.displayName = "Modular ULV Fluid Output Hatch";
        modlvfluidoutput.displayName = "Modular LV Fluid Output Hatch";
        modmvfluidoutput.displayName = "Modular MV Fluid Output Hatch";
        modhvfluidoutput.displayName = "Modular HV Fluid Output Hatch";
        modevfluidoutput.displayName = "Modular EV Fluid Output Hatch";
        modivfluidoutput.displayName = "Modular IV Fluid Output Hatch";
        modluvfluidoutput.displayName = "Modular LUV Fluid Output Hatch";
        modzpmfluidoutput.displayName = "Modular ZPM Fluid Output Hatch";
        // Fluid Input
        modulvfluidinput.displayName = "Modular ULV Fluid Input Hatch";
        modlvfluidinput.displayName = "Modular LV Fluid Input Hatch";
        modmvfluidinput.displayName = "Modular MV Fluid Input Hatch";
        modhvfluidinput.displayName = "Modular HV Fluid Input Hatch";
        modevfluidinput.displayName = "Modular EV Fluid Input Hatch";
        modivfluidinput.displayName = "Modular IV Fluid Input Hatch";
        modluvfluidinput.displayName = "Modular LUV Fluid Input Hatch";
        modzpmfluidinput.displayName = "Modular ZPM Fluid Input Hatch";
        // Item Input
        modulvinput.displayName = "Modular ULV Input Bus";
        modlvinput.displayName = "Modular LV Input Bus";
        modmvinput.displayName = "Modular MV Input Bus";
        modhvinput.displayName = "Modular HV Input Bus";
        modevinput.displayName = "Modular EV Input Bus";
        modivinput.displayName = "Modular IV Input Bus";
        modluvinput.displayName = "Modular LUV Input Bus";
        // Item Output
        modulvoutput.displayName = "Modular ULV Output Bus";
        modlvoutput.displayName = "Modular LV Output Bus";
        modmvoutput.displayName = "Modular MV Output Bus";
        modhvoutput.displayName = "Modular HV Output Bus";
        modevoutput.displayName = "Modular EV Output Bus";
        modivoutput.displayName = "Modular IV Output Bus";
        modluvoutput.displayName = "Modular LUV Output Bus";
    // ======== Bulk Removal ======== //
        val ModularMachinery = [
            <modularmachinery:blockenergyoutputhatch>, //energy output hatches
            <modularmachinery:blockenergyoutputhatch:1>,
            <modularmachinery:blockenergyoutputhatch:2>,
            <modularmachinery:blockenergyoutputhatch:3>,
            <modularmachinery:blockenergyoutputhatch:4>,
            <modularmachinery:blockenergyoutputhatch:5>,
            <modularmachinery:blockenergyoutputhatch:6>,
        ] as IItemStack[];
        for item in ModularMachinery {
            rh(item);
            recipes.remove(item);
        }
    // ======== Components ======== //
        // ==== Modularium ==== //
            // Alloy Smelter
                recipes.remove(modularium);
                alloy.recipeBuilder()
                    .EUt(32).duration(100)
                    .inputs(pulsatingiron, salismundus)
                    .outputs(modularium)
                    .buildAndRegister();
        // ==== Blueprints ==== //
            // Mana Extrapolator
                recipes.addShaped("ggn_mm_manaextrap", manaextrap,
                [
                    [mvcircuit, gtorangedye],
                    [blackpaper, manadiamond]
                ]);
    // ======== Multiblock Parts ======== //
        val Modular as IItemStack[IItemStack] = {
            <modularmachinery:blockinputbus> : <metaitem:item_bus.import.ulv>,
            <modularmachinery:blockinputbus:1> : <metaitem:item_bus.import.lv>,
            <modularmachinery:blockinputbus:2> : <metaitem:item_bus.import.mv>,
            <modularmachinery:blockinputbus:3> : <metaitem:item_bus.import.hv>,
            <modularmachinery:blockinputbus:4> : <metaitem:item_bus.import.ev>,
            <modularmachinery:blockinputbus:5> : <metaitem:item_bus.import.iv>,
            <modularmachinery:blockinputbus:6> : <metaitem:item_bus.import.luv>,

            <modularmachinery:blockoutputbus> : <metaitem:item_bus.export.ulv>,
            <modularmachinery:blockoutputbus:1> : <metaitem:item_bus.export.lv>,
            <modularmachinery:blockoutputbus:2> : <metaitem:item_bus.export.mv>,
            <modularmachinery:blockoutputbus:3> : <metaitem:item_bus.export.hv>,
            <modularmachinery:blockoutputbus:4> : <metaitem:item_bus.export.ev>,
            <modularmachinery:blockoutputbus:5> : <metaitem:item_bus.export.iv>,
            <modularmachinery:blockoutputbus:6> : <metaitem:item_bus.export.luv>,

            <modularmachinery:blockfluidinputhatch> : <metaitem:fluid_hatch.import.ulv>,
            <modularmachinery:blockfluidinputhatch:1> : <metaitem:fluid_hatch.import.lv>,
            <modularmachinery:blockfluidinputhatch:2> : <metaitem:fluid_hatch.import.mv>,
            <modularmachinery:blockfluidinputhatch:3> : <metaitem:fluid_hatch.import.hv>,
            <modularmachinery:blockfluidinputhatch:4> : <metaitem:fluid_hatch.import.ev>,
            <modularmachinery:blockfluidinputhatch:5> : <metaitem:fluid_hatch.import.iv>,
            <modularmachinery:blockfluidinputhatch:6> : <metaitem:fluid_hatch.import.luv>,
            <modularmachinery:blockfluidinputhatch:7> : <metaitem:fluid_hatch.import.zpm>,

            <modularmachinery:blockfluidoutputhatch> : <metaitem:fluid_hatch.export.ulv>,
            <modularmachinery:blockfluidoutputhatch:1> : <metaitem:fluid_hatch.export.lv>,
            <modularmachinery:blockfluidoutputhatch:2> : <metaitem:fluid_hatch.export.mv>,
            <modularmachinery:blockfluidoutputhatch:3> : <metaitem:fluid_hatch.export.hv>,
            <modularmachinery:blockfluidoutputhatch:4> : <metaitem:fluid_hatch.export.ev>,
            <modularmachinery:blockfluidoutputhatch:5> : <metaitem:fluid_hatch.export.iv>,
            <modularmachinery:blockfluidoutputhatch:6> : <metaitem:fluid_hatch.export.luv>,
            <modularmachinery:blockfluidoutputhatch:7> : <metaitem:fluid_hatch.export.zpm>,
        };
        for mod, gt in Modular {
            recipes.remove(mod);
            recipes.addShaped(mod,
            [
                [null, <ore:ingotModularium>, null],
                [<ore:ingotModularium>, gt, <ore:ingotModularium>],
                [null, <ore:ingotModularium>, null]
            ]);
        }
        //Casing
            recipes.remove(<modularmachinery:blockcasing>);
            recipes.addShaped("ggn_mm_blockcasing", <modularmachinery:blockcasing> * 3,
            [
                [modularium, modularium, modularium],
                [<ore:frameGtSteel>, <ore:frameGtSteel>, <ore:frameGtSteel>],
                [modularium, modularium, modularium],
            ]);
        //Mana      
            recipes.addShapeless("ggn_mm_manainput", manainputhatch,
            [<ore:plateManasteel>, modmvfluidinput]);
        
            recipes.addShapeless("ggn_mm_manaoutput", manaoutputhatch,
            [<ore:plateManasteel>, modmvfluidoutput]);

// ================ Modular Machinery ================ //
