// Imports
import team.chisel.api.carving.CarvingUtils

// ================ AE2 ================ //
    // ======== Definitions ======== //
        //AE2
            def siliconPrinted = item("appliedenergistics2:material", 20)

            def logicPrinted = item("appliedenergistics2:material", 18)
            def logicProcessor = item("appliedenergistics2:material", 22)

            def calculationPrinted = item("appliedenergistics2:material", 16)
            def calculationProcessor = item("appliedenergistics2:material", 23)

            def engineeringPrinted = item("appliedenergistics2:material", 17)
            def engineeringProcessor = item("appliedenergistics2:material", 24)

            def formationCore = item("appliedenergistics2:material", 43)
            def annihilationCore = item("appliedenergistics2:material", 44)

            def itemcomponent1k = item("appliedenergistics2:material", 35)
            def itemcomponent4k = item("appliedenergistics2:material", 36)
            def itemcomponent16k = item("appliedenergistics2:material", 37)
            def itemcomponent64k = item("appliedenergistics2:material", 38)
            def itemcomponent256k = item("aeadditions:storage.component")
            def itemcomponent1024k = item("aeadditions:storage.component", 1)
            def itemcomponent4096k = item("aeadditions:storage.component", 2)
            def itemcomponent16384k = item("aeadditions:storage.component", 3)

            def fluidcomponent1k = item("appliedenergistics2:material", 54)
            def fluidcomponent4k = item("appliedenergistics2:material", 55)
            def fluidcomponent16k = item("appliedenergistics2:material", 56)
            def fluidcomponent64k = item("appliedenergistics2:material", 57)
            def fluidcomponent256k = item("aeadditions:storage.component", 4)
            def fluidcomponent1024k = item("aeadditions:storage.component", 5)
            def fluidcomponent4096k = item("aeadditions:storage.component", 6)
        
            def diffusionCore = item("thaumicenergistics:diffusion_core")
            def coalescenceCore = item("thaumicenergistics:coalescence_core")

            def essentiacomponent1k = item("thaumicenergistics:essentia_component_1k")
            def essentiacomponent4k = item("thaumicenergistics:essentia_component_4k")
            def essentiacomponent16k = item("thaumicenergistics:essentia_component_16k")
            def essentiacomponent64k = item("thaumicenergistics:essentia_component_64k")

            def essentiacell1k = item("thaumicenergistics:essentia_cell_1k")
            def essentiacell4k = item("thaumicenergistics:essentia_cell_4k").withNbt(["filter": []])
            def essentiacell16k = item("thaumicenergistics:essentia_cell_16k").withNbt(["filter": []])
            def essentiacell64k = item("thaumicenergistics:essentia_cell_64k").withNbt(["filter": []])

            def storagecell1k = item("appliedenergistics2:storage_cell_1k")
            def storagecell4k = item("appliedenergistics2:storage_cell_4k")
            def storagecell16k = item("appliedenergistics2:storage_cell_16k")
            def storagecell64k = item("appliedenergistics2:storage_cell_64k")
            def storagecell256k = item("aeadditions:storage.physical")
            def storagecell1024k = item("aeadditions:storage.physical", 1)
            def storagecell4096k = item("aeadditions:storage.physical", 2)
            def storagecell16384k = item("aeadditions:storage.physical", 3)
            def fluidcell1k = item("appliedenergistics2:fluid_storage_cell_1k")
            def fluidcell4k = item("appliedenergistics2:fluid_storage_cell_4k")
            def fluidcell16k = item("appliedenergistics2:fluid_storage_cell_16k")
            def fluidcell64k = item("appliedenergistics2:fluid_storage_cell_64k")
            def fluidcell256k = item("aeadditions:storage.fluid")
            def fluidcell1024k = item("aeadditions:storage.fluid", 1)
            def fluidcell4096k = item("aeadditions:storage.fluid", 2)
            def advancedhousing = item("aeadditions:storage.casing")
            def storagehousing = item("appliedenergistics2:material", 39)

            def brightpanel = item("appliedenergistics2:part", 160)
            def normalpanel = item("appliedenergistics2:part", 180)
            def darkpanel = item("appliedenergistics2:part", 200)

            def storagemonitor = item("appliedenergistics2:part", 400)
            def conversionmonitor = item("appliedenergistics2:part", 420)
            def fluidpatternterminal = item("ae2fc:part_fluid_pattern_terminal")
            def fluidpatternterminalex = item("ae2fc:part_fluid_pattern_ex_terminal")
            def patternterminal = item("appliedenergistics2:part", 340)
            def patternterminalex = item("appliedenergistics2:part", 341)
            def craftingterminal = item("appliedenergistics2:part", 360)
            def defaultterminal = item("appliedenergistics2:part", 380)
            def interfaceterminal = item("appliedenergistics2:part", 480)
            def fluidterminal = item("appliedenergistics2:part", 520)
            def interfaceconfigterminal = item("appliedenergistics2:part", 521)
            def fluidinterfaceconfigterminal = item("appliedenergistics2:part", 522)
            def essentiaterminal = item("thaumicenergistics:essentia_terminal")
            def arcaneterminal = item("thaumicenergistics:arcane_terminal")

            def aepattern = item("appliedenergistics2:material", 52)
            def iteminterface = item("appliedenergistics2:interface")
            def fluidinterface = item("appliedenergistics2:fluid_interface")
            def flatiteminterface = item("appliedenergistics2:part", 440)
            def flatfluidinterface = item("appliedenergistics2:part", 441)
            def computerscreen = metaitem("cover.screen")
            def gtcell = metaitem("fluid_cell")
            def arcaneworkbench = item("thaumcraft:arcane_workbench")
            def wardedjar = item("thaumcraft:jar_normal")
            def medrive = item("appliedenergistics2:drive")
            def medriveflat = item("aeadditions:part.base")
            def medriveobsidian = item("aeadditions:hardmedrive")

            def fluixCable = item("appliedenergistics2:part", 16)
            def fluixCableCovered = item("appliedenergistics2:part", 36)
            def smartCable = item("appliedenergistics2:part", 56)
            def denseCable = item("appliedenergistics2:part", 76)
            def denseCableCovered = item("appliedenergistics2:part", 516)

            def craftingUnitBase = item("appliedenergistics2:crafting_unit")
            def craftingUnitCPU = item("appliedenergistics2:crafting_accelerator")
            def craftingUnit1k = item("appliedenergistics2:crafting_storage_1k")
            def craftingUnit4k = item("appliedenergistics2:crafting_storage_4k")
            def craftingUnit16k = item("appliedenergistics2:crafting_storage_16k")
            def craftingUnit64k = item("appliedenergistics2:crafting_storage_64k")
            def craftingUnit256k = item("extracpus:crafting_storage_256k")
            def craftingUnit1024k = item("extracpus:crafting_storage_1024k")
            def craftingUnit4096k = item("extracpus:crafting_storage_4096k")
            def craftingUnit16384k = item("extracpus:crafting_storage_16384k")

            def storageBus = item("appliedenergistics2:part", 220)
            def storageBusFluid = item("appliedenergistics2:part", 221)
            def storageBusEssentia = item("thaumicenergistics:essentia_storage")
            def storageBusOredict = item("appliedenergistics2:part", 222)
            def itemInterface = item("appliedenergistics2:interface")
            def fluidInterface = item("appliedenergistics2:fluid_interface")
            def itemInterfaceFlat = item("appliedenergistics2:part", 440)
            def fluidInterfaceFlat = item("appliedenergistics2:part", 441)

            def exportBusOredict = item("aeadditions:part.base", 3)
            def exportBusItem = item("appliedenergistics2:part", 260)
            def exportBusFluid = item("appliedenergistics2:part", 261)
            def exportBusEssentia = item("thaumicenergistics:essentia_export")
            def importBusItem = item("appliedenergistics2:part", 240)
            def importBusFluid = item("appliedenergistics2:part", 241)
            def importBusEssentia = item("thaumicenergistics:essentia_import")
            def annihilationPlane = item('appliedenergistics2:part', 300)
            def annihilationPlaneFluid = item('appliedenergistics2:part', 302)
            def annihilationPlaneSilk = item('appliedenergistics2:part', 301)
            def formationPlane = item('appliedenergistics2:part', 320)
            def formationPlaneFluid = item('appliedenergistics2:part', 321)
            def storagehousingfluid = item("aeadditions:storage.casing", 1)

            def chargedQuartzFixture = item('appliedenergistics2:quartz_fixture')
            def lightDetectingFixture = item('appliedenergistics2:light_detector')
            def smoothCertusQuartzBlock = item('appliedenergistics2:quartz_block')
            def smoothCertusQuartzSlab = item('appliedenergistics2:quartz_slab')
            def smoothCertusQuartzStairs = item('appliedenergistics2:quartz_stairs')
            def chiselCertusQuartzBlock = item('appliedenergistics2:chiseled_quartz_block')
            def chiselCertusQuartzSlab = item('appliedenergistics2:chiseled_quartz_slab')
            def chiselCertusQuartzStairs = item('appliedenergistics2:chiseled_quartz_stairs')
            def pillarCertusQuartzBlock = item('appliedenergistics2:quartz_pillar')
            def pillarCertusQuartzSlab = item('appliedenergistics2:quartz_pillar_slab')
            def pillarCertusQuartzStairs = item('appliedenergistics2:quartz_pillar_stairs')
            def smoothFluixBlock = item('appliedenergistics2:fluix_block')
            def smoothFluixStairs = item('appliedenergistics2:fluix_stairs')
            def smoothFluixSlab = item('appliedenergistics2:fluix_slab') 

            def roughSkystoneBlock = item('appliedenergistics2:sky_stone_block')
            def roughSkystoneSlab = item('appliedenergistics2:sky_stone_slab')
            def roughSkystoneStairs = item('appliedenergistics2:sky_stone_stairs')
            def smoothSkystoneBlock = item('appliedenergistics2:smooth_sky_stone_block')
            def smoothSkystoneSlab = item('appliedenergistics2:smooth_sky_stone_slab')
            def smoothSkystoneStairs = item('appliedenergistics2:smooth_sky_stone_stairs')
            def brickSkystoneBlock = item('appliedenergistics2:sky_stone_brick')
            def brickSkystoneSlab = item('appliedenergistics2:sky_stone_brick_slab')
            def brickSkystoneStairs = item('appliedenergistics2:sky_stone_brick_stairs')
            def smallbrickSkystoneBlock = item('appliedenergistics2:sky_stone_small_brick')
            def smallbrickSkystoneSlab = item('appliedenergistics2:sky_stone_small_brick_slab')
            def smallbrickSkystoneStairs = item('appliedenergistics2:sky_stone_small_brick_stairs')
            def quartzKnife = item('appliedenergistics2:certus_quartz_cutting_knife')
            def memorycard = item('appliedenergistics2:memory_card')
            def biocard = item('appliedenergistics2:biometric_card')
            def certuswrench = item('appliedenergistics2:network_tool')

            def basicUpgradeCard = item('appliedenergistics2:material', 25)
            def redstoneUpgradeCard = item('appliedenergistics2:material', 26)
            def capacityUpgradeCard = item('appliedenergistics2:material', 27)
            def magnetUpgradeCard = item('appliedenergistics2:material', 60)
            def craftingUpgradeCard = item('appliedenergistics2:material', 53)

            def advUpgradeCard = item('appliedenergistics2:material', 28)
            def inverterUpgradeCard = item('appliedenergistics2:material', 31)
            def accelUpgradeCard = item('appliedenergistics2:material', 30)
            def fuzzyUpgradeCard = item('appliedenergistics2:material', 29)
            def patternUpgradeCard = item('appliedenergistics2:material', 58)

            def quantumLinkCard = item('appliedenergistics2:material', 59)
            def viewcell = item('appliedenergistics2:view_cell')

            def togglebus = item('appliedenergistics2:part', 80)
            def invertedtogglebus = item('appliedenergistics2:part', 100)
            def levelemitter = item('appliedenergistics2:part', 280)
            def fluidlevelemitter = item('appliedenergistics2:part', 281)

            def p2ptunnel = item('appliedenergistics2:part', 460)

            def wirelessconnector = item('ae2stuff:wireless')
            def quartzglass = item('appliedenergistics2:quartz_glass')
            def vibrantquartzglass = item('appliedenergistics2:quartz_vibrant_glass')
            def wirelessaccesspoint = item('appliedenergistics2:wireless_access_point')
            def securityterminal = item('appliedenergistics2:security_station')
            
            def quantumring = item('appliedenergistics2:quantum_ring')
            def quantumlink = item('appliedenergistics2:quantum_link')
            def mecontroller = item('appliedenergistics2:controller')
            def mechest = item('appliedenergistics2:chest')
            def ioport = item('appliedenergistics2:io_port')
            def cellworkbench = item('appliedenergistics2:cell_workbench')
            def mattercondenser = item('appliedenergistics2:condenser')
            def energyacceptor = item('appliedenergistics2:energy_acceptor')
            def energycell = item('appliedenergistics2:energy_cell')
            def denseenergycell = item('appliedenergistics2:dense_energy_cell')
            def craftingmonitor = item('appliedenergistics2:crafting_monitor')
            def molecularassembler = item('appliedenergistics2:molecular_assembler')
            def fluiddiscretizer = item('ae2fc:fluid_discretizer')

            def fluidpatternencoder = item('ae2fc:fluid_pattern_encoder') //hide
            def fluidpacketdecoder = item('ae2fc:fluid_packet_decoder')
            def ingredientbuffer = item('ae2fc:ingredient_buffer')
            def largeingredientbuffer = item('ae2fc:large_ingredient_buffer')
            def precisionburette = item('ae2fc:burette')
            def fluidlevelmaintainer = item('ae2fc:fluid_level_maintainer')
            def preemptiveassemblyunit = item('threng:machine', 3)
            def levelmaintainer = item('threng:machine', 4)
            def massassemblerframe = item('threng:big_assembler')
            def massassembleramongus = item('threng:big_assembler', 1)

            def quartzfiber = item('appliedenergistics2:part', 140)
            def cableanchor = item('appliedenergistics2:part', 120)

            def wirelessreceiver = item('appliedenergistics2:material', 41)
            
            def aePattern = item('appliedenergistics2:material', 52)
            def eioTesseract = item('enderio:block_transceiver')

        //Misc
            def conversionupgrade = item("storagedrawers:upgrade_conversion")
            def spiderstring = item('minecraft:string')
            def fusedQuartz = ore('fusedQuartz')


    // ======== Hiding ======== //
        def hidemap = [
            item("appliedenergistics2:material", 1), //charged quartz
            item("aeadditions:part.base", 2), //ae additions fluid interface
            fluidcell256k, //TEMPORARY extracells removal
            fluidcell1024k, //TEMPORARY extracells removal
            fluidcell4096k, //TEMPORARY extracells removal
            storagecell256k, //TEMPORARY extracells removal
            storagecell1024k, //TEMPORARY extracells removal
            storagecell4096k, //TEMPORARY extracells removal
            storagecell16384k, //TEMPORARY extracells removal
            itemcomponent256k, //TEMPORARY extracells removal
            itemcomponent1024k, //TEMPORARY extracells removal
            itemcomponent4096k, //TEMPORARY extracells removal
            itemcomponent16384k, //TEMPORARY extracells removal
            fluidcomponent256k, //TEMPORARY extracells removal
            fluidcomponent1024k, //TEMPORARY extracells removal
            fluidcomponent4096k, //TEMPORARY extracells removal
            item("appliedenergistics2:material", 13), //calc press
            item("appliedenergistics2:material", 14), //eng press
            item("appliedenergistics2:material", 15), //log press
            item("appliedenergistics2:material", 21), //name press
            item("appliedenergistics2:crystal_seed"), //certus seeds
            item("appliedenergistics2:crystal_seed", 600), //nether seeds
            item("appliedenergistics2:crystal_seed", 1200), //fluix seeds
            item("appliedenergistics2:certus_quartz_wrench"), //certus wrench
            item('ae2stuff:grower'), //crystal growth chamber
            item('ae2stuff:inscriber'), //advanced inscriber
            item('appliedenergistics2:tiny_tnt'), //tiny tnt
            item('appliedenergistics2:material', 11), //pure nether
            item('appliedenergistics2:material', 10), //pure certus
            item('appliedenergistics2:material', 12), //pure fluix
            item('appliedenergistics2:material', 19), //inscriber sili press
            item('threng:material', 2), //fluix iron
            item('threng:material', 5), //resonating crystal
            item('threng:material', 6), //fluix proc
            item('threng:material', 7), //spec core
            item('threng:material', 14), //spec proc
            item('threng:machine', 2), //circuit etcher
            item('threng:machine', 5), //crystal energizer
            item('ae2stuff:encoder'), //pattern encoder
            item('threng:material', 4), //fluix logic
            item('threng:material', 8), //spec cores
            item('threng:material', 9),
            item('threng:material', 10),
            item('threng:material', 11),
            item('threng:material', 12),
            item('threng:material', 13),
            item('threng:material', 1), //carbon fluix complex
            item('threng:machine'), //fluix ag
            item('threng:machine', 1), //pulse centrifuge
            item('ae2stuff:visualiser'), //ae2 stuff visualizer; worse than ae net vis tool 
            fluidpatternencoder, //fluid pattern encoder; is it really useful anymore?
            patternterminal, //fluid terminal circumvents
            patternterminalex, //fluid terminal ex circumvents
            item('appliedenergistics2:material', 7), //fluix crystal
        ]
                for (entry in hidemap) {
                    mods.jei.ingredient.yeet(entry)
                }
            mods.jei.category.hideCategory("appliedenergistics2.inscriber")

    // ======== Components ======== //
        // ==== Fluix ==== //
            // Dust made from Certus Quartz Dust
            // A little lossy
            mixer.recipeBuilder()
                .inputs(dustCertusQuartz.copy() * 1, dustIron.copy() * 1, dustAluminium)
                .fluidInputs(oxygen * 1000)
                .outputs(dustFluix.copy().copy() * 3)
                .EUt(14)
                .duration(30)
                .buildAndRegister()
            // Crystallizing in the Autoclave
            autoclave.recipeBuilder()
                .EUt(14).duration(80)
                .fluidInputs(liquidender * 72)
                .inputs(dustFluix.copy().copy() * 1)
                .outputs(pearlFluix)
                .buildAndRegister()
        // ==== Fluix Chips ==== //
            // == Wafers == //
                chembath.recipeBuilder()
                    .inputs(waferSilicon)
                    .fluidInputs(liquidfluix * 288)
                    .outputs(waferFluix)
                    .EUt(16)
                    .duration(60)
                    .buildAndRegister()
            // == Engraving == //
                laserengraver.recipeBuilder()
                    .notConsumable(lensFluix)
                    .inputs(waferFluix)
                    .outputs(waferEngravedFluix)
                    .EUt(30)
                    .duration(700)
                    .buildAndRegister()
            // == Cutting into Chips == //
                cutter.recipeBuilder()
                    .inputs(waferEngravedFluix)
                    .outputs(chipFluix * 4)
                    .EUt(30)
                    .duration(1080)
                    .buildAndRegister()
        // ==== Fluix Materials ==== //
            // Fluixsteel (Fluix + Steel + Rose Gold)
            mixer.recipeBuilder()
                .inputs(dustFluix.copy(), dustSteel.copy(), dustRoseGold)
                .outputs(dustFluixSteel.copy() * 3)
                .EUt(14)
                .duration(300)
                .buildAndRegister()
            // Fluminium (Fluix + Steel + Sterling Silver)
            mixer.recipeBuilder()
                .inputs(dustFluix.copy(), dustAluminium.copy(), dustSterlingSilver.copy())
                .outputs(dustFluminium.copy() * 3)
                .EUt(14)
                .duration(300)
                .buildAndRegister()
        // ==== AE2 Circuits ==== //
            // Printed Circuits
                // Silicon Printed
                    press.recipeBuilder()
                        .EUt(7).duration(100)
                        .inputs(plateFluix.copy() * 1, foilSilicon.copy() * 4)
                        .outputs(siliconPrinted.copy() * 1)
                        .buildAndRegister()

                    press.recipeBuilder()
                        .EUt(7).duration(200)
                        .inputs(plateFluix * 1, dustSilicon * 4)
                        .outputs(siliconPrinted)
                        .buildAndRegister()
                // Printed Engineering
                    assembler.recipeBuilder()
                        .EUt(16).duration(300)
                        .inputs(siliconPrinted.copy() * 1, nandChip.copy() * 2, plateDiamond.copy() * 2, screwFluix.copy() * 4, chipFluix)
                        .fluidInputs(liquidredalloy * 288)
                        .outputs(engineeringPrinted)
                        .buildAndRegister()
                // Printed Calculation
                    assembler.recipeBuilder()
                        .EUt(16).duration(300)
                        .inputs(siliconPrinted.copy() * 1, nandChip.copy() * 2, plateCertusQuartz.copy() * 2, screwFluix.copy() * 4, chipFluix)
                        .fluidInputs(liquidredalloy * 288)
                        .outputs(calculationPrinted)
                        .buildAndRegister()
                // Printed Logic
                    assembler.recipeBuilder()
                        .EUt(16).duration(300)
                        .inputs(siliconPrinted.copy() * 1, nandChip.copy() * 2, plateGold.copy() * 2, screwFluix.copy() * 4, chipFluix)
                        .fluidInputs(liquidredalloy * 288)
                        .outputs(logicPrinted)
                        .buildAndRegister()
            // Processors
                // Engineering
                    laserengraver.recipeBuilder()
                        .EUt(30).duration(500)
                        .inputs(engineeringPrinted)
                        .notConsumable(lensFluix)
                        .outputs(engineeringProcessor.copy() * 3)
                        .buildAndRegister()
                // Calculation
                    laserengraver.recipeBuilder()
                        .EUt(32).duration(500)
                        .inputs(calculationPrinted)
                        .notConsumable(lensFluix)
                        .outputs(calculationProcessor.copy() * 3)
                        .buildAndRegister()
                // Logic
                    laserengraver.recipeBuilder()
                        .EUt(32).duration(500)
                        .inputs(logicPrinted)
                        .notConsumable(lensFluix)
                        .outputs(logicProcessor.copy() * 3)
                        .buildAndRegister()
        // ==== Wireless Receiver ==== //
            assembler.recipeBuilder()
                .EUt(30).duration(180)
                .inputs(sensorMv, platePlastic * 4)
                .outputs(wirelessreceiver)
                .fluidInputs(liquidfluix * 720)
                .buildAndRegister()
        // ==== Cores ==== //
            // Annihilation Core
                assembler.recipeBuilder()
                    .EUt(30).duration(100)
                    .inputs(pearlFluix, plateCertusQuartz.copy() * 4, engineeringProcessor.copy() * 1, calculationProcessor.copy() * 1)
                    .fluidInputs(solder * 144)
                    .outputs(annihilationCore.copy() * 2)
                    .buildAndRegister()
            // Formation Core
                assembler.recipeBuilder()
                    .EUt(30).duration(100)
                    .inputs(pearlFluix, plateCertusQuartz.copy() * 4, engineeringProcessor.copy() * 1, logicProcessor.copy() * 1)
                    .fluidInputs(solder * 144)
                    .outputs(formationCore.copy() * 2)
                    .buildAndRegister()
            // Coalescence Core
                mods.thaumcraft.ArcaneWorkbench.removeByOutput(coalescenceCore)
                assembler.recipeBuilder()
                    .EUt(30).duration(100)
                    .inputs(pearlFluix, plateThaumium.copy() * 4, engineeringProcessor.copy() * 1, logicProcessor.copy() * 1)
                    .fluidInputs(solder * 144)
                    .outputs(coalescenceCore.copy() * 2)
                    .buildAndRegister()
            // Diffusion Core
                mods.thaumcraft.ArcaneWorkbench.removeByOutput(diffusionCore)
                assembler.recipeBuilder()
                    .EUt(30).duration(100)
                    .inputs(pearlFluix, plateThaumium.copy() * 4, engineeringProcessor.copy() * 1, calculationProcessor.copy() * 1)
                    .fluidInputs(solder * 144)
                    .outputs(diffusionCore.copy() * 2)
                    .buildAndRegister()
    // ======== Storage Cells ======== //
        // ==== Components to Drives ==== //
            //1k
            canner.recipeBuilder().EUt(7).duration(100).inputs(fluidcomponent1k.copy() * 1, storagehousing.copy() * 1).outputs(fluidcell1k).buildAndRegister()
            canner.recipeBuilder().EUt(7).duration(100).outputs(fluidcomponent1k.copy() * 1, storagehousing.copy() * 1).inputs(fluidcell1k).buildAndRegister()

            canner.recipeBuilder().EUt(7).duration(100).inputs(itemcomponent1k.copy() * 1, storagehousing.copy() * 1).outputs(storagecell1k).buildAndRegister()
            canner.recipeBuilder().EUt(7).duration(100).inputs(storagecell1k.copy() * 1, storagehousing.copy() * 1).outputs(itemcomponent1k).buildAndRegister()
            //4k
            canner.recipeBuilder().EUt(7).duration(100).inputs(fluidcomponent4k.copy() * 1, storagehousing.copy() * 1).outputs(fluidcell4k).buildAndRegister()
            canner.recipeBuilder().EUt(7).duration(100).outputs(fluidcomponent4k.copy() * 1, storagehousing.copy() * 1).inputs(fluidcell4k).buildAndRegister()

            canner.recipeBuilder().EUt(7).duration(100).inputs(itemcomponent4k.copy() * 1, storagehousing.copy() * 1).outputs(storagecell4k).buildAndRegister()
            canner.recipeBuilder().EUt(7).duration(100).inputs(storagecell4k.copy() * 1, storagehousing.copy() * 1).outputs(itemcomponent4k).buildAndRegister()
            //16k
            canner.recipeBuilder().EUt(7).duration(100).inputs(fluidcomponent16k.copy() * 1, storagehousing.copy() * 1).outputs(fluidcell16k).buildAndRegister()
            canner.recipeBuilder().EUt(7).duration(100).outputs(fluidcomponent16k.copy() * 1, storagehousing.copy() * 1).inputs(fluidcell16k).buildAndRegister()

            canner.recipeBuilder().EUt(7).duration(100).inputs(itemcomponent16k.copy() * 1, storagehousing.copy() * 1).outputs(storagecell16k).buildAndRegister()
            canner.recipeBuilder().EUt(7).duration(100).inputs(storagecell16k.copy() * 1, storagehousing.copy() * 1).outputs(itemcomponent16k).buildAndRegister()
            //64k
            canner.recipeBuilder().EUt(7).duration(100).inputs(fluidcomponent64k.copy() * 1, storagehousing.copy() * 1).outputs(fluidcell64k).buildAndRegister()
            canner.recipeBuilder().EUt(7).duration(100).outputs(fluidcomponent64k.copy() * 1, storagehousing.copy() * 1).inputs(fluidcell64k).buildAndRegister()

            canner.recipeBuilder().EUt(7).duration(100).inputs(itemcomponent64k.copy() * 1, storagehousing.copy() * 1).outputs(storagecell64k).buildAndRegister()
            canner.recipeBuilder().EUt(7).duration(100).inputs(storagecell64k.copy() * 1, storagehousing.copy() * 1).outputs(itemcomponent64k).buildAndRegister()
        // ==== Housing ==== //
            //Normal
                crafting.removeByOutput(storagehousing)
                assembler.recipeBuilder()
                    .duration(100).EUt(16)
                    .fluidInputs(solder * 576)
                    .inputs(pearlFluix.copy() * 1, screwFluixSteel.copy() * 4, platePolyethylene.copy() * 4, computerscreen.copy() * 1)
                    .outputs(storagehousing.copy() * 1)
                    .buildAndRegister()
            // Fluid
                crafting.removeByOutput(storagehousingfluid)
                assembler.recipeBuilder()
                    .duration(100).EUt(16)
                    .fluidInputs(solder * 576)
                    .inputs(pearlFluix.copy() * 1, screwFluminium.copy() * 4, platePolyethylene.copy() * 4, computerscreen.copy() * 1)
                    .outputs(storagehousingfluid.copy() * 1)
                    .buildAndRegister()
            // Advanced
                crafting.removeByOutput(advancedhousing)
                assembler.recipeBuilder()
                    .duration(100).EUt(16)
                    .fluidInputs(solder * 576)
                    .inputs(pearlFluix.copy() * 1, screwFlungstensteel.copy() * 4, platePtfe.copy() * 4, computerscreen.copy() * 1)
                    .outputs(advancedhousing.copy() * 1)
                    .buildAndRegister()
        // ==== Item ==== //
            //1k
                crafting.addShaped("ggn_ae_1kcomponent", itemcomponent1k,
                [
                    [plateFluixSteel.copy() * 1, pearlFluix.copy() * 1, plateFluixSteel.copy() * 1],
                    [annihilationCore.copy() * 1, nandChip.copy() * 1, formationCore.copy() * 1],
                    [plateFluixSteel.copy() * 1, gemFluix.copy() * 1, plateFluixSteel.copy() * 1]
                ])
            //4k
                crafting.addShaped("ggn_ae_4kcomponent", itemcomponent4k,
                [
                    [plateFluixSteel, pearlFluix, plateFluixSteel],
                    [itemcomponent1k, circuitLv, itemcomponent1k],
                    [plateFluixSteel, itemcomponent1k, plateFluixSteel]
                ])
            //16k
                crafting.addShaped("ggn_ae_16kcomponent", itemcomponent16k,
                [
                    [plateFluixSteel, pearlFluix, plateFluixSteel],
                    [itemcomponent4k, circuitMv, itemcomponent4k],
                    [plateFluixSteel, itemcomponent4k, plateFluixSteel]
                ])
            //64k
                crafting.addShaped("ggn_ae_64kcomponent", itemcomponent64k,
                [
                    [plateFluixSteel, pearlFluix, plateFluixSteel],
                    [itemcomponent16k, circuitHv, itemcomponent16k],
                    [plateFluixSteel, itemcomponent16k, plateFluixSteel],
                ])
        // ==== Fluid ==== //
            //1k
                crafting.addShaped("ggn_ae_1kcomponentf", fluidcomponent1k,
                [
                    [plateFluminium.copy() * 1, pearlFluix.copy() * 1, plateFluminium.copy() * 1],
                    [annihilationCore.copy() * 1, nandChip.copy() * 1, formationCore.copy() * 1],
                    [plateFluminium.copy() * 1, gemFluix.copy() * 1, plateFluminium.copy() * 1]
                ])
            //4k
                crafting.addShaped("ggn_ae_4kcomponentf", fluidcomponent4k,
                [
                    [plateFluminium, pearlFluix, plateFluminium],
                    [fluidcomponent1k, circuitLv, fluidcomponent1k],
                    [plateFluminium, fluidcomponent1k, plateFluminium]
                ])
            //16k
                crafting.addShaped("ggn_ae_16kcomponentf", fluidcomponent16k,
                [
                    [plateFluminium, pearlFluix, plateFluminium],
                    [fluidcomponent4k, circuitMv, fluidcomponent4k],
                    [plateFluminium, fluidcomponent4k, plateFluminium]
                ])
            //64k
                crafting.addShaped("ggn_ae_64kcomponentf", fluidcomponent64k,
                [
                    [plateFluminium, pearlFluix, plateFluminium],
                    [fluidcomponent16k, circuitHv, fluidcomponent16k],
                    [plateFluminium, fluidcomponent16k, plateFluminium],
                ])
        // ==== Essentia ==== //
            //1k 
                mods.thaumcraft.ArcaneWorkbench.removeByOutput(essentiacomponent1k)
                mods.thaumcraft.ArcaneWorkbench.shapedBuilder()
                    .vis(25)
                    .aspect(aer).aspect(aqua).aspect(ordo).aspect(perditio)
                    .row("POP")
                    .row("DCF")
                    .row("PGP")
                    .key("P", plateThaumium.copy() * 1)
                    .key("O", pearlFluix.copy() * 1)
                    .key("D", diffusionCore.copy() * 1)
                    .key("C", nandChip)
                    .key("F", coalescenceCore.copy() * 1)
                    .key("G", gemFluix.copy() * 1)
                    .output(essentiacomponent1k)
                    .register()
            //4k
                mods.thaumcraft.ArcaneWorkbench.removeByOutput(essentiacomponent4k)
                mods.thaumcraft.ArcaneWorkbench.shapedBuilder()
                    .vis(50)
                    .aspect(aer).aspect(aqua).aspect(ordo).aspect(perditio)
                    .row("PGP")
                    .row("LCL")
                    .row("PLP")
                    .key("P", plateFluix)
                    .key("G", pearlFluix)
                    .key("L", itemcomponent1k)
                    .key("C", circuitLv)
                    .output(essentiacomponent4k)
                    .register()
            //16k
                mods.thaumcraft.ArcaneWorkbench.removeByOutput(essentiacomponent16k)
                mods.thaumcraft.ArcaneWorkbench.shapedBuilder()
                    .vis(100)
                    .aspect(aer).aspect(aqua).aspect(ordo).aspect(perditio)
                    .row("PGP")
                    .row("LCL")
                    .row("PLP")
                    .key("P", plateFluix)
                    .key("G", pearlFluix)
                    .key("L", itemcomponent4k)
                    .key("C", circuitMv)
                    .output(essentiacomponent16k)
                    .register()
            //64k
                mods.thaumcraft.ArcaneWorkbench.removeByOutput(essentiacomponent64k)
                mods.thaumcraft.ArcaneWorkbench.shapedBuilder()
                    .vis(200)
                    .aspect(aer).aspect(aqua).aspect(ordo).aspect(perditio)
                    .row("PGP")
                    .row("LCL")
                    .row("PLP")
                    .key("P", plateFluix)
                    .key("G", pearlFluix)
                    .key("L", itemcomponent16k)
                    .key("C", circuitHv)
                    .output(essentiacomponent64k)
                    .register()
    // ======== System ======== //
        // ==== Terminals & Monitors ==== //
            // Panel
                // Bright
                    assembler.recipeBuilder()
                        .EUt(7).duration(20)
                        .outputs(brightpanel)
                        .inputs(plateAluminium.copy() * 1, plateCertusQuartz.copy() * 1, screwSteel.copy() * 4, computerscreen.copy() * 1)
                        .notConsumable(circuit1)
                        .fluidInputs(liquidfluix * 144)
                        .buildAndRegister()
                // Normal
                    assembler.recipeBuilder()
                        .EUt(7).duration(20)
                        .outputs(normalpanel)
                        .inputs(plateAluminium.copy() * 1, plateCertusQuartz.copy() * 1, screwSteel.copy() * 4, computerscreen.copy() * 1)
                        .notConsumable(circuit2)
                        .fluidInputs(liquidfluix * 144)
                        .buildAndRegister()
                // Dark
                    assembler.recipeBuilder()
                        .EUt(7).duration(20)
                        .outputs(darkpanel)
                        .inputs(plateAluminium.copy() * 1, plateCertusQuartz.copy() * 1, screwSteel.copy() * 4, computerscreen.copy() * 1)
                        .notConsumable(circuit3)
                        .fluidInputs(liquidfluix * 144)
                        .buildAndRegister()
            // Monitors
                // Storage Monitor
                    crafting.addShapeless("ggn_ae_storagemonitor", storagemonitor, [anypanel, anychest])
                // Conversion Monitor
                    crafting.addShapeless("ggn_ae_conversionmonitor", conversionmonitor, [anypanel, conversionupgrade])
            // Terminals
                // Crafting Terminal
                    crafting.addShaped("ggn_ae_patternterminal", craftingterminal,
                    [
                        [screwFluixSteel.copy() * 1, engineeringProcessor.copy() * 1, screwFluixSteel.copy() * 1],
                        [annihilationCore.copy() * 1, anypanel * 1, formationCore.copy() * 1],
                        [screwFluixSteel.copy() * 1, assemblerLv.copy() * 1, screwFluixSteel.copy() * 1]
                    ])    
                // Fluid Pattern Terminal
                    crafting.removeByOutput(fluidpatternterminal)
                    crafting.addShaped("ggn_ae_fluidpatternterminal", fluidpatternterminal,
                    [
                        [screwFluminium.copy() * 1, engineeringProcessor.copy() * 1, screwFluminium.copy() * 1],
                        [annihilationCore.copy() * 1, craftingterminal * 1, formationCore.copy() * 1],
                        [screwFluminium.copy() * 1, aepattern.copy() * 1, screwFluminium.copy() * 1]
                    ])
                // Fluid Pattern Terminal Extended
                    crafting.removeByOutput(fluidpatternterminalex)
                    crafting.addShaped("ggn_ae_fluidpatternterminalex", fluidpatternterminalex,
                    [
                        [screwFlungstensteel.copy() * 1, circuitEv * 1, screwFlungstensteel.copy() * 1],
                        [plateFlungstensteel.copy() * 1, fluidpatternterminal.copy() * 1, plateFlungstensteel.copy() * 1],
                        [screwFlungstensteel.copy() * 1, circuitEv * 1, screwFlungstensteel.copy() * 1]
                    ])
                // Storage Terminal
                    crafting.addShaped("ggn_ae_defaultterminal", defaultterminal,
                    [
                        [screwFluixSteel, engineeringProcessor, screwFluixSteel],
                        [annihilationCore, anypanel, formationCore],
                        [screwFluixSteel, anychest, screwFluixSteel]
                    ])
                // Interface Terminal
                    crafting.addShaped("ggn_ae_interfaceterminal", interfaceterminal,
                    [
                        [screwFluixSteel, engineeringProcessor, screwFluixSteel],
                        [annihilationCore, anypanel, formationCore],
                        [screwFluixSteel, iteminterface, screwFluixSteel]
                    ])
                // Interface Config Terminal
                    crafting.addShapeless("ggn_ae_interfaceconfigterminal", interfaceconfigterminal, [interfaceterminal])
                    crafting.addShapeless("ggn_ae_interfaceterminalconfig", interfaceterminal, [interfaceconfigterminal])
                // Fluid Terminal
                    crafting.addShaped("ggn_ae_fluidterminal", fluidterminal,
                    [
                        [screwFluminium, engineeringProcessor, screwFluminium],
                        [annihilationCore, anypanel, formationCore],
                        [screwFluminium, gtcell, screwFluminium]
                    ])
                // Fluid Interface Config Terminal
                    crafting.addShapeless("ggn_ae_fluidinterfaceconfigterminal", fluidinterfaceconfigterminal, [fluidterminal])
                    crafting.addShapeless("ggn_ae_fluidinterfaceterminalconfig", fluidterminal, [fluidinterfaceconfigterminal])                
                // Essentia Terminal
                    mods.thaumcraft.ArcaneWorkbench.removeByOutput(essentiaterminal)
                    mods.thaumcraft.ArcaneWorkbench.shapedBuilder()
                        .vis(75)
                        .aspect(aer).aspect(aqua).aspect(ordo).aspect(perditio).aspect(terra).aspect(ignis)
                        .row("SPS")
                        .row("DAF")
                        .row("SCS")
                        .key("S", screwThaumium.copy() * 1)
                        .key("P", engineeringProcessor)
                        .key("D", diffusionCore)
                        .key("A", anypanel)
                        .key("F", coalescenceCore)
                        .key("C", wardedjar)
                        .researchKey("ESSENTIATERMINAL")
                        .output(essentiaterminal)
                        .register()
                // Arcane Terminal
                    mods.thaumcraft.ArcaneWorkbench.removeByOutput(arcaneterminal)
                    mods.thaumcraft.ArcaneWorkbench.shapedBuilder()
                        .vis(75)
                        .aspect(aer).aspect(aqua).aspect(ordo).aspect(perditio).aspect(terra).aspect(ignis)
                        .row("SPS")
                        .row("DAF")
                        .row("SCS")
                        .key("S", screwThaumium.copy() * 1)
                        .key("P", engineeringProcessor)
                        .key("D", diffusionCore)
                        .key("A", anypanel)
                        .key("F", coalescenceCore)
                        .key("C", arcaneworkbench)
                        .researchKey("ARCANETERMINAL")
                        .output(arcaneterminal)
                        .register()
        // ==== Storage & Drives ==== //
            // ME Drive
                assembler.recipeBuilder()
                    .EUt(16).duration(100)
                    .inputs(plateFluixSteel.copy() * 4, plateCertusQuartz.copy() * 10, logicProcessor)
                    .outputs(medrive)
                    .fluidInputs(solder * 224)
                    .buildAndRegister()
            // Blast-Resistant ME Drive
                assembler.recipeBuilder()
                    .EUt(16).duration(100)
                    .inputs(plateFluixSteel.copy() * 4, plateDarkSteel.copy() * 3, logicProcessor)
                    .outputs(medriveobsidian)
                    .fluidInputs(solder * 224)
                    .buildAndRegister()
            // Flat ME Drive
                crafting.addShapeless("ggn_ae_medriveflat", medriveflat, [medrive])
                crafting.addShapeless("ggn_ae_flatmedrive", medrive, [medriveflat])
            // ME Chest
                crafting.addShaped("ggn_ae_mechest", mechest,
                [
                    [logicProcessor, gtScreen, logicProcessor],
                    [plateFluixSteel, anychest, plateFluixSteel],
                    [plateSteel, plateSteel, plateSteel]
                ])
            // IO Port
                crafting.addShaped("ggn_ae_ioport", ioport,
                [
                    [null, formationCore, null],
                    [engineeringProcessor, mechest, calculationProcessor],
                    [null, annihilationCore, null]
                ])
            // Cell Workbench
                crafting.addShaped("ggn_ae_cellworkbench", cellworkbench,
                [
                    [logicProcessor, gtScreen, logicProcessor],
                    [plateFluixSteel, itemCraftingTable, plateFluixSteel],
                    [plateSteel, plateSteel, plateSteel]
                ])            
            // Matter Condenser
                crafting.addShaped("ggn_ae_condenser", mattercondenser,
                [
                    [plateDarkSteel, plateFluminium, plateDarkSteel],
                    [annihilationCore, mechest, annihilationCore],
                    [plateDarkSteel, plateFluixSteel, plateDarkSteel]
                ])
            // Energy Acceptor
                crafting.addShaped("ggn_ae_energyacceptor", energyacceptor,
                [
                    [screwFluixSteel, logicProcessor, screwFluixSteel],
                    [plateFluixSteel, energyInputMV, plateFluixSteel],
                    [screwFluixSteel, calculationProcessor, screwFluixSteel]
                ]) 
            // Energy Cell
                assembler.recipeBuilder()
                    .fluidInputs(solder * 288)
                    .inputs(frameStainlessSteel, plateFluixSteel * 6, screwFluixSteel * 24, batteryMvLithium)
                    .outputs(energycell)
                    .EUt(60)
                    .duration(400)
                    .buildAndRegister()

            // Dense Energy Cell
                assembler.recipeBuilder()
                    .fluidInputs(solder * 576)
                    .inputs(energycell * 4, plateFlungstensteel * 6, screwFlungstensteel * 24, batteryEvLapotron)
                    .outputs(denseenergycell)
                    .EUt(600)
                    .duration(800)
                    .buildAndRegister()
        

        // ==== Wires & Cables ==== //
            // Quartz Fiber
                extruder.recipeBuilder()
                    .EUt(42).duration(42)
                    .inputs(plateNetherQuartz)
                    .notConsumable(extrudershapebolt)
                    .outputs(quartzfiber.copy() * 8)
                    .buildAndRegister()
            // Cable Anchor
                extruder.recipeBuilder()
                    .EUt(42).duration(42)
                    .inputs(plateSteel)
                    .notConsumable(extrudershapebolt)
                    .outputs(cableanchor.copy() * 8)
                    .buildAndRegister()
            // Fluix
                // Meant to very loosely simulate Fibre-Optic Cables - fluix wire & fluixsteel cladding
                // Fine Wire
                    extruder.recipeBuilder()
                        .EUt(42).duration(42)
                        .inputs(plateFluix)
                        .notConsumable(extrudershapewire)
                        .outputs(wireFineFluix.copy() * 8)
                        .buildAndRegister()
                // Fluix Cable
                    chembath.recipeBuilder()
                        .EUt(42).duration(42)
                        .fluidInputs(liquidborosilicate * 144)
                        .inputs(wireFineFluix.copy() * 4)
                        .outputs(fluixCable.copy() * 2)
                        .buildAndRegister()
            // Smart Cables
                assembler.recipeBuilder()
                    .EUt(7).duration(100)
                    .inputs(fluixCable.copy() * 1, foilRubber.copy() * 2).outputs(smartCable.copy() * 1)
                    .fluidInputs(liquidfluix * 36)
                    .buildAndRegister()
            // Dense Cable
                assembler.recipeBuilder()
                    .EUt(7).duration(100)
                    .inputs(smartCable.copy() * 1, foilRubber.copy() * 2).outputs(denseCable.copy() * 1)
                    .fluidInputs(liquidfluix * 36)
                    .buildAndRegister() 
            // Shapeless Covered Cables
                crafting.addShapeless("ggn_ae_coveredsmart", fluixCableCovered, [smartCable])
                crafting.addShapeless("ggn_ae_smartcovered", smartCable, [fluixCableCovered])

                crafting.addShapeless("ggn_ae_densecovered", denseCableCovered, [denseCable])
                crafting.addShapeless("ggn_ae_covereddense", denseCable, [denseCableCovered])
        // ==== Crafting & Automation ==== //
            // Crafting Monitor
                craftingmonitor
            // Fluid Discretizer
                fluiddiscretizer
            // Molecular Assembler
                crafting.addShaped("ggn_ae_molecularassembler", molecularassembler,
                [
                    [plateFluixSteel, engineeringProcessor, plateFluixSteel],
                    [robotarmMv, formationCore, robotarmMv],
                    [plateSteel, calculationProcessor, plateSteel]
                ])
            // Crafting Unit
                assembler.recipeBuilder()
                    .EUt(30).duration(200)
                    .fluidInputs(solder * 576)
                    .inputs(platePlastic.copy() * 4, plateFluixSteel.copy() * 4, logicProcessor.copy() * 2, engineeringProcessor.copy() * 2, ramchip.copy() * 8)
                    .outputs(craftingUnitBase)
                    .buildAndRegister()
            // CPU
                assembler.recipeBuilder()
                    .EUt(30).duration(200)
                    .fluidInputs(solder * 576)
                    .inputs(platePlastic.copy() * 4, plateFluixSteel.copy() * 4, logicProcessor.copy() * 2, calculationProcessor.copy() * 2, cpuchip.copy() * 8)
                    .outputs(craftingUnitCPU)
                    .buildAndRegister()
                assembler.recipeBuilder()
                    .EUt(30).duration(200)
                    .fluidInputs(solder * 576)
                    .inputs(platePlastic.copy() * 4, plateFluixSteel.copy() * 4, logicProcessor.copy() * 2, calculationProcessor.copy() * 2, nanocpuchip.copy() * 2)
                    .outputs(craftingUnitCPU)
                    .buildAndRegister()
            // Patterns
                // Polyethylene makes 4
                assembler.recipeBuilder()
                    .inputs(gtScreen, platePolyethylene * 4, logicProcessor, engineeringProcessor)
                    .fluidInputs(solder * 72)
                    .outputs(aePattern * 4)
                    .EUt(7)
                    .duration(140)
                    .buildAndRegister()
                // Polytetrafluoroethylene makes 8
                assembler.recipeBuilder()
                    .inputs(gtScreen, platePTFE * 4, logicProcessor, engineeringProcessor)
                    .fluidInputs(solder * 72)
                    .outputs(aePattern * 8)
                    .EUt(7)
                    .duration(140)
                    .buildAndRegister()
                // Polybenzimidazole makes 16
                assembler.recipeBuilder()
                    .inputs(gtScreen, platePBI * 4, logicProcessor, engineeringProcessor)
                    .fluidInputs(solder * 72)
                    .outputs(aePattern * 16)
                    .EUt(7)
                    .duration(140)
                    .buildAndRegister()

            // Crafting Storage
                crafting.removeByOutput(craftingUnit256k)
                crafting.removeByOutput(craftingUnit1024k)
                crafting.removeByOutput(craftingUnit4096k)
                crafting.removeByOutput(craftingUnit16384k)

                canner.recipeBuilder().EUt(7).duration(200).inputs(craftingUnitBase.copy() * 1, storagecell1k.copy() * 1).outputs(craftingUnit1k.copy() * 1).buildAndRegister()
                canner.recipeBuilder().EUt(7).duration(200).inputs(craftingUnitBase.copy() * 1, storagecell4k.copy() * 1).outputs(craftingUnit4k.copy() * 1).buildAndRegister()
                canner.recipeBuilder().EUt(7).duration(200).inputs(craftingUnitBase.copy() * 1, storagecell16k.copy() * 1).outputs(craftingUnit16k.copy() * 1).buildAndRegister()
                canner.recipeBuilder().EUt(7).duration(200).inputs(craftingUnitBase.copy() * 1, storagecell64k.copy() * 1).outputs(craftingUnit64k.copy() * 1).buildAndRegister()
                canner.recipeBuilder().EUt(7).duration(200).inputs(craftingUnitBase.copy() * 1, storagecell256k.copy() * 1).outputs(craftingUnit256k.copy() * 1).buildAndRegister()
                canner.recipeBuilder().EUt(7).duration(200).inputs(craftingUnitBase.copy() * 1, storagecell1024k.copy() * 1).outputs(craftingUnit1024k.copy() * 1).buildAndRegister()
                canner.recipeBuilder().EUt(7).duration(200).inputs(craftingUnitBase.copy() * 1, storagecell4096k.copy() * 1).outputs(craftingUnit4096k.copy() * 1).buildAndRegister()
                canner.recipeBuilder().EUt(7).duration(200).inputs(craftingUnitBase.copy() * 1, storagecell16384k.copy() * 1).outputs(craftingUnit16384k.copy() * 1).buildAndRegister()

                canner.recipeBuilder().EUt(7).duration(200).outputs(craftingUnitBase.copy() * 1, storagecell1k.copy() * 1).inputs(craftingUnit1k.copy() * 1).buildAndRegister()
                canner.recipeBuilder().EUt(7).duration(200).outputs(craftingUnitBase.copy() * 1, storagecell4k.copy() * 1).inputs(craftingUnit4k.copy() * 1).buildAndRegister()
                canner.recipeBuilder().EUt(7).duration(200).outputs(craftingUnitBase.copy() * 1, storagecell16k.copy() * 1).inputs(craftingUnit16k.copy() * 1).buildAndRegister()
                canner.recipeBuilder().EUt(7).duration(200).outputs(craftingUnitBase.copy() * 1, storagecell64k.copy() * 1).inputs(craftingUnit64k.copy() * 1).buildAndRegister()
                canner.recipeBuilder().EUt(7).duration(200).outputs(craftingUnitBase.copy() * 1, storagecell256k.copy() * 1).inputs(craftingUnit256k.copy() * 1).buildAndRegister()
                canner.recipeBuilder().EUt(7).duration(200).outputs(craftingUnitBase.copy() * 1, storagecell1024k.copy() * 1).inputs(craftingUnit1024k.copy() * 1).buildAndRegister()
                canner.recipeBuilder().EUt(7).duration(200).outputs(craftingUnitBase.copy() * 1, storagecell4096k.copy() * 1).inputs(craftingUnit4096k.copy() * 1).buildAndRegister()
                canner.recipeBuilder().EUt(7).duration(200).outputs(craftingUnitBase.copy() * 1, storagecell16384k.copy() * 1).inputs(craftingUnit16384k.copy() * 1).buildAndRegister()
        // ==== Input & Output ==== //
            // Storage Busses
                // Item
                    assembler.recipeBuilder()
                        .EUt(7).duration(200)
                        .outputs(storageBus.copy() * 1)
                        .inputs(anypanel, logicProcessor.copy() * 1, plateFluixSteel.copy() * 1, screwFluixSteel.copy() * 4)
                        .fluidInputs(liquidfluix * 144)
                        .buildAndRegister()
                // Fluid
                    assembler.recipeBuilder()
                        .EUt(7).duration(200)
                        .outputs(storageBusFluid.copy() * 1)
                        .inputs(anypanel, logicProcessor.copy() * 1, plateFluminium.copy() * 1, screwFluixSteel.copy() * 4)
                        .fluidInputs(liquidfluix * 144)
                        .buildAndRegister()
                // Oredict
                    assembler.recipeBuilder()
                        .EUt(7).duration(200)
                        .outputs(storageBusOredict.copy() * 1)
                        .inputs(storageBus.copy(), logicProcessor.copy() * 1, plateFluixSteel.copy() * 1, screwFluixSteel.copy() * 4)
                        .fluidInputs(liquidfluix * 144)
                        .buildAndRegister()
                // Essentia
                    mods.thaumcraft.ArcaneWorkbench.removeByOutput(storageBusEssentia)
                    assembler.recipeBuilder()
                        .EUt(7).duration(200)
                        .outputs(storageBusEssentia.copy() * 1)
                        .inputs(anypanel, logicProcessor.copy() * 1, plateThaumium.copy() * 1, screwFluixSteel.copy() * 4)
                        .fluidInputs(liquidvis * 1000) 
                        .buildAndRegister()
            // Interfaces
                // Item
                    assembler.recipeBuilder()
                        .EUt(30).duration(200)
                        .inputs(plateFluixSteel.copy() * 8, formationCore.copy() * 1, annihilationCore.copy () * 1)
                        .fluidInputs(liquidplastic * 288)
                        .outputs(itemInterface.copy() * 1)
                        .buildAndRegister()

                    assembler.recipeBuilder()
                        .EUt(30).duration(200)
                        .inputs(plateFluixSteel.copy() * 8, formationCore.copy() * 1, annihilationCore.copy () * 1)
                        .fluidInputs(liquidptfe * 288)
                        .outputs(itemInterface.copy() * 2)
                        .buildAndRegister()

                    assembler.recipeBuilder()
                        .EUt(30).duration(200)
                        .inputs(plateFluixSteel.copy() * 8, formationCore.copy() * 1, annihilationCore.copy () * 1)
                        .fluidInputs(liquidpbi * 288)
                        .outputs(itemInterface.copy() * 4)
                        .buildAndRegister()
                // Fluid
                    crafting.removeByOutput(fluidInterface)
                    assembler.recipeBuilder()
                        .EUt(30).duration(200)
                        .inputs(plateFluminium.copy() * 8, formationCore.copy() * 1, annihilationCore.copy () * 1)
                        .fluidInputs(liquidplastic * 288)
                        .outputs(fluidInterface.copy() * 1)
                        .buildAndRegister()

                    assembler.recipeBuilder()
                        .EUt(30).duration(200)
                        .inputs(plateFluminium.copy() * 8, formationCore.copy() * 1, annihilationCore.copy () * 1)
                        .fluidInputs(liquidptfe * 288)
                        .outputs(fluidInterface.copy() * 2)
                        .buildAndRegister()

                    assembler.recipeBuilder()
                        .EUt(30).duration(200)
                        .inputs(plateFluminium.copy() * 8, formationCore.copy() * 1, annihilationCore.copy () * 1)
                        .fluidInputs(liquidpbi * 288)
                        .outputs(fluidInterface.copy() * 4)
                        .buildAndRegister()
                // Shapeless
                    crafting.addShapeless("ggn_ae_flatfluid", fluidInterface, [fluidInterfaceFlat])
                    crafting.addShapeless("ggn_ae_fluidflat", fluidInterfaceFlat, [fluidInterface])
                    crafting.addShapeless("ggn_ae_itemflat", itemInterfaceFlat, [itemInterface])
                    crafting.addShapeless("ggn_ae_flatitem", itemInterfaceFlat, [itemInterface])
            // Import Bus
                // Item
                    assembler.recipeBuilder()
                        .EUt(30).duration(400)
                        .inputs(plateFluixSteel.copy() * 6, conveyorMv.copy() * 2, annihilationCore.copy() * 2)
                        .fluidInputs(liquidfluix * 576)
                        .outputs(importBusItem)
                        .buildAndRegister()
                // Fluid
                    assembler.recipeBuilder()
                        .EUt(30).duration(400)
                        .inputs(plateFluminium.copy() * 6, pumpMv.copy() * 2, annihilationCore.copy() * 2)
                        .fluidInputs(liquidfluix * 576)
                        .outputs(importBusFluid)
                        .buildAndRegister()
                // Essentia
                    mods.thaumcraft.arcane_workbench.removeByOutput(importBusEssentia)
                    assembler.recipeBuilder()
                        .EUt(30).duration(400)
                        .inputs(plateThaumium.copy() * 6, pumpMv.copy() * 2, coalescenceCore.copy() * 2)
                        .fluidInputs(liquidvis * 576)
                        .outputs(importBusEssentia)
                        .buildAndRegister()
            // Export Bus
                // Item
                    assembler.recipeBuilder()
                        .EUt(30).duration(400)
                        .inputs(plateFluixSteel.copy() * 6, conveyorMv.copy() * 2, formationCore.copy() * 2)
                        .fluidInputs(liquidfluix * 576)
                        .outputs(exportBusItem)
                        .buildAndRegister()
                // Fluid
                    assembler.recipeBuilder()
                        .EUt(30).duration(400)
                        .inputs(plateFluminium.copy() * 6, pumpMv.copy() * 2, formationCore.copy() * 2)
                        .fluidInputs(liquidfluix * 576)
                        .outputs(exportBusFluid)
                        .buildAndRegister()
                // Essentia
                    mods.thaumcraft.arcane_workbench.removeByOutput(exportBusEssentia)
                    assembler.recipeBuilder()
                        .EUt(30).duration(400)
                        .inputs(plateThaumium.copy() * 6, pumpMv.copy() * 2, diffusionCore.copy() * 2)
                        .fluidInputs(liquidvis * 576)
                        .outputs(exportBusEssentia)
                        .buildAndRegister()
            // Annihilation Plane
                // Item
                    assembler.recipeBuilder()
                        .EUt(30).duration(400)
                        .inputs(plateFluixSteel.copy() * 2, importBusItem.copy() * 1, annihilationCore, pearlFluix)
                        .fluidInputs(liquidfluix * 144)
                        .outputs(annihilationPlane)
                        .buildAndRegister()
                    crafting.addShapeless("ggn_ae_silkplane", annihilationPlane, [annihilationPlaneSilk])
                    crafting.addShapeless("ggn_ae_planesilk", annihilationPlaneSilk, [annihilationPlane])
                // Fluid
                    assembler.recipeBuilder()
                        .EUt(30).duration(400)
                        .inputs(plateFluminium.copy() * 2, importBusFluid.copy() * 1, annihilationCore, pearlFluix)
                        .fluidInputs(liquidfluix * 144)
                        .outputs(annihilationPlaneFluid)
                        .buildAndRegister()
            // Formation Plane
                    assembler.recipeBuilder()
                        .EUt(30).duration(400)
                        .inputs(plateFluixSteel.copy() * 2, exportBusItem.copy() * 1, formationCore, pearlFluix)
                        .fluidInputs(liquidfluix * 144)
                        .outputs(formationPlane)
                        .buildAndRegister()
                // Fluid
                    assembler.recipeBuilder()
                        .EUt(30).duration(400)
                        .inputs(plateFluminium.copy() * 2, exportBusFluid.copy() * 1, formationCore, pearlFluix)
                        .fluidInputs(liquidfluix * 144)
                        .outputs(formationPlaneFluid)
                        .buildAndRegister()

            // P2P
                assembler.recipeBuilder()
                    .EUt(128).duration(200)
                    .outputs(p2ptunnel)
                    .inputs(plateDoubleFluixSteel, plateDoubleFluminium, formationCore, annihilationCore, calculationProcessor)
                    .fluidInputs(liquidfluix * 144)
                    .buildAndRegister()
        // ==== Misc Components ==== //
            // Security Terminal
                crafting.addShaped("ggn_ae_securityterm", securityterminal,
                [
                    [plateFluix, computerscreen, plateFluix],
                    [plateSteel, logicProcessor, plateSteel],
                    [plateSteel, plateSteel, plateSteel]
                ])
            // Wireless 
                // Connector
                    crafting.removeByOutput(wirelessconnector)
                    assembler.recipeBuilder()
                        .inputs(plateDoubleFluixSteel.copy() * 8, wirelessreceiver.copy() * 2, calculationProcessor, pearlFluix)
                        .outputs(wirelessconnector.copy() * 2)
                        .EUt(300).duration(400)
                        .fluidInputs(liquidfluix * 1152)
                        .buildAndRegister()
                // Access Point
                    crafting.addShaped("ggn_ae_wirelessaccess", wirelessaccesspoint,
                    [
                        [sensorMv, pearlFluix, sensorMv],
                        [plateFluix, stickFluix, plateFluix],
                        [plateSteel, plateSteel, plateSteel]
                    ])
            // Quantum Link
                // Ring
                    crafting.addShaped("ggn_ae_quantumring", quantumring,
                    [
                        [plateFlungstensteel, plateTitanium, plateFlungstensteel],
                        [sensorEv, pearlFluix, sensorEv],
                        [plateFlungstensteel, plateTitanium, plateFlungstensteel],
                    ])
                // Chamber
                    crafting.addShaped("ggn_ae_quantumchamber", quantumlink,
                    [
                        [plateFlungstensteel, quartzglass, plateFlungstensteel],
                        [sensorEv, eioTesseract, sensorEv],
                        [plateFlungstensteel, quartzglass, plateFlungstensteel],
                    ])
                
            // Level X
                // Emitter
                    // Fluid
                        crafting.addShaped("ggn_ae_fluidemitter", fluidlevelemitter,
                            [
                            [logicProcessor],
                            [stickFluminium]                    
                            ]) 
                    // Item
                        crafting.addShaped("ggn_ae_levelemitter", levelemitter,
                            [
                            [logicProcessor],
                            [stickFluixSteel]                    
                            ]) 
                // Maintainer
                    // Level
                        crafting.removeByOutput(levelmaintainer)
                        crafting.addShaped("ggn_ae_levelmaintainer", levelmaintainer,
                        [
                            [plateFluixSteel, levelemitter, plateFluixSteel],
                            [logicProcessor, craftingUpgradeCard, logicProcessor],
                            [plateFluixSteel, plateFluixSteel, plateFluixSteel]
                        ])
                    // Fluid
                        crafting.removeByOutput(fluidlevelmaintainer)
                        crafting.addShaped("ggn_ae_fluidmaintainer", fluidlevelmaintainer,
                        [
                            [plateFluminium, fluidlevelemitter, plateFluminium],
                            [logicProcessor, craftingUpgradeCard, logicProcessor],
                            [plateFluminium, plateFluminium, plateFluminium]
                        ])
            // Toggle Bus
                // Default
                    crafting.addShapeless("ggn_ae_togglebus", togglebus,
                    [cableanchor, shuttercover])
                // Inverted
                    crafting.addShapeless("ggn_ae_invertbus", invertedtogglebus, [togglebus])
                    crafting.addShapeless("ggn_ae_businvert", togglebus, [invertedtogglebus])

    // ======== Misc AE2 ======== //
        // Vibrant Quartz Glass
            arc.recipeBuilder()
                .fluidInputs(liquidglowstone * 20)
                .inputs(quartzglass)
                .outputs(vibrantquartzglass)
                .duration(20)
                .EUt(32)
                .buildAndRegister()
        // Quartz Glass
            // Certus
                alloy.recipeBuilder()
                    .EUt(30).duration(80)
                    .inputs(fusedQuartz, dustCertusQuartz)
                    .outputs(quartzglass)
                    .buildAndRegister()
            // Nether Quartz
                alloy.recipeBuilder()
                    .EUt(30).duration(80)
                    .inputs(fusedQuartz, dustNetherQuartz)
                    .outputs(quartzglass)
                    .buildAndRegister()
            // Quartzite
                alloy.recipeBuilder()
                    .EUt(30).duration(80)
                    .inputs(fusedQuartz, dustQuartzite)
                    .outputs(quartzglass)
                    .buildAndRegister()              
        // View Cell
            crafting.addShapeless("ggn_ae_viewcell", viewcell.copy() * 1, 
            [storagehousing.copy(), gtscrewdriver])
        // Upgrades
            crafting.addShaped("ggn_ae_upgradebase", basicUpgradeCard,
            [
                [screwFluixSteel, engineeringProcessor, screwFluixSteel],
                [plateFluixSteel, circuitMv, plateFluixSteel],
                [screwFluixSteel, logicProcessor, screwFluixSteel]
            ])

            crafting.addShaped("ggn_ae_advupgradebase", advUpgradeCard,
            [
                [screwFluixSteel, basicUpgradeCard, screwFluixSteel],
                [plateStainlessSteel, circuitEv, plateStainlessSteel],
                [screwFluixSteel, plateStainlessSteel, screwFluixSteel]
            ])
            // Chiselling
                mods.chisel.carving.addGroup("aeupgrades")
                mods.chisel.carving.addGroup("aeadvupgrades")
                // Base Upgrades
                        mods.chisel.carving.addVariation("aeupgrades", basicUpgradeCard)
                        mods.chisel.carving.addVariation("aeupgrades", redstoneUpgradeCard)
                        mods.chisel.carving.addVariation("aeupgrades", capacityUpgradeCard)
                        mods.chisel.carving.addVariation("aeupgrades", magnetUpgradeCard)
                        mods.chisel.carving.addVariation("aeupgrades", craftingUpgradeCard)
                // Advanced Upgrades
                        mods.chisel.carving.addVariation("aeadvupgrades", advUpgradeCard)
                        mods.chisel.carving.addVariation("aeadvupgrades", inverterUpgradeCard)
                        mods.chisel.carving.addVariation("aeadvupgrades", accelUpgradeCard)
                        mods.chisel.carving.addVariation("aeadvupgrades", fuzzyUpgradeCard)
                        mods.chisel.carving.addVariation("aeadvupgrades", patternUpgradeCard)
                        mods.chisel.carving.addVariation("aeupgrades", craftingUpgradeCard)
                        mods.chisel.carving.addVariation("aeupgrades", craftingUpgradeCard)
        // Certus Wrench
            crafting.addShaped("ggn_ae_certuswrench", certuswrench,
            [
                [gemCertusQuartz, spiderstring, gtknife],
                [spiderstring, stickFluix, gtfile]
            ])
        // Memory Card
            assembler.recipeBuilder()
                .EUt(30).duration(100)
                .inputs(plateCertusQuartz.copy() * 1, screwElectrum.copy() * 4, ramchip.copy() * 8, engineeringProcessor.copy() * 1)
                .outputs(memorycard)
                .fluidInputs(liquidfluix * 144)
                .notConsumable(circuit1)
                .buildAndRegister()
        // Bio Card
            assembler.recipeBuilder()
                .EUt(30).duration(100)
                .inputs(plateCertusQuartz.copy() * 1, screwElectrum.copy() * 4, ramchip.copy() * 8, engineeringProcessor.copy() * 1)
                .outputs(biocard)
                .fluidInputs(liquidfluix * 144)
                .notConsumable(circuit2)
                .buildAndRegister()
        // Quartz Knife
            crafting.addShaped("ggn_ae_quartzknife", quartzKnife,
            [
                [gemCertusQuartz, spiderstring, gtknife],
                [spiderstring, stickWood, gtfile]
            ])

        // Decorative Blocks
            // Fixtures
                // Light
                    assembler.recipeBuilder()
                        .EUt(7).duration(100)
                        .inputs(plateSteel.copy() * 1, gemCertusQuartz.copy() * 2)
                        .fluidInputs(liquidglowstone * 288)
                        .notConsumable(circuit2)
                        .outputs(lightDetectingFixture)
                        .buildAndRegister()
                // Charged
                    assembler.recipeBuilder()
                        .EUt(7).duration(100)
                        .inputs(plateSteel.copy() * 1, gemCertusQuartz.copy() * 2)
                        .fluidInputs(liquidglowstone * 288)
                        .notConsumable(circuit1)
                        .outputs(chargedQuartzFixture)
                        .buildAndRegister()       



            // Certus
                // Smooth
                    // Block
                        crafting.addShaped("ggn_ae_certusblocksmooth", smoothCertusQuartzBlock,
                        [
                            [gemCertusQuartz, gemCertusQuartz],
                            [gemCertusQuartz, gemCertusQuartz]
                        ])
                    // Slab
                        crafting.addShaped("ggn_ae_certusslabsmooth", smoothCertusQuartzSlab.copy() * 6,
                        [
                            [smoothCertusQuartzBlock, smoothCertusQuartzBlock, smoothCertusQuartzBlock],
                        ])
                    // Stair
                        crafting.addShaped("ggn_ae_certusstairssmoothleft", smoothCertusQuartzStairs.copy() * 8,
                        [
                            [smoothCertusQuartzBlock, null, null],
                            [smoothCertusQuartzBlock, smoothCertusQuartzBlock, null],
                            [smoothCertusQuartzBlock, smoothCertusQuartzBlock, smoothCertusQuartzBlock]
                        ])
                        crafting.addShaped("ggn_ae_certusstairssmoothright", smoothCertusQuartzStairs.copy() * 8,
                        [
                            [null, null, smoothCertusQuartzBlock],
                            [null, smoothCertusQuartzBlock, smoothCertusQuartzBlock],
                            [smoothCertusQuartzBlock, smoothCertusQuartzBlock, smoothCertusQuartzBlock]
                        ])
                // Smooth -> Chiseled
                    crafting.addShapeless("ggn_ae_smooth2chiselblock", chiselCertusQuartzBlock, [smoothCertusQuartzBlock])
                    crafting.addShapeless("ggn_ae_smooth2chiselslab", chiselCertusQuartzSlab, [smoothCertusQuartzSlab])
                    crafting.addShapeless("ggn_ae_smooth2chiselstairs", chiselCertusQuartzStairs, [smoothCertusQuartzStairs])
                // Chiseled -> Pillar
                    crafting.addShapeless("ggn_ae_chisel2pillarblock", pillarCertusQuartzBlock, [chiselCertusQuartzBlock])
                    crafting.addShapeless("ggn_ae_chisel2pillarslab", pillarCertusQuartzSlab, [chiselCertusQuartzSlab])
                    crafting.addShapeless("ggn_ae_chisel2pillarstairs", pillarCertusQuartzStairs, [chiselCertusQuartzStairs])
                // Pillar -> Smooth
                    crafting.addShapeless("ggn_ae_pillar2smoothblock", smoothCertusQuartzBlock, [pillarCertusQuartzBlock])
                    crafting.addShapeless("ggn_ae_pillar2smoothslab", smoothCertusQuartzSlab, [pillarCertusQuartzSlab])
                    crafting.addShapeless("ggn_ae_pillar2smoothstairs", smoothCertusQuartzStairs, [pillarCertusQuartzStairs])
            // Fluix 
                    // Block
                        crafting.addShaped("ggn_ae_fluixblocksmooth", smoothFluixBlock,
                        [
                            [gemFluix, gemFluix],
                            [gemFluix, gemFluix]
                        ])
                    // Slab
                        crafting.addShaped("ggn_ae_fluixslabsmooth", smoothFluixSlab.copy() * 6,
                        [
                            [smoothFluixBlock, smoothFluixBlock, smoothFluixBlock],
                        ])
                    // Stair
                        crafting.addShaped("ggn_ae_fluixstairssmoothleft", smoothFluixStairs.copy() * 8,
                        [
                            [smoothFluixBlock, null, null],
                            [smoothFluixBlock, smoothFluixBlock, null],
                            [smoothFluixBlock, smoothFluixBlock, smoothFluixBlock]
                        ])
                        crafting.addShaped("ggn_ae_fluixstairssmoothright", smoothFluixStairs.copy() * 8,
                        [
                            [null, null, smoothFluixBlock],
                            [null, smoothFluixBlock, smoothFluixBlock],
                            [smoothFluixBlock, smoothFluixBlock, smoothFluixBlock]
                        ])
            // Skystone
                // Rough
                    // Block
                        laserengraver.recipeBuilder()
                            .EUt(7).duration(20)
                            .inputs(item('gregtech:stone_smooth'))
                            .notConsumable(lensFluix)
                            .outputs(roughSkystoneBlock)
                            .buildAndRegister()
                    // Slab
                        crafting.addShaped("ggn_ae_skystoneslabrough", roughSkystoneSlab.copy() * 6,
                        [
                            [roughSkystoneBlock, roughSkystoneBlock, roughSkystoneBlock],
                        ])
                    // Stair
                        crafting.addShaped("ggn_ae_skystonestairleft", roughSkystoneStairs.copy() * 8,
                        [
                            [roughSkystoneBlock, null, null],
                            [roughSkystoneBlock, roughSkystoneBlock, null],
                            [roughSkystoneBlock, roughSkystoneBlock, roughSkystoneBlock]
                        ])
                        crafting.addShaped("ggn_ae_skystonestairright", roughSkystoneStairs.copy() * 8,
                        [
                            [null, null, roughSkystoneBlock],
                            [null, roughSkystoneBlock, roughSkystoneBlock],
                            [roughSkystoneBlock, roughSkystoneBlock, roughSkystoneBlock]
                        ])
                // Rough -> Smooth
                    crafting.addShapeless("ggn_ae_rough2smoothblockskystone", smoothSkystoneBlock, [roughSkystoneBlock])
                    crafting.addShapeless("ggn_ae_rough2smoothslabskystone", smoothSkystoneSlab, [roughSkystoneSlab])
                    crafting.addShapeless("ggn_ae_rough2smoothstairsskystone", smoothSkystoneStairs, [roughSkystoneStairs])
                // Smooth -> Brick
                    crafting.addShapeless("ggn_ae_smooth2brickblockskystone", brickSkystoneBlock, [smoothSkystoneBlock])
                    crafting.addShapeless("ggn_ae_smooth2brickslabskystone", brickSkystoneSlab, [smoothSkystoneSlab])
                    crafting.addShapeless("ggn_ae_smooth2brickstairsskystone", brickSkystoneStairs, [smoothSkystoneStairs])
                // Brick -> Small Brick
                    crafting.addShapeless("ggn_ae_brick2smallblockskystone", smallbrickSkystoneBlock, [brickSkystoneBlock])
                    crafting.addShapeless("ggn_ae_brick2smallslabskystone", smallbrickSkystoneSlab, [brickSkystoneSlab])
                    crafting.addShapeless("ggn_ae_brick2smallstairsskystone", smallbrickSkystoneStairs, [brickSkystoneStairs])
                // Small Brick -> Rough
                    crafting.addShapeless("ggn_ae_small2roughblockskystone", roughSkystoneBlock, [smallbrickSkystoneBlock])
                    crafting.addShapeless("ggn_ae_small2roughslabskystone", roughSkystoneSlab, [smallbrickSkystoneSlab])
                    crafting.addShapeless("ggn_ae_small2roughstairsskystone", roughSkystoneStairs, [smallbrickSkystoneStairs])




// ================ AE2 ================ //
