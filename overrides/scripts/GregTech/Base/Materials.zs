#loader gregtech
import mods.gregtech.material.MaterialBuilder;
import mods.gregtech.material.Material;
import mods.gregtech.material.MaterialRegistry;

// ================ Materials ================ //
    // ======== New Materials ======== //
        // ======== Magic Base Metals (LV to LUV) - 32001 to 32007 ======== //
            // ==== Thaumium 32001 ==== //
                var thaumium = MaterialBuilder(32001, "thaumium")
                    .ingot()
                    .color(0x591f8f)
                    .toolStats(16, 4, 2000, 7)
                    .cableProperties(32, 4, 2)
                    .components([<material:iron> * 1])
                    .flags(["disable_decomposition", "generate_plate", "generate_foil", "generate_fine_wire", "generate_rod", "generate_bolt_screw", "generate_ring"])
                    .iconSet("shiny")
                    .itemPipeProperties(1000, 1)
                    .build();
                <material:thaumium>.setFormula("Fe§dQe", true);
            // ==== Manasteel 32002 ==== //
                var manasteel = MaterialBuilder(32002, "manasteel")
                    .ingot()
                    .color(0x1f80ff)
                    .toolStats(16, 5, 3000, 8)
                    .cableProperties(128, 4, 2)
                    .components([<material:blue_alloy> * 1])
                    .flags(["no_smelting", "disable_decomposition", "generate_plate", "generate_foil", "generate_fine_wire", "generate_rod", "generate_bolt_screw", "generate_ring"])
                    .iconSet("shiny")
                    .build();
                <material:manasteel>.setFormula("Fe§bQe", true);
            // ==== Starmetal 32003 ==== //
                var starmetal = MaterialBuilder(32003, "starmetal")
                    .ingot()
                    .color(0x002264)
                    .toolStats(17, 6, 6000, 9)
                    .cableProperties(512, 4, 2)
                    .rotorStats(8.75f, 5.0f, 800)
                    .flags(["generate_plate", "generate_foil", "generate_fine_wire", "generate_rod", "generate_bolt_screw"])
                    .iconSet("shiny")
                    .build();
                <material:starmetal>.setFormula("Fe6CrMnNi§bQe", true);
            // ==== Elementium 32004 ==== //
                var elementium = MaterialBuilder(32004, "elementium")
                    .ingot()
                    .color(0xf15cae)
                    .toolStats(17, 7, 10000, 10)
                    .cableProperties(2048, 5, 2)
                    .flags(["generate_plate", "generate_foil", "generate_fine_wire", "generate_rod", "generate_bolt_screw"])
                    .iconSet("shiny")
                    .build();
                <material:elementium>.setFormula("§dEl§bQe");
            // ==== Terrasteel 32005 ==== //
                var terrasteel = MaterialBuilder(32005, "terrasteel")
                    .ingot()
                    .color(0x46c806)
                    .toolStats(18, 7, 12000, 11)
                    .cableProperties(8192, 5, 2)
                    .flags(["generate_plate", "generate_foil", "generate_fine_wire", "generate_rod", "generate_bolt_screw"])
                    .iconSet("shiny")
                    .blastTemp(4000, "HIGH")
                    .build();
                <material:terrasteel>.setFormula("Fe§dEl§bQe2", true);
            // ==== Voidmetal 32006 ==== //
                var voidmetal = MaterialBuilder(32006, "void")
                    .ingot()
                    .color(0x2B0051)
                    .toolStats(18, 9, 20000, 12)
                    .cableProperties(32768, 6, 2)
                    .flags(["generate_plate", "generate_foil", "generate_fine_wire", "generate_rod", "generate_bolt_screw"])
                    .iconSet("dull")
                    .build();
                <material:void>.setFormula("§5§kV");
            // ==== Mithrillium 32007 ==== //
                var mithrillium = MaterialBuilder(32007, "mithrillium")
                    .ingot()
                    .color(0x39829d)
                    .toolStats(19, 10, 40000, 13)
                    .cableProperties(131072, 10, 2)
                    .flags(["generate_plate", "generate_foil", "generate_fine_wire", "generate_rod", "generate_bolt_screw"])
                    .iconSet("dull")
                    .build();

        // ==== Pig Iron 32008 ==== //
            var pigiron = MaterialBuilder(32008, "pigiron")
                .dust()
                .components([<material:iron> * 1, <material:coke> * 2])
                .color(0x877780)
                .flags("disable_decomposition")
                .iconSet("dull")
                .build();
        // ======== TC Ores - 32009 to 32014 ======== //
            // ==== Aer Infused 32009 ==== //
                var aer = MaterialBuilder(32009, "aer_infused")
                    .gem()
                    .ore(1, 1, true)
                    .color(0xefef58)
                    .iconSet("ruby")
                    .build();
            // ==== Aqua Infused 32010 ==== //
                var aqua = MaterialBuilder(32010, "aqua_infused")
                    .gem()
                    .ore(1, 1, true)
                    .color(0x42d7f4)
                    .iconSet("ruby")
                    .build();
            // ==== Entropy Infused 32011 ==== //
                var entropy = MaterialBuilder(32011, "entropy_infused")
                    .gem()
                    .ore(1, 1, true)
                    .color(0x4a2b4f)
                    .iconSet("ruby")
                    .build();
            // ==== Ignis Infused 32012 ==== //
                var ignis = MaterialBuilder(32012, "ignis_infused")
                    .gem()
                    .ore(1, 1, true)
                    .color(0xd81d0d)
                    .iconSet("ruby")
                    .build();
            // ==== Ordo Infused 32013 ==== //
                var ordo = MaterialBuilder(32013, "ordo_infused")
                    .gem()
                    .ore(1, 1, true)
                    .color(0xe0e0d9)
                    .iconSet("ruby")
                    .build();
            // ==== Terra Infused 32014 ==== //
                var terra = MaterialBuilder(32014, "terra_infused")
                    .gem()
                    .ore(1, 1, true)
                    .color(0x1dba0e)
                    .iconSet("ruby")
                    .build();
        // ======== GCYL Mica - 32015 to 32016 ======== //
            // ==== Mica Based 32015 ==== //
                var micabased = MaterialBuilder(32015, "mica_based")
                    .dust()
                    .color(0x6c5633)
                    .iconSet("dull")
                    .flags(["generate_plate", "disable_decomposition"])
                    .components([<material:mica> * 3, <material:raw_rubber> * 2])
                    .build();
            // ==== Mica Insulator 32016 ==== //
                var micainsulator = MaterialBuilder(32016, "mica_insulator")
                    .dust()
                    .color(0xe0d4a3)
                    .iconSet("shiny")
                    .flags(["generate_plate", "generate_foil", "disable_decomposition"])
                    .components([<material:mica_based> * 4, <material:asbestos> * 1])
                    .build();
        // ======== EnderIO - 32017 to 32021 ======== //
            // ==== Darksteel 32017 ==== //
                var darksteel = MaterialBuilder(32017, "dark_steel")
                    .ingot()
                    .fluid()
                    .fluidTemp(2000)
                    .color(0x25252a)
                    .flags(["generate_plate", "generate_foil", "generate_fine_wire", "generate_rod", "generate_bolt_screw", "generate_ring"])
                    .components([<material:steel> * 1, <material:obsidian> * 1])
                    .iconSet("shiny")
                    .build();
            // ==== Pulsating Iron 32018 ==== //
                var pulsating = MaterialBuilder(32018, "pulsating_iron")
                    .ingot()
                    .fluid()
                    .fluidTemp(2200)
                    .color(0x9afeb1)
                    .itemPipeProperties(2000, 2)
                    .flags(["generate_plate", "generate_foil", "generate_fine_wire", "generate_rod", "generate_bolt_screw", "generate_ring"])
                    .components([<material:iron> * 1, <material:beryllium> * 1, <material:emerald> * 1])
                    .iconSet("shiny")
                    .build();
            // ==== Energetic Alloy 32019 ==== //
                var energetic = MaterialBuilder(32019, "energetic_alloy")
                    .ingot()
                    .fluid()
                    .fluidTemp(2200)
                    .color(0xdd6401)
                    .flags(["generate_plate", "generate_foil", "generate_fine_wire", "generate_rod", "generate_bolt_screw", "generate_ring"])
                    .components([<material:pulsating_iron> * 1, <material:red_alloy> * 1])
                    .iconSet("shiny")
                    .build();
            // ==== Vibrant Alloy 32020 ==== //
                var vibrant = MaterialBuilder(32020, "vibrant_alloy")
                    .ingot()
                    .fluid()
                    .fluidTemp(2400)
                    .color(0xbac63f)
                    .fluidPipeProperties(2400, 120, true)
                    .blastTemp(3000, "HIGH")
                    .flags(["generate_plate", "generate_foil", "generate_fine_wire", "generate_rod", "generate_bolt_screw", "generate_ring", "generate_frame"])
                    .components([<material:energetic_alloy> * 1, <material:ender_eye> * 1])
                    .iconSet("shiny")
                    .build();
            // ==== Endsteel 32021 ==== //
                var end = MaterialBuilder(32021, "end_steel")
                    .ingot()
                    .fluid()
                    .fluidTemp(2400)
                    .color(0xcec79b)
                    .flags(["generate_plate", "generate_foil", "generate_fine_wire", "generate_rod", "generate_bolt_screw", "generate_ring"])
                    .components([<material:vibrant_alloy> * 1, <material:dark_steel> * 1, <material:endstone> * 1])
                    .iconSet("shiny")
                    .build();
        // ==== Tungsten Trioxide 32022 ==== //
            var tungsten_trioxide = MaterialBuilder(32022, "tungsten_trioxide")
                .dust()
                .color(0xC7D300).iconSet("dull")
                .flags("disable_decomposition")
                .components([<material:tungsten> * 1, <material:oxygen> * 3])
                .build();
        // ======== NomiCEU Platline - 32023 to 32052 ======== //
            // I love you Tracer
            // ==== Platinum Metallic Powder 32023 ==== //
                var platinum_metallic = MaterialBuilder(32023, "platinum_metallic")
                    .dust()
                    .color(0xfffbc5).iconSet("metallic")
                    .flags("disable_decomposition")
                    .components([<material:platinum> * 1, <material:rare_earth> * 1])
                    .build();
            // ==== Palladium Metallic Powder 32024 ==== //
                var palladium_metallic = MaterialBuilder(32024, "palladium_metallic")
                    .dust()
                    .color(0x808080).iconSet("metallic")
                    .flags("disable_decomposition")
                    .components([<material:palladium> * 1, <material:rare_earth> * 1])
                    .build();
            // ==== Ammonium Hexachloroplatinate 32025 ==== //
                var ammonium_hexachloroplatinate = MaterialBuilder(32025, "ammonium_hexachloroplatinate")
                    .dust()
                    .color(0xfef0c2).iconSet("metallic")
                    .flags("disable_decomposition")
                    .components([<material:nitrogen> * 2, <material:hydrogen> * 8, <material:platinum> * 1, <material:chlorine> * 6])
                    .build();
                <material:ammonium_hexachloroplatinate>.setFormula("(NH4)2PtCl6", true);
            // ==== Chloroplatinic Acid 32026 ==== //
                var chloroplatinic_acid = MaterialBuilder(32026, "chloroplatinic_acid")
                    .fluid()
                    .color(0xfef0c2)
                    .flags("disable_decomposition")
                    .components([<material:hydrogen> * 2, <material:platinum> * 1, <material:chlorine> * 6])
                    .build();
            // ==== Potassium Bisulfate 32027 ==== //
                var potassium_bisulfate = MaterialBuilder(32027, "potassium_bisulfate")
                    .dust()
                    .color(0xfdbd68)
                    .components([<material:potassium> * 1, <material:hydrogen> * 1, <material:sulfur> * 1, <material:oxygen> * 4])
                    .build();
            // ==== Potassium Pyrosulfate 32028 ==== //
                var potassium_pyrosulfate = MaterialBuilder(32028, "potassium_pyrosulfate")
                    .dust()
                    .color(0xfbbb66)
                    .components([<material:potassium> * 2, <material:sulfur> * 2, <material:oxygen> * 7])
                    .build();
            // ==== Potassium Sulfate 32029 ==== //
                var potassium_sulfate = MaterialBuilder(32029, "potassium_sulfate")
                    .dust()
                    .color(0xf0b064).iconSet("metallic")
                    .components([<material:potassium> * 2, <material:sulfur> * 1, <material:oxygen> * 4])
                    .build();
            // ==== Zinc Sulfate 32030 ==== //
                var zinc_sulfate = MaterialBuilder(32030, "zinc_sulfate")
                    .dust()
                    .color(0x846649).iconSet("fine")
                    .components([<material:zinc> * 1, <material:sulfur> * 1, <material:oxygen> * 4])
                    .build();
            // ==== Sodium Nitrate 32031 ==== //
                var sodium_nitrate = MaterialBuilder(32031, "sodium_nitrate")
                    .dust()
                    .color(0x846684).iconSet("rough")
                    .components([<material:sodium> * 1, <material:nitrogen> * 1, <material:oxygen> * 3])
                    .build();
            // ==== Rhodium Nitrate 32032 ==== //
                var rhodium_nitrate = MaterialBuilder(32032, "rhodium_nitrate")
                    .dust()
                    .color(0x776649).iconSet("fine")
                    .flags("disable_decomposition")
                    .components([<material:rhodium> * 1, <material:nitrogen> * 3, <material:oxygen> * 9])
                    .build();
                <material:rhodium_nitrate>.setFormula("Rh(NO3)3", true);
            // ==== Sodium Ruthenate 32033 ==== //
                var sodium_ruthenate = MaterialBuilder(32033, "sodium_ruthenate")
                    .dust()
                    .color(0x3a40cb).iconSet("shiny")
                    .flags("disable_decomposition")
                    .components([<material:sodium> * 2, <material:ruthenium> * 1, <material:oxygen> * 4])
                    .build();
            // ====Sodium Peroxide 32034 ==== //
                var sodium_peroxide = MaterialBuilder(32034, "sodium_peroxide")
                    .dust()
                    .color(0xecff80).iconSet("rough")
                    .components([<material:sodium> * 2, <material:oxygen> * 2])
                    .build();
            // ==== Iridium Dioxide Residue 32035 ==== //
                var iridium_dioxide_residue = MaterialBuilder(32035, "iridium_dioxide_residue")
                    .dust()
                    .color(0x17182e).iconSet("rough")
                    .flags("disable_decomposition")
                    .components([<material:iridium> * 1, <material:oxygen> * 2, <material:rare_earth> * 1])
                    .build();
            // ==== Ammonium Hexachloroiridiate 32036 ==== //
                var ammonium_hexachloroiridiate = MaterialBuilder(32036, "ammonium_hexachloroiridiate")
                    .dust()
                    .color(0x644629).iconSet("rough")
                    .flags("disable_decomposition")
                    .components([<material:nitrogen> * 2, <material:hydrogen> * 8, <material:iridium> * 1, <material:chlorine> * 6])
                    .build();
                <material:ammonium_hexachloroiridiate>.setFormula("(NH4)2IrCl6", true);
            // ==== Platinum Group Residue 32037 ==== //
                var platinum_group_residue = MaterialBuilder(32037, "platinum_group_residue")
                    .dust()
                    .color(0x64632e).iconSet("rough")
                    .flags("disable_decomposition")
                    .components([<material:iridium> * 1, <material:osmium> * 1, <material:rhodium> * 1, <material:ruthenium> * 1, <material:rare_earth> * 1])
                    .build();
            // ==== Palladium Rich Ammonia 32038 ==== //
                var palladium_rich_ammonia = MaterialBuilder(32038, "palladium_rich_ammonia")
                    .fluid()
                    .color(0x808080)
                    .flags("disable_decomposition")
                    .components([<material:ammonia> * 2, <material:palladium> * 1, <material:chlorine> * 1])
                    .build();
            // ==== Crude Platinum Residue 32039 ==== //
                var crude_platinum_residue = MaterialBuilder(32039, "crude_platinum_residue")
                    .dust()
                    .color(0xfffbc5).iconSet("dull")
                    .flags("disable_decomposition")
                    .components([<material:platinum_raw> * 1])
                    .build();
            // ==== Crude Palladium Residue 32040 ==== //
                var crude_palladium_residue = MaterialBuilder(32040, "crude_palladium_residue")
                    .dust()
                    .color(0x909090).iconSet("dull")
                    .flags("disable_decomposition")
                    .components([<material:palladium_raw> * 1])
                    .build();
            // ==== Iridium Group Sludge 32041 ==== //
                var iridium_group_sludge = MaterialBuilder(32041, "iridium_group_sludge")
                    .dust()
                    .color(0x644629).iconSet("dull")
                    .flags("disable_decomposition")
                    .components([<material:iridium> * 1, <material:osmium> * 1, <material:ruthenium> * 1, <material:rare_earth> * 1])
                    .build();
            // ==== Rhodium Sulfate Solution 32042 ==== //
                var rhodium_sulfate_solution = MaterialBuilder(32042, "rhodium_sulfate_solution")
                    .fluid()
                    .color(0xffbb66)
                    .flags("disable_decomposition")
                    .components([<material:rhodium_sulfate> * 1, <material:water> * 1])
                    .build();
                <material:rhodium_sulfate>.addDust();
            // ==== Crude Rhodium Residue 32043 ==== //
                var crude_rhodium_residue = MaterialBuilder(32043, "crude_rhodium_residue")
                    .dust()
                    .color(0x666666).iconSet("dull")
                    .flags("disable_decomposition")
                    .components([<material:rhodium> * 2, <material:water> * 1])
                    .build();
            // ==== Rhodium Salt 32044 ==== //
                var rhodium_salt = MaterialBuilder(32044, "rhodium_salt")
                    .dust()
                    .color(0x848484).iconSet("shiny")
                    .flags("disable_decomposition")
                    .components([<material:salt> * 2, <material:rhodium> * 2, <material:chlorine> * 6])
                    .build();
                <material:rhodium_salt>.setFormula("(NaCl)2(RhCl3)2", true);
            // ==== Acidic Iridium Dioxide Solution 32045 ==== //
                var acidic_iridium_dioxide_solution = MaterialBuilder(32045, "acidic_iridium_dioxide_solution")
                    .fluid()
                    .color(0x27284e)
                    .flags("disable_decomposition")
                    .components([<material:iridium_dioxide_residue> * 1, <material:hydrochloric_acid> * 4])
                    .build();
            // ==== Platinum Palladium Leachate 32046 ==== //
                var platinum_palladium_leachate = MaterialBuilder(32046, "platinum_palladium_leachate")
                    .fluid()
                    .color(0xffffc5)
                    .flags("disable_decomposition")
                    .components([<material:platinum> * 1, <material:palladium> * 1, <material:aqua_regia> * 1])
                    .build();
            // ==== Methyl Formate 32047 ==== //
                var methyl_formate = MaterialBuilder(32047, "methyl_formate")
                    .fluid()
                    .color(0xffaaaa)
                    .flags("disable_decomposition")
                    .components([<material:carbon> * 2, <material:hydrogen> * 4, <material:oxygen> * 2])
                    .build();
                <material:methyl_formate>.setFormula("HCOOCH3", true);
            // ==== Formic Acid 32048 ==== //
                var formic_acid = MaterialBuilder(32048, "formic_acid")
                    .fluid()
                    .color(0xffffc5)
                    .flags("disable_decomposition")
                    .components([<material:carbon> * 1, <material:hydrogen> * 2, <material:oxygen> * 2])
                    .build();
                <material:formic_acid>.setFormula("HCOOH", true);
            // ==== Sodium Methoxide 32049 ==== //
                var sodium_methoxide = MaterialBuilder(32049, "sodium_methoxide")
                    .dust()
                    .color(0xd0d0f0).iconSet("dull")
                    .flags("disable_decomposition")
                    .components([<material:carbon> * 1, <material:hydrogen> * 3, <material:oxygen> * 1, <material:sodium> * 1])
                    .build();
            // ==== Hydrogen Peroxid 32050 ==== //
                var hydrogen_peroxide = MaterialBuilder(32050, "hydrogen_peroxide")
                    .fluid()
                    .color(0xd2ffff)
                    .components([<material:hydrogen> * 2, <material:oxygen> * 2])
                    .build();
            // ==== Phthalic Anhydride 32051 ==== //
                var phthalic_anhydride = MaterialBuilder(32051, "phthalic_anhydride")
                    .dust()
                    .flags("disable_decomposition")
                    .color(0xeeaaee).iconSet("dull")
                    .components([<material:carbon> * 8, <material:hydrogen> * 4, <material:oxygen> * 3])
                    .build();
                <material:phthalic_anhydride>.setFormula("C6H4(CO)2O", true);
            // ==== Ethylanthraquinone 32052 ==== //
                var ethylanthraquinone = MaterialBuilder(32052, "ethylanthraquinone")
                    .dust()
                    .color(0xf1e181)
                    .flags("disable_decomposition")
                    .components([<material:carbon> * 16, <material:hydrogen> * 12, <material:oxygen> * 2])
                    .build();
                <material:ethylanthraquinone>.setFormula("C6H4(CO)2C6H3(CH2CH3)", true);
        // ==== Concrete Mix 32053 ==== //
            var concretemix = MaterialBuilder(32053, "concrete_mix")
                .dust()
                .color(0x979797)
                .build();
        // ======== Lunar Materials - 32054 to 32055 ======== //
            // ==== Moon Dust 32054 ==== //
                var moondust = MaterialBuilder(32054, "moondust")
                    .fluid()
                    .dust()
                    .components([<material:silicon_dioxide> * 1, <material:aluminium> * 1, <material:calcium> * 1, <material:rutile> * 1])
                    .color(0xA0928C)
                    .flags("disable_decomposition")
                    .build();
            // ==== Lunar Residue Fluid 32055 ==== //
                var moonliquid = MaterialBuilder(32055, "moonliquid")
                    .fluid()
                    .fluidTemp(150)
                    .components([<material:chlorine> * 1, <material:helium> * 1, <material:moondust> * 1])
                    .colorAverage()
                    .flags("disable_decomposition")
                    .build();
        // ==== Compressed Air 32056 ==== //
            var compressedair = MaterialBuilder(32056, "compressedair")
                .fluid("gas")
                .components([<material:air> * 1])
                .flags("disable_decomposition")
                .build();
        // ==== Liquid Nitrogen 32057 ==== //
            var liquidnitrogen = MaterialBuilder(32057, "liquid_nitrogen")
                .fluid("fluid")
                .fluidTemp(63)
                .color(0xa9cecf)
                .components([<material:nitrogen> * 1])
                .flags("disable_decomposition")
                .build();
        // ==== Botanic Mana 32058 ==== //
            var mana = MaterialBuilder(32058, "botanic_mana")
                .fluid()
                .color(0x41b4dd)
                .build();
            <material:botanic_mana>.setFormula("§bQe"); 
        // ======== Tungsten Process - 32059 to 32062 ======== //
            // ==== Sodium Tungstate 32059 ==== //
                var sodium_tungstate = MaterialBuilder(32059, "sodium_tungstate")
                    .fluid()
                    .color(0x7a7777)
                    .flags("disable_decomposition")
                    .components([<material:sodium> * 2, <material:tungsten> * 1, <material:oxygen> * 4])
                    .build();
            // ==== Lithium Hydroxide 32060 ==== //
                var lithium_hydroxide = MaterialBuilder(32060, "lithium_hydroxide")
                    .dust()
                    .colorAverage()
                    .iconSet("dull")
                    .flags("disable_decomposition")
                    .components([<material:lithium> * 1,  <material:oxygen> * 1, <material:hydrogen> * 1])
                    .build();
            // ==== Calcium Tungstate 32061 ==== //
                var calcium_tungstate = MaterialBuilder(32061, "calcium_tungstate")
                    .dust()
                    .color(0xFFE700)
                    .iconSet("dull")
                    .flags("disable_decomposition")
                    .components([<material:hydrogen> * 2,  <material:tungsten> * 2, <material:oxygen> * 1])
                    .build();
            // ==== Calcium Hydroxide 32062 ==== //
                var calcium_hydroxide = MaterialBuilder(32062, "calcium_hydroxide")
                    .dust()
                    .colorAverage()
                    .iconSet("dull")
                    .flags("disable_decomposition")
                    .components([<material:hydrogen> * 2,  <material:calcium> * 1, <material:oxygen> * 1])
                    .build();
        // ======== Graphite-Reinforced Epoxy 32063 ======== //
            var graphiteepoxy = MaterialBuilder(32063, "graphite_epoxy")
                    .ingot()
                    .color(0x878176)
                    .components([<material:graphite> * 1, <material:epoxy> * 1])
                    .flags(["generate_plate", "generate_foils"])
                    .iconSet("metallic")
                    .itemPipeProperties(1000, 6)
                    .build();
        // ======== Magichem P1 - 32064 to 32065 ======== //
            // ==== Petrotheum Base Dust 32064 ==== //
                var petrotheumdust = MaterialBuilder(32064, "petrotheum_base_dust")
                    .dust()
                    .color(0x5e555c)
                    .flags("disable_decomposition")
                    .components([<material:terra_infused> * 1, 
                    <material:obsidian> * 1, <material:redstone> * 1])
                    .build();
            // ==== Dilute Petrotheum 32065 ==== //
                var dilutepetrotheum = MaterialBuilder(32065, "dilute_petrotheum")
                    .fluid()
                    .color(0x2c211c)
                    .flags("disable_decomposition")
                    .components([<material:blaze> * 1, <material:terra_infused> * 1, 
                    <material:obsidian> * 1, <material:redstone> * 1])
                    .build();
        // ======== Space P1 - 32066 to 32069 ======== //
            // ==== Lunar Alloy 32066 ==== //
                var lunaralloy = MaterialBuilder(32066, "lunar_alloy")
                    .color(0x41515b)
                    .flags("disable_decomposition", "generate_plate", "generate_dense")
                    .components([<material:stainless_steel> * 2, <material:aluminium> * 2, <material:graphite_epoxy> * 2])
                    .build();

    // ======== Additional Flags to Existing Materials ======== //
        // ==== Sterling Silver ==== //
            var sterling = MaterialRegistry.get("sterling_silver");
            sterling.addFlags("generate_foil");
        // ==== Stainless ==== //
            var stainless = MaterialRegistry.get("stainless_steel");
            stainless.addFlags("generate_dense");
        // ==== Titanium ==== //
            var titanium = MaterialRegistry.get("titanium");
            titanium.addFlags("generate_dense");
        // ==== Steel ==== //
            var steel = MaterialRegistry.get("steel");
            steel.addFlags("generate_dense");
        // ==== Graphite ==== //
            var graphite = MaterialRegistry.get("graphite");
            graphite.addFlags("generate_plate");

// ================ Script Name ================ //
