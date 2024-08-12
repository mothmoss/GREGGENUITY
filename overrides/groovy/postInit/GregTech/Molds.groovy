// Imports

// ================ Molds ================ //
    // ======== Chisel ======== //
        // ==== Group ==== //
            mods.chisel.carving.addGroup("gtmolds") 
        // ==== Array ==== // 
            def gtMolds = [
                gtMoldBlank,
                gtMoldPlate,
                gtMoldGear,
                gtMoldCredit,
                gtMoldBottle,
                gtMoldIngot,
                gtMoldBall,
                gtMoldBlock,
                gtMoldNugget,
                gtMoldCylinder,
                gtMoldAnvil,
                gtMoldGearSmall,
                gtMoldRotor,
                gtExtruderPlate,
                gtExtruderRod,
                gtExtruderBolt,
                gtExtruderRing,
                gtExtruderCell,
                gtExtruderIngot,
                gtExtruderWire,
                gtExtruderPipeTiny,
                gtExtruderPipeSmall,
                gtExtruderPipeNormal,
                gtExtruderPipeLarge,
                gtExtruderPipeHuge,
                gtExtruderBlock,
                gtExtruderGear,
                gtExtruderBottle,
                gtExtruderFoil,
                gtExtruderGearSmall,
                gtExtruderRodLong,
                gtExtruderRotor,
            ]
            for (entry in gtMolds) {
                mods.chisel.carving.addVariation("gtmolds", entry)
            }

// ================ Molds ================ //