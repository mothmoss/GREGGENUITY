import mods.jei.JEI.removeAndHide as rh;
import crafttweaker.item.IItemStack;
import crafttweaker.item.IItemDefinition;
import crafttweaker.item.IIngredient;
import crafttweaker.oredict.IOreDict;
import crafttweaker.oredict.IOreDictEntry;
import mods.gregtech.recipe.RecipeMaps;
import mods.gregtech.recipe.RecipeMap;

// ================ Storage Drawers ================ //
    // ======== Removal ======== //
        val SDRemoval = [
            <storagedrawers:basicdrawers>.withTag({material: "oak"}), //regular drawers
            <storagedrawers:basicdrawers>.withTag({material: "spruce"}),
            <storagedrawers:basicdrawers>.withTag({material: "dark_oak"}),
            <storagedrawers:basicdrawers>.withTag({material: "acacia"}),
            <storagedrawers:basicdrawers>.withTag({material: "birch"}),
            <storagedrawers:basicdrawers>.withTag({material: "jungle"}),
            <storagedrawers:basicdrawers:1>.withTag({material: "oak"}), //1x2s
            <storagedrawers:basicdrawers:1>.withTag({material: "spruce"}),
            <storagedrawers:basicdrawers:1>.withTag({material: "dark_oak"}),
            <storagedrawers:basicdrawers:1>.withTag({material: "acacia"}),
            <storagedrawers:basicdrawers:1>.withTag({material: "birch"}),
            <storagedrawers:basicdrawers:1>.withTag({material: "jungle"}),
            <storagedrawers:basicdrawers:2>.withTag({material: "oak"}), //2x2s
            <storagedrawers:basicdrawers:2>.withTag({material: "spruce"}),
            <storagedrawers:basicdrawers:2>.withTag({material: "dark_oak"}),
            <storagedrawers:basicdrawers:2>.withTag({material: "acacia"}),
            <storagedrawers:basicdrawers:2>.withTag({material: "birch"}),
            <storagedrawers:basicdrawers:2>.withTag({material: "jungle"}),
            <storagedrawers:basicdrawers:3>.withTag({material: "oak"}), //1x2s flat
            <storagedrawers:basicdrawers:3>.withTag({material: "spruce"}),
            <storagedrawers:basicdrawers:3>.withTag({material: "dark_oak"}),
            <storagedrawers:basicdrawers:3>.withTag({material: "acacia"}),
            <storagedrawers:basicdrawers:3>.withTag({material: "birch"}),
            <storagedrawers:basicdrawers:3>.withTag({material: "jungle"}),
            <storagedrawers:basicdrawers:3>.withTag({material: "jungle"}),
            <storagedrawers:basicdrawers:4>.withTag({material: "oak"}), //2x2s flat
            <storagedrawers:basicdrawers:4>.withTag({material: "spruce"}),
            <storagedrawers:basicdrawers:4>.withTag({material: "dark_oak"}),
            <storagedrawers:basicdrawers:4>.withTag({material: "acacia"}),
            <storagedrawers:basicdrawers:4>.withTag({material: "birch"}),
            <storagedrawers:basicdrawers:4>.withTag({material: "jungle"}),
            <fluiddrawers:tank>, //fluid
            <storagedrawers:trim>, //trim
            <storagedrawers:trim:1>,
            <storagedrawers:trim:2>,
            <storagedrawers:trim:3>,
            <storagedrawers:trim:4>,
            <storagedrawers:trim:5>,
        ] as IItemStack[];
            for item in SDRemoval
            {
                recipes.remove(item);
                rh(item);
            }     

    // ======== Drawers ======== //
        // ==== Framing Table ==== //
                recipes.remove(<storagedrawers:framingtable>);
                recipes.addShaped("GGN_drawers_framingtable", <storagedrawers:framingtable>,
                [
                    [null, <ore:gtSaw>, null],
                    [<metaitem:wooden_form.empty>, <metaitem:wooden_form.empty>, <metaitem:wooden_form.empty>],
                    [<ore:plankWood>, null, <ore:plankWood>],
                ]);
        // ==== Framed Trim ==== //
            recipes.remove(<storagedrawers:customtrim>);
            recipes.addShaped("GGN_drawers_trim", <storagedrawers:customtrim> * 8, 
            [
                [<ore:plankWood>, <ore:gtSaw>, <ore:plankWood>],
                [<ore:stickWood>, <actuallyadditions:block_misc:4>, <ore:stickWood>],
                [<ore:plankWood>, <ore:stickWood>, <ore:plankWood>]
            ]);

            assembler.recipeBuilder()
            .EUt(7)
            .duration(20)
            .inputs(<actuallyadditions:block_misc:4>, <ore:plateWood> * 4)
            .outputs(<storagedrawers:customtrim> * 16)
            .buildAndRegister();
        // ==== Framed 1x1 ==== //
            recipes.remove(<storagedrawers:customdrawers>);
            recipes.addShaped("GGN_storagedrawer_1x1", <storagedrawers:customdrawers> * 4,
            [
                [<storagedrawers:customtrim>, <ore:screwIron>, <storagedrawers:customtrim>],
                [<ore:screwIron>, <ore:gtSaw>, <ore:screwIron>],
                [<storagedrawers:customtrim>, <ore:screwIron>, <storagedrawers:customtrim>]
            ]);

            assembler.recipeBuilder()
            .EUt(7)
            .duration(200)
            .inputs(<ore:screwIron> * 4, <storagedrawers:customtrim> * 4)
            .fluidInputs(<liquid:glue> * 100)
            .circuit(2)
            .outputs(<storagedrawers:customdrawers> * 8)
            .buildAndRegister();
        // ==== Framed 1x2 ==== //
            recipes.remove(<storagedrawers:customdrawers:1>);
            recipes.addShaped("GGN_storagedrawer_1x2", <storagedrawers:customdrawers:1>,
            [
                [<ore:gtSaw>, null],
                [null, <storagedrawers:customdrawers>],
            ]);

            assembler.recipeBuilder()
            .EUt(7)
            .duration(50)
            .inputs(<storagedrawers:customdrawers>)
            .outputs(<storagedrawers:customdrawers:1> * 2)
            .circuit(1)
            .buildAndRegister();
        // ==== Framed 2x2 ==== //
            recipes.remove(<storagedrawers:customdrawers:2>);
            recipes.addShaped("GGN_storagedrawer_2x2", <storagedrawers:customdrawers:2>,
            [
                [null, <ore:gtSaw>],
                [null, <storagedrawers:customdrawers:1>],
            ]);
            
            assembler.recipeBuilder()
            .EUt(7)
            .duration(50)
            .inputs(<storagedrawers:customdrawers>)
            .outputs(<storagedrawers:customdrawers:2> * 2)
            .circuit(2)
            .buildAndRegister();
        // ==== Framed 1x2 Flat ==== //
            recipes.remove(<storagedrawers:customdrawers:3>);
            recipes.addShapeless("GGN_storagedrawer_1x2flat", <storagedrawers:customdrawers:3> * 2, 
            [<ore:gtSaw>, <storagedrawers:customdrawers:1>]);

            assembler.recipeBuilder()
            .EUt(7)
            .duration(40)
            .inputs(<storagedrawers:customdrawers:1>)
            .outputs(<storagedrawers:customdrawers:3> * 2)
            .buildAndRegister();
        // ==== Framed 2x2 Flat ==== //
            recipes.remove(<storagedrawers:customdrawers:4>);
            recipes.addShapeless("GGN_storagedrawer_2x2flat", <storagedrawers:customdrawers:4> * 2, 
            [<ore:gtSaw>, <storagedrawers:customdrawers:2>]);

            assembler.recipeBuilder()
            .EUt(7)
            .duration(40)
            .inputs(<storagedrawers:customdrawers:2>)
            .outputs(<storagedrawers:customdrawers:4> * 2)
            .buildAndRegister();
        // ==== Fluid Drawers ==== //
            recipes.remove(<fluiddrawers:tank_custom>);
            recipes.addShaped("GGN_fluiddrawer", <fluiddrawers:tank_custom> * 4,
            [
                [<ore:plateSteel>, <ore:glassHard>, <ore:plateSteel>],
                [<ore:glassHard>, <storagedrawers:customdrawers>, <ore:glassHard>],
                [<ore:plateSteel>, <ore:glassHard>, <ore:plateSteel>]
            ]);

            assembler.recipeBuilder()
            .EUt(16)
            .duration(100)
            .inputs(<ore:plateSteel> * 2, <ore:glassHard> * 2, <storagedrawers:customdrawers>)
            .outputs(<fluiddrawers:tank_custom> * 4)
            .buildAndRegister();
        // ==== Controller & Slave ==== //
            recipes.remove(<storagedrawers:controller>);
            rh(<storagedrawers:controller>);
            recipes.remove(<storagedrawers:controllerslave>);
            rh(<storagedrawers:controllerslave>);

        // Controller
            recipes.remove(<framedcompactdrawers:framed_drawer_controller>);
            recipes.addShaped("GGN_drawers_controller", <framedcompactdrawers:framed_drawer_controller>,
            [
                [<storagedrawers:customtrim>, <storagedrawers:customtrim>, <storagedrawers:customtrim>],
                [<ore:plateSteel>, <ore:circuitLv>, <ore:plateSteel>],
                [<storagedrawers:customtrim>, <storagedrawers:customtrim>, <storagedrawers:customtrim>]
            ]);
        // Slave
            recipes.remove(<framedcompactdrawers:framed_slave>);
            recipes.addShapeless("GGN_drawers_slave", <framedcompactdrawers:framed_slave>, [<framedcompactdrawers:framed_drawer_controller>]);
            recipes.addShapeless("GGN_drawers_slave2", <framedcompactdrawers:framed_drawer_controller>, [<framedcompactdrawers:framed_slave>]);

    // ======== Upgrades ======== //
        // ==== Wooden Form ==== //
            cutter.recipeBuilder()
            .inputs(<ore:plankWood>)
            .outputs(<metaitem:wooden_form.empty> * 2)
            .EUt(7)
            .duration(10)
            .buildAndRegister();
        // ==== Upgrade Template ==== //
            recipes.remove(<storagedrawers:upgrade_template>);
            recipes.addShaped("GGN_storagedrawers_template", <storagedrawers:upgrade_template> * 4,
            [
                [<storagedrawers:customtrim>, <storagedrawers:customtrim>, <storagedrawers:customtrim>],
                [<storagedrawers:customtrim>, <metaitem:wooden_form.empty>, <storagedrawers:customtrim>],
                [<storagedrawers:customtrim>, <storagedrawers:customtrim>, <storagedrawers:customtrim>]
            ]);

            assembler.recipeBuilder()
            .inputs(<metaitem:wooden_form.empty>, <storagedrawers:customtrim> * 4)
            .fluidInputs(<liquid:glue> * 100)
            .outputs(<storagedrawers:upgrade_template> * 8)
            .EUt(7)
            .duration(60)
            .buildAndRegister();

    // ======== Framed Drawers ======== //
// ================ Storage Drawers ================ //
