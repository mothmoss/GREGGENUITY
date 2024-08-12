package classes

import gregtech.api.metatileentity.MetaTileEntity
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity
import gregtech.api.metatileentity.multiblock.IMultiblockPart
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController
import gregtech.api.pattern.BlockPattern
import gregtech.api.pattern.FactoryBlockPattern
import gregtech.api.recipes.RecipeMap
import gregtech.api.recipes.builders.SimpleRecipeBuilder
import gregtech.client.renderer.ICubeRenderer

import gregtech.client.renderer.texture.Textures
import gregtech.common.blocks.BlockGlassCasing
import gregtech.common.blocks.BlockMachineCasing
import gregtech.common.blocks.MetaBlocks
import gregtech.common.blocks.BlockMetalCasing.MetalCasingType

import net.minecraft.init.Blocks
import net.minecraft.util.ResourceLocation

import net.minecraftforge.fml.relauncher.Side
import net.minecraftforge.fml.relauncher.SideOnly


public class MetaTileEntityAirCompressor extends RecipeMapMultiblockController {
    private static final RecipeMap<SimpleRecipeBuilder> AIR_COMPRESSOR_RECIPES = new RecipeMap<>("air_compressor", 0, 0, 1, 1, new SimpleRecipeBuilder(), false)


    public MetaTileEntityAirCompressor(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, AIR_COMPRESSOR_RECIPES)
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntityAirCompressor(metaTileEntityId)
    }

    @Override
    protected BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
            .aisle("SSS", "AAA", "AAA", "AAA", "SSS")
            .aisle("SSS", "AAA", "AAA", "AAA", "SSS")
            .aisle("SSS", "AAA", "ACA", "AAA", "SSS")
            .where("C" as char, selfPredicate())
            .where("S" as char, states(MetaBlocks.METAL_CASING.getState(MetalCasingType.STEEL_SOLID)))
            .where("A" as char, states(MetaBlocks.METAL_CASING.getState(MetalCasingType.ALUMINIUM_FROSTPROOF))
                .setMinGlobalLimited(21)
                .or(autoAbilities()))
            .where("#" as char, air())
            .build()
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
        return Textures.FROST_PROOF_CASING
    }

}