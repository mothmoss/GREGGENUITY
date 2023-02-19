import mods.jei.JEI.removeAndHide as rh;
import crafttweaker.item.IItemStack;
import crafttweaker.item.IItemDefinition;
import crafttweaker.item.IIngredient;
import crafttweaker.oredict.IOreDict;
import crafttweaker.oredict.IOreDictEntry;
import mods.gregtech.recipe.RecipeMaps;
import mods.gregtech.recipe.RecipeMap;

// ================ Random Things ================ //
    // ======= Variables ======== //
        val aerPhial = <thaumcraft:phial:1>.withTag({Aspects: [{amount: 10, key: "aer"}]});
    // ======== Divining Rods ======== //
        val DiviningRods = [   
            <randomthings:diviningrod>,
            <randomthings:diviningrod:1>,
            <randomthings:diviningrod:2>,
            <randomthings:diviningrod:3>,
            <randomthings:diviningrod:4>,
            <randomthings:diviningrod:5>,
            <randomthings:diviningrod:6>,
            <randomthings:diviningrod:7>,
            <randomthings:diviningrod:8>,
            <randomthings:diviningrod:9>,
            <randomthings:diviningrod:10>,
            <randomthings:diviningrod:11>,
            <randomthings:diviningrod:12>,
            <randomthings:diviningrod:13>,
            <randomthings:diviningrod:14>,
            <randomthings:diviningrod:15>,
            <randomthings:diviningrod:16>,
            <randomthings:diviningrod:17>,
            <randomthings:diviningrod:18>,
            <randomthings:diviningrod:19>,
            <randomthings:diviningrod:20>,
            <randomthings:diviningrod:21>,
        ] as IItemStack[];
            for item in DiviningRods
            {
                recipes.remove(item);
                rh(item);
            }        
    // ======== Time in a Bottle ======== //
        recipes.remove(<randomthings:timeinabottle>);

        assembler.recipeBuilder()
        .EUt(128)
        .duration(3600)
        .inputs(
            <ore:plateLapis> * 64, <ore:circuitHv> * 8, <ore:plateGlass> * 64,
            aerPhial * 16, <metaitem:field.generator.mv> * 16, <ore:gemAquamarine> * 16)
        .fluidInputs(<liquid:astralsorcery.liquidstarlight> * 12000)
        .outputs(<randomthings:timeinabottle>)
        .buildAndRegister();
// ================ Random Things ================ //




            // Removing default
            // Expensive assembler recipe
