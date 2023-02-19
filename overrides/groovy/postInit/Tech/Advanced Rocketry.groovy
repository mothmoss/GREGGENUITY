// Imports

// ================ Advanced Rocketry ================ //
    // ======== Definitions ======== //
        def epoxyplate = metaitem('plateEpoxy')
        def graphiteplate = metaitem('plateGraphite')
        def gepoxyplate = metaitem("plateGraphiteEpoxy") 
        def lunarplate = metaitem("plateLunarAlloy")
        def chromeplate = metaitem('plateChrome')
        def stainlessplate = metaitem("plateStainlessSteel")

        def doublegepoxyplate = metaitem("plateDoubleGraphiteEpoxy") 
        def doublestainlessplate = metaitem("plateDoubleStainlessSteel")
        def doublealuminiumplate = metaitem("plateDoubleAluminium")
        def doubletinplate = metaitem("plateDoubleTin")
        def doublechromeplate = metaitem("plateDoubleChrome")

        def denselunarplate = metaitem('plateDenseLunarAlloy')

        def graphitedust = metaitem('dustGraphite')
        def concretedust = metaitem('dustConcrete')
        def moondust = metaitem('dustMoondust')
        def aluminiumdust = metaitem("dustAluminium")
        def silicondioxidedust = metaitem("dustSiliconDioxide")
        def calciumdust = metaitem("dustCalcium")
        def rutiledust = metaitem("dustRutile")

        def extruderplate = metaitem('shape.extruder.plate')
        def stainlesscell = metaitem('large_fluid_cell.stainless_steel')
        def stainlessframe = metaitem('frameStainlessSteel')
        def stainlesscrate = metaitem('crate.stainless_steel')
        def chromerotor = metaitem('rotorChrome')
        def chromerod = metaitem("stickChrome")
        def diamondexq = metaitem('gemExquisiteDiamond')
        
        def hvcombustionengine = metaitem('combustion_generator.hv')
        def hvpiston = metaitem('electric.piston.hv')
        def hvmotor = metaitem('electric.motor.hv')
        def hvpump = metaitem('electric.pump.hv')
        def hvemitter = metaitem('emitter.hv')
        def hvsensor = metaitem('sensor.hv')
        def hvrobot = metaitem('robot.arm.hv')
        def hvhull = metaitem('hull.hv')
        def mvfield = metaitem('field.generator.mv')
        def hvcircuit = ore("circuitHv")
        def gtscreen = metaitem('cover.screen')

        def solder = fluid("soldering_alloy")
        def water = fluid("water")
        def hydrochloric = fluid("hydrochloric_acid")
        def dilutehydrochloric = fluid("diluted_hydrochloric_acid")
        def liquidmoondust = fluid("moondust")
        def moonliquid = fluid("moonliquid")
        def concrete = fluid("concrete")
        def liquiddyeblack = fluid("dye_black")
        def liquiddyeyellow = fluid("dye_yellow")
        def chlorine = fluid("chlorine")
        def helium = fluid("helium")

        def oxidizertank = item("advancedrocketry:oxidizerfueltank")
        def fueltank = item("advancedrocketry:bipropellantfueltank")

        def rocketengine = item('advancedrocketry:advbipropellantrocketmotor')

        def stainlessgear = ore("gearStainlessSteel")
        def arconcrete = item('advancedrocketry:concrete')

        def stone = ore('stone')
        def tnt = item('minecraft:tnt')
        def blackstone = item('contenttweaker:blackstone')
        def darkcrete = item('contenttweaker:darkcrete')
        def mooncrete = item('contenttweaker:mooncrete')
        def darkbrick = item('contenttweaker:darkbrick')

        def artower = item('advancedrocketry:structuretower')
        def launchpad = item('advancedrocketry:launchpad')
        def guidancecomputer = item('advancedrocketry:guidancecomputer')
        def rocketassemblingmachine = item('advancedrocketry:rocketbuilder')
        def fuelstation = item('advancedrocketry:fuelingstation')
        def chargepad = item('advancedrocketry:oxygencharger')
        def satbay = item('advancedrocketry:loader', 1)
        def rocketstation = item('advancedrocketry:monitoringstation')
        def satstation = item('advancedrocketry:satellitecontrolcenter')
        def stationassemblingmachine = item('advancedrocketry:stationbuilder')
        def warpcontroller = item('advancedrocketry:warpmonitor')
        def warpcore = item('advancedrocketry:warpcore')

        def beacon = item('advancedrocketry:beacon')
        def seat = item('advancedrocketry:seat')

        def moonturf = ore('turfMoon')


    // ======== Rocketships ======== //
        // ==== Components ==== //
            // == Graphite-Epoxy == //
                // Graphite Dust -> Plate
                mods.gregtech.compressor.removeByInput(2, [metaitem('dustGraphite')], null)
                extruder.recipeBuilder()
                    .EUt(80).duration(120)
                    .inputs(graphitedust * 1)
                    .notConsumable(extruderplate * 1)
                    .outputs(graphiteplate * 1)
                    .buildAndRegister()
                // Graphite Plate -> Layered Epoxy
                bender.recipeBuilder()
                    .EUt(80).duration(120)
                    .inputs(graphiteplate * 1, epoxyplate * 1)
                    .outputs(gepoxyplate * 1)
                    .buildAndRegister()
            // == Lunar Alloy == //
                // Assembling
                assembler.recipeBuilder()
                    .EUt(80).duration(120)
                    .inputs(doublealuminiumplate * 1, doublestainlessplate * 1, doublegepoxyplate * 1)
                    .fluidInputs(solder * 288)
                    .outputs(lunarplate * 1)
                    .buildAndRegister()
                
                // Exploding
                implosion.recipeBuilder()
                    .EUt(7).duration(20)
                    .inputs(lunarplate * 9)
                    .explosivesAmount(4)
                    .outputs(denselunarplate)
                    .buildAndRegister()
        // ==== Decorative Blocks ==== //
            // Concrete Stone
            chembath.recipeBuilder()
                .inputs(arconcrete)
                .outputs(item('contenttweaker:concrete'))
                .fluidInputs(water * 100)
                .EUt(7).duration(20)
                .buildAndRegister()
            // Porous Concrete
            crafting.removeByOutput(arconcrete * 16)
            mixer.recipeBuilder()
                .EUt(16).duration(120)
                .inputs(concretedust)
                .fluidInputs(water * 100)
                .fluidInputs(concrete * 144)
                .outputs(arconcrete * 16)
                .buildAndRegister()
            // Mooncrete
            mixer.recipeBuilder()
                .EUt(16).duration(120)
                .inputs(moondust)
                .fluidInputs(water * 100)
                .fluidInputs(concrete * 144)
                .outputs(mooncrete * 16)
                .buildAndRegister()
            // Blackstone
            chembath.recipeBuilder()
                .EUt(7).duration(20)
                .fluidInputs(liquiddyeblack * 9)
                .inputs(stone)
                .outputs(blackstone * 1)
                .buildAndRegister()
            // Darkbrick
            crafting.addShaped("ggn_ar_darkbrick", darkbrick * 4,
            [
                [blackstone, blackstone],
                [blackstone, blackstone]
            ])
        // ==== Bipropellants ==== //
            // == Fuel Tank Recipes == //
                //Oxidizer Tank
                crafting.removeByOutput(oxidizertank)
                assembler.recipeBuilder()
                    .EUt(80).duration(120)
                    .inputs(stainlesscell, gepoxyplate * 6, stainlessframe)
                    .outputs(oxidizertank)
                    .notConsumable(circuit1)
                    .fluidInputs(solder * 576)
                    .buildAndRegister()
                //Propellant Tank
                crafting.removeByOutput(fueltank)
                assembler.recipeBuilder()
                    .EUt(80).duration(120)
                    .inputs(stainlesscell, gepoxyplate * 6, stainlessframe)
                    .outputs(fueltank)
                    .notConsumable(circuit2)
                    .fluidInputs(solder * 576)
                    .buildAndRegister()
            // == Rocket Engine Recipes == //
                crafting.removeByOutput(rocketengine)
                crafting.addShaped("ggn_ar_rocketengine", rocketengine,
                [
                    [hvpiston, hvcircuit, hvpiston],
                    [lunarplate * 1, hvcombustionengine, lunarplate * 1],
                    [stainlessgear, stainlessframe, stainlessgear]
                ])
        // ==== Rocket Assembly ==== //
            // == Structure Tower == //
                crafting.removeByOutput(artower)
                crafting.replaceShaped("ggn_ar_tower", artower,
                [
                    [gtfile],
                    [stainlessframe],
                    [gtsaw]
                ])
            // == Launchpad == //
                crafting.removeByOutput(launchpad)
                mixer.recipeBuilder()
                    .EUt(80).duration(120)
                    .inputs(arconcrete)
                    .fluidInputs(liquiddyeblack * 72, liquiddyeyellow * 72)
                    .outputs(launchpad)
                    .buildAndRegister()
            // == Guidance Computer == //
                crafting.removeByOutput(guidancecomputer)
                crafting.addShaped("ggn_ar_guidancecomputer", guidancecomputer,
                [
                    [hvcircuit, gtscreen, hvcircuit],
                    [hvsensor, hvhull, hvsensor],
                    [doublestainlessplate, doublestainlessplate, doublestainlessplate]
                ])
            // == Rocket Assembling Machine == //
                crafting.removeByOutput(rocketassemblingmachine)
                crafting.addShaped("ggn_ar_rocketbuilder", rocketassemblingmachine,
                [
                    [hvcircuit, hvsensor, hvcircuit],
                    [hvrobot, gtscreen, hvrobot],
                    [doublestainlessplate, hvhull, doublestainlessplate]
                ])
            // == Fueling Station == //
                crafting.removeByOutput(fuelstation)
                crafting.addShaped("ggn_ar_fuelstation", fuelstation,
                [
                    [hvpump, chromerotor, hvpump],
                    [hvmotor, hvhull, hvmotor],
                    [doubletinplate, doubletinplate, doubletinplate]
                ])
            // == Charge Pad == //
                crafting.removeByOutput(chargepad)
                crafting.addShaped("ggn_ar_chargepad", chargepad,
                [
                    [hvpump, doublestainlessplate, hvpump],
                    [doubletinplate, doubletinplate, doubletinplate]
                ])
            // == Satellite Bay == //
                crafting.removeByOutput(satbay)
                crafting.addShaped("ggn_ar_satbay", satbay,
                [
                    [gepoxyplate * 1, null, gepoxyplate * 1],
                    [gepoxyplate * 1, stainlesscrate, gepoxyplate * 1],
                    [gepoxyplate * 1, null, gepoxyplate * 1]
                ])
            // == Rocket Monitoring Station == //
                crafting.removeByOutput(rocketstation)
                crafting.addShaped("ggn_ar_rocketstation", rocketstation,
                [
                    [hvsensor, hvemitter, hvsensor],
                    [doublestainlessplate, hvhull, doublestainlessplate],
                    [arconcrete, arconcrete, arconcrete]
                ])
            // == Satelite Terminal == //
                crafting.removeByOutput(satstation)
                crafting.addShaped("ggn_ar_satstation", satstation,
                [
                    [hvsensor, gtscreen, hvsensor],
                    [chromerod, hvhull, chromerod],
                    [arconcrete, arconcrete, arconcrete]
                ])
            // == Space Station Assembler == //
                crafting.removeByOutput(stationassemblingmachine)
                crafting.addShaped("ggn_ar_stationassembler", stationassemblingmachine,
                [
                    [hvpiston, gtscreen, hvemitter],
                    [hvrobot, hvhull, hvrobot],
                    [doublestainlessplate, doublestainlessplate, doublestainlessplate]
                ])
            // == Warpcore == //
                crafting.removeByOutput(warpcore)
                crafting.addShaped("ggn_ar_warpcore", warpcore,
                [
                    [hvsensor, diamondexq, hvsensor],
                    [mvfield, hvhull, mvfield],
                    [hvemitter, denselunarplate, hvemitter]
                ])
            // == Warp Controller == //
                crafting.removeByOutput(warpcontroller)
                crafting.addShaped("ggn_ar_warpcontroller", warpcontroller,
                [
                    [gtscreen, hvemitter, hvsensor],
                    [lunarplate, hvhull, lunarplate],
                    [stainlessplate, stainlessplate, stainlessplate]
                ])

    // ======== Planetary Resource Processing ======== //
        // ==== Luna ==== //
            // == Moondust == //
                // FLAGGED - MEDIUM PRIORITY
                // Bad Recipes
                // Turf -> Dust 
                macerator.recipeBuilder()
                    .EUt(7).duration(20)
                    .inputs(moonturf * 1)
                    .outputs(moondust * 1)
                    .buildAndRegister()
                // Dust -> Fluid
                mods.gregtech.extractor.removeByInput(30, [metaitem('dustMoondust')], null)
                chemreactor.recipeBuilder()
                    .EUt(80).duration(80).notConsumable(circuit1)
                    .inputs(moondust * 1)
                    .fluidInputs(hydrochloric * 200)
                    .fluidOutputs(liquidmoondust * 100)
                    .buildAndRegister()
                // Fluid -> Resources
                electrolyzer.recipeBuilder()
                    .EUt(200).duration(300)
                    .fluidInputs(liquidmoondust * 1000)
                    .chancedOutput(silicondioxidedust * 1, 2000, 500)
                    .chancedOutput(aluminiumdust * 1, 2000, 500)
                    .chancedOutput(calciumdust * 1, 2000, 500)
                    .chancedOutput(rutiledust * 1, 2000, 500)
                    .fluidOutputs(dilutehydrochloric * 150)
                    .fluidOutputs(helium * 10)
                    .buildAndRegister()
            // == Lunar Residue Fluid == //
                // FLAGGED - MEDIUM PRIORITY
                // Bad Recipes
                // Bad Recipes
                electrolyzer.recipeBuilder()
                    .EUt(80).duration(100)
                    .fluidInputs(moonliquid * 1000)
                    .outputs(moondust * 2)
                    .fluidOutputs(chlorine * 780, helium * 20)
                    .buildAndRegister()


// ================ Advanced Rocketry ================ //
 