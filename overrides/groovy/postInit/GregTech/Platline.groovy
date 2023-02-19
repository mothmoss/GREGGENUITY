// Imports

// ================ Platline ================ //
    // ======== Fixes ======== //
        // ==== Platinum Pre-Platline ==== //
            // Diodes
                assembler.recipeBuilder()
                .EUt(480).duration(200)
                .inputs(ore("dustGalliumArsenide"), ore("wireFineElectrum") * 16)
                .outputs(metaitem('component.smd.diode') * 16)
                .fluidInputs(fluid("plastic") * 288)
                .buildAndRegister()

// ================ Platline ================ //
