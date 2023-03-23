import gregtech.api.GregTechAPI.MaterialEvent
import gregtech.api.unification.material.Materials
import gregtech.api.unification.material.Material
import gregtech.api.unification.Elements
import gregtech.api.unification.material.properties.ToolProperty
import gregtech.api.GregTechAPI.PostMaterialEvent


// ================ Elements ================ //
    // Created outside the Event Listener
    def quintessenceelement = Elements.add(10, 10, -1, null, "Quintessence", "Qe", false)
    def titantheumelement = Elements.add(10, 10, -1, null, "Titantheum", "Tq", false)
    def resplenditeelement = Elements.add(10, 10, -1, null, "Resplendite", "Rq", false)
// ================ Materials ================ //
    event_manager.listen { MaterialEvent event ->
    // ======== 32001 to 32100: Elements ======== //
        // ==== 32001: Quintessence ==== //
            def quintessence = new Material.Builder(32001, "quintessence").element("Quintessence").build()
        // ==== 32002: Titantheum ==== //
            def titantheum = new Material.Builder(32002, "titantheum")
            .fluid().ingot().iconSet("metallic").color(0x1a2420) 
            .element("Titantheum")
            .build()
        // ==== 32003: Resplendite ==== //
            def resplendite = new Material.Builder(32003, "resplendite")
            .gem().iconSet("certus").color(0xe7ed6b)
            .element("Resplendite")
            .build()
    // ======== 32101 to 32300: Science ======== //
        // ==== 32101: Tungsten Trioxide ==== //
            def tungstentrioxide = new Material.Builder(32101, "tungsten_trioxide")
                .dust().iconSet("dull").color(0xC7D300)
                .components(material("tungsten") * 1, material("oxygen") * 3)
                .flags("disable_decomposition")
                .build()
        // ==== 32102: Sodium Tungstate ==== //
            def sodium_tungstate = new Material.Builder(32102, "sodium_tungstate")
                .fluid().color(0x7a7777)
                .flags("disable_decomposition")
                .components(material("sodium") * 2, material("tungsten") * 1, material("oxygen") * 4)
                .build()
        // ==== 32103: Lithium Hydroxide ==== //
            def lithium_hydroxide = new Material.Builder(32103, "lithium_hydroxide")
                .dust().colorAverage().iconSet("dull")
                .flags("disable_decomposition")
                .components(material("lithium") * 1,  material("oxygen") * 1, material("hydrogen") * 1)
                .build()
        // ==== 32104: Calcium Tungstate ==== //
            def calcium_tungstate = new Material.Builder(32104, "calcium_tungstate")
                .dust().color(0xFFE700).iconSet("dull")
                .flags("disable_decomposition")
                .components(material("hydrogen") * 2,  material("tungsten") * 2, material("oxygen") * 1)
                .build()
        // ==== 32105: Calcium Hydroxide ==== //
            def calcium_hydroxide = new Material.Builder(32105, "calcium_hydroxide")
                .dust().colorAverage().iconSet("dull")
                .flags("disable_decomposition")
                .components(material("hydrogen") * 2,  material("calcium") * 1, material("oxygen") * 1)
                .build()
        // ==== 32106: Alumina ==== //
            def alumina = new Material.Builder(32106, "alumina")
                .dust().color(0x0b585c).iconSet("rough")
                .flags("disable_decomposition")
                .components(material("aluminium") * 2,  material("oxygen") * 3)
                .build()
        // ==== 32107: Cryolite ==== //
            def cryolite = new Material.Builder(32107, "cryolite")
                .dust().color(0x84b2b3).iconSet("rough")
                .ore(1, 1, true)
                .flags("disable_decomposition")
                .components(material("sodium") * 2,  material("oxygen") * 1, material("fluorine") * 1)
                .addOreByproducts(material("sodium"), material("alumina"))
                .build()
        // ==== 32108: Toluene Diisocyanate ==== //
            def toluenedi = new Material.Builder(32108, "toluene_diisocyanate")
                .fluid().colorAverage()
                .flags("disable_decomposition")
                .components(material("toluene") * 1,  material("hydrogen") * 1, material("nitric_acid") * 1, material("sulfuric_acid") * 1)
                .build()
        // ==== 32109: Ethylene Glycol ==== //
            def ethylenegly = new Material.Builder(32109, "ethylene_glycol")
                .dust().colorAverage().iconSet("rough")
                .flags("disable_decomposition")
                .components(material("ethylene") * 1,  material("hydrogen") * 2, material("oxygen") * 2)
                .build()
        // ==== 32110: Polyurethane ==== //
            def polyurethane = new Material.Builder(32110, "polyurethane")
                .fluid().polymer().iconSet("shiny").colorAverage()
                .flags("disable_decomposition", "generate_rod", "generate_plate")
                .components(material("ethylene_glycol") * 1,  material("toluene_diisocyanate") * 1)
                .build()
        // ==== 32111: Iron Oxide ==== //
            def ironoxide = new Material.Builder(32111, "iron_oxide")
                .dust().iconSet("fine").color(0x812116)
                .components(material("iron") * 2, material("oxygen") * 3)
                .flags("decomposition_by_electrolyzing")
                .build()
        // ==== 32112: Superglue ==== //
            def superglue = new Material.Builder(32112, "superglue")
                .fluid().colorAverage()
                .components(material("acetone") * 2, material("polyvinyl_acetate") * 1)
                .flags("decomposition_by_electrolyzing")
                .build()
        // ==== 32113: Pig Iron ==== //
            def pigiron = new Material.Builder(32113, "pigiron")
                .dust().iconSet("dull").color(0x877780)
                .components(material("iron") * 1, material("coke") * 2)
                .flags(
                    "disable_decomposition"
                    )
                .build()
        // ==== 32114: Mica-Based ==== //
            def micabased = new Material.Builder(32114, "mica_based")
                .dust().iconSet("dull").color(0x6c5633)
                .components(material("mica") * 3, material("raw_rubber") * 2)
                .flags(
                    "disable_decomposition", "generate_plate"
                    )
                .build()
        // ==== 32115: Mica-Insulator ==== //
            def micainsulator = new Material.Builder(32115, "mica_insulator")
                .dust().iconSet("shiny").color(0xe0d4a3)
                .components(material("mica_based") * 4, material("asbestos") * 1)
                .flags(
                    "disable_decomposition", "generate_plate", "generate_foil"
                    )
                .build()    
        // ==== 32116: Concrete Mix ==== //
            def concretemix = new Material.Builder(32116, "concrete_mix")
                .dust().iconSet("dull").color(0x979797)
                .components(material("concrete") * 1)
                .flags(
                    "disable_decomposition"
                    )
                .build()    
        // ==== 32117: Compressed Air ==== //
            def compressedair = new Material.Builder(32117, "compressed_air")
                .fluid()
                .components(material("air") * 1)
                .flags(
                    "disable_decomposition"
                    )
                .build()    
        // ==== 32118: Liquid Nitrogen ==== //
            def liquidnitrogen = new Material.Builder(32118, "liquid_nitrogen")
                .fluid().color(0xa9cecf)
                .fluidTemp(63)
                .components(material("nitrogen") * 1)
                .flags(
                    "disable_decomposition"
                    )
                .build()    
        // ==== 32119: Graphite-Epoxy ==== //
            def graphiteepoxy = new Material.Builder(32119, "graphite_epoxy")
                .ingot().color(0x878176).iconSet("metallic")
                .components(material("graphite") * 1, material("epoxy") * 1)
                .flags("disable_decomposition", "generate_plate", "generate_foil")
                .itemPipeProperties(1000, 6)
                .build()
        // ==== 32120: Lunar Alloy ==== //
            def lunaralloy = new Material.Builder(32120, "lunar_alloy")
                .color(0x41515b)
                .flags("disable_decomposition", "generate_plate", "generate_dense")
                .components(material("stainless_steel") * 2, material("aluminium") * 2, material("graphite_epoxy") * 2)
                .build()   
        // ==== 32121: Lunar Regolith ==== //
            def lunarregolith = new Material.Builder(32121, "lunar_regolith")
                .dust().fluid().gem().iconSet("certus")
                .flags("disable_decomposition")
                .components(material("silicon_dioxide") * 1, material("iron_oxide") * 1, material("rutile") * 1, material("alumina") * 1, material("calcium") * 1, material("magnesium") * 1)
                .color(0x43433f)
                .build()
        // ==== 32122: Gas-Rich Lunar Magma ==== //
            def gasrichlunarmagma = new Material.Builder(32122, "gas_rich_lunar_magma")
                .fluid()
                .components(material("lunar_regolith") * 1, material("chlorine") * 1, material("lightly_hydrocracked_gas") * 1)
                .colorAverage()
                .build()
    // ======== 32301 to 32400: Magic ======== //
        // ==== 32301: Thaumium ==== //
            def thaumium = new Material.Builder(32301, "thaumium")
                .ingot().color(0x591f8f).iconSet("dull")
                .components(material("steel") * 1, material("quintessence") * 1)
                .cableProperties(32, 2, 0) // Lossless 
                .flags(
                    "disable_decomposition", "generate_plate", "generate_rod",
                    "generate_ring", "generate_bolt_screw" 
                    )
                .itemPipeProperties(1000, 1)
                .build()
        // ==== 32302: Botanic Mana ==== //
            def botanic_mana = new Material.Builder(32302, "botanic_mana")
                .fluid().color(0x41b4dd)
                .components(material("quintessence") * 1)
                .flags("disable_decomposition")
                .build()
        // ==== 32303: Manasteel ==== //
            def manasteel = new Material.Builder(32303, "manasteel")
                .ingot().color(0x1f80ff).iconSet("metallic")
                .components(material("steel") * 1, material("botanic_mana") * 1)
                .cableProperties(128, 2, 0) // Lossless 
                .flags(
                    "disable_decomposition", "generate_plate", "generate_rod",
                    "generate_ring", "generate_bolt_screw", "no_smelting", "generate_foil"
                    )
                .build()
        // ==== 32304: Starmetal ==== //
            def starmetal = new Material.Builder(32304, "starmetal")
                .ingot().color(0x002264).iconSet("shiny")
                .components(material("stainless_steel") * 1, material("quintessence") * 1)
                .cableProperties(512, 3, 0)
                .rotorStats(8.75f, 5.0f, 800)
                .flags(
                    "disable_decomposition", "generate_plate", "generate_rod",
                    "generate_ring", "generate_bolt_screw", "no_smelting"
                    )
                .build()
        // ==== 32305: Elementium ==== //
            def elementium = new Material.Builder(32305, "elementium")
                .ingot().color(0xf15cae).iconSet("metallic")
                .components(material("manasteel") * 1)
                .cableProperties(2048, 3, 0)
                .flags(
                    "disable_decomposition", "generate_plate", "generate_rod",
                    "generate_ring", "generate_bolt_screw", "no_smelting", "generate_foil"
                    )
                .build()
        // ==== 32306: Terrasteel ==== // 
            def terrasteel = new Material.Builder(32306, "terrasteel")
                .ingot().color(0x50fa00).iconSet("metallic")
                .components(material("starmetal") * 1)
                .cableProperties(8192, 4, 0)
                .rotorStats(8.0f, 8.0f, 1360)
                .flags(
                    "disable_decomposition", "generate_plate", "generate_rod",
                    "generate_ring", "generate_bolt_screw", "no_smelting"
                    )
                .build()
        // ==== 32307: Void ==== // 
            def voidmetal = new Material.Builder(32307, "void")
                .ingot().color(0x2B0051).iconSet("dull")
                .cableProperties(32768, 4, 0)
                .flags(
                    "disable_decomposition", "generate_plate", "generate_rod",
                    "generate_ring", "generate_bolt_screw", "no_smelting"
                    )
                .build()
            def voidformula = material("void")
            voidformula.setFormula("§5§kV")
        // ==== 32308: Mithrillium ==== // 
            def mithrillium = new Material.Builder(32308, "mithrillium")
                .ingot().color(0x39829d).iconSet("bright")
                .cableProperties(131072, 10, 0)
                .rotorStats(9.5f, 9.5f, 1200)
                .flags(
                    "disable_decomposition", "generate_plate", "generate_rod",
                    "generate_ring", "generate_bolt_screw", "no_smelting"
                    )
                .build()
        // ==== 32309: Aer Infused ==== // 
            def aer = new Material.Builder(32309, "aer_infused")
                .gem().iconSet("ruby").color(0xefef58)
                .ore(1, 1, true)
                .components(material("quintessence") * 1)
                .flags(
                    "disable_decomposition", "generate_plate", "generate_foil", "generate_dense"
                    )
                .build()
        // ==== 32310: Aqua Infused ==== // 
            def aqua = new Material.Builder(32310, "aqua_infused")
                .gem().iconSet("ruby").color(0x42d7f4)
                .ore(1, 1, true)
                .components(material("quintessence") * 1)
                .flags(
                    "disable_decomposition", "generate_plate", "generate_foil", "generate_dense"
                    )
                .build()
        // ==== 32311: Entropy Infused ==== // 
            def entropy = new Material.Builder(32311, "entropy_infused")
                .gem().iconSet("ruby").color(0x4a2b4f)
                .ore(1, 1, true)
                .components(material("quintessence") * 1)
                .flags(
                    "disable_decomposition", "generate_plate", "generate_foil", "generate_dense"
                    )
                .build()
        // ==== 32312: Ignis Infused ==== //
            def ignis = new Material.Builder(32312, "ignis_infused")
                .gem().iconSet("ruby").color(0xd81d0d)
                .ore(1, 1, true)
                .components(material("quintessence") * 1)
                .flags(
                    "disable_decomposition", "generate_plate", "generate_foil", "generate_dense"
                    )
                .build() 
        // ==== 32313: Ordo Infused ==== //
            def ordo = new Material.Builder(32313, "ordo_infused")
                .gem().iconSet("ruby").color(0xe0e0d9)
                .ore(1, 1, true)
                .components(material("quintessence") * 1)
                .flags(
                    "disable_decomposition", "generate_plate", "generate_foil", "generate_dense"
                    )
                .build() 
        // ==== 32314: Terra Infused ==== //
            def terra = new Material.Builder(32314, "terra_infused")
                .gem().iconSet("ruby").color(0x1dba0e)
                .ore(1, 1, true)
                .components(material("quintessence") * 1)
                .flags(
                    "disable_decomposition", "generate_plate", "generate_foil", "generate_dense"
                    )
                .build() 
        // ==== 32315: Petrotheum Base Dust ==== //
            def petrotheumdust = new Material.Builder(32315, "petrotheum_base_dust")
                .dust()
                .color(0x5e555c)
                .flags("disable_decomposition")
                .components(material("terra_infused") * 1, 
                material("obsidian") * 1, material("redstone") * 1)
                .build()
        // ==== 32316: Dilute Petrotheum ==== //
            def dilutepetrotheum = new Material.Builder(32316, "dilute_petrotheum")
                .fluid()
                .color(0x2c211c)
                .flags("disable_decomposition")
                .components(material("blaze") * 1, material("terra_infused") * 1, 
                material("obsidian") * 1, material("redstone") * 1)
                .build()
        // ==== 32317: Liquid Vis ==== //
            def vis = new Material.Builder(32317, "vis")
                .fluid().gem().iconSet("ruby").colorAverage()
                .components(material("aer_infused") * 1, material("aqua_infused") * 1, material("entropy_infused") * 1, material("ordo_infused") * 1, material("ignis_infused") * 1, material("terra_infused") * 1)
                .build()
        // ==== 32318: Resplendic Acid ==== //
            def resplendicacid = new Material.Builder(32318, "resplendic_acid")
                .fluid().colorAverage()
                .components(material("resplendite") * 1, material("aqua_regia") * 1)
                .flags("disable_decomposition")
                .build()
        // ==== 32319: Titantheum Acetate ==== //
            def titantheumsalt = new Material.Builder(32319, "titantheum_acetate")
                .fluid().dust().colorAverage()
                .components(material("titantheum") * 1, material("acetic_acid") * 1)
                .flags("disable_decomposition")
                .build()
        
    // ======== 32401 to 32500: SciFi ======== //
        // ==== 32401: Darksteel ==== //
            def darksteel = new Material.Builder(32401, "dark_steel")
                .ingot().color(0x25252a).iconSet("dull")
                .fluid().fluidTemp(2000)
                .components(material("steel") * 1, material("obsidian") * 1)
                .flags(
                    "disable_decomposition", "generate_plate", "generate_rod", "generate_bolt_screw", "generate_ring"
                    )
                .build()
        // ==== 32402: Pulsating Iron ==== //
            def pulsating = new Material.Builder(32402, "pulsating_iron")
                .ingot().color(0x9afeb1).iconSet("bright")
                .fluid().fluidTemp(2200)
                .itemPipeProperties(2000, 2)
                .components(material("iron") * 1, material("beryllium") * 1, material("emerald") * 1)
                .flags(
                    "disable_decomposition", "generate_plate", "generate_rod", "generate_bolt_screw"
                    )
                .build()
        // ==== 32403: Energetic Alloy ==== //
            def energetic = new Material.Builder(32403, "energetic_alloy")
                .ingot().color(0x9afeb1).iconSet("bright")
                .fluid().fluidTemp(2200)
                .cableProperties(128, 4, 3) // Good amperage 
                .components(material("pulsating_iron") * 1, material("red_alloy") * 1)
                .flags(
                    "disable_decomposition", "generate_plate", "generate_rod", "generate_bolt_screw"
                    )
                .build()
        // ==== 32404: Vibrant Alloy ==== //
            def vibrant = new Material.Builder(32404, "vibrant_alloy")
                .ingot().color(0xbac63f).iconSet("bright")
                .fluid().fluidTemp(2400)
                .fluidPipeProperties(2400, 120, true) // Great fluid pipe 
                .components(material("energetic_alloy") * 1, material("ender_eye") * 1, material("chrome") * 1)
                .flags(
                    "disable_decomposition", "generate_plate", "generate_rod", "generate_bolt_screw"
                    )
                .build()
        // ==== 32405: Endsteel ==== //
            def endsteel = new Material.Builder(32405, "end_steel")
                .ingot().color(0xcec79b).iconSet("dull")
                .fluid().fluidTemp(2400)
                .flags(
                    "disable_decomposition", "generate_plate", "generate_rod", "generate_bolt_screw"
                    )
                .build() 
        // ==== 32406: Fluix ==== //
            def fluix = new Material.Builder(32406, "fluix")
                .gem().fluid().iconSet("certus").color(0x915dcd)
                .components(material("certus_quartz") * 1, material("iron") * 1, material("aluminium") * 1, material("oxygen") * 1)
                .flags("disable_decomposition", "generate_lens", "generate_bolt_screw", 
                "generate_plate", "generate_rod", "generate_fine_wire")
                .build()
        // ==== 32407: Fluixsteel ==== //
            def fluixsteel = new Material.Builder(32407, "fluix_steel")
                .ingot().iconSet("shiny").color(0x4F4A9E)
                .components(material("fluix") * 1, material("steel") * 1, material("chrome") * 1)
                .itemPipeProperties(100, 1)
                .flags(
                    "disable_decomposition", "generate_plate", "generate_foil",
                    "generate_rod", "generate_bolt_screw"
                    )                
                .build()
        // ==== 32408: Fluiminium ==== //
            def fluiminium = new Material.Builder(32408, "fluminium")
                .ingot().iconSet("shiny").color(0x898EDD)
                .components(material("fluix") * 1, material("aluminium") * 1, material("sterling_silver") * 1)
                .fluidPipeProperties(3000, 80, true, true, true, false) // Great fluid pipe
                .flags(
                    "disable_decomposition", "generate_plate", "generate_foil",
                    "generate_rod", "generate_bolt_screw"
                    )                
                .build()        
        // ==== 32409: Desh ==== //
            def desh = new Material.Builder(32409, "desh")
                .color(0x222222)
                .flags("disable_decomposition", "generate_plate", "generate_dense")
                .iconSet("dull")
                .itemPipeProperties(1000, 4)
                .build()
            material("desh").setFormula("Ti?", true)
        // ==== 32410: Flungstensteel ==== //
            def flungstensteel = new Material.Builder(32410, "flungstensteel")
                .ingot().iconSet("shiny").color(0x6577e6)
                .components(material("fluix") * 1, material("tungsten_steel") * 1)
                .fluidPipeProperties(5000, 300, true, true, true, true) 
                .flags(
                    "disable_decomposition", "generate_plate", "generate_foil",
                    "generate_rod", "generate_bolt_screw"
                    )                
                .build()
        // ==== 32411: Chromatic Steel ==== //
            def chromaticsteel = new Material.Builder(32411, "chromatic_steel")
                .ingot().iconSet("shiny").colorAverage()
                .components(material("black_steel") * 1, material("red_steel") * 1, material("blue_steel") * 1)
                .build()
        // ==== 32412: Titansteel ==== //
            def titansteel = new Material.Builder(32412, "titansteel")
                .ingot().iconSet("metallic").colorAverage()
                .components(material("tungsten_steel") * 1, material("chromatic_steel") * 1)
                .build()

    // ======== 32501 to 32600: TBD ======== //
    // ======== 32601 to 32700: TBD ======== //
    // ======== 32701 to 32800: TBD ======== //
        }
    // ======== Additional Flags to Existing Materials ======== //
        event_manager.listen { PostMaterialEvent event ->
        // ==== Stainless ==== //
            def stainless = material("stainless_steel")
            stainless.addFlags("generate_dense")
        // ==== Titanium ==== //
            def titanium = material("titanium")
            titanium.addFlags("generate_dense")
        // ==== Steel ==== //
            def steel = material("steel")
            steel.addFlags("generate_dense")
        // ==== Graphite ==== //
            def graphite = material("graphite")
            graphite.addFlags("generate_plate")
        // ==== Naquadria Solutions ==== //
            material("impure_enriched_naquadah_solution").setFormula("Nq*?")
            material("acidic_enriched_naquadah_solution").setFormula("Nq*?")
            material("impure_naquadria_solution").setFormula("Nq*?")
            material("acidic_naquadria_solution").setFormula("Nq*?")
            material("naquadria_solution").setFormula("Nq*?")
            material("enriched_naquadah_solution").setFormula("Nq*?")
    
        }
// ================ Materials ================ //
