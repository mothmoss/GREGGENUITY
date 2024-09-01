// Imports

// ================ Botania ================ //
    // ======== Definitions ======== //
        // Flowers
            def flowerPureDaisy = item('botania:specialflower').withNbt(['type': 'puredaisy'])
            
            def itemSunflower = item('minecraft:double_plant')
        // Petals
            def petalWhite = ore("petalWhite")
            def petalOrange = ore("petalOrange")
            def petalMagenta = ore("petalMagenta")
            def petalLightBlue = ore("petalLightBlue")
            def petalYellow = ore("petalYellow")
            def petalLime = ore("petalLime")
            def petalPink = ore("petalPink")
            def petalGray = ore("petalGray")
            def petalLightGray = ore("petalLightGray")
            def petalCyan = ore("petalCyan")
            def petalPurple = ore("petalPurple")
            def petalBlue = ore("petalBlue")
            def petalBrown = ore("petalBrown")
            def petalGreen = ore("petalGreen")
            def petalRed = ore("petalRed")
            def petalBlack = ore("petalBlack")
    // ======== Hiding ======== //
        // ==== Hiding ==== //
            def botaniaHide = [
                item('botania:floatingspecialflower').withNbt(['type': 'orechidIgnem']),
                item('botania:floatingspecialflower').withNbt(['type': 'orechid']),
                item('botania:floatingspecialflower').withNbt(['type': 'endoflame']),
            ]
                for (entry in botaniaHide) {
                    mods.jei.ingredient.yeet(entry)
                }
        // ==== Removing Flowers ==== //
            def flowerRemove = [
                item('botania:specialflower').withNbt(['type': 'orechidIgnem']),
                item('botania:specialflower').withNbt(['type': 'orechid']),
                item('botania:specialflower').withNbt(['type': 'endoflame']),
            ]
                for (entry in flowerRemove) {
                    mods.botania.Apothecary.removeByOutput(entry)
                    mods.jei.ingredient.yeet(entry)
                }
                mods.jei.category.hideCategory("botania.orechid")
                mods.jei.category.hideCategory("botania.orechid_ignem")

    // ======== Flowers ======== //
        // ==== Pure Daisy ==== //
            mods.botania.Apothecary.removeByOutput(flowerPureDaisy)
            mods.botania.Apothecary.recipeBuilder()
                .input(itemSunflower, dustSalisMundus, petalWhite, petalWhite, petalWhite, petalWhite)
                .output(flowerPureDaisy)
                .register()
    // ======== Resources ======== //
        // ==== Purification ==== //
            mods.botania.PureDaisy.removeAll()
            // Livingstone
            mods.botania.PureDaisy.recipeBuilder()
                .input(ore("blockConcrete"))
                .output(blockstate('botania:livingrock'))
                .time(150)
                .register()
            // Livingwood
            mods.botania.PureDaisy.recipeBuilder()
                .input(ore("logFerrous"))
                .output(blockstate('botania:livingwood'))
                .time(150)
                .register()
        // ==== Mana Processing ==== //
            // thanks to ursamina for inspiration for like 90% of this
            // Magic Acid
                // Fluorosulfuric Acid
                    chemreactor.recipeBuilder()
                        .EUt(16).duration(400)
                        .fluidInputs(sulfurtrioxide * 1000, hydrofluoric * 1000)
                        .fluidOutputs(fluorosulfuric * 2000)
                        .buildAndRegister()
                // Pentafluoride
                    chemreactor.recipeBuilder()
                        .EUt(30).duration(130)
                        .inputs(dustAntimonyTrifluoride)
                        .fluidInputs(fluorine * 2000)
                        .outputs(dustAntimonyPentafluoride)
                        .buildAndRegister()
                // Fluorosulfuric + Pentafluoride 
                    chemreactor.recipeBuilder()
                        .EUt(30).duration(280)
                        .inputs(dustAntimonyPentafluoride)
                        .fluidInputs(fluorosulfuric * 1000)
                        .fluidOutputs(magicacid * 2000)
                        .buildAndRegister()
            // Resplendic Acid
                def resplendicMap = [
                    [metaitem('crushedAerInfused')]: [metaitem('crushedPurifiedAerInfused')], 
                    [metaitem('crushedAquaInfused')]: [metaitem('crushedPurifiedAquaInfused')],
                    [metaitem('crushedPerditioInfused')]: [metaitem('crushedPurifiedPerditioInfused')],
                    [metaitem('crushedIgnisInfused')]: [metaitem('crushedPurifiedIgnisInfused')],
                    [metaitem('crushedOrdoInfused')]: [metaitem('crushedPurifiedOrdoInfused')],
                    [metaitem('crushedTerraInfused')]: [metaitem('crushedPurifiedTerraInfused')],
                ]
                    for (entry in resplendicMap) {
                        chembath.recipeBuilder()
                            .inputs(entry.key)
                            .fluidInputs(magicacid * 1000)
                            .outputs(entry.value)
                            .fluidOutputs(resplendicacid * 1000)
                            .EUt(60).duration(150)
                            .buildAndRegister()
                    }
                    centrifuge.recipeBuilder()
                            .EUt(60).duration(900)
                            .fluidInputs(resplendicacid * 2000)
                            .outputs(dustResplendite)
                            .fluidOutputs(magicacid * 100)
                            .buildAndRegister()
            // Mana Sludge
                // Creating Sludge
                    mixer.recipeBuilder()
                        .inputs(dustAer, dustAqua, dustOrdo, dustPerditio, dustIgnis, dustTerra)
                        .fluidInputs(resplendicacid * 6000)
                        .fluidOutputs(manasludge * 12000)
                        .EUt(60)
                        .duration(790)
                        .buildAndRegister()
                // Separating Sludge
                    centrifuge.recipeBuilder()
                        .EUt(120).duration(1000)
                        .fluidInputs(manasludge * 2000)
                        .outputs(dustFluxSludge)
                        .fluidOutputs(manaunrefined * 1000)
                        .buildAndRegister()
                // Separating Fluxsludge
                    sifter.recipeBuilder()
                        .EUt(30).duration(300)
                        .inputs(dustFluxSludge)
                        .outputs(dustTitantheum)
                        .chancedOutput(crystalPraecantatio * 4, 1000, 500)
                        .chancedOutput(crystalVitium * 4, 1000, 500)
                        .chancedOutput(crystalAlienis * 4, 1000, 500)
                        .buildAndRegister()
            // Concentrating Mana
                distillery.recipeBuilder()
                    .EUt(400).duration(160)
                    .inputs(dustResplendite)
                    .fluidInputs(manaunrefined * 144)
                    .fluidOutputs(manaconcentrated * 260)
                    .buildAndRegister()


   


            // Dusts -> 

        // ==== Runes ==== //
            // Blank Runes from Livingrock

// ================ Botania ================ //
