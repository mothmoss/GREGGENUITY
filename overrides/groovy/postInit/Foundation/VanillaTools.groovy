// Imports

// ================ VanillaTools ================ //
    // ======== Definitions ======== //
        // Tools
        def swordIron = item('minecraft:iron_sword')
        def pickaxeIron = item('minecraft:iron_pickaxe')
        def swordGold = item('minecraft:golden_sword')
        def pickaxeGold = item('minecraft:golden_pickaxe')
        def swordDiamond = item('minecraft:diamond_sword')

        //Tools IE
        def hoeSteel = item('immersiveengineering:hoe_steel')
        def pickaxeSteel = item("immersiveengineering:pickaxe_steel")
        
        // Mods
        def spikesIron = item('extrautils2:spike_iron')
        def spikesDiamond = item('extrautils2:spike_diamond')

        def ieBayonet = item('immersiveengineering:toolupgrade', 4)
        def duDamageTrap = item('darkutils:trap_tile', 2)

        def arDrill = item('advancedrocketry:drill')
        def cyclicMiner = item('cyclicmagic:block_miner')
        def drillTipTitanium = metaitem('toolHeadDrillTitanium')
        def duCharmAggression = item('darkutils:charm_agression')
        def btRingMantle = item('botania:miningring')

        def xuUpgradeBase = item('extrautils2:ingredients', 9)
        def xuUpgradeMining = item('extrautils2:ingredients', 8)
        def xuUpgradeStack = item('extrautils2:ingredients', 7)
        def xuUpgradeSpeed = item('extrautils2:ingredients', 6)

        def rftCardQuarry = item('rftools:shape_card', 2)
        def rftUpgradeHaste = item('rftools:haste_module')
        def rftUpgradeHaste2 = item('rftools:hasteplus_module')

        def eioBackhoe = item('enderio:item_dark_steel_hand')
        def eioUpgradeBlank = item('enderio:item_dark_steel_upgrade')
        def eioUpgradeFork = item('enderio:item_dark_steel_upgrade', 1).withNbt(['enderio:dsu': 'enderio:hoe'])
        def eioUpgradeSpoon = item('enderio:item_dark_steel_upgrade', 1).withNbt(['enderio:dsu': 'enderio:spoon'])

        def itWorldExporter = item('integratedtunnels:part_exporter_world_block_item')
        def itWorldImporter = item('integratedtunnels:part_importer_world_block_item')
        def itItemExporter = item('integratedtunnels:part_exporter_item_item')
        def itItemImporter = item('integratedtunnels:part_importer_item_item')
        def itLogicDirector = item('integrateddynamics:logic_director')

    // ======== Hidemap ======== //
        def hidemap = [
            item('minecraft:wooden_sword'), //wood tools
            item('minecraft:wooden_pickaxe'),
            item('minecraft:wooden_axe'),
            item('minecraft:wooden_hoe'),
            item('minecraft:wooden_shovel'),
            item('minecraft:stone_sword'), //stone tools
            item('minecraft:stone_pickaxe'),
            item('minecraft:stone_axe'),
            item('minecraft:stone_hoe'),
            item('minecraft:stone_shovel'),
            item('minecraft:golden_axe'), //golden tools
            item('minecraft:golden_hoe'),
            item('minecraft:golden_shovel'),
            swordGold,
            pickaxeGold,
            swordIron, //iron tools
            pickaxeIron,
            item('minecraft:iron_axe'), //FLAGGED Medium - EIO Decorative Blocks
            item('minecraft:iron_hoe'),
            item('minecraft:iron_shovel'),
            item('randomthings:blockbreaker'), //FLAGGED Low - Move scripts
            item('darkutils:filter'), //FLAGGED Low - Move scripts
            swordDiamond,
            item('minecraft:diamond_axe'),
            item('minecraft:diamond_hoe'),
            item('minecraft:diamond_shovel'),
            item('minecraft:diamond_pickaxe'),

        ]
                for (entry in hidemap) {
                    mods.jei.ingredient.yeet(entry)
                }
    // ======== Replacing Uses ======== //
        // ==== Iron Tools ==== // 
            // == Iron Sword == //
                // Iron Spikes (XU2)
                    crafting.removeByOutput(spikesIron)
                    crafting.addShaped("ggn_vt_spikesiron", spikesIron,
                    [
                        [gthammer, stickIron, gtfile],
                        [stickIron, plateIron, stickIron],
                        [plateIron, plateIron, plateIron]
                    ])
                    assembler.recipeBuilder()
                        .EUt(7).duration(364)
                        .notConsumable(circuit2)
                        .inputs(stickIron * 3, plateIron * 4)
                        .outputs(spikesIron)
                        .buildAndRegister()
                // Bayonet (IE)
                    crafting.removeByOutput(ieBayonet)
                    crafting.addShaped("ggn_vt_ieBayonet", ieBayonet,
                    [
                        [stickSteel, plateSteel],
                        [plateSteel, gtfile],
                        [plateTreatedWood, plateTreatedWood]
                    ])
                // Damage Trap (DU)
                    crafting.removeByOutput(duDamageTrap)
                    crafting.addShaped("ggn_vt_duDamageTrap", duDamageTrap * 4,
                    [
                        [foilRedAlloy, spikesIron, foilRedAlloy],
                        [plateDarkSteel, plateDarkSteel, plateDarkSteel],
                        [foilRedAlloy, spikesIron, foilRedAlloy],
                    ])
            // == Iron Pickaxe == //
                // == Drill == //
                    crafting.removeByOutput(arDrill)
                    crafting.addShaped("ggn_vt_ardrill", arDrill,
                    [
                        [robotarmEv, drillTipTitanium, robotarmEv],
                        [circuitEv, hullEv, circuitEv],
                        [plateStainlessSteel, plateStainlessSteel, plateStainlessSteel]
                    ])
                // == Block Breaker == // 
                    crafting.removeByOutput(cyclicMiner)
                    crafting.addShaped("ggn_vt_cyclicminer", cyclicMiner,
                    [
                        [robotarmLv, plateWroughtIron, circuitLv],
                        [plateRedAlloy, hullLv, plateRedAlloy],
                        [plateWroughtIron, plateWroughtIron, plateWroughtIron]
                    ])
                // == Block Miner == // 



        // ==== Gold Tools ==== //
            // == Gold Sword == //
                // Aggression Charm
                    crafting.removeByOutput(duCharmAggression)
                    crafting.addShaped("ggn_vt_ducharmaggression", duCharmAggression,
                    [
                        [runeWrath, itemManaString, screwThaumium],
                        [itemManaString, ringThaumium, itemManaString],
                        [screwThaumium, itemManaString, itemManaString]
                    ])
            // == Gold Pickaxe == //
                // XU2 Upgrades
                    mods.chisel.carving.addGroup("xuupgrade")
                    def xu2upgrades = [
                        xuUpgradeMining,
                        xuUpgradeStack,
                        xuUpgradeSpeed,
                    ]
                    for (entry in xu2upgrades) {
                        crafting.removeByOutput(entry)
                        mods.chisel.carving.addVariation("xuupgrade", entry)
                    }
                    // XU2 Base
                        crafting.addShaped("ggn_vt_xuupgradebase", xuUpgradeBase,
                        [
                            [screwGold, foilGold, screwGold],
                            [foilRedAlloy, plateRedAlloy, foilRedAlloy],
                            [plateGold, plateGold, plateGold]
                        ])
                // Ring of the Mantle
                    crafting.removeByOutput(btRingMantle)
                    crafting.addShaped("ggn_vt_btringmantle", btRingMantle,
                    [
                        [runeEarth, plateManasteel, runeFire],
                        [plateManasteel, ringThaumium, plateManasteel],
                        [gtfile, plateManasteel, gthammer]
                    ])
        // ==== Diamond Tools ==== //
            // == Diamond Sword == //
                // Diamond Spikes
                crafting.removeByOutput(spikesDiamond)
                assembler.recipeBuilder()
                    .inputs(spikesIron * 2, plateDiamond * 8, blockDiamond)
                    .outputs(spikesDiamond * 2)
                    .EUt(60)
                    .duration(204)
                    .buildAndRegister()
            // == Diamond Hoe == //
                // EIO Fork
                crafting.removeByOutput(eioUpgradeFork)
                crafting.addShapeless("ggn_vt_eioupgradefork", eioUpgradeFork, [eioUpgradeBlank, hoeSteel])
            // == Diamond Pickaxe == //
                // Shape Card
                    crafting.removeByOutput(rftCardQuarry)
                    //FLAGGED Low - Move scripts & redo
                // Haste Modules
                    crafting.removeByOutput(rftUpgradeHaste)
                    crafting.removeByOutput(rftUpgradeHaste2)
                // World Block
                    // Importer
                        crafting.removeByOutput(itWorldImporter)
                        crafting.addShapeless("ggn_vt_itworldimporter", itWorldImporter, [itItemImporter, itLogicDirector, pickaxeSteel])
                    // Exporter
                        crafting.removeByOutput(itWorldExporter)
                        crafting.addShapeless("ggn_vt_itworldexporter", itWorldExporter, [itItemExporter, itLogicDirector, pickaxeSteel])


            


                    

    
// ================ VanillaTools ================ //
