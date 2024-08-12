// Imports
import net.minecraftforge.event.entity.player.ItemTooltipEvent
// ================ Tooltips ================ //
    event_manager.listen { ItemTooltipEvent event ->
    // ======== AE2 ======== //
        if (event.getItemStack() in item('appliedenergistics2:part', 241)) {
            event.getToolTip() << '§cLag warning: consider using an interface.'
        }
        if (event.getItemStack() in item('appliedenergistics2:part', 261)) {
            event.getToolTip() << '§cLag warning: consider using an interface.'
        }
        if (event.getItemStack() in item('appliedenergistics2:part', 240)) {
            event.getToolTip() << '§cLag warning: consider using an interface.'
        }
        if (event.getItemStack() in item('appliedenergistics2:part', 260)) {
            event.getToolTip() << '§cLag warning: consider using an interface.'
        }
        if (event.getItemStack() in item('appliedenergistics2:material', 53)) {
            event.getToolTip() << '§4Extreme lag warning: use sparingly.'
        }
    // ======== GregTech ======== //
        if (event.getItemStack() in metaitem('spray.can.dyes.orange')) {
            event.getToolTip() << '§aWorks on AE2 wires!'
        }
        if (event.getItemStack() in metaitem('spray.can.dyes.magenta')) {
            event.getToolTip() << '§aWorks on AE2 wires!'
        }
        if (event.getItemStack() in metaitem('spray.can.dyes.light_blue')) {
            event.getToolTip() << '§aWorks on AE2 wires!'
        }
        if (event.getItemStack() in metaitem('spray.can.dyes.yellow')) {
            event.getToolTip() << '§aWorks on AE2 wires!'
        }
        if (event.getItemStack() in metaitem('spray.can.dyes.lime')) {
            event.getToolTip() << '§aWorks on AE2 wires!'
        }
        if (event.getItemStack() in metaitem('spray.can.dyes.pink')) {
            event.getToolTip() << '§aWorks on AE2 wires!'
        }
        if (event.getItemStack() in metaitem('spray.can.dyes.gray')) {
            event.getToolTip() << '§aWorks on AE2 wires!'
        }
        if (event.getItemStack() in metaitem('spray.can.dyes.silver')) {
            event.getToolTip() << '§aWorks on AE2 wires!'
        }
        if (event.getItemStack() in metaitem('spray.can.dyes.cyan')) {
            event.getToolTip() << '§aWorks on AE2 wires!'
        }
        if (event.getItemStack() in metaitem('spray.can.dyes.purple')) {
            event.getToolTip() << '§aWorks on AE2 wires!'
        }
        if (event.getItemStack() in metaitem('spray.can.dyes.blue')) {
            event.getToolTip() << '§aWorks on AE2 wires!'
        }
        if (event.getItemStack() in metaitem('spray.can.dyes.brown')) {
            event.getToolTip() << '§aWorks on AE2 wires!'
        }
        if (event.getItemStack() in metaitem('spray.can.dyes.green')) {
            event.getToolTip() << '§aWorks on AE2 wires!'
        }
        if (event.getItemStack() in metaitem('spray.can.dyes.red')) {
            event.getToolTip() << '§aWorks on AE2 wires!'
        }
        if (event.getItemStack() in metaitem('spray.can.dyes.black')) {
            event.getToolTip() << '§aWorks on AE2 wires!'
        }
    // ======== Thermal ======== //
        if (event.getItemStack() in item('thermalexpansion:device', 3)) {
        event.getToolTip() << "§aSap from Oak/Dark Oak."
        event.getToolTip() << "§6Resin from Spruce/Birch/Jungle/Acaica." 
        event.getToolTip() << "§eMushroom Stew from huge mushrooms."
        }
        if (event.getItemStack() in item('thermalexpansion:device')) {
        event.getToolTip() << "§aTruly infinite water."
        }
        if (event.getItemStack() in item('thermalexpansion:device', 9)) {
        event.getToolTip() << "§aSpreads potions in a 9x9x9, splash potions in a 13x13x13," 
        event.getToolTip() << "and lingering potions in 17x17x17."
        event.getToolTip() << "§cRedstone §ato doubles duration, up to 6 minutes."
        event.getToolTip() << "§6Redstone §ato increase potency by 1, up to 4."
        }
    // ======== Translocators ======== //
        if (event.getItemStack() in item('translocators:translocator_part')) {
        event.getToolTip() << "§4Lag warning: use sparingly."
        }

        if (event.getItemStack() in item('translocators:translocator_part', 1)) {
        event.getToolTip() << "§4Lag warning: use sparingly."
        }
    // ======== Extra Utilities 2 ======== //
        if (event.getItemStack() in item('extrautils2:ironwood_sapling', 1)) {
        event.getToolTip() << "§aSprinkle Salis Mundus on it to revive it."
        }
        if (event.getItemStack() in item('extrautils2:ironwood_sapling')) {
        event.getToolTip() << "§aLight it on fire to darken the wood."
        }
    // ======== EIO ======== //
        if (event.getItemStack() in item('enderio:item_yeta_wrench')) {
        event.getToolTip() << "§aConsider using a GregTech wrench instead."
        }
   }     
// ================ Tooltips ================ //
