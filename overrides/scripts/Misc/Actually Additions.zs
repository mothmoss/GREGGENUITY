//priority 800
import mods.jei.JEI.removeAndHide as rh;
import crafttweaker.item.IItemStack;
import crafttweaker.item.IItemDefinition;
import crafttweaker.item.IIngredient;
import crafttweaker.oredict.IOreDict;
import crafttweaker.oredict.IOreDictEntry;
import mods.gregtech.recipe.RecipeMaps;
import mods.gregtech.recipe.RecipeMap;

// ================ Actually Additions ================ //
    // ======== Bulk Removal ======== //
            val AAFullRemoval = [
            <actuallyadditions:block_giant_chest>,
            <actuallyadditions:block_giant_chest_medium>,
            <actuallyadditions:block_giant_chest_large>,
            <actuallyadditions:item_battery>,
            <actuallyadditions:item_battery_double>,
            <actuallyadditions:item_battery_triple>,
            <actuallyadditions:item_battery_quadruple>,
            <actuallyadditions:item_battery_quintuple>,
            <actuallyadditions:block_battery_box>,
            <actuallyadditions:item_suction_ring>,
            <actuallyadditions:item_potion_ring_advanced>,
            <actuallyadditions:item_potion_ring>,
            <actuallyadditions:item_potion_ring_advanced:1>,
            <actuallyadditions:item_potion_ring:1>,
            <actuallyadditions:item_potion_ring_advanced:2>,
            <actuallyadditions:item_potion_ring:2>,
            <actuallyadditions:item_potion_ring_advanced:3>,
            <actuallyadditions:item_potion_ring:3>,
            <actuallyadditions:item_potion_ring_advanced:4>,
            <actuallyadditions:item_potion_ring:4>,
            <actuallyadditions:item_potion_ring_advanced:5>,
            <actuallyadditions:item_potion_ring:5>,
            <actuallyadditions:item_potion_ring_advanced:6>,
            <actuallyadditions:item_potion_ring:6>,
            <actuallyadditions:item_potion_ring_advanced:7>,
            <actuallyadditions:item_potion_ring:7>,
            <actuallyadditions:item_potion_ring_advanced:8>,
            <actuallyadditions:item_potion_ring:8>,
            <actuallyadditions:item_potion_ring_advanced:9>,
            <actuallyadditions:item_potion_ring:9>,
            <actuallyadditions:block_crystal_cluster_redstone>,
            <actuallyadditions:block_crystal_cluster_lapis>,
            <actuallyadditions:block_crystal_cluster_diamond>,
            <actuallyadditions:block_crystal_cluster_coal>,
            <actuallyadditions:block_crystal_cluster_emerald>,
            <actuallyadditions:block_crystal_cluster_iron>,
            <actuallyadditions:block_battery_box>,
            <actuallyadditions:block_bio_reactor>,
            <actuallyadditions:block_empowerer>,
            <actuallyadditions:block_tiny_torch>,
            <actuallyadditions:block_shock_suppressor>,
            <actuallyadditions:block_display_stand>,
            <actuallyadditions:block_crystal>,
            <actuallyadditions:block_crystal:1>,
            <actuallyadditions:block_crystal:2>,
            <actuallyadditions:block_crystal:3>,
            <actuallyadditions:block_crystal:4>,
            <actuallyadditions:block_crystal:5>,
            <actuallyadditions:block_crystal_empowered>,
            <actuallyadditions:block_crystal_empowered:1>,
            <actuallyadditions:block_crystal_empowered:2>,
            <actuallyadditions:block_crystal_empowered:3>,
            <actuallyadditions:block_crystal_empowered:4>,
            <actuallyadditions:block_crystal_empowered:5>,
            <actuallyadditions:block_black_lotus>,
            <actuallyadditions:block_laser_relay>,
            <actuallyadditions:block_laser_relay_advanced>,
            <actuallyadditions:block_laser_relay_extreme>,
            <actuallyadditions:block_leaf_generator>,
            <actuallyadditions:block_treasure_chest>,
            <actuallyadditions:block_energizer>,
            <actuallyadditions:block_enervator>,
            <actuallyadditions:block_lava_factory_controller>,
            <actuallyadditions:block_canola_press>,
            <actuallyadditions:block_coal_generator>,
            <actuallyadditions:block_oil_generator>,
            <actuallyadditions:block_fermenting_barrel>,
            <actuallyadditions:block_compost>,
            <actuallyadditions:block_misc>,
            <actuallyadditions:block_misc:1>,
            <actuallyadditions:block_misc:2>,
            <actuallyadditions:block_misc:3>,
            <actuallyadditions:block_grinder>,
            <actuallyadditions:block_grinder_double>,
            <actuallyadditions:block_furnace_double>,
            <actuallyadditions:block_furnace_solar>,
            <actuallyadditions:block_heat_collector>,
            <actuallyadditions:block_coffee_machine>,
            <actuallyadditions:block_quartz_wall>,
            <actuallyadditions:block_chiseled_quartz_wall>,
            <actuallyadditions:block_pillar_quartz_wall>,
            <actuallyadditions:block_quartz_stair>,
            <actuallyadditions:block_chiseled_quartz_stair>,
            <actuallyadditions:block_pillar_quartz_stair>,
            <actuallyadditions:block_quartz_slab>,
            <actuallyadditions:block_chiseled_quartz_slab>,
            <actuallyadditions:block_pillar_quartz_slab>,
            <actuallyadditions:item_crystal_shard>,
            <actuallyadditions:item_crystal_shard:1>,
            <actuallyadditions:item_crystal_shard:2>,
            <actuallyadditions:item_crystal_shard:3>,
            <actuallyadditions:item_crystal_shard:4>,
            <actuallyadditions:item_crystal_shard:5>,
            <actuallyadditions:item_filling_wand>,
            <actuallyadditions:item_bag>,
            <actuallyadditions:item_void_bag>,
            <actuallyadditions:item_spawner_changer>,
            <actuallyadditions:item_misc>,
            <actuallyadditions:item_misc:1>,
            <actuallyadditions:item_misc:2>,
            <actuallyadditions:item_misc:3>,
            <actuallyadditions:item_misc:4>,
            <actuallyadditions:item_misc:5>,
            <actuallyadditions:item_misc:6>,
            <actuallyadditions:item_misc:7>,
            <actuallyadditions:item_misc:8>,
            <actuallyadditions:item_misc:9>,
            <actuallyadditions:item_misc:10>,
            <actuallyadditions:item_misc:11>,
            <actuallyadditions:item_misc:12>,
            <actuallyadditions:item_misc:13>,
            <actuallyadditions:item_misc:14>,
            <actuallyadditions:item_misc:15>,
            <actuallyadditions:item_misc:16>,
            <actuallyadditions:item_misc:17>,
            <actuallyadditions:item_misc:18>,
            <actuallyadditions:item_misc:19>,
            <actuallyadditions:item_misc:20>,
            <actuallyadditions:item_misc:5>,
            <actuallyadditions:item_misc:6>,
            <actuallyadditions:item_misc:7>,
            <actuallyadditions:item_misc:8>,
            <actuallyadditions:item_misc:9>,
            <actuallyadditions:item_misc:12>,
            <actuallyadditions:item_misc:14>,
            <actuallyadditions:item_misc:15>,
            <actuallyadditions:item_misc:16>,
            <actuallyadditions:item_misc:17>,
            <actuallyadditions:item_misc:18>,
            <actuallyadditions:item_misc:21>,
            <actuallyadditions:item_misc:22>,
            <actuallyadditions:item_color_lens>,
            <actuallyadditions:item_explosion_lens>,
            <actuallyadditions:item_damage_lens>,
            <actuallyadditions:item_more_damage_lens>,
            <actuallyadditions:item_disenchanting_lens>,
            <actuallyadditions:item_drill:3>,
            <actuallyadditions:item_crystal>,
            <actuallyadditions:item_crystal:1>,
            <actuallyadditions:item_crystal:2>,
            <actuallyadditions:item_crystal:3>,
            <actuallyadditions:item_crystal:4>,
            <actuallyadditions:item_crystal:5>,
            <actuallyadditions:item_crystal_empowered>,
            <actuallyadditions:item_crystal_empowered:1>,
            <actuallyadditions:item_crystal_empowered:2>,
            <actuallyadditions:item_growth_ring>,
            <actuallyadditions:item_food:20>,
            <actuallyadditions:item_food:14>,
            <actuallyadditions:item_food:13>,
            <actuallyadditions:item_food:11>,
            <actuallyadditions:item_food:5>,
            <actuallyadditions:item_food:2>,
            <actuallyadditions:item_food:7>,
            <actuallyadditions:item_wings_of_the_bats>,
            <actuallyadditions:item_fertilizer>,
            <actuallyadditions:item_coffee>,
            <actuallyadditions:item_resonant_rice>,
            <actuallyadditions:item_food>,
            <actuallyadditions:item_food:1>,
            <actuallyadditions:item_food:4>,
            <actuallyadditions:item_food:3>,
            <actuallyadditions:item_food:6>,
            <actuallyadditions:item_food:8>,
            <actuallyadditions:item_food:9>,
            <actuallyadditions:item_food:10>,
            <actuallyadditions:item_food:12>,
            <actuallyadditions:item_food:16>,
            <actuallyadditions:item_food:15>,
            <actuallyadditions:item_food:17>,
            <actuallyadditions:item_food:18>,
            <actuallyadditions:item_food:19>,
            <actuallyadditions:item_jam>,
            <actuallyadditions:item_jam:1>,
            <actuallyadditions:item_jam:2>,
            <actuallyadditions:item_jam:3>,
            <actuallyadditions:item_jam:4>,
            <actuallyadditions:item_jam:5>,
            <actuallyadditions:item_jam:6>,
            <actuallyadditions:item_crafter_on_a_stick>,
            <actuallyadditions:item_dust:7>,
            <actuallyadditions:item_dust:6>,
            <actuallyadditions:item_dust:5>,
            <actuallyadditions:item_dust:4>,
            <actuallyadditions:item_dust:3>,
            <actuallyadditions:item_dust>,
            <actuallyadditions:item_dust:1>,
            <actuallyadditions:item_dust:2>,
            <actuallyadditions:item_rice_seed>,
            <actuallyadditions:item_coffee_seed>,
            <actuallyadditions:item_hairy_ball>,
            <actuallyadditions:item_crystal_empowered:3>,
            <actuallyadditions:item_crystal_empowered:4>,
            <actuallyadditions:item_crystal_empowered:5>,
            <actuallyadditions:item_mining_lens>,
            <actuallyadditions:block_atomic_reconstructor>,
            <actuallyadditions:block_misc:9>, //iron casing
            <actuallyadditions:item_chest_to_crate_upgrade>, //crate upgrades
            <actuallyadditions:item_small_to_medium_crate_upgrade>,
            <actuallyadditions:item_medium_to_large_crate_upgrade>,
            <actuallyadditions:item_crate_keeper>,
            <actuallyadditions:item_drill_upgrade_three_by_three>, //drill upgrades
            <actuallyadditions:item_drill_upgrade_block_placing>,
            <actuallyadditions:item_drill_upgrade_five_by_five>,
            <actuallyadditions:item_drill_upgrade_fortune>,
            <actuallyadditions:item_drill_upgrade_fortune_ii>,
            <actuallyadditions:item_drill_upgrade_silk_touch>,
            <actuallyadditions:item_drill_upgrade_speed>,
            <actuallyadditions:item_drill_upgrade_speed_ii>,
            <actuallyadditions:item_drill_upgrade_speed_iii>,
            <actuallyadditions:item_leaf_blower_advanced>, //leafblower because senses
            <actuallyadditions:item_leaf_blower>,
            <actuallyadditions:item_tele_staff>, //teleport staff
            <actuallyadditions:item_water_removal_ring>, //ring of liquid banning
            <actuallyadditions:item_knife>, //knife
            <actuallyadditions:block_breaker>, //autobreaker
            <actuallyadditions:block_laser_relay_item>, //item laser
            <actuallyadditions:block_fishing_net>, //fishing net
            <actuallyadditions:block_item_repairer>, //item repairer
            <actuallyadditions:block_ranged_collector>, //ranged collector
            <actuallyadditions:block_farmer> //farmer

            ] as IItemStack[];
                for item in AAFullRemoval
                {
                    recipes.remove(item);
                    rh(item);
                }

    // ======== Utilities ======== //
        // ==== Lamps ==== //
            // Lamp Controller
                recipes.remove(<actuallyadditions:block_lamp_powerer>);
                recipes.addShaped("GGN_aa_lampcontroller", <actuallyadditions:block_lamp_powerer>,
                [
                    [<ore:screwRedAlloy>, <ore:plateSteel>, <ore:screwRedAlloy>],
                    [<ore:plateSteel>, <actuallyadditions:block_colored_lamp>, <ore:plateSteel>],
                    [<ore:screwRedAlloy>, <ore:plateSteel>, <ore:screwRedAlloy>]
                ]);
            // Defining
                var aawhitelamp = <actuallyadditions:block_colored_lamp>;
                var aaorangelamp = <actuallyadditions:block_colored_lamp:1>;
                var aamagentalamp = <actuallyadditions:block_colored_lamp:2>;
                var aalightbluelamp = <actuallyadditions:block_colored_lamp:3>;
                var aayellowlamp = <actuallyadditions:block_colored_lamp:4>;
                var aalimelamp = <actuallyadditions:block_colored_lamp:5>;
                var aapinklamp = <actuallyadditions:block_colored_lamp:6>;
                var aagraylamp = <actuallyadditions:block_colored_lamp:7>;
                var aalightgraylamp = <actuallyadditions:block_colored_lamp:8>;
                var aacyanlamp = <actuallyadditions:block_colored_lamp:9>;
                var aapurplelamp = <actuallyadditions:block_colored_lamp:10>;
                var aabluelamp = <actuallyadditions:block_colored_lamp:11>;
                var aabrownlamp = <actuallyadditions:block_colored_lamp:12>;
                var aagreenlamp = <actuallyadditions:block_colored_lamp:13>;
                var aaredlamp = <actuallyadditions:block_colored_lamp:14>;
                var aablacklamp = <actuallyadditions:block_colored_lamp:15>;
            // Removing All
                val AALamps = [
                    <actuallyadditions:block_colored_lamp>,
                    <actuallyadditions:block_colored_lamp:1>,
                    <actuallyadditions:block_colored_lamp:2>,
                    <actuallyadditions:block_colored_lamp:3>,
                    <actuallyadditions:block_colored_lamp:4>,
                    <actuallyadditions:block_colored_lamp:5>,
                    <actuallyadditions:block_colored_lamp:6>,
                    <actuallyadditions:block_colored_lamp:7>,
                    <actuallyadditions:block_colored_lamp:8>,
                    <actuallyadditions:block_colored_lamp:9>,
                    <actuallyadditions:block_colored_lamp:10>,
                    <actuallyadditions:block_colored_lamp:11>,
                    <actuallyadditions:block_colored_lamp:12>,
                    <actuallyadditions:block_colored_lamp:13>,
                    <actuallyadditions:block_colored_lamp:14>,
                    <actuallyadditions:block_colored_lamp:15>,
                ] as IItemStack[];
                    for item in AALamps
                    {
                        recipes.remove(item);
                    }
            // White Lamp
                recipes.addShaped("GGN_aa_whitelamp", aawhitelamp * 4,
                [
                    [<actuallyadditions:block_testifi_bucks_white_wall>, <appliedenergistics2:quartz_vibrant_glass>, <actuallyadditions:block_testifi_bucks_white_wall>],
                    [<ore:dustGlowstone>, <ore:plateRedstone>, <ore:dustGlowstone>],
                    [<actuallyadditions:block_testifi_bucks_white_wall>, <appliedenergistics2:quartz_vibrant_glass>, <actuallyadditions:block_testifi_bucks_white_wall>],
                ]);
            // Orange Lamp
                chembath.recipeBuilder()
                .inputs(aawhitelamp * 8)
                .fluidInputs(<liquid:dye_orange> * 72)
                .outputs(aaorangelamp * 8)
                .EUt(7)
                .duration(20)
                .buildAndRegister();
            // Magenta Lamp
                chembath.recipeBuilder()
                .inputs(aawhitelamp * 8)
                .fluidInputs(<liquid:dye_magenta> * 72)
                .outputs(aamagentalamp * 8)
                .EUt(7)
                .duration(20)
                .buildAndRegister();
            // Lightblue Lamp
                chembath.recipeBuilder()
                .inputs(aawhitelamp * 8)
                .fluidInputs(<liquid:dye_light_blue> * 72)
                .outputs(aalightbluelamp * 8)
                .EUt(7)
                .duration(20)
                .buildAndRegister();
            // Yellow Lamp
                chembath.recipeBuilder()
                .inputs(aawhitelamp * 8)
                .fluidInputs(<liquid:dye_yellow> * 72)
                .outputs(aayellowlamp * 8)
                .EUt(7)
                .duration(20)
                .buildAndRegister();
            // Lime Lamp
                chembath.recipeBuilder()
                .inputs(aawhitelamp * 8)
                .fluidInputs(<liquid:dye_lime> * 72)
                .outputs(aalimelamp * 8)
                .EUt(7)
                .duration(20)
                .buildAndRegister();
            // Pink Lamp
                chembath.recipeBuilder()
                .inputs(aawhitelamp * 8)
                .fluidInputs(<liquid:dye_pink> * 72)
                .outputs(aapinklamp * 8)
                .EUt(7)
                .duration(20)
                .buildAndRegister();
            // Gray Lamp
                chembath.recipeBuilder()
                .inputs(aawhitelamp * 8)
                .fluidInputs(<liquid:dye_gray> * 72)
                .outputs(aagraylamp * 8)
                .EUt(7)
                .duration(20)
                .buildAndRegister();
            // Lightgray Lamp
                chembath.recipeBuilder()
                .inputs(aawhitelamp * 8)
                .fluidInputs(<liquid:dye_light_gray> * 72)
                .outputs(aalightgraylamp * 8)
                .EUt(7)
                .duration(20)
                .buildAndRegister();
            // Cyan Lamp
                chembath.recipeBuilder()
                .inputs(aawhitelamp * 8)
                .fluidInputs(<liquid:dye_cyan> * 72)
                .outputs(aacyanlamp * 8)
                .EUt(7)
                .duration(20)
                .buildAndRegister();
            // Purple Lamp
                chembath.recipeBuilder()
                .inputs(aawhitelamp * 8)
                .fluidInputs(<liquid:dye_purple> * 72)
                .outputs(aapurplelamp * 8)
                .EUt(7)
                .duration(20)
                .buildAndRegister();
            // Blue Lamp
                chembath.recipeBuilder()
                .inputs(aawhitelamp * 8)
                .fluidInputs(<liquid:dye_blue> * 72)
                .outputs(aabluelamp * 8)
                .EUt(7)
                .duration(20)
                .buildAndRegister();
            // Green Lamp
                chembath.recipeBuilder()
                .inputs(aawhitelamp * 8)
                .fluidInputs(<liquid:dye_green> * 72)
                .outputs(aagreenlamp * 8)
                .EUt(7)
                .duration(20)
                .buildAndRegister();
            // Red Lamp
                chembath.recipeBuilder()
                .inputs(aawhitelamp * 8)
                .fluidInputs(<liquid:dye_red> * 72)
                .outputs(aaredlamp * 8)
                .EUt(7)
                .duration(20)
                .buildAndRegister();
            // Black Lamp
                chembath.recipeBuilder()
                .inputs(aawhitelamp * 8)
                .fluidInputs(<liquid:dye_black> * 72)
                .outputs(aablacklamp * 8)
                .EUt(7)
                .duration(20)
                .buildAndRegister();
        // ==== Ethetic Quartz ==== //
            // Adding to chisel
                mods.chisel.Carving.addVariation("quartz", <actuallyadditions:block_testifi_bucks_white_wall>);
            // Dying green
                // Quartz
                    chembath.recipeBuilder()
                    .inputs(<actuallyadditions:block_testifi_bucks_white_wall> * 8)
                    .outputs(<actuallyadditions:block_testifi_bucks_green_wall> * 8)
                    .fluidInputs(<liquid:dye_green> * 72)
                    .EUt(7)
                    .duration(80)
                    .buildAndRegister();
                // Stairs
                    chembath.recipeBuilder()
                    .inputs(<actuallyadditions:block_testifi_bucks_white_stairs> * 8)
                    .outputs(<actuallyadditions:block_testifi_bucks_green_stairs> * 8)
                    .fluidInputs(<liquid:dye_green> * 72)
                    .EUt(7)
                    .duration(80)
                    .buildAndRegister();
                // Slab
                    chembath.recipeBuilder()
                    .inputs(<actuallyadditions:block_testifi_bucks_white_slab> * 8)
                    .outputs(<actuallyadditions:block_testifi_bucks_green_slab> * 8)
                    .fluidInputs(<liquid:dye_green> * 72)
                    .EUt(7)
                    .duration(80)
                    .buildAndRegister();
                // Wall
                    chembath.recipeBuilder()
                    .inputs(<actuallyadditions:block_testifi_bucks_white_fence> * 8)
                    .outputs(<actuallyadditions:block_testifi_bucks_green_fence> * 8)
                    .fluidInputs(<liquid:dye_green> * 72)
                    .EUt(7)
                    .duration(80)
                    .buildAndRegister();
            // Dying White
                // Quartz
                    chembath.recipeBuilder()
                    .outputs(<actuallyadditions:block_testifi_bucks_white_wall> * 8)
                    .inputs(<actuallyadditions:block_testifi_bucks_green_wall> * 8)
                    .fluidInputs(<liquid:dye_white> * 72)
                    .EUt(7)
                    .duration(80)
                    .buildAndRegister();
                // Stairs
                    chembath.recipeBuilder()
                    .outputs(<actuallyadditions:block_testifi_bucks_white_stairs> * 8)
                    .inputs(<actuallyadditions:block_testifi_bucks_green_stairs> * 8)
                    .fluidInputs(<liquid:dye_white> * 72)
                    .EUt(7)
                    .duration(80)
                    .buildAndRegister();
                // Slab
                    chembath.recipeBuilder()
                    .outputs(<actuallyadditions:block_testifi_bucks_white_slab> * 8)
                    .inputs(<actuallyadditions:block_testifi_bucks_green_slab> * 8)
                    .fluidInputs(<liquid:dye_white> * 72)
                    .EUt(7)
                    .duration(80)
                    .buildAndRegister();
                // Wall
                    chembath.recipeBuilder()
                    .outputs(<actuallyadditions:block_testifi_bucks_white_fence> * 8)
                    .inputs(<actuallyadditions:block_testifi_bucks_green_fence> * 8)
                    .fluidInputs(<liquid:dye_white> * 72)
                    .EUt(7)
                    .duration(80)
                    .buildAndRegister();
        // ==== Interfaces ==== //
            // Default Phantomfaces
                assembler.recipeBuilder()
                .outputs(<actuallyadditions:block_phantomface> * 2)
                .inputs(<ore:plateManasteel> * 8, <ore:screwVibrantAlloy> * 4, <ore:circuitHv>)
                .fluidInputs(<liquid:ender> * 144)
                .EUt(300)
                .duration(200)
                .buildAndRegister();
            // Other Phantomfaces
                var PFChisel as IItemStack[] = [
                    <actuallyadditions:block_phantomface>,
                    <actuallyadditions:block_phantom_energyface>,
                    <actuallyadditions:block_phantom_redstoneface>,
                    ];
                for i in PFChisel {
                i.addTooltip(format.green("Start with a default Phantomface!"));
                mods.chisel.Carving.addVariation("Phantomfaces", i);
                recipes.remove(i);
                }
            // Phantombooster
                assembler.recipeBuilder()
                .outputs(<actuallyadditions:block_phantom_booster>)
                .inputs(<ore:stickDiamond> * 3, <ore:plateSteel> * 8)
                .fluidInputs(<liquid:ender> * 144)
                .EUt(200)
                .duration(100)
                .buildAndRegister();
            // Player Interface
                recipes.remove(<actuallyadditions:block_player_interface>);
                recipes.addShaped("GGN_aa_playerinterface", <actuallyadditions:block_player_interface>,
                [
                    [<ore:screwElementium>, <ore:plateDarkSteel>, <ore:screwElementium>],
                    [<ore:ingotSoularium>, <actuallyadditions:block_phantomface>, <ore:ingotSoularium>],
                    [<ore:screwElementium>, <ore:plateDarkSteel>, <ore:screwElementium>],
                ]);
        // ==== Lasers ==== //
            // Item
                assembler.recipeBuilder()
                .inputs(<metaitem:emitter.mv> * 2, <ore:plateSteel> * 4, <ore:screwGold> * 4, <ore:circuitMv>)
                .outputs(<actuallyadditions:block_laser_relay_item_whitelist> * 4)
                .EUt(60)
                .duration(100)
                .buildAndRegister();
            // Fluid
                assembler.recipeBuilder()
                .inputs(<metaitem:emitter.iv> * 2, <ore:plateVoid> * 4, <ore:screwTungstenSteel> * 4, <ore:circuitIv>)
                .outputs(<actuallyadditions:block_laser_relay_fluids> * 4)
                .EUt(4000)
                .duration(100)
                .buildAndRegister();
            // Upgrades
                recipes.remove(<actuallyadditions:item_laser_upgrade_range>);
                recipes.remove(<actuallyadditions:item_laser_upgrade_invisibility>);
                recipes.addShapeless("GGN_aa_laserupgrade", <actuallyadditions:item_laser_upgrade_range> * 4, [<metaitem:emitter.mv>, <ore:xuUpgradeBlank>]);
                recipes.addShapeless("GGN_aa_laserupgradeswitch", <actuallyadditions:item_laser_upgrade_range>, [<actuallyadditions:item_laser_upgrade_invisibility>]);
                recipes.addShapeless("GGN_aa_invisupgrade", <actuallyadditions:item_laser_upgrade_invisibility>, [<actuallyadditions:item_laser_upgrade_range>]);
            // Wrench
                recipes.remove(<actuallyadditions:item_laser_wrench>);
                recipes.addShaped("GGN_aa_wrench", <actuallyadditions:item_laser_wrench>,
                [
                    [<ore:ingotIron>, <ore:gtFile>, <ore:ingotIron>],
                    [null, <ore:ingotIron>, null],
                    [null, <ore:ingotIron>, null]
                ]);
            // Item Interface
                recipes.remove(<actuallyadditions:block_item_viewer>);
                recipes.addShapeless("GGN_aa_iteminterface", <actuallyadditions:block_item_viewer>,
                [<ore:chestWood>, <actuallyadditions:block_laser_relay_item_whitelist>]);
        // ==== World Interaction ==== //
            // Auto-Placer
                recipes.remove(<actuallyadditions:block_placer>);
                recipes.addShaped("GGN_aa_blockplacer", <actuallyadditions:block_placer>,
                [
                    [<ore:plateIron>, <ore:plateIron>, <ore:plateIron>],
                    [<actuallyadditions:block_misc:7>, <minecraft:dispenser>, <ore:gtHammer>],
                    [<ore:plateIron>, <ore:plateIron>, <ore:plateIron>]
                ]);
            // Auto-Breaker
                recipes.remove(<actuallyadditions:block_breaker>);
                recipes.addShapeless("GGN_aa_blockbreaker", <actuallyadditions:block_breaker>,
                [<actuallyadditions:block_placer>]);

                recipes.addShapeless("GGN_aa_blockplacershapeless", <actuallyadditions:block_placer>,
                [<actuallyadditions:block_breaker>]);
            // Long Range Breaker
                recipes.remove(<actuallyadditions:block_directional_breaker>);
                recipes.addShaped("GGN_aa_longbreaker", <actuallyadditions:block_directional_breaker>,
                [
                    [<ore:screwRoseGold>, <ore:plateWood>, <ore:screwRoseGold>],
                    [<ore:plateWood>, <actuallyadditions:block_breaker>, <ore:plateWood>],
                    [<ore:screwRoseGold>, <ore:plateWood>, <ore:screwRoseGold>],
                ]);
            // Automatic Precision Dropper
                recipes.remove(<actuallyadditions:block_dropper>);
                recipes.addShaped("GGN_aa_blockdropper", <actuallyadditions:block_dropper>,
                [
                    [<ore:screwIron>, <minecraft:dropper>, <ore:screwIron>],
                    [<ore:springIron>, <ore:gtFile>, <ore:springIron>],
                    [<ore:plateIron>, <ore:gtHammer>, <ore:plateIron>]
                ]);
            // Auto-Feeder
                recipes.remove(<actuallyadditions:block_feeder>);
                recipes.addShaped("GGN_aa_feeder", <actuallyadditions:block_feeder>, 
                [
                    [<ore:plateIron>, <minecraft:golden_apple>, <ore:plateIron>], 
                    [<thaumcraft:crystal_essence>.withTag({Aspects: [{amount: 1, key: "herba"}]}), <actuallyadditions:block_misc:7>,<thaumcraft:crystal_essence>.withTag({Aspects: [{amount: 1, key: "herba"}]})], 
                    [<ore:plateIron>, <minecraft:golden_apple>, <ore:plateIron>]]);
            // Firework Box
                recipes.remove(<actuallyadditions:block_firework_box>);
                recipes.addShaped("GGN_aa_fireworks", <actuallyadditions:block_firework_box>,
                [
                    [<minecraft:fireworks>, <minecraft:fireworks>, <minecraft:fireworks>],
                    [<ore:plankWood>, <actuallyadditions:block_misc:7>, <ore:plankWood>],
                    [<ore:plateIron>, <ore:plateIron>, <ore:plateIron>]
                ]);
    // ======== Canola ======== //
        // Seeds from Thaumcraft
            mods.thaumcraft.Crucible.registerRecipe("GGNcanola", "", <actuallyadditions:item_canola_seed>, <minecraft:wheat_seeds>, 
                [<aspect:terra> * 5, <aspect:praecantatio> * 5]);
        // Extracting into a lot of Seed Oil
            extractor.recipeBuilder()
            .inputs(<ore:seedCanola>)
            .fluidOutputs(<liquid:seed_oil> * 100)
            .EUt(8)
            .duration(40)
            .buildAndRegister();
        // Enhancing through Botania
            mods.botania.ManaInfusion.addInfusion(<actuallyadditions:item_misc:23>, <ore:seedCanola>, 3000);
        // Extracting into a looooot of Seed Oil
            extractor.recipeBuilder()
            .inputs(<actuallyadditions:item_misc:23>)
            .fluidOutputs(<liquid:seed_oil> * 800)
            .EUt(8)
            .duration(40)
            .buildAndRegister();
    // ======== Components ======== //
        // ==== Casings ==== //
            val aacasing = <actuallyadditions:block_misc:7>;
            val aawoodcasing = <actuallyadditions:block_misc:4>;

            recipes.remove(aawoodcasing);
            recipes.addShaped("GGNaawoodcasing", aawoodcasing,
            [
                [<ore:logWood>, <ore:stickWood>, <ore:logWood>],
                [<ore:stickWood>, <extrautils2:compressedcobblestone>, <ore:stickWood>],
                [<ore:logWood>, <ore:stickWood>, <ore:logWood>]
            ]);

            recipes.remove(aacasing);
            recipes.addShaped("GGNaacasing", aacasing * 4,
            [
                [<ore:plateIron>, <ore:plateIron>, <ore:plateIron>],
                [<ore:plateIron>, aawoodcasing, <ore:plateIron>],
                [<ore:plateIron>, <ore:plateIron>, <ore:plateIron>]
            ]);
// ================ Actually Additions ================ //

