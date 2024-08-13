// Imports

// ================ Actually Additions ================ //
    // ======== Definitions ======== //
        //Lamps
        def lampWhite = item('actuallyadditions:block_colored_lamp')
        def lampController = item('actuallyadditions:block_lamp_powerer')
        //Ethetic Quartz
        def blockQuartzEthetic = item('actuallyadditions:block_testifi_bucks_white_wall')
        def blockQuartzEtheticGreen = item('actuallyadditions:block_testifi_bucks_green_wall')
        //Phantomfaces
        def phantomfaceItem = item('actuallyadditions:block_phantomface')
        def phantomfaceFluid = item('actuallyadditions:block_phantom_liquiface')
        def phantomfaceRedstone = item('actuallyadditions:block_phantom_redstoneface')
        def phantomfaceBooster = item('actuallyadditions:block_phantom_booster')
        def phantomfaceConnector = item('actuallyadditions:item_phantom_connector')
        def phantomfacePlayer = item('actuallyadditions:block_player_interface')
        def phantomfaceBreaker = item('actuallyadditions:block_phantom_breaker')
        //Lasers
        def laserioFluid = item('actuallyadditions:block_laser_relay_fluids')
        def laserioItem = item('actuallyadditions:block_laser_relay_item_whitelist')
        def laserioUpgradeRange = item('actuallyadditions:item_laser_upgrade_range')
        def laserioUpgradeInvis = item('actuallyadditions:item_laser_upgrade_invisibility')
        def laserioWrench = item('actuallyadditions:item_laser_wrench')
        def laserioInterface = item('actuallyadditions:block_item_viewer')
        //World Interaction
        def worldFireworkBox = item('actuallyadditions:block_firework_box')
        def worldFeeder = item('actuallyadditions:block_feeder')

        def worldDropper = item('actuallyadditions:block_dropper')
        def worldBreaker = item('actuallyadditions:block_breaker')
        def worldPlacer = item('actuallyadditions:block_placer')
        def worldFluidPlacer = item('actuallyadditions:block_fluid_placer')
        def worldFluidCollector = item('actuallyadditions:block_fluid_collector')
        def worldBreakerLong = item('actuallyadditions:block_directional_breaker')
        //Misc 
        def mcDispenser = item('minecraft:dispenser') 
        def mcGoldenApple = item('minecraft:golden_apple')
        def mcFirework = item('minecraft:fireworks')

        def casingWood = item('actuallyadditions:block_misc', 4)
        def casingIron = item('actuallyadditions:block_misc', 7)
        def casingEnder = item('actuallyadditions:block_misc', 8)

        def seedHemp = item('immersiveengineering:seed')
        def seedCanola = item('actuallyadditions:item_canola_seed')
        def seedCanolaCrystal = item('actuallyadditions:item_misc', 23)
        def seedCanolaEmpowered = item('actuallyadditions:item_misc', 24)

        def experienceSolidifier = item('actuallyadditions:block_xp_solidifier')
        def experienceSolid = item('actuallyadditions:item_solidified_experience')
    // ======== Hidemap ======== //
        def hidemap = [
            item('actuallyadditions:item_more_damage_lens'), //lenses
            item("actuallyadditions:block_giant_chest"),
            item("actuallyadditions:block_giant_chest_medium"),
            item("actuallyadditions:block_giant_chest_large"),
            item("actuallyadditions:item_battery"),
            item("actuallyadditions:item_battery_double"),
            item("actuallyadditions:item_battery_triple"),
            item("actuallyadditions:item_battery_quadruple"),
            item("actuallyadditions:item_battery_quintuple"),
            item("actuallyadditions:block_battery_box"),
            item("actuallyadditions:item_suction_ring"),
            item("actuallyadditions:item_potion_ring_advanced"),
            item("actuallyadditions:item_potion_ring"),
            item("actuallyadditions:item_potion_ring_advanced:1"),
            item("actuallyadditions:item_potion_ring:1"),
            item("actuallyadditions:item_potion_ring_advanced:2"),
            item("actuallyadditions:item_potion_ring:2"),
            item("actuallyadditions:item_potion_ring_advanced:3"),
            item("actuallyadditions:item_potion_ring:3"),
            item("actuallyadditions:item_potion_ring_advanced:4"),
            item("actuallyadditions:item_potion_ring:4"),
            item("actuallyadditions:item_potion_ring_advanced:5"),
            item("actuallyadditions:item_potion_ring:5"),
            item("actuallyadditions:item_potion_ring_advanced:6"),
            item("actuallyadditions:item_potion_ring:6"),
            item("actuallyadditions:item_potion_ring_advanced:7"),
            item("actuallyadditions:item_potion_ring:7"),
            item("actuallyadditions:item_potion_ring_advanced:8"),
            item("actuallyadditions:item_potion_ring:8"),
            item("actuallyadditions:item_potion_ring_advanced:9"),
            item("actuallyadditions:item_potion_ring:9"),
            item("actuallyadditions:block_crystal_cluster_redstone"),
            item("actuallyadditions:block_crystal_cluster_lapis"),
            item("actuallyadditions:block_crystal_cluster_diamond"),
            item("actuallyadditions:block_crystal_cluster_coal"),
            item("actuallyadditions:block_crystal_cluster_emerald"),
            item("actuallyadditions:block_crystal_cluster_iron"),
            item("actuallyadditions:block_battery_box"),
            item("actuallyadditions:block_bio_reactor"),
            item("actuallyadditions:block_empowerer"),
            item("actuallyadditions:block_tiny_torch"),
            item("actuallyadditions:block_shock_suppressor"),
            item("actuallyadditions:block_display_stand"),
            item("actuallyadditions:block_crystal"),
            item("actuallyadditions:block_crystal:1"),
            item("actuallyadditions:block_crystal:2"),
            item("actuallyadditions:block_crystal:3"),
            item("actuallyadditions:block_crystal:4"),
            item("actuallyadditions:block_crystal:5"),
            item("actuallyadditions:block_crystal_empowered"),
            item("actuallyadditions:block_crystal_empowered:1"),
            item("actuallyadditions:block_crystal_empowered:2"),
            item("actuallyadditions:block_crystal_empowered:3"),
            item("actuallyadditions:block_crystal_empowered:4"),
            item("actuallyadditions:block_crystal_empowered:5"),
            item("actuallyadditions:block_black_lotus"),
            item("actuallyadditions:block_laser_relay"),
            item("actuallyadditions:block_laser_relay_advanced"),
            item("actuallyadditions:block_laser_relay_extreme"),
            item("actuallyadditions:block_leaf_generator"),
            item("actuallyadditions:block_treasure_chest"),
            item("actuallyadditions:block_energizer"),
            item("actuallyadditions:block_enervator"),
            item("actuallyadditions:block_lava_factory_controller"),
            item("actuallyadditions:block_canola_press"),
            item("actuallyadditions:block_coal_generator"),
            item("actuallyadditions:block_oil_generator"),
            item("actuallyadditions:block_fermenting_barrel"),
            item("actuallyadditions:block_compost"),
            item("actuallyadditions:block_misc"),
            item("actuallyadditions:block_misc:1"),
            item("actuallyadditions:block_misc:2"),
            item("actuallyadditions:block_misc:3"),
            item("actuallyadditions:block_grinder"),
            item("actuallyadditions:block_grinder_double"),
            item("actuallyadditions:block_furnace_double"),
            item("actuallyadditions:block_furnace_solar"),
            item("actuallyadditions:block_heat_collector"),
            item("actuallyadditions:block_coffee_machine"),
            item("actuallyadditions:block_quartz_wall"),
            item("actuallyadditions:block_chiseled_quartz_wall"),
            item("actuallyadditions:block_pillar_quartz_wall"),
            item("actuallyadditions:block_quartz_stair"),
            item("actuallyadditions:block_chiseled_quartz_stair"),
            item("actuallyadditions:block_pillar_quartz_stair"),
            item("actuallyadditions:block_quartz_slab"),
            item("actuallyadditions:block_chiseled_quartz_slab"),
            item("actuallyadditions:block_pillar_quartz_slab"),
            item("actuallyadditions:item_crystal_shard"),
            item("actuallyadditions:item_crystal_shard:1"),
            item("actuallyadditions:item_crystal_shard:2"),
            item("actuallyadditions:item_crystal_shard:3"),
            item("actuallyadditions:item_crystal_shard:4"),
            item("actuallyadditions:item_crystal_shard:5"),
            item("actuallyadditions:item_filling_wand"),
            item("actuallyadditions:item_bag"),
            item("actuallyadditions:item_void_bag"),
            item("actuallyadditions:item_spawner_changer"),
            item("actuallyadditions:item_misc"),
            item("actuallyadditions:item_misc:1"),
            item("actuallyadditions:item_misc:2"),
            item("actuallyadditions:item_misc:3"),
            item("actuallyadditions:item_misc:4"),
            item("actuallyadditions:item_misc:5"),
            item("actuallyadditions:item_misc:6"),
            item("actuallyadditions:item_misc:7"),
            item("actuallyadditions:item_misc:8"),
            item("actuallyadditions:item_misc:9"),
            item("actuallyadditions:item_misc:10"),
            item("actuallyadditions:item_misc:11"),
            item("actuallyadditions:item_misc:12"),
            item("actuallyadditions:item_misc:13"),
            item("actuallyadditions:item_misc:14"),
            item("actuallyadditions:item_misc:15"),
            item("actuallyadditions:item_misc:16"),
            item("actuallyadditions:item_misc:17"),
            item("actuallyadditions:item_misc:18"),
            item("actuallyadditions:item_misc:19"),
            item("actuallyadditions:item_misc:5"),
            item("actuallyadditions:item_misc:6"),
            item("actuallyadditions:item_misc:7"),
            item("actuallyadditions:item_misc:8"),
            item("actuallyadditions:item_misc:9"),
            item("actuallyadditions:item_misc:12"),
            item("actuallyadditions:item_misc:14"),
            item("actuallyadditions:item_misc:15"),
            item("actuallyadditions:item_misc:16"),
            item("actuallyadditions:item_misc:17"),
            item("actuallyadditions:item_misc:18"),
            item("actuallyadditions:item_misc:21"),
            item("actuallyadditions:item_misc:22"),
            item("actuallyadditions:item_color_lens"),
            item("actuallyadditions:item_explosion_lens"),
            item("actuallyadditions:item_damage_lens"),
            item("actuallyadditions:item_more_damage_lens"),
            item("actuallyadditions:item_disenchanting_lens"),
            item("actuallyadditions:item_drill:3"),
            item("actuallyadditions:item_crystal"),
            item("actuallyadditions:item_crystal:1"),
            item("actuallyadditions:item_crystal:2"),
            item("actuallyadditions:item_crystal:3"),
            item("actuallyadditions:item_crystal:4"),
            item("actuallyadditions:item_crystal:5"),
            item("actuallyadditions:item_crystal_empowered"),
            item("actuallyadditions:item_crystal_empowered:1"),
            item("actuallyadditions:item_crystal_empowered:2"),
            item("actuallyadditions:item_growth_ring"),
            item("actuallyadditions:item_food:20"),
            item("actuallyadditions:item_food:14"),
            item("actuallyadditions:item_food:13"),
            item("actuallyadditions:item_food:11"),
            item("actuallyadditions:item_food:5"),
            item("actuallyadditions:item_food:2"),
            item("actuallyadditions:item_food:7"),
            item("actuallyadditions:item_wings_of_the_bats"),
            item("actuallyadditions:item_fertilizer"),
            item("actuallyadditions:item_coffee"),
            item("actuallyadditions:item_resonant_rice"),
            item("actuallyadditions:item_food"),
            item("actuallyadditions:item_food:1"),
            item("actuallyadditions:item_food:4"),
            item("actuallyadditions:item_food:3"),
            item("actuallyadditions:item_food:6"),
            item("actuallyadditions:item_food:8"),
            item("actuallyadditions:item_food:9"),
            item("actuallyadditions:item_food:10"),
            item("actuallyadditions:item_food:12"),
            item("actuallyadditions:item_food:16"),
            item("actuallyadditions:item_food:15"),
            item("actuallyadditions:item_food:17"),
            item("actuallyadditions:item_food:18"),
            item("actuallyadditions:item_food:19"),
            item("actuallyadditions:item_jam"),
            item("actuallyadditions:item_jam:1"),
            item("actuallyadditions:item_jam:2"),
            item("actuallyadditions:item_jam:3"),
            item("actuallyadditions:item_jam:4"),
            item("actuallyadditions:item_jam:5"),
            item("actuallyadditions:item_jam:6"),
            item("actuallyadditions:item_crafter_on_a_stick"),
            item("actuallyadditions:item_dust:7"),
            item("actuallyadditions:item_dust:6"),
            item("actuallyadditions:item_dust:5"),
            item("actuallyadditions:item_dust:4"),
            item("actuallyadditions:item_dust:3"),
            item("actuallyadditions:item_dust"),
            item("actuallyadditions:item_dust:1"),
            item("actuallyadditions:item_dust:2"),
            item("actuallyadditions:item_rice_seed"),
            item("actuallyadditions:item_coffee_seed"),
            item("actuallyadditions:item_hairy_ball"),
            item("actuallyadditions:item_crystal_empowered:3"),
            item("actuallyadditions:item_crystal_empowered:4"),
            item("actuallyadditions:item_crystal_empowered:5"),
            item("actuallyadditions:item_mining_lens"),
            item("actuallyadditions:block_atomic_reconstructor"),
            item("actuallyadditions:block_misc:9"), //iron casing
            item("actuallyadditions:item_chest_to_crate_upgrade"), //crate upgrades
            item("actuallyadditions:item_small_to_medium_crate_upgrade"),
            item("actuallyadditions:item_medium_to_large_crate_upgrade"),
            item("actuallyadditions:item_crate_keeper"),
            item("actuallyadditions:item_drill_upgrade_three_by_three"), //drill upgrades
            item("actuallyadditions:item_drill_upgrade_block_placing"),
            item("actuallyadditions:item_drill_upgrade_five_by_five"),
            item("actuallyadditions:item_drill_upgrade_fortune"),
            item("actuallyadditions:item_drill_upgrade_fortune_ii"),
            item("actuallyadditions:item_drill_upgrade_silk_touch"),
            item("actuallyadditions:item_drill_upgrade_speed"),
            item("actuallyadditions:item_drill_upgrade_speed_ii"),
            item("actuallyadditions:item_drill_upgrade_speed_iii"),
            item("actuallyadditions:item_leaf_blower_advanced"), //leafblower because senses
            item("actuallyadditions:item_leaf_blower"),
            item("actuallyadditions:item_tele_staff"), //teleport staff
            item("actuallyadditions:item_water_removal_ring"), //ring of liquid banning
            item("actuallyadditions:item_knife"), //knife
            item("actuallyadditions:block_laser_relay_item"), //item laser
            item("actuallyadditions:block_fishing_net"), //fishing net
            item("actuallyadditions:block_item_repairer"), //item repairer
            item("actuallyadditions:block_ranged_collector"), //ranged collector
            item("actuallyadditions:block_farmer"), //farmer
            item('actuallyadditions:block_phantom_energyface'), //phantom energyface
            item('actuallyadditions:block_misc', 6), //block of enderpearls
            item('actuallyadditions:block_miner'), //block miner
        ]
                for (entry in hidemap) {
                    mods.jei.ingredient.yeet(entry)
                }
            mods.jei.category.hideCategory("actuallyadditions.coffee")
            mods.jei.category.hideCategory("actuallyadditions.compost")
            mods.jei.category.hideCategory("actuallyadditions.crushing")
            mods.jei.category.hideCategory("actuallyadditions.reconstructor")
            mods.jei.category.hideCategory("actuallyadditions.empowerer")
    // ======== Visuals ======== //
        // ==== Ethetic Quartz ==== // 
            // Chisel Variation
                mods.chisel.carving.addVariation("quartz", blockQuartzEthetic)
            // Dying Green & Dying Back
                chembath.recipeBuilder()
                    .inputs(blockQuartzEthetic)
                    .fluidInputs(fluid("dye_green"))
                    .outputs(blockQuartzEtheticGreen)
                    .EUt(7)
                    .duration(200)
                    .buildAndRegister()
            // Green -> White w/ White
                chembath.recipeBuilder()
                    .inputs(blockQuartzEtheticGreen)
                    .fluidInputs(fluid("dye_white"))
                    .outputs(blockQuartzEthetic)
                    .EUt(7)
                    .duration(200)
                    .buildAndRegister()
            // Green -> White w/ Solvent
                chembath.recipeBuilder()
                    .inputs(blockQuartzEtheticGreen)
                    .fluidInputs(fluid("acetone"))
                    .outputs(blockQuartzEthetic)
                    .EUt(7)
                    .duration(200)
                    .buildAndRegister()
        // ==== Lamps ==== // 
            // Lamp Controller
                crafting.removeByOutput(lampController)
                crafting.addShaped("ggn_aa_lampcontroller", lampController,
                [
                    [screwRedAlloy, circuitLv, screwRedAlloy],
                    [plateSteel, lampWhite, plateSteel],
                    [screwRedAlloy, plateSteel, screwRedAlloy]
                ])
            // White Lamp
                crafting.removeByOutput(lampWhite)
                crafting.addShaped("ggn_aa_lampwhite", lampWhite,
                [
                    [blockQuartzEthetic, blockGlassVibrant, blockQuartzEthetic],
                    [dustGlowstone, plateRedAlloy, dustGlowstone],
                    [blockQuartzEthetic, blockGlassVibrant, blockQuartzEthetic]
                ])
            // Lamp Map
                def aaLamp = [
                    [item('actuallyadditions:block_colored_lamp', 1)]: fluid("dye_orange"),
                    [item('actuallyadditions:block_colored_lamp', 2)]: fluid("dye_magenta"),
                    [item('actuallyadditions:block_colored_lamp', 3)]: fluid("dye_light_blue"),
                    [item('actuallyadditions:block_colored_lamp', 4)]: fluid("dye_yellow"),
                    [item('actuallyadditions:block_colored_lamp', 5)]: fluid("dye_lime"),
                    [item('actuallyadditions:block_colored_lamp', 6)]: fluid("dye_pink"),
                    [item('actuallyadditions:block_colored_lamp', 7)]: fluid("dye_gray"),
                    [item('actuallyadditions:block_colored_lamp', 8)]: fluid("dye_light_gray"),
                    [item('actuallyadditions:block_colored_lamp', 9)]: fluid("dye_cyan"),
                    [item('actuallyadditions:block_colored_lamp', 10)]: fluid("dye_purple"),
                    [item('actuallyadditions:block_colored_lamp', 11)]: fluid("dye_blue"),
                    [item('actuallyadditions:block_colored_lamp', 12)]: fluid("dye_brown"),
                    [item('actuallyadditions:block_colored_lamp', 13)]: fluid("dye_green"),
                    [item('actuallyadditions:block_colored_lamp', 14)]: fluid("dye_red"),
                    [item('actuallyadditions:block_colored_lamp', 15)]: fluid("dye_black"),
                ]
                    for (entry in aaLamp) {
                        crafting.removeByOutput(entry.key)
                        chembath.recipeBuilder()
                            .inputs(lampWhite)
                            .outputs(entry.key)
                            .fluidInputs(entry.value * 64)
                            .EUt(7)
                            .duration(64)
                            .buildAndRegister()
                    }
        // ==== Casings ==== //
            // Iron
                crafting.removeByOutput(casingIron)
                crafting.addShaped("ggn_aa_casingiron", casingIron * 8,
                [
                    [plateIron, plateIron, plateIron],
                    [plateIron, casingWood, plateIron],
                    [plateIron, plateIron, plateIron]
                ])
            // Ender
                crafting.removeByOutput(casingEnder)
                crafting.addShaped("ggn_aa_casingender", casingEnder * 8,
                [
                    [plateObsidian, plateObsidian, plateObsidian],
                    [plateEnderPearl, casingIron, plateEnderPearl],
                    [plateObsidian, plateObsidian, plateObsidian]
                ])
                

    // ======== Canola ======== //
        // ==== Seeds ==== //
            // Base - TC
                mods.tc.crucible.recipeBuilder()
                    .researchKey('LAMPGROWTH')
                    .catalyst(seedHemp)
                    .output(seedCanola)
                    .aspect(fabrico * 20)
                    .aspect(machina * 20)
                    .register()
            // Crystalized
                autoclave.recipeBuilder()
                    .inputs(seedCanola)
                    .fluidInputs(liquidvis * 160)
                    .outputs(seedCanolaCrystal)
                    .EUt(64)
                    .duration(100)
                    .buildAndRegister()
            // Empowered 
                mods.botania.mana_infusion.add(seedCanolaEmpowered, seedCanolaCrystal, 3000)
        // ==== Seed Oil ==== //
            // Hemp - 2x Wheat, 20mb
                extractor.recipeBuilder()
                    .EUt(2).duration(32)
                    .inputs(seedHemp)
                    .fluidOutputs(seedoil * 20)
                    .buildAndRegister()
            // Canola - 2x Hemp, 40mb
                extractor.recipeBuilder()
                    .EUt(2).duration(32)
                    .inputs(seedCanola)
                    .fluidOutputs(seedoil * 40)
                    .buildAndRegister()
            // Crystalized Canola - 2x Canola, 80mb
                extractor.recipeBuilder()
                    .EUt(2).duration(32)
                    .inputs(seedCanolaCrystal)
                    .fluidOutputs(seedoil * 80)
                    .buildAndRegister()
            // Empowered Canola - 4x Crystalized, 160mb
                extractor.recipeBuilder()
                    .EUt(2).duration(32)
                    .inputs(seedCanolaEmpowered)
                    .fluidOutputs(seedoil * 160)
                    .buildAndRegister()
        
                    



    // ======== Utilities ======== //
        // ==== LaserIO ==== // 
            // Removemap
                def laserioRemove = [
                    laserioItem,
                    laserioUpgradeInvis,
                    laserioUpgradeRange,
                    laserioWrench,
                    laserioInterface
                ]
                for (entry in laserioRemove) {
                    crafting.removeByOutput(entry)
                }
            // Item
                assembler.recipeBuilder()
                    .inputs(emitterEv, plateTitanium * 4, screwStainlessSteel * 8, circuitEv)
                    .outputs(laserioItem)
                    .fluidInputs(solder * 288)
                    .EUt(60)
                    .duration(100)
                    .buildAndRegister()
            // Fluid
                assline.recipeBuilder()
                    .inputs(emitterZpm, plateNaquadah * 4, screwOsmiridium * 8, circuitZpm)
                    .outputs(laserioFluid)
                    .fluidInputs(solder * 288, lubricant * 500)
                    .EUt(8000)
                    .duration(480)
                    .buildAndRegister()
            // Upgrades
                // Range
                    crafting.addShapeless("ggn_aa_laserioupgraderange", laserioUpgradeRange, [xuUpgradeBlank, emitterHv])
                // Invisibiility
                    crafting.addShapeless("ggn_aa_laserioupgradeinvis", laserioUpgradeInvis, [laserioUpgradeRange])
                    crafting.addShapeless("ggn_aa_laserioupgradeinvisrange", laserioUpgradeRange, [laserioUpgradeInvis])
            // Wrench
                crafting.addShaped("ggn_aa_laseriowrench", laserioWrench,
                [
                    [plateSilver, gthammer, plateSilver],
                    [null, plateSilver, null],
                    [null, plateSilver, null]
                ])
            // Item Interface
                crafting.addShaped("ggn_aa_laseriointerface", laserioInterface,
                [
                    [screwSteel, laserioItem, screwSteel],
                    [plateSteel, anychest, plateSteel],
                    [screwSteel, plateSteel, screwSteel]
                ])

        // ==== Phantomfaces ==== //
            // Removing recipes
                crafting.removeByOutput(phantomfaceItem)
                crafting.removeByOutput(phantomfaceFluid)
                crafting.removeByOutput(phantomfaceRedstone)
                crafting.removeByOutput(phantomfaceBreaker)
            // Crafting default face
                /*FLAGGED - Tech Recipe. Do I want this?
                assembler.recipeBuilder()
                    .inputs(hullHv, gtWirelessTransmitter, plateVibrantAlloy * 8, screwVibrantAlloy * 4, circuitEv)
                    .fluidInputs(liquidender * 144)
                    .outputs(phantomfaceItem)
                    .EUt(300)
                    .duration(200)
                    .buildAndRegister()
                */
                assembler.recipeBuilder()
                    .inputs(hullHv, gtWirelessTransmitter, plateManasteel * 8, screwManasteel * 4, circuitHv)
                    .fluidInputs(liquidender * 144)
                    .outputs(phantomfaceItem)
                    .EUt(300)
                    .duration(200)
                    .buildAndRegister()
            // Changing w/ Chisel
                mods.chisel.carving.addGroup("aaphantomfaces")
                mods.chisel.carving.addVariation("aaphantomfaces", phantomfaceItem)
                mods.chisel.carving.addVariation("aaphantomfaces", phantomfaceFluid)
                mods.chisel.carving.addVariation("aaphantomfaces", phantomfaceRedstone)
                mods.chisel.carving.addVariation("aaphantomfaces", phantomfaceBreaker)
            // Phantomface Booster
                assembler.recipeBuilder()
                    .inputs(stickDiamond * 3, plateSteel * 8)
                    .fluidInputs(liquidender * 144)
                    .outputs(phantomfaceBooster)
                    .EUt(200)
                    .duration(100)
                    .buildAndRegister()
            // Phantomface Player
                crafting.addShaped("ggn_aa_phantomfaceplayer", phantomfacePlayer,
                [
                    [screwSoularium, gtWirelessTransmitter, screwSoularium],
                    [circuitEv, hullEv, circuitEv],
                    [plateSoularium, plateSoularium, plateSoularium]
                ])
            // Connector
                crafting.remove("actuallyadditions:recipes49")
                crafting.addShaped("ggn_aa_phantomfaceconnector", phantomfaceConnector,
                [
                    [plateEnderPearl, gtWirelessTransmitter, plateEnderPearl],
                    [plateEnderPearl, pearlEnderEye, plateEnderPearl],
                    [null, stickSteel, null]
                ])


                



        // ==== World Interaction ==== // 
            // Removing
                def worldRemover = [
                    worldFireworkBox,
                    worldFeeder,
                    worldDropper,
                    worldBreaker,
                    worldPlacer,
                    worldFluidPlacer,
                    worldFluidCollector,
                    worldBreakerLong
                ]
                for (entry in worldRemover) {
                    crafting.removeByOutput(entry)
                }  
            // Breakers & Placers
                // Breaker
                    crafting.addShaped("ggn_aa_worldbreaker", worldBreaker,
                    [
                        [plateIron, plateIron, plateIron],
                        [hullLv, mcDispenser, gthammer],
                        [plateIron, plateIron, plateIron]
                    ])

                    assembler.recipeBuilder()
                        .inputs(hullLv, plateIron * 6, mcDispenser)
                        .outputs(worldBreaker)
                        .EUt(7)
                        .duration(336)
                        .buildAndRegister()
                // Long Range Breaker
                    crafting.addShaped("ggn_aa_worldbreakerlong", worldBreakerLong,
                    [
                        [plateRoseGold, plateRoseGold, plateRoseGold],
                        [hullHv, worldBreaker, gthammer],
                        [plateRoseGold, plateRoseGold, plateRoseGold]
                    ])

                    assembler.recipeBuilder()
                        .inputs(hullHv, plateRoseGold * 6, worldBreaker)
                        .outputs(worldBreakerLong)
                        .EUt(7)
                        .duration(672)
                        .buildAndRegister()
                // Chisel
                    mods.chisel.carving.addGroup("breakersplacers")
                    def breakersPlacers = [
                        worldBreaker,
                        worldPlacer,
                        worldFluidPlacer,
                        worldFluidCollector
                    ]
                    for (entry in breakersPlacers) {
                        mods.chisel.carving.addVariation("breakersplacers", entry)
                    }
            // Autofeeder
                crafting.addShaped("ggn_aa_worldfeeder", worldFeeder,
                [
                    [plateIron, mcGoldenApple, plateIron],
                    [crystalHerba, hullLv, crystalHerba],
                    [plateIron, plateIron, plateIron]
                ])
            // Firework Box
                crafting.addShaped("ggn_aa_worldfireworkbox", worldFireworkBox,
                [
                    [mcFirework, mcFirework, mcFirework],
                    [plateWood, hullUlv, plateWood],
                    [plateIron, plateIron, plateIron]
                ])


        // ==== Experience Solidifier ==== //
            // Solidifier
                crafting.removeByOutput(experienceSolidifier)
                crafting.addShaped("ggn_aa_experiencesolidifier", experienceSolidifier,
                [
                    [experienceSolid, experienceSolid, experienceSolid],
                    [plateAluminium, hullMv, plateAluminium],
                    [platePulsatingIron, platePulsatingIron, platePulsatingIron]
                ])
            // Fluids & Solids
                // Solid -> XP
                    extractor.recipeBuilder()
                        .EUt(7).duration(100)
                        .inputs(experienceSolid)
                        .fluidOutputs(liquidexperience * 70)
                        .buildAndRegister()
                // XP -> Solid
                    solidifier.recipeBuilder()
                        .EUt(7).duration(100)
                        .notConsumable(gtMoldBlock)
                        .fluidInputs(liquidexperience * 70)
                        .outputs(experienceSolid)
                        .buildAndRegister()
                // Experience Bottles 
                    // XP -> Bottle
                        canner.recipeBuilder()
                            .EUt(7).duration(30)
                            .inputs(itemBottle)
                            .fluidInputs(liquidexperience * 70)
                            .outputs(itemBottleXp)
                            .buildAndRegister()
                    // Bottle -> XP 
                        canner.recipeBuilder()
                            .EUt(7).duration(30)
                            .inputs(itemBottleXp)
                            .fluidOutputs(liquidexperience * 70)
                            .outputs(itemBottle)
                            .buildAndRegister()

// ================ Actually Additions ================ //
