#priority 1000
import mods.jei.JEI.removeAndHide as rh;
import crafttweaker.item.IItemStack;
import crafttweaker.item.IItemDefinition;
import crafttweaker.item.IIngredient;
import crafttweaker.oredict.IOreDict;
import crafttweaker.oredict.IOreDictEntry;
import mods.gregtech.recipe.RecipeMaps;
import mods.gregtech.recipe.RecipeMap;

# ================ EnderIO ================ #
    # ======== Variables ======== #
        
    # ======== Bulk Removal ======== #
        val EIOBulkRemoval = [
            <enderio:block_inventory_panel_sensor>,
            <enderio:block_inventory_chest_tiny>,
            <enderio:block_inventory_chest_small>,
            <enderio:block_inventory_chest_medium>,
            <enderio:block_inventory_chest_big>,
            <enderio:block_inventory_chest_large>,
            <enderio:block_inventory_chest_huge>,
            <enderio:block_inventory_chest_enormous>,
            <enderio:block_inventory_chest_warehouse>,
            <enderio:block_inventory_chest_warehouse13>,
            <enderio:block_simple_furnace>,
            <enderio:block_simple_alloy_smelter>,
            <enderio:block_alloy_smelter>,
            <enderio:block_enhanced_alloy_smelter>,
            <enderio:block_buffer>,
            <enderio:block_combustion_generator>,
            <enderio:block_enhanced_combustion_generator>,
            <enderio:block_simple_stirling_generator>,
            <enderio:block_stirling_generator>,
            <enderio:block_lava_generator>,
            <enderio:block_simple_sag_mill>,
            <enderio:block_sag_mill>,
            <enderio:block_enhanced_sag_mill>,
            <enderio:block_slice_and_splice>,
            <enderio:block_solar_panel>,
            <enderio:block_solar_panel:1>,
            <enderio:block_solar_panel:3>,
            <enderio:block_vat>,
            <enderio:block_enhanced_vat>,
            <enderio:block_simple_wired_charger>,
            <enderio:block_wired_charger>,
            <enderio:block_enhanced_wired_charger>,
            <enderio:block_simple_crafter>,
            <enderio:block_cap_bank>.withTag({"enderio:energy": 50000000}),
            <enderio:block_cap_bank:1>,
            <enderio:block_cap_bank:1>.withTag({"enderio:energy": 1000000}),
            <enderio:block_cap_bank:2>.withTag({"enderio:energy": 5000000}),
            <enderio:block_cap_bank:2>,
            <enderio:block_cap_bank:3>,
            <enderio:block_cap_bank:3>.withTag({"enderio:energy": 25000000}),
            <enderio:block_gauge>,
            <enderio:item_basic_capacitor>,
            <enderio:item_basic_capacitor:1>,
            <enderio:item_alloy_ball>,
            <enderio:item_alloy_ball:1>,
            <enderio:item_alloy_ball:2>,
            <enderio:item_alloy_ball:3>,
            <enderio:item_alloy_ball:4>,
            <enderio:item_alloy_ball:5>,
            <enderio:item_alloy_ball:9>,
            <enderio:item_material>,
            <enderio:item_material:2>,
            <enderio:item_material:3>,
            <enderio:item_material:21>,
            <enderio:item_material:28>,
            <enderio:item_material:34>,
            <enderio:item_material:35>,
            <enderio:item_material:36>,
            <enderio:item_material:37>,
            <enderio:item_material:38>,
            <enderio:item_material:40>,
            <enderio:item_material:41>,
            <enderio:item_material:42>,
            <enderio:item_material:43>,
            <enderio:item_material:45>,
            <enderio:item_material:46>,
            <enderio:item_material:47>,
            <enderio:item_material:48>,
            <enderio:item_material:49>,
            <enderio:item_material:50>,
            <enderio:item_material:51>,
            <enderio:item_material:52>,
            <enderio:item_material:53>,
            <enderio:item_material:54>,
            <enderio:item_material:55>,
            <enderio:item_material:56>,
            <enderio:item_material:64>,
            <enderio:item_material:66>,
            <enderio:item_material:67>,
            <enderio:item_material:68>,
            <enderio:item_material:69>,
            <enderio:item_material:70>,
            <enderio:item_material:76>,
            <enderio:item_material:81>,
            <enderio:block_holy_fog>,
            <enderio:block_dark_paper_anvil>,
            <enderio:block_dark_paper_anvil:1>,
            <enderio:block_dark_paper_anvil:2>,
            <enderio:item_cold_fire_igniter>,
            <enderio:item_cold_fire_igniter>.withTag({"enderio:famount": 1000}),
            <enderio:item_inventory_charger_simple>.withTag({"enderio.darksteel.upgrade.energyUpgrade": {level: 3, energy: 500000}}),
            <enderio:item_inventory_charger_simple>.withTag({"enderio.darksteel.upgrade.energyUpgrade": {level: 0}}),
            <enderio:item_inventory_charger_simple>,
            <enderio:item_inventory_charger_basic>,
            <enderio:item_inventory_charger_basic>.withTag({"enderio.darksteel.upgrade.energyUpgrade": {level: 0}}),
            <enderio:item_inventory_charger_basic>.withTag({"enderio.darksteel.upgrade.energyUpgrade": {level: 3, energy: 5000000}}),
            <enderio:item_inventory_charger>.withTag({"enderio.darksteel.upgrade.energyUpgrade": {level: 3, energy: 25000000}}),
            <enderio:item_inventory_charger>,
            <enderio:item_inventory_charger>.withTag({"enderio.darksteel.upgrade.energyUpgrade": {level: 0}}),
            <enderio:item_inventory_charger_vibrant>,
            <enderio:item_inventory_charger_vibrant>.withTag({"enderio.darksteel.upgrade.energyUpgrade": {level: 0}}),
            <enderio:item_inventory_charger_vibrant>.withTag({"enderio.darksteel.upgrade.energyUpgrade": {level: 3, energy: 125000000}}),
            <enderio:item_staff_of_levity>.withTag({"enderio.darksteel.upgrade.energyUpgrade": {level: 3, energy: 1000000}, "enderio:famount": 8000}),
            <enderio:item_staff_of_levity>,
            <enderio:block_death_pouch>,
            <enderio:block_inventory_panel>,
            <enderio:item_inventory_remote>,
            <enderio:item_inventory_remote>.withTag({"enderio:energy": 60000, "enderio:famount": 2000}),
            <enderio:item_inventory_remote:1>.withTag({"enderio:energy": 120000, "enderio:famount": 1000}),
            <enderio:item_inventory_remote:1>,
            <enderio:item_inventory_remote:2>.withTag({"enderio:energy": 150000, "enderio:famount": 1500}),
            <enderio:item_inventory_remote:2>,
            <enderio:item_material:11>, #gears
            <enderio:item_material:12>,
            <enderio:item_material:13>, 
            <enderio:block_zombie_generator>, #generators
            <enderio:block_franken_zombie_generator>,
            <enderio:block_ender_generator>,
            <enderio:item_material:44>, #sentient ender
            <enderio:item_material:57>, #grinding balls
            <enderio:item_material:58>,
            <enderio:item_material:59>, 
            <enderio:block_buffer:2>, #omni buffer & power buffer
            <enderio:block_buffer:1>,
            <enderio:block_solar_panel:2>, #solar pannel
            <enderio:block_weather_obelisk>, #weather obelisk
            <enderio:item_material:8>, #nutritious stick
            <enderio:item_rod_of_return>, #rod of return
            <enderio:block_tele_pad>, #telepad
            <enderio:block_niard>, #niard
        ] as IItemStack[];
            for item in EIOBulkRemoval
            {
                recipes.remove(item);
                rh(item);
            }        
    # ======== Alloys ======== #
        # ==== Alloy Removal ==== #
            val EIOAlloyRemoval = [
                    <enderio:item_alloy_ingot>, #electrical steel
                    <enderio:item_alloy_nugget>, 
                    <enderio:block_alloy>,
                    <enderio:block_alloy:3>, #redstone alloy
                    <enderio:item_alloy_ingot:3>,
                    <enderio:item_alloy_nugget:3>,
                    <enderio:item_alloy_ingot:9>, #iron alloy
                    <enderio:block_alloy:9>,
                    <enderio:item_alloy_nugget>,
                    <enderio:item_material:39>, #enderium base
                    <enderio:block_alloy:4>, #conductive iron
                    <enderio:item_alloy_ingot:4>,
                    <enderio:item_alloy_nugget:4>
            ] as IItemStack[];
                for item in EIOAlloyRemoval
                {
                    recipes.remove(item);
                    rh(item);
                }  
        # ==== Pulsating Iron ==== #
            mixer.recipeBuilder()
            .inputs(<ore:dustIron>, <ore:dustBeryllium>, <ore:dustEmerald>)
            .outputs(<ore:dustPulsatingIron>.firstItem * 3)
            .EUt(30)
            .duration(81)
            .buildAndRegister();
        # ==== Energetic Alloy ==== #
            chembath.recipeBuilder()
            .inputs(<ore:dustPulsatingIron>)
            .fluidInputs(<liquid:red_alloy> * 144)
            .outputs(<ore:dustEnergeticAlloy>.firstItem)
            .EUt(60)
            .duration(53)
            .buildAndRegister();
        # ==== Vibrant Alloy ==== #
            # Eye of Ender
                recipes.removeByRecipeName("minecraft:ender_eye");
                <recipemap:chemical_bath>.findRecipe(480, [<minecraft:ender_pearl:0>], [<liquid:blaze> * 144]).remove();
                chembath.recipeBuilder()
                .EUt(480)
                .duration(144)
                .fluidInputs(<liquid:blaze> * 144)
                .inputs(<ore:dustEnderPearl>)
                .outputs(<ore:dustEnderEye>.firstItem)
                .buildAndRegister();

            mixer.recipeBuilder()
            .inputs(<ore:dustEnderEye>, <ore:dustEnergeticAlloy>)
            .EUt(300)
            .duration(75)
            .outputs(<ore:dustVibrantAlloy>.firstItem * 2)
            .buildAndRegister();

        # ==== Soularium ==== #
            chembath.recipeBuilder()
            .duration(100)
            .EUt(128)
            .inputs(<ore:ingotDarkSteel>)
            .fluidInputs(<liquid:liquid_death> * 250)
            .outputs(<ore:ingotSoularium>.firstItem)
            .buildAndRegister();
        # ==== Darksteel ==== #
            alloy.recipeBuilder()
            .inputs(<ore:ingotSteel>, <ore:dustObsidian>)
            .outputs(<ore:ingotDarkSteel>.firstItem * 2)
            .EUt(32)
            .duration(800)
            .buildAndRegister();

        # ==== Endsteel ==== #
            mixer.recipeBuilder()
            .inputs(<ore:dustDarkSteel>, <ore:dustVibrantAlloy>, <ore:dustEndstone>)
            .outputs(<ore:dustEndSteel>.firstItem * 3)
            .EUt(580)
            .duration(213)
            .buildAndRegister();

    # ======== Fluids ======== #
        # ==== Nutrient Distillation ==== #
            brewery.recipeBuilder()
            .fluidInputs(<liquid:distilled_water> * 1000)
            .inputs(<ore:dustMeat> * 1)
            .fluidOutputs(<liquid:nutrient_distillation> * 1000)
            .EUt(64)
            .duration(100)
            .buildAndRegister();
        # ==== Dew of the Void ==== #
            brewery.recipeBuilder()
            .notConsumable(<ore:enderpearl>)
            .fluidInputs(<liquid:nutrient_distillation> * 20)
            .duration(600)
            .EUt(7)
            .fluidOutputs(<liquid:ender_distillation> * 10)
            .buildAndRegister();
        # ==== Vapor of Levity ==== #
            chemreactor.recipeBuilder()
            .inputs(<ore:dustPulsatingIron>, <ore:itemPrecientPowder>)
            .fluidInputs(<liquid:ender_distillation> * 1000)
            .fluidOutputs(<liquid:vapor_of_levity> * 1000)
            .duration(400)
            .EUt(64)
            .buildAndRegister();
        # ==== Fire Water ==== #
            chemreactor.recipeBuilder()
            .inputs(<ore:dustBlaze>, <ore:dustRedstone>)
            .fluidInputs(<liquid:naphtha> * 1000)
            .fluidOutputs(<liquid:fire_water> * 1000)
            .duration(400)
            .EUt(64)
            .buildAndRegister();
        # ==== Liquid Sunshine ==== #
            chemreactor.recipeBuilder()
            .inputs(<ore:dustBlaze>, <ore:dustGarnetSand>)
            .fluidInputs(<liquid:glowstone> * 1000)
            .fluidOutputs(<liquid:liquid_sunshine> * 1000)
            .duration(400)
            .EUt(64)
            .buildAndRegister();
        # ==== Cloud Seed ==== #
            chemreactor.recipeBuilder()
            .inputs(<ore:dustSilver>, <ore:blockIce>)
            .fluidInputs(<liquid:distilled_water> * 1000)
            .fluidOutputs(<liquid:cloud_seed> * 1000)
            .duration(400)
            .EUt(64)
            .buildAndRegister();
        # ==== Concentrated Cloud Seed ==== #
            chemreactor.recipeBuilder()
            .inputs(<ore:dustSilver>)
            .fluidInputs(<liquid:cloud_seed> * 1000)
            .fluidOutputs(<liquid:cloud_seed_concentrated> * 800)
            .duration(400)
            .EUt(64)
            .buildAndRegister();

    # ======== Crystals ======== #
        # ==== Pulsating ==== #
            recipes.remove(<enderio:item_material:14>);
            chembath.recipeBuilder()
            .EUt(40)
            .duration(200)
            .inputs(<ore:gemFlawlessEmerald>)
            .fluidInputs(<liquid:pulsating_iron> * 2304)
            .outputs(<enderio:item_material:14>)
            .buildAndRegister();
        # ==== Vibrant ==== #
            recipes.remove(<enderio:item_material:15>);
            chembath.recipeBuilder()
            .EUt(40)
            .duration(200)
            .inputs(<ore:gemFlawlessEmerald>)
            .fluidInputs(<liquid:vibrant_alloy> * 2304)
            .outputs(<enderio:item_material:15>)
            .buildAndRegister();
        # ==== Ender ==== #
            recipes.remove(<enderio:item_material:16>);
            chembath.recipeBuilder()
            .EUt(40)
            .duration(200)
            .inputs(<ore:gemFlawlessEmerald>)
            .fluidInputs(<liquid:ender> * 2304)
            .outputs(<enderio:item_material:16>)
            .buildAndRegister();
        # ==== Enticing & Weather ==== #
            recipes.remove(<enderio:item_material:17>);
            recipes.remove(<enderio:item_material:18>);
    # ======== Misc Components ======== #
        # ==== Glider Components ==== #
                recipes.remove(<enderio:item_material:6>);
                recipes.addShaped("GGN_eio_gliderwing", <enderio:item_material:6>,
                [
                    [null, null, <ore:stickSteel>],
                    [null, <ore:stickSteel>, <ore:leather>],
                    [<ore:stickSteel>, <ore:leather>, <ore:leather>]
                ]);

                recipes.remove(<enderio:item_material:7>);
                recipes.addShaped("GGN_eio_gliderwings", <enderio:item_material:7>,
                [
                    [null, <ore:stickSteel>, null],
                    [<ore:itemGliderWing>, <ore:stickSteel>, <ore:itemGliderWing>]
                ]);
        # ==== Capacitors ==== #
            recipes.remove(<enderio:item_basic_capacitor:2>);
            recipes.addShaped("GGN_eio_capacitor", <enderio:item_basic_capacitor:2>, 
            [
                [<ore:plateSteel>, <ore:screwPulsatingIron>, <ore:plateSteel>],
                [<ore:screwPulsatingIron>, <metaitem:emitter.mv>, <ore:screwPulsatingIron>],
                [<ore:plateSteel>, <ore:screwPulsatingIron>, <ore:plateSteel>]
            ]);
        # ==== Machine Chassis ==== #
            val EIOChassis = <enderio:item_material:1>;
            recipes.remove(EIOChassis);
            recipes.addShaped("GGN_eio_chassis", EIOChassis,
            [
                [<ore:screwDarkSteel>, <ore:platePulsatingIron>, <ore:screwDarkSteel>],
                [<ore:circuitMv>, <ore:blockPulsatingIron>, <ore:circuitMv>],
                [<ore:screwDarkSteel>, <ore:platePulsatingIron>, <ore:screwDarkSteel>]
            ]);

            assembler.recipeBuilder()
            .inputs(<ore:screwDarkSteel> * 8, <ore:platePulsatingIron> * 16, <ore:circuitMv>)
            .outputs(EIOChassis * 2)
            .EUt(40)
            .duration(80)
            .buildAndRegister();
        # ==== Infinity Rod ==== #
            recipes.remove(<enderio:item_material:71>);
        # ==== Black Paper ==== #
            recipes.remove(<enderio:item_material:77>);
            chembath.recipeBuilder()
            .EUt(8)
            .duration(1200)
            .inputs(<ore:paper>)
            .fluidInputs(<liquid:dye_black> * 36)
            .outputs(<enderio:item_material:77>)
            .buildAndRegister();
        # ==== Fused Quartz ==== #
            alloy.recipeBuilder()
            .EUt(16)
            .duration(200)
            .inputs(<ore:blockQuartz>)
            .notConsumable(<metaitem:shape.mold.block>)
            .outputs(<enderio:block_fused_quartz> * 4)
            .buildAndRegister();
        # ==== Experience Rod ==== #
            recipes.remove(<enderio:item_xp_transfer>);
            chembath.recipeBuilder()
            .EUt(16)
            .duration(600)
            .inputs(<ore:stickVibrantAlloy>)
            .fluidInputs(<liquid:xpjuice> * 60)
            .outputs(<enderio:item_xp_transfer>)
            .buildAndRegister();
        # ==== Machine Parts ==== #
            recipes.addShaped("GGN_eio_parts", <enderio:item_material:2> * 32,
            [
                [null, null, <ore:platePulsatingIron>],
                [null, <ore:platePulsatingIron>, null],
                [<ore:platePulsatingIron>, null, null]
            ]);
    # ======== Utilities ======== #
        # ==== Charging ==== #
            recipes.remove(<enderio:block_normal_wireless_charger>);
            rh(<enderio:block_normal_wireless_charger>);
            # Antenna & Extension
                recipes.remove(<enderio:block_enhanced_wireless_charger>);
                recipes.remove(<enderio:block_wireless_charger_extension>);

                assembler.recipeBuilder()
                .inputs(<ore:stickPulsatingIron> * 16, <metaitem:emitter.mv>)
                .outputs(<enderio:block_enhanced_wireless_charger>)
                .EUt(40)
                .duration(200)
                .buildAndRegister();

                assembler.recipeBuilder()
                .inputs(<ore:stickEndSteel> * 16, <metaitem:emitter.mv>)
                .outputs(<enderio:block_wireless_charger_extension>)
                .EUt(40)
                .duration(200)
                .buildAndRegister();
            # Charger 
                recipes.remove(<enderio:block_wireless_charger>);
                assembler.recipeBuilder()
                .inputs(EIOChassis, <metaitem:emitter.mv> * 4, <ore:platePulsatingIron> * 16)
                .outputs(<enderio:block_wireless_charger>)
                .EUt(40)
                .duration(200)
                .buildAndRegister();
        # ==== Killer Joe ==== #
            recipes.remove(<enderio:block_killer_joe>);
            assembler.recipeBuilder()
            .inputs(EIOChassis, <thaumcraft:brain>, <ore:plateDarkSteel> * 12, <ore:glassHard> * 12)
            .fluidInputs(<liquid:liquid_death> * 3000)
            .outputs(<enderio:block_killer_joe>)
            .EUt(500)
            .duration(200)
            .buildAndRegister();
        # ==== Experience Obelisk ==== #
            recipes.remove(<enderio:block_experience_obelisk>);
            assembler.recipeBuilder()
            .inputs(EIOChassis, <enderio:item_xp_transfer>, <ore:screwDarkSteel> * 16, <ore:blockSoularium>, <ore:plateEnergeticAlloy> * 8)
            .fluidInputs(<liquid:ender> * 720)
            .EUt(128)
            .duration(400)
            .outputs(<enderio:block_experience_obelisk>)
            .buildAndRegister();
        # ==== Farming Station ==== #
            recipes.remove(<enderio:block_farm_station>);
            assembler.recipeBuilder()
            .inputs(EIOChassis, <thaumcraft:elemental_axe>, <ore:itemVibrantCrystal>, <ore:screwVibrantAlloy> * 16, <ore:blockSoularium>, <ore:plateVibrantAlloy> * 8)
            .fluidInputs(<liquid:ender> * 720)
            .EUt(512)
            .duration(400)
            .outputs(<enderio:block_farm_station>)
            .buildAndRegister();
        # ==== Inhibitor Obelisk ==== #
            recipes.remove(<enderio:block_inhibitor_obelisk>);
            assembler.recipeBuilder()
            .inputs(EIOChassis, <ore:itemEnderCrystal>, <ore:screwDarkSteel> * 8, <ore:blockSoularium>, <ore:plateEnergeticAlloy> * 4)
            .fluidInputs(<liquid:ender> * 720)
            .EUt(128)
            .duration(400)
            .outputs(<enderio:block_inhibitor_obelisk>)
            .buildAndRegister();
        # ==== Attractor Obelisk ==== #
            recipes.remove(<enderio:block_attractor_obelisk>);
            assembler.recipeBuilder()
            .inputs(EIOChassis, <ore:itemAttractorCrystal>, <ore:screwDarkSteel> * 8, <ore:blockSoularium>, <ore:plateEnergeticAlloy> * 4)
            .fluidInputs(<liquid:ender> * 720)
            .EUt(128)
            .duration(400)
            .outputs(<enderio:block_attractor_obelisk>)
            .buildAndRegister();
        # ==== Aversion Obelisk ==== #
            recipes.remove(<enderio:block_aversion_obelisk>);
            assembler.recipeBuilder()
            .inputs(EIOChassis, <ore:dropofevil>, <ore:screwDarkSteel> * 8, <ore:blockSoularium>, <ore:plateEnergeticAlloy> * 4)
            .fluidInputs(<liquid:ender> * 720)
            .EUt(128)
            .duration(400)
            .outputs(<enderio:block_aversion_obelisk>)
            .buildAndRegister();
        # ==== Relocator Obelisk ==== #
            recipes.remove(<enderio:block_relocator_obelisk>);
            assembler.recipeBuilder()
            .inputs(EIOChassis, <ore:dropofevil>, <ore:screwDarkSteel> * 8, <ore:blockSoularium>, <ore:plateVibrantAlloy> * 4)
            .fluidInputs(<liquid:ender> * 720)
            .EUt(128)
            .duration(400)
            .outputs(<enderio:block_relocator_obelisk>)
            .buildAndRegister();
        # ==== Painting Machine ==== #
            recipes.remove(<enderio:block_painter>);
            recipes.addShaped("GGN_eio_painter", <enderio:block_painter>,
            [
                [<ore:plateBeryllium>, <ore:screwGold>, <ore:plateBeryllium>],
                [<ore:plateBeryllium>, EIOChassis, <ore:plateBeryllium>],
                [<ore:plateBeryllium>, <ore:screwGold>, <ore:plateBeryllium>],
            ]);
        # ==== Travel Anchor ==== #
            recipes.remove(<enderio:block_travel_anchor>);
            assembler.recipeBuilder()
            .inputs(<ore:screwThaumium> * 4, EIOChassis)
            .fluidInputs(<liquid:ender> * 288)
            .outputs(<enderio:block_travel_anchor> * 2)
            .EUt(16)
            .duration(200)
            .buildAndRegister();
        # ==== Endervoir ==== #
            recipes.remove(<enderio:block_reservoir>);
            recipes.addShaped("GGN_eio_endervoirmagic", <enderio:block_reservoir> * 4, [
                [<ore:blockAquaInfused>, <appliedenergistics2:quartz_glass>, <ore:blockAquaInfused>],
                [<appliedenergistics2:quartz_glass>, <thaumcraft:everfull_urn>, <appliedenergistics2:quartz_glass>],
                [<ore:blockAquaInfused>, <enderio:block_omni_reservoir>, <ore:blockAquaInfused>]
            ]);

            recipes.addShaped("GGN_eio_endervoirtech", <enderio:block_reservoir> * 4, [
                [<ore:blockAquaInfused>, <appliedenergistics2:quartz_glass>, <ore:blockAquaInfused>],
                [<appliedenergistics2:quartz_glass>, <metaitem:electric.pump.mv>, <appliedenergistics2:quartz_glass>],
                [<ore:blockAquaInfused>, <enderio:block_omni_reservoir>, <ore:blockAquaInfused>]
            ]);
        # ==== Omnivoir ==== #
            recipes.remove(<enderio:block_omni_reservoir>);
            recipes.addShaped("GGN_eio_omnivoir", <enderio:block_omni_reservoir> * 4,
            [
                [<ore:glassHard>, <ore:glassHard>, <ore:glassHard>],
                [<ore:plateWroughtIron>, <minecraft:bucket>, <ore:plateWroughtIron>],
                [<ore:glassHard>, <ore:glassHard>, <ore:glassHard>]
            ]);
        # ==== Exit Rail ==== #
                recipes.remove(<enderio:block_exit_rail>);
                assembler.recipeBuilder()
                .inputs(<minecraft:rail> * 16, <minecraft:piston>, <ore:plateIron>)
                .fluidInputs(<liquid:redstone> * 144)
                .EUt(7)
                .duration(200)
                .outputs(<enderio:block_exit_rail> * 16)
                .buildAndRegister();
        # ==== Electric Lights ==== #
            recipes.removeByRecipeName("enderio:light_electric");
            recipes.addShaped("GGN_eio_electriclight", <enderio:block_electric_light> * 8,
            [
                [<ore:glassHard>, <ore:glassHard>, <ore:glassHard>],
                [<ore:ingotSilicon>, <ore:dustGlowstone>, <ore:ingotSilicon>],
                [<ore:ingotSilicon>, <ore:plateSteel>, <ore:ingotSilicon>]
            ]);
        # ==== Darksteel Furniture ==== #
                # Trapdoor
                    recipes.remove(<enderio:block_dark_steel_trapdoor>);
                    recipes.addShaped("GGN_eio_darksteeltrapdoor", <enderio:block_dark_steel_trapdoor>,
                    [
                        [<ore:screwDarkSteel>, <ore:plateDarkSteel>, <ore:screwDarkSteel>],
                        [<ore:plateDarkSteel>, <ore:trapdoorWood>, <ore:plateDarkSteel>],
                        [<ore:gtSaw>, <ore:plateDarkSteel>, <ore:gtScrewdriver>]
                    ]);

                    assembler.recipeBuilder()
                    .inputs(<ore:trapdoorWood>, <ore:plateDarkSteel> * 4)
                    .outputs(<enderio:block_dark_steel_trapdoor>)
                    .EUt(16)
                    .duration(100)
                    .buildAndRegister();

                    macerator.recipeBuilder()
                    .inputs(<enderio:block_dark_steel_trapdoor>)
                    .outputs(<ore:dustDarkSteel>.firstItem * 4)
                    .EUt(16)
                    .duration(100)
                    .buildAndRegister();

                    arc.recipeBuilder()
                    .inputs(<enderio:block_dark_steel_trapdoor>)
                    .fluidInputs(<liquid:oxygen> * 56)
                    .outputs(<ore:ingotDarkSteel>.firstItem * 4)
                    .EUt(16)
                    .duration(100)
                    .buildAndRegister();
                # Ladder
                    recipes.remove(<enderio:block_dark_steel_ladder>);
                    recipes.addShaped("GGN_eio_darksteelladder", <enderio:block_dark_steel_ladder> * 12,
                    [
                        [<ore:stickDarkSteel>, <ore:gtFile>, <ore:stickDarkSteel>],
                        [<ore:stickDarkSteel>, <ore:stickDarkSteel>, <ore:stickDarkSteel>],
                        [<ore:stickDarkSteel>, <ore:gtHammer>, <ore:stickDarkSteel>]
                    ]);
                # Door
                    recipes.remove(<enderio:block_dark_steel_door>);
                    recipes.addShaped("GGN_eio_darksteeldoor", <enderio:block_dark_steel_door>,
                    [
                        [<ore:plateDarkSteel>, <enderio:block_dark_iron_bars>, <ore:gtHammer>],
                        [<ore:plateDarkSteel>, <ore:ringDarkSteel>, <ore:screwDarkSteel>],
                        [<ore:plateIron>, <ore:plateIron>, <ore:gtScrewdriver>]
                    ]);

                    assembler.recipeBuilder()
                    .inputs(<ore:doorWood>, <ore:plateDarkSteel> * 4)
                    .outputs(<enderio:block_dark_steel_door>)
                    .EUt(16)
                    .duration(100)
                    .buildAndRegister();

                    macerator.recipeBuilder()
                    .inputs(<enderio:block_dark_steel_door>)
                    .outputs(<ore:dustDarkSteel>.firstItem * 4)
                    .EUt(16)
                    .duration(100)
                    .buildAndRegister();

                    arc.recipeBuilder()
                    .inputs(<enderio:block_dark_steel_door>)
                    .fluidInputs(<liquid:oxygen> * 56)
                    .outputs(<ore:ingotDarkSteel>.firstItem * 4)
                    .EUt(16)
                    .duration(100)
                    .buildAndRegister();
                # Bars
                    recipes.remove(<enderio:block_dark_iron_bars>);
                    recipes.addShaped("GGN_eio_darksteelbars", <enderio:block_dark_iron_bars> * 8,
                    [
                        [null, <ore:gtHammer>, null],
                        [<ore:stickDarkSteel>, <ore:stickDarkSteel>, <ore:stickDarkSteel>],
                        [<ore:stickDarkSteel>, <ore:stickDarkSteel>, <ore:stickDarkSteel>]
                    ]);
        # ==== Fluid Tanks ==== #
            # Default
                recipes.remove(<enderio:block_tank>);
                recipes.addShaped("GGN_eio_tank", <enderio:block_tank>,
                [
                    [<ore:barsIron>, <ore:plateIron>, <ore:barsIron>],
                    [<ore:plateIron>, <ore:glassHard>, <ore:plateIron>],
                    [<ore:barsIron>, <ore:plateIron>, <ore:barsIron>]
                ]);
            # Pressurized
                recipes.remove(<enderio:block_tank:1>);
                recipes.addShaped("GGN_eio_darktank", <enderio:block_tank:1>,
                [
                    [<ore:barsIron>, <ore:plateSteel>, <ore:barsIron>],
                    [<ore:plateSteel>, <enderio:block_tank>, <ore:plateSteel>],
                    [<ore:barsIron>, <ore:plateSteel>, <ore:barsIron>]
                ]);
        # ==== Conduits ==== #
            # Conduit Binder
                recipes.remove(<enderio:item_material:22>);
                rh(<enderio:item_material:22>);
                furnace.remove(<enderio:item_material:4>);
                rh(<enderio:item_material:4>);
            # Hidden Conduits 
                val HiddenConduits = [
                    <enderio:item_power_conduit>,
                    <enderio:item_power_conduit:1>,
                    <enderio:item_power_conduit:2>,
                    <enderio:item_data_conduit>,
                    <enderio:item_liquid_conduit>,
                    <enderio:item_me_conduit>,
                    <enderio:item_liquid_conduit:1>
                ] as IItemStack[];
                    for item in HiddenConduits {
                        recipes.remove(item);
                        rh(item);
                    }
            # Item Conduits
                recipes.remove(<enderio:item_item_conduit>);
                assembler.recipeBuilder()
                .EUt(70)
                .duration(200)
                .inputs(<ore:pipeNormalItemPulsatingIron> * 4, <ore:screwElectrum> * 4, <ore:platePulsatingIron> * 2)
                .fluidInputs(<liquid:ender_distillation> * 250)
                .outputs(<enderio:item_item_conduit> * 4)
                .buildAndRegister();
            # Fluid Conduits
                recipes.remove(<enderio:item_liquid_conduit:2>);
                assembler.recipeBuilder()
                .EUt(300)
                .duration(200)
                .inputs(<ore:pipeNormalFluidVibrantAlloy> * 4, <ore:screwSterlingSilver> * 4, <ore:plateVibrantAlloy> * 2)
                .fluidInputs(<liquid:ender_distillation> * 250)
                .outputs(<enderio:item_liquid_conduit:2> * 4)
                .buildAndRegister();
            # Dense Conduits
                recipes.remove(<enderio:item_me_conduit:1>);
                assembler.recipeBuilder()
                .EUt(16)
                .duration(80)
                .inputs(<appliedenergistics2:part:76>)
                .fluidInputs(<liquid:ender> * 18)
                .outputs(<enderio:item_me_conduit:1>)
                .buildAndRegister();            
            # Redstone Conduits
                recipes.remove(<enderio:item_redstone_conduit>);
                assembler.recipeBuilder()
                .EUt(16)
                .duration(80)
                .inputs(<ore:wireGtDoubleRedAlloy> * 8)
                .fluidInputs(<liquid:ender> * 144)
                .outputs(<enderio:item_redstone_conduit> * 16)
                .buildAndRegister();     
            # Conduit Facade
                recipes.remove(<enderio:item_conduit_facade>);
                recipes.addShaped("GGN_eio_facade", <enderio:item_conduit_facade> * 16,
                [
                    [<ore:dustClay>, <ore:dustClay>, <ore:dustClay>],
                    [<ore:dustClay>, <ore:wool>, <ore:dustClay>],
                    [<ore:dustClay>, <ore:dustClay>, <ore:dustClay>]
                ]);
            # Filters
                # Through Chisel
                    # Basic Filters
                    var EIOItem as IItemStack[] = [
                        <enderio:item_basic_item_filter>,
                        <enderio:item_mod_item_filter>,
                        <enderio:item_power_item_filter>,                                
                        <enderio:item_soul_filter_normal>,
                        <enderio:item_enchantment_filter_normal>,
                        <enderio:item_existing_item_filter>,
                        <enderio:item_fluid_filter>,
                        <enderio:item_limited_item_filter>,
                        <enderio:item_extract_speed_upgrade>,
                        <enderio:item_extract_speed_downgrade>
                    ];
                    for i in EIOItem {
                    i.addTooltip(format.green("Start with a Basic Item Filter!"));
                    mods.chisel.Carving.addVariation("EIOFilters", i);
                    recipes.remove(i);
                    }
                    # Advanced Filters
                    var EIOItem2 as IItemStack[] = [
                        <enderio:item_advanced_item_filter>,
                        <enderio:item_big_item_filter>,
                        <enderio:item_big_advanced_item_filter>,
                        <enderio:item_enchantment_filter_big>,
                        <enderio:item_soul_filter_big>,
                    ];
                    for i in EIOItem2 {
                    i.addTooltip(format.green("Start with an Advanced Item Filter!"));
                    mods.chisel.Carving.addVariation("EIOBigFilters", i);
                    recipes.remove(i);
                    }
                # Basic 
                    recipes.addShaped("GGN_eio_basicfilter", <enderio:item_basic_item_filter> * 8,
                    [
                        [<ore:screwGold>, <ore:paperBlack>, <ore:screwGold>],
                        [<ore:paperBlack>, <ore:plateIron>, <ore:paperBlack>],
                        [<ore:screwGold>, <ore:paperBlack>, <ore:screwGold>]
                    ]);
                # Advanced
                    recipes.addShaped("GGN_eio_advancedfilter", <enderio:item_advanced_item_filter> * 4,
                    [
                        [<enderio:item_basic_item_filter>, <ore:screwDarkSteel>, <enderio:item_basic_item_filter>],
                        [<ore:screwDarkSteel>, <ore:plateStainlessSteel>, <ore:screwDarkSteel>],
                        [<enderio:item_basic_item_filter>, <ore:screwDarkSteel>, <enderio:item_basic_item_filter>]
                    ]);
            # Redstone
                    var EIORItem as IItemStack[] = [
                        <enderio:item_material:60>,
                        <enderio:item_redstone_timer_filter>,
                        <enderio:item_redstone_sensor_filter>,
                        <enderio:item_redstone_or_filter>,
                        <enderio:item_redstone_not_filter>,
                        <enderio:item_redstone_nor_filter>,
                        <enderio:item_redstone_nand_filter>,
                        <enderio:item_redstone_counting_filter>,
                        <enderio:item_redstone_and_filter>,
                        <enderio:item_redstone_xor_filter>,
                        <enderio:item_redstone_xnor_filter>,
                        <enderio:item_redstone_toggle_filter>
                    ];
                    for i in EIORItem {
                    i.addTooltip(format.green("Start with a Basic Item Filter!"));
                    mods.chisel.Carving.addVariation("EIORedstoneFilters", i);
                    recipes.remove(i);
                    }
                # Basic 
                    recipes.addShaped("GGN_eio_redstonefilter", <enderio:item_material:60> * 8,
                    [
                        [<ore:screwGold>, <ore:paperBlack>, <ore:screwGold>],
                        [<ore:paperBlack>, <ore:plateRedAlloy>, <ore:paperBlack>],
                        [<ore:screwGold>, <ore:paperBlack>, <ore:screwGold>]
                    ]);
        # ==== Reinforced Obsidian ==== #
            recipes.remove(<enderio:block_reinforced_obsidian>);
            recipes.addShaped("GGN_eio_obsidian", <enderio:block_reinforced_obsidian>,
            [
                [<ore:screwDarkSteel>, <enderio:block_dark_iron_bars>, <ore:screwDarkSteel>],
                [<enderio:block_dark_iron_bars>, <ore:obsidian>, <enderio:block_dark_iron_bars>],
                [<ore:screwDarkSteel>, <enderio:block_dark_iron_bars>, <ore:screwDarkSteel>],
            ]);
        # ==== Conduit Probe ==== #
            recipes.remove(<enderio:item_conduit_probe>);
            recipes.addShaped("GGN_eio_probe", <enderio:item_conduit_probe>,
            [
                [<ore:plateIron>, <ore:circuitLv>, <ore:plateIron>]
            ]);
        # ==== Darksteel & Endsteel Equipment ==== #
            # == Darksteel == #
                # Helmet
                    recipes.remove(<enderio:item_dark_steel_helmet>);
                    assembler.recipeBuilder()
                    .EUt(128)
                    .duration(300)
                    .inputs(<minecraft:diamond_helmet>.withEmptyTag())
                    .outputs(<enderio:item_dark_steel_helmet>)
                    .fluidInputs(<liquid:dark_steel> * 576)
                    .buildAndRegister();

                # Chestplate
                    recipes.remove(<enderio:item_dark_steel_chestplate>);
                    assembler.recipeBuilder()
                    .EUt(128)
                    .duration(300)
                    .inputs(<minecraft:diamond_chestplate>.withEmptyTag())
                    .outputs(<enderio:item_dark_steel_chestplate>)
                    .fluidInputs(<liquid:dark_steel> * 1152)
                    .buildAndRegister();

                # Legs
                    recipes.remove(<enderio:item_dark_steel_leggings>);
                    assembler.recipeBuilder()
                    .EUt(128)
                    .duration(300)
                    .inputs(<minecraft:diamond_leggings>.withEmptyTag())
                    .outputs(<enderio:item_dark_steel_leggings>)
                    .fluidInputs(<liquid:dark_steel> * 1008)
                    .buildAndRegister();

                # Boots
                    recipes.remove(<enderio:item_dark_steel_boots>);
                    assembler.recipeBuilder()
                    .EUt(128)
                    .duration(300)
                    .inputs(<minecraft:diamond_boots>.withEmptyTag())
                    .outputs(<enderio:item_dark_steel_boots>)
                    .fluidInputs(<liquid:dark_steel> * 576)
                    .buildAndRegister();
                # Tools
                    # Sword
                        recipes.remove(<enderio:item_dark_steel_sword>);
                        chembath.recipeBuilder()
                        .EUt(60)
                        .duration(300)
                        .inputs(<immersiveengineering:sword_steel>)
                        .outputs(<enderio:item_dark_steel_sword>)
                        .fluidInputs(<liquid:dark_steel> * 288)
                        .buildAndRegister();                            
                    # Pickaxe
                        recipes.remove(<enderio:item_dark_steel_pickaxe>);
                        chembath.recipeBuilder()
                        .EUt(60)
                        .duration(300)
                        .inputs(<immersiveengineering:pickaxe_steel>)
                        .outputs(<enderio:item_dark_steel_pickaxe>)
                        .fluidInputs(<liquid:dark_steel> * 432)
                        .buildAndRegister();
                    # Axe
                        recipes.remove(<enderio:item_dark_steel_axe>);
                        chembath.recipeBuilder()
                        .EUt(60)
                        .duration(300)
                        .inputs(<immersiveengineering:axe_steel>)
                        .outputs(<enderio:item_dark_steel_axe>)
                        .fluidInputs(<liquid:dark_steel> * 432)
                        .buildAndRegister();
                    # Bow
                        recipes.remove(<enderio:item_dark_steel_bow>);
                        chembath.recipeBuilder()
                        .EUt(60)
                        .duration(300)
                        .inputs(<minecraft:bow>)
                        .outputs(<enderio:item_dark_steel_bow>)
                        .fluidInputs(<liquid:dark_steel> * 432)
                        .buildAndRegister();
                    # Dark Crook
                        recipes.remove(<enderio:item_dark_steel_crook>);
                        chembath.recipeBuilder()
                        .EUt(60)
                        .duration(300)
                        .inputs(<immersiveengineering:hoe_steel>)
                        .outputs(<enderio:item_dark_steel_crook>)
                        .fluidInputs(<liquid:dark_steel> * 288)
                        .buildAndRegister();
                    # Backhoe
                        recipes.remove(<enderio:item_dark_steel_hand>);
                        chembath.recipeBuilder()
                        .EUt(60)
                        .duration(300)
                        .inputs(<enderio:item_dark_steel_crook>)
                        .outputs(<enderio:item_dark_steel_hand>)
                        .fluidInputs(<liquid:dark_steel> * 288)
                        .buildAndRegister();
                    # Shears
                        recipes.remove(<enderio:item_dark_steel_shears>);
                        chembath.recipeBuilder()
                        .EUt(60)
                        .duration(300)
                        .inputs(<minecraft:shears>.withEmptyTag())
                        .outputs(<enderio:item_dark_steel_shears>)
                        .fluidInputs(<liquid:dark_steel> * 288)
                        .buildAndRegister();
                    # Shield
                        recipes.remove(<enderio:item_dark_steel_shield>);
                        chembath.recipeBuilder()
                        .EUt(60)
                        .duration(300)
                        .inputs(<thermalfoundation:tool.shield_steel>.withEmptyTag())
                        .outputs(<enderio:item_dark_steel_shield>)
                        .fluidInputs(<liquid:dark_steel> * 720)
                        .buildAndRegister();
            # == Endsteel == #
                # Armor
                    # Helmet
                        recipes.remove(<enderio:item_end_steel_helmet>);
                        assembler.recipeBuilder()
                        .EUt(128)
                        .duration(300)
                        .inputs(<enderio:item_dark_steel_helmet>.withEmptyTag())
                        .outputs(<enderio:item_end_steel_helmet>)
                        .fluidInputs(<liquid:end_steel> * 576)
                        .buildAndRegister();

                    # Chestplate
                        recipes.remove(<enderio:item_end_steel_chestplate>);
                        assembler.recipeBuilder()
                        .EUt(128)
                        .duration(300)
                        .inputs(<enderio:item_dark_steel_chestplate>.withEmptyTag())
                        .outputs(<enderio:item_end_steel_chestplate>)
                        .fluidInputs(<liquid:end_steel> * 1152)
                        .buildAndRegister();

                    # Legs
                        recipes.remove(<enderio:item_end_steel_leggings>);
                        assembler.recipeBuilder()
                        .EUt(128)
                        .duration(300)
                        .inputs(<enderio:item_dark_steel_leggings>.withEmptyTag())
                        .outputs(<enderio:item_end_steel_leggings>)
                        .fluidInputs(<liquid:end_steel> * 1008)
                        .buildAndRegister();

                    # Boots
                        recipes.remove(<enderio:item_end_steel_boots>);
                        assembler.recipeBuilder()
                        .EUt(128)
                        .duration(300)
                        .inputs(<enderio:item_dark_steel_boots>.withEmptyTag())
                        .outputs(<enderio:item_end_steel_boots>)
                        .fluidInputs(<liquid:end_steel> * 576)
                        .buildAndRegister();
                # Tools
                    # Sword
                        recipes.remove(<enderio:item_end_steel_sword>);
                        chembath.recipeBuilder()
                        .EUt(60)
                        .duration(300)
                        .inputs(<enderio:item_dark_steel_sword>.withEmptyTag())
                        .outputs(<enderio:item_end_steel_sword>)
                        .fluidInputs(<liquid:end_steel> * 288)
                        .buildAndRegister();                            
                    # Pickaxe
                        recipes.remove(<enderio:item_end_steel_pickaxe>);
                        chembath.recipeBuilder()
                        .EUt(60)
                        .duration(300)
                        .inputs(<enderio:item_dark_steel_pickaxe>.withEmptyTag())
                        .outputs(<enderio:item_end_steel_pickaxe>)
                        .fluidInputs(<liquid:end_steel> * 432)
                        .buildAndRegister();
                    # Axe
                        recipes.remove(<enderio:item_end_steel_axe>);
                        chembath.recipeBuilder()
                        .EUt(60)
                        .duration(300)
                        .inputs(<enderio:item_dark_steel_axe>.withEmptyTag())
                        .outputs(<enderio:item_end_steel_axe>)
                        .fluidInputs(<liquid:end_steel> * 432)
                        .buildAndRegister();
                    # Bow
                        recipes.remove(<enderio:item_end_steel_bow>);
                        chembath.recipeBuilder()
                        .EUt(60)
                        .duration(300)
                        .inputs(<enderio:item_dark_steel_bow>.withEmptyTag())
                        .outputs(<enderio:item_end_steel_bow>)
                        .fluidInputs(<liquid:end_steel> * 432)
                        .buildAndRegister();
                    # Shield
                        recipes.remove(<enderio:item_end_steel_shield>);
                        chembath.recipeBuilder()
                        .EUt(60)
                        .duration(300)
                        .inputs(<enderio:item_dark_steel_shield>.withEmptyTag())
                        .outputs(<enderio:item_end_steel_shield>)
                        .fluidInputs(<liquid:end_steel> * 720)
                        .buildAndRegister();
            # == Upgrade == #
                recipes.addShaped("GGN_eio_dsupgrade", <enderio:item_dark_steel_upgrade>,
                [
                    [<ore:screwDarkSteel>, <ore:plateDarkSteel>, <ore:screwDarkSteel>],
                    [<ore:screwDarkSteel>, <ore:paperBlack>, <ore:screwDarkSteel>],
                    [<ore:screwDarkSteel>, <ore:plateDarkSteel>, <ore:screwDarkSteel>]
                ]);


        # ==== Staff of Travelling ==== #
                    recipes.remove(<enderio:item_travel_staff>);
                    recipes.addShaped("GGN_eio_travelstaff", <enderio:item_travel_staff>,
                    [
                        [null, null, <ore:itemEnderCrystal>],
                        [null, <ore:stickVibrantAlloy>, null],
                        [<ore:stickVibrantAlloy>, null, null]
                    ]);
        # ==== Electromagnet ==== #
                    recipes.remove(<enderio:item_magnet>);
                    recipes.addShaped("GGN_eio_magnet", <enderio:item_magnet>,
                    [
                        [<ore:screwRedAlloy>, <ore:ringPulsatingIron>, <ore:screwRedAlloy>],
                        [<ore:stickSteelMagnetic>, <ore:gtScrew>, <ore:stickSteelMagnetic>],
                        [<ore:ingotSteelMagnetic>, <ore:gtFile>, <ore:ingotSteelMagnetic>]
                    ]);
        # ==== Dimensional Tranceiver ==== #
            recipes.remove(<enderio:block_transceiver>);
            assembler.recipeBuilder()
            .inputs(EIOChassis, <thaumcraft:void_seed>, <ore:plateDarkSteel> * 64, <ore:screwDarkSteel> * 16, <ore:plateDarkSteel>)
            .fluidInputs(<liquid:ender> * 16000)
            .outputs(<enderio:block_transceiver>)
            .EUt(8192)
            .duration(200)
            .buildAndRegister();
        # ==== Soul Binder ==== #
            recipes.remove(<enderio:block_soul_binder>);
            recipes.addShaped("GGN_eio_soulbinder", <enderio:block_soul_binder>,
            [
                [<ore:ingotSoularium>, <botania:brewflask>.withTag({brewKey: "soulCross"}), <ore:ingotSoularium>],
                [<ore:plateElementium>, <ore:blockSoularium>, <ore:plateElementium>],
                [<ore:ingotSoularium>, <ore:plateDarkSteel>, <ore:ingotSoularium>]
            ]);
        # ==== Powered Spawner ==== #
            recipes.remove(<enderio:block_powered_spawner>);
            assembler.recipeBuilder()
            .inputs(EIOChassis, <enderio:item_broken_spawner>, <actuallyadditions:item_misc:20> * 8, <ore:plateDarkSteel> * 32)
            .fluidInputs(<liquid:liquid_death> * 2000)
            .EUt(2048)
            .duration(200)
            .outputs(<enderio:block_powered_spawner>)
            .buildAndRegister();
        # ==== Experience Vacuum ==== #
            recipes.addShaped("GGN_eio_xpvacuum", <enderio:block_xp_vacuum>,
            [
                [<ore:plateBeryllium>, <ore:stickIron>, <ore:plateBeryllium>],
                [<ore:stickIron>, <enderio:item_xp_transfer>, <ore:stickIron>],
                [<ore:plateBeryllium>, <ore:stickIron>, <ore:plateBeryllium>],
            ]);
        # ==== Vacuum Chest ==== #
            recipes.remove(<enderio:block_vacuum_chest>);
            recipes.addShaped("GGN_eio_blockvacuum", <enderio:block_vacuum_chest>,
            [
                [<ore:plateBeryllium>, <ore:stickIron>, <ore:plateBeryllium>],
                [<ore:stickIron>, <thaumcraft:hungry_chest>, <ore:stickIron>],
                [<ore:plateBeryllium>, <ore:stickIron>, <ore:plateBeryllium>],
            ]);
        # ==== Yeta Wrench ==== #
            recipes.remove(<enderio:item_yeta_wrench>);
            <enderio:item_yeta_wrench>.addTooltip(format.green("Consider using a GregTech wrench instead."));
            recipes.addShaped(<enderio:item_yeta_wrench>,
            [
                [<ore:ingotPulsatingIron>, <ore:gtFile>, <ore:ingotPulsatingIron>],
                [null, <ore:ingotPulsatingIron>, null],
                [null, <ore:ingotPulsatingIron>, null]
            ]);

# ================ EnderIO ================ #
