import gregtech.api.unification.material.Materials
import gregtech.api.unification.Elements
import gregtech.api.unification.material.properties.ToolProperty
import gregtech.api.unification.material.event.MaterialEvent
import gregtech.api.unification.material.Material
import net.minecraft.util.ResourceLocation
import static gregtech.api.unification.material.info.MaterialFlags.*
import gregtech.api.fluids.attribute.FluidAttributes;
import gregtech.api.fluids.FluidBuilder;


// ================ Elements ================ //
    // Created outside the Event Listener
    def quintessenceelement = Elements.add(10, 10, -1, null, "Quintessence", "Qe", false)
    def titantheumelement = Elements.add(10, 10, -1, null, "Titantheum", "Tq", false)
    def resplenditeelement = Elements.add(10, 10, -1, null, "Resplendite", "Rq", false)
// ================ Materials ================ //
    event_manager.listen { MaterialEvent event ->
    // ======== 32001 to 32100: Elements ======== //
        // ==== 32001: Quintessence ==== //
            def quintessence = new Material.Builder(32001, resource("greggenuity", "quintessence")).element("Quintessence").build()
        // ==== 32002: Titantheum ==== //
            def titantheum = new Material.Builder(32002, resource("greggenuity", "titantheum"))
            .liquid().ingot().iconSet("metallic").color(0x1a2420) 
            .element("Titantheum")
            .build()
        // ==== 32003: Resplendite ==== //
            def resplendite = new Material.Builder(32003, resource("greggenuity", "resplendite"))
            .gem().iconSet("certus").color(0xe7ed6b)
            .element("Resplendite")
            .build()
    // ======== 32101 to 32300: Science ======== //
        // ==== 32101: Tungsten Trioxide ==== //
            def tungstentrioxide = new Material.Builder(32101, resource("greggenuity", "tungsten_trioxide"))
                .dust().iconSet("dull").color(0xC7D300)
                .components(material("tungsten") * 1, material("oxygen") * 3)
                .flags("disable_decomposition")
                .build()
        // ==== 32102: Sodium Tungstate ==== //
            def sodium_tungstate = new Material.Builder(32102, resource("greggenuity", "sodium_tungstate"))
                .liquid().color(0x7a7777)
                .flags("disable_decomposition")
                .components(material("sodium") * 2, material("tungsten") * 1, material("oxygen") * 4)
                .build()
        // ==== 32103: Lithium Hydroxide ==== //
            def lithium_hydroxide = new Material.Builder(32103, resource("greggenuity", "lithium_hydroxide"))
                .dust().colorAverage().iconSet("dull")
                .flags("disable_decomposition")
                .components(material("lithium") * 1,  material("oxygen") * 1, material("hydrogen") * 1)
                .build()
        // ==== 32104: Calcium Tungstate ==== //
            def calcium_tungstate = new Material.Builder(32104, resource("greggenuity", "calcium_tungstate"))
                .dust().color(0xFFE700).iconSet("dull")
                .flags("disable_decomposition")
                .components(material("hydrogen") * 2,  material("tungsten") * 2, material("oxygen") * 1)
                .build()
        // ==== 32105: Calcium Hydroxide ==== //
            def calcium_hydroxide = new Material.Builder(32105, resource("greggenuity", "calcium_hydroxide"))
                .dust().colorAverage().iconSet("dull")
                .flags("disable_decomposition")
                .components(material("hydrogen") * 2,  material("calcium") * 1, material("oxygen") * 1)
                .build()
        // ==== 32106: Alumina ==== //
            def alumina = new Material.Builder(32106, resource("greggenuity", "alumina"))
                .dust().color(0x0b585c).iconSet("rough")
                .flags("disable_decomposition")
                .components(material("aluminium") * 2,  material("oxygen") * 3)
                .build()
        // ==== 32107: Cryolite ==== //
            def cryolite = new Material.Builder(32107, resource("greggenuity", "cryolite"))
                .dust().color(0x84b2b3).iconSet("rough")
                .ore(1, 1, true)
                .liquid(new FluidBuilder())
                .flags("disable_decomposition")
                .components(material("sodium") * 3,  material("aluminium") * 1, material("fluorine") * 6)
                .addOreByproducts(material("sodium"), material("alumina"))
                .build()
        // ==== 32108: Toluene Diisocyanate ==== //
            def toluenedi = new Material.Builder(32108, resource("greggenuity", "toluene_diisocyanate"))
                .liquid().colorAverage()
                .flags("disable_decomposition")
                .components(material("toluene") * 1,  material("hydrogen") * 1, material("nitric_acid") * 1, material("sulfuric_acid") * 1)
                .build()
        // ==== 32109: Ethylene Glycol ==== //
            def ethylenegly = new Material.Builder(32109, resource("greggenuity", "ethylene_glycol"))
                .dust().colorAverage().iconSet("rough")
                .flags("disable_decomposition")
                .components(material("ethylene") * 1,  material("hydrogen") * 2, material("oxygen") * 2)
                .build()
        // ==== 32110: Polyurethane ==== //
            def polyurethane = new Material.Builder(32110, resource("greggenuity", "polyurethane"))
                .liquid().polymer().iconSet("shiny").colorAverage()
                .flags("disable_decomposition", "generate_rod", "generate_plate")
                .components(material("ethylene_glycol") * 1,  material("toluene_diisocyanate") * 1)
                .build()
        // ==== 32111: Iron Oxide ==== //
            def ironoxide = new Material.Builder(32111, resource("greggenuity", "iron_oxide"))
                .dust().iconSet("fine").color(0x812116)
                .components(material("iron") * 2, material("oxygen") * 3)
                .flags("decomposition_by_electrolyzing")
                .build()
        // ==== 32112: Superglue ==== //
            def superglue = new Material.Builder(32112, resource("greggenuity", "superglue"))
                .liquid().colorAverage()
                .components(material("acetone") * 2, material("polyvinyl_acetate") * 1)
                .flags("decomposition_by_electrolyzing")
                .build()
        // ==== 32113: Pig Iron ==== //
            def pigiron = new Material.Builder(32113, resource("greggenuity", "pigiron"))
                .dust().iconSet("dull").color(0x877780)
                .components(material("iron") * 1, material("coke") * 2)
                .flags(
                    "disable_decomposition"
                    )
                .build()
        // ==== 32114: Mica-Based ==== //
            def micabased = new Material.Builder(32114, resource("greggenuity", "mica_based"))
                .dust().iconSet("dull").color(0x6c5633)
                .components(material("mica") * 3, material("raw_rubber") * 2)
                .flags(
                    "disable_decomposition", "generate_plate"
                    )
                .build()
        // ==== 32115: Mica-Insulator ==== //
            def micainsulator = new Material.Builder(32115, resource("greggenuity", "mica_insulator"))
                .dust().iconSet("shiny").color(0xe0d4a3)
                .components(material("mica_based") * 4, material("asbestos") * 1)
                .flags(
                    "disable_decomposition", "generate_plate", "generate_foil"
                    )
                .build()    
        // ==== 32116: Concrete Mix ==== //
            def concretemix = new Material.Builder(32116, resource("greggenuity", "concrete_mix"))
                .dust().iconSet("dull").color(0x979797)
                .components(material("concrete") * 1)
                .flags(
                    "disable_decomposition"
                    )
                .build()    
        // ==== 32117: Compressed Air ==== //
            def compressedair = new Material.Builder(32117, resource("greggenuity", "compressed_air"))
                .liquid()
                .components(material("air") * 1)
                .flags(
                    "disable_decomposition"
                    )
                .build()    
        // ==== 32118: Liquid Nitrogen ==== //
            def liquidnitrogen = new Material.Builder(32118, resource("greggenuity", "liquid_nitrogen"))
                .liquid(new FluidBuilder()
                    .color(0xa9cecf)
                    .temperature(63))
                .components(material("nitrogen") * 1)
                .flags(
                    "disable_decomposition"
                    )
                .build()    
        // ==== 32119: Graphite-Epoxy ==== //
            def graphiteepoxy = new Material.Builder(32119, resource("greggenuity", "graphite_epoxy"))
                .ingot().color(0x878176).iconSet("metallic")
                .components(material("graphite") * 1, material("epoxy") * 1)
                .flags("disable_decomposition", "generate_plate", "generate_foil")
                .itemPipeProperties(1000, 6)
                .build()
        // ==== 32120: Lunar Alloy ==== //
            def lunaralloy = new Material.Builder(32120, resource("greggenuity", "lunar_alloy"))
                .color(0x41515b)
                .flags("disable_decomposition", "generate_plate", "generate_dense")
                .components(material("stainless_steel") * 2, material("aluminium") * 2, material("graphite_epoxy") * 2)
                .build()   
        // ==== 32121: Lunar Regolith ==== //
            def lunarregolith = new Material.Builder(32121, resource("greggenuity", "lunar_regolith"))
                .dust().liquid().gem().iconSet("certus")
                .flags("disable_decomposition")
                .components(material("silicon_dioxide") * 1, material("iron_oxide") * 1, material("rutile") * 1, material("alumina") * 1, material("calcium") * 1, material("magnesium") * 1)
                .color(0x43433f)
                .build()
        // ==== 32122: Gas-Rich Lunar Magma ==== //
            def gasrichlunarmagma = new Material.Builder(32122, resource("greggenuity", "gas_rich_lunar_magma"))
                .liquid()
                .components(material("lunar_regolith") * 1, material("chlorine") * 1, material("lightly_hydrocracked_gas") * 1)
                .colorAverage()
                .build()
        // ==== 32123: Superlube ==== //
            def superlube = new Material.Builder(32123, resource("greggenuity", "superlube"))
                .liquid()
                .color(0xff42b6)
                .build()
        // ==== 32124: Sodium Fluoride ==== //
            def sodiumfluoride = new Material.Builder(32124, resource("greggenuity", "sodium_fluoride"))
                .dust().iconSet("dull")
                .components(material("sodium") * 1, material("fluorine") * 1)
                .colorAverage()
                .build()
        // ==== 32125: Aluminium Fluoride ==== //
            def aluminiumfluoride = new Material.Builder(32125, resource("greggenuity", "aluminium_fluoride"))
                .dust().iconSet("dull")
                .components(material("aluminium") * 1, material("fluorine") * 3)
                .colorAverage()
                .build()
    // ======== 32301 to 32400: Magic ======== //
        // ==== 32301: Thaumium ==== //
            def thaumium = new Material.Builder(32301, resource("greggenuity", "thaumium"))
                .ingot().color(0x591f8f).iconSet("dull")
                .components(material("steel") * 1, material("quintessence") * 1)
                .cableProperties(32, 1, 0) // Lossless 
                .flags(
                    "disable_decomposition", "generate_plate", "generate_rod",
                    "generate_ring", "generate_bolt_screw" 
                    )
                .itemPipeProperties(1000, 1)
                .build()
        // ==== 32302: Botanic Mana ==== //
            def concentratedmana = new Material.Builder(32302, resource("greggenuity", "concentrated_mana"))
                .liquid().color(0x41b4dd)
                .components(material("quintessence") * 1)
                .flags("disable_decomposition")
                .build()
        // ==== 32303: Manasteel ==== //
            def manasteel = new Material.Builder(32303, resource("greggenuity", "manasteel"))
                .ingot().color(0x1f80ff).iconSet("metallic")
                .components(material("steel") * 1, material("botanic_mana") * 1)
                .cableProperties(128, 2, 0) // Lossless 
                .flags(
                    "disable_decomposition", "generate_plate", "generate_rod",
                    "generate_ring", "generate_bolt_screw", "no_smelting", "generate_foil"
                    )
                .build()
        // ==== 32304: Starmetal ==== //
            def starmetal = new Material.Builder(32304, resource("greggenuity", "astral_starmetal"))
                .ingot().color(0x002264).iconSet("shiny")
                .components(material("stainless_steel") * 1, material("quintessence") * 1)
                .cableProperties(512, 2, 0)
                .rotorStats(8.75f, 5.0f, 800)
                .flags(
                    "disable_decomposition", "generate_plate", "generate_rod",
                    "generate_ring", "generate_bolt_screw", "no_smelting"
                    )
                .build()
        // ==== 32305: Elementium ==== //
            def elementium = new Material.Builder(32305, resource("greggenuity", "elementium"))
                .ingot().color(0xC543A8).iconSet("metallic")
                .components(material("manasteel") * 1)
                .cableProperties(2048, 3, 0)
                .flags(
                    "disable_decomposition", "generate_plate", "generate_rod",
                    "generate_ring", "generate_bolt_screw", "no_smelting", "generate_foil"
                    )
                .build()
        // ==== 32306: Terrasteel ==== // 
            def terrasteel = new Material.Builder(32306, resource("greggenuity", "terrasteel"))
                .ingot().color(0x50fa00).iconSet("metallic")
                .components(material("astral_starmetal") * 1)
                .cableProperties(8192, 3, 0)
                .rotorStats(8.0f, 8.0f, 1360)
                .flags(
                    "disable_decomposition", "generate_plate", "generate_rod",
                    "generate_ring", "generate_bolt_screw", "no_smelting"
                    )
                .build()
        // ==== 32307: Void ==== // 
            def voidmetal = new Material.Builder(32307, resource("greggenuity", "void"))
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
            def mithrillium = new Material.Builder(32308, resource("greggenuity", "mithrillium"))
                .ingot().color(0x39829d).iconSet("bright")
                .cableProperties(131072, 4, 0)
                .rotorStats(9.5f, 9.5f, 1200)
                .flags(
                    "disable_decomposition", "generate_plate", "generate_rod",
                    "generate_ring", "generate_bolt_screw", "no_smelting"
                    )
                .build()
        // ==== 32309: Aer Infused ==== // 
            def aer = new Material.Builder(32309, resource("greggenuity", "aer_infused"))
                .gem().iconSet("ruby").color(0xefef58)
                .ore(1, 1, true)
                .components(material("quintessence") * 1)
                .flags(
                    "disable_decomposition", "generate_plate", "generate_foil", "generate_dense"
                    )
                .build()
        // ==== 32310: Aqua Infused ==== // 
            def aqua = new Material.Builder(32310, resource("greggenuity", "aqua_infused"))
                .gem().iconSet("ruby").color(0x42d7f4)
                .ore(1, 1, true)
                .components(material("quintessence") * 1)
                .flags(
                    "disable_decomposition", "generate_plate", "generate_foil", "generate_dense"
                    )
                .build()
        // ==== 32311: Perditio Infused ==== // 
            def perditio = new Material.Builder(32311, resource("greggenuity", "perditio_infused"))
                .gem().iconSet("ruby").color(0x4a2b4f)
                .ore(1, 1, true)
                .components(material("quintessence") * 1)
                .flags(
                    "disable_decomposition", "generate_plate", "generate_foil", "generate_dense"
                    )
                .build()
        // ==== 32312: Ignis Infused ==== //
            def ignis = new Material.Builder(32312, resource("greggenuity", "ignis_infused"))
                .gem().iconSet("ruby").color(0xd81d0d)
                .ore(1, 1, true)
                .components(material("quintessence") * 1)
                .flags(
                    "disable_decomposition", "generate_plate", "generate_foil", "generate_dense"
                    )
                .build() 
        // ==== 32313: Ordo Infused ==== //
            def ordo = new Material.Builder(32313, resource("greggenuity", "ordo_infused"))
                .gem().iconSet("ruby").color(0xe0e0d9)
                .ore(1, 1, true)
                .components(material("quintessence") * 1)
                .flags(
                    "disable_decomposition", "generate_plate", "generate_foil", "generate_dense"
                    )
                .build() 
        // ==== 32314: Terra Infused ==== //
            def terra = new Material.Builder(32314, resource("greggenuity", "terra_infused"))
                .gem().iconSet("ruby").color(0x1dba0e)
                .ore(1, 1, true)
                .components(material("quintessence") * 1)
                .flags(
                    "disable_decomposition", "generate_plate", "generate_foil", "generate_dense"
                    )
                .build() 
        // ==== 32315: Petrotheum Base Dust ==== //
            def petrotheumdust = new Material.Builder(32315, resource("greggenuity", "petrotheum_base_dust"))
                .dust()
                .color(0x5e555c)
                .flags("disable_decomposition")
                .components(material("terra_infused") * 1, 
                material("obsidian") * 1, material("redstone") * 1)
                .build()
        // ==== 32316: Dilute Petrotheum ==== //
            def dilutepetrotheum = new Material.Builder(32316, resource("greggenuity", "dilute_petrotheum"))
                .liquid()
                .color(0x2c211c)
                .flags("disable_decomposition")
                .components(material("blaze") * 1, material("terra_infused") * 1, 
                material("obsidian") * 1, material("redstone") * 1)
                .build()
        // ==== 32317: Liquid Vis ==== //
            def vis = new Material.Builder(32317, resource("greggenuity", "vis"))
                .liquid().gem().iconSet("ruby").colorAverage()
                .components(material("aer_infused") * 1, material("aqua_infused") * 1, material("perditio_infused") * 1, material("ordo_infused") * 1, material("ignis_infused") * 1, material("terra_infused") * 1)
                .build()
            material("vis").setFormula("Qe", true)
        // ==== 32318: Resplendic Acid ==== //
            def resplendicacid = new Material.Builder(32318, resource("greggenuity", "resplendic_acid"))
                .liquid().colorAverage()
                .components(material("resplendite") * 1, material("aqua_regia") * 1)
                .flags("disable_decomposition")
                .build()
        // ==== 32319: Titantheum Acetate ==== //
            def titantheumsalt = new Material.Builder(32319, resource("greggenuity", "titantheum_acetate"))
                .liquid().dust().colorAverage()
                .components(material("titantheum") * 1, material("acetic_acid") * 1)
                .flags("disable_decomposition")
                .build()
        // ==== 32320: Flux Sludge ==== //
            def fluxsludge = new Material.Builder(32320, resource("greggenuity", "flux_sludge"))
                .dust().colorAverage()
                .components(material("aer_infused") * 1, material("aqua_infused") * 1, material("ordo_infused") * 1, material("perditio_infused") * 1, material("ignis_infused") * 1, material("terra_infused") * 1, )
                .flags("disable_decomposition")
                .build()
        // ==== 32321: Mana Sludge ==== //
            def manasludge = new Material.Builder(32321, resource("greggenuity", "mana_sludge"))
                .liquid().colorAverage()
                .components(material("concentrated_mana") * 1, material("flux_sludge") * 1)
                .flags("disable_decomposition")
                .build()
        // ==== 32322: Distilled Mana ==== //
            def distilledmana = new Material.Builder(32322, resource("greggenuity", "distilled_mana"))
                .liquid().color(0x8da0c2)
                .flags("disable_decomposition")
                .build()
        // ==== 32323: Mithril ==== //
            def mithril = new Material.Builder(32323, resource("greggenuity", "mithril"))
                .ingot().color(0xd6e5ff).iconSet("bright")
                .rotorStats(7.5, 4.5, 2200)
                .toolStats(toolBuilder(3.5, 3.5, 2000, 3))
                .flags(
                    "disable_decomposition", "generate_plate", "generate_rod",
                    "generate_ring", "generate_bolt_screw", "no_smelting"
                    )
                .build()
    // ======== 32401 to 32500: SciFi ======== //
        // ==== 32401: Darksteel ==== //
            def darksteel = new Material.Builder(32401, resource("greggenuity", "dark_steel"))
                .ingot().color(0x7f7f7f).iconSet("dull")
                .liquid(new FluidBuilder()
                    .temperature(2000)
                )
                .components(material("steel") * 1, material("obsidian") * 1)
                .flags(
                    "disable_decomposition", "generate_plate", "generate_rod", "generate_bolt_screw", "generate_ring"
                    )
                .build()
        // ==== 32402: Pulsating Iron ==== //
            def pulsating = new Material.Builder(32402, resource("greggenuity", "pulsating_iron"))
                .ingot().color(0x9afeb1).iconSet("bright")
                .liquid(new FluidBuilder()
                    .temperature(2200)
                )
                .itemPipeProperties(2000, 2)
                .components(material("iron") * 1, material("beryllium") * 1, material("emerald") * 1)
                .flags(
                    "generate_plate", "generate_rod", "generate_bolt_screw"
                    )
                .build()
        // ==== 32403: Energetic Alloy ==== //
            def energetic = new Material.Builder(32403, resource("greggenuity", "energetic_alloy"))
                .ingot().color(0xdf9c00).iconSet("bright")
                .liquid(new FluidBuilder()
                    .temperature(2200)
                )
                .cableProperties(128, 4, 3) // Good amperage 
                .components(material("pulsating_iron") * 1, material("red_alloy") * 1)
                .flags(
                    "generate_plate", "generate_rod", "generate_bolt_screw"
                    )
                .build()
        // ==== 32404: Vibrant Alloy ==== //
            def vibrant = new Material.Builder(32404, resource("greggenuity", "vibrant_alloy"))
                .ingot().color(0xbac63f).iconSet("bright")
                .liquid(new FluidBuilder()
                    .temperature(2400)
                )
                .blastTemp(2800, "HIGH", 480, 670)
                .fluidPipeProperties(2400, 120, true) // Great fluid pipe 
                .components(material("energetic_alloy") * 1, material("ender_eye") * 1, material("chrome") * 1)
                .flags(
                    "generate_plate", "generate_rod", "generate_bolt_screw", "generate_double_plate"
                    )
                .build()
        // ==== 32405: Endsteel ==== //
            def endsteel = new Material.Builder(32405, resource("greggenuity", "end_steel"))
                .ingot().color(0xcfc97d).iconSet("shiny")
                .components(material("iridium") * 1, material("ender_pearl") * 2, material("dark_steel") * 1)
                .liquid(new FluidBuilder(
                ).temperature(2400))
                .blastTemp(4500, "HIGHER", 1920, 690)
                .flags(
                    "generate_plate", "generate_rod", "generate_bolt_screw"
                    )
                .build() 
        // ==== 32406: Fluix ==== //
            def fluix = new Material.Builder(32406, resource("greggenuity", "fluix"))
                .gem().liquid().iconSet("certus").color(0x915dcd)
                .components(material("certus_quartz") * 1, material("iron") * 1, material("aluminium") * 1, material("oxygen") * 1)
                .flags("disable_decomposition", "generate_lens", "generate_bolt_screw", 
                "generate_plate", "generate_rod", "generate_fine_wire")
                .build()
        // ==== 32407: Fluixsteel ==== //
            def fluixsteel = new Material.Builder(32407, resource("greggenuity", "fluix_steel"))
                .ingot().iconSet("shiny").color(0x4F4A9E)
                .components(material("fluix") * 1, material("steel") * 1, material("rose_gold") * 1)
                .itemPipeProperties(100, 1)
                .flags(
                    "disable_decomposition", "generate_plate", "generate_foil",
                    "generate_rod", "generate_bolt_screw", "generate_double_plate"
                    )                
                .build()
        // ==== 32408: Fluiminium ==== //
            def fluiminium = new Material.Builder(32408, resource("greggenuity", "fluminium"))
                .ingot().iconSet("shiny").color(0x898EDD)
                .components(material("fluix") * 1, material("aluminium") * 1, material("sterling_silver") * 1)
                .fluidPipeProperties(3000, 80, true, true, true, false) // Great fluid pipe
                .flags(
                    "disable_decomposition", "generate_plate", "generate_foil",
                    "generate_rod", "generate_bolt_screw", "generate_double_plate"
                    )                
                .build()        
        // ==== 32409: Desh ==== //
            def desh = new Material.Builder(32409, resource("greggenuity", "desh"))
                .color(0x222222)
                .flags("disable_decomposition", "generate_plate", "generate_dense")
                .iconSet("dull")
                .itemPipeProperties(1000, 4)
                .build()
            material("desh").setFormula("Ti?", true)
        // ==== 32410: Flungstensteel ==== //
            def flungstensteel = new Material.Builder(32410, resource("greggenuity", "flungstensteel"))
                .ingot().iconSet("shiny").color(0x6577e6)
                .components(material("fluix") * 1, material("tungsten_steel") * 1)
                .fluidPipeProperties(5000, 300, true, true, true, true) 
                .flags(
                    "disable_decomposition", "generate_plate",
                    "generate_rod", "generate_bolt_screw"
                    )                
                .build()
        // ==== 32411: Chromatic Steel ==== //
            def chromaticsteel = new Material.Builder(32411, resource("greggenuity", "chromatic_steel"))
                .ingot().iconSet("shiny").colorAverage()
                .components(material("black_steel") * 1, material("red_steel") * 1, material("blue_steel") * 1)
                .blastTemp(5800, "HIGH")
                .build()
        // ==== 32412: Titansteel ==== //
            def titansteel = new Material.Builder(32412, resource("greggenuity", "titansteel"))
                .ingot().iconSet("metallic").colorAverage()
                .components(material("tungsten_steel") * 1, material("chromatic_steel") * 1)
                .blastTemp(6000, "HIGHER")
                .build()
        // ==== 32413: Signalum ==== //
            def signalum = new Material.Builder(32413, resource("greggenuity", "signalum"))
                .ingot().iconSet("shiny").color(0xeb731a)
                .components(material("bronze") * 1, material("red_alloy") * 1)
                .flags("generate_plate", "no_smelting", "generate_bolt_screw" )
                .blastTemp(3000)
                .build()
        // ==== 32414: Enderium ==== //
            def enderium = new Material.Builder(32414, resource("greggenuity", "enderium"))
                .ingot().iconSet("shiny").color(0x1d7e8c)
                .components(material("tungsten") * 1, material("ender_pearl") * 1)
                .flags("generate_plate", "no_smelting", "generate_bolt_screw" )
                .blastTemp(4000)
                .build()
        // ==== 32415: Soularium ==== //
            def soularium = new Material.Builder(32415, resource("greggenuity", "soularium"))
                .ingot().color(0x593E26).iconSet("metallic")
                .components(material("titanium") * 1, material("void") * 1)
                .flags(
                    "disable_decomposition", "generate_plate", "generate_rod", "generate_bolt_screw")
                .build()
        // ==== 32416: Stellar Alloy ==== //
            def stellar = new Material.Builder(32416, resource("greggenuity", "stellar_alloy"))
                .ingot().color(0xfbffe9).iconSet("shiny")
                .components(material("titansteel") * 1, material("nether_star") * 1, material("vibrant_alloy") * 1, material("end_steel") * 1)
                .flags(
                    "disable_decomposition", "generate_plate", "generate_rod", "generate_bolt_screw")
                .build()
        // ==== 32417: Bedrockium ==== //
            def bedrockium = new Material.Builder(32417, resource("greggenuity", "bedrockium"))
                .ingot().color(0x474747).iconSet("rough")
                .flags(
                    "disable_decomposition", "generate_plate", "generate_rod", "generate_bolt_screw")
                .build()
                


    // ======== 32501 to 32600: TBD ======== //
    // ======== 32601 to 32700: TBD ======== //
    // ======== 32701 to 32800: TBD ======== //
    // ======== Additional Flags to Existing Materials ======== //
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
        // ==== Graphite ==== //
            def bluesteel = material("blue_steel")
            bluesteel.addFlags("generate_double_plate")
        // ==== Wood ==== //
            def wood = material("wood")
            //wood.addIngot()
            wood.addFlags("generate_dense", "generate_foil", "generate_rod", "generate_long_rod")
        // ==== Naquadria Solutions ==== //
            material("impure_enriched_naquadah_solution").setFormula("Nq*?")
            material("acidic_enriched_naquadah_solution").setFormula("Nq*?")
            material("impure_naquadria_solution").setFormula("Nq*?")
            material("acidic_naquadria_solution").setFormula("Nq*?")
            material("naquadria_solution").setFormula("Nq*?")
            material("enriched_naquadah_solution").setFormula("Nq*?")

        }
// ================ Materials ================ //
