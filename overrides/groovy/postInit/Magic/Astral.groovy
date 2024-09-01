// Imports

// ================ Astral ================ //
    // ======== Definitions ======== //
        def astralWandResonating = item('astralsorcery:itemwand')
        def astralMarbleRuned = item("astralsorcery:blockmarble:6")
        def astralLightwell = item('astralsorcery:blockwell')
        def astralRockCrystal = item('astralsorcery:itemrockcrystalsimple')
        def astralRockCrystalOre = item('astralsorcery:blockcustomore')
        def astralCelestialCrystal = item('astralsorcery:itemcelestialcrystal')

        def oreDiamond = ore("oreDiamond")

        def tcNitor = ore("nitor")
        def tcEverfullUrn = item('thaumcraft:everfull_urn')

        def astralAltarLuminous = item('astralsorcery:blockaltar')
        def astralAltarStarlight = item('astralsorcery:blockaltar', 1)
        def astralAltarCelestial = item('astralsorcery:blockaltar', 2)
        def astralAltarIridescent = item('astralsorcery:blockaltar', 3)
        def itemBeacon = item('minecraft:beacon')
        def astralShiftstar = item('astralsorcery:itemshiftingstar')
        def astralLightPowder = item('astralsorcery:itemusabledust')
    // ======== Hiding ======== //
    // ======== Resources & Components ======== //
        // ==== Aquamarine ==== //
            // From Thaumcraft
                // First
                    mods.thaumcraft.crucible.recipeBuilder()
                        .researchKey('CELESTIALSCANNING')
                        .catalyst(lensSapphire)
                        .output(gemAquamarine)
                        .aspect(praecantatio * 20)
                        .aspect(lux * 20)
                        .aspect(tenebrae * 20)
                        .register()   
                // Duplication
                    mods.thaumcraft.crucible.recipeBuilder()
                        .researchKey('CELESTIALSCANNING')
                        .catalyst(gemAquamarine)
                        .output(gemAquamarine * 2)
                        .aspect(praecantatio * 5)
                        .aspect(lux * 5)
                        .aspect(tenebrae * 5)
                        .register()
            // Starlight Duplication
                chembath.recipeBuilder()
                    .EUt(60).duration(600)
                    .notConsumable(gemAquamarine)
                    .fluidInputs(liquidstarlight * 100)
                    .outputs(gemAquamarine)
                    .buildAndRegister()
            // Resonant Wand
                mods.astral.StarlightAltar.removeByOutput(astralWandResonating)
                crafting.addShaped("ggn_as_resonatingwand", astralWandResonating,
                [
                    [null, gemAquamarine, lensDiamond],
                    [null, stickLivingwood, gemAquamarine],
                    [stickLivingwood, null, null]
                ])
        // ==== Runed Marble ==== //
            mods.chisel.carving.removeVariation("marble", astralMarbleRuned)
            crafting.removeByOutput(astralMarbleRuned)
            mods.astral.StarlightAltar.removeByOutput(astralMarbleRuned)
            crafting.addShaped("ggn_as_astralmarble", astralMarbleRuned,
            [
                [wireFineSteel, wireFineSteel, wireFineSteel],
                [gthammer, blockMarble, gtfile],
                [wireFineSteel, wireFineSteel, wireFineSteel]
            ])
            assembler.recipeBuilder()
                .EUt(7).duration(80)
                .inputs(blockMarble, wireFineSteel * 4)
                .outputs(astralMarbleRuned)
                .buildAndRegister()
        // ==== Liquid Starlight ==== //
            // Lightwell
                mods.astral.starlightaltar.removeByOutput(astralLightwell)
                mods.thaumcraft.infusion_crafting.recipeBuilder()
                    .researchKey('CELESTIALSCANNING')
                    .output(astralLightwell) 
                    .mainInput(tcEverfullUrn)
                    .input(astralMarbleRuned)
                    .input(astralMarbleRuned)
                    .input(astralMarbleRuned)
                    .input(astralMarbleRuned)
                    .aspect('lux', 40)
                    .aspect('tenebrae', 40)
                    .instability(2)
                    .register()
            // New Lightwell Recipes
                // Nitor - Slightly better than Aquamarine
                    mods.astralsorcery.lightwell.recipeBuilder()
                        .catalyst(tcNitor.first)
                        .output(liquidstarlight)
                        .productionMultiplier(0.5F)
                        .shatterMultiplier(10F)
                        .register()
                // Concentrated Balance - Unlikely to shatter, low production
                    mods.astralsorcery.lightwell.recipeBuilder()
                        .catalyst(concentratedBalance)
                        .output(liquidstarlight)
                        .productionMultiplier(0.3F)
                        .shatterMultiplier(200)
                        .register()
                // Concentrated Aqua - Likely to shater, high production
                    mods.astralsorcery.lightwell.recipeBuilder()
                        .catalyst(concentratedAqua)
                        .output(liquidstarlight)
                        .productionMultiplier(3F)
                        .shatterMultiplier(4F)
                        .register()

        // ==== Rock Crystal ==== //
            // Ore
                chembath.recipeBuilder()
                    .inputs(oreDiamond)
                    .fluidInputs(liquidstarlight * 8000)
                    .outputs(astralRockCrystalOre)
                    .EUt(60).duration(1000)
                    .buildAndRegister()
            // Perfect Crystal
                chembath.recipeBuilder()
                    .inputs(astralRockCrystal)
                    .fluidInputs(liquidstarlight * 32000)
                    .outputs(astralRockCrystal.withNbt(
                        ['astralsorcery': ['crystalProperties': 
                        ['size': 400, 
                        'purity': 100, 
                        'collectiveCapability': 100, 
                        'fract': 0, 'sizeOverride': -1]]]))
                    .EUt(8000).duration(800)
                    .buildAndRegister()
            // Perfect Celestial Crystal
                chembath.recipeBuilder()
                    .EUt(32000).duration(800)
                    .fluidInputs(liquidstarlight * 48000)
                    .inputs(astralCelestialCrystal)
                    .outputs(astralCelestialCrystal.withNbt(
                        ['astralsorcery': ['crystalProperties': 
                        ['size': 900, 
                        'purity': 100, 
                        'collectiveCapability': 100, 
                        'fract': 0, 'sizeOverride': -1]]]))
                    .buildAndRegister()
    // ======== Astral Progression ======== //
        // ==== Altar Upgrades ==== //
            // Crafting to Luminous
                crafting.removeByOutput(astralAltarLuminous)
                crafting.addShaped("ggn_as_altarluminous", astralAltarLuminous,
                [
                    [plateThaumium, gemAquamarine, plateThaumium],
                    [concentratedAqua, itemCraftingTable, concentratedAqua],
                    [astralMarbleRuned, astralMarbleRuned, astralMarbleRuned]
                ])
            // Luminous to Starlight
                mods.astral.StarlightAltar.removeByOutput(astralAltarStarlight)
                mods.astral.StarlightAltar.discoveryRecipeBuilder()
                    .starlight(1000).craftTime(40).name("ggn_as_starlightupgrade")
                    .output(astralAltarStarlight)
                    .row("SRS")
                    .row("CPC")
                    .row("BBB")
                    .key("S", sensorMv)
                    .key("R", astralRockCrystal)
                    .key("C", circuitMv)
                    .key("P", plateManasteel)
                    .key("B", astralMarbleRuned)
                    .register()
            // Starlight to Celestial
                mods.astral.StarlightAltar.removeByOutput(astralAltarCelestial)
                mods.astral.StarlightAltar.attunementRecipeBuilder()
                    .starlight(2000).craftTime(40).name("ggn_as_celestialupgraderock")
                    .output(astralAltarCelestial)
                    .row('H   H')
                    .row(" SGS ")
                    .row(" CRC ")
                    .row(" PBP ")
                    .row('H   H')
                    .key("H", sensorEv)
                    .key("S", screwAstralStarmetal)
                    .key("G", gemExquisiteAquaInfused)
                    .key("C", circuitEv)
                    .key("R", astralCelestialCrystal)
                    .key("P", plateAstralStarmetal)
                    .key("B", blockAstralStarmetal)
                    .register()
            // Celestial to Iridescent
                mods.astral.StarlightAltar.removeByOutput(astralAltarIridescent)
                mods.astral.StarlightAltar.constellationRecipeBuilder()
                    .starlight(4000).craftTime(40).name("ggn_as_iridescentupgrade")
                    .output(astralAltarIridescent)
                    .row("SB BS")
                    .row("BEGEB")
                    .row(" CRC ")
                    .row("BEGEB")
                    .row("SB BS")
                    .key("S", sensorLuv)
                    .key("B", astralMarbleRuned)
                    .key("E", emitterLuv)
                    .key("G", gemAquamarineResonating)
                    .key("C", circuitLuv)
                    .key("R", astralCelestialCrystal)
                    .register()

    // ======== Astral Tools ======== //
        // ==== Light Powder ==== //
            mods.astral.StarlightAltar.removeByOutput(astralLightPowder)
            mods.astral.StarlightAltar.discoveryRecipeBuilder()
                .starlight(50).craftTime(10).name("ggn_as_lightpowder")
                .output(astralLightPowder * 8)
                .row("DND")
                .row("NGN")
                .row("DND")
                .key("D", dustGlowstone)
                .key("N", tcNitor)
                .key("G", gemAquamarine)
                .register()

        // ==== Beacon ==== // 
            crafting.removeByOutput(itemBeacon)
            mods.astral.StarlightAltar.attunementRecipeBuilder()
                .starlight(400).craftTime(20).name("ggn_as_beacon")
                .output(itemBeacon)
                .row("E   E")
                .row(" PLP ")
                .row(" GNG ")
                .row(" PPP ")
                .row("E   E")
                .key("E", emitterHv)
                .key("P", plateAstralStarmetal)
                .key("L", lensNetherStar)
                .key("G", blockGlassLaminated)
                .key("N", tcNitor.first)
                .register()
        // ==== Shiftstar ==== // 
            mods.astral.StarlightAltar.removeByOutput(astralShiftstar)
// ================ Astral ================ //
