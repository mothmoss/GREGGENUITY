#priority 10000
import mods.jei.JEI.removeAndHide as rh;
import crafttweaker.item.IItemStack;
import crafttweaker.item.IItemDefinition;
import crafttweaker.item.IIngredient;
import crafttweaker.oredict.IOreDict;
import crafttweaker.oredict.IOreDictEntry;

// ================ OreDict ================ //
    // ======== Main Script ======== //
        // ======== Blocks ======== //
            var blocksDisabled as IItemStack[][IOreDictEntry] = {
                //blockTerrasteel
                <ore:blockTerrasteel> : [
                <metaitem:blockTerrasteel>
                ],

                //blockManasteel
                <ore:blockManasteel> : [
                <metaitem:blockManasteel>
                ],

                //blockThaumium
                <ore:blockThaumium> : [
                <metaitem:blockThaumium>
                ],

                //blockVoid
                <ore:blockVoid> : [
                    <metaitem:blockVoid>
                ],

                //blockVibrantAlloy
                <ore:blockVibrantAlloy> : [
                    <metaitem:blockVibrantAlloy>
                ],

                //blockDarkSteel
                <ore:blockDarkSteel> : [
                    <metaitem:blockDarkSteel>
                ],

                //blockDesh
                <ore:blockDesh> : [
                    <galacticraftplanets:mars:8>
                ],

                //blockPulsatingIron
                <ore:blockPulsatingIron> : [
                    <metaitem:blockPulsatingIron>
                ],

                //blockEnergeticAlloy
                <ore:blockEnergeticAlloy> : [
                    <metaitem:blockEnergeticAlloy>
                ],

                //blockMithrillium
                <ore:blockMithrillium> : [
                    <metaitem:blockMithrillium>
                ],

                //blockEndSteel
                <ore:blockEndSteel> : [
                    <metaitem:blockEndSteel>
                ],

                //blockAluminum
                <ore:blockAluminum>: [
                    <thermalfoundation:storage:4>,
                    <galacticraftcore:basic_block_core:11>,
                ],

                //blockAluminium
                <ore:blockAluminium> : [
                    <galacticraftcore:basic_block_core:11>
                ],

                //blockBronze
                <ore:blockBronze> : [
                    <thermalfoundation:storage_alloy:3>,
                ],

                //blockCopper
                <ore:blockCopper> : [
                    <thermalfoundation:storage>,
                    <immersiveengineering:metal:5>,
                    <galacticraftcore:basic_block_core:9>,
                ],

                //blockCharcoal
                <ore:blockCharcoal> : [
                    <actuallyadditions:block_misc:5>,
                    <thermalfoundation:storage_resource>
                ],

                //blockCoalCoke
                <ore:fuelCoke> : [
                    <thermalfoundation:storage_resource:1>,
                    <immersiveengineering:stone_decoration:3>
                ],


                //blockElectrum
                <ore:blockElectrum> : [
                    <thermalfoundation:storage_alloy:1>,
                ],

                //blockInvar
                <ore:blockInvar> : [
                    <thermalfoundation:storage_alloy:2>
                ],

                //blockIridium
                <ore:blockIridium> : [
                    <thermalfoundation:storage:7>,
                ],

                //blockLead
                <ore:blockLead> : [
                    <thermalfoundation:storage:3>,
                    <galacticraftplanets:venus:12>
                ],

                //blockNickel
                <ore:blockNickel> : [
                    <thermalfoundation:storage:5>,
                ],

                //blockPlatinum
                <ore:blockPlatinum> : [
                    <thermalfoundation:storage:6>
                ],

                //blockSilver
                <ore:blockSilver> : [
                    <thermalfoundation:storage:2>,
                ],

                //blockSilicon
                <ore:blockSilicon> : [
                    <galacticraftcore:basic_block_core:13>,
                ],

                //blockSteel
                <ore:blockSteel> : [
                    <thermalfoundation:storage_alloy>,
                ],

                //blockTin
                <ore:blockTin> : [
                    <thermalfoundation:storage:1>,
                    <galacticraftcore:basic_block_core:10>,
                ],

                //blockTitanium
                <ore:blockTitanium> : [
                    <galacticraftplanets:asteroids_block:7>
                ],

                //blockUranium 
                <ore:blockUranium>: [
                ],
            };

            for oreDictEntry, items in blocksDisabled {
                for i in items {
                    mods.jei.JEI.removeAndHide(i);
                }
                oreDictEntry.removeItems(items);
            }

        // ======== Dusts ======== //    
            var dustsDisabled as IItemStack[][IOreDictEntry] = {
                //dustAluminium
                <ore:dustAluminium> : [
                    <thermalfoundation:material:68>,
                    <immersiveengineering:metal:10>,
                    <galacticraftcore:ic2compat>,
                ],

                //dustAluminum
                <ore:dustAluminum>: [
                    <thermalfoundation:material:68>,
                    <immersiveengineering:metal:10>,
                    <galacticraftplanets:item_basic_asteroids:9>,
                ],

                //dustBronze
                <ore:dustBronze> : [
                    <thermalfoundation:material:99>
                ],

                //dustCertusQuartz
                <ore:dustCertusQuartz> : [
                    <appliedenergistics2:material:2>
                ],

                //dustCharcoal
                <ore:dustCharcoal> : [
                    <thermalfoundation:material:769>
                ],

                //dustCoke
                <ore:dustCoke> : [
                    <immersiveengineering:material:17>
                ],
                //dustCoal
                <ore:dustCoal> : [
                    <enderio:item_material:23>,
                    <actuallyadditions:item_dust:6>,
                    <thermalfoundation:material:768>,
                    <threng:material:3>
                ],

                //dustCobalt
                <ore:dustCobalt> : [
                    <enderio:item_material:31>
                ],

                //dustConstantan
                <ore:dustConstantan> : [
                    <thermalfoundation:material:100>,
                    <immersiveengineering:metal:15>
                ],

                //dustCopper
                <ore:dustCopper>: [
                    <enderio:item_material:26>,
                    <thermalfoundation:material:64>,
                    <immersiveengineering:metal:9>,
                ],

                //dustDiamond
                <ore:dustDiamond> : [
                    <actuallyadditions:item_dust:2>
                ],

                //dustElectrum
                <ore:dustElectrum> : [
                    <thermalfoundation:material:97>,
                    <immersiveengineering:metal:16>
                ],

                //dustEnderPearl
                <ore:dustEnderPearl> : [
                    <appliedenergistics2:material:46>,
                    <appliedenergistics2:material:46>
                ],

                //dustEmerald
                <ore:dustEmerald> : [
                    <actuallyadditions:item_dust:3>
                ],

                //dustEnderium
                <ore:dustEnderium> : [
                    <thermalfoundation:material:103>
                ],

                //dustGold
                <ore:dustGold> : [
                    <actuallyadditions:item_dust:1>,
                    <appliedenergistics2:material:51>,
                    <enderio:item_material:25>,
                    <thermalfoundation:material:1>,
                    <immersiveengineering:metal:19>,
                ],

                //dustIron
                <ore:dustIron>: [
                    <enderio:item_material:24>,
                    <actuallyadditions:item_dust>,
                    <appliedenergistics2:material:49>,
                    <thermalfoundation:material>,
                    <immersiveengineering:metal:18>,
                ],

                //dustLapis
                <ore:dustLapis> : [
                    <actuallyadditions:item_dust:4>,
                    <enderio:item_material:32>
                ],

                //dustLead
                <ore:dustLead>: [
                    <thermalfoundation:material:67>,
                    <immersiveengineering:metal:11>

                ],

                //dustLumium
                <ore:dustLumium> : [
                    <thermalfoundation:material:102>
                ],

                //dustInvar
                <ore:dustInvar> : [
                    <thermalfoundation:material:98>
                ],

                //dustIridium
                <ore:dustIridium> : [
                    <thermalfoundation:material:71>,
                ],

                //dustNetherQuartz
                <ore:dustNetherQuartz> : [
                    <enderio:item_material:33>,
                    <actuallyadditions:item_dust:5>,
                    <appliedenergistics2:material:3>
                ],

                //dustNickel
                <ore:dustNickel> : [
                    <thermalfoundation:material:69>,
                    <immersiveengineering:metal:13>

                ],

                //dustObsidian
                <ore:dustObsidian> : [
                    <enderio:item_material:29>,
                    <thermalfoundation:material:770>
                    
                ],

                //dustPlatinum
                <ore:dustPlatinum> : [
                    <thermalfoundation:material:70>
                ],

                //dustQuartz
                <ore:dustQuartz> : [
                    <appliedenergistics2:material:3>,
                    <actuallyadditions:item_dust:5>
                ],

                //dustSaltpeter
                <ore:dustSaltpeter> : [
                    <thermalfoundation:material:772>,
                ],

                //dustSignalum
                <ore:dustSignalum>: [
                    <thermalfoundation:material:101>,
                    <immersiveengineering:material:24>
                ],

                //dustSilver
                <ore:dustSilver>: [
                    <thermalfoundation:material:66>,
                    <immersiveengineering:metal:12>

                ],

                //dustSilicon
                <ore:dustSilicon>: [
                ],

                //dustSteel
                <ore:dustSteel> : [
                    <thermalfoundation:material:96>,
                    <immersiveengineering:metal:17>,
                ],

                //dustStarmetal
                <ore:dustStarmetal> : [
                    <metaitem:dustStarmetal>
                ],

                //dustSulfur
                <ore:dustSulfur>: [
                    <thermalfoundation:material:771>,
                    <immersiveengineering:material:25>,
                    <galaxyspace:gs_basic:7>
                ],

                //dustFluix
                <ore:dustFluix> : [
                    <appliedenergistics2:material:8>
                ],

                //dustFlour
                <ore:dustFlour> : [
                    <appliedenergistics2:material:4>
                ],

                //dustTin
                <ore:dustTin>: [
                    <enderio:item_material:27>,
                    <thermalfoundation:material:65>,
                ],

                //dustUranium
                <ore:dustUranium> : [
                    <immersiveengineering:metal:14>
                ],

                //dustTitanium
                <ore:dustTitanium> : [
                    <galacticraftplanets:item_basic_asteroids:9>,
                ],

                //dustWood
                <ore:dustWood> : [
                    <thermalfoundation:material:800>
                ]

            };
            for oreDictEntry, items in dustsDisabled {
            for i in items {
                mods.jei.JEI.removeAndHide(i);
            }
            oreDictEntry.removeItems(items);
            }
        // ======== Ingots ======== //    
            var ingotsDisabled as IItemStack[][IOreDictEntry] = {
                //ingotTerrasteel
                <ore:ingotTerrasteel> : [
                <metaitem:ingotTerrasteel>
                ],

                //ingotStarmetal
                <ore:ingotStarmetal> : [
                <metaitem:ingotStarmetal>
                ],

                //ingotManasteel
                <ore:ingotManasteel> : [
                <metaitem:ingotManasteel>
                ],

                //ingotMagnesium
                <ore:ingotMagnesium> : [
                    <galaxyspace:ingots:1>
                ],

                //ingotCobalt
                <ore:ingotCobalt> : [
                    <galaxyspace:ingots>
                ],

                //ingotDesh
                <ore:ingotDesh> : [
                    <galacticraftplanets:item_basic_mars:2>
                ],

                //ingotThaumium
                <ore:ingotThaumium> : [
                <metaitem:ingotThaumium>
                ],

                //ingotElementium
                <ore:ingotElvenElementium> : [
                <metaitem:ingotElementium>
                ],

                //ingotFluixSteel
                <ore:ingotFluixSteel> : [
                    <threng:material>
                ],

                //ingotVoid
                <ore:ingotVoid> : [
                    <metaitem:ingotVoid>
                ],

                //ingotVibrantAlloy
                <ore:ingotVibrantAlloy> : [
                    <metaitem:ingotVibrantAlloy>
                ],

                //ingotDarkSteel
                <ore:ingotDarkSteel> : [
                    <metaitem:ingotDarkSteel>
                ],

                //ingotPulsatingIron
                <ore:ingotPulsatingIron> : [
                    <metaitem:ingotPulsatingIron>
                ],

                //ingotEnergeticAlloy
                <ore:ingotEnergeticAlloy> : [
                    <metaitem:ingotEnergeticAlloy>
                ],

                //ingotMithrillium
                <ore:ingotMithrillium> : [
                    <metaitem:ingotMithrillium>
                ],

                //ingotEndSteel
                <ore:ingotEndSteel> : [
                    <metaitem:ingotEndSteel>
                ],

                //ingotAluminium
                <ore:ingotAluminium> : [
                    <thermalfoundation:material:132>,
                    <immersiveengineering:metal:1>,
                ],

                //ingotAluminum
                <ore:ingotAluminum>: [
                    <thermalfoundation:material:132>,
                ],

                //ingotBronze
                <ore:ingotBronze> : [
                    <thermalfoundation:material:163>
                ],

                //ingotBronze
                <ore:ingotBrass> : [
                    <thaumcraft:ingot:2>
                ],


                //ingotCopper
                <ore:ingotCopper> : [
                    <thermalfoundation:material:128>,
                    <immersiveengineering:metal>,
                    <galacticraftcore:basic_item:3>
                ],

                //ingotConstantan
                <ore:ingotConstantan> : [
                    <immersiveengineering:metal:6>
                ],

                //ingotElectrum
                <ore:ingotElectrum> : [
                    <thermalfoundation:material:161>,
                    <immersiveengineering:metal:7>
                ],

                //ingotLead
                <ore:ingotLead> : [
                    <thermalfoundation:material:131>,
                    <immersiveengineering:metal:2>,
                    <galacticraftplanets:basic_item_venus:1>
                ],

                //ingotLumium
                <ore:ingotLumium> : [
                    <thermalfoundation:material:166>
                ],

                //ingotOsmiridium
                <ore:ingotOsmiridium> : [
                ],

                //ingotOsmium
                <ore:ingotOsmium> : [
                ],

                //ingotIridium
                <ore:ingotIridium> : [
                    <thermalfoundation:material:135>,
                ],

                //ingotInvar
                <ore:ingotInvar> : [
                    <thermalfoundation:material:162>
                ],

                //ingotNickel
                <ore:ingotNickel> : [
                    <thermalfoundation:material:133>,
                    <immersiveengineering:metal:4>,
                    <galaxyspace:ingots:2>
                ],

                //ingotPlatinum
                <ore:ingotPlatinum> : [
                    <thermalfoundation:material:134>
                ],

                //ingotTin
                <ore:ingotTin> : [
                    <thermalfoundation:material:129>,
                    <galacticraftcore:basic_item:4>
                ],

                //ingotTitanium
                <ore:ingotTitanium> : [
                    <galacticraftplanets:item_basic_asteroids>
                ],

                //ingotUranium
                <ore:ingotUranium> : [
                    <immersiveengineering:metal:5>
                ],

                //ingotSignalum
                <ore:ingotSignalum> : [
                    <thermalfoundation:material:165>
                ],

                //ingotSilver
                <ore:ingotSilver> : [
                    <thermalfoundation:material:130>,
                    <immersiveengineering:metal:3>
                ],

                //ingotSilicon
                <ore:ingotSilicon>: [
                ],

                //ingotSteel
                <ore:ingotSteel> : [
                    <thermalfoundation:material:160>,
                    <immersiveengineering:metal:8>,
                ]

            };

            for oreDictEntry, items in ingotsDisabled {
                for i in items {
                    mods.jei.JEI.removeAndHide(i);
                }
                oreDictEntry.removeItems(items);
            }
        // ======== Sticks ======== //    
            var sticksDisabled as IItemStack[][IOreDictEntry] = {

                //stickIron
                <ore:stickIron> : [
                    <immersiveengineering:material:1>,
                ],

                //stickSteel
                <ore:stickSteel> : [
                    <immersiveengineering:material:2>,
                ],
                
                //stickAluminum
                <ore:stickAluminum> : [
                    <immersiveengineering:material:3>,
                    <galacticraftcore:basic_item:5>
                ],

                //stickAluminium
                <ore:stickAluminium> : [
                    <immersiveengineering:material:3>
                ],

                //stickCopper
                <ore:stickCopper> : [
                ],

                //stickTitanium
                <ore:stickTitanium> : [
                ],
                
                //stickIridium
                <ore:stickIridium> : [
                ]};

            for oreDictEntry, items in sticksDisabled {
                for i in items {
                    mods.jei.JEI.removeAndHide(i);
                }
                oreDictEntry.removeItems(items);
            }
        // ======== Nugget ======== //    
            var nuggetsDisabled as IItemStack[][IOreDictEntry] = {
                <ore:nuggetAluminium> :[
                    <thermalfoundation:material:196>,
                    <immersiveengineering:metal:21>
                ],

                <ore:nuggetAluminum> : [
                    <thermalfoundation:material:196>,
                    <immersiveengineering:metal:21>
                ],

                <ore:nuggetBronze> : [
                    <thermalfoundation:material:227>,
                ],

                //nuggetCopper
                <ore:nuggetCopper> : [
                    <thaumcraft:nugget:1>,
                    <thermalfoundation:material:192>,
                ],

                //nuggetCobalt
                <ore:nuggetCobalt> : [
                    <galaxyspace:nuggets>,
                ],

                //nuggetConstantan
                <ore:nuggetConstantan> : [
                    <thermalfoundation:material:229>,
                    <immersiveengineering:metal:26>
                ],

                <ore:nuggetElectrum> : [
                    <thermalfoundation:material:225>,
                    <immersiveengineering:metal:27>
                ],

                <ore:nuggetEmerald> : [
                    <thermalfoundation:material:17>,
                    <extendedcrafting:material:129>
                ],

                <ore:nuggetDiamond> : [
                    <thermalfoundation:material:16>,
                    <extendedcrafting:material:128>
                ],

                <ore:nuggetEnderium> : [
                    <thermalfoundation:material:231>
                ],

                //nuggetInvar
                <ore:nuggetInvar> : [
                    <thermalfoundation:material:226>,
                ],

                <ore:nuggetIridium> : [
                    <thermalfoundation:material:199>,
                ],

                <ore:nuggetIron> : [
                    <thaumcraft:nugget>,
                    <immersiveengineering:metal:29>,
                ],

                //nuggetLead
                <ore:nuggetLead> : [
                    <thermalfoundation:material:195>,
                    <thaumcraft:nugget:4>
                ],

                //nuggetLumium
                <ore:nuggetLumium> :
                [
                    <thermalfoundation:material:230>
                ],

                //nuggetNickel
                <ore:nuggetNickel> : [
                    <thermalfoundation:material:197>,
                    <galaxyspace:nuggets:2>,
                ],

                //nuggetMagnesium
                <ore:nuggetMagnesium> : [
                    <galaxyspace:nuggets:1>,
                ],

                //nuggetPlatinum
                <ore:nuggetPlatinum> : [
                    <thermalfoundation:material:198>

                ],

                //nuggetSteel
                <ore:nuggetSteel> : [
                    <thermalfoundation:material:224>,
                    <immersiveengineering:metal:28>
                ],

                //nuggetSilver
                <ore:nuggetSilver> : [
                    <thermalfoundation:material:194>,
                    <thaumcraft:nugget:3>
                ],

                //nuggetSignalum
                <ore:nuggetSignalum> : [
                    <thermalfoundation:material:229>
                ],

                //nuggetSilicon
                <ore:nuggetSilicon> : [
                ],

                //nuggetTin
                <ore:nuggetTin> : [
                    <thermalfoundation:material:193>,
                    <thaumcraft:nugget:2>

                ],

                //nuggetTitanium,
                <ore:nuggetTitanium> : [
                ],

                //nuggetTerrasteel
                <ore:nuggetTerrasteel> : [
                <metaitem:nuggetTerrasteel>
                ],

                //nuggetStarmetal
                <ore:nuggetStarmetal> : [
                <metaitem:nuggetStarmetal>
                ],

                //nuggetManasteel
                <ore:nuggetManasteel> : [
                <metaitem:nuggetManasteel>
                ],

                //nuggetThaumium
                <ore:nuggetThaumium> : [
                <metaitem:nuggetThaumium>
                ],

                //nuggetElementium
                <ore:nuggetElvenElementium> : [
                <metaitem:nuggetElementium>
                ],

                //nuggetVoid
                <ore:nuggetVoid> : [
                    <metaitem:nuggetVoid>
                ],

                //nuggetVibrantAlloy
                <ore:nuggetVibrantAlloy> : [
                    <metaitem:nuggetVibrantAlloy>
                ],

                //nuggetDarkSteel
                <ore:nuggetDarkSteel> : [
                    <metaitem:nuggetDarkSteel>
                ],

                //nuggetPulsatingIron
                <ore:nuggetPulsatingIron> : [
                    <metaitem:nuggetPulsatingIron>
                ],

                //nuggetEnergeticAlloy
                <ore:nuggetEnergeticAlloy> : [
                    <metaitem:nuggetEnergeticAlloy>
                ],
                
                //nuggetMithrillium
                <ore:nuggetMithrillium> :
                [
                    <metaitem:nuggetMithrillium>
                ],

                //nuggetEndSteel
                <ore:nuggetEndSteel> : [
                    <metaitem:nuggetEndSteel>
                ],
            };

            for oreDictEntry, items in nuggetsDisabled {
                for i in items {
                    mods.jei.JEI.removeAndHide(i);
                }
                oreDictEntry.removeItems(items);
            }
        // ======== Ores ======== //  
                    var oresDisabled as IItemStack[][IOreDictEntry] = {

                //oreAluminium
                <ore:oreAluminium> : [
                    <immersiveengineering:ore:1>,
                    <thermalfoundation:ore:4>,
                    <galacticraftcore:basic_block_core:7>,
                    <galacticraftplanets:asteroids_block:3>,
                    <galacticraftplanets:venus:6>,
                    <galaxyspace:marsores:5>,
                    <galaxyspace:haumeablocks:3>,
                    <galaxyspace:barnarda_c_ores:9>,
                    ],

                //oreAluminum
                <ore:oreAluminum> : [
                    <immersiveengineering:ore:1>,
                    <thermalfoundation:ore:4>,
                    <galacticraftcore:basic_block_core:7>,
                    <galacticraftplanets:asteroids_block:3>,
                    <galaxyspace:europablocks:5>,
                    <galaxyspace:marsores:5>,
                    <galaxyspace:haumeablocks:3>,
                    <galaxyspace:barnarda_c_ores:9>
                ],

                //oreCoal
                <ore:oreCoal> : [
                    <minecraft:coal_ore>,
                    <galaxyspace:marsores:2>,
                    <galaxyspace:enceladusblocks:2>,
                    <galaxyspace:titanblocks:6>,
                    <galaxyspace:proxima_b_blocks:8>,
                    <galaxyspace:barnarda_c_ores>,

                ],

                //oreCobalt
                <ore:oreCobalt> : [
                    <galaxyspace:gsores>,
                    <galaxyspace:mirandablocks:7>,
                    <galaxyspace:barnarda_c_ores:11>,
                ],

                //oreCopper
                <ore:oreCopper> : [
                    <immersiveengineering:ore>,
                    <thermalfoundation:ore>,
                    <galacticraftcore:basic_block_moon>,
                    <galacticraftcore:basic_block_core:5>,
                    <galacticraftplanets:mars>,
                    <galaxyspace:ioblocks:3>,
                    <galacticraftplanets:venus:7>,
                    <galaxyspace:proxima_b_blocks:7>,
                    <galaxyspace:barnarda_c_ores:7>,


                ],

                //oreCinnabar
                <ore:oreCinnabar> : [
                    <thaumcraft:ore_cinnabar>
                ],

                //oreDiamond
                <ore:oreDiamond> : [
                    <minecraft:diamond_ore>,
                    <galaxyspace:mirandablocks:5>,
                    <galaxyspace:marsores>,
                    <galaxyspace:titanblocks:5>,
                    <galaxyspace:proxima_b_blocks:10>,
                    <galaxyspace:barnarda_c_ores:5>,


                ],

                //oreDesh
                <ore:oreDesh> : [
                    <galacticraftplanets:mars:2>,
                    <galaxyspace:phobosblocks:5>
                ],

                //oreEmerald
                <ore:oreEmerald> : [
                    <minecraft:emerald_ore>,
                    <galaxyspace:europablocks:3>,
                    <galaxyspace:titanblocks:4>
                ],

                //oreGold
                <ore:oreGold> : [
                    <minecraft:gold_ore>,
                    <galaxyspace:marsores:1>,
                    <galaxyspace:proxima_b_blocks:5>,
                    <galaxyspace:barnarda_c_ores:2>,

                ],

                //oreIridium
                <ore:oreIridium> : [
                    <thermalfoundation:ore:7>,
                ],

                //oreIlmenite
                <ore:oreIlmenite> : [
                    <galacticraftplanets:asteroids_block:4>,
                    <galaxyspace:ganymedeblocks:3>

                ],

                //oreIron
                <ore:oreIron> : [
                    <minecraft:iron_ore>,
                    <galacticraftplanets:mars:3>,
                    <galacticraftplanets:asteroids_block:5>,
                    <galaxyspace:phobosblocks:2>,
                    <galaxyspace:mercuryblocks:4>,
                    <galaxyspace:mirandablocks:3>,
                    <galaxyspace:barnarda_c_ores:1>,




                ],

                //oreLapis
                <ore:oreLapis> : [
                    <minecraft:lapis_ore>,
                    <galaxyspace:titanblocks:7>,
                    <galaxyspace:barnarda_c_ores:4>,


                ],

                //oreLead
                <ore:oreLead>: [
                    <thermalfoundation:ore:3>,
                    <immersiveengineering:ore:2>,
                    <galacticraftplanets:venus:8>
                ],

                //oreNetherQuartz
                <ore:oreNetherQuartz> : [
                    <minecraft:quartz_ore> 
                ],

                //oreNickel
                <ore:oreNickel> : [
                    <immersiveengineering:ore:4>,
                    <thermalfoundation:ore:5>,
                    <galaxyspace:mercuryblocks:3>,
                    <galaxyspace:gsores:1>,
                    <galaxyspace:phobosblocks:4>,
                    <galaxyspace:mirandablocks:8>,
                    <galaxyspace:barnarda_c_ores:12>,

                ],

                //orePlatinum
                <ore:orePlatinum> : [
                    <thermalfoundation:ore:6>
                ],

                //oreRedstone
                <ore:oreRedstone> : [
                    <minecraft:redstone_ore>,
                    <galaxyspace:marsores:3>,
                    <galaxyspace:titanblocks:8>,
                    <galaxyspace:barnarda_c_ores:3>,

                ],

                //oreQuartz
                <ore:oreQuartz>: [
                    <minecraft:quartz_ore>,
                    <galaxyspace:mirandablocks:6>,
                    <galaxyspace:barnarda_c_ores:10>,
                    <galacticraftplanets:venus:9>,
                ],

                //oreTin
                <ore:oreTin> : [
                    <thermalfoundation:ore:1>,
                    <galacticraftcore:basic_block_moon:1>,
                    <galacticraftcore:basic_block_core:6>,
                    <galacticraftplanets:mars:1>,
                    <galaxyspace:proxima_b_blocks:6>,
                    <galaxyspace:barnarda_c_ores:8>,
                    <galacticraftplanets:venus:11>,
                ],

                //oreTitanium
                <ore:oreTitanium> : [
                ],

                //oreSilver
                <ore:oreSilver> : [
                    <thermalfoundation:ore:2>,
                    <immersiveengineering:ore:3>,
                ],

                //oreSolar
                <ore:oreSolar> : [
                    <galacticraftplanets:venus:13>
                ],

                //oreSilicon
                <ore:oreSilicon> : [
                    <galacticraftcore:basic_block_core:8>,
                    <galacticraftplanets:venus:10>,
                    <galaxyspace:europablocks:4>,
                    <galaxyspace:marsores:4>,
                    <galaxyspace:proxima_b_blocks:9>,
                    <galaxyspace:barnarda_c_ores:6>,



                ],

                //oreSapphire
                <ore:oreSapphire> : [
                    <galacticraftcore:basic_block_moon:6>,
                    <galaxyspace:titanblocks:3>,

                ],

                //oreSulfur
                <ore:oreSulfur> : [
                    <galaxyspace:ioblocks:4>

                ],

                //oreVolcanic
                <ore:oreVolcanic> : [
                    <galaxyspace:ioblocks:5>,
                ],

                //oreMagnesium
                <ore:oreMagnesium> : [
                    <galaxyspace:mercuryblocks:5>,
                    <galaxyspace:ganymedeblocks:2>
                ],

                //oreMeteoricIron
                <ore:oreMeteoricIron> : [
                    <galaxyspace:ceresblocks:3>,
                    <galaxyspace:phobosblocks:3>,

                ],

                //oreDolomite
                <ore:oreDolomite> : [
                    <galaxyspace:ceresblocks:2>,
                    <galaxyspace:mirandablocks:4>,

                ],

                //oreUranium
                <ore:oreUranium> : [
                    <immersiveengineering:ore:5>,
                    <galaxyspace:gsores:2>,

                ]

            };

            for oreDictEntry, items in oresDisabled {
                for i in items {
                    mods.jei.JEI.removeAndHide(i);
                }
                oreDictEntry.removeItems(items);
            }
            
        // ======== Plates ======== //    
            var platesDisabled as IItemStack[][IOreDictEntry] = {

                //plateAluminium
                <ore:plateAluminium> : [
                    <thermalfoundation:material:324>,
                    <immersiveengineering:metal:31>,
                    <galacticraftcore:basic_item:8>,
                ],

                //plateAluminum
                <ore:plateAluminum> : [
                    <thermalfoundation:material:324>,
                    <immersiveengineering:metal:31>,
                ],


                //plateBronze
                <ore:plateBronze> : [
                    <thermalfoundation:material:355>,
                    <galacticraftcore:basic_item:10>,
                ],

                //plateBrass
                <ore:plateBrass> : [
                    <thaumcraft:plate>
                ],

                //plateConstantan
                <ore:plateConstantan> : [
                    <thermalfoundation:material:356>,
                    <immersiveengineering:metal:36>

                ],

                //plateCobalt
                <ore:plateCobalt> : [
                    <galaxyspace:compressed_plates:1>,
                ],

                //plateCoal
                <ore:plateCoal> : [
                    <galaxyspace:compressed_plates>
                ],

                //plateCopper
                <ore:plateCopper> : [
                    <thermalfoundation:material:320>,
                    <immersiveengineering:metal:30>,
                    <galacticraftcore:basic_item:6>,
                ],

                //plateDesh
                <ore:plateDesh> : [
                    <galacticraftplanets:item_basic_mars:5>,
                ],

                //plateElectrum
                <ore:plateElectrum> : [
                    <thermalfoundation:material:353>,
                    <immersiveengineering:metal:37>

                ],

                //plateEnderium
                <ore:plateEnderium> : [
                    <thermalfoundation:material:359>
                ],

                //plateGold
                <ore:plateGold> : [
                    <thermalfoundation:material:33>,
                    <immersiveengineering:metal:40>,
                ],

                //plateInvar
                <ore:plateInvar> : [
                    <thermalfoundation:material:354>
                ],

                //plateIridium
                <ore:plateIridium> : [
                    <thermalfoundation:material:327>,
                ],

                //plateIron
                <ore:plateIron> : [
                    <thermalfoundation:material:32>,
                    <thaumcraft:plate:1>,
                    <immersiveengineering:metal:39>,
                    <galacticraftcore:basic_item:11>,
                ],

                //plateLead
                <ore:plateLead> : [
                    <thermalfoundation:material:323>,
                    <immersiveengineering:metal:32>
                ],

                //plateLumium
                <ore:plateLumium> : [
                    <thermalfoundation:material:358>
                ],

                //plateNickel
                <ore:plateNickel> : [
                    <thermalfoundation:material:325>,
                    <immersiveengineering:metal:34>,
                    <galaxyspace:compressed_plates:3>,
                ],

                //platePlatinum
                <ore:platePlatinum> : [
                    <thermalfoundation:material:326>
                ],

                //plateSignalum
                <ore:plateSignalum> : [
                    <thermalfoundation:material:357>
                ],

                //plateSilicon
                <ore:plateSilicon> : [
                ],

                //plateSilver
                <ore:plateSilver> : [
                    <thermalfoundation:material:322>,
                    <immersiveengineering:metal:33>
                ],

                //plateSteel
                <ore:plateSteel> : [
                    <thermalfoundation:material:352>,
                    <immersiveengineering:metal:38>,
                    <galacticraftcore:basic_item:9>,

                ],

                //plateTin
                <ore:plateTin> : [
                    <thermalfoundation:material:321>,
                    <galacticraftcore:basic_item:7>,

                ],

                //plateUranium
                <ore:plateUranium> : [
                    <immersiveengineering:metal:35>
                ],

                //plateThaumium
                <ore:plateThaumium> : [
                    <thaumcraft:plate:2>
                ],

                //plateTitanium
                <ore:plateTitanium> : [
                    <galacticraftplanets:item_basic_asteroids:6>,
                ],

                //plateMithrillium
                <ore:plateMithrillium> : [
                    <thaumadditions:mithrillium_plate>
                ],

                //plateMagnesium
                <ore:plateMagnesium> : [
                    <galaxyspace:compressed_plates:2>,
                ],

                //plateVoid
                <ore:plateVoid> : [
                    <thaumcraft:plate:3>
                ]
            };
                for oreDictEntry, items in platesDisabled {
                for i in items {
                    mods.jei.JEI.removeAndHide(i);
                }
                oreDictEntry.removeItems(items);
            }
        // ======== Gears ======== //   
            var gearsDisabled as IItemStack[][IOreDictEntry] = {

                //gearAluminum
                <ore:gearAluminum> : [
                    <thermalfoundation:material:260>
                ],

                //gearBronze
                <ore:gearBronze> : [
                    <thermalfoundation:material:291>
                ],

                //gearConstantan
                <ore:gearConstantan> : [
                    <thermalfoundation:material:292>
                ],

                //gearCopper
                <ore:gearCopper> : [
                    <thermalfoundation:material:256>
                ],

                //gearDiamond
                <ore:gearDiamond> : [
                    <thermalfoundation:material:26>
                ],

                //gearElectrum
                <ore:gearElectrum> : [
                    <thermalfoundation:material:289>,
                ],

                //gearEnderium
                <ore:gearEnderium> : [
                    <thermalfoundation:material:295>
                ],

                //gearGold
                <ore:gearGold> : [
                    <thermalfoundation:material:25>
                ],

                //gearInvar
                <ore:gearInvar> : [
                    <thermalfoundation:material:290>
                ],

                //gearIron
                <ore:gearIron> : [
                    <thermalfoundation:material:24>
                ],

                //gearIridium
                <ore:gearIridium> : [
                    <thermalfoundation:material:263>
                ],

                //gearLead
                <ore:gearLead> : [
                    <thermalfoundation:material:259>
                ],

                //gearLumium
                <ore:gearLumium> : [
                    <thermalfoundation:material:294>
                ],

                //gearNickel
                <ore:gearNickel> : [
                    <thermalfoundation:material:261>
                ],

                //gearPlatinum
                <ore:gearPlatinum> : [
                    <thermalfoundation:material:262>
                ],

                //gearSilver
                <ore:gearSilver> : [
                    <thermalfoundation:material:258>
                ],

                //gearSignalum
                <ore:gearSignalum> : [
                    <thermalfoundation:material:293>
                ],

                //gearSteel
                <ore:gearSteel> : [
                    <thermalfoundation:material:288>,
                ],

                //gearStone
                <ore:gearStone> : [
                    <enderio:item_material:10>
                ],

                //gearTin
                <ore:gearTin> : [
                    <thermalfoundation:material:257>
                ],

                //gearTitanium
                <ore:gearTitanium> : [
                ],

                //gearWood
                <ore:gearWood> : [
                    <appliedenergistics2:material:40>,
                    <enderio:item_material:9>,
                    <thermalfoundation:material:22>
                ]
            };
            for oreDictEntry, items in gearsDisabled {
                for i in items {
                    mods.jei.JEI.removeAndHide(i);
                }
                oreDictEntry.removeItems(items);
            }
        // ======== Misc ======== //   
            var miscDisabled as IItemStack[][IOreDictEntry] = {

                //itemSilicon
                <ore:itemSilicon> : [
                    <enderio:item_material:5>,
                    <appliedenergistics2:material:5>,
                    <galacticraftcore:basic_item:2>
                ],

                //fuelCoke
                <ore:fuelCoke> : [
                    <thermalfoundation:material:802>,
                    <immersiveengineering:material:6>
                ],

                //gemRedstone
                <ore:gemRedstone> : [
                    <extrautils2:ingredients>
                ]
            };
            for oreDictEntry, items in miscDisabled {
                for i in items {
                    mods.jei.JEI.removeAndHide(i);
                }
                oreDictEntry.removeItems(items);
            }
    // ======== OreDict Consistency & Custom Tags ======== //
        // Wafer
            <ore:itemSilicon>.add(<metaitem:plateSilicon>);
        // Modularium
            <ore:ingotModularium>.add(<modularmachinery:itemmodularium>);
        // Salis Mundus
            <ore:salismundus>.add(<thaumcraft:salis_mundus>);
        // Ironwood
            <ore:treeSapling>.remove(<extrautils2:ironwood_sapling:1>);
            <ore:treeSapling>.remove(<extrautils2:ironwood_sapling>);
            <ore:ironwood>.add(<extrautils2:ironwood_log>);
            <ore:ironwood>.add(<extrautils2:ironwood_log:1>);
        // Treated Wood
            // FLAGGED <ore:plankTreatedWood>.add(<gregtech:planks:1>);
        // Blank rune
            <ore:runeBlank>.add(<contenttweaker:blankrune>);
            // Tooltip (from Bruberu)
                <contenttweaker:blankrune>.addTooltip(format.aqua("Rune of"));
        // Rock Crystal Ore
            <ore:oreRockCrystal>.add(<astralsorcery:blockcustomore>);
        // Vis Crystals
            <ore:visCrystals>.add(<thaumcraft:crystal_essence>);
        // Botania Petals
            var petals as IItemStack[] = [
                <botania:petal:0>,
                <botania:petal:1>,
                <botania:petal:2>,
                <botania:petal:3>,
                <botania:petal:4>,
                <botania:petal:5>,
                <botania:petal:6>,
                <botania:petal:7>,
                <botania:petal:8>,
                <botania:petal:9>,
                <botania:petal:10>,
                <botania:petal:11>,
                <botania:petal:12>,
                <botania:petal:13>,
                <botania:petal:14>,
                <botania:petal:15>
                ];

            for i in petals {
                <ore:botaniaPetals>.add(i);
            }
        // Skystone 
            <ore:blockSkystone>.add(<appliedenergistics2:sky_stone_block>);
        // Titanium Block to Warp Core
            <ore:blockWarpCoreRim>.add(<metaitem:blockTitanium>);

        // Avaritia
            <ore:ingotCosmicNeutronium>.add(<avaritia:resource:4>);
            <ore:blockCosmicNeutronium>.add(<avaritia:block_resource>);
            <avaritia:resource:4>.displayName = "Cosmic Neutronium Ingot";
            <avaritia:block_resource>.displayName = "Block of Cosmic Neutronium";
        // Certus Quartz
            rh(<appliedenergistics2:material>);
            <ore:crystalChargedQuartz>.add(<appliedenergistics2:material:1>);
        // Hard Glass
            <ore:glassHard>.add(<enderio:block_fused_quartz>);
            <ore:glassHard>.add(<appliedenergistics2:quartz_glass>);
            <ore:glassHard>.add(<appliedenergistics2:quartz_vibrant_glass>);
        // Crafting Tools
            // Saw
                <ore:gtSaw>.addItems([
                    <gregtech:saw>.withEmptyTag()
                ]);
            // Hammer
                <ore:gtHammer>.addItems([
                    <gregtech:hammer>.withEmptyTag()
                ]);
            // Wrench
                <ore:gtWrench>.addItems([
                    <gregtech:wrench>.withEmptyTag()
                ]);
            // File
                <ore:gtFile>.addItems([
                    <gregtech:file>.withEmptyTag()
                ]);
            // Screwdriver
                <ore:gtScrewdriver>.addItems([
                    <gregtech:screwdriver>.withEmptyTag()
                ]);
            // Mortar
                <ore:gtMortar>.addItems([
                    <gregtech:mortar>.withEmptyTag()
                ]);
            // Wirecutter
                <ore:gtWirecutter>.addItems([
                    <gregtech:wire_cutter>.withEmptyTag()
                ]);
            // Knife
                <ore:gtKnife>.addItems([
                    <gregtech:knife>.withEmptyTag()
                ]);
            // Soft Hammer
                <ore:gtSofthammer>.addItems([
                    <gregtech:mallet>.withEmptyTag()
                ]);
        // Shapeless Bandaids
            // Starmetal
                recipes.addShapeless("GGN_starmetalfromgtingot", <astralsorcery:itemcraftingcomponent:1>, [<metaitem:ingotStarmetal>]);
                recipes.addShapeless("GGN_starmetalfromgtdust", <astralsorcery:itemcraftingcomponent:2>, [<metaitem:dustStarmetal>]);
            // Endsteel
                recipes.addShapeless("GGN_endsteelfromgtblock", <enderio:block_alloy:8>, [<metaitem:blockEndSteel>]);
                recipes.addShapeless("GGN_endsteelfromgtingot", <enderio:item_alloy_ingot:8>, [<metaitem:ingotEndSteel>]);  
            // Thaumium
                recipes.addShapeless("GGN_thaumiumfromgtblock", <thaumcraft:metal_thaumium>, [<metaitem:blockThaumium>]);
                recipes.addShapeless("GGN_thaumiumfromgtingot", <thaumcraft:ingot>, [<metaitem:ingotThaumium>]);
            // Energetic
                recipes.addShapeless("GGN_energeticfromgtblock", <enderio:block_alloy:1>, [<metaitem:blockEnergeticAlloy>]);
                recipes.addShapeless("GGN_energeticfromgtingot", <enderio:item_alloy_ingot:1>, [<metaitem:ingotEnergeticAlloy>]);
            // Pulsating Iron
                recipes.addShapeless("GGN_pulsatingfromgtblock", <enderio:block_alloy:5>, [<metaitem:blockPulsatingIron>]);
                recipes.addShapeless("GGN_pulsatingfromgtingot", <enderio:item_alloy_ingot:5>, [<metaitem:ingotPulsatingIron>]);
            // Vibrant
                recipes.addShapeless("GGN_vibrantfromgtblock", <enderio:block_alloy:2>, [<metaitem:blockVibrantAlloy>]);
                recipes.addShapeless("GGN_vibrantfromgtingot", <enderio:item_alloy_ingot:2>, [<metaitem:ingotVibrantAlloy>]);
            // Manasteel
                recipes.addShapeless("GGN_manasteelfromgtblock", <botania:storage>, [<metaitem:blockManasteel>]);
                recipes.addShapeless("GGN_manasteelfromgtingot", <botania:manaresource>, [<metaitem:ingotManasteel>]);
            // Elementium
                recipes.addShapeless("GGN_elementiumfromgtblock", <botania:storage:2>, [<metaitem:blockElementium>]);
                recipes.addShapeless("GGN_elementiumfromgtingot", <botania:manaresource:7>, [<metaitem:ingotElementium>]);
            // Terrasteel
                recipes.addShapeless("GGN_terrasteelfromgtblock", <botania:storage:1>, [<metaitem:blockTerrasteel>]);
                recipes.addShapeless("GGN_terrasteelfromgtingot", <botania:manaresource:4>, [<metaitem:ingotTerrasteel>]);
// ================ OreDict ================ //
