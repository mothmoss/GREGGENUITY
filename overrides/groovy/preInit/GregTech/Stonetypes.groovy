import gregtech.api.GregTechAPI.MaterialEvent
import gregtech.api.unification.material.Materials
import gregtech.api.unification.material.info.MaterialIconType
import gregtech.api.unification.ore.OrePrefix
import gregtech.api.unification.ore.StoneType
import net.minecraft.block.SoundType
import micdoodle8.mods.galacticraft.core.GCBlocks
import micdoodle8.mods.galacticraft.core.blocks.BlockBasicMoon

// ================ Stonetypes ================ //
    // ==== Adding stonetypes for other planets for visual consistency. ==== //
    // Thanks to Tech22 & Brachy for all the help
        event_manager.listen { MaterialEvent event ->
            OrePrefix oreMoonRock = new OrePrefix("oreMoonRock", -1, null, MaterialIconType.ore, OrePrefix.Flags.ENABLE_UNIFICATION, OrePrefix.Conditions.hasOreProperty)
            StoneType MOONROCK = new StoneType(16, "moonrock", SoundType.STONE, oreMoonRock, Materials.Copper,
                    () -> GCBlocks.blockMoon.getStateFromMeta(4), state -> state.getBlock() instanceof BlockBasicMoon && state == GCBlocks.blockMoon.getStateFromMeta(4), false)
        }
// ================ Stonetypes ================ //