import mods.jei.JEI.removeAndHide as rh;
import crafttweaker.item.IItemStack;
import crafttweaker.item.IItemDefinition;
import crafttweaker.item.IIngredient;
import crafttweaker.oredict.IOreDict;
import crafttweaker.oredict.IOreDictEntry;
import mods.gregtech.recipe.RecipeMaps;
import mods.gregtech.recipe.RecipeMap;

// ================ HV ================ //
    // ======== Variables ======== //
        val frostCasing = <gregtech:metal_casing:3>;
        val pistonHV = <metaitem:electric.piston.hv>;
        val circuitEV = <ore:circuitEv>;
        val fluidregHV = <metaitem:fluid.regulator.hv>;
    // ======== Fluid Compressor ======== //
        // ==== Controller ==== //
            recipes.addShaped("GGN_fluid_compressor", <metaitem:mbt:fluidcompressor>,
            [
                [pistonHV, pistonHV, pistonHV],
                [frostCasing, circuitEV, frostCasing],
                [fluidregHV, fluidregHV, fluidregHV]
            ]);
        // ==== Compressed Air ==== //
            fcompressor.recipeBuilder()
            .EUt(128)
            .duration(40)
            .fluidInputs(<liquid:air> * 1000)
            .fluidOutputs(<liquid:compressed_air> * 1000)
            .buildAndRegister();
        // ==== Air Centrifuging ==== //
            // Regular air
            // Made 25% slower to incentivize Compressed Air
                centrifuge.findRecipe(7, null, [<liquid:air> * 10000]).remove();
                centrifuge.recipeBuilder().EUt(7).duration(2000)
                .fluidInputs(<liquid:air> * 10000)
                .fluidOutputs(<liquid:nitrogen> * 3900, <liquid:oxygen> * 1000)
                .buildAndRegister();
            // Compressed air
            // Made 25% faster to further incentivize Compressed Air
                centrifuge.recipeBuilder().EUt(7).duration(1080)
                .fluidInputs(<liquid:compressed_air> * 10000)
                .fluidOutputs(<liquid:nitrogen> * 3900, <liquid:oxygen> * 1000)
                .buildAndRegister();
        // ==== Math ==== //
            // AT MV: Centrifuging Air (normally)
            // 97.5mb nitrogen/s, 25mb oxygen/s 
            // AT MV: Centrifuging Air (nerfed)
            // 78mb nitrogen/s, 20mb oxygen/s
            // AT MV: Centrifuging Compressed Air (accounts for compression time)
            // 139 nitrogen/s, 35mb oxygen/s
            // ==== //
            // Centrifuging Air is 25% slower than normal
            // Centrifuging Compressed Air is 42% faster than normal
        // ==== Liquid Air ==== //
            <recipemap:vacuum_freezer>.findRecipe(480, null, [<liquid:air> * 4000]).remove();
            freezer.recipeBuilder()
            .EUt(480)
            .duration(200)
            .fluidInputs(<liquid:compressed_air> * 10000)
            .fluidOutputs(<liquid:liquid_air> * 10000)
            .buildAndRegister();

            <recipemap:distillation_tower>.findRecipe(480, null, [<liquid:liquid_air> * 50000]).remove();
            <recipemap:vacuum_freezer>.findRecipe(1920, null, [<liquid:helium> * 1000]).remove();
            <recipemap:vacuum_freezer>.findRecipe(1920, null, [<liquid:oxygen> * 1000]).remove();

            distillation.recipeBuilder()
            .EUt(1024)
            .duration(2000)
            .fluidInputs(<liquid:liquid_air> * 100000)
            .fluidOutputs(
                <liquid:liquid_nitrogen> * 70000,
                <liquid:liquid_oxygen> * 22000,
                <liquid:carbon_dioxide> * 5000,
                <liquid:liquid_helium> * 2000,
                <liquid:argon> * 1000)
            .buildAndRegister();
        // ==== Heating Liquids ==== //
            // Oxygen 
                heater.recipeBuilder()
                .fluidInputs(<liquid:liquid_oxygen> * 1000)
                .fluidOutputs(<liquid:oxygen> * 1000)
                .EUt(30)
                .duration(25)
                .circuit(1)
                .buildAndRegister();
            // Nitrogen
                heater.recipeBuilder()
                .fluidInputs(<liquid:liquid_nitrogen> * 1000)
                .fluidOutputs(<liquid:nitrogen> * 1000)
                .EUt(30)
                .duration(25)
                .circuit(1)
                .buildAndRegister();
            // Helium
                heater.recipeBuilder()
                .fluidInputs(<liquid:liquid_helium> * 1000)
                .fluidOutputs(<liquid:helium> * 1000)
                .EUt(30)
                .duration(25)
                .circuit(1)
                .buildAndRegister();
            // Oxygen 
                centrifuge.recipeBuilder()
                .fluidInputs(<liquid:liquid_oxygen> * 1000)
                .fluidOutputs(<liquid:oxygen> * 1000)
                .EUt(30)
                .duration(25)
                .buildAndRegister();
            // Nitrogen
                centrifuge.recipeBuilder()
                .fluidInputs(<liquid:liquid_nitrogen> * 1000)
                .fluidOutputs(<liquid:nitrogen> * 1000)
                .EUt(30)
                .duration(25)
                .buildAndRegister();
            // Helium
                centrifuge.recipeBuilder()
                .fluidInputs(<liquid:liquid_helium> * 1000)
                .fluidOutputs(<liquid:helium> * 1000)
                .EUt(30)
                .duration(25)
                .buildAndRegister();
    // ======== Vacuum Freezing ======== //   
        // ==== Removing Entirely ==== //
            <recipemap:vacuum_freezer>.findRecipe(120, [<metaitem:ingotHotMaragingSteel300>], null).remove();
            <recipemap:vacuum_freezer>.findRecipe(120, [<metaitem:ingotHotZeron100>], null).remove();
            <recipemap:vacuum_freezer>.findRecipe(120, [<metaitem:ingotHotWatertightSteel>], null).remove();
            <recipemap:vacuum_freezer>.findRecipe(120, [<metaitem:ingotHotIncoloyMa956>], null).remove();
            <recipemap:vacuum_freezer>.findRecipe(120, [<metaitem:ingotHotMagnesiumDiboride>], null).remove();
            <recipemap:vacuum_freezer>.findRecipe(120, [<metaitem:ingotHotMolybdenumDisilicide>], null).remove();
            <recipemap:vacuum_freezer>.findRecipe(120, [<metaitem:ingotHotStellite100>], null).remove();
            <recipemap:vacuum_freezer>.findRecipe(120, [<metaitem:ingotHotHastelloyX>], null).remove();
        // ==== Replacing ==== //
            // Nitrogen
                <recipemap:vacuum_freezer>.findRecipe(120, [<metaitem:ingotHotKanthal>], null).remove();
                <recipemap:vacuum_freezer>.findRecipe(120, [<metaitem:ingotHotTitanium>], null).remove();
                <recipemap:vacuum_freezer>.findRecipe(120, [<metaitem:ingotHotYttriumBariumCuprate>], null).remove();
                <recipemap:vacuum_freezer>.findRecipe(120, [<metaitem:ingotHotTitaniumTungstenCarbide>], null).remove();
                <recipemap:vacuum_freezer>.findRecipe(120, [<metaitem:ingotHotNiobiumNitride>], null).remove();
                <recipemap:vacuum_freezer>.findRecipe(120, [<metaitem:ingotHotMercuryBariumCalciumCuprate>], null).remove();
                <recipemap:vacuum_freezer>.findRecipe(120, [<metaitem:ingotHotIndiumTinBariumTitaniumCuprate>], [<liquid:liquid_helium> * 500]).remove();
                <recipemap:vacuum_freezer>.findRecipe(120, [<metaitem:ingotHotVanadiumGallium>], null).remove();
                <recipemap:vacuum_freezer>.findRecipe(120, [<metaitem:ingotHotNichrome>], null).remove();
                <recipemap:vacuum_freezer>.findRecipe(120, [<metaitem:ingotHotUltimet>], null).remove();
                <recipemap:vacuum_freezer>.findRecipe(120, [<metaitem:ingotHotHastelloyC276>], null).remove();
                <recipemap:vacuum_freezer>.findRecipe(120, [<metaitem:ingotHotNiobiumTitanium>], null).remove();
                <recipemap:vacuum_freezer>.findRecipe(120, [<metaitem:ingotHotYttrium>], null).remove();
                <recipemap:vacuum_freezer>.findRecipe(120, [<metaitem:ingotHotNiobium>], null).remove();
                <recipemap:vacuum_freezer>.findRecipe(120, [<metaitem:ingotHotTantalumCarbide>], null).remove();
                <recipemap:vacuum_freezer>.findRecipe(120, [<metaitem:ingotHotTungstenCarbide>], null).remove();
                <recipemap:vacuum_freezer>.findRecipe(120, [<metaitem:ingotHotBlackBronze>], null).remove();
                <recipemap:vacuum_freezer>.findRecipe(120, [<metaitem:ingotHotHssg>], null).remove();
                <recipemap:vacuum_freezer>.findRecipe(120, [<metaitem:ingotHotRuthenium>], null).remove();
                <recipemap:vacuum_freezer>.findRecipe(120, [<metaitem:ingotHotRhodium>], null).remove();
                <recipemap:vacuum_freezer>.findRecipe(120, [<metaitem:ingotHotRhodiumPlatedPalladium>], null).remove();
                <recipemap:vacuum_freezer>.findRecipe(120, [<metaitem:ingotHotPalladium>], null).remove();
                <recipemap:vacuum_freezer>.findRecipe(120, [<metaitem:ingotHotTungstenSteel>], null).remove();
                <recipemap:vacuum_freezer>.findRecipe(120, [<metaitem:ingotHotRuridit>], null).remove();
                <recipemap:vacuum_freezer>.findRecipe(120, [<metaitem:ingotHotTungsten>], null).remove();
                //<recipemap:vacuum_freezer>.findRecipe(120, [<metaitem:ingotHotVibrantAlloy>], null).remove();


                var freezerMapNitro as IItemStack[IItemStack] = {
                    <ore:ingotHotKanthal>.firstItem : <ore:ingotKanthal>.firstItem,
                    <ore:ingotHotTitanium>.firstItem : <ore:ingotTitanium>.firstItem,
                    <ore:ingotHotVanadium>.firstItem : <ore:ingotVanadium>.firstItem,
                    <ore:ingotHotYttriumBariumCuprate>.firstItem : <ore:ingotYttriumBariumCuprate>.firstItem,
                    <ore:ingotHotNiobiumNitride>.firstItem : <ore:ingotNiobiumNitride>.firstItem,
                    <ore:ingotHotMercuryBariumCalciumCuprate>.firstItem : <ore:ingotMercuryBariumCalciumCuprate>.firstItem,
                    <ore:ingotHotIndiumTinBariumTitaniumCuprate>.firstItem : <ore:ingotIndiumTinBariumTitaniumCuprate>.firstItem,
                    <ore:ingotHotVanadiumGallium>.firstItem : <ore:ingotVanadiumGallium>.firstItem,
                    <ore:ingotHotNichrome>.firstItem : <ore:ingotNichrome>.firstItem,
                    <ore:ingotHotUltimet>.firstItem : <ore:ingotUltimet>.firstItem,
                    <ore:ingotHotNiobiumTitanium>.firstItem : <ore:ingotNiobiumTitanium>.firstItem,
                    <ore:ingotHotYttrium>.firstItem : <ore:ingotYttrium>.firstItem,
                    <ore:ingotHotNiobium>.firstItem : <ore:ingotNiobium>.firstItem,
                    <ore:ingotHotTantalumCarbide>.firstItem : <ore:ingotTantalumCarbide>.firstItem,
                    <ore:ingotHotTungstenCarbide>.firstItem : <ore:ingotTungstenCarbide>.firstItem,
                    <ore:ingotHotBlackBronze>.firstItem : <ore:ingotBlackBronze>.firstItem,
                    <ore:ingotHotRuthenium>.firstItem : <ore:ingotRuthenium>.firstItem,
                    <ore:ingotHotRhodium>.firstItem : <ore:ingotRhodium>.firstItem,
                    <ore:ingotHotRhodiumPlatedPalladium>.firstItem : <ore:ingotRhodiumPlatedPalladium>.firstItem,
                    <ore:ingotHotPalladium>.firstItem : <ore:ingotPalladium>.firstItem,
                    <ore:ingotHotTungstenSteel>.firstItem : <ore:ingotTungstenSteel>.firstItem,
                    <ore:ingotHotRuridit>.firstItem : <ore:ingotRuridit>.firstItem,
                    <ore:ingotHotTungsten>.firstItem : <ore:ingotTungsten>.firstItem,
                    //<ore:ingotHotVibrantAlloy>.firstItem : <ore:ingotVibrantAlloy>.firstItem,
                };

                for hotingot, ingot in freezerMapNitro {
                    freezer.recipeBuilder().EUt(120).duration(200)
                    .fluidInputs(<liquid:liquid_nitrogen> * 1000)
                    .fluidOutputs(<liquid:nitrogen> * 500)
                    .inputs(hotingot)
                    .outputs(ingot)
                    .buildAndRegister();
                }
            // Helium
                <recipemap:vacuum_freezer>.findRecipe(120, [<metaitem:ingotHotOsmiridium>], null).remove();
                <recipemap:vacuum_freezer>.findRecipe(120, [<metaitem:ingotHotOsmium>], null).remove();
                <recipemap:vacuum_freezer>.findRecipe(120, [<metaitem:ingotHotIridium>], null).remove();
                <recipemap:vacuum_freezer>.findRecipe(120, [<metaitem:ingotHotUraniumTriplatinum>], null).remove();

                var freezerMapHelium as IItemStack[IItemStack] = {
                    <ore:ingotHotOsmium>.firstItem : <ore:ingotOsmium>.firstItem,
                    <ore:ingotHotIridium>.firstItem : <ore:ingotIridium>.firstItem,
                    <ore:ingotHotOsmiridium>.firstItem : <ore:ingotOsmiridium>.firstItem,
                    <ore:ingotHotUraniumTriplatinum>.firstItem : <ore:ingotUraniumTriplatinum>.firstItem
                };

                for hotingot, ingot in freezerMapHelium {
                    freezer.recipeBuilder().EUt(120).duration(200)
                    .fluidInputs(<liquid:liquid_helium> * 500)
                    .fluidOutputs(<liquid:helium> * 250)
                    .inputs(hotingot)
                    .outputs(ingot)
                    .buildAndRegister();
                }
            // Special Case
                // Terrasteel
                    #<recipemap:vacuum_freezer>.findRecipe(120, [<metaitem:ingotHotTerrasteel>], null).remove();
                    #freezer.recipeBuilder().EUt(120).duration(200)
                    #.inputs(<ore:ingotHotTerrasteel>)
                    #.fluidInputs(<liquid:botanic_mana> * 1000)
                    #.outputs(<ore:ingotTerrasteel>.firstItem)
                    #.buildAndRegister();


    // ======== Thermal Centrifuging ======== //   
        // ==== Centrifuging Map ==== //
/*
            var thermalMap as IItemStack[IItemStack] = {
                <ore:crushedPurifiedAluminium>.firstItem : <ore:crushedCentrifugedAluminium>.firstItem,
                <ore:crushedPurifiedBeryllium>.firstItem : <ore:crushedCentrifugedBeryllium>.firstItem,
                <ore:crushedPurifiedCobalt>.firstItem : <ore:crushedCentrifugedCobalt>.firstItem,
                <ore:crushedPurifiedCopper>.firstItem : <ore:crushedCentrifugedCopper>.firstItem,
                <ore:crushedPurifiedGold>.firstItem : <ore:crushedCentrifugedGold>.firstItem,
                <ore:crushedPurifiedIron>.firstItem : <ore:crushedCentrifugedIron>.firstItem,
                <ore:crushedPurifiedLead>.firstItem : <ore:crushedCentrifugedLead>.firstItem,
                <ore:crushedPurifiedLithium>.firstItem : <ore:crushedCentrifugedLithium>.firstItem,
                <ore:crushedPurifiedMolybdenum>.firstItem : <ore:crushedCentrifugedMolybdenum>.firstItem,
                <ore:crushedPurifiedNeodymium>.firstItem : <ore:crushedCentrifugedNeodymium>.firstItem,
                <ore:crushedPurifiedNickel>.firstItem : <ore:crushedCentrifugedNickel>.firstItem,
                <ore:crushedPurifiedPalladium>.firstItem : <ore:crushedCentrifugedPalladium>.firstItem,
                <ore:crushedPurifiedPlatinum>.firstItem : <ore:crushedCentrifugedPlatinum>.firstItem,
                <ore:crushedPurifiedPlutonium239>.firstItem : <ore:crushedCentrifugedPlutonium239>.firstItem,
                <ore:crushedPurifiedSilver>.firstItem : <ore:crushedCentrifugedSilver>.firstItem,
                <ore:crushedPurifiedSulfur>.firstItem : <ore:crushedCentrifugedSulfur>.firstItem,
                <ore:crushedPurifiedThorium>.firstItem : <ore:crushedCentrifugedThorium>.firstItem,

            };

    for input, output in thermalMap {                
        autoclave.recipeBuilder().EUt(60).duration(200)
        .fluidInputs(<liquid:petrotheum> * 250)
        .inputs(input)
        .outputs(output * 2)
        .buildAndRegister();
    }
*/
// ================ HV ================ //
