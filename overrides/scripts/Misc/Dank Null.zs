import mods.jei.JEI.removeAndHide as rh;

// ================ Dank Null ================ //
    // ======== Hiding ======== //
        rh(<danknull:dank_null_0>);
        rh(<danknull:dank_null_1>);
        rh(<danknull:dank_null_2>);
        recipes.remove(<danknull:dank_null_0>);
        recipes.remove(<danknull:dank_null_1>);
        recipes.remove(<danknull:dank_null_2>);
        recipes.remove(<danknull:dank_null_panel_0>);
        recipes.remove(<danknull:dank_null_panel_1>);
        recipes.remove(<danknull:dank_null_panel_2>);
        recipes.remove(<danknull:dank_null_panel_3>);
        recipes.remove(<danknull:dank_null_panel_4>);
        recipes.remove(<danknull:dank_null_panel_5>);
        rh(<danknull:dank_null_panel_0>);
        rh(<danknull:dank_null_panel_1>);
        rh(<danknull:dank_null_panel_2>);
        rh(<danknull:dank_null_panel_3>);
        rh(<danknull:dank_null_panel_4>);
        rh(<danknull:dank_null_panel_5>);
    // ======== New Recipes ======== //
        // ==== Dank Null (LV) ==== //
            recipes.remove(<danknull:dank_null_3>);
            assembler.recipeBuilder()
            .inputs(<ore:plateDoubleGold> * 8, <gregtech:transparent_casing>, <metaitem:field.generator.lv>)
            .outputs(<danknull:dank_null_3>)
            .EUt(32)
            .duration(100)
            .buildAndRegister();
        // ==== Dank Null (HV) ==== //
            recipes.remove(<danknull:dank_null_4>);
            assembler.recipeBuilder()
            .inputs(<ore:plateDoubleBlueSteel> * 8, <danknull:dank_null_3>, <metaitem:field.generator.hv>)
            .outputs(<danknull:dank_null_4>)
            .EUt(512)
            .duration(100)
            .buildAndRegister();
        // ==== Dank Null (IV) ==== //
            recipes.remove(<danknull:dank_null_5>);
            assembler.recipeBuilder()
            .inputs(<ore:plateDoubleVibrantAlloy> * 8, <danknull:dank_null_4>, <metaitem:field.generator.iv>)
            .outputs(<danknull:dank_null_5>)
            .EUt(8192)
            .duration(100)
            .buildAndRegister();
// ================ Dank Null ================ //
 