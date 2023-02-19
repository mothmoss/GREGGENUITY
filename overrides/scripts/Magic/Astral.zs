import mods.jei.JEI.removeAndHide as rh;
import crafttweaker.item.IItemStack;
import crafttweaker.item.IItemDefinition;
import crafttweaker.item.IIngredient;
import crafttweaker.oredict.IOreDict;
import crafttweaker.oredict.IOreDictEntry;
import mods.gregtech.recipe.RecipeMaps;
import mods.gregtech.recipe.RecipeMap;

// ================ Astral Sorcery ================ //
    // ======== Starting Out ======== //
        // ==== Aquamarine ==== //
            // First Time - From Sapphire Lens
                mods.thaumcraft.Crucible.registerRecipe("GGNaquamarinelens", "", 
                <astralsorcery:itemcraftingcomponent>, 
                <metaitem:lensSapphire>, 
                [<aspect:praecantatio> * 20, <aspect:tenebrae> * 20, <aspect:lux> * 20]);
            // Second Time - Duplicating in Crucible
                mods.thaumcraft.Crucible.registerRecipe("GGNaquamarinedupe", "", 
                <astralsorcery:itemcraftingcomponent> * 2, 
                <astralsorcery:itemcraftingcomponent>, 
                [<aspect:praecantatio> * 5, <aspect:tenebrae> * 5, <aspect:lux> * 5]);
            // Non-TC Way - Duplicating at MV with Starlight
                chembath.recipeBuilder()
                .EUt(60)
                .notConsumable(<ore:gemAquamarine>)
                .fluidInputs(<liquid:astralsorcery.liquidstarlight> * 500)
                .outputs(<ore:gemAquamarine>.firstItem)
                .duration(200)
                .buildAndRegister();
        // ==== Resonating Wand ==== //
            mods.astralsorcery.Altar.removeAltarRecipe("astralsorcery:shaped/internal/altar/tool_basicwand");
            recipes.addShaped("GGN_as_resonatingwand", <astralsorcery:itemwand>,
                [
                    [null, <ore:gemAquamarine>, <ore:lensDiamond>],
                    [null, <ore:livingwoodTwig>, <ore:gemAquamarine>],
                    [<ore:livingwoodTwig>, null, null]
                ]);
    // ======== Resources & Components ======== //
        // ==== Runed Marble ==== //
            mods.astralsorcery.Altar.removeAltarRecipe("astralsorcery:shaped/internal/altar/marble_runed");
            // Removing from chiselgroup 
            mods.chisel.Carving.removeVariation("marble", <astralsorcery:blockmarble:6>);
            recipes.remove(<astralsorcery:blockmarble:6>);
            recipes.addShaped(<astralsorcery:blockmarble:6> * 3, 
            [
                [<ore:wireFineSteel>, <ore:wireFineSteel>, <ore:wireFineSteel>],
                [<ore:blockMarble>, <ore:blockMarble>, <ore:blockMarble>],
                [<ore:wireFineSteel>, <ore:wireFineSteel>, <ore:wireFineSteel>]
            ]);   
        // ==== Liquid Starlight ==== //
            // == Lightwell == //
                // Infusion Reicpe
                    mods.astralsorcery.Altar.removeAltarRecipe("astralsorcery:shaped/internal/altar/lightwell");
                    mods.thaumcraft.Infusion.registerRecipe("GGNlightwell", "", <astralsorcery:blockwell> * 2, 10, 
                        [<aspect:lux> * 100, <aspect:tenebrae> * 100], 
                        <thaumcraft:everfull_urn>,
                        [<astralsorcery:blockmarble:6>, <astralsorcery:blockmarble:6>, <astralsorcery:blockmarble:6>,<astralsorcery:blockmarble:6>,
                        ]);                
                // New Lightwell Recipes
        // ==== Rock Crystal ==== //
            // Ore from Diamond - MV
                chembath.recipeBuilder()
                .fluidInputs(<liquid:astralsorcery.liquidstarlight> * 8000)
                .inputs(<ore:oreDiamond> | <ore:oreEndstoneDiamond> | <ore:oreNetherrackDiamond>)
                .outputs(<ore:oreRockCrystal>.firstItem)
                .duration(1000)
                .EUt(64)
                .buildAndRegister();
            // Perfect Crystals - EV
                chembath.recipeBuilder()
                    .EUt(1000)
                    .inputs(<astralsorcery:itemrockcrystalsimple>)
                    .fluidInputs(<liquid:astralsorcery.liquidstarlight> * 16000)
                    .duration(800)
                    .outputs(<astralsorcery:itemrockcrystalsimple>.withTag({astralsorcery: 
                    {crystalProperties: {collectiveCapability: 100, size: 400, fract: 0, purity: 100, sizeOverride: -1}}}))
                    .buildAndRegister();
    // ======== Astral Progression ======== //
        // ==== Altar Upgrades ==== //
            // Tier 1 -> Tier 2
                mods.astralsorcery.Altar.removeAltarRecipe("astralsorcery:shaped/internal/altar/upgrade_tier2");
                mods.astralsorcery.Altar.addDiscoveryAltarRecipe("greggenuity:shaped/internal/altar/upgrade_tier2flawless", 
                <astralsorcery:blockaltar:1>, 200, 200, 
                [
                    <ore:plateThaumium>, <astralsorcery:itemrockcrystalsimple>, <ore:plateThaumium>,
                    <astralsorcery:blockmarble:6>, <forge:bucketfilled>.withTag({FluidName: "astralsorcery.liquidstarlight", Amount: 1000}), <astralsorcery:blockmarble:6>,
                    <astralsorcery:blockmarble:6>, <ore:gemFlawlessDiamond>, <astralsorcery:blockmarble:6>
                ]);
            // Tier 2 -> Tier 3
                mods.astralsorcery.Altar.removeAltarRecipe("astralsorcery:shaped/internal/altar/upgrade_tier3");
                mods.astralsorcery.Altar.addAttunementAltarRecipe("greggenuity:shaped/internal/altar/upgrade_tier3",
                    <astralsorcery:blockaltar:2>, 500, 300,
                    [
                        <ore:plateRoseGold>, <ore:gemExquisiteAquamarine>, <ore:plateRoseGold>,
                        <astralsorcery:blockmarble:6>, <astralsorcery:itemrockcrystalsimple> | <astralsorcery:itemcelestialcrystal>, <astralsorcery:blockmarble:6>,
                        <astralsorcery:blockmarble:2>, <ore:blockAstralStarmetal>, <astralsorcery:blockmarble:2>,
                        <ore:screwManasteel>, <ore:screwManasteel>,
                        <ore:screwManasteel>, <ore:screwManasteel>
                    ]
                );
            // Tier 3 -> Tier 4
                mods.astralsorcery.Altar.removeAltarRecipe("astralsorcery:shaped/internal/altar/upgrade_tier4");
                mods.astralsorcery.Altar.addConstellationAltarRecipe("mypackname:shaped/internal/altar/thisisveryexpensive", 
                <astralsorcery:itemcraftingcomponent:2>, 2000, 10, 
                [
                    <ore:screwStarmetal>, <metaitem:crystal.central_processing_unit>, <ore:screwStarmetal>,
                    <ore:plateTerrasteel>, <astralsorcery:itemcelestialcrystal>, <ore:plateTerrasteel>,
                    <ore:screwStarmetal>, <ore:plateTerrasteel>, <ore:screwStarmetal>,

                    <botania:pylon:1>, <botania:pylon:1>,
                    <botania:pylon:1>, <botania:pylon:1>,

                    <astralsorcery:itemcraftingcomponent:4>, <astralsorcery:itemcraftingcomponent:4>, 
                    <ore:gaiaIngot>, <ore:gaiaIngot>,
                    <ore:gaiaIngot>, <ore:gaiaIngot>,
                    <astralsorcery:itemcraftingcomponent:4>, <astralsorcery:itemcraftingcomponent:4>
                ]);

    // ======== Astral Tools ======== //
        // ==== Shiftstar ==== //
            mods.astralsorcery.Altar.removeAltarRecipe("astralsorcery:shaped/internal/altar/tool_shiftstar");
                mods.astralsorcery.Altar.addAttunementAltarRecipe("greggenuity:shaped/internal/altar/shiftstar",
                <astralsorcery:itemshiftingstar>, 500, 300,
                [
                    <ore:dustAstralStarmetal>, <astralsorcery:itemusabledust>, <ore:dustAstralStarmetal>,
                    <ore:gemFlawlessDiamond>, <minecraft:nether_star>, <ore:gemFlawlessDiamond>,
                    <ore:dustAstralStarmetal>, <astralsorcery:itemusabledust>, <ore:dustAstralStarmetal>,
                    <ore:gemAquamarine>, <ore:gemAquamarine>, 
                    <ore:gemAquamarine>, <ore:gemAquamarine>
                ]);
        // ==== Beacon ==== //
            recipes.remove(<minecraft:beacon>);      
            mods.astralsorcery.Altar.addConstellationAltarRecipe("greggenuity:shaped/internal/altar/netherbeacon",
            <minecraft:beacon>, 2000, 10,
            [
                <ore:plateGlass>, <ore:lensDiamond>, <ore:plateGlass>,
                <ore:plateGlass>, <astralsorcery:itemshiftingstar>, <ore:plateGlass>, 
                <ore:blockDarkSteel>, <ore:blockDarkSteel>, <ore:blockDarkSteel>,

                null, null,
                null, null,

                <ore:blockDiamond>, <ore:blockDiamond>,
                <ore:blockDiamond>, <ore:blockDiamond>,
                <ore:blockDiamond>, <ore:blockDiamond>,
                <ore:blockDiamond>, <ore:blockDiamond>
            ]);
// ================ Astral Sorcery ================ //
 