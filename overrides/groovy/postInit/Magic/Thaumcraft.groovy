// Imports
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent

// ================ Thaumcraft ================ //
    // ======== Definitions ======== //
        // Shard
            def shardBalance = item('greggenuity:balanceshard')
            def concentratedBalance = item('greggenuity:concentratedbalance')
            def concentratedAer = item('greggenuity:concentratedaer')
            def concentratedAqua = item('greggenuity:concentratedaqua')
            def concentratedOrdo = item('greggenuity:concentratedordo')
            def concentratedPerditio = item('greggenuity:concentratedperditio')
            def concentratedIgnis = item('greggenuity:concentratedignis')
            def concentratedTerra = item('greggenuity:concentratedterra')
        // Alchemy
            def salismundus = item('thaumcraft:salis_mundus')
            def quicksilver = item('thaumcraft:quicksilver')
            def alumentum = item('thaumcraft:alumentum')
        // Ironwood
            def ferrousSapling = item('extrautils2:ironwood_sapling')
            def ferrousSaplingDead = item('extrautils2:ironwood_sapling', 1)
            def ferrousLog = item('extrautils2:ironwood_log')
            def ferrousLogRaw = item('extrautils2:ironwood_log', 1)
            def ferrousPlank = item('extrautils2:ironwood_planks')
            def ferrousPlankRaw = item('extrautils2:ironwood_planks', 1)
        // Artifice
            def resonatorVis = item('thaumcraft:vis_resonator')
            def resonatorMorphic = item('thaumcraft:morphic_resonator')
            def mechanismSimple = item('thaumcraft:mechanism_simple')
            def mechanismAdvanced = item('thaumcraft:mechanism_complex')

            def wirelessEssentiaInput = item('thaumcraft:essentia_input')
            def wirelessEssentiaOutput = item('thaumcraft:essentia_output')
        // Energestics
            def coalescenceCore = item('thaumicenergistics:coalescence_core')
            def diffusionCore = item('thaumicenergistics:diffusion_core')
        // Infusion
            def infusionMatrix = item('thaumcraft:infusion_matrix')
            def treebeacon = item('astralsorcery:blocktreebeacon')
            def peacecandle = item('randomthings:peacecandle')
            def snad = item('snad:snad')
            def snadRed = item('snad:snad', 1)
            def marbleRuned = item('astralsorcery:blockmarble', 6)
            def saplingSilverwood = item('thaumcraft:sapling_silverwood')
            def compressedSand = item('extrautils2:compressedsand', 1)
            def minecraftSand = item('minecraft:sand')
            def watercandle = item('cyclicmagic:water_candle')
            def arcanebore = item('thaumcraft:turret', 2)
            def tcturret = item('thaumcraft:turret')

            def iePickaxeSteel = item('immersiveengineering:pickaxe_steel')
            def ieAxeSteel = item('immersiveengineering:axe_steel')

        // ==== All Shards ==== // 
            def crystalalkimia = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'alkimia', 'amount': 1]]]) 
            def crystalaversio = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'aversio', 'amount': 1]]]) 
            def crystalcaeles = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'caeles', 'amount': 1]]]) 
            def crystalventus = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'ventus', 'amount': 1]]]) 
            def crystalvinculum = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'vinculum', 'amount': 1]]]) 
            def crystalpotentia = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'potentia', 'amount': 1]]]) 
            def crystalvitreus = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'vitreus', 'amount': 1]]]) 
            def crystalspiritus = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'spiritus', 'amount': 1]]]) 
            def crystaltenebrae = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'tenebrae', 'amount': 1]]]) 
            def crystalvolatus = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'volatus', 'amount': 1]]]) 
            def crystalvictus = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'victus', 'amount': 1]]]) 
            def crystalsensus = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'sensus', 'amount': 1]]]) 
            def crystalauram = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'auram', 'amount': 1]]]) 
            def crystalperditio = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'perditio', 'amount': 1]]]) 
            def crystalinstrumentum = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'instrumentum', 'amount': 1]]]) 
            def crystalpraecantatio = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'praecantatio', 'amount': 1]]]) 
            def crystaldesiderium = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'desiderium', 'amount': 1]]]) 
            def crystalalienis = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'alienis', 'amount': 1]]]) 
            def crystalmachina = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'machina', 'amount': 1]]]) 
            def crystalimperium = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'imperium', 'amount': 1]]]) 
            def crystalignis = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'ignis', 'amount': 1]]]) 
            def crystalmotus = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'motus', 'amount': 1]]]) 
            def crystalcognitio = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'cognitio', 'amount': 1]]]) 
            def crystalpermutatio = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'permutatio', 'amount': 1]]]) 
            def crystallux = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'lux', 'amount': 1]]]) 
            def crystalaqua = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'aqua', 'amount': 1]]]) 
            def crystalaer = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'aer', 'amount': 1]]]) 
            def crystalmortuus = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'mortuus', 'amount': 1]]]) 
            def crystalfluctus = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'fluctus', 'amount': 1]]]) 
            def crystalsonus = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'sonus', 'amount': 1]]]) 
            def crystalterra = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'terra', 'amount': 1]]]) 
            def crystaldraco = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'draco', 'amount': 1]]]) 
            def crystalinfernum = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'infernum', 'amount': 1]]]) 
            def crystalvitium = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'vitium', 'amount': 1]]]) 
            def crystalfabrico = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'fabrico', 'amount': 1]]]) 
            def crystalmetallum = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'metallum', 'amount': 1]]]) 
            def crystalpraemunio = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'praemunio', 'amount': 1]]]) 
            def crystalexitium = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'exitium', 'amount': 1]]]) 
            def crystalexanimis = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'exanimis', 'amount': 1]]]) 
            def crystalgelum = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'gelum', 'amount': 1]]]) 
            def crystalbestia = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'bestia', 'amount': 1]]]) 
            def crystalhumanus = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'humanus', 'amount': 1]]]) 
            def crystalherba = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'herba', 'amount': 1]]]) 
            def crystalordo = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'ordo', 'amount': 1]]]) 
            def crystalvisum = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'visum', 'amount': 1]]]) 
            def crystalvacuos = item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key':'vacuos', 'amount': 1]]]) 
    // ======== Shards ======== //
        // ==== Oredicts ==== //
            def thaumcraftShardOredict = [
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'alkimia', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'aversio', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'caeles', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'ventus', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'vinculum', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'potentia', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'vitreus', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'spiritus', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'tenebrae', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'volatus', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'victus', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'sensus', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'auram', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'perditio', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'instrumentum', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'praecantatio', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'desiderium', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'alienis', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'machina', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'imperium', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'ignis', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'motus', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'cognitio', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'permutatio', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'lux', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'aqua', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'aer', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'mortuus', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'fluctus', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'sonus', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'terra', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'draco', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'infernum', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'vitium', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'fabrico', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'metallum', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'praemunio', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'exitium', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'exanimis', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'gelum', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'bestia', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'humanus', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'herba', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'ordo', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'visum', 'amount': 1]]]),
                item('thaumcraft:crystal_essence').withNbt(['Aspects': [['key': 'vacuos', 'amount': 1]]]),
            ]
                for (entry in thaumcraftShardOredict) {
                    oreDict.add("anyShard", entry)
                }
        // ==== General Recipes ==== //
            // Crystal Condensing
                crafting.addShaped("ggn_tc_aercondense", gemAer, [[crystalaer,crystalaer],[crystalaer,crystalaer]])
                crafting.addShaped("ggn_tc_aquacondense", gemAqua, [[crystalaqua,crystalaqua],[crystalaqua,crystalaqua]])
                crafting.addShaped("ggn_tc_ordocondense", gemOrdo, [[crystalordo,crystalordo],[crystalordo,crystalordo]])
                crafting.addShaped("ggn_tc_perditiocondense", gemPerditio, [[crystalperditio,crystalperditio],[crystalperditio,crystalperditio]])
                crafting.addShaped("ggn_tc_igniscondense", gemIgnis, [[crystalignis,crystalignis],[crystalignis,crystalignis]])
                crafting.addShaped("ggn_tc_terracondense", gemTerra, [[crystalterra,crystalterra],[crystalterra,crystalterra]])
            // Gems to Dusts
                // Manual - 2 gem = 1 dust 
                crafting.addShaped("ggn_tc_aerdust", dustAer, [[gtmortar],[gemAer],[gemAer]])
                crafting.addShaped("ggn_tc_aquadust", dustAqua, [[gtmortar],[gemAqua],[gemAqua]])
                crafting.addShaped("ggn_tc_ordodust", dustOrdo, [[gtmortar],[gemOrdo],[gemOrdo]])
                crafting.addShaped("ggn_tc_perditiodust", dustPerditio, [[gtmortar],[gemPerditio],[gemPerditio]])
                crafting.addShaped("ggn_tc_ignisdust", dustIgnis, [[gtmortar],[gemIgnis],[gemIgnis]])
                crafting.addShaped("ggn_tc_terradust", dustTerra, [[gtmortar],[gemTerra],[gemTerra]])
            // Gems to Crystal
                // Manual - 1 gem = 2 crystals
                crafting.addShaped("ggn_tc_aercrystal", crystalaer * 2, [[gthammer],[gemAer]])
                crafting.addShaped("ggn_tc_aquacrystal", crystalaqua * 2, [[gthammer],[gemAqua]])
                crafting.addShaped("ggn_tc_ordocrystal", crystalordo * 2, [[gthammer],[gemOrdo]])
                crafting.addShaped("ggn_tc_perditiocrystal", crystalperditio * 2, [[gthammer],[gemPerditio]])
                crafting.addShaped("ggn_tc_igniscrystal", crystalignis * 2, [[gthammer],[gemIgnis]])
                crafting.addShaped("ggn_tc_terracrystal", crystalterra * 2, [[gthammer],[gemTerra]])
                // Hammer
                hammer.recipeBuilder().inputs(gemAer).outputs(crystalaer * 4).EUt(2).duration(56).buildAndRegister()
                hammer.recipeBuilder().inputs(gemAqua).outputs(crystalaqua * 4).EUt(2).duration(56).buildAndRegister()
                hammer.recipeBuilder().inputs(gemOrdo).outputs(crystalordo * 4).EUt(2).duration(56).buildAndRegister()
                hammer.recipeBuilder().inputs(gemPerditio).outputs(crystalperditio * 4).EUt(2).duration(56).buildAndRegister()
                hammer.recipeBuilder().inputs(gemIgnis).outputs(crystalignis * 4).EUt(2).duration(56).buildAndRegister()
                hammer.recipeBuilder().inputs(gemTerra).outputs(crystalterra * 4).EUt(2).duration(56).buildAndRegister()
            // Plate to Foil
                // Cutter
                cutter.recipeBuilder().inputs(plateAer).outputs(foilAer * 4).EUt(24).duration(80).buildAndRegister()
                cutter.recipeBuilder().inputs(plateAqua).outputs(foilAqua * 4).EUt(24).duration(80).buildAndRegister()
                cutter.recipeBuilder().inputs(plateOrdo).outputs(foilOrdo * 4).EUt(24).duration(80).buildAndRegister()
                cutter.recipeBuilder().inputs(platePerditio).outputs(foilPerditio * 4).EUt(24).duration(80).buildAndRegister()
                cutter.recipeBuilder().inputs(plateIgnis).outputs(foilIgnis * 4).EUt(24).duration(80).buildAndRegister()
                cutter.recipeBuilder().inputs(plateTerra).outputs(foilTerra * 4).EUt(24).duration(80).buildAndRegister()

        // ==== Vis Extraction ==== //
            extractor.recipeBuilder()
                .inputs(anyshard)
                .fluidOutputs(liquidvis * 10)
                .EUt(40)
                .duration(30)
                .buildAndRegister()
        // ==== Salis Mundus ==== //
            // Crafting - 6 to 1
            crafting.removeByOutput(salismundus)
            crafting.addShapeless("ggn_tc_salismundus", salismundus,
            [dustAer, dustAqua, dustOrdo, dustPerditio, dustIgnis, dustTerra, gtmortar
            ])
            // Mixer - 6 to 6, with crystals or starlight
            mixer.recipeBuilder()
                .inputs(dustAer, dustAqua, dustOrdo, dustPerditio, dustIgnis, dustTerra)
                .fluidInputs(liquidvis * 6000)
                .outputs(salismundus * 6)
                .EUt(16)
                .duration(6 * 20)
                .buildAndRegister()
            mixer.recipeBuilder()
                .inputs(dustAer, dustAqua, dustOrdo, dustPerditio, dustIgnis, dustTerra)
                .fluidInputs(liquidstarlight * 6000)
                .outputs(salismundus * 6)
                .EUt(16)
                .duration(120)
                .buildAndRegister()   
            // Pulverizing Balance Shards
            crafting.addShaped("ggn_tc_salismortar", salismundus, [
                [shardBalance],
                [gtmortar]
            ])

            macerator.recipeBuilder()
                .inputs(shardBalance)
                .outputs(salismundus)
                .EUt(7)
                .duration(20)
                .buildAndRegister()
        // ==== Balance Shards ==== //
            //Alloy - 3 to 1
            alloy.recipeBuilder()
                .inputs(salismundus * 3, anyshard)
                .outputs(shardBalance)
                .EUt(16)
                .duration(200)
                .buildAndRegister()
            //Autoclave - 1 to 1 
            autoclave.recipeBuilder()
                .inputs(salismundus)
                .fluidInputs(liquidwater * 500)
                .chancedOutput(shardBalance, 7000, 1000)
                .EUt(16)
                .duration(900)
                .buildAndRegister()
            
            autoclave.recipeBuilder()
                .inputs(salismundus)
                .fluidInputs(liquiddistilledwater * 250)
                .outputs(shardBalance)
                .EUt(16)
                .duration(600)
                .buildAndRegister()
            
            autoclave.recipeBuilder()
                .inputs(salismundus)
                .fluidInputs(liquidstarlight * 125)
                .outputs(shardBalance)
                .EUt(16)
                .duration(300)
                .buildAndRegister()


        // ==== Concentrated Shards ==== //
            mods.thaumcraft.crucible.recipeBuilder().researchKey('UNLOCKALCHEMY@3').catalyst(crystalaer).output(concentratedAer).aspect(aspect('aer') * 100).register()   
            mods.thaumcraft.crucible.recipeBuilder().researchKey('UNLOCKALCHEMY@3').catalyst(crystalaqua).output(concentratedAqua).aspect(aspect('aqua') * 100).register()   
            mods.thaumcraft.crucible.recipeBuilder().researchKey('UNLOCKALCHEMY@3').catalyst(crystalordo).output(concentratedOrdo).aspect(aspect('ordo') * 100).register()   
            mods.thaumcraft.crucible.recipeBuilder().researchKey('UNLOCKALCHEMY@3').catalyst(crystalperditio).output(concentratedPerditio).aspect(aspect('perditio') * 100).register()   
            mods.thaumcraft.crucible.recipeBuilder().researchKey('UNLOCKALCHEMY@3').catalyst(crystalignis).output(concentratedIgnis).aspect(aspect('ignis') * 100).register()   
            mods.thaumcraft.crucible.recipeBuilder().researchKey('UNLOCKALCHEMY@3').catalyst(crystalterra).output(concentratedTerra).aspect(aspect('terra') * 100).register()

            mods.thaumcraft.infusion_crafting.recipeBuilder()
                .researchKey('UNLOCKALCHEMY@3')
                .mainInput(shardBalance)
                .output(concentratedBalance) 
                .input(concentratedAer)
                .input(concentratedAqua)
                .input(concentratedOrdo)
                .input(concentratedPerditio)
                .input(concentratedIgnis)
                .input(concentratedTerra)
                .aspect('aer', 100)
                .aspect('aqua', 100)
                .aspect('ordo', 100)
                .aspect('perditio', 100)
                .aspect('ignis', 100)
                .aspect('terra', 100)
                .instability(5)
                .register()
             
    // ======== Alchemy ======== //
        // ==== Alchemical Bronze ==== //
            crafting.addShapeless("ggn_tc_brassfix", metaitem('ingotBrass'), [item('thaumcraft:ingot', 2)])
        // ==== Thaumium ==== //
            // Removing 
                mods.tc.crucible.removeByOutput(ingotThaumium) 
            // Wrought - 2 to 1
            mods.tc.crucible.recipeBuilder()
                .researchKey('METALLURGY@1')
                .catalyst(ingotWroughtIron)
                .output(dustSmallThaumium * 2)
                .aspect(praecantatio * 5)
                .aspect(terra * 5)
                .register()
            // Steel - 1 to 1
            mods.tc.crucible.recipeBuilder()
                .researchKey('METALLURGY@1')
                .catalyst(ingotSteel)
                .output(ingotThaumium)
                .aspect(praecantatio * 5)
                .aspect(terra * 5)
                .register()
        // ==== Alumentum ==== //
            // Removing
                mods.tc.crucible.removeByOutput(alumentum)
            // Replacing
                mods.tc.crucible.recipeBuilder()
                    .researchKey('ALUMENTUM')
                    .catalyst(gemCoke)
                    .output(alumentum)
                    .aspect(potentia * 10)
                    .aspect(ignis * 10)
                    .aspect(perditio * 5)
                    .register()
            // Chemreactor
                chemreactor.recipeBuilder()
                    .EUt(128)
                    .duration(2400)
                    .inputs(gemCoke)
                    .fluidInputs(liquidmana * 2000)
                    .outputs(alumentum)
                    .buildAndRegister()
        // ==== Ferrous Wood ==== //
            // Removing Plank to Nugget recipes
            //furnace.removeByInput(ferrousPlank)
            //furnace.removeByInput(ferrousPlankRaw)
            // Adding toasting recipes to darken wood
            furnace.add(ferrousLog, ferrousLogRaw, 1F)
            furnace.add(ferrousPlank, ferrousPlankRaw, 1F)
            //Dead Ferrous Sapling
            oreDict.add("ferrousSaplingDead", ferrousSaplingDead)
            // Reviving dead saplings
            mods.tc.dustTrigger.triggerBuilder()
                .target(ore("ferrousSaplingDead"))
                .output(ferrousSapling)
                .register()
            //Ironwood
            oreDict.add("plankIronwood", ferrousPlank)
            oreDict.add("plankIronwood", ferrousPlankRaw)
            //EBF
            ebf.recipeBuilder()
                .inputs(ore("plankIronwood"))
                .fluidInputs(acetone * 108)
                .outputs(dustSmallIron)
                .property("temperature", 2400)
                .EUt(40)
                .duration(300)
                .buildAndRegister()
            



            
            





    // ======== Artifice ======== //
        // ==== Vis Resonator ==== //
            mods.thaumcraft.arcane_workbench.removeByOutput(resonatorVis)
            mods.thaumcraft.ArcaneWorkbench.shapedBuilder()
                .vis(50)
                .aspect(aer).aspect(aqua)
                .output(resonatorVis)
                .row("SPS")
                .row("GBG")
                .row("SPS")
                .key("S", screwThaumium)
                .key("P", plateSilver)
                .key("G", blockGlassInvar)
                .key("B", shardBalance)
                .register()
        // ==== Morphic Resonator ==== //
            mods.thaumcraft.arcane_workbench.removeByOutput(resonatorMorphic)
            mods.thaumcraft.ArcaneWorkbench.shapedBuilder()
                .vis(50)
                .aspect(aer).aspect(ignis)
                .output(resonatorMorphic)
                .row("SPS")
                .row("GBG")
                .row("SPS")
                .key("S", screwThaumium)
                .key("P", plateBrass)
                .key("G", blockGlassInvar)
                .key("B", shardBalance)
                .register()
        // ==== Simple Mechanism ==== //
            mods.thaumcraft.arcane_workbench.removeByOutput(mechanismSimple)
            mods.thaumcraft.ArcaneWorkbench.shapedBuilder()
                .vis(10)
                .aspect(aqua).aspect(ignis)
                .output(mechanismSimple)
                .row("CGS")
                .row("SRT")
                .row("PPP")
                .key("P", plateWroughtIron)
                .key("S", screwThaumium)
                .key("C", circuitLv)
                .key("G", gearCobaltBrass)
                .key("T", stickThaumium)
                .key("R", ringThaumium)
                .register()
        // ==== Advanced Mechanism ==== //
            mods.thaumcraft.arcane_workbench.removeByOutput(mechanismAdvanced)
            mods.thaumcraft.ArcaneWorkbench.shapedBuilder()
                .vis(10)
                .aspect(aqua).aspect(ignis)
                .output(mechanismAdvanced)
                .row("SCS")
                .row("PRP")
                .row("SMS")
                .key("S", screwThaumium)
                .key("C", circuitMv)
                .key("P", plateThaumium)
                .key("R", ringThaumium)
                .key("M", mechanismSimple)
                .register()
        // ==== Wireless Essentia ==== //
            mods.thaumcraft.arcane_workbench.removeByOutput(wirelessEssentiaInput)
            mods.thaumcraft.arcane_workbench.removeByOutput(wirelessEssentiaOutput)
            mods.thaumcraft.ArcaneWorkbench.shapedBuilder()
                .vis(100)
                .aspect(aer).aspect(aqua)
                .output(wirelessEssentiaInput)
                .row("PVP")
                .row("BCB")
                .row("PMP")
                .key("P", plateTitaniumCarbide)
                .key("V", resonatorVis)
                .key("B", plateBrass)
                .key("C", circuitEv)
                .key("M", diffusionCore)
                .register()

            mods.thaumcraft.ArcaneWorkbench.shapedBuilder()
                .vis(100)
                .aspect(aer).aspect(aqua)
                .output(wirelessEssentiaOutput)
                .row("PMP")
                .row("BCB")
                .row("PVP")
                .key("P", plateTitaniumCarbide)
                .key("V", resonatorVis)
                .key("B", plateBrass)
                .key("C", circuitEv)
                .key("M", coalescenceCore)
                .register()

    // ======== Infusion ======== //
        // ==== Matrix ==== // 
            mods.thaumcraft.arcane_workbench.removeByOutput(infusionMatrix)
            mods.thaumcraft.ArcaneWorkbench.shapedBuilder()
                .vis(50)
                .aspect(aer).aspect(terra).aspect(aqua).aspect(ignis).aspect(ordo).aspect(perditio)
                .output(infusionMatrix)
                .row("DSD")
                .row("STS")
                .row("DSD")
                .key("D", blockDarkSteel)
                .key("S", shardBalance)
                .key("T", blockThaumium)
                .register() 
        // ==== Tree Beacon ==== // 
            mods.tc.InfusionCrafting.recipeBuilder()
                .mainInput(saplingSilverwood)
                .output(treebeacon)
                .aspect(herba * 500)
                .aspect(tenebrae * 200)
                .aspect(lux * 200)
                .input(marbleRuned)
                .input(marbleRuned)
                .input(marbleRuned)
                .input(marbleRuned)
                .instability(10)
                .register()
        // ==== Snad ==== //
            crafting.removeByOutput(snad)
            crafting.removeByOutput(snadRed)
            crafting.addShapeless("ggn_tc_redstonesnad", snadRed, [snad, dustRedstone])
            //Snad 
            mods.tc.InfusionCrafting.recipeBuilder()
                .mainInput(minecraftSand)
                .output(snad)
                .aspect(herba * 600)
                .aspect(victus * 600)
                .input(compressedSand)
                .input(compressedSand)
                .input(compressedSand)
                .input(compressedSand)
                .input(compressedSand)
                .input(compressedSand)
                .input(compressedSand)
                .instability(10)
                .register()
            //Snad Duplication
            mods.tc.InfusionCrafting.recipeBuilder()
                .mainInput(snad)
                .output(snad * 2)
                .aspect(herba * 600)
                .aspect(victus * 600)
                .input(compressedSand)
                .input(compressedSand)
                .input(compressedSand)
                .input(compressedSand)
                .instability(5)
                .register() 




        // ==== Peace Candle ==== //
            mods.tc.InfusionCrafting.recipeBuilder()
                .mainInput(watercandle)
                .output(peacecandle)
                .aspect(humanus * 80)
                .aspect(praemunio * 80)
                .aspect(permutatio * 80)
                .input(plateBrass)
                .input(plateBrass)
                .input(plateBrass)
                .input(plateBrass)
                .instability(6)
                .register()
        // ==== Arcane Bore ==== //
            mods.tc.InfusionCrafting.removeByOutput(arcanebore)
            mods.tc.InfusionCrafting.recipeBuilder()
                .mainInput(tcturret)
                .output(arcanebore)
                .aspect(machina * 50)
                .aspect(potentia * 25)
                .aspect(terra * 25)
                .aspect(vacuos * 25)
                .aspect(motus * 25)
                .input(plateBrass)
                .input(mechanismAdvanced)
                .input(resonatorMorphic)
                .input(ieAxeSteel)
                .input(iePickaxeSteel)
                .register()
    // ======== Tweaks ======== //
        // ==== Quicksilver ==== //
            furnace.removeByInput(item('thaumcraft:ore_cinnabar'))
            furnace.removeByInput(item('thaumcraft:cluster', 6))
            extractor.recipeBuilder()
                .inputs(quicksilver)
                .fluidOutputs(mercury * 144)
                .EUt(16)
                .duration(100)
                .buildAndRegister()
        // ==== Crystal Crusher Fix ==== //
            mods.thaumcraft.infusion_crafting.removeByOutput(item('thaumadditions:crystal_crusher'))








// ================ Thaumcraft ================ //
