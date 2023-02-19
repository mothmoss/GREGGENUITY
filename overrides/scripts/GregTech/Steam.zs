import mods.jei.JEI.removeAndHide as rh;
import crafttweaker.item.IItemStack;
import crafttweaker.item.IItemDefinition;
import crafttweaker.item.IIngredient;
import crafttweaker.oredict.IOreDict;
import crafttweaker.oredict.IOreDictEntry;
import mods.gregtech.recipe.RecipeMaps;
import mods.gregtech.recipe.RecipeMap;
import mods.artisanworktables.builder.RecipeBuilder;
import mods.thaumcraft.Crucible;

// ================ Steam ================ //
    // ======== Caveman Era ======== //
        // ==== Removing Vanilla Tools ==== //
            val VanillaTools = [
                <minecraft:wooden_sword>,
                <minecraft:wooden_shovel>,
                <minecraft:wooden_pickaxe>,
                <minecraft:wooden_axe>,
                <minecraft:wooden_hoe>,
                <minecraft:stone_sword>,
                <minecraft:stone_shovel>,
                <minecraft:stone_pickaxe>,
                <minecraft:stone_axe>,
                <minecraft:stone_hoe>,
                <minecraft:iron_sword>,
                <minecraft:iron_pickaxe>,
                <minecraft:iron_shovel>,
                <minecraft:iron_axe>,
                <minecraft:iron_hoe>,
                <minecraft:diamond_sword>,
                <minecraft:diamond_pickaxe>,
                <minecraft:diamond_shovel>,
                <minecraft:diamond_axe>,
                <minecraft:diamond_hoe>,
                <minecraft:golden_sword>,
                <minecraft:golden_shovel>,
                <minecraft:golden_pickaxe>,
                <minecraft:golden_axe>,
                <minecraft:golden_hoe>,
                    ] as IItemStack[];
            for item in VanillaTools
            {recipes.remove(item); rh(item);}
        // ==== Flint Recipe - 4:1 ==== //
            recipes.addShaped("GGN_flintfromgravel",
            <minecraft:flint>, [[<ore:gravel>, <ore:gravel>], [<ore:gravel>, <ore:gravel>]]);
    // ======== Coke Oven ======== //
        // ==== Coke Brick ==== //
            recipes.remove(<metaitem:compressed.coke_clay>);
            <recipemap:alloy_smelter>.findRecipe(7, [<minecraft:sand:0>, <minecraft:clay_ball:0>], null).remove();

            RecipeBuilder.get("mason")
            .setShaped([
                [<ore:dustClay>, <ore:dustClay>, <ore:dustClay>],
                [<minecraft:sand:1>, <metaitem:wooden_form.brick>, <minecraft:sand:1>],
                [<minecraft:sand:1>, <minecraft:sand:1>, <minecraft:sand:1>],
            ])
            .setFluid(<liquid:lava> * 1000)
            .addOutput(<metaitem:compressed.coke_clay> * 4)
            .create();
        // ==== Mason Table ==== //
            recipes.addShaped("GGNmasontable", <artisanworktables:worktable:2>,
            [
                [<ore:blockBrick>, <ore:blockBrick>, <ore:blockBrick>],
                [<ore:stoneBasalt>, <cyclicmagic:block_workbench>, <ore:stoneBasalt>],
                [<ore:logWood>, <ore:logWood>, <ore:logWood>]
            ]);
        // ==== Red Sand ==== //
            recipes.addShapeless("GGN_redsand", <minecraft:sand:1>, [<minecraft:sand>, <ore:dustRedstone>, <ore:dustCopper>, <ore:dustIron>]);
    // ======== Wrought Iron ======== //
        // ==== Furnace Removal ==== //
            furnace.remove(<metaitem:nuggetWroughtIron>);
        // ==== Pig Iron ==== //
            // Handmixing; Intended to be super lossy
            recipes.addShapeless("GGNwroughtdust", <metaitem:dustPigiron>,
                    [<ore:dustCoke>, <ore:dustCoke>, <ore:dustIron>]);
            
            // Hammering
            recipes.addShapeless("GGNhammerpigiron", <metaitem:dustWroughtIron>, 
                    [<ore:dustPigiron>, <ore:gtHammer>]);

            hammer.recipeBuilder()
            .inputs(<ore:dustPigiron>)
            .outputs(<metaitem:dustWroughtIron>)
            .EUt(4)
            .duration(40)
            .buildAndRegister();
        // ==== Alloy Smelter ==== //
            alloy.recipeBuilder()
            .inputs(<ore:dustCoke>, <ore:ingotIron>)
            .outputs(<ore:ingotWroughtIron>.firstItem)
            .EUt(8)
            .duration(200)
            .buildAndRegister();
    // ======== Steam Machines ======== //
        // ==== Removing Basic Steam ==== //
            val BasicSteam = [
                <metaitem:steam_boiler_coal_bronze>,
                <metaitem:steam_boiler_solar_bronze>,
                <metaitem:steam_boiler_lava_bronze>,
                <metaitem:steam_extractor_bronze>,
                <metaitem:steam_macerator_bronze>,
                <metaitem:steam_compressor_bronze>,
                <metaitem:steam_hammer_bronze>,
                <metaitem:steam_furnace_bronze>,
                <metaitem:steam_alloy_smelter_bronze>,
                <metaitem:steam_rock_breaker_bronze>,
                <metaitem:steam_miner>,
                    ] as IItemStack[];
            for item in BasicSteam
            {recipes.remove(item); rh(item);}  
        // ==== Replace Occurences==== //
                // FLAGGED - LOW PRIORITY
                // Kindof a legacy script
            recipes.replaceAllOccurences(<metaitem:steam_extractor_bronze>, <gregtech:steam_casing:3>);
            recipes.replaceAllOccurences(<metaitem:steam_macerator_bronze>, <gregtech:steam_casing:3>);
            recipes.replaceAllOccurences(<metaitem:steam_compressor_bronze>, <gregtech:steam_casing:3>);
            recipes.replaceAllOccurences(<metaitem:steam_hammer_bronze>, <gregtech:steam_casing:3>);
            recipes.replaceAllOccurences(<metaitem:steam_furnace_bronze>, <gregtech:steam_casing:3>);
            recipes.replaceAllOccurences(<metaitem:steam_alloy_smelter_bronze>, <gregtech:steam_casing:3>);
            recipes.replaceAllOccurences(<metaitem:steam_rock_breaker_bronze>, <gregtech:steam_casing:3>);
        // ==== Glass ==== //
            alloy.recipeBuilder()
            .EUt(8)
            .duration(120)
            .inputs(<ore:plateIron>, <ore:dustGlass>)
            .outputs(<minecraft:glass>)
            .buildAndRegister();
        // ==== Steam Machines ==== //
                // FLAGGED - LOW PRIORITY
                // Bad recipes
            // Steam Boiler
                recipes.remove(<metaitem:steam_boiler_coal_steel>);
                recipes.addShaped("GGN_steamboiler", <metaitem:steam_boiler_coal_steel>,
                [
                    [<ore:plateWroughtIron>, <ore:plateWroughtIron>, <ore:plateWroughtIron>],
                    [<ore:plateWroughtIron>, <ore:gtWrench>, <ore:plateWroughtIron>],
                    [<gregtech:metal_casing:8>, <ore:craftingFurnace>, <gregtech:metal_casing:8>]
                ]);
            // Solar Boiler
                recipes.remove(<metaitem:steam_boiler_solar_steel>);
                recipes.addShaped("GGN_steamsolarboiler", <metaitem:steam_boiler_solar_steel>,
                [
                    [<ore:blockGlass>, <ore:blockGlass>, <ore:blockGlass>],
                    [<ore:plateDoubleSilver>, <ore:plateDoubleSilver>, <ore:plateDoubleSilver>],
                    [<ore:pipeSmallFluidBronze>, <gregtech:steam_casing:3>, <ore:pipeSmallFluidBronze>]
                ]);
            // Liquid Boiler
                recipes.remove(<metaitem:steam_boiler_lava_steel>);
                recipes.addShaped("GGN_steamliquidboiler", <metaitem:steam_boiler_lava_steel>,
                [
                    [<ore:plateWroughtIron>, <ore:plateWroughtIron>, <ore:plateWroughtIron>],
                    [<ore:plateWroughtIron>, <ore:blockGlass>, <ore:plateWroughtIron>],
                    [<ore:plateWroughtIron>, <gregtech:steam_casing:3>, <ore:plateWroughtIron>]
                ]);
            // Alloy Smelter
                recipes.remove(<metaitem:steam_alloy_smelter_steel>);
                recipes.addShaped("GGN_steamalloy", <metaitem:steam_alloy_smelter_steel>, [
                    [<ore:plateWroughtIron>, <ore:plateDoubleWroughtIron>, <ore:plateWroughtIron>], 
                    [<ore:plateWroughtIron>, <gregtech:steam_casing:3>, <ore:plateWroughtIron>], 
                    [<ore:plateWroughtIron>, <ore:pipeSmallFluidBronze>, <ore:plateWroughtIron>]]);
            // Macerator
                recipes.remove(<metaitem:steam_macerator_steel>);
                recipes.addShaped("GGN_steammacerator", 
                <metaitem:steam_macerator_steel>, 
                [
                    [<ore:plateWroughtIron>, <ore:blockFlint>, <ore:plateWroughtIron>], 
                    [<ore:pipeSmallFluidTinAlloy>, <gregtech:steam_casing:3>, <ore:pipeSmallFluidTinAlloy>], 
                    [<ore:plateWroughtIron>, <ore:plateWroughtIron>, <ore:plateWroughtIron>]
                ]);
            // Extractor
                recipes.remove(<metaitem:steam_extractor_steel>);
                recipes.addShaped("GGN_steamextractor", 
                <metaitem:steam_extractor_steel>, [
                    [<ore:pipeSmallFluidTinAlloy>, <minecraft:bucket>, <ore:pipeSmallFluidTinAlloy>], 
                    [<ore:plateWroughtIron>, <gregtech:steam_casing:3>, <ore:plateWroughtIron>], 
                    [<ore:pipeSmallFluidTinAlloy>, <ore:pipeSmallFluidTinAlloy>, <ore:pipeSmallFluidTinAlloy>]
                    ]);

            // Compressor
                recipes.remove(<metaitem:steam_compressor_steel>);
                recipes.addShaped("GGN_steamcompressor", 
                <metaitem:steam_compressor_steel>, 
                [
                    [<ore:pipeSmallFluidTinAlloy>, <minecraft:piston>, <ore:pipeSmallFluidTinAlloy>], 
                    [<ore:plateWroughtIron>, <gregtech:steam_casing:3>, <ore:plateWroughtIron>], 
                    [<ore:pipeSmallFluidTinAlloy>, <minecraft:anvil>, <ore:pipeSmallFluidTinAlloy>]]);

            // Forge Hammer
                recipes.remove(<metaitem:steam_hammer_steel>);
                recipes.addShaped("GGN_steamhammer", 
                <metaitem:steam_hammer_steel>, 
                [
                    [<ore:plateWroughtIron>, <minecraft:anvil>, <ore:plateWroughtIron>], 
                    [<ore:pipeSmallFluidTinAlloy>, <gregtech:steam_casing:3>, <ore:pipeSmallFluidTinAlloy>], 
                    [<ore:plateWroughtIron>, <minecraft:piston>, <ore:plateWroughtIron>]]);

            // Furnace
                recipes.remove(<metaitem:steam_furnace_steel>);
                recipes.addShaped("GGN_steamfurnace", 
                <metaitem:steam_furnace_steel>, 
                [
                    [<ore:pipeSmallFluidTinAlloy>, <minecraft:furnace>, <ore:pipeSmallFluidTinAlloy>], 
                    [<ore:plateWroughtIron>, <gregtech:steam_casing:3>, <ore:plateWroughtIron>], 
                    [<ore:pipeSmallFluidTinAlloy>, <ore:pipeSmallFluidTinAlloy>, <ore:pipeSmallFluidTinAlloy>]]);

        // ==== PBF ==== //
            // Concrete 
                // Mix
                alloy.recipeBuilder()
                .EUt(7)
                .duration(60)
                .inputs(<ore:dustStone>, <ore:dustClay>)
                .outputs(<ore:dustConcreteMix>.firstItem * 2)
                .buildAndRegister();

                // Bucket
                recipes.remove(<forge:bucketfilled>.withTag({FluidName: "concrete", Amount: 1000}));
                recipes.addShaped("GGN_gt_concretebucket", <forge:bucketfilled>.withTag({FluidName: "concrete", Amount: 1000}),
                [
                    [null, <ore:gtSofthammer>, null],
                    [<ore:dustConcreteMix>, <minecraft:water_bucket>, <ore:dustConcreteMix>],
                    [<ore:dustQuartzSand>, <ore:dustConcreteMix>, <ore:dustQuartzSand>]
                ]);
            // PBF Casing
                recipes.remove(<gregtech:metal_casing:1>);
                
                // 2x Wrought Iron
                RecipeBuilder.get("mason")
                .setShaped([
                    [<metaitem:brick.fireclay>, <ore:dustGypsum>, <metaitem:brick.fireclay>],
                    [<metaitem:brick.fireclay>, <ore:stickWroughtIron>, <metaitem:brick.fireclay>],
                    [<metaitem:brick.fireclay>, <ore:dustGypsum>, <metaitem:brick.fireclay>]
                ])
                .setFluid(<liquid:concrete> * 1000)
                .addOutput(<gregtech:metal_casing:1> * 2)
                .create();

                // 4x Thaumium
                RecipeBuilder.get("mason")
                .setShaped([
                    [<metaitem:brick.fireclay>, <ore:dustGypsum>, <metaitem:brick.fireclay>],
                    [<metaitem:brick.fireclay>, <ore:stickThaumium>, <metaitem:brick.fireclay>],
                    [<metaitem:brick.fireclay>, <ore:dustGypsum>, <metaitem:brick.fireclay>]
                ])
                .setFluid(<liquid:concrete> * 1000)
                .addOutput(<gregtech:metal_casing:1> * 4)
                .create();
        // ==== PBF Recipes ==== //
            // Removing iron
                <recipemap:primitive_blast_furnace>.findRecipe(1, 
                [<minecraft:iron_ingot:0>, <metaitem:gemCoke>], null).remove();
                
                <recipemap:primitive_blast_furnace>.findRecipe(1, 
                [<minecraft:iron_ingot:0>, <metaitem:dustCoke>], null).remove();
                
                <recipemap:primitive_blast_furnace>.findRecipe(1, 
                [<minecraft:iron_ingot:0>, <metaitem:dustCoal> * 2], null).remove();
                
                <recipemap:primitive_blast_furnace>.findRecipe(1, 
                [<minecraft:iron_ingot:0>, <metaitem:dustCharcoal> * 2], null).remove();
                
                <recipemap:primitive_blast_furnace>.findRecipe(1, 
                [<minecraft:iron_ingot:0>, <minecraft:coal:0> * 2], null).remove();
                
                <recipemap:primitive_blast_furnace>.findRecipe(1, 
                [<minecraft:iron_ingot:0>, <minecraft:coal:1> * 2], null).remove();
                
                <recipemap:primitive_blast_furnace>.findRecipe(1, 
                [<minecraft:iron_block:0>, <metaitem:blockCoke>], null).remove();
                
                <recipemap:primitive_blast_furnace>.findRecipe(1, 
                [<minecraft:iron_block:0>, <minecraft:coal_block:0> * 2], null).remove();
                
                <recipemap:primitive_blast_furnace>.findRecipe(1, 
                [<minecraft:iron_block:0>, <metaitem:blockCharcoal> * 2], null).remove();



            // Iron → Wrought Iron
                pbf.recipeBuilder()
                .EUt(1)
                .inputs(<ore:ingotIron>, <ore:gemCoke>)
                .outputs(<metaitem:ingotWroughtIron>, <metaitem:dustTinyAsh> )
                .duration(200)
                .buildAndRegister();

                pbf.recipeBuilder()
                .EUt(1)
                .inputs(<ore:ingotIron>, <ore:dustCoke>)
                .outputs(<metaitem:ingotWroughtIron>, <metaitem:dustTinyAsh> )
                .duration(200)
                .buildAndRegister();

                pbf.recipeBuilder()
                .EUt(1)
                .inputs(<ore:ingotIron>, <ore:gemCoal> * 2)
                .outputs(<metaitem:ingotWroughtIron>, <metaitem:dustTinyDarkAsh> * 2 )
                .duration(400)
                .buildAndRegister();

                pbf.recipeBuilder()
                .EUt(1)
                .inputs(<ore:ingotIron>, <ore:gemCharcoal> * 2)
                .outputs(<metaitem:ingotWroughtIron>, <metaitem:dustTinyDarkAsh> * 2 )
                .duration(400)
                .buildAndRegister();     

                pbf.recipeBuilder()
                .EUt(1)
                .inputs(<ore:ingotIron>, <ore:dustCoal> * 2)
                .outputs(<metaitem:ingotWroughtIron>, <metaitem:dustTinyDarkAsh> * 2 )
                .duration(400)
                .buildAndRegister();

                pbf.recipeBuilder()
                .EUt(1)
                .inputs(<ore:ingotIron>, <ore:dustCharcoal> * 2)
                .outputs(<metaitem:ingotWroughtIron>, <metaitem:dustTinyDarkAsh> * 2 )
                .duration(400)
                .buildAndRegister();
            // Wrought Iron w/ Alumentum → Steel
                pbf.recipeBuilder()
                .EUt(1)
                .inputs(<ore:ingotWroughtIron>, <thaumcraft:alumentum>)
                .outputs(<metaitem:ingotSteel>, <metaitem:dustTinyAsh>)
                .duration(240)
                .buildAndRegister();
                
                pbf.recipeBuilder()
                .EUt(1)
                .inputs(<ore:blockWroughtIron>, <thaumcraft:alumentum> * 9)
                .outputs(<metaitem:blockSteel>, <metaitem:dustTinyAsh>)
                .duration(3240)
                .buildAndRegister();
// ================ Steam ================ //
