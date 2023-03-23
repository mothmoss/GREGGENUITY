//priority 1000
import mods.jei.JEI.removeAndHide as rh;
import crafttweaker.item.IItemStack;
import crafttweaker.item.IItemDefinition;
import crafttweaker.item.IIngredient;
import crafttweaker.oredict.IOreDict;
import crafttweaker.oredict.IOreDictEntry;
import mods.gregtech.recipe.RecipeMaps;
import mods.gregtech.recipe.RecipeMap;
import mods.multiblockstages.IEMultiBlockStages;

// ================ Immersive Engineering ================ //
    // ======== Cleanup ======== //
        // ==== Hiding Items ==== //
            val IEHiding = [
                <immersiveengineering:mold>, //molds
                <immersiveengineering:mold:1>,
                <immersiveengineering:mold:2>,
                <immersiveengineering:mold:3>,
                <immersiveengineering:mold:4>,
                <immersiveengineering:mold:5>,
                <immersiveengineering:mold:6>,
                <immersiveengineering:mold:7>,
                <immersiveengineering:blueprint>, //blueprint
                <immersiveengineering:metal_device0>, //capacitors
                <immersiveengineering:metal_device0:1>,
                <immersiveengineering:metal_device0:2>,
                <immersiveengineering:material:20>, //wires
                <immersiveengineering:material:21>,
                <immersiveengineering:material:22>,
                <immersiveengineering:material:23>,
                <immersiveengineering:material:19>, //hop graphite
                <immersiveengineering:material:18>,
                <immersiveengineering:material:7>, //slag FLAGGED maybe use elsewhere?
                <immersiveengineering:material:8>, //mechanical components
                <immersiveengineering:material:9>,
                    ] as IItemStack[];
            for item in IEHiding
            {recipes.remove(item); rh(item);}
        // ==== Multiblocks ==== //
            IEMultiBlockStages.addStage("IEDebug", "IE:CokeOven", "This multiblock is disabled.");
            IEMultiBlockStages.addStage("IEDebug", "IE:AlloySmelter", "This multiblock is disabled.");
            IEMultiBlockStages.addStage("IEDebug", "IE:BlastFurnace", "This multiblock is disabled.");
            IEMultiBlockStages.addStage("IEDebug", "IE:BlastFurnaceAdvanced", "This multiblock is disabled.");
            IEMultiBlockStages.addStage("IEDebug", "IE:MetalPress", "This multiblock is disabled.");
            IEMultiBlockStages.addStage("IEDebug", "IE:Crusher", "This multiblock is disabled.");
            IEMultiBlockStages.addStage("IEDebug", "IE:Assembler", "This multiblock is disabled.");
            IEMultiBlockStages.addStage("IEDebug", "IE:AutoWorkbench", "This multiblock is disabled.");
            IEMultiBlockStages.addStage("IEDebug", "IE:BottlingMachine", "This multiblock is disabled.");
            IEMultiBlockStages.addStage("IEDebug", "IE:Squeezer", "This multiblock is disabled.");
            IEMultiBlockStages.addStage("IEDebug", "IE:Fermenter", "This multiblock is disabled.");
            IEMultiBlockStages.addStage("IEDebug", "IE:Refinery", "This multiblock is disabled.");
            IEMultiBlockStages.addStage("IEDebug", "IE:DieselGenerator", "This multiblock is disabled.");
            IEMultiBlockStages.addStage("IEDebug", "IE:ArcFurnace", "This multiblock is disabled.");
            IEMultiBlockStages.addStage("IEDebug", "IE:LightningRod", "This multiblock is disabled.");
            IEMultiBlockStages.addStage("IEDebug", "IE:Mixer", "This multiblock is disabled.");
            IEMultiBlockStages.addStage("IEDebug", "IE:Feedthrough", "This multiblock is disabled.");
        // ==== Hiding JEI Categories ==== //
            mods.jei.JEI.hideCategory("ie.cokeoven");
            mods.jei.JEI.hideCategory("ie.alloysmelter");
            mods.jei.JEI.hideCategory("ie.blastfurnace");
            mods.jei.JEI.hideCategory("ie.blastfurnace.fuel");
            mods.jei.JEI.hideCategory("ie.metalPress");
            mods.jei.JEI.hideCategory("ie.crusher");
            mods.jei.JEI.hideCategory("ie.workbench");
            mods.jei.JEI.hideCategory("ie.squeezer");
            mods.jei.JEI.hideCategory("ie.fermenter");
            mods.jei.JEI.hideCategory("ie.refinery");
            mods.jei.JEI.hideCategory("ie.arcFurnace");
            mods.jei.JEI.hideCategory("ie.bottlingMachine");
            mods.jei.JEI.hideCategory("ie.mixer");
        // ==== Gunpowder ==== //
            recipes.removeByRecipeName("immersiveengineering:material/gunpowder0");
            recipes.removeByRecipeName("immersiveengineering:material/gunpowder1");
            recipes.removeByRecipeName("thermalfoundation:gunpowder");
            recipes.removeByRecipeName("thermalfoundation:gunpowder_1");
        // ==== Concrete ==== //
            <immersiveengineering:stone_decoration:5>.displayName="Construction Concrete";
            <immersiveengineering:stone_decoration:6>.displayName="Construction Concrete Tile";
            <immersiveengineering:stone_decoration:7>.displayName="Leaded Construction Concrete";
            <immersiveengineering:stone_decoration_slab:5>.displayName="Construction Concrete Slab";
            <immersiveengineering:stone_decoration_slab:6>.displayName="Construction Concrete Tile Slab";
            <immersiveengineering:stone_decoration_slab:7>.displayName="Leaded Construction Concrete Slab";
            <immersiveengineering:stone_decoration_stairs_concrete>.displayName="Construction Concrete Stairs";
            <immersiveengineering:stone_decoration_stairs_concrete_tile>.displayName="Leaded Construction Concrete Tile Stairs";
            <immersiveengineering:stone_decoration_stairs_concrete_leaded>.displayName="Leaded Construction Concrete Stairs";

    // ======== Mineral Deposits ======== //
        // ==== Removal ==== //
                mods.immersiveengineering.Excavator.removeMineral("Bauxite");
                mods.immersiveengineering.Excavator.removeMineral("Cassiterite");
                mods.immersiveengineering.Excavator.removeMineral("Coal");
                mods.immersiveengineering.Excavator.removeMineral("Copper");
                mods.immersiveengineering.Excavator.removeMineral("Cinnabar");
                mods.immersiveengineering.Excavator.removeMineral("Silt");
                mods.immersiveengineering.Excavator.removeMineral("Galena");
                mods.immersiveengineering.Excavator.removeMineral("Gold");
                mods.immersiveengineering.Excavator.removeMineral("Iron");
                mods.immersiveengineering.Excavator.removeMineral("Lapis");
                mods.immersiveengineering.Excavator.removeMineral("Lead");
                mods.immersiveengineering.Excavator.removeMineral("Magnetite");
                mods.immersiveengineering.Excavator.removeMineral("Nickel");
                mods.immersiveengineering.Excavator.removeMineral("Platinum");
                mods.immersiveengineering.Excavator.removeMineral("Pyrite");
                mods.immersiveengineering.Excavator.removeMineral("Quartzite ");
                mods.immersiveengineering.Excavator.removeMineral("Quartzite");
                mods.immersiveengineering.Excavator.removeMineral("Silver");
                mods.immersiveengineering.Excavator.removeMineral("Uranium");
        // ==== New Deposits ==== //
            // == Overworld == //
                // Stannic 
                    // Tin (100)
                    // Wulfenite (50)
                    // Cassiterite Sand (25)
                    // Stibnite (25) 
                    mods.immersiveengineering.Excavator.addMineral(
                        "Stannic", 50, 0.005, 
                        ["oreTin", "oreWulfenite", "oreCassiteriteSand", "oreStibnite"], 
                        [100, 50, 25, 25], 
                        [0], false
                    );

                    excavator.recipeBuilder()
                    .duration(1)
                    .EUt(1024)
                    .inputs(<immersiveengineering:metal_multiblock:11>)
                    .circuit(1)
                    .outputs(<ore:oreTin>.firstItem * 100, <ore:oreWulfenite>.firstItem * 50, 
                    <ore:oreCassiteriteSand>.firstItem * 25, <ore:oreStibnite>.firstItem * 25)
                    .buildAndRegister();
                // Argentum
                    // Silver (75)
                    // Lead (75)
                    // Galena (30)
                    // Tantalite (20)

                    mods.immersiveengineering.Excavator.addMineral(
                        "Argentum", 50, 0.005, 
                        ["oreSilver", "oreLead", "oreGalena", "oreTantalite"], 
                        [75, 75, 30, 20], 
                        [0], false
                    );

                    excavator.recipeBuilder()
                    .duration(1)
                    .EUt(1024)
                    .inputs(<immersiveengineering:metal_multiblock:11>)
                    .circuit(2)
                    .outputs(<ore:oreSilver>.firstItem * 75, <ore:oreLead>.firstItem * 75, 
                    <ore:oreGalena>.firstItem * 30, <ore:oreTantalite>.firstItem * 20)
                    .buildAndRegister();
                // Gemstone
                    // Topaz - 40
                    // Blue Sapphire - 40
                    // Red Garnet - 40
                    // Almandine - 40
                    // Ruby - 40

                    mods.immersiveengineering.Excavator.addMineral(
                        "Gemstone", 50, 0.005, 
                        ["oreTopaz", "oreSapphire", "oreGarnetRed", "oreAlmandine", "oreRuby"], 
                        [40, 40, 40, 40, 40], 
                        [0], false
                    );

                    excavator.recipeBuilder()
                    .duration(1)
                    .EUt(1024)
                    .inputs(<immersiveengineering:metal_multiblock:11>)
                    .circuit(3)
                    .outputs(<ore:oreTopaz>.firstItem * 40, <ore:oreSapphire>.firstItem * 40, 
                    <ore:oreGarnetRed>.firstItem * 40, <ore:oreAlmandine>.firstItem * 40,
                    <ore:oreRuby>.firstItem * 40)
                    .buildAndRegister();
                // Ferric
                    // Iron - 100
                    // Brown Limonite - 50
                    // Yellow Limonite - 50
                    // Molybdenum - 25
                    // Diatomite - 25
                    mods.immersiveengineering.Excavator.addMineral(
                        "Ferric", 50, 0.005, 
                        ["oreIron", "oreBrownLimonite", "oreYellowLimonite", "oreMolybdenum", "oreDiatomite"], 
                        [100, 50, 50, 25, 25], 
                        [0], false
                    );

                    excavator.recipeBuilder()
                    .duration(1)
                    .EUt(1024)
                    .inputs(<immersiveengineering:metal_multiblock:11>)
                    .circuit(4)
                    .outputs(<ore:oreIron>.firstItem * 100, <ore:oreBrownLimonite>.firstItem * 50, 
                    <ore:oreYellowLimonite>.firstItem * 50, <ore:oreMolybdenum>.firstItem * 25,
                    <ore:oreDiatomite>.firstItem * 25)
                    .buildAndRegister();
                // Cupric
                    // Copper - 100
                    // Chalcopyrite - 50
                    // Spodumene - 25
                    // Tetrahedrite - 25

                    mods.immersiveengineering.Excavator.addMineral(
                        "Cupric", 50, 0.005, 
                        ["oreCopper", "oreChalcopyrite", "oreSpodumene", "oreTetrahedrite"], 
                        [100, 50, 25, 25], 
                        [0], false
                    );

                    excavator.recipeBuilder()
                    .duration(1)
                    .EUt(1024)
                    .inputs(<immersiveengineering:metal_multiblock:11>)
                    .circuit(5)
                    .outputs(<ore:oreCopper>.firstItem * 100, <ore:oreChalcopyrite>.firstItem * 50, 
                    <ore:oreSpodumene>.firstItem * 25, <ore:oreTetrahedrite>.firstItem * 25)
                    .buildAndRegister();
                // Precious
                    // Nickel - 100
                    // Cobalt - 50
                    // Gold - 40
                    // Diamond - 10

                    mods.immersiveengineering.Excavator.addMineral(
                        "Precious", 50, 0.005, 
                        ["oreNickel", "oreCobalt", "oreGold", "oreDiamond"], 
                        [80, 50, 40, 30], 
                        [0], false
                    );

                    excavator.recipeBuilder()
                    .duration(1)
                    .EUt(1024)
                    .inputs(<immersiveengineering:metal_multiblock:11>)
                    .circuit(6)
                    .outputs(<ore:oreNickel>.firstItem * 80, <ore:oreCobalt>.firstItem * 50, 
                    <ore:oreGold>.firstItem * 40, <ore:oreDiamond>.firstItem * 30)
                    .buildAndRegister();
                // Magnetic
                    // Redstone - 100
                    // Bastnasite - 50
                    // Pyrochlore - 25
                    // Monazite - 25

                    mods.immersiveengineering.Excavator.addMineral(
                        "Magnetic", 50, 0.005, 
                        ["oreRedstone", "oreBastnasite", "orePyrochlore", "oreMonazite"], 
                        [100, 50, 25, 25], 
                        [0], false
                    );

                    excavator.recipeBuilder()
                    .duration(1)
                    .EUt(1024)
                    .inputs(<immersiveengineering:metal_multiblock:11>)
                    .circuit(7)
                    .outputs(<ore:oreRedstone>.firstItem * 100, <ore:oreBastnasite>.firstItem * 50, 
                    <ore:orePyrochlore>.firstItem * 25, <ore:oreMonazite>.firstItem * 25)
                    .buildAndRegister();
            
            // == Nether == //
                // Nether Salt 
                    // Salt (100)
                    // Rock Salt (50)
                    // Saltpeter (25)
                    // Sulfur (25) 
                    mods.immersiveengineering.Excavator.addMineral(
                        "Nether Salt", 50, 0.005, 
                        ["oreSalt", "oreRockSalt", "oreSaltpeter", "oreSulfur"], 
                        [100, 50, 25, 25], 
                        [1], false
                    );

                    excavator.recipeBuilder()
                    .duration(1)
                    .EUt(1024)
                    .inputs(<immersiveengineering:metal_multiblock:11>)
                    .circuit(8)
                    .outputs(<ore:oreSalt>.firstItem * 100, <ore:oreRockSalt>.firstItem * 50, 
                    <ore:oreSaltpeter>.firstItem * 25, <ore:oreSulfur>.firstItem * 25)
                    .buildAndRegister();
                // Nether Zinc
                    // Sphalerite (100)
                    // Calcite (50)
                    // Bornite (25)
                    // Pyrope (25) 
                    mods.immersiveengineering.Excavator.addMineral(
                        "Nether Salt", 50, 0.005, 
                        ["oreSphalerite", "oreCalcite", "oreBornite", "orePyrope"], 
                        [100, 50, 25, 25], 
                        [1], false
                    );

                    excavator.recipeBuilder()
                    .duration(1)
                    .EUt(1024)
                    .inputs(<immersiveengineering:metal_multiblock:11>)
                    .circuit(9)
                    .outputs(<ore:oreSphalerite>.firstItem * 100, <ore:oreCalcite>.firstItem * 50, 
                    <ore:oreBornite>.firstItem * 25, <ore:orePyrope>.firstItem * 25)
                    .buildAndRegister();
                // Nether Sands
                    // Basaltic Mineral Sand (100)
                    // Realgar (50)
                    // Mica (25)
                    // Garnet Sand (25) 
                    mods.immersiveengineering.Excavator.addMineral(
                        "Nether Sands", 50, 0.005, 
                        ["oreBasalticMineralSand", "oreRealgar", "oreMica", "oreGarnetSand"], 
                        [100, 50, 25, 25], 
                        [1], false
                    );

                    excavator.recipeBuilder()
                    .duration(1)
                    .EUt(1024)
                    .inputs(<immersiveengineering:metal_multiblock:11>)
                    .circuit(10)
                    .outputs(<ore:oreBasalticMineralSand>.firstItem * 100, <ore:oreRealgar>.firstItem * 50, 
                    <ore:oreMica>.firstItem * 25, <ore:oreGarnetSand>.firstItem * 25)
                    .buildAndRegister();
                // Nether Quartz
                    // Nether Quartz (100)
                    // Quartzite (50)
                    // Certus Quartz (25)
                    // Pyrolusite (25) 
                    mods.immersiveengineering.Excavator.addMineral(
                        "Nether Quartz", 50, 0.005, 
                        ["oreNetherQuartz", "oreQuartzite", "oreCertusQuartz", "orePyrolusite"], 
                        [100, 50, 25, 25], 
                        [1], false
                    );

                    excavator.recipeBuilder()
                    .duration(1)
                    .EUt(1024)
                    .inputs(<immersiveengineering:metal_multiblock:11>)
                    .circuit(11)
                    .outputs(<ore:oreNetherQuartz>.firstItem * 100, <ore:oreQuartzite>.firstItem * 50, 
                    <ore:oreCertusQuartz>.firstItem * 25, <ore:orePyrolusite>.firstItem * 25)
                    .buildAndRegister();
                // Nether Hazard
                    // Sulfur (100)
                    // Asbestos (50)
                    // Pyrite (25)
                    // Tricalcium Phosphate (25) 
                    mods.immersiveengineering.Excavator.addMineral(
                        "Nether Hazard", 50, 0.005, 
                        ["oreSulfur", "oreAsbestos", "orePyrite", "oreTricalciumPhosphate"], 
                        [100, 50, 25, 25], 
                        [1], false
                    );

                    excavator.recipeBuilder()
                    .duration(1)
                    .EUt(1024)
                    .inputs(<immersiveengineering:metal_multiblock:11>)
                    .circuit(12)
                    .outputs(<ore:oreSulfur>.firstItem * 100, <ore:oreAsbestos>.firstItem * 50, 
                    <ore:orePyrite>.firstItem * 25, <ore:oreTricalciumPhosphate>.firstItem * 25)
                    .buildAndRegister();
                // Nether Cobalt
                    // Cobaltite (100)
                    // Alunite (50)
                    // Stibnite (25)
                    // Sulfur (25) 
                    mods.immersiveengineering.Excavator.addMineral(
                        "Nether Cobalt", 50, 0.005, 
                        ["oreCobaltite", "oreAlunite", "oreStibnite", "oreSulfur"], 
                        [100, 50, 25, 25], 
                        [1], false
                    );

                    excavator.recipeBuilder()
                    .duration(1)
                    .EUt(1024)
                    .inputs(<immersiveengineering:metal_multiblock:11>)
                    .circuit(13)
                    .outputs(<ore:oreCobaltite>.firstItem * 100, <ore:oreAlunite>.firstItem * 50, 
                    <ore:oreStibnite>.firstItem * 25, <ore:oreSulfur>.firstItem * 25)
                    .buildAndRegister();


            // == Luna == //
                // Lunar Rutile
                    // Bauxite (125)
                    // Lithium (50)
                    // Ilmenite (25) 
                    mods.immersiveengineering.Excavator.addMineral(
                        "Lunar Rutile", 50, 0.005, 
                        ["oreBauxite", "oreLithium","oreIlmenite"], 
                        [125, 50, 25], 
                        [1], false
                    );

                    excavator.recipeBuilder()
                    .duration(1)
                    .EUt(1024)
                    .inputs(<immersiveengineering:metal_multiblock:11>)
                    .circuit(14)
                    .outputs(<ore:oreBauxite>.firstItem * 125, <ore:oreLithium>.firstItem * 50, 
                    <ore:oreIlmenite>.firstItem * 25)
                    .buildAndRegister();
                // Lunar Chromite
                    // Chromite (150)
                    // Aluminium (50)
                    mods.immersiveengineering.Excavator.addMineral(
                        "Lunar Chromite", 50, 0.005, 
                        ["oreChromite", "oreAluminium"], 
                        [150, 50], 
                        [1], false
                    );

                    excavator.recipeBuilder()
                    .duration(1)
                    .EUt(1024)
                    .inputs(<immersiveengineering:metal_multiblock:11>)
                    .circuit(15)
                    .outputs(<ore:oreChromite>.firstItem * 150, <ore:oreAluminium>.firstItem * 50)
                    .buildAndRegister();


    // ======== Components ======== //
        // ==== Engineering Blocks ==== //
            // Redstone
                recipes.remove(<immersiveengineering:metal_decoration0:3>);
                assembler.recipeBuilder()
                .outputs(<immersiveengineering:metal_decoration0:3> * 1)
                .inputs(<ore:plateSteel> * 8, <ore:foilRedAlloy> * 32, <ore:blockCopper>)
                .fluidInputs(<liquid:soldering_alloy> * 144)
                .EUt(320)
                .duration(80)
                .buildAndRegister();
            // Light
                recipes.remove(<immersiveengineering:metal_decoration0:4>);
                assembler.recipeBuilder()
                .outputs(<immersiveengineering:metal_decoration0:4>)
                .inputs(<ore:plateSteel> * 8, <ore:foilAnnealedCopper> * 32, <ore:blockCopper>)
                .fluidInputs(<liquid:soldering_alloy> * 144)
                .EUt(320)
                .duration(80)
                .buildAndRegister();
            // Heavy
                recipes.remove(<immersiveengineering:metal_decoration0:5>);
                assembler.recipeBuilder()
                .outputs(<immersiveengineering:metal_decoration0:5>)
                .inputs(<ore:plateSteel> * 8, <ore:foilElectrum> * 32, <ore:blockSteel>)
                .fluidInputs(<liquid:soldering_alloy> * 144)
                .EUt(320)
                .duration(80)
                .buildAndRegister();
            // Generator
                recipes.remove(<immersiveengineering:metal_decoration0:6>);
                assembler.recipeBuilder()
                .outputs(<immersiveengineering:metal_decoration0:6>)
                .inputs(<ore:plateSteel> * 8, <ore:foilCopper> * 64)
                .fluidInputs(<liquid:soldering_alloy> * 144)
                .EUt(320)
                .duration(80)
                .buildAndRegister();
            // Radiator
                recipes.remove(<immersiveengineering:metal_decoration0:7>);
                assembler.recipeBuilder()
                .outputs(<immersiveengineering:metal_decoration0:7>)
                .inputs(<ore:plateSteel> * 8, <ore:foilSteel> * 32, <ore:blockElectrum>)
                .fluidInputs(<liquid:soldering_alloy> * 144)
                .EUt(320)
                .duration(80)
                .buildAndRegister();
    // ======== Fixes ======== //
        // ==== Decoration Blocks ==== //
            // Aluminium Fence
                recipes.remove(<immersiveengineering:metal_decoration1:4>);
                recipes.addShaped("ggn_ie_alufence", <immersiveengineering:metal_decoration1:4> * 3,
                [
                    [<ore:plateAluminium>, <ore:stickAluminium>, <ore:plateAluminium>],
                    [<ore:plateAluminium>, <ore:stickAluminium>, <ore:plateAluminium>]
                ]);
                

            

// ================ Immersive Engineering ================ //


