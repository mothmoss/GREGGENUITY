// Imports

// ================ Aluminium ================ //
    // ======== Aluminium & Cryolite ======== //
        // ==== Cryolite Electrolysis ==== //
            // Cryolite (Na3AlF6) 
                // 4 splits into Aluminium Fluoride (AlF3) and 3 Sodium Fluoride (Na3, F3)
                electrolyzer.recipeBuilder()
                    .inputs(dustCryolite * 4)
                    .outputs(dustAluminiumFluoride, dustSodiumFluoride * 3)
                    .EUt(30)
                    .duration(212)
                    .buildAndRegister()
            // 2 Aluminium Fluoride 2(AlF3) + 6 Sodium Hydroxide 6(NaOH) = Alumina (Al2O3) + 6 Sodium Fluoride 6(NaF) + 3000mb Water 3(H2O)
                chemreactor.recipeBuilder()
                    .inputs(dustAluminiumFluoride * 2, dustSodiumHydroxide * 6)
                    .outputs(dustAlumina, dustSodiumFluoride * 6)
                    .fluidOutputs(liquidwater * 3000)
                    .EUt(30)
                    .duration(159)
                    .buildAndRegister()
        // ==== Aluminium ==== //
            // To Alumina
            chembath.recipeBuilder()
                .inputs(dustAluminium * 2)
                .fluidInputs(oxygen * 3000)
                .outputs(dustAlumina)
                .EUt(200)
                .duration(300)
                .buildAndRegister()
            // EBF
                // Durations
                    // Default - 44.2s, boosted 29.6s - 884/592
                    // Replaced - 133.2s, boosted 79.9s - 2664/1598
                    // Alumina - 29.6s, boosted 17.8s - 592/356
                // Removing default recipes
                    mods.gregtech.electric_blast_furnace.removeByInput(120, [metaitem('dustAluminium'), metaitem('circuit.integrated').withNbt(['Configuration': 1])], null)
                    mods.gregtech.electric_blast_furnace.removeByInput(120, [metaitem('dustAluminium'), metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('nitrogen') * 1000 * 1000])
                // Replacing normal recipes
                    ebf.recipeBuilder()
                        .inputs(dustAluminium)
                        .notConsumable(circuit1)
                        .outputs(ingotAluminium)
                        .EUt(120)
                        .duration(2664)
                        .property("temperature", 933)
                        .buildAndRegister()

                    ebf.recipeBuilder()
                        .inputs(dustAluminium)
                        .fluidInputs(nitrogen * 1000)
                        .notConsumable(circuit2)
                        .outputs(ingotAluminium)
                        .EUt(120)
                        .duration(1598)
                        .property("temperature", 933)
                        .buildAndRegister()
                // Alumina + Cryolite
                    ebf.recipeBuilder()
                        .inputs(dustAlumina, dustCryolite)
                        .notConsumable(circuit1)
                        .outputs(ingotAluminium)
                        .EUt(120)
                        .duration(592)
                        .buildAndRegister()
                    ebf.recipeBuilder()
                        .inputs(dustAlumina, dustCryolite)
                        .fluidInputs(nitrogen * 1000)
                        .notConsumable(circuit2)
                        .outputs(ingotAluminium)
                        .EUt(120)
                        .duration(365)
                        .buildAndRegister()
    
// ================ Aluminium ================ //
