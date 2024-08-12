// Imports

// ================ Draconic ================ //
    // ======== Definitions ======== //
    // ======== Hiding ======== //
        // ==== Hidemap ==== //
    // ======== Placeholder ======== //
        def placeholderMap = [
            item('draconicevolution:wyvern_core'), 
            item('draconicevolution:wyvern_energy_core'),
            item('draconicevolution:draconium_capacitor'),
            item('draconicevolution:wyvern_sword'),
            item('draconicevolution:wyvern_axe'),
            item('draconicevolution:wyvern_bow'),
            item('draconicevolution:wyvern_pick'),
            item('draconicevolution:wyvern_shovel'),
            item('draconicevolution:wyvern_helm'),
            item('draconicevolution:wyvern_chest'),
            item('draconicevolution:draconic_core'), 
            item('draconicevolution:draconic_energy_core'),
            item('draconicevolution:draconium_capacitor', 1),
            item('draconicevolution:tool_upgrade'),
            item('draconicevolution:tool_upgrade', 1),
            item('draconicevolution:tool_upgrade', 2),
            item('draconicevolution:tool_upgrade', 3),
            item('draconicevolution:tool_upgrade', 4),
            item('draconicevolution:tool_upgrade', 5),
            item('draconicevolution:tool_upgrade', 6),
            item('draconicevolution:tool_upgrade', 7),
            item('draconicevolution:tool_upgrade', 8),
            item('draconicevolution:tool_upgrade', 9),
            item('draconicevolution:tool_upgrade', 10),
            item('draconicevolution:tool_upgrade', 11),
            item('draconicevolution:grinder'),
        ]
                for (entry in placeholderMap) {
                    crafting.removeByOutput(entry)
                }

// ================ Draconic ================ //
