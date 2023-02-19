import mods.jei.JEI.removeAndHide as rh;

// ================ Openglider ================ //
    // ======== Recipes ======== //
        // Hiding Components in favor of EIO Components
            recipes.remove(<openglider:hang_glider_part>);
            recipes.remove(<openglider:hang_glider_part:1>);
            recipes.remove(<openglider:hang_glider_part:2>);
            rh(<openglider:hang_glider_part>);
            rh(<openglider:hang_glider_part:1>);
            rh(<openglider:hang_glider_part:2>);
        // Glider
            recipes.remove(<openglider:hang_glider_basic>);
            recipes.addShaped("GGN_openglider_basic", <openglider:hang_glider_basic>, 
            [
                [<ore:gtScrewdriver>, null, <ore:gtFile>],
                [<ore:screwSteel>, <ore:itemGliderWings>, <ore:screwSteel>],
                [<ore:stickLongIron>, <ore:stickLongIron>, <ore:stickLongIron>],
            ]);
        // Advanced Glider
            recipes.remove(<openglider:hang_glider_advanced>);
            recipes.addShaped("GGN_openglider_advanced", <openglider:hang_glider_advanced>,
            [
                [<ore:gtScrewdriver>, null, <ore:gtFile>],
                [<ore:screwSteel>, <ore:itemGliderWings>, <ore:screwSteel>],
                [<ore:stickLongStainlessSteel>, <ore:stickLongStainlessSteel>, <ore:stickLongStainlessSteel>],
            ]);
// ================ Openglider ================ //
