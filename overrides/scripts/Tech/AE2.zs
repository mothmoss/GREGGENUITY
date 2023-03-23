#priority 1000
import mods.jei.JEI.removeAndHide as rh;
import crafttweaker.item.IItemStack;
import crafttweaker.item.IItemDefinition;
import crafttweaker.item.IIngredient;
import crafttweaker.oredict.IOreDict;
import crafttweaker.oredict.IOreDictEntry;
import mods.gregtech.recipe.RecipeMaps;
import mods.gregtech.recipe.RecipeMap;

# ================ AE2 ================ #
    # ======== Bulk Removal ======== #
        # ==== JEI ==== #
            mods.jei.JEI.hideCategory("appliedenergistics2.inscriber");
            mods.jei.JEI.hideCategory("threng.agg");
            mods.jei.JEI.hideCategory("threng.purify");
            mods.jei.JEI.hideCategory("threng.etch");
            mods.jei.JEI.hideCategory("threng.energize");
            
/*




    # ======== Decoration ======== #
        # ==== Skystone ==== #
            # Brick
                recipes.addShaped("GGN_ae2_skystonebrick", <appliedenergistics2:sky_stone_brick> * 4,
                [
                    [<appliedenergistics2:smooth_sky_stone_block>, <appliedenergistics2:smooth_sky_stone_block>,],
                    [<appliedenergistics2:smooth_sky_stone_block>, <appliedenergistics2:smooth_sky_stone_block>]
                ]);
            # Small Brick
                recipes.addShaped("GGN_ae2_skystonesmallbrick", <appliedenergistics2:sky_stone_small_brick> * 4,
                [
                    [<appliedenergistics2:sky_stone_brick>, <appliedenergistics2:sky_stone_brick>,],
                    [<appliedenergistics2:sky_stone_brick>, <appliedenergistics2:sky_stone_brick>]
                ]);
        # Fluix Block
            compressor.recipeBuilder()
            .duration(200)
            .EUt(8)
            .inputs(<ore:crystalFluix> * 9)
            .outputs(<appliedenergistics2:fluix_block>)
            .buildAndRegister();
        # Quartz Fixture
            assembler.recipeBuilder()
            .inputs(<ore:gemCertusQuartz> * 2, <ore:stickSteel>)
            .EUt(8)
            .duration(100)
            .fluidInputs(<liquid:glowstone> * 144)
            .outputs(<appliedenergistics2:quartz_fixture> * 8)
            .buildAndRegister();
        # Quartz Glass 
            # from Certus Quartz
                alloy.recipeBuilder()
                .EUt(8)
                .duration(100)
                .inputs(<ore:fusedQuartz>, <ore:dustCertusQuartz>)
                .outputs(<appliedenergistics2:quartz_glass>)
                .buildAndRegister();
            # from Quartzite
                alloy.recipeBuilder()
                .EUt(8)
                .duration(100)
                .inputs(<ore:fusedQuartz>, <ore:dustQuartzite>)
                .outputs(<appliedenergistics2:quartz_glass>)
                .buildAndRegister();
            # from Nether Quartz
                alloy.recipeBuilder()
                .EUt(8)
                .duration(100)
                .inputs(<ore:fusedQuartz>, <ore:dustNetherQuartz>)
                .outputs(<appliedenergistics2:quartz_glass>)
                .buildAndRegister();    
        # Vibrant Quartz Glass
            chembath.recipeBuilder()
            .EUt(8)
            .duration(200)
            .inputs(<appliedenergistics2:quartz_glass>)
            .fluidInputs(<liquid:glowstone> * 144)
            .outputs(<appliedenergistics2:quartz_vibrant_glass>)
            .buildAndRegister();
    # ======== Recipe Components ======== #
        # Charged Crystal
            polarizer.recipeBuilder()
            .EUt(10)
            .duration(1000)
            .inputs(<ore:gemCertusQuartz>)
            .outputs(<ore:crystalChargedQuartz>.firstItem)
            .buildAndRegister();
        # Fluix Crystal from Iron
            chemreactor.recipeBuilder()
            .EUt(16)
            .duration(500)
            .inputs(<ore:crystalChargedQuartz> * 2, <ore:dustIron> * 2)
            .fluidInputs(<liquid:hydrogen> * 2000, <liquid:oxygen> * 2000)
            .outputs(<ore:crystalFluix>.firstItem * 6)
            .buildAndRegister();
        # Fluix Crystal from Vitium (x2)
            chemreactor.recipeBuilder()
            .EUt(16)
            .duration(500)
            .inputs(<ore:crystalChargedQuartz> * 2, <thaumcraft:crystal_essence>.withTag({Aspects: [{amount: 1, key: "vitium"}]}) * 8)
            .fluidInputs(<liquid:hydrogen> * 2000, <liquid:oxygen> * 2000)
            .outputs(<ore:crystalFluix>.firstItem * 12)
            .buildAndRegister();
        # Fluix Dust
            macerator.recipeBuilder()
            .EUt(2)
            .duration(20)
            .inputs(<ore:crystalFluix>)
            .outputs(<ore:dustFluix>.firstItem)
            .buildAndRegister();
        # Fluix Pearl
            chemreactor.recipeBuilder()
            .EUt(16)
            .duration(250)
            .inputs(<ore:dustFluix>)
            .fluidInputs(<liquid:ender> * 72)
            .outputs(<ore:pearlFluix>.firstItem)
            .buildAndRegister();
        # Processors
            val logicP = <appliedenergistics2:material:22>;
            val calcP = <appliedenergistics2:material:23>;
            val engP = <appliedenergistics2:material:24>;
            val formCore = <appliedenergistics2:material:43>;
            val anniCore = <appliedenergistics2:material:44>;
            # Logic - Yellow Garnet
                assembler.recipeBuilder()
                .EUt(16)
                .duration(2400)
                .inputs(<ore:plateSilicon> * 2, <ore:plateGarnetYellow> * 2, <ore:plateRedAlloy> * 2, <ore:crystalFluix> * 2)
                .outputs(logicP * 12)
                .fluidInputs(<liquid:soldering_alloy> * 72)
                .buildAndRegister();
            # Calculation - Certus Quartz
                assembler.recipeBuilder()
                .EUt(16)
                .duration(2400)
                .inputs(<ore:plateSilicon> * 2, <ore:plateCertusQuartz> * 2, <ore:plateRedAlloy> * 2, <ore:crystalFluix> * 2)
                .outputs(calcP * 12)
                .fluidInputs(<liquid:soldering_alloy> * 72)
                .buildAndRegister();
            # Engineering - Diamond
                assembler.recipeBuilder()
                .EUt(16)
                .duration(2400)
                .inputs(<ore:plateSilicon> * 2, <ore:plateDiamond> * 2, <ore:plateRedAlloy> * 2, <ore:crystalFluix> * 2)
                .outputs(engP * 12)
                .fluidInputs(<liquid:soldering_alloy> * 72)
                .buildAndRegister();
            # Formation Core
                assembler.recipeBuilder()
                .EUt(4)
                .duration(60)
                .inputs(engP, calcP, logicP)
                .fluidInputs(<liquid:soldering_alloy> * 72)
                .circuit(1)
                .outputs(formCore * 3)
                .buildAndRegister();
            # Destruction Core
                assembler.recipeBuilder()
                .EUt(4)
                .duration(60)
                .inputs(engP, calcP, logicP)
                .fluidInputs(<liquid:soldering_alloy> * 72)
                .circuit(2)
                .outputs(anniCore * 3)
                .buildAndRegister();
            # Patterns
                assembler.recipeBuilder()
                .inputs(<ore:platePlastic>, <ore:foilElectrum> * 4, <ore:circuitLv>)
                .fluidInputs(<liquid:soldering_alloy> * 144)
                .EUt(40)
                .duration(200)
                .outputs(<appliedenergistics2:material:52> * 8)
                .buildAndRegister();

                assembler.recipeBuilder()
                .inputs(<ore:platePlastic>, <ore:foilManasteel> * 4, <ore:circuitLv>)
                .fluidInputs(<liquid:soldering_alloy> * 144)
                .EUt(40)
                .duration(200)
                .outputs(<appliedenergistics2:material:52> * 16)
                .buildAndRegister();

                assembler.recipeBuilder()
                .inputs(<ore:platePolytetrafluoroethylene>, <ore:foilElectrum> * 4, <ore:circuitLv>)
                .fluidInputs(<liquid:soldering_alloy> * 144)
                .EUt(40)
                .duration(200)
                .outputs(<appliedenergistics2:material:52> * 16)
                .buildAndRegister();

                assembler.recipeBuilder()
                .inputs(<ore:platePolytetrafluoroethylene>, <ore:foilManasteel> * 4, <ore:circuitLv>)
                .fluidInputs(<liquid:soldering_alloy> * 144)
                .EUt(40)
                .duration(200)
                .outputs(<appliedenergistics2:material:52> * 32)
                .buildAndRegister();

    # ======== System Blocks ======== #
        # ME Controller
            assembler.recipeBuilder()
            .EUt(32)
            .duration(400)
            .inputs(<ore:pearlFluix>, formCore, anniCore, <ore:plateSteel> * 4)
            .outputs(<appliedenergistics2:controller>)
            .buildAndRegister();
        # Drive Blocks
            assembler.recipeBuilder()
            .EUt(16)
            .duration(400)
            .inputs(<ore:plateSteel> * 4, logicP)
            .outputs(<appliedenergistics2:drive>)
            .buildAndRegister();
        # Emitters
            # Level (280)
                assembler.recipeBuilder()
                .inputs(<ore:plateCertusQuartz>, <ore:stickWroughtIron> * 2)
                .fluidInputs(<liquid:redstone> * 144)
                .circuit(1)
                .outputs(<appliedenergistics2:part:280>)
                .EUt(8)
                .duration(60)
                .buildAndRegister();
            # Fluid (281)
                assembler.recipeBuilder()
                .inputs(<ore:plateCertusQuartz>, <ore:stickWroughtIron> * 2)
                .fluidInputs(<liquid:redstone> * 144)
                .circuit(2)
                .outputs(<appliedenergistics2:part:281>)
                .EUt(8)
                .duration(60)
                .buildAndRegister();
        # == Fluix Cables == #
            # Basic Cables
                val fluixcable = <appliedenergistics2:part:16>;
                wiremill.recipeBuilder()
                .EUt(4)
                .duration(60)
                .inputs(<ore:crystalFluix>)
                .outputs(fluixcable * 4)
                .buildAndRegister();
            # Smart Cables - Cables covered in rubber, shapeless into Covered
                val smartcable = <appliedenergistics2:part:56>;
                assembler.recipeBuilder()
                .EUt(4)
                .duration(80)
                .inputs(fluixcable)
                .fluidInputs(<liquid:rubber> * 36)
                .circuit(1)
                .outputs(smartcable)
                .buildAndRegister();
            # Dense Cables
                val densecable = <appliedenergistics2:part:76>;
                assembler.recipeBuilder()
                .EUt(4)
                .duration(80)
                .inputs(fluixcable)
                .fluidInputs(<liquid:rubber> * 288)
                .circuit(2)
                .outputs(densecable)
                .buildAndRegister();
            # Covered Cables
                val covercable = <appliedenergistics2:part:36>;
                val densecovercable = <appliedenergistics2:part:516>;
                recipes.addShapeless("GGNae2_smart2cover", covercable, [smartcable]);
                recipes.addShapeless("GGNae2_cover2smart", smartcable, [covercable]);
                recipes.addShapeless("GGNae2_densesmart2cover", densecovercable, [densecable]);
                recipes.addShapeless("GGNae2_densecover2smart", densecable, [covercable]);
        # == Interfaces == #
            # Interface
                val interface = <appliedenergistics2:interface>;
                assembler.recipeBuilder()
                .EUt(8)
                .duration(300)
                .inputs(<ore:plateSteel> * 4, <ore:circuitLv>, formCore, anniCore)
                .circuit(1)
                .outputs(interface * 2)
                .fluidInputs(<liquid:silicone_rubber> * 576)
                .buildAndRegister();
            # Flat Interface
                val flatInterface = <appliedenergistics2:part:440>;
                recipes.addShapeless("GGNae2_interface2flat", flatInterface, [interface]);
                recipes.addShapeless("GGNae2_flat2interface", interface, [flatInterface]);
            # Fluid Interface
                val fluidInterface = <appliedenergistics2:fluid_interface>;
                assembler.recipeBuilder()
                .EUt(8)
                .duration(300)
                .inputs(<ore:plateSteel> * 4, <ore:circuitLv>, formCore)
                .circuit(2)
                .outputs(fluidInterface)
                .fluidInputs(<liquid:silicone_rubber> * 576)
                .buildAndRegister();
            # Flat Fluid Interface
                val flatfluidInterface = <appliedenergistics2:part:441>;
                recipes.addShapeless("GGNae2_fluidinterface2flat", flatfluidInterface, [fluidInterface]);
                recipes.addShapeless("GGNae2_fluidflat2interface", fluidInterface, [flatfluidInterface]);
        # == System Blocks == #
            # Panels
                # Bright (160)
                    assembler.recipeBuilder()
                    .EUt(16)
                    .duration(60)
                    .inputs(<ore:plateGlass>, <ore:plateSteel>, <ore:screwGold> * 4)
                    .fluidInputs(<liquid:glowstone> * 144)
                    .circuit(1)
                    .outputs(<appliedenergistics2:part:160>)
                    .buildAndRegister();
                # Illuminated (180)
                    assembler.recipeBuilder()
                    .EUt(16)
                    .duration(60)
                    .inputs(<ore:plateGlass>, <ore:plateSteel>, <ore:screwGold> * 4)
                    .fluidInputs(<liquid:glowstone> * 144)
                    .circuit(2)
                    .outputs(<appliedenergistics2:part:180>)
                    .buildAndRegister();
                # Dark (200)
                    assembler.recipeBuilder()
                    .EUt(16)
                    .duration(60)
                    .inputs(<ore:plateGlass>, <ore:plateSteel>, <ore:screwGold> * 4)
                    .fluidInputs(<liquid:glowstone> * 144)
                    .circuit(3)
                    .outputs(<appliedenergistics2:part:200>)
                    .buildAndRegister();
            # Pattern (340)
                recipes.addShaped("GGN_ae2_patternterminal", <appliedenergistics2:part:340>,
                [
                    [<ore:screwElectrum>, <appliedenergistics2:material:52>, <ore:screwElectrum>],
                    [logicP, <ore:itemIlluminatedPanel>, engP],
                    [<ore:screwElectrum>, calcP, <ore:screwElectrum>]
                ]);
            # Extended Processing (341)
                recipes.addShaped("GGN_ae2_processingterminal", <appliedenergistics2:part:341>,
                [
                    [<ore:screwTitanium>, <appliedenergistics2:material:52>, <ore:screwTitanium>],
                    [logicP, <ore:itemIlluminatedPanel>, engP],
                    [<ore:screwTitanium>, calcP, <ore:screwTitanium>]
                ]);
            # Crafting (360)
                recipes.addShaped("GGN_ae2_craftingterminal", <appliedenergistics2:part:360>,
                [
                    [<ore:screwElectrum>, <minecraft:crafting_table>, <ore:screwElectrum>],
                    [logicP, <ore:itemIlluminatedPanel>, engP],
                    [<ore:screwElectrum>, calcP, <ore:screwElectrum>]
                ]);
            # Default Terminal (380)
                recipes.addShaped("GGN_ae2_defaultterminal", <appliedenergistics2:part:380>,
                [
                    [<ore:screwElectrum>, <ore:chest>, <ore:screwElectrum>],
                    [logicP, <ore:itemIlluminatedPanel>, engP],
                    [<ore:screwElectrum>, calcP, <ore:screwElectrum>]
                ]);
            # Interface (480)
                recipes.addShaped("GGN_ae2_interfaceterminal", <appliedenergistics2:part:480>,
                [
                    [<ore:screwElectrum>, <appliedenergistics2:interface>, <ore:screwElectrum>],
                    [logicP, <ore:itemIlluminatedPanel>, engP],
                    [<ore:screwElectrum>, calcP, <ore:screwElectrum>]
                ]);
            # Fluid (520)
                recipes.addShaped("GGN_ae2_fluidterminal", <appliedenergistics2:part:520>,
                [
                    [<ore:screwElectrum>, <appliedenergistics2:fluid_interface>, <ore:screwElectrum>],
                    [logicP, <ore:itemIlluminatedPanel>, engP],
                    [<ore:screwElectrum>, calcP, <ore:screwElectrum>]
                ]);
            # Interface Config (521)
                recipes.addShapeless("GGN_ae2_interfacefromconfig", <appliedenergistics2:part:480>, [<appliedenergistics2:part:521>]);
                recipes.addShapeless("GGN_ae2_configfrominterface", <appliedenergistics2:part:521>, [<appliedenergistics2:part:480>]);
            # Fluid Config (522)
                recipes.addShapeless("GGN_ae2_fluidinterfacefromconfig", <appliedenergistics2:part:520>, [<appliedenergistics2:part:522>]);
                recipes.addShapeless("GGN_ae2_fluidconfigfrominterface", <appliedenergistics2:part:522>, [<appliedenergistics2:part:520>]);
            # Formation Plane (320)
                recipes.addShaped("GGN_ae2_formationplane", <appliedenergistics2:part:320>,
                [
                    [<ore:screwElectrum>, null, <ore:screwElectrum>],
                    [formCore, <ore:itemIlluminatedPanel>, formCore],
                    [<ore:screwElectrum>, null, <ore:screwElectrum>]
                ]);
            # Destruction Plane (300)
                recipes.addShaped("GGN_ae2_destructionplane", <appliedenergistics2:part:520>,
                [
                    [<ore:screwElectrum>, null, <ore:screwElectrum>],
                    [anniCore, <ore:itemIlluminatedPanel>, anniCore],
                    [<ore:screwElectrum>, null, <ore:screwElectrum>]
                ]);
            # Fluid Formation Pane (321)
                recipes.addShaped("GGN_ae2_fluidformationplane", <appliedenergistics2:part:321>,
                [
                    [<ore:screwSterlingSilver>, null, <ore:screwSterlingSilver>],
                    [formCore, <ore:itemIlluminatedPanel>, formCore],
                    [<ore:screwSterlingSilver>, null, <ore:screwSterlingSilver>]
                ]);
            # Fluid Destruction Plane (302)
                recipes.addShaped("GGN_ae2_fluiddestructionplane", <appliedenergistics2:part:302>,
                [
                    [<ore:screwSterlingSilver>, null, <ore:screwSterlingSilver>],
                    [anniCore, <ore:itemIlluminatedPanel>, anniCore],
                    [<ore:screwSterlingSilver>, null, <ore:screwSterlingSilver>]
                ]);
            # Identity Annihilation (301)
                recipes.addShaped("GGN_ae2_identityplane", <appliedenergistics2:part:301>,
                [
                    [<ore:screwElectrum>, anniCore, <ore:screwElectrum>],
                    [null, <ore:itemIlluminatedPanel>, null],
                    [<ore:screwElectrum>, anniCore, <ore:screwElectrum>]
                ]);
            # P2P ME (460)
                recipes.addShaped("GGN_ae2_p2pme", <appliedenergistics2:part:460>,
                [
                    [<ore:screwElectrum>, anniCore, <ore:screwElectrum>],
                    [formCore, <ore:itemIlluminatedPanel>, formCore],
                    [<ore:screwElectrum>, anniCore, <ore:screwElectrum>]
                ]);
            # Storage Bus (220)
                recipes.addShaped("GGN_ae2_storagebus", <appliedenergistics2:part:220>,
                [
                    [<ore:screwElectrum>, logicP, <ore:screwElectrum>],
                    [<ore:stickElectrum>, <ore:itemIlluminatedPanel>, <ore:stickElectrum>],
                    [<ore:screwElectrum>, logicP, <ore:screwElectrum>]
                ]);
            # Fluid Storage Bus (221)
                recipes.addShaped("GGN_ae2_fluidstoragebus", <appliedenergistics2:part:221>,
                [
                    [<ore:screwSterlingSilver>, <ore:stickSterlingSilver>, <ore:screwSterlingSilver>],
                    [logicP, <ore:itemIlluminatedPanel>, logicP],
                    [<ore:screwSterlingSilver>, <ore:stickSterlingSilver>, <ore:screwSterlingSilver>]
                ]);
            # OreDict Storage Bus (222)
                recipes.addShaped("GGN_ae2_orestoragebus", <appliedenergistics2:part:222>,
                [
                    [<ore:screwStainlessSteel>, logicP, <ore:screwStainlessSteel>],
                    [logicP, <ore:itemIlluminatedPanel>, logicP],
                    [<ore:screwStainlessSteel>, logicP, <ore:screwStainlessSteel>]
                ]);
            # Storage Monitor (400)
                recipes.addShaped("GGN_ae2_storagemonitor", <appliedenergistics2:part:400>,
                [
                    [<ore:screwElectrum>, logicP, <ore:screwElectrum>],
                    [logicP, <ore:itemIlluminatedPanel>, logicP],
                    [<ore:screwElectrum>, logicP, <ore:screwElectrum>]
                ]);
            # Molecular Assembler (molecular_assembler)
                recipes.addShaped("GGN_ae2_molecularassembler", <appliedenergistics2:molecular_assembler> * 2,
                [
                    [<ore:plateStainlessSteel>, engP, <ore:plateStainlessSteel>],
                    [<metaitem:robot.arm.mv>, <ore:circuitMv>, <metaitem:robot.arm.mv>],
                    [<ore:plateStainlessSteel>, calcP, <ore:plateStainlessSteel>],
                ]);
            # Storage 
                # Crafting
                    # Unit
                        recipes.addShaped("GGN_ae2_craftingunit", <appliedenergistics2:crafting_unit> * 2,
                        [
                            [calcP, engP, calcP],
                            [<ore:circuitMv>, <ore:blockPlastic>, <ore:circuitMv>],
                            [logicP, engP, logicP]
                        ]);
                    # CPU
                        recipes.addShaped("GGN_ae2_cpu", <appliedenergistics2:crafting_accelerator> * 2,
                        [
                            [calcP, calcP, calcP],
                            [<ore:circuitMv>, <ore:blockPlastic>, <ore:circuitMv>],
                            [calcP, calcP, calcP]
                        ]);
                # Housing
                    # Basic 
                        recipes.remove(<appliedenergistics2:material:39>);
                        assembler.recipeBuilder()
                        .inputs(<ore:platePlastic> * 4, <ore:pearlFluix>, <ore:plateElectrum> * 4)
                        .outputs(<appliedenergistics2:material:39>)
                        .fluidInputs(<liquid:soldering_alloy> * 72)
                        .EUt(16)
                        .duration(100)
                        .buildAndRegister();
                    # Fluid
                        recipes.remove(<aeadditions:storage.casing:1>);
                        assembler.recipeBuilder()
                        .inputs(<ore:platePlastic> * 4, <ore:pearlFluix>, <ore:plateSterlingSilver> * 4)
                        .outputs(<aeadditions:storage.casing:1>)
                        .fluidInputs(<liquid:soldering_alloy> * 72)
                        .EUt(16)
                        .duration(100)
                        .buildAndRegister();
                    # Advanced 
                        recipes.remove(<aeadditions:storage.casing>);
                        assembler.recipeBuilder()
                        .inputs(<ore:platePlastic> * 4, <ore:pearlFluix>, <ore:plateTitanium> * 4)
                        .outputs(<aeadditions:storage.casing>)
                        .fluidInputs(<liquid:soldering_alloy> * 72)
                        .EUt(16)
                        .duration(100)
                        .buildAndRegister();
        # Quartz Knife
            recipes.addShaped("GGN_ae2_knife", <appliedenergistics2:certus_quartz_cutting_knife>,
            [
                [<ore:gtFile>, <ore:stickWood>],
                [<ore:crystalChargedQuartz>, <ore:gtScrewdriver>]            
                ]);

        # Cable Anchor
            extruder.recipeBuilder()
            .inputs(<ore:plateCertusQuartz>)
            .notConsumable(<metaitem:shape.extruder.bolt>)
            .outputs(<appliedenergistics2:part:120> * 8)
            .EUt(24)
            .duration(60)
            .buildAndRegister();
        # Quartz Fiber
            extruder.recipeBuilder()
            .inputs(<ore:plateNetherQuartz>)
            .notConsumable(<metaitem:shape.extruder.bolt>)
            .outputs(<appliedenergistics2:part:140> * 8)
            .EUt(24)
            .duration(60)
            .buildAndRegister();
        # Export Bus (260)
            recipes.remove(<appliedenergistics2:part:260>);
            recipes.addShaped("GGN_ae2_exportbus", <appliedenergistics2:part:260> * 2,
            [
                [<ore:plateElectrum>, <ore:screwElectrum>, <ore:plateElectrum>],
                [<ore:stickElectrum>, formCore, <ore:stickElectrum>],
                [<ore:plateElectrum>, <ore:screwElectrum>, <ore:plateElectrum>]
            ]);
        # Import Bus (240)
            recipes.addShaped("GGN_ae2_importbus", <appliedenergistics2:part:240> * 2,
            [
                [<ore:plateElectrum>, <ore:screwElectrum>, <ore:plateElectrum>],
                [<ore:stickElectrum>, anniCore, <ore:stickElectrum>],
                [<ore:plateElectrum>, <ore:screwElectrum>, <ore:plateElectrum>]
            ]);
        # Fluid Export Bus (261)
            recipes.addShaped("GGN_ae2_fluidexportbus", <appliedenergistics2:part:261> * 2,
            [
                [<ore:plateSterlingSilver>, <ore:screwSterlingSilver>, <ore:plateSterlingSilver>],
                [<ore:stickSterlingSilver>, formCore, <ore:stickSterlingSilver>],
                [<ore:plateSterlingSilver>, <ore:screwSterlingSilver>, <ore:plateSterlingSilver>]
            ]);
        # Fluid Import Bus (241)
            recipes.addShaped("GGN_ae2_fluidimportbus", <appliedenergistics2:part:241> * 2,
            [
                [<ore:plateSterlingSilver>, <ore:screwSterlingSilver>, <ore:plateSterlingSilver>],
                [<ore:stickSterlingSilver>, anniCore, <ore:stickSterlingSilver>],
                [<ore:plateSterlingSilver>, <ore:screwSterlingSilver>, <ore:plateSterlingSilver>]
            ]);
    # ======== Storage Components ======== #
            # Default - 1k, 4k, 16k, 64k
                # 1k
                    recipes.remove(<appliedenergistics2:material:35>);
                    assembler.recipeBuilder()
                    .inputs(formCore, <ore:foilElectrum> * 8, <ore:gemBlueTopaz>, anniCore)
                    .fluidInputs(<liquid:soldering_alloy> * 72)
                    .outputs(<appliedenergistics2:material:35>)
                    .EUt(16)
                    .duration(80)
                    .buildAndRegister();

                # 4k
                    assembler.recipeBuilder()
                    .inputs(<ore:gemBlueTopaz> * 4, <appliedenergistics2:material:35> * 4)
                    .fluidInputs(<liquid:soldering_alloy> * 144)
                    .outputs(<appliedenergistics2:material:36>)
                    .EUt(16)
                    .duration(80)
                    .buildAndRegister();

                # 16k
                    assembler.recipeBuilder()
                    .inputs(<ore:gemFlawlessBlueTopaz> * 4, <appliedenergistics2:material:36> * 4)
                    .fluidInputs(<liquid:soldering_alloy> * 288)
                    .outputs(<appliedenergistics2:material:37>)
                    .EUt(16)
                    .duration(80)
                    .buildAndRegister();
                # 64k
                    assembler.recipeBuilder()
                    .inputs(<ore:gemFlawlessBlueTopaz> * 4, <appliedenergistics2:material:37> * 4)
                    .fluidInputs(<liquid:soldering_alloy> * 576)
                    .outputs(<appliedenergistics2:material:38>)
                    .EUt(16)
                    .duration(80)
                    .buildAndRegister();

        # Fluid - 1k, 4k, 16k, 64k
                # 1k
                    recipes.remove(<appliedenergistics2:material:35>);
                    assembler.recipeBuilder()
                    .inputs(formCore, <ore:foilSterlingSilver> * 8, <ore:gemGreenSapphire>, anniCore)
                    .fluidInputs(<liquid:soldering_alloy> * 72)
                    .outputs(<appliedenergistics2:material:54>)
                    .EUt(16)
                    .duration(80)
                    .buildAndRegister();

                # 4k
                    assembler.recipeBuilder()
                    .inputs(<ore:gemGreenSapphire> * 4, <appliedenergistics2:material:54> * 4)
                    .fluidInputs(<liquid:soldering_alloy> * 144)
                    .outputs(<appliedenergistics2:material:55>)
                    .EUt(16)
                    .duration(80)
                    .buildAndRegister();

                # 16k
                    assembler.recipeBuilder()
                    .inputs(<ore:gemFlawlessGreenSapphire> * 4, <appliedenergistics2:material:55> * 4)
                    .fluidInputs(<liquid:soldering_alloy> * 288)
                    .outputs(<appliedenergistics2:material:56>)
                    .EUt(16)
                    .duration(80)
                    .buildAndRegister();
                # 64k
                    assembler.recipeBuilder()
                    .inputs(<ore:gemFlawlessGreenSapphire> * 4, <appliedenergistics2:material:56> * 4)
                    .fluidInputs(<liquid:soldering_alloy> * 576)
                    .outputs(<appliedenergistics2:material:57>)
                    .EUt(16)
                    .duration(80)
                    .buildAndRegister();

        # Storage Cells
            # Default - 1k, 4k, 16k, 64k
                # 1k
                    recipes.addShapeless("GGN_ae2_1kcell", <appliedenergistics2:storage_cell_1k>,
                    [<appliedenergistics2:material:39>, <appliedenergistics2:material:35>]);
                # 4k
                    recipes.addShapeless("GGN_ae2_4kcell", <appliedenergistics2:storage_cell_4k>,
                    [<appliedenergistics2:material:39>, <appliedenergistics2:material:36>]);
                # 16k
                    recipes.addShapeless("GGN_ae2_16kcell", <appliedenergistics2:storage_cell_16k>,
                    [<appliedenergistics2:material:39>, <appliedenergistics2:material:37>]);
                # 64k
                    recipes.addShapeless("GGN_ae2_64kcell", <appliedenergistics2:storage_cell_64k>,
                    [<appliedenergistics2:material:39>, <appliedenergistics2:material:38>]);
            # Fluid - 1k, 4k, 16k, 64k
                # 1k
                    recipes.addShapeless("GGN_ae2_1kcellF", <appliedenergistics2:fluid_storage_cell_1k>,
                    [<aeadditions:storage.casing:1>, <appliedenergistics2:material:54>]);
                # 4k
                    recipes.addShapeless("GGN_ae2_4kcellF", <appliedenergistics2:fluid_storage_cell_4k>,
                    [<aeadditions:storage.casing:1>, <appliedenergistics2:material:55>]);
                # 16k
                    recipes.addShapeless("GGN_ae2_16kcellF", <appliedenergistics2:fluid_storage_cell_16k>,
                    [<aeadditions:storage.casing:1>, <appliedenergistics2:material:56>]);
                # 64k
                    recipes.addShapeless("GGN_ae2_64kcellF", <appliedenergistics2:fluid_storage_cell_64k>,
                    [<aeadditions:storage.casing:1>, <appliedenergistics2:material:57>]);

    # ======== Upgrade Components ======== # 
        # Basic
            recipes.remove(<appliedenergistics2:material:25>);
            recipes.addShaped("GGN_ae2_basicupgrade", <appliedenergistics2:material:25> * 3,
            [
                [<ore:foilElectrum>, <ore:foilRedAlloy>, <ore:foilElectrum>],
                [logicP, <ore:plateSterlingSilver>, calcP],
                [<ore:foilElectrum>, <ore:foilRedAlloy>, <ore:foilElectrum>]
            ]);
        # Advanced
            recipes.remove(<appliedenergistics2:material:28>);
            rh(<appliedenergistics2:material:28>);
        # Chisel
            var AE2chisel as IItemStack[] = [
                <appliedenergistics2:material:25>,
                <appliedenergistics2:material:26>,
                <appliedenergistics2:material:27>,
                <appliedenergistics2:material:29>,
                <appliedenergistics2:material:30>,
                <appliedenergistics2:material:31>,
                <appliedenergistics2:material:53>,
                <appliedenergistics2:material:58>
                ];
            for i in AE2chisel {
            i.addTooltip(format.green("Start with a Basic Card!"));
            mods.chisel.Carving.addVariation("AE2", i);
            }
# ================ AE2 ================ #
*/