#priority 10000

import crafttweaker.block.IBlockState;
import crafttweaker.item.IIngredient;
import crafttweaker.item.IItemStack;
import crafttweaker.world.IBlockPos;
import crafttweaker.world.IFacing;
import crafttweaker.world.IWorld;
import mods.contenttweaker.Random;
import mods.contenttweaker.World;
import mods.gregtech.IControllerTile;
import mods.gregtech.multiblock.Builder;
import mods.gregtech.multiblock.CTPredicate;
import mods.gregtech.multiblock.FactoryBlockPattern;
import mods.gregtech.multiblock.functions.ICheckRecipeFunction;
import mods.gregtech.multiblock.functions.IPatternBuilderFunction;
import mods.gregtech.multiblock.functions.IUpdateFormedValidFunction;
import mods.gregtech.multiblock.IBlockPattern;
import mods.gregtech.multiblock.RelativeDirection;
import mods.gregtech.recipe.FactoryRecipeMap;
import mods.gregtech.recipe.functions.ICompleteRecipeFunction;
import mods.gregtech.recipe.IRecipe;
import mods.gregtech.recipe.IRecipeLogic;
import mods.gregtech.recipe.RecipeMap;
import crafttweaker.command.ICommandSender;
import crafttweaker.command.ICommandManager;

// ================ Multiblocks ================ //
    // ======== Immersive Excavator ======== //
        val excavator = Builder.start("mbt:excavator") // automatic allocation ID
            .withPattern(function(controller as IControllerTile) as IBlockPattern {return FactoryBlockPattern.start()
                                .aisle("GGG", "GVG", "GGG")
                                .aisle("GGG", "GDG", "GGG")
                                .aisle("GSG", "GGG", "GGG")
                                .where('S', controller.self())
                                .where('G', <blockstate:gregtech:transparent_casing>)
                                .where('V', <metastate:gregtech:multiblock_casing:9>)
                                .where('D', <metastate:chisel:diamond:3>)
                                .build();
                        } as IPatternBuilderFunction)
            .withRecipeMap(FactoryRecipeMap.start("excavator") 
                    .minInputs(1)
                    .maxInputs(2)
                    .minOutputs(1)
                    .maxOutputs(16)
                    .build())
            .withBaseTexture(<metastate:gregtech:metal_casing:9>) 
            .buildAndRegister();
    // ======== Fluid Compressor ======== //
        // ==== Script Category 2 ==== //
    // Air Compressor
        val fluidcompressor = Builder.start("mbt:fluidcompressor") // automatic allocation ID
            .withPattern(function(controller as IControllerTile) as IBlockPattern {
                            return FactoryBlockPattern.start()
                                .aisle("SSS", "FFF", "FFF", "FFF", "SSS")
                                .aisle("SSS", "FFF", "FFF", "FFF", "SSS")
                                .aisle("SSS", "FFF", "FCF", "FFF", "SSS")
                                .where('C', controller.self())
                                .where("S", CTPredicate.states(<metastate:gregtech:metal_casing:5>))           
                                .where("F", CTPredicate.states(<metastate:gregtech:metal_casing:3>)
                                | CTPredicate.abilities(<mte_ability:IMPORT_ITEMS>).setMinGlobalLimited(1).setPreviewCount(1)
                                | CTPredicate.abilities(<mte_ability:EXPORT_ITEMS>).setMinGlobalLimited(1).setPreviewCount(1)
                                | CTPredicate.abilities(<mte_ability:IMPORT_FLUIDS>).setMinGlobalLimited(1).setPreviewCount(1)
                                | CTPredicate.abilities(<mte_ability:INPUT_ENERGY>).setMinGlobalLimited(1).setPreviewCount(1))           
                                .build();
                        } as IPatternBuilderFunction)
            .withRecipeMap(
                FactoryRecipeMap.start("fluidcompressor") 
                    .minFluidInputs(1)
                    .maxFluidInputs(1)
                    .minFluidOutputs(1)
                    .maxFluidOutputs(1)
                    .build())
            .withBaseTexture(<metastate:gregtech:metal_casing:3>) 
            .buildAndRegister();
// ================ Multiblocks ================ //
