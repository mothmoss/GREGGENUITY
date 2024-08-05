// Imports

// ================ Immersive Engineering ================ //
    // ======== Definitions ======== //
        // ===== IE ===== //
            def aluminiumFence = item('immersiveengineering:metal_decoration1', 4)

            def ieRedstoneBlock = item('immersiveengineering:metal_decoration0', 3)
            def ieLightBlock = item('immersiveengineering:metal_decoration0', 4)
            def ieHeavyBlock = item('immersiveengineering:metal_decoration0', 5)
            def ieGeneratorBlock = item('immersiveengineering:metal_decoration0', 6)
            def ieRadiatorBlock = item('immersiveengineering:metal_decoration0', 7)

            def hempcrete = item('immersiveengineering:stone_decoration', 4)
            def ieConcrete = item('immersiveengineering:stone_decoration', 5)

            def fiberHemp = ore("fiberHemp").first
            def seedHemp = item('immersiveengineering:seed')


    // ======== Hiding ======== //
       // ===== Categories ===== //
            mods.jei.category.hideCategory("ie.cokeoven");
            mods.jei.category.hideCategory("ie.alloysmelter");
            mods.jei.category.hideCategory("ie.blastfurnace");
            mods.jei.category.hideCategory("ie.blastfurnace.fuel");
            mods.jei.category.hideCategory("ie.metalPress");
            mods.jei.category.hideCategory("ie.crusher");
            mods.jei.category.hideCategory("ie.workbench");
            mods.jei.category.hideCategory("ie.squeezer");
            mods.jei.category.hideCategory("ie.fermenter");
            mods.jei.category.hideCategory("ie.refinery");
            mods.jei.category.hideCategory("ie.arcFurnace");
            mods.jei.category.hideCategory("ie.bottlingMachine");
            mods.jei.category.hideCategory("ie.mixer");
       // ===== Hidemap ===== //
        def hidemap = [
            item('immersiveengineering:mold'), //Molds
            item('immersiveengineering:mold', 1), 
            item('immersiveengineering:mold', 2), 
            item('immersiveengineering:mold', 3), 
            item('immersiveengineering:mold', 4), 
            item('immersiveengineering:mold', 5), 
            item('immersiveengineering:mold', 5), 
            item('immersiveengineering:blueprint'), //Blueprints
            item('immersiveengineering:metal_device0'), //Capacitors
            item('immersiveengineering:metal_device0', 1), 
            item('immersiveengineering:metal_device0', 1), 
            item('immersiveengineering:metal_device0', 3), 
            item('immersiveengineering:wirecoil'), //Wire Coils
            item('immersiveengineering:wirecoil', 1),
            item('immersiveengineering:wirecoil', 2),
            item('immersiveengineering:wirecoil', 6), //Insulated
            item('immersiveengineering:wirecoil', 7),
            item('immersiveengineering:material', 20), //Wire Items
            item('immersiveengineering:material', 21),
            item('immersiveengineering:material', 22),
            item('immersiveengineering:material', 23),
            item('immersiveengineering:graphite_electrode'), //HOP Graphite
            item('immersiveengineering:material', 19), 
            item('immersiveengineering:material', 18),
            item('immersiveengineering:material', 7), //Slag
            item('immersiveengineering:material', 8), //Mechanical Components
            item('immersiveengineering:material', 9),
            item('immersiveengineering:storage', 6), //constantan
            item('immersiveengineering:storage_slab', 6),
            item('immersiveengineering:sheetmetal', 6),
            item('immersiveengineering:sheetmetal_slab', 6),
        ]
                for (entry in hidemap) {
                    mods.jei.ingredient.yeet(entry)
                }
    // ======== Excavator ======== //
        mods.immersiveengineering.excavator.removeAll()
        // ===== Overworld (0) ===== //
            // == Stannic == //
                mods.immersiveengineering.excavator.recipeBuilder()
                    .name("Stannic")
                    .weight(100)
                    .fail(0)
                    .ore(ore("oreTin"), 100)
                    .ore(ore("oreWulfenite"), 50)
                    .ore(ore("oreCassiteriteSand"), 25)
                    .ore(ore("oreStibnite"), 25)
                    .dimension(0)
                    .register()
            // == Argentum == //
                mods.immersiveengineering.excavator.recipeBuilder()
                    .name("Argentum")
                    .weight(100)
                    .fail(0)
                    .ore(ore("oreSilver"), 75)
                    .ore(ore("oreLead"), 75)
                    .ore(ore("oreGalena"), 30)
                    .ore(ore("oreTantalite"), 20)
                    .dimension(0)
                    .register()
            // == Gemstone == //
                mods.immersiveengineering.excavator.recipeBuilder()
                    .name("Gemstone")
                    .weight(100)
                    .fail(0)
                    .ore(ore("oreTopaz"), 40)
                    .ore(ore("oreSapphire"), 40)
                    .ore(ore("oreGarnetRed"), 40)
                    .ore(ore("oreAlmadine"), 40)
                    .ore(ore("oreRuby"), 40)
                    .dimension(0)
                    .register()
            // == Ferric == //
                mods.immersiveengineering.excavator.recipeBuilder()
                    .name("Ferric")
                    .weight(100)
                    .fail(0)
                    .ore(ore("oreIron"), 100)
                    .ore(ore("oreBrownLimonite"), 50)
                    .ore(ore("oreYellowLimonite"), 50)
                    .ore(ore("oreMolybdenum"), 25)
                    .ore(ore("oreDiatomite"), 25)
                    .dimension(0)
                    .register()
            // == Cupric == //
                mods.immersiveengineering.excavator.recipeBuilder()
                    .name("Cupric")
                    .weight(100)
                    .fail(0)
                    .ore(ore("oreCopper"), 100)
                    .ore(ore("oreChalcopyrite"), 50)
                    .ore(ore("oreSpodumene"), 25)
                    .ore(ore("oreTetrahedrite"), 25)
                    .dimension(0)
                    .register()
            // == Precious == //
                mods.immersiveengineering.excavator.recipeBuilder()
                    .name("Precious")
                    .weight(100)
                    .fail(0)
                    .ore(ore("oreNickel"), 100)
                    .ore(ore("oreCobalt"), 50)
                    .ore(ore("oreGold"), 40)
                    .ore(ore("oreDiamond"), 10)
                    .dimension(0)
                    .register()
            // == Magnetic == //
                mods.immersiveengineering.excavator.recipeBuilder()
                    .name("Magnetic")
                    .weight(100)
                    .fail(0)
                    .ore(ore("oreRedstone"), 100)
                    .ore(ore("oreBastnasite"), 50)
                    .ore(ore("orePyrochlore"), 25)
                    .ore(ore("oreMonazite"), 25)
                    .dimension(0)
                    .register()
        // ===== Nether (-1) ===== //
            // == Salt == //
                mods.immersiveengineering.excavator.recipeBuilder()
                    .name("Nether Salt")
                    .weight(100)
                    .fail(0)
                    .ore(ore("oreSalt"), 100)
                    .ore(ore("oreRockSalt"), 50)
                    .ore(ore("oreSaltpeter"), 25)
                    .ore(ore("oreSulfur"), 25)
                    .dimension(-1)
                    .register()
            // == Zinc == //
                mods.immersiveengineering.excavator.recipeBuilder()
                    .name("Nether Zinc")
                    .weight(100)
                    .fail(0)
                    .ore(ore("oreSphalerite"), 100)
                    .ore(ore("oreCalcite"), 50)
                    .ore(ore("oreBornite"), 25)
                    .ore(ore("orePyrope"), 25)
                    .dimension(-1)
                    .register()
            // == Sands == //
                mods.immersiveengineering.excavator.recipeBuilder()
                    .name("Nether Sands")
                    .weight(100)
                    .fail(0)
                    .ore(ore("oreBasalticMineralSand"), 100)
                    .ore(ore("oreRealgar"), 50)
                    .ore(ore("oreMica"), 25)
                    .ore(ore("oreGarnetSand"), 25)
                    .dimension(-1)
                    .register()
            // == Quartz == //
                mods.immersiveengineering.excavator.recipeBuilder()
                    .name("Nether Sands")
                    .weight(100)
                    .fail(0)
                    .ore(ore("oreNetherQuartz"), 100)
                    .ore(ore("oreQuartzite"), 50)
                    .ore(ore("oreCertusQuartz"), 25)
                    .ore(ore("orePyrolusite"), 25)
                    .dimension(-1)
                    .register()
            // == Hazard == //
                mods.immersiveengineering.excavator.recipeBuilder()
                    .name("Nether Hazard")
                    .weight(100)
                    .fail(0)
                    .ore(ore("oreSulfur"), 100)
                    .ore(ore("oreAsbestos"), 50)
                    .ore(ore("orePyrite"), 25)
                    .ore(ore("oreTricalciumPhosphate"), 25)
                    .dimension(-1)
                    .register()
            // == Cobalt == //
                mods.immersiveengineering.excavator.recipeBuilder()
                    .name("Nether Cobalt")
                    .weight(100)
                    .fail(0)
                    .ore(ore("oreSulfur"), 100)
                    .ore(ore("oreAsbestos"), 50)
                    .ore(ore("orePyrite"), 25)
                    .ore(ore("oreTricalciumPhosphate"), 25)
                    .dimension(-1)
                    .register()
        // ===== Luna (100) ===== //
                mods.immersiveengineering.excavator.recipeBuilder()
                    .name("Lunar Rutile")
                    .weight(100)
                    .fail(0)
                    .ore(ore("oreBauxite"), 125)
                    .ore(ore("oreLithium"), 50)
                    .ore(ore("oreIlmenite"), 25)
                    .dimension(100)
                    .register()
    // ======== Items ======== //
        // ===== Multiblock Components ===== //
            // Redstone
                crafting.removeByOutput(ieRedstoneBlock)
                assembler.recipeBuilder()
                    .inputs(circuitHv, plateSteel * 8, foilRedAlloy * 64, foilRedAlloy * 64, blockCopper * 4)
                    .fluidInputs(solder * 144)
                    .outputs(ieRedstoneBlock)
                    .EUt(320)
                    .duration(40)
                    .buildAndRegister();
            // Light
                crafting.removeByOutput(ieLightBlock)
                assembler.recipeBuilder()
                    .inputs(plateSteel * 8, foilAnnealedCopper * 32, blockCopper * 3)
                    .fluidInputs(solder * 144)
                    .outputs(ieLightBlock * 3)
                    .EUt(320)
                    .duration(60)
                    .buildAndRegister();
            // Heavy
                crafting.removeByOutput(ieHeavyBlock)
                assembler.recipeBuilder()
                    .inputs(plateSteel * 8, foilElectrum * 32, blockSteel)
                    .fluidInputs(solder * 144)
                    .outputs(ieHeavyBlock)
                    .EUt(320)
                    .duration(140)
                    .buildAndRegister();
            // Generator
                crafting.removeByOutput(ieGeneratorBlock)
                assembler.recipeBuilder()
                    .inputs(plateSteel * 8, foilCopper * 32, blockCopper)
                    .fluidInputs(solder * 144)
                    .outputs(ieGeneratorBlock * 3)
                    .EUt(320)
                    .duration(140)
                    .buildAndRegister();
            // Radiator
                crafting.removeByOutput(ieRadiatorBlock)
                assembler.recipeBuilder()
                    .inputs(plateSteel * 16, foilSteel * 64, blockElectrum * 3)
                    .fluidInputs(solder * 144)
                    .outputs(ieRadiatorBlock * 3)
                    .EUt(320)
                    .duration(140)
                    .buildAndRegister();
        // ===== Misc ===== //
            // Gunpowder
                crafting.remove("immersiveengineering:material/gunpowder0")
                crafting.remove("immersiveengineering:material/gunpowder1")
            // Concrete
                crafting.remove("immersiveengineering:stone_decoration/concrete")
                crafting.remove("immersiveengineering:stone_decoration/concrete2")
                mixer.recipeBuilder()
                    .inputs(dustStone)
                    .fluidInputs(liquidconcrete * 576)
                    .outputs(ieConcrete * 5)
                    .EUt(16)
                    .duration(60)
                    .buildAndRegister()
            // Hempcrete
                crafting.remove("immersiveengineering:stone_decoration/hempcrete")
                mixer.recipeBuilder()
                    .inputs(fiberHemp)
                    .fluidInputs(liquidconcrete * 576)
                    .outputs(hempcrete * 5)
                    .EUt(16)
                    .duration(60)
                    .buildAndRegister()
            // Hemp
                //Crucible
                mods.tc.crucible.recipeBuilder()
                    .researchKey('UNLOCKALCHEMY@3')
                    .catalyst(seedWheat)
                    .output(seedHemp)
                    .aspect(fabrico * 5)
                    .aspect(bestia * 5)
                    .aspect(herba * 5)
                    .register()
            // Aluminum Fence
                //Crafting Recipe
                crafting.removeByOutput(aluminiumFence)
                crafting.addShaped("ggn_ie_aluminiumfence", aluminiumFence * 3,
                [
                    [plateAluminium, stickAluminium, plateAluminium],
                    [plateAluminium, stickAluminium, plateAluminium]
                ])
                //Macerator Recycling
                macerator.recipeBuilder()
                    .inputs(aluminiumFence)
                    .outputs(dustAluminium)
                    .EUt(2)
                    .duration(12)
                    .buildAndRegister()
                //Arc Furnace 
                arc.recipeBuilder()
                    .inputs(aluminiumFence)
                    .fluidInputs(oxygen * 6)
                    .outputs(ingotAluminium)
                    .EUt(30)
                    .duration(12)
                    .buildAndRegister()







                


// ================ Immersive Engineering ================ //
