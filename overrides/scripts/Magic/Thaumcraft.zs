import mods.jei.JEI.removeAndHide as rh;
import crafttweaker.item.IItemStack;
import crafttweaker.item.IItemDefinition;
import crafttweaker.item.IIngredient;
import crafttweaker.oredict.IOreDict;
import crafttweaker.oredict.IOreDictEntry;
import mods.gregtech.recipe.RecipeMaps;
import mods.gregtech.recipe.RecipeMap;
import mods.thaumcraft.Crucible as crucible;
import mods.thaumcraft.ArcaneWorkbench as tcbench;
import mods.thaumcraft.SalisMundus;
import mods.thaumcraft.Infusion;

// ================ Thaumcraft ================ //
    // ======== Variables ======== //
        var balanceShard = <contenttweaker:balanceshard>;
        var quicksilver = <thaumcraft:quicksilver>;
        var aquagem = <metaitem:gemAquaInfused>;
        var ignisgem = <metaitem:gemIgnisInfused>;
        var terragem = <metaitem:gemTerraInfused>;
        var aergem = <metaitem:gemAerInfused>;
        var entropygem = <metaitem:gemEntropyInfused>;
        var ordogem = <metaitem:gemOrdoInfused>;
        var aercrystal = <thaumcraft:crystal_essence>.withTag({Aspects: [{amount: 1, key: "aer"}]});
        var terracrystal = <thaumcraft:crystal_essence>.withTag({Aspects: [{amount: 1, key: "terra"}]});
        var aquacrystal = <thaumcraft:crystal_essence>.withTag({Aspects: [{amount: 1, key: "aqua"}]});
        var igniscrystal = <thaumcraft:crystal_essence>.withTag({Aspects: [{amount: 1, key: "ignis"}]});
        var ordocrystal = <thaumcraft:crystal_essence>.withTag({Aspects: [{amount: 1, key: "ordo"}]});
        var entropycrystal = <thaumcraft:crystal_essence>.withTag({Aspects: [{amount: 1, key: "perditio"}]});
        var gtmortar = <ore:gtMortar>;
        var gthammer = <ore:gtHammer>;
        var salismundus = <thaumcraft:salis_mundus>;
        var aquadust = <ore:dustAquaInfused>;
        var ignisdust = <ore:dustIgnisInfused>;
        var terradust = <ore:dustTerraInfused>;
        var aerdust = <ore:dustAerInfused>;
        var entropydust = <ore:dustEntropyInfused>;
        var ordodust = <ore:dustOrdoInfused>;
        var starlight = <liquid:astralsorcery.liquidstarlight>;
        
    // ======== Processing ======== //
        // ==== Quicksilver ==== //
            furnace.remove(quicksilver);
            extractor.recipeBuilder()
            .EUt(16)
            .duration(100)
            .inputs(quicksilver)
            .fluidOutputs(<liquid:mercury> * 144)
            .buildAndRegister();
        // ==== Gems & Shards ==== //
            var tcgemmap as IItemStack[IItemStack] = {
                <metaitem:gemAerInfused> : <thaumcraft:crystal_essence>.withTag({Aspects: [{amount: 1, key: "aer"}]}),
                <metaitem:gemIgnisInfused> : <thaumcraft:crystal_essence>.withTag({Aspects: [{amount: 1, key: "ignis"}]}),
                <metaitem:gemTerraInfused> : <thaumcraft:crystal_essence>.withTag({Aspects: [{amount: 1, key: "terra"}]}),
                <metaitem:gemEntropyInfused> : <thaumcraft:crystal_essence>.withTag({Aspects: [{amount: 1, key: "perditio"}]}),
                <metaitem:gemOrdoInfused> : <thaumcraft:crystal_essence>.withTag({Aspects: [{amount: 1, key: "ordo"}]}),
                <metaitem:gemAquaInfused> : <thaumcraft:crystal_essence>.withTag({Aspects: [{amount: 1, key: "aqua"}]})
            };

            for gem, crystal in tcgemmap {
                recipes.addShaped(gem,
                [
                    [crystal, crystal],
                    [crystal, crystal]
                ]);

                recipes.addShapeless(crystal * 4, [gem]);
            }

            var tcdustmap as IItemStack[IItemStack] = {
                <metaitem:gemAerInfused> : <ore:dustAerInfused>.firstItem,
                <metaitem:gemIgnisInfused> : <ore:dustIgnisInfused>.firstItem,
                <metaitem:gemTerraInfused> : <ore:dustTerraInfused>.firstItem,
                <metaitem:gemEntropyInfused> : <ore:dustEntropyInfused>.firstItem,
                <metaitem:gemOrdoInfused> : <ore:dustOrdoInfused>.firstItem,
                <metaitem:gemAquaInfused> : <ore:dustAquaInfused>.firstItem
            };

            for gem, dust in tcdustmap {
                recipes.addShapeless(dust, [gthammer, gem]
                );
            }


    // ======== Alchemy ======== //
        // ==== Vis Shards ==== //
            recipes.remove(<thaumcraft:nugget:9>);
            furnace.addRecipe(<thaumcraft:nugget:9>, <ore:visCrystals>);
        // ==== Salis Mundus ==== //
            recipes.remove(<thaumcraft:salis_mundus>);
            recipes.addShaped("GGN_tc_salisbad", salismundus,
            [
                [aquadust, terradust, ordodust],
                [ignisdust, aerdust, entropydust],
                [null, gtmortar, null]
            ]);

            alloy.recipeBuilder().EUt(7).duration(10000)
            .inputs(salismundus * 3, <ore:visCrystals>)
            .outputs(balanceShard)
            .buildAndRegister();

            implosion.recipeBuilder().EUt(7).duration(20)
            .inputs(salismundus * 4)
            .outputs(balanceShard * 3)
            .property("explosives", 2)
            .buildAndRegister();

            implosion.recipeBuilder().EUt(7).duration(20)
            .inputs(salismundus * 4)
            .outputs(balanceShard * 3)
            .property("explosives", <metaitem:dynamite>)
            .buildAndRegister();

            crucible.registerRecipe("GGN_balanceshard_aer", "",
            balanceShard, aercrystal,
            [<aspect:ignis>, <aspect:terra>, <aspect:perditio>, <aspect:ordo>, <aspect:aqua>]
            );
            crucible.registerRecipe("GGN_balanceshard_ignis", "",
            balanceShard, igniscrystal,
            [<aspect:aer>, <aspect:terra>, <aspect:perditio>, <aspect:ordo>, <aspect:aqua>]
            );
            crucible.registerRecipe("GGN_balanceshard_terra", "",
            balanceShard, terracrystal,
            [<aspect:ignis>, <aspect:aer>, <aspect:perditio>, <aspect:ordo>, <aspect:aqua>]
            );
            crucible.registerRecipe("GGN_balanceshard_perditio", "",
            balanceShard, entropycrystal,
            [<aspect:ignis>, <aspect:terra>, <aspect:aer>, <aspect:ordo>, <aspect:aqua>]
            );
            crucible.registerRecipe("GGN_balanceshard_ordo", "",
            balanceShard, ordocrystal,
            [<aspect:ignis>, <aspect:terra>, <aspect:perditio>, <aspect:aer>, <aspect:aqua>]
            );
            crucible.registerRecipe("GGN_balanceshard_aqua", "",
            balanceShard, aquacrystal,
            [<aspect:ignis>, <aspect:terra>, <aspect:perditio>, <aspect:ordo>, <aspect:aer>]
            );

            macerator.recipeBuilder().EUt(2).duration(20)
            .inputs(balanceShard)
            .outputs(salismundus)
            .buildAndRegister();

            mixer.recipeBuilder()
            .inputs(aquadust, terradust, ignisdust, aerdust, ordodust, entropydust)
            .outputs(salismundus * 6)
            .fluidInputs(starlight * 6000)
            .EUt(200).duration(200)
            .buildAndRegister();

            mixer.recipeBuilder()
            .inputs(aquadust, terradust, ignisdust, aerdust, ordodust, entropydust)
            .outputs(salismundus * 3)
            .fluidInputs(<liquid:aqua_regia> * 6000)
            .EUt(200).duration(200)
            .buildAndRegister();

            
        // ==== Thaumium  ==== //
            crucible.removeRecipe(<thaumcraft:ingot>);

            mods.thaumcraft.Crucible.registerRecipe("GGNwroughtium", "", <ore:dustSmallThaumium>.firstItem * 2, <ore:ingotWroughtIron>, 
            [<aspect:praecantatio> * 5, <aspect:terra> * 5]);
            mods.thaumcraft.Crucible.registerRecipe("GGNsteelium", "", <thaumcraft:ingot>, <ore:ingotSteel>, 
            [<aspect:praecantatio> * 5, <aspect:terra> * 5]);
        // ==== Alumentum ==== //
            mods.thaumcraft.Crucible.removeRecipe(<thaumcraft:alumentum>);
            mods.thaumcraft.Crucible.registerRecipe("GGNalumentum", "", <thaumcraft:alumentum>, <ore:gemCoke>,
            [<aspect:potentia> * 10, <aspect:ignis> * 10, <aspect:perditio> * 5]);

            // Fueltime increase
            // Reasoning is to be a buff from Coke, since it requires Coke now
            furnace.setFuel(<thaumcraft:alumentum>, 6400);

            // FLAGGED - Low
                // Bad recipe
            chemreactor.recipeBuilder()
            .EUt(128)
            .duration(2400)
            .inputs(<ore:gemCoke>)
            .fluidInputs(<liquid:mana> * 2000)
            .outputs(<thaumcraft:alumentum>)
            .buildAndRegister();
        // ==== Ferrous Wood ==== //
            furnace.remove(<minecraft:iron_nugget>);

            mods.thaumcraft.Crucible.registerRecipe("GGNdeadjuniper", "METALPURIFICATION", 
            <extrautils2:ironwood_sapling:1>, <ore:treeSapling>,
            [<aspect:herba> * 30, <aspect:metallum> * 30]);

            <extrautils2:ironwood_sapling:1>.addTooltip(format.lightPurple("Sprinkle some Salis Mundus to revive it."));
            SalisMundus.addSingleConversion(<extrautils2:ironwood_sapling:1>, <extrautils2:ironwood_sapling>);

            ebf.recipeBuilder()
            .inputs(<ore:ironwood>)
            .fluidInputs(<liquid:acetone> * 1000)
            .outputs(<ore:dustSmallIron>.firstItem * 3)
            .property("temperature", 3000)
            .EUt(8)
            .duration(400)
            .buildAndRegister();
    // ======== Artifice ======== //
        // ==== Vis Resonator ==== //
            tcbench.removeRecipe(<thaumcraft:vis_resonator>);
            tcbench.registerShapedRecipe("GGNvisres", "", 50, 
            [<aspect:aer>, <aspect:aqua>], 
            <thaumcraft:vis_resonator>, 
            [
                [<ore:screwThaumium>, <ore:plateSilver>, <ore:screwThaumium>],
                [<ore:glassHard>, balanceShard, <ore:glassHard>],
                [<ore:screwThaumium>, <ore:plateSilver>, <ore:screwThaumium>],
            ]);
        // ==== Morphic Resonator ==== //
            tcbench.removeRecipe(<thaumcraft:morphic_resonator>);
            tcbench.registerShapedRecipe("GGNmorphres", "", 50, 
            [<aspect:aer>, <aspect:ignis>], 
            <thaumcraft:morphic_resonator>, 
            [
                [<ore:screwThaumium>, <ore:plateBrass>, <ore:screwThaumium>],
                [<ore:glassHard>, balanceShard, <ore:glassHard>],
                [<ore:screwThaumium>, <ore:plateBrass>, <ore:screwThaumium>],
            ]);
        // ==== Simple Mechanism ==== //
            tcbench.removeRecipe(<thaumcraft:mechanism_simple>);
            tcbench.registerShapedRecipe("GGNsimplemech", "", 10, 
            [<aspect:aqua>, <aspect:ignis>], 
            <thaumcraft:mechanism_simple>, 
            [
                [null, <ore:gearBronze>, <ore:screwThaumium>],
                [<ore:screwThaumium>, <ore:ringThaumium>, <ore:stickThaumium>],
                [<ore:plateIron>, <ore:plateIron>, <ore:plateIron>],
            ]);
        // ==== Advanced Mechanism ==== //
            tcbench.removeRecipe(<thaumcraft:mechanism_complex>);
            tcbench.registerShapedRecipe("GGNcomplexmech", "", 10, 
            [<aspect:aqua>, <aspect:ignis>], 
            <thaumcraft:mechanism_complex>, 
            [
                [<ore:screwThaumium>, <thaumcraft:mechanism_simple>, <ore:screwThaumium>],
                [<ore:plateThaumium>, <ore:ringThaumium>, <ore:plateThaumium>],
                [<ore:screwThaumium>, <thaumcraft:mechanism_simple>, <ore:screwThaumium>],
            ]);
        // ==== Wireless Essentia ==== //
            tcbench.removeRecipe(<thaumcraft:essentia_input>);
            tcbench.removeRecipe(<thaumcraft:essentia_output>);

            tcbench.registerShapedRecipe("GGNessentiainput", "", 100,
            [<aspect:aer>, <aspect:aqua>],
            <thaumcraft:essentia_input>,
            [
                [<ore:plateTitaniumCarbide>, <thaumcraft:vis_resonator>, <ore:plateTitaniumCarbide>],
                [<ore:plateBrass>, <ore:circuitEv>, <ore:plateBrass>],
                [<ore:plateTitaniumCarbide>, <thaumcraft:morphic_resonator>, <ore:plateTitaniumCarbide>]
            ]);

            tcbench.registerShapedRecipe("GGNessentiaoutput", "", 100,
            [<aspect:aer>, <aspect:aqua>],
            <thaumcraft:essentia_output>,
            [
                [<ore:plateTitaniumCarbide>, <thaumcraft:morphic_resonator>, <ore:plateTitaniumCarbide>],
                [<ore:plateBrass>, <ore:circuitEv>, <ore:plateBrass>],
                [<ore:plateTitaniumCarbide>, <thaumcraft:vis_resonator>, <ore:plateTitaniumCarbide>]
            ]);
        // ==== Infusion Matrix ==== //
            tcbench.removeRecipe(<thaumcraft:infusion_matrix>);
            tcbench.registerShapedRecipe("GGNrunicmatrix", "", 150, 
            [<aspect:aer>, <aspect:terra>, <aspect:aqua>, <aspect:ignis>, <aspect:ordo>, <aspect:perditio>], 
            <thaumcraft:infusion_matrix>, 
            [
                [<ore:blockDarkSteel>, balanceShard, <ore:blockDarkSteel>],
                [balanceShard, <ore:blockThaumium>, balanceShard],
                [<ore:blockDarkSteel>, balanceShard, <ore:blockDarkSteel>],
            ]);
    // ======== Infusion ======== //
        // ==== Tree Beacon ==== //
            Infusion.registerRecipe("GGN", "", <astralsorcery:blocktreebeacon>, 5, 
                [<aspect:herba> * 1000, <aspect:tenebrae> * 100, <aspect:lux> * 100], 
                <thaumcraft:sapling_silverwood>,
                [<astralsorcery:blockmarble:6>, <astralsorcery:blockmarble:6>, <astralsorcery:blockmarble:6>, <astralsorcery:blockmarble:6>]);   
        // ==== Snad ==== //
            furnace.setFuel(<minecraft:reeds>, 100);
            recipes.remove(<snad:snad>);
            recipes.remove(<snad:snad:1>);
            recipes.addShapeless("GGNredstonesnad", <snad:snad:1>, [<snad:snad>, <ore:dustRedstone>]);
            Infusion.registerRecipe("GGNsnad", "", <snad:snad>, 20, 
                [<aspect:herba> * 1000, <aspect:victus> * 1000], 
                <minecraft:sand>,
                [<extrautils2:compressedsand:1>, <extrautils2:compressedsand:1>, <extrautils2:compressedsand:1>, <extrautils2:compressedsand:1>, <extrautils2:compressedsand:1>,
                <extrautils2:compressedsand:1>, <extrautils2:compressedsand:1>, <extrautils2:compressedsand:1>, <extrautils2:compressedsand:1>, <extrautils2:compressedsand:1>,
                <extrautils2:compressedsand:1>, <extrautils2:compressedsand:1>]);

            Infusion.registerRecipe("GGNsnad2", "", <snad:snad> * 2, 10, 
                [<aspect:herba> * 200, <aspect:victus> * 200], 
                <snad:snad>,
                [<extrautils2:compressedsand:1>, <extrautils2:compressedsand:1>, <extrautils2:compressedsand:1>, <extrautils2:compressedsand:1>
                ]);
        // ==== Peace Candle ==== //
            Infusion.registerRecipe("GGNpeacecandle", "", <randomthings:peacecandle> * 2, 5,
            [<aspect:humanus> * 80, <aspect:praemunio> * 80, <aspect:permutatio> * 80], 
            <cyclicmagic:water_candle>,
            [<ore:plateBrass>, <ore:plateBrass>, <ore:plateBrass>, <ore:plateBrass>]);   
        // ==== Arcane Bore ==== //
            Infusion.removeRecipe(<thaumcraft:turret:2>);
            Infusion.registerRecipe("GGNarcanebore", "ARCANEBORE", <thaumcraft:turret:2>, 20, 
            [<aspect:machina> * 50, <aspect:potentia> * 25, <aspect:terra> * 25, 
            <aspect:vacuos> * 25, <aspect:motus> * 25], 
            <thaumcraft:turret>, 
            [<ore:plateBrass>, <thaumcraft:mechanism_complex>, <thaumcraft:morphic_resonator>, 
            <immersiveengineering:pickaxe_steel>, <immersiveengineering:shovel_steel>]);
    // ======== Fixes ======== //
            // Brass
                recipes.remove(<thaumcraft:plate>);
                recipes.addShapeless("GGN_tc_brassfix", <metaitem:ingotBrass>, [<thaumcraft:ingot:2>]);
            // Obtaining Rare Earths
                mods.thaumcraft.Crucible.registerRecipe("GGNrareearth", "", <thaumcraft:nugget:10>, <ore:dustRareEarth>, 
                    [<aspect:praecantatio> * 5, <aspect:terra> * 5]);
            // Obtaining Amber
                mods.thaumcraft.Crucible.registerRecipe("GGNcinnabar", "", <thaumcraft:amber>, <ore:gemCinnabar>, 
                    [<aspect:lux> * 5, <aspect:terra> * 5]); 

            // Removing recipes that use vanilla tools
                // Arcane Bore
                // Block Breaker
                    Infusion.removeRecipe(<thaumcraft:seal:12>);
                    Infusion.registerRecipe("GGNgolembreaker", "GOLEMBREAKER", <thaumcraft:seal:12>, 20, 
                    [<aspect:instrumentum> * 10, <aspect:perditio> * 10, <aspect:humanus> * 10], 
                    <thaumcraft:seal>, 
                    [<ore:plateDoubleGold>, <ore:plateDoubleGold>, <ore:plateDoubleGold>]);
                // Silverwood makes Birch Doors
                    recipes.addShaped("GGN_silverwoodbirchdoor", <minecraft:birch_door> * 3,
                    [
                        [<thaumcraft:plank_silverwood>, <thaumcraft:plank_silverwood>],
                        [<thaumcraft:plank_silverwood>, <thaumcraft:plank_silverwood>],
                        [<thaumcraft:plank_silverwood>, <thaumcraft:plank_silverwood>]
                    ]);
                // Greatwood makes Dark Oak doors
                    recipes.addShaped("GGN_greatwoodoakdoor", <minecraft:dark_oak_door> * 3,
                    [
                        [<thaumcraft:plank_greatwood>, <thaumcraft:plank_greatwood>],
                        [<thaumcraft:plank_greatwood>, <thaumcraft:plank_greatwood>],
                        [<thaumcraft:plank_greatwood>, <thaumcraft:plank_greatwood>]
                    ]);
    // ======== Aspect Setting ======== //
        // ==== GregTech ==== //
            // Aqua Infused
                aquagem.setAspects(<aspect:aqua> * 4);
                aergem.setAspects(<aspect:aer> * 4);
                ignisgem.setAspects(<aspect:ignis> * 4);
                terragem.setAspects(<aspect:terra> * 4);
                entropygem.setAspects(<aspect:perditio> * 4);
                ordogem.setAspects(<aspect:ordo> * 4);
        
// ================ Thaumcraft ================ //
