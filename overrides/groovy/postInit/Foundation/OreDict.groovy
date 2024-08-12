// Imports

// ================ OreDict ================ //
    // ======== Main Script ======== //
        // ===== Blocks ===== //
            def blocksDisabled = [
                //Aluminum
                    "thermalfoundation:storage:4": "blockAluminum",
                    "libvulpes:metal0:9": "blockAluminum",
                    "immersiveengineering:storage:1": "blockAluminum",
                    "immersiveengineering:storage": "blockAluminum",

                //Aluminium
                    "thermalfoundation:storage:4": "blockAluminium",
                    "libvulpes:metal0:9": "blockAluminium",

                //Bronze
                    "thermalfoundation:storage_alloy:3": "blockBronze",

                //Brass
                    "thaumcraft:metal_brass": "blockBrass",

                //Copper
                    "thermalfoundation:storage": "blockCopper",
                    "immersiveengineering:storage": "blockCopper",
                    "libvulpes:metal0:4": "blockCopper",

                //Charcoal
                    "actuallyadditions:block_misc:5": "blockCharcoal",
                    "thermalfoundation:storage_resource": "blockCharcoal",
                    "chisel:block_charcoal2:1": "blockCharcoal",

                //Fuel Coke
                    "immersiveengineering:stone_decoration:3": "fuelCoke",
                    "thermalfoundation:storage_resource:1": "fuelCoke",

                //Electrum
                    "thermalfoundation:storage_alloy:1": "blockElectrum",
                    "immersiveengineering:storage:7": "blockElectrum",

                //Invar
                    "thermalfoundation:storage_alloy:2": "blockInvar",

                //Iridium
                    "thermalfoundation:storage:7": "blockIridium",
                    "libvulpes:metal0:10": "blockIridium",

                //Lead
                    "immersiveengineering:storage:2": "blockLead",
                    "thermalfoundation:storage:3": "blockLead",

                //Nickel
                    "immersiveengineering:storage:4": "blockNickel",
                    "thermalfoundation:storage:5": "blockNickel",

                //Platinum
                    "thermalfoundation:storage:6": "blockPlatinum",

                //Silver
                    "immersiveengineering:storage:3": "blockSilver",
                    "thermalfoundation:storage:2": "blockSilver",

                //Steel
                    "thermalfoundation:storage_alloy": "blockSteel",
                    "libvulpes:metal0:6": "blockSteel",
                    "immersiveengineering:storage:8": "blockSteel",

                //Tin
                    "thermalfoundation:storage:1": "blockTin",
                    "libvulpes:metal0:5": "blockTin",

                //Titanium
                    "libvulpes:metal0:7": "blockTitanium",

                //Uranium
                    "immersiveengineering:storage:5": "blockUranium",
                ]
                blocksDisabled.each { key, val ->
                    ore(val).remove(item(key))
                    mods.jei.ingredient.yeet(item(key))
                }  
        // ===== Dusts ===== //
            def dustsDisabled = [
                //dustAluminum
                    'immersiveengineering:metal:10': "dustAluminum",
                    'thermalfoundation:material:68': "dustAluminum",
                    'libvulpes:productdust:9': "dustAluminum",
                //dustBronze
                    "thermalfoundation:material:99": "dustBronze",

                //dustCertusQuartz
                    "appliedenergistics2:material:2": "dustCertusQuartz",

                //dustCharcoal
                    "thermalfoundation:material:769": "dustCharcoal",

                //dustCoke
                    "immersiveengineering:material:17": "dustCoke",

                //dustCoal
                    "enderio:item_material:23": "dustCoal",
                    "actuallyadditions:item_dust:6": "dustCoal",
                    "thermalfoundation:material:768": "dustCoal",
                    "threng:material:3": "dustCoal",

                //dustCobalt
                    "enderio:item_material:31": "dustCobalt",

                //dustConstantan
                    "thermalfoundation:material:100": "dustConstantan",
                    "immersiveengineering:metal:15": "dustConstantan",

                //dustCopper
                    "enderio:item_material:26": "dustCopper",
                    "thermalfoundation:material:64": "dustCopper",
                    "immersiveengineering:metal:9": "dustCopper",
                    "libvulpes:productdust:4": "dustCopper",

                //dustDilithium
                    "libvulpes:productdust": "dustDilithium",

                //dustDiamond
                    "actuallyadditions:item_dust:2": "dustDiamond",

                //dustElectrum
                    "thermalfoundation:material:97": "dustElectrum",
                    "immersiveengineering:metal:16": "dustElectrum",

                //dustEnderPearl
                    "appliedenergistics2:material:46": "dustEnderPearl",
                    "appliedenergistics2:material:46": "dustEnderPearl",

                //dustEmerald
                    "actuallyadditions:item_dust:3": "dustEmerald",

                //dustEnderium
                    "thermalfoundation:material:103": "dustEnderium",

                //dustGold
                    "actuallyadditions:item_dust:1": "dustGold",
                    "appliedenergistics2:material:51": "dustGold",
                    "enderio:item_material:25": "dustGold",
                    "thermalfoundation:material:1": "dustGold",
                    "immersiveengineering:metal:19": "dustGold",
                    "libvulpes:productdust:2": "dustGold",

                //dustIron
                    "enderio:item_material:24": "dustIron",
                    "actuallyadditions:item_dust": "dustIron",
                    "appliedenergistics2:material:49": "dustIron",
                    "thermalfoundation:material": "dustIron",
                    "immersiveengineering:metal:18": "dustIron",
                    "libvulpes:productdust:1": "dustIron",

                //dustLapis
                    "actuallyadditions:item_dust:4": "dustLapis",
                    "enderio:item_material:32": "dustLapis",

                //dustLead
                    "thermalfoundation:material:67": "dustLead",
                    "immersiveengineering:metal:11": "dustLead",

                //dustLumium
                    "thermalfoundation:material:102": "dustLumium",

                //dustInvar
                    "thermalfoundation:material:98": "dustInvar",

                //dustIridium
                    "thermalfoundation:material:71": "dustIridium",
                    "libvulpes:productdust:10": "dustIridium",

                //dustNetherQuartz
                    "enderio:item_material:33": "dustNetherQuartz",
                    "actuallyadditions:item_dust:5": "dustNetherQuartz",
                    "appliedenergistics2:material:3": "dustNetherQuartz",

                //dustNickel
                    "thermalfoundation:material:69": "dustNickel",
                    "immersiveengineering:metal:13": "dustNickel",

                //dustObsidian
                    "enderio:item_material:29": "dustObsidian",
                    "thermalfoundation:material:770": "dustObsidian",
                    

                //dustPlatinum
                    "thermalfoundation:material:70": "dustPlatinum",

                //dustQuartz
                    "appliedenergistics2:material:3": "dustQuartz",
                    "actuallyadditions:item_dust:5": "dustQuartz",

                //dustSaltpeter
                    "thermalfoundation:material:772": "dustSaltpeter",

                //dustSignalum
                    "thermalfoundation:material:101": "dustSignalum",
                    "immersiveengineering:material:24": "dustSignalum",

                //dustSilver
                    "thermalfoundation:material:66": "dustSilver",
                    "immersiveengineering:metal:12": "dustSilver",


                //dustSilicon
                    "libvulpes:productdust:3": "dustSilicon",

                //dustSteel
                    "thermalfoundation:material:96": "dustSteel",
                    "immersiveengineering:metal:17": "dustSteel",

                //dustSulfur
                    "thermalfoundation:material:771": "dustSulfur",
                    "immersiveengineering:material:25": "dustSulfur",

                //dustFluix
                    "appliedenergistics2:material:8": "dustFluix",

                //dustFlour
                    "appliedenergistics2:material:4": "dustFlour",

                //dustTin
                    "enderio:item_material:27": "dustTin",
                    "thermalfoundation:material:65": "dustTin",
                    "libvulpes:productdust:5": "dustTin",

                //dustUranium
                    "immersiveengineering:metal:14": "dustUranium",

                //dustTitanium
                    "libvulpes:productdust:7": "dustTitanium",

                //dustWood
                    "thermalfoundation:material:800": "dustWood",
                ]
                dustsDisabled.each { key, val ->
                    ore(val).remove(item(key))
                    mods.jei.ingredient.yeet(item(key))
                }  
        // ===== Ingots ===== //
            def ingotsDisabled = [
                //ingotFluixSteel
                    "threng:material": "ingotFluixSteel",

                //ingotAluminium
                    "thermalfoundation:material:132": "ingotAluminium",
                    "immersiveengineering:metal:1": "ingotAluminium",

                //ingotAluminum
                    "thermalfoundation:material:132": "ingotAluminum",
                    "libvulpes:productingot:9": "ingotAluminum",
                
                //ingotBronze
                    "thermalfoundation:material:163": "ingotBronze",

                //ingotBronze
                    "thaumcraft:ingot:2": "ingotBrass",

                //ingotCopper
                    "thermalfoundation:material:128": "ingotCopper",
                    "immersiveengineering:metal": "ingotCopper",
                    "libvulpes:productingot:4": "ingotCopper",
                    
                //ingotConstantan
                    "immersiveengineering:metal:6": "ingotConstantan",

                //ingotElectrum
                    "thermalfoundation:material:161": "ingotElectrum",
                    "immersiveengineering:metal:7": "ingotElectrum",

                //ingotLead
                    "thermalfoundation:material:131": "ingotLead",
                    "immersiveengineering:metal:2": "ingotLead",
                    
                //ingotLumium
                    "thermalfoundation:material:166": "ingotLumium",
                    
                //ingotIridium
                    "thermalfoundation:material:135": "ingotIridium",
                    "libvulpes:productingot:10": "ingotIridium",
                    
                //ingotInvar
                    "thermalfoundation:material:162": "ingotInvar",

                //ingotNickel
                    "thermalfoundation:material:133": "ingotNickel",
                    "immersiveengineering:metal:4": "ingotNickel",
                    
                //ingotPlatinum
                    "thermalfoundation:material:134": "ingotPlatinum",
                    
                //ingotTin
                    "thermalfoundation:material:129": "ingotTin",
                    "libvulpes:productingot:5": "ingotTin",

                //ingotTitanium
                    "libvulpes:productingot:7": "ingotTitanium",

                //ingotUranium
                    "immersiveengineering:metal:5": "ingotUranium",

                //ingotSignalum
                    "thermalfoundation:material:165": "ingotSignalum",

                //ingotSilver
                    "thermalfoundation:material:130": "ingotSilver",
                    "immersiveengineering:metal:3": "ingotSilver",

                //ingotSilicon
                    "libvulpes:productingot:3": "ingotSilicon",

                //ingotSteel
                    "thermalfoundation:material:160": "ingotSteel",
                    "immersiveengineering:metal:8": "ingotSteel",
                    "libvulpes:productingot:6": "ingotSteel",
                ]
                ingotsDisabled.each { key, val ->
                    ore(val).remove(item(key))
                    mods.jei.ingredient.yeet(item(key))
                }  
        // ===== Sticks ===== //
            def sticksDisabled = [
                //stickIron
                    "immersiveengineering:material:1": "stickIron",

                //stickSteel
                    "immersiveengineering:material:2": "stickSteel",
                    "libvulpes:productrod:6": "stickSteel",
                
                //stickAluminum
                    "immersiveengineering:material:3": "stickAluminum",

                //stickAluminium
                    "immersiveengineering:material:3": "stickAluminium",

                //stickCopper
                    "libvulpes:productrod:4": "stickCopper",

                //stickTitanium
                    "libvulpes:productrod:7": "stickTitanium",
                
                //stickIridium
                    "libvulpes:productrod:10": "stickIridium",
                ]
                sticksDisabled.each { key, val ->
                    ore(val).remove(item(key))
                    mods.jei.ingredient.yeet(item(key))
                }  
        // ===== Nuggets ===== //
            def nuggetsDisabled = [
                //nuggetAluminum
                    "thermalfoundation:material:196": "nuggetAluminum",
                    "immersiveengineering:metal:21": "nuggetAluminum",
                    "libvulpes:productnugget:9": "nuggetAluminum",
                    
                //nuggetBronze
                    "thermalfoundation:material:227": "nuggetBronze",

                //nuggetBrass
                    'thaumcraft:nugget:8': "nuggetBrass",

                //nuggetCopper
                    "thaumcraft:nugget:1": "nuggetCopper",
                    "thermalfoundation:material:192": "nuggetCopper",
                    "libvulpes:productnugget:4": "nuggetCopper",


                //nuggetConstantan
                    "thermalfoundation:material:229": "nuggetConstantan",
                    "immersiveengineering:metal:26": "nuggetConstantan",
                    
                //nuggetElectrum
                    "thermalfoundation:material:225": "nuggetElectrum",
                    "immersiveengineering:metal:27": "nuggetElectrum",
                    
                //nuggetEmerald
                    "thermalfoundation:material:17": "nuggetEmerald",
                    "extendedcrafting:material:129": "nuggetEmerald",
                    
                //nuggetDiamond
                    "thermalfoundation:material:16": "nuggetDiamond",
                    "extendedcrafting:material:128": "nuggetDiamond",
                
                //nuggetEnderium
                    "thermalfoundation:material:231": "nuggetEnderium",

                //nuggetInvar
                    "thermalfoundation:material:226": "nuggetInvar",

                //nuggetIridium
                    "thermalfoundation:material:199": "nuggetIridium",
                    "libvulpes:productnugget:10": "nuggetIridium",

                //nuggetIron
                    "thaumcraft:nugget": "nuggetIron",
                    "immersiveengineering:metal:29": "nuggetIron",
                    
                //nuggetLead
                    "thermalfoundation:material:195": "nuggetLead",
                    "thaumcraft:nugget:4": "nuggetLead",
                    
                //nuggetLumium
                    "thermalfoundation:material:230": "nuggetLumium",

                //nuggetNickel
                    "thermalfoundation:material:197": "nuggetNickel",

                //nuggetPlatinum
                    "thermalfoundation:material:198": "nuggetPlatinum",

                //nuggetSteel
                    "thermalfoundation:material:224": "nuggetSteel",
                    "immersiveengineering:metal:28": "nuggetSteel",
                    "libvulpes:productnugget:6": "nuggetSteel",
                    
                //nuggetSilver
                    "thermalfoundation:material:194": "nuggetSilver",
                    "thaumcraft:nugget:3": "nuggetSilver",
                    
                //nuggetSignalum
                    "thermalfoundation:material:229": "nuggetSignalum",

                //nuggetSilicon
                    "libvulpes:productnugget:3": "nuggetSilicon",

                //nuggetTin
                    "thermalfoundation:material:193": "nuggetTin",
                    "thaumcraft:nugget:2": "nuggetTin",
                    "libvulpes:productnugget:5": "nuggetTin",

                //nuggetTitanium,
                    "libvulpes:productnugget:7": "nuggetTitanium",
                ]
                nuggetsDisabled.each { key, val ->
                    ore(val).remove(item(key))
                    mods.jei.ingredient.yeet(item(key))
                }  
        // ===== Ores ===== //
            def oresDisabled = [
                //oreAluminum
                    "immersiveengineering:ore:1": "oreAluminum",
                    "thermalfoundation:ore:4": "oreAluminum",
                    
                //oreCoal
                    "minecraft:coal_ore": "oreCoal",
                    
                //oreCopper
                    "immersiveengineering:ore": "oreCopper",
                    "thermalfoundation:ore": "oreCopper",
                    "libvulpes:ore0:4": "oreCopper",
                    
                //oreCinnabar
                    "thaumcraft:ore_cinnabar": "oreCinnabar",

                //oreDiamond
                    "minecraft:diamond_ore": "oreDiamond",

                //oreDilithium
                    "libvulpes:ore0": "oreDilithium",

                //oreEmerald
                    "minecraft:emerald_ore": "oreEmerald",

                //oreGold
                    "minecraft:gold_ore": "oreGold",

                //oreIridium
                    "thermalfoundation:ore:7": "oreIridium",
                    "libvulpes:ore0:10": "oreIridium",

                //oreIron
                    "minecraft:iron_ore": "oreIron",
                    
                //oreLapis
                    "minecraft:lapis_ore": "oreLapis",

                //oreLead
                    "thermalfoundation:ore:3": "oreLead",
                    "immersiveengineering:ore:2": "oreLead",
                    
                //oreNetherQuartz
                    "minecraft:quartz_ore" : "oreNetherQuartz",

                //oreNickel
                    "immersiveengineering:ore:4": "oreNickel",
                    "thermalfoundation:ore:5": "oreNickel",

                //orePlatinum
                    "thermalfoundation:ore:6": "orePlatinum",

                //oreRedstone
                    "minecraft:redstone_ore": "oreRedstone",

                //oreRutile
                    "libvulpes:ore0:8": "oreRutile",

                //oreQuartz
                    "minecraft:quartz_ore": "oreQuartz",

                //oreTin
                    "thermalfoundation:ore:1": "oreTin",
                    "libvulpes:ore0:5": "oreTin",

                //oreTitanium
                    "libvulpes:ore0:8": "oreTitanium",

                //oreSilver
                    "thermalfoundation:ore:2": "oreSilver",
                    "immersiveengineering:ore:3": "oreSilver",
                    
                //oreUranium
                    "immersiveengineering:ore:5": "oreUranium",
                ]
                oresDisabled.each { key, val ->
                    ore(val).remove(item(key))
                    mods.jei.ingredient.yeet(item(key))
                }  
        // ===== Plates ===== //
            def platesDisabled = [
                //plateAluminum
                    "thermalfoundation:material:324": "plateAluminum",
                    "immersiveengineering:metal:31": "plateAluminum",
                    "libvulpes:productplate:9": "plateAluminum",
                
                //plateBronze
                    "thermalfoundation:material:355": "plateBronze",

                //plateBrass
                    "thaumcraft:plate": "plateBrass",
            
                //plateConstantan
                    "thermalfoundation:material:356": "plateConstantan",
                    "immersiveengineering:metal:36": "plateConstantan",
                    
                //plateCopper
                    "thermalfoundation:material:320": "plateCopper",
                    "immersiveengineering:metal:30": "plateCopper",
                    "libvulpes:productplate:4": "plateCopper",

                //plateElectrum
                    "thermalfoundation:material:353": "plateElectrum",
                    "immersiveengineering:metal:37": "plateElectrum",

                //plateEnderium
                    "thermalfoundation:material:359": "plateEnderium",
                    
                //plateGold
                    "thermalfoundation:material:33": "plateGold",
                    "immersiveengineering:metal:40": "plateGold",
                    "libvulpes:productplate:2": "plateGold",
                    
                //plateInvar
                    "thermalfoundation:material:354": "plateInvar",

                //plateIridium
                    "thermalfoundation:material:327": "plateIridium",
                    "libvulpes:productplate:10": "plateIridium",
                    
                //plateIron
                    "thermalfoundation:material:32": "plateIron",
                    "thaumcraft:plate:1": "plateIron",
                    "immersiveengineering:metal:39": "plateIron",
                    "libvulpes:productplate:1": "plateIron",
                
                //plateLead
                    "thermalfoundation:material:323": "plateLead",
                    "immersiveengineering:metal:32": "plateLead",
                    
                //plateLumium
                    "thermalfoundation:material:358": "plateLumium",

                //plateNickel
                    "thermalfoundation:material:325": "plateNickel",
                    "immersiveengineering:metal:34": "plateNickel",
                    
                //platePlatinum
                    "thermalfoundation:material:326": "platePlatinum",
                    
                //plateSignalum
                    "thermalfoundation:material:357": "plateSignalum",

                //plateSilicon
                    "libvulpes:productplate:3": "plateSilicon",

                //plateSilver
                    "thermalfoundation:material:322": "plateSilver",
                    "immersiveengineering:metal:33": "plateSilver",

                //plateSteel
                    "thermalfoundation:material:352": "plateSteel",
                    "immersiveengineering:metal:38": "plateSteel",
                    "libvulpes:productplate:6": "plateSteel",

                //plateTin
                    "thermalfoundation:material:321": "plateTin",
                    "libvulpes:productplate:5": "plateTin",

                //plateThaumium
                    "thaumcraft:plate:2": "plateThaumium",

                //plateUranium
                    "immersiveengineering:metal:35": "plateUranium",

                //plateTitanium
                    "libvulpes:productplate:7": "plateTitanium",

                //plateVoid
                    "thaumcraft:plate:3": "plateVoid",
                ]
                platesDisabled.each { key, val ->
                    ore(val).remove(item(key))
                    mods.jei.ingredient.yeet(item(key))
                }  
        // ===== Gears ===== //
            def gearsDisabled = [
                //gearAluminum
                    "thermalfoundation:material:260": "gearAluminum",

                //gearBronze
                    "thermalfoundation:material:291": "gearBronze",

                //gearConstantan
                    "thermalfoundation:material:292": "gearConstantan",
                
                //gearCopper
                    "thermalfoundation:material:256": "gearCopper",

                //gearDiamond
                    "thermalfoundation:material:26": "gearDiamond",

                //gearElectrum
                    "thermalfoundation:material:289": "gearElectrum",

                //gearEnderium
                    "thermalfoundation:material:295": "gearEnderium",

                //gearGold
                    "thermalfoundation:material:25": "gearGold",

                //gearInvar
                    "thermalfoundation:material:290": "gearInvar",

                //gearIron
                    "thermalfoundation:material:24": "gearIron",

                //gearIridium
                    "thermalfoundation:material:263": "gearIridium",

                //gearLead
                    "thermalfoundation:material:259": "gearLead",

                //gearLumium
                    "thermalfoundation:material:294": "gearLumium",

                //gearNickel
                    "thermalfoundation:material:261": "gearNickel",

                //gearPlatinum
                    "thermalfoundation:material:262": "gearPlatinum",

                //gearSilver
                    "thermalfoundation:material:258": "gearSilver",

                //gearSignalum
                    "thermalfoundation:material:293": "gearSignalum",

                //gearSteel
                    "thermalfoundation:material:288": "gearSteel",
                    "libvulpes:productgear:6": "gearSteel",

                //gearStone
                    "enderio:item_material:10": "gearStone",

                //gearTin
                    "thermalfoundation:material:257": "gearTin",

                //gearTitanium
                    "libvulpes:productgear:7": "gearTitanium",

                //gearWood
                    "appliedenergistics2:material:40": "gearWood",
                    "enderio:item_material:9": "gearWood",
                    "thermalfoundation:material:22": "gearWood",
                ]
                gearsDisabled.each { key, val ->
                    ore(val).remove(item(key))
                    mods.jei.ingredient.yeet(item(key))
                }  
        // ===== Misc ===== //
            def miscDisabled = [
                    "thermalfoundation:material:802": "fuelCoke",
                    "immersiveengineering:material:6": "fuelCoke"
                ]
                miscDisabled.each { key, val ->
                    ore(val).remove(item(key))
                    mods.jei.ingredient.yeet(item(key))
                }  

    // ======== Non-GT ======== //
        def nonGTDisabled = [
            //Terrasteel
                "nuggetTerrasteel": "nuggetTerrasteel",
                "ingotTerrasteel": "ingotTerrasteel", 

            //Pulsating Iron
                "nuggetPulsatingIron": "nuggetPulsatingIron",
                "ingotPulsatingIron": "ingotPulsatingIron",

            //Vibrating Alloy
                "ingotVibrantAlloy": "ingotVibrantAlloy",
                "nuggetVibrantAlloy": "nuggetVibrantAlloy",

            //Voidmetal
                "nuggetVoid": "nuggetVoid",
                "ingotVoid": "ingotVoid",

            //Elementium
                "nuggetElementium": "nuggetElementium",
                "ingotElementium": "ingotElementium",
            
            //Manasteel
                "nuggetManasteel": "nuggetManasteel",
                "ingotManasteel": "ingotManasteel",       
            
            //Thaumium
                "nuggetThaumium": "nuggetThaumium",
                "ingotThaumium": "ingotThaumium",

            //Mithrillium
                "nuggetMithrillium": "nuggetMithrillium",                
                "ingotMithrillium": "ingotMithrillium",
            //

            ]

    // ======== Tweaks ======== //

// ================ OreDict ================ //
