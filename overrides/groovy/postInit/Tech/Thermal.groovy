// Imports

// ================ Thermal ================ //
    // ======== Definitions ======== //
        def phytogenicInsolator = item('thermalexpansion:machine', 4)
        def phytoEfficiency = item('thermalexpansion:augment', 320)
        def phytoTree = item('thermalexpansion:augment', 323)
        def phytoCycle = item('thermalexpansion:augment', 324)
        //def alchemicalImbuer = item('thermalexpansion:machine', 12)
        def aqueousAccumulator = item('thermalexpansion:device')
        def nullifier = item('thermalexpansion:device', 1)
        def arborealExtractor = item('thermalexpansion:device', 3)
        def itemAllocator = item('thermalexpansion:device', 5)
        def fluidAllocator = item('thermalexpansion:device', 6)
        def decoctiveDiffuser = item('thermalexpansion:device', 9)
        def creatureEncapulator = item('thermalexpansion:device', 11)
        def vacuumulator = item('thermalexpansion:device', 12)
        def thermalCache = item('thermalexpansion:cache')
        def portableTank = item('thermalexpansion:tank')
        def satchelBasic = item('thermalexpansion:satchel')
        def satchelHardened = item('thermalexpansion:satchel', 1)
        def satchelReinforced = item('thermalexpansion:satchel', 2)
        def satchelSignalum = item('thermalexpansion:satchel', 3)
        def satchelResonant = item('thermalexpansion:satchel', 4)
        def satchelVoid = item('thermalexpansion:satchel', 100)
        def fluxCapacitor = item('thermalexpansion:capacitor')
        def fluxCapacitorHardened = item('thermalexpansion:capacitor', 1)
        def fluxCapacitorReinforced = item('thermalexpansion:capacitor', 2)
        def fluxCapacitorSignalum = item('thermalexpansion:capacitor', 3)
        def fluxCapacitorResonant = item('thermalexpansion:capacitor', 4)
        def reservoirBasic = item('thermalexpansion:reservoir')
        def reservoirHardened = item('thermalexpansion:reservoir', 1)
        def reservoirReinforced = item('thermalexpansion:reservoir', 2)
        def reservoirSignalum = item('thermalexpansion:reservoir', 3)
        def reservoirResonant = item('thermalexpansion:reservoir', 4)

        def buzzsawAluminium = metaitem('toolHeadBuzzSawAluminium')

        def concentratedTerra = item('greggenuity:concentratedterra')
        def concentratedAer = item('greggenuity:concentratedaer')
        def concentratedIgnis = item('greggenuity:concentratedignis')
        def concentratedAqua = item('greggenuity:concentratedaqua')

        def phytogro = item('thermalfoundation:fertilizer')
        def phytogroRich = item('thermalfoundation:fertilizer', 1)
        def phytogroFluxed = item('thermalfoundation:fertilizer', 2)

        def treatedWoodPipe = metaitem('pipeNormalFluidTreatedWood')
        def hopper = item('minecraft:hopper')
        def drumBronze = metaitem('drum.bronze')

        def thermalMorb = item('thermalexpansion:morb')
        def upgradekitHardened = item('thermalfoundation:upgrade')
        def upgradekitReinforced = item('thermalfoundation:upgrade', 33)
        def upgradekitSignalum = item('thermalfoundation:upgrade', 34)
        def upgradekitResonant = item('thermalfoundation:upgrade', 35)
        def thermalMorbReusable = item('thermalexpansion:morb', 1)

        def batterylithium = metaitem('battery.re.lv.lithium')
        def cellSteel = metaitem('large_fluid_cell.steel')

    // ======== Hiding ======== //
        // ===== JEI Categories ===== //
            mods.jei.category.hideCategory("thermalexpansion.furnace")
            mods.jei.category.hideCategory("thermalexpansion.furnace_food")
            mods.jei.category.hideCategory("thermalexpansion.furnace_ore")
            mods.jei.category.hideCategory("thermalexpansion.furnace_pyrolysis")
            mods.jei.category.hideCategory("thermalexpansion.pulverizer")
            mods.jei.category.hideCategory("thermalexpansion.pulverizer_petrotheum")
            mods.jei.category.hideCategory("thermalexpansion.sawmill")
            mods.jei.category.hideCategory("thermalexpansion.sawmill_tapper")
            mods.jei.category.hideCategory("thermalexpansion.smelter")
            mods.jei.category.hideCategory("thermalexpansion.smelter_pyrotheum")
            mods.jei.category.hideCategory("thermalexpansion.compactor")
            mods.jei.category.hideCategory("thermalexpansion.compactor_mint")
            mods.jei.category.hideCategory("thermalexpansion.compactor_gear")
            mods.jei.category.hideCategory("thermalexpansion.crucible")
            mods.jei.category.hideCategory("thermalexpansion.crucible_lava")
            mods.jei.category.hideCategory("thermalexpansion.refinery")
            mods.jei.category.hideCategory("thermalexpansion.refinery_fossil")
            mods.jei.category.hideCategory("thermalexpansion.refinery_potion")
            mods.jei.category.hideCategory("thermalexpansion.transposer_fill")
            mods.jei.category.hideCategory("thermalexpansion.transposer_extract")
            mods.jei.category.hideCategory("thermalexpansion.centrifuge")
            mods.jei.category.hideCategory("thermalexpansion.centrifuge_mobs")
            mods.jei.category.hideCategory("thermalexpansion.refinery_potion")
            mods.jei.category.hideCategory("thermalexpansion.brewer")
            mods.jei.category.hideCategory("thermalexpansion.enchanter")
            mods.jei.category.hideCategory("thermalexpansion.precipitator")
            mods.jei.category.hideCategory("thermalexpansion.extruder")
            mods.jei.category.hideCategory("thermalexpansion.extruder_sedimentary")
            mods.jei.category.hideCategory("thermalexpansion.steam")
            mods.jei.category.hideCategory("thermalexpansion.magmatic")
            mods.jei.category.hideCategory("thermalexpansion.compression")
            mods.jei.category.hideCategory("thermalexpansion.reactant")
            mods.jei.category.hideCategory("thermalexpansion.reactant_elemental")
            mods.jei.category.hideCategory("thermalexpansion.enervation")
            mods.jei.category.hideCategory("thermalexpansion.numismatic")
            mods.jei.category.hideCategory("thermalexpansion.numismatic_gem")
            mods.jei.category.hideCategory("thermalexpansion.factorizer_combine")
            mods.jei.category.hideCategory("thermalexpansion.factorizer_split")
            mods.jei.category.hideCategory("thermalexpansion.coolant")

        // ===== Hidemap ===== // 
        def hidemap = [
            item('thermalexpansion:augment', 720), //lapidary calibration
            item('thermalexpansion:augment', 704), //disjunctive extraction
            item('thermalexpansion:augment', 688), //elemental catalyzer
            item('thermalexpansion:augment', 674), //agitative manifold
            item('thermalexpansion:augment', 673), //ignition plugs
            item('thermalexpansion:augment', 672), //closed-loop cooling
            item('thermalexpansion:augment', 656), //isentropic reservoir
            item('thermalexpansion:augment', 640), //turbine conv
            item('thermalexpansion:augment', 576), //boiler conv
            item('thermalexpansion:augment', 515), //excitation field limiter
            item('thermalexpansion:augment', 514), //transmission coil ducting
            item('thermalexpansion:augment', 513), //fuel catalyzer
            item('thermalexpansion:augment', 497), //clastic deposition
            item('thermalexpansion:augment', 496), //pyroclastic injection
            item('thermalexpansion:augment', 416), //enstabulation apparatus
            item('thermalexpansion:augment', 369), //alchemical retort
            item('thermalexpansion:augment', 368), //reflux column
            item('thermalexpansion:augment', 352), //pyroconvective loop
            item('thermalexpansion:augment', 337), //gearworking die
            item('thermalexpansion:augment', 336), //numismatic press
            item('thermalexpansion:augment', 304), //pyro-concentrator
            item('thermalexpansion:augment', 303), //metallurgic recovery
            item('thermalexpansion:augment', 288), //resin fuel
            item('thermalexpansion:augment', 273), //tectonic initiator
            item('thermalexpansion:augment', 258), //pyrolytic conversion
            item('thermalexpansion:augment', 257), //flux anodizers
            item('thermalexpansion:augment', 256), //trivection chamber

            item('thermalexpansion:cell'), //energy cell
            item('thermalexpansion:frame', 129), //cell frame hardened empty
            item('thermalexpansion:frame', 130), //cell frame reinforced empty
            item('thermalexpansion:frame', 131), //cell frame signalum empty
            item('thermalexpansion:frame', 132), //cell frame resonant empty
            item('thermalexpansion:frame', 146), //cell frame reinforced full
            item('thermalexpansion:frame', 147), //cell frame signalum full
            item('thermalexpansion:frame', 148), //cell frame resonant full 

            item('thermalexpansion:frame'), //machine frame
            item('thermalexpansion:frame', 64), //device frame
            item('thermalexpansion:frame', 128), //energy cell frame


            item('thermalfoundation:material', 512), //redstone servo
            item('thermalfoundation:material', 513), //redstone reception coil
            item('thermalfoundation:material', 514), //redstone transmission coil
            item('thermalfoundation:material', 515), //redstone conductance coil
            item('thermalfoundation:material', 656), //drill
            item('thermalfoundation:material', 657), //sawblade

            item('thermalfoundation:dye'), //Pigments
            item('thermalfoundation:dye', 1), 
            item('thermalfoundation:dye', 2), 
            item('thermalfoundation:dye', 3), 
            item('thermalfoundation:dye', 4), 
            item('thermalfoundation:dye', 5), 
            item('thermalfoundation:dye', 6), 
            item('thermalfoundation:dye', 7), 
            item('thermalfoundation:dye', 8), 
            item('thermalfoundation:dye', 9), 
            item('thermalfoundation:dye', 10), 
            item('thermalfoundation:dye', 11), 
            item('thermalfoundation:dye', 12), 
            item('thermalfoundation:dye', 13), 
            item('thermalfoundation:dye', 14), 
            item('thermalfoundation:dye', 15),

            item('thermalfoundation:coin'), //Coins
            item('thermalfoundation:coin', 1),
            item('thermalfoundation:coin', 64),
            item('thermalfoundation:coin', 65),
            item('thermalfoundation:coin', 66),
            item('thermalfoundation:coin', 67),
            item('thermalfoundation:coin', 68),
            item('thermalfoundation:coin', 69),
            item('thermalfoundation:coin', 70),
            item('thermalfoundation:coin', 71),
            item('thermalfoundation:coin', 72),
            item('thermalfoundation:coin', 96),
            item('thermalfoundation:coin', 97),
            item('thermalfoundation:coin', 98),
            item('thermalfoundation:coin', 99),
            item('thermalfoundation:coin', 100),
            item('thermalfoundation:coin', 101),
            item('thermalfoundation:coin', 102),
            item('thermalfoundation:coin', 103),

            item('thermalfoundation:tome_lexicon'), //forge lexicon

            item('thermalfoundation:upgrade', 1), //upgrade kits - reinforced
            item('thermalfoundation:upgrade', 2), //signalum
            item('thermalfoundation:upgrade', 3), //resonant

            item('thermalfoundation:rockwool'), //rockwool
            item('thermalfoundation:rockwool', 1),
            item('thermalfoundation:rockwool', 2),
            item('thermalfoundation:rockwool', 3),
            item('thermalfoundation:rockwool', 4),
            item('thermalfoundation:rockwool', 5),
            item('thermalfoundation:rockwool', 6),
            item('thermalfoundation:rockwool', 7),
            item('thermalfoundation:rockwool', 8),
            item('thermalfoundation:rockwool', 9),
            item('thermalfoundation:rockwool', 10),
            item('thermalfoundation:rockwool', 11),
            item('thermalfoundation:rockwool', 12),
            item('thermalfoundation:rockwool', 13),
            item('thermalfoundation:rockwool', 14),
            item('thermalfoundation:rockwool', 15),

            item('thermalfoundation:material', 228), //constantan
            item('thermalfoundation:material', 164),
            item('thermalfoundation:glass_alloy', 4),
            item('thermalfoundation:storage_alloy', 4)

        ]
            for (entry in hidemap) {
                mods.jei.ingredient.yeet(entry)
            }
    // ======== Machines ======== //
        // ===== Removing Recipes ===== //
            def thermalMachines = [
                phytogenicInsolator,
                //alchemicalImbuer,
                aqueousAccumulator,
                nullifier,
                arborealExtractor,
                itemAllocator,
                fluidAllocator,
                decoctiveDiffuser,
                creatureEncapulator,
                vacuumulator
            ]
                for (entry in thermalMachines) {
                    crafting.removeByOutput(entry)
                }
        // ===== Phytogenic Insolator ===== //
            // Machine
            crafting.addShaped("ggn_thermal_phyto", phytogenicInsolator,
            [
                [robotarmmv, seedWheat, robotarmmv],
                [concentratedTerra, hullmv, concentratedAqua],
                [plateInvar, plateInvar, plateInvar]
            ])
            // Nutrient Recovery - Efficient fertilizer upgrade
            crafting.addShaped("ggn_thermal_phytoefficiency", phytoEfficiency,
            [
                [screwSteel, phytogroFluxed, screwSteel],
                [circuitMv, plateAluminium, circuitMv],
                [screwSteel, phytogroFluxed, screwSteel]
            ])
            // Sapling Infuser - Trees in Phyto
            crafting.addShaped("ggn_thermal_phytotree", phytoTree,
            [
                [screwSteel, treeSapling, screwSteel],
                [circuitHv, plateAluminium, circuitHv],
                [screwSteel, treeSapling, screwSteel]
            ])
            // Monoculture Cycle - No seed/sapling consumption
            crafting.addShaped("ggn_thermal_phytocycle", phytoCycle,
            [
                [screwSteel, concentratedAer, screwSteel],
                [circuitHv, plateAluminium, circuitHv],
                [screwSteel, concentratedIgnis, screwSteel]
            ])
        // ===== Aqueous Accumulator ===== //
            assline.recipeBuilder()
                .inputs(hullluv, pumpluv * 4, plateDenseAquaInfused * 32, concentratedAqua * 32)
                .fluidInputs(solder * 1152, lubricant * 576)
                .outputs(aqueousAccumulator)
                .EUt(12000)
                .duration(600)
                .buildAndRegister()
        // ===== Nullifier ===== //
            crafting.addShaped("ggn_thermal_nullifier", nullifier,
            [
                [conveyorlv, plateAluminium, conveyorlv],
                [pistonlv, hulllv, pistonlv],
                [plateAluminium, pearlEnder, plateAluminium]
            ])
        // ===== Arboreal Extractor ===== //
            crafting.addShaped("ggn_thermal_arborealextractor", arborealExtractor,
            [
                [pumplv, plateInvar, pumplv],
                [treatedWoodPipe, hulllv, treatedWoodPipe],
                [plateInvar, plateInvar, plateInvar]
            ])
        // ===== Item Allocator ===== //
            crafting.addShaped("ggn_thermal_itemallocator", itemAllocator,
            [
                [plateAluminium, anychest, plateAluminium],
                [conveyorlv, hulllv, conveyorlv],
                [plateAluminium, hopper, plateAluminium]
            ])
        // ===== Fluid Allocator ===== //
            crafting.addShaped("ggn_thermal_fluidallocator", fluidAllocator,
            [
                [plateAluminium, drumBronze, plateAluminium],
                [pumplv, hulllv, pumplv],
                [plateAluminium, hopper, plateAluminium]
            ])
        // ===== Decoctive Diffuser ===== //
            crafting.addShaped("ggn_thermal_decoctive", decoctiveDiffuser,
            [
                [null, circuitHv, null],
                [rotorSteel, fluidAllocator, rotorSteel],
                [plateAluminium, plateAluminium, plateAluminium]
            ])
        // ===== Creature Encapulator ===== //
            crafting.addShaped("ggn_thermal_creatureencapulator", creatureEncapulator,
            [
                [pearlEnder, thermalMorb, pearlEnder],
                [conveyormv, hullmv, conveyormv],
                [plateAluminium, plateAluminium, plateAluminium]
            ])
        // ===== Vacuumulator ===== //
            crafting.addShaped("ggn_thermal_vacuumulator", vacuumulator,
            [
                [glasstube, rotorSteel, glasstube],
                [pumplv, hulllv, pistonlv],
                [plateSteel, plateSteel, plateSteel]
            ])
    // ======== Utility ======== //
        // ===== Removing Recipes ===== //
            def thermalUtility = [
                portableTank,
                thermalCache,
                satchelBasic,
                satchelHardened,
                satchelReinforced,
                satchelSignalum,
                satchelResonant,
                satchelVoid,
                upgradekitHardened,
                upgradekitReinforced,
                upgradekitSignalum,
                upgradekitResonant,
                fluxCapacitor,
                fluxCapacitorHardened,
                fluxCapacitorReinforced,
                fluxCapacitorSignalum,
                fluxCapacitorResonant
            ]
                for (entry in thermalUtility) {
                    crafting.removeByOutput(entry)
                }
        // ===== Fluid Tank ===== //
            crafting.addShaped("ggn_thermal_fluidtank", portableTank,
            [
                [screwSteel, blockGlassTempered, screwSteel],
                [plateGlass, drumBronze, plateGlass],
                [plateBronze, plateBronze, plateBronze]
            ])
        // ===== Cache ===== //
            crafting.addShaped("ggn_thermal_cache", thermalCache,
            [
                [screwSteel, pearlEnder, screwSteel],
                [plateDoubleSteel, anydrawer, plateDoubleSteel],
                [plateInvar, plateInvar, plateInvar]
            ])
        // ===== Upgrade Kits ===== //
            // Hardened
                crafting.addShaped("ggn_thermal_hardenedupgrade", upgradekitHardened,
                [
                    [circuitMv, plateInvar, circuitMv],
                    [plateInvar, plateObsidian, plateInvar],
                    [plateInvar, plateInvar, plateInvar]
                ])
            // Reinforced
                crafting.addShaped("ggn_thermal_reinforcedupgrade", upgradekitReinforced,
                [
                    [circuitHv, plateElectrum, circuitHv],
                    [plateElectrum, upgradekitHardened, plateElectrum],
                    [plateElectrum, plateElectrum, plateElectrum]
                ])
            // Signalum
                crafting.addShaped("ggn_thermal_signalumupgrade", upgradekitSignalum,
                [
                    [circuitEv, plateSignalum, circuitEv],
                    [plateSignalum, upgradekitReinforced, plateSignalum],
                    [plateSignalum, plateSignalum, plateSignalum]
                ])
            // Resonant
                crafting.addShaped("ggn_thermal_resonantupgrade", upgradekitResonant,
                [
                    [circuitIv, plateEnderium, circuitIv],
                    [plateEnderium, upgradekitSignalum, plateEnderium],
                    [plateEnderium, plateEnderium, plateEnderium]
                ])
        // ===== Satchel ===== //
            // Basic
                crafting.addShaped("ggn_thermal_satchel", satchelBasic,
                [
                    [itemLeather, itemString, itemLeather],
                    [plateWroughtIron, anychest, plateWroughtIron],
                    [itemString, plateWroughtIron, itemString]
                ])
            // Hardened
                crafting.addShapeless("ggn_thermal_satchelhardened", satchelHardened,
                [satchelBasic, upgradekitHardened])
            // Reinforced
                crafting.addShapeless("ggn_thermal_satchelreinforced", satchelReinforced,
                [satchelHardened, upgradekitReinforced])
            // Signalum
                crafting.addShapeless("ggn_thermal_satchelsignalum", satchelSignalum,
                [satchelReinforced, upgradekitSignalum])
            // Resonant
                crafting.addShapeless("ggn_thermal_satchelresonant", satchelResonant,
                [satchelSignalum, upgradekitResonant])
        // ===== Flux Capacitor ===== //
            // Basic
                crafting.addShaped("ggn_thermal_fluxcapacitor", fluxCapacitor,
                [
                    [foilRedAlloy, plateBatteryAlloy, foilRedAlloy],
                    [plateBatteryAlloy, batterylithium, plateBatteryAlloy],
                    [null, circuitlv, null]
                ])
            // Hardened
                crafting.addShaped("ggn_thermal_fluxcapacitorhardened", fluxCapacitorHardened,
                [
                    [foilAluminium, upgradekitHardened, foilAluminium],
                    [plateInvar, fluxCapacitor, plateInvar],
                    [null, circuitMv, null]
                ])
            // Reinforced
                crafting.addShaped("ggn_thermal_fluxcapacitorreinforced", fluxCapacitorReinforced,
                [
                    [foilStainlessSteel, upgradekitReinforced, foilStainlessSteel],
                    [plateElectrum, fluxCapacitorHardened, plateElectrum],
                    [null, circuitHv, null]
                ])
            // Signalum
                crafting.addShaped("ggn_thermal_fluxcapacitorsignalum", fluxCapacitorSignalum,
                [
                    [foilBlackSteel, upgradekitSignalum, foilBlackSteel],
                    [plateSignalum, fluxCapacitorReinforced, plateSignalum],
                    [null, circuitEv, null]
                ])
            // Resonant
                crafting.addShaped("ggn_thermal_fluxcapacitorresonant", fluxCapacitorResonant,
                [
                    [foilIridium, upgradekitResonant, foilIridium],
                    [plateEnderium, fluxCapacitorSignalum, plateEnderium],
                    [null, circuitIv, null]
                ])



        // ===== Reservoir ===== //
            // Removing Recipes
                crafting.remove("thermalexpansion:reservoir")
                crafting.remove("thermalexpansion:reservoir_1")
                crafting.remove("thermalexpansion:reservoir_2")
                crafting.remove("thermalexpansion:reservoir_3")
                crafting.remove("thermalexpansion:reservoir_4")

            // Basic
                crafting.addShaped("ggn_thermal_reservoir", reservoirBasic,
                [
                    [screwSteel, portableTank, screwSteel],
                    [plateSteel, cellSteel, plateSteel],
                    [blockGlassTempered, blockGlassTempered, blockGlassTempered]
                ])
            // Hardened
                crafting.addShaped("ggn_thermal_reservoirhardened", reservoirHardened,
                [
                    [screwInvar, blockGlassTempered, screwInvar],
                    [plateInvar, reservoirBasic, plateInvar],
                    [blockGlassTempered, blockGlassTempered, blockGlassTempered]
                ])
            // Reinforced
                crafting.addShaped("ggn_thermal_reservoirreinforced", reservoirReinforced,
                [
                    [screwElectrum, blockGlassTempered, screwElectrum],
                    [plateElectrum, reservoirHardened, plateElectrum],
                    [blockGlassTempered, blockGlassTempered, blockGlassTempered]
                ])
            // Signalum
                crafting.addShaped("ggn_thermal_reservoirsignalum", reservoirSignalum,
                [
                    [screwSignalum, blockGlassTempered, screwSignalum],
                    [plateSignalum, reservoirReinforced, plateSignalum],
                    [blockGlassTempered, blockGlassTempered, blockGlassTempered]
                ])
            // Resonant
                crafting.addShaped("ggn_thermal_reservoirresonant", reservoirResonant,
                [
                    [screwEnderium, blockGlassTempered, screwEnderium],
                    [plateEnderium, reservoirSignalum, plateEnderium],
                    [blockGlassTempered, blockGlassTempered, blockGlassTempered]
                ])
    // ======== Morb Centrifuging ======== //
        // Creating Morbs
            //Normal Morb
            crafting.removeByOutput(thermalMorb)
            crafting.addShaped("ggn_thermal_morb", thermalMorb * 4, 
            [
                [null, glasstube, null],
                [blockGlassReinforced, pearlEnderEye, blockGlassReinforced],
                [null, glasstube, null]
            ])
            //Reusable
            crafting.removeByOutput(thermalMorbReusable)

        // Centrifuging Map
            def morbCentrifugingBasic = [
                [item('thermalexpansion:morb').withNbt(['id': 'minecraft:polar_bear'])]          : [first:item('minecraft:fish'), second:item('minecraft:fish', 1), third:metaitem('dustIce')],
                [item('thermalexpansion:morb').withNbt(['id': 'minecraft:mooshroom'])]           : [first:item('minecraft:beef'), second:item('minecraft:brown_mushroom'), third:item('minecraft:red_mushroom')],
                [item('thermalexpansion:morb').withNbt(['id': 'minecraft:slime'])]               : [first:item('minecraft:slime_ball'), second:item('minecraft:slime_ball'), third:item('minecraft:slime_ball')],
                [item('thermalexpansion:morb').withNbt(['id': 'minecraft:guardian'])]            : [first:item('minecraft:prismarine_shard'), second:item('minecraft:prismarine_crystals'), third:item('minecraft:sponge', 1)],
                [item('thermalexpansion:morb').withNbt(['id': 'minecraft:ghast'])]               : [first:item('minecraft:gunpowder'), second:item('minecraft:ghast_tear'), third:item('minecraft:ghast_tear')],
                [item('thermalexpansion:morb').withNbt(['id': 'minecraft:donkey'])]              : [first:item('minecraft:leather'), second:item('minecraft:leather'), third:item('minecraft:leather')],
                [item('thermalexpansion:morb').withNbt(['id': 'minecraft:blaze'])]               : [first:item('minecraft:blaze_rod'), second:metaitem('dustSulfur'), third:item('minecraft:blaze_powder')],
                [item('thermalexpansion:morb').withNbt(['id': 'minecraft:villager'])]            : [first:metaitem('dustTinyEmerald'), second:metaitem('dustSmallEmerald'), third:metaitem('dustEmerald')],
                [item('thermalexpansion:morb').withNbt(['id': 'minecraft:enderman'])]            : [first:item('minecraft:ender_pearl'), second:metaitem('dustEnderPearl'), third:metaitem('dustTinyEnderPearl')],
                [item('thermalexpansion:morb').withNbt(['id': 'minecraft:vindication_illager'])] : [first:metaitem('dustSmallEmerald'), second:metaitem('dustEmerald'), third:item('minecraft:emerald')],
                [item('thermalexpansion:morb').withNbt(['id': 'quark:ashen'])]                   : [first:item('minecraft:bone'), second:item('minecraft:arrow'), third:metaitem('dustDarkAsh')],
                [item('thermalexpansion:morb').withNbt(['id': 'minecraft:squid'])]               : [first:item('minecraft:fish'), second:item('minecraft:dye'), third:item('minecraft:dye')],
                [item('thermalexpansion:morb').withNbt(['id': 'minecraft:parrot'])]              : [first:item('minecraft:feather'), second:item('minecraft:feather'), third:item('quark:parrot_egg', 4)],
                [item('thermalexpansion:morb').withNbt(['id': 'minecraft:zombie'])]              : [first:item('minecraft:rotten_flesh'), second:item('minecraft:potato'), third:metaitem('dustSmallIron')],
                [item('thermalexpansion:morb').withNbt(['id': 'minecraft:silverfish'])]          : [first:metaitem('dustTinySilver'), second:metaitem('dustTinySilver'), third:metaitem('dustSilver')],
                [item('thermalexpansion:morb').withNbt(['id': 'minecraft:bat'])]                 : [first:item('minecraft:leather'), second:item('minecraft:leather'), third:metaitem('dustStone')],
                [item('thermalexpansion:morb').withNbt(['id': 'minecraft:husk'])]                : [first:item('minecraft:rotten_flesh'), second:item('minecraft:potato'), third:metaitem('dustSmallIron')],
                [item('thermalexpansion:morb').withNbt(['id': 'minecraft:elder_guardian'])]      : [first:item('minecraft:prismarine_shard') * 4, second:item('minecraft:prismarine_crystals') * 4, third:item('minecraft:sponge', 1) * 4],
                [item('thermalexpansion:morb').withNbt(['id': 'minecraft:rabbit'])]              : [first:item('minecraft:rabbit_hide'), second:item('minecraft:rabbit'), third:item('minecraft:rabbit_foot')],
                [item('thermalexpansion:morb').withNbt(['id': 'thermalfoundation:blizz'])]       : [first:item('thermalfoundation:material', 2048), second:item('minecraft:snowball'), third:metaitem('dustIce')],
                [item('thermalexpansion:morb').withNbt(['id': 'minecraft:endermite'])]           : [first:metaitem('dustTinyEnderPearl'), second:metaitem('dustEndstone'), third:metaitem('dustEnderPearl')],
                [item('thermalexpansion:morb').withNbt(['id': 'minecraft:cave_spider'])]         : [first:item('minecraft:string'), second:item('minecraft:spider_eye'), third:item('minecraft:string')],
                [item('thermalexpansion:morb').withNbt(['id': 'minecraft:zombie_horse'])]        : [first:item('minecraft:rotten_flesh'), second:item('minecraft:rotten_flesh'), third:item('minecraft:leather')],
                [item('thermalexpansion:morb').withNbt(['id': 'minecraft:zombie_villager'])]     : [first:item('minecraft:rotten_flesh'), second:metaitem('dustSmallEmerald'), third:metaitem('dustEmerald')],
                [item('thermalexpansion:morb').withNbt(['id': 'minecraft:magma_cube'])]          : [first:item('minecraft:magma_cream'), second:metaitem('dustSulfur'), third:metaitem('dustNetherrack')],
                [item('thermalexpansion:morb').withNbt(['id': 'minecraft:stray'])]               : [first:item('minecraft:bone'), second:item('minecraft:arrow'), third:metaitem('dustIce')],
                [item('thermalexpansion:morb').withNbt(['id': 'minecraft:shulker'])]             : [first:item('minecraft:shulker_shell'), second:metaitem('dustEndstone'), third:metaitem('dustEnderPearl')],
                [item('thermalexpansion:morb').withNbt(['id': 'minecraft:sheep'])]               : [first:item('minecraft:mutton'), second:item('minecraft:wool'), third:item('minecraft:wool')],
                [item('thermalexpansion:morb').withNbt(['id': 'minecraft:skeleton'])]            : [first:item('minecraft:bone'), second:item('minecraft:arrow'), third:metaitem('dustCalcium')],
                [item('thermalexpansion:morb').withNbt(['id': 'minecraft:cow'])]                 : [first:item('minecraft:leather'), second:item('minecraft:beef'), third:item('minecraft:beef')],
                [item('thermalexpansion:morb').withNbt(['id': 'minecraft:zombie_pigman'])]       : [first:item('minecraft:rotten_flesh'), second:item('minecraft:porkchop'), third:metaitem('dustSmallGold')],
                [item('thermalexpansion:morb').withNbt(['id': 'minecraft:skeleton_horse'])]      : [first:item('minecraft:bone'), second:item('minecraft:bone'), third:item('minecraft:leather')],
                [item('thermalexpansion:morb').withNbt(['id': 'quark:dweller'])]                 : [first:item('minecraft:rotten_flesh'), second:item('minecraft:potato'), third:metaitem('dustSmallIron')],
                [item('thermalexpansion:morb').withNbt(['id': 'thermalfoundation:basalz'])]      : [first:item('thermalfoundation:material', 2052), second:metaitem('dustObsidian'), third:metaitem('dustObsidian')],
                [item('thermalexpansion:morb').withNbt(['id': 'minecraft:chicken'])]             : [first:item('minecraft:feather'), second:item('minecraft:chicken'), third:item('minecraft:bone')],
                [item('thermalexpansion:morb').withNbt(['id': 'thermalfoundation:blitz'])]       : [first:item('thermalfoundation:material', 2050), second:metaitem('dustSaltpeter'), third:metaitem('dustSaltpeter')],
                [item('thermalexpansion:morb').withNbt(['id': 'minecraft:spider'])]              : [first:item('minecraft:string'), second:item('minecraft:spider_eye'), third:item('minecraft:string')],
                [item('thermalexpansion:morb').withNbt(['id': 'minecraft:pig'])]                 : [first:item('minecraft:porkchop'), second:item('minecraft:porkchop'), third:item('quark:tallow')],
                [item('thermalexpansion:morb').withNbt(['id': 'minecraft:witch'])]               : [first:item('minecraft:glowstone_dust'), second:item('minecraft:redstone'), third:item('minecraft:gunpowder')],
                [item('thermalexpansion:morb').withNbt(['id': 'minecraft:llama'])]               : [first:item('minecraft:wool'), second:item('minecraft:leather'), third:item('minecraft:leather')],
                ]
            for (entry in morbCentrifugingBasic) {
                centrifuge.recipeBuilder().EUt(40).duration(200)
                .inputs(entry.key)
                .chancedOutput(thermalMorb, 2500, 500)
                .chancedOutput(entry.value.first * 3, 2500, 1000)
                .chancedOutput(entry.value.second * 2, 2000, 1000)
                .chancedOutput(entry.value.third, 1500, 1000)
                .fluidOutputs(fluid("experience") * 100)
                .buildAndRegister()
            }
        // Specific Recipes
            // Evoker
                centrifuge.recipeBuilder().EUt(40).duration(200)
                    .inputs(item('thermalexpansion:morb').withNbt(['id': 'minecraft:evocation_illager']))
                    .chancedOutput(thermalMorb, 2500, 500)
                    .chancedOutput(metaitem('dustTinyEmerald') * 3, 2500, 1000)
                    .chancedOutput(metaitem('dustSmallEmerald') * 2, 2000, 1000)
                    .chancedOutput(metaitem('dustEmerald'), 1500, 1000)
                    .chancedOutput(item('minecraft:totem_of_undying'), 1000, 100)
                    .fluidOutputs(fluid("experience") * 100)
                    .buildAndRegister()
            // Wither Skeleton
                centrifuge.recipeBuilder().EUt(40).duration(200)
                    .inputs(item('thermalexpansion:morb').withNbt(['id': 'minecraft:wither_skeleton']))
                    .chancedOutput(thermalMorb, 2500, 500)
                    .chancedOutput(item('minecraft:coal') * 3, 2500, 1000)
                    .chancedOutput(item('darkutils:material') * 2, 2000, 1000)
                    .chancedOutput(item("extrautils2:ingredients", 10), 1500, 1000)
                    .chancedOutput(item('minecraft:skull', 1), 100, 100)
                    .fluidOutputs(fluid("experience") * 100)
                    .buildAndRegister()
            // Creeper
                centrifuge.recipeBuilder().EUt(40).duration(200)
                    .inputs(item('thermalexpansion:morb').withNbt(['id': 'minecraft:creeper']))
                    .chancedOutput(thermalMorb, 2500, 500)
                    .chancedOutput(item('minecraft:gunpowder') * 3, 2500, 1000)
                    .chancedOutput(item('minecraft:sand') * 2, 2000, 1000)
                    .chancedOutput(metaitem('gelled_toluene'), 1500, 1000)
                    .fluidOutputs(fluid("experience") * 100)
                    .chancedFluidOutput(fluid("sulfuric_acid") * 250, 1000, 500)
                    .buildAndRegister()
            // Horse
                centrifuge.recipeBuilder().EUt(40).duration(200)
                    .inputs(item('thermalexpansion:morb').withNbt(['id': 'minecraft:horse']))
                    .chancedOutput(thermalMorb, 2500, 500)
                    .chancedOutput(item('minecraft:leather') * 3, 2500, 1000)
                    .chancedOutput(item('minecraft:leather') * 2, 2000, 1000)
                    .chancedOutput(item("minecraft:leather"), 1500, 1000)
                    .fluidOutputs(fluid("experience") * 100)
                    .chancedFluidOutput(fluid("glue") * 250, 1000, 500)
                    .buildAndRegister()


// ===== Misc ===== //

// ================ Thermal ================ //
