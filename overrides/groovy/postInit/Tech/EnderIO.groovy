// Imports
import gregtech.api.recipes.category.RecipeCategories

// ================ EnderIO ================ //
    // ======== Definitions ======== //
        // Machines
            def eioChassis = item('enderio:item_material', 1)
            def eioTankNormal = item('enderio:block_tank')
            def eioTankPressurized = item('enderio:block_tank', 1)
            def eioEndervoir = item('enderio:block_reservoir')
            def eioOmnivoir = item('enderio:block_omni_reservoir')
        // Crystals
            def crystalPulsating = item('enderio:item_material', 14)
            def crystalVibrant = item('enderio:item_material', 15)
            def crystalEnder = item('enderio:item_material', 16)
        // Gliders
            def gliderWingLeft = item('openglider:hang_glider_part')
            def gliderWingRight = item('openglider:hang_glider_part', 1)
            def gliderScaffolding = item('openglider:hang_glider_part', 2)
            def gliderNormal = item('openglider:hang_glider_basic')
            def gliderAdvanced = item('openglider:hang_glider_advanced')
            def gliderUpgrade = item('enderio:item_dark_steel_upgrade', 1).withNbt(['enderio:dsu': 'enderio:glide'])      
        // Capacitors
            def eioCapacitorBasic = item('enderio:item_basic_capacitor')
            def eioCapacitorDouble = item('enderio:item_basic_capacitor', 1)
            def eioCapacitorOctadic = item('enderio:item_basic_capacitor', 2)
            def eioCapacitorCrystalline = item('enderio:item_capacitor_crystalline')
            def eioCapacitorMelodic = item('enderio:item_capacitor_melodic')
            def eioCapacitorStellar = item('enderio:item_capacitor_stellar')
        // Armor & Weapons
            def eioHelmetDarksteel = item('enderio:item_dark_steel_helmet')
            def eioChestplateDarksteel = item('enderio:item_dark_steel_chestplate')
            def eioLeggingsDarksteel = item('enderio:item_dark_steel_leggings')
            def eioBootsDarksteel = item('enderio:item_dark_steel_boots')
            def ieHelmetSteel = item('immersiveengineering:steel_armor_head')
            def ieChestplateSteel = item('immersiveengineering:steel_armor_chest')
            def ieLeggingsSteel = item('immersiveengineering:steel_armor_legs')
            def ieBootsSteel = item('immersiveengineering:steel_armor_feet')

            def ieSwordSteel = item('immersiveengineering:sword_steel')
            def iePickaxeSteel = item('immersiveengineering:pickaxe_steel')
            def ieShovelSteel = item('immersiveengineering:shovel_steel')
            def ieAxeSteel = item('immersiveengineering:axe_steel')
            def ieHoeSteel = item('immersiveengineering:hoe_steel')
            def itemShears = item('minecraft:shears')
            def itemBow = item('minecraft:bow')
            def ieShieldSteel = item('immersiveengineering:shield')

            def eioSwordDark = item('enderio:item_dark_steel_sword')
            def eioPickaxeDark = item('enderio:item_dark_steel_pickaxe')
            def eioAxeDark = item('enderio:item_dark_steel_axe')
            def eioBowDark = item('enderio:item_dark_steel_bow')
            def eioShearsDark = item('enderio:item_dark_steel_shears')
            def eioShieldDark = item('enderio:item_dark_steel_shield')
            def eioBackhoe = item('enderio:item_dark_steel_hand')

            def eioUpgradeBlank = item('enderio:item_dark_steel_upgrade')
            def eioUpgradeFork = item('enderio:item_dark_steel_upgrade', 1).withNbt(['enderio:dsu': 'enderio:hoe'])
            def eioUpgradeSpoon = item('enderio:item_dark_steel_upgrade', 1).withNbt(['enderio:dsu': 'enderio:spoon'])
        // Conduits
            def eioWrench = item('enderio:item_yeta_wrench')
            def eioProbe = item('enderio:item_conduit_probe')
        // Misc
            def barsDarkSteel = item('enderio:block_dark_iron_bars')
            def eioPaperBlack = item('enderio:item_material', 77)
            def eioRodExperience = item('enderio:item_xp_transfer')
            def tcBrain = item('thaumcraft:brain')
            def eioMagnet = item('enderio:item_magnet')

            def tcEverfullUrn = item('thaumcraft:everfull_urn')
            def gtWaterCover = metaitem('cover.infinite_water')
            def eioVacuumChest = item('enderio:block_vacuum_chest')
            def eioTravelAnchor = item('enderio:block_travel_anchor')
            def eioExitRail = item('enderio:block_exit_rail')
            def eioPaintingMachine = item('enderio:block_painter')

            def itemRail = item('minecraft:rail')
            def itemPiston = item('minecraft:piston')
            def itemTrapdoorIron = item('minecraft:iron_trapdoor')
            def itemDoorIron = item('minecraft:iron_door')

            def eioLightElectric = item('enderio:block_electric_light')
            def eioLightElectricInv = item('enderio:block_electric_light', 1)
            def eioLight = item('enderio:block_electric_light', 2)
            def eioLightInv = item('enderio:block_electric_light', 3)
            def eioLightWireless = item('enderio:block_electric_light', 4)
            def eioLightWirelessInv = item('enderio:block_electric_light', 5)

            def eioObsidianReinforced = item('enderio:block_reinforced_obsidian')
            def eioSoulBinder = item('enderio:block_soul_binder')
            def eioSpawner = item('enderio:block_powered_spawner')
            def eioTravellingStaff = item('enderio:item_travel_staff')
            def eioTesseract = item('enderio:block_transceiver')
            def eioVacuumChestXp = item('enderio:block_xp_vacuum')
            def tcVoidSeed = item('thaumcraft:void_seed')
            def btFlaskSoul = item('botania:brewflask').withNbt(['brewKey': 'soulCross'])
            def eioBrokenSpawner = item("enderio:item_broken_spawner")
            def aaBrokenShard = item('actuallyadditions:item_misc', 20)
        // Visuals
            def eioFurnitureLadder = item('enderio:block_dark_steel_ladder')
            def eioFurnitureTrapdoor = item('enderio:block_dark_steel_trapdoor')
            def eioFurnitureDoor = item('enderio:block_dark_steel_door')
            def eioFurnitureAnvil = item('enderio:block_dark_steel_anvil')
            def eioFurnitureBars = item('enderio:block_dark_iron_bars')
        // Machines
            def eioWirelessCharger = item('enderio:block_wireless_charger')
            def eioWirelessChargerAntenna = item('enderio:block_normal_wireless_charger')
            def eioWirelessChargerAntennaExtension = item('enderio:block_wireless_charger_extension')
            def eioWirelessChargerAntennaEnhanced = item('enderio:block_enhanced_wireless_charger')

            def eioKillerJoe = item('enderio:block_killer_joe')
            def eioExperienceObelisk = item("enderio:block_experience_obelisk")
            def eioFarmingStation = item('enderio:block_farm_station')

            def eioObeliskRelocator = item('enderio:block_relocator_obelisk')
            def eioObeliskInhibitor = item('enderio:block_inhibitor_obelisk')
            def eioObeliskAversion = item('enderio:block_aversion_obelisk')
            def eioObeliskAttractor = item('enderio:block_attractor_obelisk')

            def rtCandlePeace = item('randomthings:peacecandle')
        // Conduits
            def eioConduitItem = item('enderio:item_item_conduit')
            def eioConduitFluid = item('enderio:item_liquid_conduit', 2)
            def eioConduitRedstone = item('enderio:item_redstone_conduit')
            def eioConduitME = item('enderio:item_me_conduit', 1)
            def eioConduitFacade = item('enderio:item_conduit_facade')
            def eioFilterBase = item('enderio:item_basic_item_filter')
            def eioFilterAdvanced = item('enderio:item_advanced_item_filter')
            def eioFilterRedstone = item('enderio:item_material', 60)
            def meCableDense = item('appliedenergistics2:part', 76)

    // ======== Hiding ======== //
        // ==== Hidemap ==== //
            def EIOBulkRemoval = [
            item("enderio:block_inventory_panel_sensor"),
            item("enderio:block_inventory_chest_tiny"),
            item("enderio:block_inventory_chest_small"),
            item("enderio:block_inventory_chest_medium"),
            item("enderio:block_inventory_chest_big"),
            item("enderio:block_inventory_chest_large"),
            item("enderio:block_inventory_chest_huge"),
            item("enderio:block_inventory_chest_enormous"),
            item("enderio:block_inventory_chest_warehouse"),
            item("enderio:block_inventory_chest_warehouse13"),
            item("enderio:block_simple_furnace"),
            item("enderio:block_simple_alloy_smelter"),
            item("enderio:block_alloy_smelter"),
            item("enderio:block_enhanced_alloy_smelter"),
            item("enderio:block_buffer"),
            item("enderio:block_combustion_generator"),
            item("enderio:block_enhanced_combustion_generator"),
            item("enderio:block_simple_stirling_generator"),
            item("enderio:block_stirling_generator"),
            item("enderio:block_lava_generator"),
            item("enderio:block_simple_sag_mill"),
            item("enderio:block_sag_mill"),
            item("enderio:block_enhanced_sag_mill"),
            item("enderio:block_slice_and_splice"),
            item("enderio:block_solar_panel"),
            item("enderio:block_solar_panel:1"),
            item("enderio:block_solar_panel:3"),
            item("enderio:block_vat"),
            item("enderio:block_enhanced_vat"),
            item("enderio:block_simple_wired_charger"),
            item("enderio:block_wired_charger"),
            item("enderio:block_enhanced_wired_charger"),
            item("enderio:block_simple_crafter"),
            item('enderio:block_cap_bank'), //capacitor banks
            item("enderio:block_cap_bank:1"),
            item("enderio:block_cap_bank:2"),
            item("enderio:block_cap_bank:3"),
            item("enderio:block_gauge"),
            item("enderio:item_alloy_ball"), //alloy balls
            item("enderio:item_alloy_ball:1"),
            item("enderio:item_alloy_ball:2"),
            item("enderio:item_alloy_ball:3"),
            item("enderio:item_alloy_ball:4"),
            item("enderio:item_alloy_ball:5"),
            item("enderio:item_alloy_ball:9"),
            item("enderio:item_material"),
            item("enderio:item_material:3"),
            item("enderio:item_material:21"),
            item("enderio:item_material:28"),
            item("enderio:item_material:34"),
            item("enderio:item_material:35"),
            item("enderio:item_material:36"),
            item("enderio:item_material:37"),
            item("enderio:item_material:38"),
            item("enderio:item_material:40"),
            item("enderio:item_material:41"),
            item("enderio:item_material:42"),
            item("enderio:item_material:43"),
            item("enderio:item_material:45"),
            item("enderio:item_material:46"),
            item("enderio:item_material:47"),
            item("enderio:item_material:48"),
            item("enderio:item_material:49"),
            item("enderio:item_material:50"),
            item("enderio:item_material:51"),
            item("enderio:item_material:52"),
            item("enderio:item_material:53"),
            item("enderio:item_material:54"),
            item("enderio:item_material:55"),
            item("enderio:item_material:56"),
            item("enderio:item_material:64"),
            item("enderio:item_material:66"),
            item("enderio:item_material:67"),
            item("enderio:item_material:68"),
            item("enderio:item_material:69"),
            item("enderio:item_material:70"),
            item("enderio:item_material:76"),
            item("enderio:item_material:81"),
            item("enderio:block_holy_fog"),
            item("enderio:block_dark_paper_anvil"),
            item("enderio:block_dark_paper_anvil:1"),
            item("enderio:block_dark_paper_anvil:2"),
            item("enderio:item_cold_fire_igniter"),
            item("enderio:item_inventory_charger_simple"),
            item("enderio:item_inventory_charger_basic"),
            item("enderio:item_inventory_charger"),
            item("enderio:item_inventory_charger_vibrant"),
            item("enderio:item_staff_of_levity"),
            item('enderio:item_staff_of_levity').withNbt(['enderio.darksteel.upgrade.energyUpgrade': ['level': 3, 'energy': 1000000], 'enderio:famount': 8000]),
            item("enderio:block_death_pouch"),
            item("enderio:block_inventory_panel"),
            item("enderio:item_inventory_remote"),
            item("enderio:item_inventory_remote:1"),
            item("enderio:item_inventory_remote:2"),
            item("enderio:item_material:11"), //gears
            item("enderio:item_material:12"),
            item("enderio:item_material:13"), 
            item("enderio:block_zombie_generator"), //generators
            item("enderio:block_franken_zombie_generator"),
            item("enderio:block_ender_generator"),
            item("enderio:item_material:44"), //sentient ender
            item("enderio:item_material:57"), //grinding balls
            item("enderio:item_material:58"),
            item("enderio:item_material:59"), 
            item("enderio:block_buffer:2"), //omni buffer & power buffer
            item("enderio:block_buffer:1"),
            item("enderio:block_solar_panel:2"), //solar pannel
            item("enderio:block_weather_obelisk"), //weather obelisk
            item("enderio:item_material:8"), //nutritious stick
            item("enderio:item_rod_of_return"), //rod of return
            item("enderio:block_tele_pad"), //telepad
            item("enderio:block_niard"), //niard
            item('enderio:item_material', 19), //prescient crystal
            item('enderio:item_material', 18), //weather crystal
            item('enderio:item_material', 17), //enticing crystal
            item('enderio:item_material', 6), //glider wings
            item('enderio:item_material', 7), //glider 
            item('enderio:item_power_conduit'), //energy conduit
            item('enderio:item_power_conduit', 1),
            item('enderio:item_power_conduit', 2),
            item('enderio:item_endergy_conduit'), 
            item('enderio:item_endergy_conduit', 1),
            item('enderio:item_endergy_conduit', 2),
            item('enderio:item_endergy_conduit', 3),
            item('enderio:item_endergy_conduit', 4),
            item('enderio:item_endergy_conduit', 5),
            item('enderio:item_endergy_conduit', 6),
            item('enderio:item_endergy_conduit', 7),
            item('enderio:item_endergy_conduit', 8),
            item('enderio:item_endergy_conduit', 9),
            item('enderio:item_endergy_conduit', 10),
            item('enderio:item_endergy_conduit', 11),
            item('enderio:item_capacitor_grainy'), //capacitors
            item('enderio:item_capacitor_silver'),
            item('enderio:item_capacitor_energetic_silver'),
            item('enderio:item_capacitor_vivid'),
            item('enderio:item_capacitor_totemic'),
            item('enderio:item_dark_steel_crook'), //crook
            item('enderio:item_material', 22), //conduit composite
            item('enderio:item_material', 4), //conduit binder
            item('enderio:item_liquid_conduit'), //fluid
            item('enderio:item_liquid_conduit', 1), //p fluid
            item('enderio:item_data_conduit'), //data
            item('enderio:item_me_conduit'), //me basic
            ]
            for (entry in EIOBulkRemoval) {
                mods.jei.ingredient.yeet(entry)
            }
        // ==== JEI Categories ==== //
            def EIOCategories = [
                "AlloySmelter",
                "CombustionGenerator",
                "Enchanter",
                "SagMill",
                "GrindingBall",
                "SliceNSPlice",
                "SolarPanel",
                "SoulBinder",
                "StirlingGenerator",
                "EIOTank",
                "Vat",
                "EIOWC",
                "EIOWO",
                "ZombieGenerator",
                "EnderGenerator",
                "LavaGenerator"
            ]
            for (entry in EIOCategories) {
                mods.jei.category.hideCategory(entry)
            }

    // ======== Alloys ======== //
        // ==== Removal ==== //
            def EIOAlloyRemoval = [
                    item("enderio:item_alloy_ingot"), //electrical steel
                    item("enderio:item_alloy_nugget"), 
                    item("enderio:block_alloy"),
                    item("enderio:block_alloy:3"), //redstone alloy
                    item("enderio:item_alloy_ingot:3"),
                    item("enderio:item_alloy_nugget:3"),
                    item("enderio:item_alloy_ingot:9"), //iron alloy
                    item("enderio:block_alloy:9"),
                    item("enderio:item_alloy_nugget"),
                    item("enderio:item_material:39"), //enderium base
                    item("enderio:block_alloy:4"), //conductive iron
                    item("enderio:item_alloy_ingot:4"),
                    item("enderio:item_alloy_nugget:4")
            ]
            for (entry in EIOAlloyRemoval) {
                mods.jei.ingredient.yeet(entry)
            }
        // ==== Darksteel ==== //
            // Mixing
                mixer.recipeBuilder()
                    .EUt(7).duration(60)
                    .inputs(dustSteel, dustObsidian)
                    .outputs(dustDarkSteel * 2)
                    .buildAndRegister()
            // Alloy
                // Dust + Dust
                alloy.recipeBuilder()
                    .EUt(30).duration(120)
                    .inputs(dustSteel, dustObsidian)
                    .outputs(ingotDarkSteel * 2)
                    .buildAndRegister()
                // Ingot + Dust
                alloy.recipeBuilder()
                    .EUt(30).duration(120)
                    .inputs(ingotSteel, dustObsidian)
                    .outputs(ingotDarkSteel * 2)
                    .buildAndRegister()
        // ==== Endsteel ==== //
            // Mixing
                mixer.recipeBuilder()
                    .EUt(800).duration(360)
                    .inputs(dustIridium, dustEnderPearl * 2, dustDarkSteel)
                    .outputs(dustEndSteel * 4)
                    .buildAndRegister()
        // ==== Pulsating Iron ==== //
            // Mixing
                mixer.recipeBuilder()
                    .EUt(7).duration(160)
                    .inputs(dustIron, dustBeryllium, dustEmerald)
                    .outputs(dustEndSteel * 3)
                    .buildAndRegister()
        // ==== Energetic Alloy ==== //
            // Mixing
                mixer.recipeBuilder()
                    .EUt(60).duration(320)
                    .inputs(dustPulsatingIron, dustRedAlloy)
                    .outputs(dustEnergeticAlloy)
                    .buildAndRegister()
            // Alloy
                // Dust + Dust
                    alloy.recipeBuilder()
                        .EUt(30).duration(300)
                        .inputs(dustPulsatingIron, dustRedAlloy)
                        .outputs(ingotEnergeticAlloy)
                        .buildAndRegister()
                // Ingot + Dust
                    alloy.recipeBuilder()
                        .EUt(30).duration(300)
                        .inputs(ingotPulsatingIron, dustRedAlloy)
                        .outputs(ingotEnergeticAlloy)
                        .buildAndRegister()
                // Dust + Ingot
                    alloy.recipeBuilder()
                        .EUt(30).duration(300)
                        .inputs(dustPulsatingIron, ingotRedAlloy)
                        .outputs(ingotEnergeticAlloy)
                        .buildAndRegister()
                // Ingot + Ingot
                    alloy.recipeBuilder()
                        .EUt(30).duration(300)
                        .inputs(ingotPulsatingIron, ingotRedAlloy)
                        .outputs(ingotEnergeticAlloy)
                        .buildAndRegister()
        // ==== Vibrant Alloy ==== //
            // Ender Eye
                crafting.remove("minecraft:ender_eye")
            // Mixing
                mixer.recipeBuilder()
                    .EUt(240).duration(300)
                    .inputs(dustEnergeticAlloy, dustEnderEye, dustChrome)
                    .outputs(dustVibrantAlloy * 3)
                    .buildAndRegister()
        // ==== Soularium ==== //
            // Mixing
                mixer.recipeBuilder()
                    .EUt(4000).duration(400)
                    .inputs(dustTitanium, dustVoid)
                    .outputs(dustSoularium * 2)
                    .buildAndRegister()
            // Removing Default Smelting
                furnace.removeByInput(dustSoularium)
            // EBF
                ebf.recipeBuilder()
                    .EUt(8000).duration(800)
                    .inputs(dustSoularium)
                    .notConsumable(circuit1)
                    .outputs(ingotSoularium)
                    .property("temperature", 3000)
                    .buildAndRegister()

                ebf.recipeBuilder()
                    .EUt(8000).duration(480)
                    .inputs(dustSoularium)
                    .fluidInputs(liquiddeath * 1000)
                    .notConsumable(circuit2)
                    .outputs(ingotSoularium)
                    .property("temperature", 3000)
                    .buildAndRegister()
    // ======== Fluids ======== //
        mixer.recipeBuilder()
            .inputs(dustMeat)
            .fluidInputs(liquiddistilledwater * 100)
            .fluidOutputs(nutrientdistillation * 100)
            .EUt(7).duration(120)
            .buildAndRegister()
        // Do I plan on using them? Recipes from ZS
            // Nutrient Distillation + Enderpearl = Ender Distillation 
            // Ender Distillation + Precient Powder/Dust Pulsating Iron = Vapor of Levity 
            // Naptha + Dust Blaze/Dust Redstone = Firewater
            // Distilled Water + Dust Silver/Dust Ice * 4 = Cloud Seed 
            // Cloud Seed + Dust Silver = Concentrated Cloud Seed
    // ======== Crystals ======== //
        // Pulsating
            crafting.removeByOutput(crystalPulsating)
            chembath.recipeBuilder()
                .EUt(40).duration(200)
                .inputs(gemFlawlessEmerald)
                .fluidInputs(liquidpulsatingiron * 1152)
                .outputs(crystalPulsating)
                .buildAndRegister()
        // Vibrant
            crafting.removeByOutput(crystalVibrant)
            chembath.recipeBuilder()
                .EUt(40).duration(200)
                .inputs(gemFlawlessEmerald)
                .fluidInputs(liquidvibrantalloy * 1152)
                .outputs(crystalVibrant)
                .buildAndRegister()
        // Ender
            chembath.recipeBuilder()
                .EUt(40).duration(200)
                .inputs(gemFlawlessEmerald)
                .fluidInputs(liquidender * 1152)
                .outputs(crystalEnder)
                .buildAndRegister()
    // ======== Utilities ======== //
        // ==== Gliders ==== //
            // Wing Parts
                crafting.removeByOutput(gliderWingLeft)
                crafting.removeByOutput(gliderWingRight)
                crafting.removeByOutput(gliderScaffolding)
                
                crafting.addShaped("ggn_eio_gliderwingleft", gliderWingLeft,
                [
                    [stickWroughtIron, screwWroughtIron, gtscrewdriver],
                    [itemLeather, stickWroughtIron, screwWroughtIron],
                    [itemLeather, itemLeather, stickWroughtIron]
                ])

                crafting.addShaped("ggn_eio_gliderwingright", gliderWingRight,
                [
                    [gtscrewdriver, screwWroughtIron, stickWroughtIron],
                    [screwWroughtIron, stickWroughtIron, itemLeather],
                    [stickWroughtIron, itemLeather, itemLeather]
                ])

                crafting.addShaped("ggn_eio_gliderscaffolding", gliderScaffolding,
                [
                    [screwWroughtIron, stickWroughtIron, screwWroughtIron],
                    [stickWroughtIron, gtscrewdriver, stickWroughtIron,],
                    [stickWroughtIron, stickWroughtIron, stickWroughtIron]
                ])
            // Advanced Glider
                crafting.removeByOutput(gliderAdvanced)
                crafting.addShaped("ggn_eio_glideradvanced", gliderAdvanced,
                [
                    [screwWroughtIron, itemElytra, screwWroughtIron],
                    [gtscrewdriver, gliderNormal, gtfile],
                    [plateDarkSteel, screwWroughtIron, plateDarkSteel]
                ])
            // Upgrades
                crafting.removeByOutput(gliderUpgrade)
                crafting.addShapeless("ggn_eio_gliderupgrade", gliderUpgrade, [gliderNormal, eioUpgradeBlank])
        // ==== Armor & Tools ==== //
            // == Darksteel Armor == //
                // Helmet
                    crafting.removeByOutput(eioHelmetDarksteel)
                   assembler.recipeBuilder()
                        .fluidInputs(solder * 144)
                        .inputs(ieHelmetSteel, plateDarkSteel * 5, screwDarkSteel * 20)
                        .outputs(eioHelmetDarksteel)
                        .EUt(60).duration(200)
                        .buildAndRegister()
                // Chestplate
                    crafting.removeByOutput(eioChestplateDarksteel)
                    assembler.recipeBuilder()
                        .fluidInputs(solder * 288)
                        .inputs(ieChestplateSteel, plateDarkSteel * 8, screwDarkSteel * 32)
                        .outputs(eioChestplateDarksteel)
                        .EUt(60).duration(200)
                        .buildAndRegister()
                // Leggings
                    crafting.removeByOutput(eioLeggingsDarksteel)
                    assembler.recipeBuilder()
                        .fluidInputs(solder * 288)
                        .inputs(ieLeggingsSteel, plateDarkSteel * 7, screwDarkSteel * 28)
                        .outputs(eioLeggingsDarksteel)
                        .EUt(60).duration(200)
                        .buildAndRegister()
                // Boots
                    crafting.removeByOutput(eioBootsDarksteel)
                    assembler.recipeBuilder()
                        .fluidInputs(solder * 144)
                        .inputs(ieBootsSteel, plateDarkSteel * 4, screwDarkSteel * 16)
                        .outputs(eioBootsDarksteel)
                        .EUt(60).duration(200)
                        .buildAndRegister()
                // Shield
                    crafting.removeByOutput(eioShieldDark)
                    assembler.recipeBuilder()
                        .fluidInputs(solder * 432)
                        .inputs(ieShieldSteel, plateDarkSteel * 12, screwDarkSteel * 48)
                        .outputs(eioShieldDark)
                        .EUt(60).duration(200)
                        .buildAndRegister()
            // == Darksteel Tools == //
                // Sword
                    crafting.removeByOutput(eioSwordDark)
                    assembler.recipeBuilder()
                        .fluidInputs(solder * 72)
                        .EUt(60).duration(200)
                        .inputs(ieSwordSteel, plateDarkSteel * 4, screwDarkSteel * 16, stickDarkSteel)
                        .outputs(eioSwordDark)
                        .buildAndRegister()
                // Pickaxe
                    crafting.removeByOutput(eioPickaxeDark)
                    assembler.recipeBuilder()
                        .fluidInputs(solder * 72)
                        .EUt(60).duration(200)
                        .inputs(iePickaxeSteel, plateDarkSteel * 6, screwDarkSteel * 24, stickDarkSteel * 2)
                        .outputs(eioPickaxeDark)
                        .buildAndRegister()
                // Axe
                    crafting.removeByOutput(eioAxeDark)
                    assembler.recipeBuilder()
                        .fluidInputs(solder * 72)
                        .EUt(60).duration(200)
                        .inputs(ieAxeSteel, plateDarkSteel * 6, screwDarkSteel * 24, stickDarkSteel * 2)
                        .outputs(eioAxeDark)
                        .buildAndRegister()
                // Shears
                    crafting.removeByOutput(eioShearsDark)
                    assembler.recipeBuilder()
                        .fluidInputs(solder * 72)
                        .EUt(60).duration(200)
                        .inputs(itemShears, plateDarkSteel * 4, screwDarkSteel * 8)
                        .outputs(eioShearsDark)
                        .buildAndRegister()
                // Bow
                    crafting.removeByOutput(eioBowDark)
                    assembler.recipeBuilder()
                        .fluidInputs(solder * 72)
                        .EUt(60).duration(200)
                        .inputs(itemBow, plateDarkSteel * 6, screwDarkSteel * 24, stickDarkSteel * 3)
                        .outputs(eioBowDark)
                        .buildAndRegister()
                // Backhoe
                    crafting.removeByOutput(eioBackhoe)
                    assembler.recipeBuilder()
                        .inputs(ieHoeSteel, plateDarkSteel * 4, screwDarkSteel * 16, stickDarkSteel)
                        .outputs(eioBackhoe)
                        .EUt(30)
                        .duration(260)
                        .buildAndRegister()
            // == Darksteel Upgrades == //
                // Blank
                crafting.addShaped("ggn_eio_upgradeblank", eioUpgradeBlank,
                [
                    [plateDarkSteel, plateDarkSteel, plateDarkSteel],
                    [screwDarkSteel, eioPaperBlack, screwDarkSteel],
                    [plateDarkSteel, plateDarkSteel, plateDarkSteel]
                ])
        // ==== Fluid Tanks ==== //
            // Normal
                crafting.removeByOutput(eioTankNormal)
                crafting.addShaped("ggn_eio_tanknormal", eioTankNormal,
                [
                    [plateIron, barsIron, plateIron],
                    [plateGlass, null, plateGlass],
                    [plateIron, barsIron, plateIron],
                ])
            // Pressurized
                crafting.removeByOutput(eioTankPressurized)
                crafting.addShaped("ggn_eio_tankpressurized", eioTankPressurized,
                [
                    [plateDarkSteel, barsDarkSteel, plateDarkSteel],
                    [plateGlass, eioTankNormal, plateGlass],
                    [plateDarkSteel, barsDarkSteel, plateDarkSteel],
                ])
        // ==== Endervoir ==== //
            // Omnivoir
                crafting.removeByOutput(eioOmnivoir)
                crafting.addShaped("ggn_eio_omnivoir", eioOmnivoir * 4,
                [
                    [blockGlassFusedQuartz, plateWroughtIron, blockGlassFusedQuartz],
                    [plateWroughtIron, itemCauldron, plateWroughtIron],
                    [blockGlassFusedQuartz, plateWroughtIron, blockGlassFusedQuartz]
                ])
            // Endervoir
                crafting.removeByOutput(eioEndervoir)
                crafting.addShaped("ggn_eio_endervoirmagic", eioEndervoir * 4,
                [
                    [blockAquaInfused, plateGlass, blockAquaInfused],
                    [plateGlass, tcEverfullUrn, plateGlass],
                    [blockAquaInfused, plateGlass, blockAquaInfused]
                ])

                crafting.addShaped("ggn_eio_endervoirtech", eioEndervoir * 4,
                [
                    [blockAquaInfused, plateGlass, blockAquaInfused],
                    [plateGlass, pumpMv, plateGlass],
                    [blockAquaInfused, plateGlass, blockAquaInfused]
                ])
            // Infinite Water Cover
                mods.gregtech.assembler.removeByInput(480, [metaitem('electric.pump.hv') * 2, item('minecraft:cauldron'), metaitem('circuit.advanced_integrated')], null)
                crafting.addShaped("ggn_eio_gtwatercover", gtWaterCover * 2,
                [
                    [plateDenseAquaInfused, plateIridium, plateDenseAquaInfused],
                    [pumpIv, circuitIv, pumpIv],
                    [plateDenseAquaInfused, plateIridium, plateDenseAquaInfused],
                ])

        // ==== Travel Anchor ==== //
            crafting.removeByOutput(eioTravelAnchor)
            assembler.recipeBuilder()
                .EUt(16).duration(200)
                .inputs(eioChassis, crystalEnder, platePulsatingIron * 6, screwPulsatingIron * 24)
                .fluidInputs(liquidender * 432)
                .outputs(eioTravelAnchor * 2)
                .buildAndRegister()
        // ==== Exit Rail ==== //
            crafting.removeByOutput(itemRail)
            crafting.removeByOutput(eioExitRail)
            assembler.recipeBuilder()
                .inputs(itemRail, itemPiston, plateIron, plateRedAlloy)
                .outputs(eioExitRail)
                .EUt(7).duration(20)
                .buildAndRegister()
        // ==== Staff of Traveling ==== //
            crafting.removeByOutput(eioTravellingStaff)
            crafting.addShaped("ggn_eio_stafftravel", eioTravellingStaff,
            [
                [screwPulsatingIron, plateVibrantAlloy, crystalEnder],
                [gtfile, stickVibrantAlloy, plateVibrantAlloy],
                [stickVibrantAlloy, gtscrewdriver, screwPulsatingIron]
            ])
        // ==== Electromagnet ==== //
            crafting.removeByOutput(eioMagnet)
            crafting.addShaped("ggn_eio_magnet", eioMagnet,
            [
                [screwRedAlloy, ringDarkSteel, screwRedAlloy],
                [stickSteelMagnetic, gtscrewdriver, stickSteelMagnetic],
                [ingotSteelMagnetic, gtfile, ingotSteelMagnetic]
            ])
    // ======== Components ======== //
        // ==== Chassis ==== //
            crafting.addShaped("ggn_eio_chassis", eioChassis,
            [
                [platePulsatingIron, plateDarkSteel, platePulsatingIron],
                [plateDarkSteel, hullLv, plateDarkSteel],
                [platePulsatingIron, plateDarkSteel, platePulsatingIron]
            ])

            assembler.recipeBuilder()
                .inputs(platePulsatingIron * 4, plateDarkSteel * 4, hullLv)
                .outputs(eioChassis)
                .EUt(7).duration(80)
                .buildAndRegister()
        // ==== Capacitors ==== //
            // Basic - LV
                crafting.removeByOutput(eioCapacitorBasic)
                crafting.addShaped("ggn_eio_capacitor", eioCapacitorBasic,
                [
                    [screwPulsatingIron, plateSteel, screwPulsatingIron],
                    [circuitLv, emitterLv, circuitLv],
                    [screwPulsatingIron, plateSteel, screwPulsatingIron]
                ])
            // Double - MV
                crafting.removeByOutput(eioCapacitorDouble)
                crafting.addShaped("ggn_eio_capacitordouble", eioCapacitorDouble,
                [
                    [screwEnergeticAlloy, eioCapacitorBasic, screwEnergeticAlloy],
                    [circuitMv, emitterMv, circuitMv],
                    [screwEnergeticAlloy, plateAluminium, screwEnergeticAlloy]
                ])
            // Octadic - HV
                crafting.removeByOutput(eioCapacitorOctadic)
                crafting.addShaped("ggn_eio_capacitoroctadic", eioCapacitorOctadic,
                [
                    [screwVibrantAlloy, eioCapacitorDouble, screwVibrantAlloy],
                    [circuitHv, emitterHv, circuitHv],
                    [screwVibrantAlloy, plateVibrantAlloy, screwVibrantAlloy]
                ])
            // Crystalline - HV w/ Magic
                crafting.removeByOutput(eioCapacitorCrystalline)
                chembath.recipeBuilder()
                    .EUt(400).duration(400)
                    .fluidInputs(liquidvis * 8000)
                    .inputs(eioCapacitorOctadic)
                    .outputs(eioCapacitorCrystalline)
                    .buildAndRegister()
            // Melodic - EV
                crafting.removeByOutput(eioCapacitorMelodic)
                crafting.addShaped("ggn_eio_capacitormelodic", eioCapacitorMelodic,
                [
                    [screwEndSteel, eioCapacitorOctadic, screwEndSteel],
                    [circuitEv, emitterEv, circuitEv],
                    [screwVibrantAlloy, plateEndSteel, screwVibrantAlloy]
                ])

                crafting.addShaped("ggn_eio_capacitormelodicmagic", eioCapacitorMelodic,
                [
                    [screwEndSteel, eioCapacitorCrystalline, screwEndSteel],
                    [circuitEv, emitterEv, circuitEv],
                    [screwVibrantAlloy, plateEndSteel, screwVibrantAlloy]
                ])
            // Stellar - IV?
                crafting.removeByOutput(eioCapacitorStellar)
                crafting.addShaped("ggn_eio_capacitorstellar", eioCapacitorStellar,
                [
                    [screwStellarAlloy, eioCapacitorMelodic, screwStellarAlloy],
                    [circuitIv, emitterIv, circuitIv],
                    [screwStellarAlloy, plateStellarAlloy, screwStellarAlloy]
                ])
        // ==== Black Paper ==== //
            crafting.removeByOutput(eioPaperBlack)
            chembath.recipeBuilder()
                .EUt(7)
                .duration(300)
                .inputs(itemPaper)
                .fluidInputs(fluid("dye_black") * 36)
                .outputs(eioPaperBlack)
                .buildAndRegister()
        // ==== Experience Rod ==== //
            crafting.removeByOutput(eioRodExperience)
            chembath.recipeBuilder()
                .EUt(60)
                .duration(800)
                .inputs(stickVibrantAlloy)
                .fluidInputs(liquidexperience * 1120)
                .outputs(eioRodExperience)
                .buildAndRegister()
    // ======== Machines ======== //
        // ==== Wireless Charger ==== //
            // Machine
                crafting.removeByOutput(eioWirelessCharger)
                assembler.recipeBuilder()
                    .inputs(eioChassis, platePulsatingIron * 6, screwPulsatingIron * 24, emitterMv * 4)
                    .outputs(eioWirelessCharger)
                    .fluidInputs(solder * 72)
                    .EUt(60).duration(90)
                    .buildAndRegister()
            // Normal
                crafting.removeByOutput(eioWirelessChargerAntenna)
                assembler.recipeBuilder()
                    .inputs(stickPulsatingIron * 2, platePulsatingIron * 6, screwPulsatingIron * 24, emitterMv * 4)
                    .outputs(eioWirelessChargerAntenna)
                    .fluidInputs(solder * 72)
                    .EUt(60).duration(90)
                    .buildAndRegister()
            // Enhanced
                crafting.removeByOutput(eioWirelessChargerAntennaEnhanced)
                assembler.recipeBuilder()
                    .inputs(stickVibrantAlloy, plateVibrantAlloy * 6, screwVibrantAlloy * 24, emitterHv * 4)
                    .outputs(eioWirelessChargerAntennaEnhanced)
                    .fluidInputs(solder * 72)
                    .EUt(60).duration(90)
                    .buildAndRegister()
            // Booster
                crafting.removeByOutput(eioWirelessChargerAntennaExtension)
                assembler.recipeBuilder()
                    .inputs(stickEnergeticAlloy * 2, plateEnergeticAlloy * 6, screwEnergeticAlloy * 24, emitterMv * 4)
                    .outputs(eioWirelessChargerAntennaExtension)
                    .fluidInputs(solder * 72)
                    .EUt(60).duration(90)
                    .buildAndRegister()

        // ==== Killer Joe ==== //
            crafting.removeByOutput(eioKillerJoe)
            assembler.recipeBuilder()
                .EUt(480).duration(200)
                .inputs(eioChassis, tcBrain, plateDarkSteel * 6, blockGlassTempered * 12)
                .fluidInputs(liquiddeath * 3000)
                .buildAndRegister()
        // ==== Farming Station ==== //
            crafting.removeByOutput(eioFarmingStation)
            assembler.recipeBuilder()
                .EUt(480).duration(260)
                .inputs(eioChassis, crystalVibrant, screwVibrantAlloy * 36, plateVibrantAlloy * 9, ore("toolHeadBuzzSawSteel"))
                .outputs(eioFarmingStation)
                .buildAndRegister()
        // ==== Obelisks ==== //
            // Experience 
                crafting.removeByOutput(eioExperienceObelisk)
                assembler.recipeBuilder()
                    .EUt(120).duration(400)
                    .inputs(eioChassis, eioRodExperience, screwDarkSteel * 16, plateEnergeticAlloy * 8, blockPulsatingIron)
                    .fluidInputs(liquidender * 720)
                    .outputs(eioExperienceObelisk)
                    .buildAndRegister()
            // Inhibitor 
                crafting.removeByOutput(eioObeliskInhibitor)
                assembler.recipeBuilder()
                    .EUt(120).duration(400)
                    .inputs(eioChassis, crystalEnder, plateEnergeticAlloy * 6, screwDarkSteel * 24, blockPulsatingIron)
                    .fluidInputs(acetone * 720)
                    .outputs(eioObeliskInhibitor)
                    .buildAndRegister()
            // Attraction
                crafting.removeByOutput(eioObeliskAttractor)
                assembler.recipeBuilder()
                    .EUt(120).duration(400)
                    .inputs(eioChassis, eioMagnet, plateEnergeticAlloy * 6, screwDarkSteel * 24, blockPulsatingIron)
                    .fluidInputs(acetone * 720)
                    .outputs(eioObeliskInhibitor)
                    .buildAndRegister()
            // Aversion 
                crafting.removeByOutput(eioObeliskAversion)
                assembler.recipeBuilder()
                    .EUt(120).duration(400)
                    .inputs(eioChassis, rtCandlePeace, plateEnergeticAlloy * 6, screwDarkSteel * 24, blockPulsatingIron)
                    .fluidInputs(acetone * 720)
                    .outputs(eioObeliskAversion)
                    .buildAndRegister()
            // Relocator 
                crafting.removeByOutput(eioObeliskRelocator)
                assembler.recipeBuilder()
                    .EUt(120).duration(400)
                    .inputs(eioChassis, crystalPulsating, plateEnergeticAlloy * 6, screwDarkSteel * 24, blockPulsatingIron)
                    .fluidInputs(liquidender * 720)
                    .outputs(eioObeliskRelocator)
                    .buildAndRegister()
        // ==== Painting Machine ==== //
            crafting.removeByOutput(eioPaintingMachine)
            crafting.addShaped("ggn_eio_painter", eioPaintingMachine,
            [
                [platePulsatingIron, screwGold, platePulsatingIron],
                [platePulsatingIron, eioChassis, platePulsatingIron],
                [platePulsatingIron, screwGold, platePulsatingIron]
            ])
        // ==== Tranceiver ==== //
            crafting.removeByOutput(eioTesseract)
            assembler.recipeBuilder()
                .inputs(eioChassis * 2, circuitIv * 16, sensorEv * 8, emitterEv * 8, plateVibrantAlloy * 16, screwVibrantAlloy * 64)
                .fluidInputs(liquidender * 8000)
                .outputs(eioTesseract * 2)
                .EUt(2000).duration(600)
                .buildAndRegister()

            assembler.recipeBuilder()
                .inputs(eioChassis * 2, tcVoidSeed * 2, circuitIv * 8, sensorEv * 4, emitterEv * 4, plateVibrantAlloy * 16, screwVibrantAlloy * 64)
                .fluidInputs(liquidender * 8000)
                .outputs(eioTesseract * 2)
                .EUt(2000).duration(600)
                .buildAndRegister()
        // ==== Soul Binder ==== //
            crafting.removeByOutput(eioSoulBinder)
            crafting.addShaped("ggn_eio_soulbinder", eioSoulBinder,
            [
                [plateSoularium, btFlaskSoul, plateSoularium],
                [circuitIv, eioChassis, circuitIv],
                [plateSoularium, blockDarkSteel, plateSoularium]
            ])
        // ==== Powered Spawner ==== //
            crafting.removeByOutput(eioSpawner)
            assembler.recipeBuilder()
                .EUt(500).duration(200)
                .inputs(eioChassis, eioBrokenSpawner, aaBrokenShard * 8, plateDarkSteel * 32)
                .outputs(eioSpawner)
                .buildAndRegister()
        // ==== Vacuum Chest ==== //
            crafting.removeByOutput(eioVacuumChest)
            crafting.addShaped("ggn_eio_vacuumchest", eioVacuumChest,
            [
                [platePulsatingIron, itemHopper, platePulsatingIron],
                [stickPulsatingIron, anychest, stickPulsatingIron],
                [platePulsatingIron, platePulsatingIron, platePulsatingIron]
            ])
        // ==== Experience Vacuum ==== //
            crafting.removeByOutput(eioVacuumChestXp)
            crafting.addShaped("ggn_eio_vacuumchestxp", eioVacuumChestXp,
            [
                [platePulsatingIron, eioRodExperience, platePulsatingIron],
                [stickPulsatingIron, anychest, stickPulsatingIron],
                [platePulsatingIron, platePulsatingIron, platePulsatingIron]
            ])
            
    // ======== Visuals ======== //
        // ==== Fused Quartz ==== // 
            alloy.recipeBuilder()
                .EUt(30)
                .duration(200)
                .inputs(gemQuartz * 4)
                .notConsumable(gtMoldBlock)
                .outputs(blockGlassFusedQuartz.first)
                .buildAndRegister()

            alloy.recipeBuilder()
                .EUt(30)
                .duration(200)
                .inputs(gemCertusQuartz * 4)
                .notConsumable(gtMoldBlock)
                .outputs(blockGlassFusedQuartz.first)
                .buildAndRegister()
        // ==== Darksteel Furniture ==== // 
            // Ladder
                crafting.removeByOutput(eioFurnitureLadder)
                crafting.addShaped("ggn_eio_furnitureladder", eioFurnitureLadder * 2,
                [
                    [stickDarkSteel, gtfile, stickDarkSteel],
                    [stickDarkSteel, stickDarkSteel, stickDarkSteel],
                    [stickDarkSteel, gthammer, stickDarkSteel]
                ])
                assembler.recipeBuilder()
                    .EUt(7).duration(40)
                    .inputs(stickDarkSteel * 7)
                    .notConsumable(circuit5)
                    .outputs(eioFurnitureLadder * 2)
                    .buildAndRegister()
            // Trapdoor
                crafting.removeByOutput(eioFurnitureTrapdoor)
                crafting.addShaped("ggn_eio_furnituretrapdoor", eioFurnitureTrapdoor,
                [
                    [screwDarkSteel, plateDarkSteel, screwDarkSteel],
                    [plateDarkSteel, itemTrapdoorIron, plateDarkSteel],
                    [gtsaw, plateDarkSteel, gtscrewdriver]
                ])
                assembler.recipeBuilder()
                    .EUt(7).duration(40)
                    .inputs(plateDarkSteel * 4, screwDarkSteel * 2, itemTrapdoorIron)
                    .notConsumable(circuit4)
                    .outputs(eioFurnitureTrapdoor)
                    .buildAndRegister()
            // Door
                crafting.removeByOutput(eioFurnitureDoor)
                crafting.addShaped("ggn_eio_furnituredoor", eioFurnitureTrapdoor,
                [
                    [plateDarkSteel, plateDarkSteel, gthammer],
                    [plateDarkSteel, ringDarkSteel, screwDarkSteel],
                    [plateDarkSteel, plateDarkSteel, gtscrewdriver]
                ])
                assembler.recipeBuilder()
                    .EUt(7).duration(40)
                    .inputs(plateDarkSteel * 6)
                    .notConsumable(circuit5)
                    .outputs(eioFurnitureTrapdoor)
                    .buildAndRegister()
            // Anvil
                crafting.removeByOutput(eioFurnitureAnvil)
                solidifier.recipeBuilder()
                    .EUt(16).duration(2240)
                    .fluidInputs(fluid("dark_steel") * 4464)
                    .notConsumable(gtMoldAnvil)
                    .outputs(eioFurnitureAnvil)
                    .buildAndRegister()

                alloy.recipeBuilder()
                    .EUt(16).duration(2240)
                    .inputs(ingotDarkSteel * 31)
                    .notConsumable(gtMoldAnvil)
                    .outputs(eioFurnitureAnvil)
                    .buildAndRegister()            
            // Bars
                crafting.removeByOutput(eioFurnitureBars)
                crafting.addShaped("ggn_eio_furniturebars", eioFurnitureBars * 8,
                [
                    [null, gthammer, null],
                    [stickDarkSteel, stickDarkSteel, stickDarkSteel],
                    [stickDarkSteel, stickDarkSteel, stickDarkSteel]
                ])

                assembler.recipeBuilder()
                    .EUt(4).duration(300)
                    .inputs(stickDarkSteel * 3)
                    .notConsumable(circuit4)
                    .outputs(eioFurnitureBars * 4)
                    .buildAndRegister()

            // Recycling
                // Ladder - 1 to 1 
                macerator.recipeBuilder().inputs(eioFurnitureLadder).outputs(dustDarkSteel).EUt(2).duration(60).category(RecipeCategories.MACERATOR_RECYCLING).buildAndRegister()
                arc.recipeBuilder().inputs(eioFurnitureLadder).outputs(ingotDarkSteel).EUt(2).duration(60).fluidInputs(oxygen * 60).category(RecipeCategories.ARC_FURNACE_RECYCLING).buildAndRegister()
                extractor.recipeBuilder().inputs(eioFurnitureLadder).fluidOutputs(fluid("dark_steel") * 144).EUt(30).duration(60).category(RecipeCategories.EXTRACTOR_RECYCLING).buildAndRegister()
                // Trapdoor - 1 to 6
                macerator.recipeBuilder().inputs(eioFurnitureTrapdoor).outputs(dustDarkSteel * 6).EUt(2).duration(360).category(RecipeCategories.MACERATOR_RECYCLING).buildAndRegister()
                arc.recipeBuilder().inputs(eioFurnitureTrapdoor).outputs(ingotDarkSteel * 6).EUt(2).duration(360).fluidInputs(oxygen * 360).category(RecipeCategories.ARC_FURNACE_RECYCLING).buildAndRegister()
                extractor.recipeBuilder().inputs(eioFurnitureTrapdoor).fluidOutputs(fluid("dark_steel") * 864).EUt(30).duration(360).category(RecipeCategories.EXTRACTOR_RECYCLING).buildAndRegister()
                // Door - 1 to 6
                macerator.recipeBuilder().inputs(eioFurnitureDoor).outputs(dustDarkSteel * 6).EUt(2).duration(360).category(RecipeCategories.MACERATOR_RECYCLING).buildAndRegister()
                arc.recipeBuilder().inputs(eioFurnitureDoor).outputs(ingotDarkSteel * 6).EUt(2).duration(360).fluidInputs(oxygen * 360).category(RecipeCategories.ARC_FURNACE_RECYCLING).buildAndRegister()
                extractor.recipeBuilder().inputs(eioFurnitureDoor).fluidOutputs(fluid("dark_steel") * 864).EUt(30).duration(360).category(RecipeCategories.EXTRACTOR_RECYCLING).buildAndRegister()
                // Anvil - 1 to 31
                macerator.recipeBuilder().inputs(eioFurnitureAnvil).outputs(dustDarkSteel * 31).EUt(2).duration(1860).category(RecipeCategories.MACERATOR_RECYCLING).buildAndRegister()
                arc.recipeBuilder().inputs(eioFurnitureAnvil).outputs(ingotDarkSteel * 31).EUt(2).duration(1860).fluidInputs(oxygen * 1860).category(RecipeCategories.ARC_FURNACE_RECYCLING).buildAndRegister()
                extractor.recipeBuilder().inputs(eioFurnitureAnvil).fluidOutputs(fluid("dark_steel") * 4464).EUt(30).duration(1860).category(RecipeCategories.EXTRACTOR_RECYCLING).buildAndRegister()
                // Bars - 1 to 1/9th
                macerator.recipeBuilder().inputs(eioFurnitureBars).outputs(dustTinyDarkSteel).EUt(2).duration(7).category(RecipeCategories.MACERATOR_RECYCLING).buildAndRegister()
                arc.recipeBuilder().inputs(eioFurnitureBars).outputs(nuggetDarkSteel).EUt(2).duration(7).fluidInputs(oxygen * 7).category(RecipeCategories.ARC_FURNACE_RECYCLING).buildAndRegister()
                extractor.recipeBuilder().inputs(eioFurnitureBars).fluidOutputs(fluid("dark_steel") * 16).EUt(30).duration(7).category(RecipeCategories.EXTRACTOR_RECYCLING).buildAndRegister()
        // ==== Electric Lights ==== // 
            // Chisel Group
                mods.chisel.carving.addGroup("EIOLights") 
            // Electric Light
                def electriclights = [
                    eioLightElectric,
                    eioLightElectricInv,
                    eioLight,
                    eioLightInv,
                    eioLightWireless,
                    eioLightWirelessInv,
                ]
                for (entry in electriclights) {
                    crafting.removeByOutput(entry)
                    mods.chisel.carving.addVariation("EIOLights", entry)
                }
                crafting.addShaped("ggn_eio_light", eioLight,
                [
                    [blockGlassFusedQuartz, blockGlassFusedQuartz, blockGlassFusedQuartz],
                    [dustGlowstone, circuitLv, dustGlowstone],
                    [plateSilicon, plateSilicon, plateSilicon]
                ])
        // ==== Reinforced Obsidian ==== //
            crafting.removeByOutput(eioObsidianReinforced)
            solidifier.recipeBuilder()
                .fluidInputs(liquidlava * 1000)
                .inputs(stickDarkSteel * 4)
                .outputs(eioObsidianReinforced)
                .EUt(16).duration(600)
                .buildAndRegister()
    // ======== Conduits ======== //
        // ==== Tools ==== //
            // Wrench
                crafting.removeByOutput(eioWrench)
                crafting.addShaped("ggn_eio_eiowrench", eioWrench,
                [
                    [platePulsatingIron, gthammer, platePulsatingIron],
                    [null, platePulsatingIron, null],
                    [null, platePulsatingIron, null]
                ])
            // Probe
                crafting.removeByOutput(eioProbe)
                crafting.addShaped("ggn_eio_eioprobe", eioProbe,
                [
                    [platePulsatingIron, circuitLv, platePulsatingIron]
                ])

        // ==== Removing ==== //
            furnace.removeByInput(item('enderio:item_material', 22))
        // ==== Conduit Types ==== //
            // ==== Redstone - LV ==== //
                crafting.removeByOutput(eioConduitRedstone)
                assembler.recipeBuilder()
                    .EUt(16).duration(80)
                    .inputs(wireDoubleRedAlloy * 8, platePulsatingIron * 4)
                    .fluidInputs(liquidender * 144)
                    .outputs(eioConduitRedstone * 8)
                    .buildAndRegister()  
            // ==== Item - MV ==== // 
                crafting.removeByOutput(eioConduitItem)
                assembler.recipeBuilder()
                    .EUt(16).duration(80)
                    .inputs(pipeNormalPulsatingIron * 4, plateEnergeticAlloy * 4, screwPulsatingIron * 16)
                    .fluidInputs(liquidender * 144)
                    .outputs(eioConduitItem * 4)
                    .buildAndRegister()  
            // ==== Fluid - HV ==== // 
                crafting.removeByOutput(eioConduitFluid)
                assembler.recipeBuilder()
                    .EUt(16).duration(80)
                    .inputs(pipeNormalVibrantAlloy * 4, plateVibrantAlloy * 4, screwVibrantAlloy * 16)
                    .fluidInputs(liquidender * 144)
                    .outputs(eioConduitFluid * 4)
                    .buildAndRegister()
            // ==== ME - LV ==== // 
                crafting.removeByOutput(eioConduitME)
                assembler.recipeBuilder()
                    .EUt(16).duration(80)
                    .inputs(meCableDense * 4, plateFluixSteel * 4, screwFluixSteel * 16)
                    .fluidInputs(liquidender * 144)
                    .outputs(eioConduitME * 4)
                    .buildAndRegister()  
        // ==== Filters ==== //
            // Base Filters
                // Normal
                    crafting.removeByOutput(eioFilterBase)
                    crafting.addShaped("ggn_eio_filterbase", eioFilterBase * 4,
                    [
                        [screwPulsatingIron, eioPaperBlack, screwPulsatingIron],
                        [eioPaperBlack, plateDarkSteel, eioPaperBlack],
                        [screwPulsatingIron, eioPaperBlack, screwPulsatingIron],
                    ])
                // Advanced
                    crafting.removeByOutput(eioFilterAdvanced)
                    crafting.addShaped("ggn_eio_advanced", eioFilterAdvanced,
                    [
                        [eioFilterBase, screwDarkSteel, eioFilterBase],
                        [screwDarkSteel, plateStainlessSteel, screwDarkSteel],
                        [eioFilterBase, screwDarkSteel, eioFilterBase]
                    ])
                // Redstone
                    crafting.removeByOutput(eioFilterRedstone)
                    crafting.addShaped("ggn_eio_redstone", eioFilterRedstone,
                    [
                        [screwRedAlloy, eioPaperBlack, screwRedAlloy],
                        [eioPaperBlack, plateDarkSteel, eioPaperBlack],
                        [screwRedAlloy, eioPaperBlack, screwRedAlloy],
                    ])


            // Chisel Groups
                mods.chisel.carving.addGroup("EIOFilters") 
                mods.chisel.carving.addGroup("EIOBigFilters") 
                mods.chisel.carving.addGroup("EIORedstoneFilters") 
                // Filters
                    def eioItem = [
                        item("enderio:item_basic_item_filter"),
                        item("enderio:item_mod_item_filter"),
                        item("enderio:item_power_item_filter"),                                
                        item("enderio:item_soul_filter_normal"),
                        item("enderio:item_enchantment_filter_normal"),
                        item("enderio:item_existing_item_filter"),
                        item("enderio:item_fluid_filter"),
                        item("enderio:item_limited_item_filter"),
                        item("enderio:item_extract_speed_upgrade"),
                        item("enderio:item_extract_speed_downgrade")
                    ]
                    for (entry in eioItem) {
                        mods.chisel.carving.addVariation("EIOFilters", entry)
                    }
                // Advanced Filters
                    def eioItem2 = [
                        item("enderio:item_advanced_item_filter"),
                        item("enderio:item_big_item_filter"),
                        item("enderio:item_big_advanced_item_filter"),
                        item("enderio:item_enchantment_filter_big"),
                        item("enderio:item_soul_filter_big"),
                    ]
                    for (entry in eioItem2) {
                        mods.chisel.carving.addVariation("EIOBigFilters", entry)
                    }
                // Redstone Filters
                    def eioItem3 = [
                        item("enderio:item_material:60"),
                        item("enderio:item_redstone_timer_filter"),
                        item("enderio:item_redstone_sensor_filter"),
                        item("enderio:item_redstone_or_filter"),
                        item("enderio:item_redstone_not_filter"),
                        item("enderio:item_redstone_nor_filter"),
                        item("enderio:item_redstone_nand_filter"),
                        item("enderio:item_redstone_counting_filter"),
                        item("enderio:item_redstone_and_filter"),
                        item("enderio:item_redstone_xor_filter"),
                        item("enderio:item_redstone_xnor_filter"),
                        item("enderio:item_redstone_toggle_filter")
                    ]
                    for (entry in eioItem3) {
                        mods.chisel.carving.addVariation("EIORedstoneFilters", entry)
                    }

        // ==== Visuals ==== //
            // Facade
                crafting.remove("enderio:conduit_facade_transparent")
                crafting.addShaped("ggn_eio_facade", eioConduitFacade * 16,
                [
                    [dustClay, dustPulsatingIron, dustClay],
                    [dustPulsatingIron, anywool, dustPulsatingIron],
                    [dustClay, dustPulsatingIron, dustClay]
                ])
// ================ EnderIO ================ //
