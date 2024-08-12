// Imports

// ================ Advanced Rocketry ================ //
    // ======== Definitions ======== //
    // ======== Hiding ======== //
        // ==== Hidemap ==== //
            def hidemap = [
                item('advancedrocketry:rollingmachine'),
                item('advancedrocketry:lathe'),
                item('advancedrocketry:crystallizer'),
                item('advancedrocketry:cuttingmachine'),
                item('advancedrocketry:precisionassemblingmachine'),
                item('advancedrocketry:electrolyser'),
                item('advancedrocketry:chemicalreactor'),
                item('advancedrocketry:precisionlaseretcher'),
                item('advancedrocketry:centrifuge'),
                item('advancedrocketry:blackholegenerator'),
                item('advancedrocketry:microwavereciever'),
                item('advancedrocketry:solararray'),

            ]
                    for (entry in hidemap) {
                        mods.jei.ingredient.yeet(entry)
                    }
        // ==== JEI Categories ==== //
            mods.jei.category.hideCategory("zmaster587.AR.rollingMachine")
            mods.jei.category.hideCategory("zmaster587.AR.lathe")
            mods.jei.category.hideCategory("zmaster587.AR.precisionAssembler")
            mods.jei.category.hideCategory("zmaster587.AR.sawMill")
            mods.jei.category.hideCategory("zmaster587.AR.chemicalReactor")
            mods.jei.category.hideCategory("zmaster587.AR.crystallizer")
            mods.jei.category.hideCategory("zmaster587.AR.electrolyzer")
            mods.jei.category.hideCategory("zmaster587.AR.arcFurnace")
            mods.jei.category.hideCategory("zmaster587.AR.platePresser")
            mods.jei.category.hideCategory("zmaster587.AR.centrifuge")
            mods.jei.category.hideCategory("zmaster587.AR.precisionlaseretcher")


// ================ Advanced Rocketry ================ //
