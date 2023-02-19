#priority 9000
import mods.jei.JEI.removeAndHide as rh;
import crafttweaker.item.IItemStack;
import crafttweaker.item.IItemDefinition;
import crafttweaker.item.IIngredient;
import crafttweaker.oredict.IOreDict;
import crafttweaker.oredict.IOreDictEntry;
import mods.gregtech.recipe.RecipeMap;
import mods.gregtech.recipe.RecipeMaps;



// ================ Recycling ================ //
    // ======== Materials ======== //
        // ==== Starmetal ==== //
            // Astral to Starmetal Oredict
                <ore:ingotStarmetal>.add(<astralsorcery:itemcraftingcomponent:1>);
                <ore:dustStarmetal>.add(<astralsorcery:itemcraftingcomponent:2>);
            // Ingots
                // Furnace
                    furnace.remove(<metaitem:ingotStarmetal>);
                    furnace.addRecipe(<ore:ingotStarmetal>.firstItem, <ore:dustStarmetal>, 100);
                // Plate
                    <recipemap:arc_furnace>.findRecipe(30, [<metaitem:plateStarmetal>], [<liquid:oxygen> * 98]).remove();
                    arc.recipeBuilder()
                    .EUt(30)
                    .duration(98)
                    .fluidInputs(<liquid:oxygen> * 98)
                    .outputs(<ore:ingotStarmetal>.firstItem)
                    .inputs(<ore:plateStarmetal>)
                    .buildAndRegister();
                // Ingot
                    <recipemap:arc_furnace>.findRecipe(30, [<metaitem:dustStarmetal>], [<liquid:oxygen> * 98]).remove();
                    arc.recipeBuilder()
                    .EUt(30)
                    .duration(98)
                    .fluidInputs(<liquid:oxygen> * 98)
                    .outputs(<ore:ingotStarmetal>.firstItem)
                    .inputs(<ore:dustStarmetal>)
                    .buildAndRegister();
                // Wire x2
                    <recipemap:arc_furnace>.findRecipe(30, [<metaitem:wireGtDoubleStarmetal>], [<liquid:oxygen> * 98]).remove();
                    arc.recipeBuilder()
                    .EUt(30)
                    .duration(98)
                    .fluidInputs(<liquid:oxygen> * 98)
                    .outputs(<ore:ingotStarmetal>.firstItem)
                    .inputs(<ore:wireGtDoubleStarmetal>)
                    .buildAndRegister();
                // Cable x2
                    <recipemap:arc_furnace>.findRecipe(30, [<metaitem:cableGtDoubleStarmetal>], [<liquid:oxygen> * 99]).remove();
                    arc.recipeBuilder()
                    .EUt(30)
                    .duration(99)
                    .fluidInputs(<liquid:oxygen> * 99)
                    .outputs(<ore:ingotStarmetal>.firstItem, <ore:dustTinyAsh>.firstItem)
                    .inputs(<ore:cableGtDoubleStarmetal>)
                    .buildAndRegister();
                // Plate x2
                    <recipemap:arc_furnace>.findRecipe(30, [<metaitem:plateDoubleStarmetal>], [<liquid:oxygen> * 196]).remove();
                    arc.recipeBuilder()
                    .EUt(30)
                    .duration(196)
                    .fluidInputs(<liquid:oxygen> * 196)
                    .outputs(<ore:ingotStarmetal>.firstItem * 2)
                    .inputs(<ore:plateDoubleStarmetal>)
                    .buildAndRegister();
                // Wire x4
                    <recipemap:arc_furnace>.findRecipe(30, [<metaitem:wireGtQuadrupleStarmetal>], [<liquid:oxygen> * 196]).remove();
                    arc.recipeBuilder()
                    .EUt(30)
                    .duration(196)
                    .fluidInputs(<liquid:oxygen> * 196)
                    .outputs(<ore:ingotStarmetal>.firstItem * 2)
                    .inputs(<ore:wireGtQuadrupleStarmetal>)
                    .buildAndRegister();
                // Cable x4
                    <recipemap:arc_furnace>.findRecipe(30, [<metaitem:cableGtQuadrupleStarmetal>], [<liquid:oxygen> * 199]).remove();
                    arc.recipeBuilder()
                    .EUt(30)
                    .duration(199)
                    .fluidInputs(<liquid:oxygen> * 199)
                    .outputs(<ore:ingotStarmetal>.firstItem * 2, <ore:dustTinyAsh>.firstItem * 2)
                    .inputs(<ore:cableGtQuadrupleStarmetal>)
                    .buildAndRegister();
                // Wire x8
                    <recipemap:arc_furnace>.findRecipe(30, [<metaitem:wireGtOctalStarmetal>], [<liquid:oxygen> * 392]).remove();
                    arc.recipeBuilder()
                    .EUt(30)
                    .duration(392)
                    .fluidInputs(<liquid:oxygen> * 392)
                    .outputs(<ore:ingotStarmetal>.firstItem * 4)
                    .inputs(<ore:wireGtOctalStarmetal>)
                    .buildAndRegister();
                // Starmetal Buzzsaw
                    <recipemap:arc_furnace>.findRecipe(30, [<metaitem:toolHeadBuzzSawStarmetal>], [<liquid:oxygen> * 392]).remove();
                    arc.recipeBuilder()
                    .EUt(30)
                    .duration(392)
                    .fluidInputs(<liquid:oxygen> * 392)
                    .outputs(<ore:ingotStarmetal>.firstItem * 4)
                    .inputs(<ore:toolHeadBuzzSawStarmetal>)
                    .buildAndRegister();
                // Cable x8
                    <recipemap:arc_furnace>.findRecipe(30, [<metaitem:cableGtOctalStarmetal>], [<liquid:oxygen> * 396]).remove();
                    arc.recipeBuilder()
                    .EUt(30)
                    .duration(396)
                    .fluidInputs(<liquid:oxygen> * 396)
                    .outputs(<ore:ingotStarmetal>.firstItem * 4, <ore:dustTinyAsh>.firstItem * 3)
                    .inputs(<ore:cableGtOctalStarmetal>)
                    .buildAndRegister();
                // Wrench
                    <recipemap:arc_furnace>.findRecipe(30, [<metaitem:toolHeadWrenchStarmetal>], [<liquid:oxygen> * 416]).remove();
                    arc.recipeBuilder()
                    .EUt(2)
                    .duration(416)
                    .fluidInputs(<liquid:oxygen> * 416)
                    .outputs(<ore:ingotStarmetal>.firstItem * 4, <ore:nuggetSteel>.firstItem * 4)
                    .inputs(<ore:toolHeadWrenchStarmetal>)
                    .buildAndRegister();
                // Chainsaw Tip
                    <recipemap:arc_furnace>.findRecipe(30, [<metaitem:toolHeadChainsawStarmetal>], [<liquid:oxygen> * 444]).remove();
                    arc.recipeBuilder()
                    .EUt(2)
                    .duration(444)
                    .fluidInputs(<liquid:oxygen> * 444)
                    .outputs(<ore:ingotStarmetal>.firstItem * 2, <ore:nuggetSteel>.firstItem * 40)
                    .inputs(<ore:toolHeadChainsawStarmetal>)
                    .buildAndRegister();
                // Drill Tip
                    <recipemap:arc_furnace>.findRecipe(30, [<metaitem:toolHeadDrillStarmetal>], [<liquid:oxygen> * 616]).remove();
                    arc.recipeBuilder()
                    .EUt(2)
                    .duration(616)
                    .fluidInputs(<liquid:oxygen> * 616)
                    .outputs(<ore:ingotStarmetal>.firstItem * 4, <ore:ingotSteel>.firstItem * 4)
                    .inputs(<ore:toolHeadDrillStarmetal>)
                    .buildAndRegister();
                // 16x Wire
                    <recipemap:arc_furnace>.findRecipe(30, [<metaitem:wireGtHexStarmetal>], [<liquid:oxygen> * 784]).remove();
                    arc.recipeBuilder()
                    .EUt(30)
                    .duration(784)
                    .fluidInputs(<liquid:oxygen> * 784)
                    .outputs(<ore:ingotStarmetal>.firstItem * 8)
                    .inputs(<ore:wireGtHexStarmetal>)
                    .buildAndRegister();
                // 16x Cable
                    <recipemap:arc_furnace>.findRecipe(30, [<metaitem:cableGtHexStarmetal>], [<liquid:oxygen> * 790]).remove();
                    arc.recipeBuilder()
                    .EUt(30)
                    .duration(790)
                    .fluidInputs(<liquid:oxygen> * 790)
                    .outputs(<ore:ingotStarmetal>.firstItem * 8, <ore:dustTinyAsh>.firstItem * 5)
                    .inputs(<ore:cableGtHexStarmetal>)
                    .buildAndRegister();
                // Block of Starmetal 
                    <recipemap:arc_furnace>.findRecipe(30, [<metaitem:blockStarmetal>], [<liquid:oxygen> * 882]).remove();
                    arc.recipeBuilder()
                    .EUt(30)
                    .duration(882)
                    .fluidInputs(<liquid:oxygen> * 882)
                    .outputs(<ore:ingotStarmetal>.firstItem * 9)
                    .inputs(<ore:blockStarmetal>)
                    .buildAndRegister();
                // Extractor
                    // Cable x2
                        <recipemap:extractor>.findRecipe(30, [<metaitem:cableGtDoubleStarmetal>], null).remove();
                        extractor.recipeBuilder()
                        .EUt(30)
                        .duration(98)
                        .inputs(<metaitem:cableGtDoubleStarmetal>)
                        .outputs(<ore:ingotStarmetal>.firstItem)
                        .fluidOutputs(<liquid:rubber> * 144)
                        .buildAndRegister();
                    // Cable x4
                        <recipemap:extractor>.findRecipe(30, [<metaitem:cableGtQuadrupleStarmetal>], null).remove();
                        extractor.recipeBuilder()
                        .EUt(30)
                        .duration(98)
                        .inputs(<metaitem:cableGtQuadrupleStarmetal>)
                        .outputs(<ore:ingotStarmetal>.firstItem * 2)
                        .fluidOutputs(<liquid:rubber> * 288)
                        .buildAndRegister();
                    // Cable x8 
                        <recipemap:extractor>.findRecipe(30, [<metaitem:cableGtOctalStarmetal>], null).remove();
                        extractor.recipeBuilder()
                        .EUt(30)
                        .duration(407)
                        .inputs(<metaitem:cableGtOctalStarmetal>)
                        .outputs(<ore:ingotStarmetal>.firstItem * 4)
                        .fluidOutputs(<liquid:rubber> * 432)
                        .buildAndRegister();
                    // Wrench 
                        <recipemap:extractor>.findRecipe(120, [<metaitem:toolHeadWrenchStarmetal>], null).remove();
                        extractor.recipeBuilder()
                        .EUt(30)
                        .duration(417)
                        .inputs(<metaitem:toolHeadWrenchStarmetal>)
                        .outputs(<ore:ingotStarmetal>.firstItem * 4)
                        .fluidOutputs(<liquid:steel> * 68)
                        .buildAndRegister();
                    // Chainsaw
                        <recipemap:extractor>.findRecipe(120, [<metaitem:toolHeadChainsawStarmetal>], null).remove();
                        extractor.recipeBuilder()
                        .EUt(30)
                        .duration(444)
                        .inputs(<metaitem:toolHeadChainsawStarmetal>)
                        .outputs(<ore:ingotStarmetal>.firstItem * 2)
                        .fluidOutputs(<liquid:steel> * 648)
                        .buildAndRegister();
                    // Drill
                        <recipemap:extractor>.findRecipe(120, [<metaitem:toolHeadDrillStarmetal>], null).remove();
                        extractor.recipeBuilder()
                        .EUt(30)
                        .duration(616)
                        .inputs(<metaitem:toolHeadDrillStarmetal>)
                        .outputs(<ore:ingotStarmetal>.firstItem)
                        .fluidOutputs(<liquid:steel> * 576)
                        .buildAndRegister();
                    // Cable x16
                        <recipemap:extractor>.findRecipe(30, [<metaitem:cableGtHexStarmetal>], null).remove();
                        extractor.recipeBuilder()
                        .EUt(30)
                        .duration(784)
                        .inputs(<metaitem:cableGtHexStarmetal>)
                        .outputs(<ore:ingotStarmetal>.firstItem * 8)
                        .fluidOutputs(<liquid:steel> * 720)
                        .buildAndRegister();
            // Dust
                // Plate
                    <recipemap:macerator>.findRecipe(2, [<metaitem:plateStarmetal>], null).remove();
                    macerator.recipeBuilder()
                    .EUt(2)
                    .duration(98)
                    .outputs(<ore:dustStarmetal>.firstItem)
                    .inputs(<ore:plateStarmetal>)
                    .buildAndRegister();
                // Ingot
                    <recipemap:macerator>.findRecipe(2, [<metaitem:ingotStarmetal>], null).remove();
                    macerator.recipeBuilder()
                    .EUt(2)
                    .duration(98)
                    .outputs(<ore:dustStarmetal>.firstItem)
                    .inputs(<ore:ingotStarmetal>)
                    .buildAndRegister();
                // Wire x2
                    <recipemap:macerator>.findRecipe(2, [<metaitem:wireGtDoubleStarmetal>], null).remove();
                    macerator.recipeBuilder()
                    .EUt(2)
                    .duration(98)
                    .outputs(<ore:dustStarmetal>.firstItem)
                    .inputs(<ore:wireGtDoubleStarmetal>)
                    .buildAndRegister();
                // Cable x2
                    <recipemap:macerator>.findRecipe(2, [<metaitem:cableGtDoubleStarmetal>], null).remove();
                    macerator.recipeBuilder()
                    .EUt(2)
                    .duration(103)
                    .outputs(<ore:dustStarmetal>.firstItem, <ore:dustRubber>.firstItem)
                    .inputs(<ore:cableGtDoubleStarmetal>)
                    .buildAndRegister();
                // Plate x2
                    <recipemap:macerator>.findRecipe(2, [<metaitem:plateDoubleStarmetal>], null).remove();
                    macerator.recipeBuilder()
                    .EUt(2)
                    .duration(196)
                    .outputs(<ore:dustStarmetal>.firstItem * 2)
                    .inputs(<ore:plateDoubleStarmetal>)
                    .buildAndRegister();
                // Wire x4
                    <recipemap:macerator>.findRecipe(2, [<metaitem:wireGtQuadrupleStarmetal>], null).remove();
                    macerator.recipeBuilder()
                    .EUt(2)
                    .duration(196)
                    .outputs(<ore:dustStarmetal>.firstItem * 2)
                    .inputs(<ore:wireGtQuadrupleStarmetal>)
                    .buildAndRegister();
                // Cable x4
                    <recipemap:macerator>.findRecipe(2, [<metaitem:cableGtQuadrupleStarmetal>], null).remove();
                    macerator.recipeBuilder()
                    .EUt(2)
                    .duration(201)
                    .outputs(<ore:dustStarmetal>.firstItem * 2, <ore:dustRubber>.firstItem * 2)
                    .inputs(<ore:cableGtQuadrupleStarmetal>)
                    .buildAndRegister();
                // Wire x8
                    <recipemap:macerator>.findRecipe(2, [<metaitem:wireGtOctalStarmetal>], null).remove();
                    macerator.recipeBuilder()
                    .EUt(2)
                    .duration(392)
                    .outputs(<ore:dustStarmetal>.firstItem * 4)
                    .inputs(<ore:wireGtOctalStarmetal>)
                    .buildAndRegister();
                // Starmetal Buzzsaw
                    <recipemap:macerator>.findRecipe(2, [<metaitem:toolHeadBuzzSawStarmetal>], null).remove();
                    macerator.recipeBuilder()
                    .EUt(2)
                    .duration(392)
                    .outputs(<ore:dustStarmetal>.firstItem * 4)
                    .inputs(<ore:toolHeadBuzzSawStarmetal>)
                    .buildAndRegister();
                // Cable x8
                    <recipemap:macerator>.findRecipe(2, [<metaitem:cableGtOctalStarmetal>], null).remove();
                    macerator.recipeBuilder()
                    .EUt(2)
                    .duration(407)
                    .outputs(<ore:dustStarmetal>.firstItem * 4, <ore:dustRubber>.firstItem * 3)
                    .inputs(<ore:cableGtOctalStarmetal>)
                    .buildAndRegister();
                // Wrench
                    <recipemap:macerator>.findRecipe(8, [<metaitem:toolHeadWrenchStarmetal>], null).remove();
                    macerator.recipeBuilder()
                    .EUt(2)
                    .duration(417)
                    .outputs(<ore:dustStarmetal>.firstItem * 4, <ore:dustTinySteel>.firstItem * 4)
                    .inputs(<ore:toolHeadWrenchStarmetal>)
                    .buildAndRegister();
                // Chainsaw Tip
                    <recipemap:macerator>.findRecipe(8, [<metaitem:toolHeadChainsawStarmetal>], null).remove();
                    macerator.recipeBuilder()
                    .EUt(2)
                    .duration(444)
                    .outputs(<ore:dustStarmetal>.firstItem * 2, <ore:dustSmallSteel>.firstItem * 18)
                    .inputs(<ore:toolHeadChainsawStarmetal>)
                    .buildAndRegister();
                // Drill Tip
                    <recipemap:macerator>.findRecipe(8, [<metaitem:toolHeadDrillStarmetal>], null).remove();
                    macerator.recipeBuilder()
                    .EUt(2)
                    .duration(616)
                    .outputs(<ore:dustStarmetal>.firstItem * 4, <ore:dustSteel>.firstItem * 4)
                    .inputs(<ore:toolHeadDrillStarmetal>)
                    .buildAndRegister();
                // 16x Wire
                    <recipemap:macerator>.findRecipe(2, [<metaitem:wireGtHexStarmetal>], null).remove();
                    macerator.recipeBuilder()
                    .EUt(2)
                    .duration(784)
                    .outputs(<ore:dustStarmetal>.firstItem * 8)
                    .inputs(<ore:wireGtHexStarmetal>)
                    .buildAndRegister();
                // 16x Cable
                    <recipemap:macerator>.findRecipe(2, [<metaitem:cableGtHexStarmetal>], null).remove();
                    macerator.recipeBuilder()
                    .EUt(2)
                    .duration(790)
                    .outputs(<ore:dustStarmetal>.firstItem * 8, <ore:dustRubber>.firstItem * 5)
                    .inputs(<ore:cableGtHexStarmetal>)
                    .buildAndRegister();
                // Block of Starmetal 
                    <recipemap:macerator>.findRecipe(2, [<metaitem:blockStarmetal>], null).remove();
                    macerator.recipeBuilder()
                    .EUt(2)
                    .duration(882)
                    .outputs(<ore:dustStarmetal>.firstItem * 9)
                    .inputs(<ore:blockStarmetal>)
                    .buildAndRegister();
                // Packaging from Small
                    <recipemap:packer>.findRecipe(12, [<metaitem:dustSmallStarmetal> * 4, <metaitem:circuit.integrated>.withTag({Configuration: 1})], null).remove();
                    packager.recipeBuilder()
                    .EUt(12)
                    .duration(10)
                    .circuit(1)
                    .inputs(<ore:dustSmallStarmetal> * 4)
                    .outputs(<ore:dustStarmetal>.firstItem)
                    .buildAndRegister();
                // Packaging from Tiny
                    <recipemap:packer>.findRecipe(12, [<metaitem:dustTinyStarmetal> * 9, <metaitem:circuit.integrated>.withTag({Configuration: 1})], null).remove();
                    packager.recipeBuilder()
                    .EUt(12)
                    .duration(10)
                    .circuit(1)
                    .inputs(<ore:dustTinyStarmetal> * 9)
                    .outputs(<ore:dustStarmetal>.firstItem)
                    .buildAndRegister();
// ================ Recycling ================ //
