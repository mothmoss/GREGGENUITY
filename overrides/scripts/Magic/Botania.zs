import mods.jei.JEI.removeAndHide as rh;
import mods.botaniatweaks.Agglomeration;

// ================ Script Name ================ //
    // ======== Flowers ======== //
        // ==== Pure Daisy ==== //
            mods.botania.Apothecary.removeRecipe(<botania:specialflower>.withTag({type: "puredaisy"}));
            mixer.recipeBuilder()
            .EUt(16)
            .inputs(<ore:petalWhite> * 4, <thaumcraft:salis_mundus>)
            .fluidInputs(<liquid:concrete> * 1000)
            .outputs(<botania:specialflower>.withTag({type: "puredaisy"}))
            .duration(100)
            .buildAndRegister();
            // == Purification Recipes == //
                // Removal
                    mods.botania.PureDaisy.removeRecipe(<botania:livingrock>);
                    mods.botania.PureDaisy.removeRecipe(<botania:livingwood>);
                    mods.botania.PureDaisy.removeRecipe(<minecraft:cobblestone>);
                    mods.botania.PureDaisy.removeRecipe(<minecraft:sand>);
                    mods.botania.PureDaisy.removeRecipe(<minecraft:packed_ice>);
                    mods.botania.PureDaisy.removeRecipe(<minecraft:obsidian>);
                    mods.botania.PureDaisy.removeRecipe(<minecraft:snow>);
                // Concrete -> Livingrock
                    mods.botania.PureDaisy.addRecipe(<gregtech:stone_smooth:4>, <botania:livingrock>);
                // Ferrous Juniper -> Livingwood
                    mods.botania.PureDaisy.addRecipe(<extrautils2:ironwood_log>, <botania:livingwood>);
                    mods.botania.PureDaisy.addRecipe(<extrautils2:ironwood_log:1>, <botania:livingwood>);
        // ==== Endoflame ==== //
            mods.botania.Apothecary.removeRecipe(<botania:specialflower>.withTag({type: "endoflame"}));
            recipes.remove(<botania:floatingspecialflower>.withTag({type: "endoflame"}));
            rh(<botania:specialflower>.withTag({type: "endoflame"}));
            rh(<botania:floatingspecialflower>.withTag({type: "endoflame"}));
        // ==== Orechid ==== //
            mods.botania.Apothecary.removeRecipe(<botania:specialflower>.withTag({type: "orechid"}));
            mods.botania.Apothecary.removeRecipe(<botania:specialflower>.withTag({type: "orechidIgnem"}));
            recipes.remove(<botania:floatingspecialflower>.withTag({type: "orechid"}));
            recipes.remove(<botania:floatingspecialflower>.withTag({type: ""}));
            rh(<botania:specialflower>.withTag({type: "orechidIgnem"}));
            rh(<botania:specialflower>.withTag({type: "orechid"}));
            rh(<botania:floatingspecialflower>.withTag({type: "orechidIgnem"}));
            rh(<botania:floatingspecialflower>.withTag({type: "orechid"}));
    // ======== Resources ======== //
        // ==== Manasteel ==== //
            mods.botania.ManaInfusion.removeRecipe(<botania:storage>);
            mods.botania.ManaInfusion.removeRecipe(<botania:manaresource>);

            mods.botania.ManaInfusion.addInfusion(<ore:dustManasteel>.firstItem * 9, <ore:blockSteel>, 18000);
            mods.botania.ManaInfusion.addInfusion(<ore:dustManasteel>.firstItem, <ore:ingotSteel>, 2000);


            mods.botania.ManaInfusion.addInfusion(<ore:dustManasteel>.firstItem * 9, <ore:blockThaumium>, 16200);
            mods.botania.ManaInfusion.addInfusion(<ore:dustManasteel>.firstItem, <ore:ingotThaumium>, 1800);

            ebf.recipeBuilder()
            .inputs(<ore:dustManasteel>)
            .fluidInputs(<liquid:botanic_mana> * 1000)
            .EUt(64)
            .property("temperature", 2000)
            .duration(200)
            .outputs(<ore:ingotManasteel>.firstItem)
            .buildAndRegister();
        // ==== Mana Powder ==== //
            mods.botania.ManaInfusion.removeRecipe(<botania:manaresource:23>);
            mods.botania.ManaInfusion.addInfusion(<ore:powderMana>.firstItem, <thaumcraft:salis_mundus>, 1000);
        // ==== Terrasteel ==== //
            Agglomeration.removeDefaultRecipe();
            Agglomeration.addRecipe(<ore:dustTerrasteel>.firstItem, [<ore:dustStarmetal>], 30000, 
            0x235DAC, 0x3ebc00, 
            <thaumcraft:infusion_matrix>, <botania:storage>, <botania:livingwood:5>,
            null, null, null);
        // ==== Runes ==== //
            // Blank Runes from Livingrock
                cutter.recipeBuilder()
                .inputs(<ore:livingrock>)
                .outputs(<ore:runeBlank>.firstItem * 8)
                .EUt(64)
                .duration(700)
                .buildAndRegister();
            // Removing default runes
                mods.botania.RuneAltar.removeRecipe(<botania:rune>); //water
                mods.botania.RuneAltar.removeRecipe(<botania:rune:1>); //fire
                mods.botania.RuneAltar.removeRecipe(<botania:rune:2>); //earth
                mods.botania.RuneAltar.removeRecipe(<botania:rune:3>); //air
                mods.botania.RuneAltar.removeRecipe(<botania:rune:4>); //spring
                mods.botania.RuneAltar.removeRecipe(<botania:rune:5>); //summer
                mods.botania.RuneAltar.removeRecipe(<botania:rune:6>); //autumn
                mods.botania.RuneAltar.removeRecipe(<botania:rune:7>); //winter
                mods.botania.RuneAltar.removeRecipe(<botania:rune:8>); //mana
                mods.botania.RuneAltar.removeRecipe(<botania:rune:9>); //lust
                mods.botania.RuneAltar.removeRecipe(<botania:rune:10>); //gluttony
                mods.botania.RuneAltar.removeRecipe(<botania:rune:11>); //greed
                mods.botania.RuneAltar.removeRecipe(<botania:rune:12>); //sloth
                mods.botania.RuneAltar.removeRecipe(<botania:rune:13>); //wrath
                mods.botania.RuneAltar.removeRecipe(<botania:rune:14>); //envy
                mods.botania.RuneAltar.removeRecipe(<botania:rune:15>); //pride
            // ==== Grade 1 - Elements ==== //
                // Water
                    mods.thaumcraft.Infusion.registerRecipe("GGNbotaniawaterrune", "", <ore:runeWaterB>.firstItem, 2, 
                    [<aspect:aqua> * 200], 
                    <ore:runeBlank>, 
                    [<thaumcraft:everfull_urn>, <ore:powderMana>, <ore:plateManasteel>, <ore:plateManasteel>]);
                // Fire
                    mods.thaumcraft.Infusion.registerRecipe("GGNbotaniafirerune", "", <ore:runeFireB>.firstItem, 2, 
                    [<aspect:ignis> * 200], 
                    <ore:runeBlank>, 
                    [<thaumcraft:bellows>, <ore:powderMana>, <ore:plateManasteel>, <ore:plateManasteel>]);
                // Earth 
                    mods.thaumcraft.Infusion.registerRecipe("GGNbotaniaearthrune", "", <ore:runeEarthB>.firstItem, 2, 
                    [<aspect:terra> * 200], 
                    <ore:runeBlank>, 
                    [<thaumcraft:turret:2>, <ore:powderMana>, <ore:plateManasteel>, <ore:plateManasteel>]);
                // Air
                    mods.thaumcraft.Infusion.registerRecipe("GGNbotaniaairrune", "", <ore:runeAirB>.firstItem, 2, 
                    [<aspect:aer> * 200], 
                    <ore:runeBlank>, 
                    [<thaumcraft:cloud_ring>, <ore:powderMana>, <ore:plateManasteel>, <ore:plateManasteel>]);
                // Mana
                    mods.thaumcraft.Infusion.registerRecipe("GGNbotaniaairrune", "", <ore:runeManaB>.firstItem, 2, 
                    [<aspect:praecantatio> * 100], 
                    <ore:runeBlank>, 
                    [<thaumcraft:focus_2>, <ore:powderMana>, <ore:plateManasteel>, <ore:plateManasteel>]);
            // ==== Grade 2 - Seasons ==== //
                // Spring - Air & Fire
                    mods.thaumcraft.Infusion.registerRecipe("GGNbotaniaspringrune", "", <ore:runeSpringB>.firstItem, 2, 
                    [<aspect:aer> * 200, <aspect:ignis> * 200], 
                    <ore:runeBlank>, 
                    [<ore:runeAirB>, <ore:runeFireB>, <ore:springKanthal>, <extrautils2:ironwood_sapling>]);
                // Summer - Earth & Fire
                    mods.thaumcraft.Infusion.registerRecipe("GGNbotaniasummerrune", "", <ore:runeSummerB>.firstItem, 2, 
                    [<aspect:terra> * 200, <aspect:ignis> * 200], 
                    <ore:runeBlank>, 
                    [<ore:runeEarthB>, <ore:runeFireB>, <ore:ingotHotKanthal>, <ore:blockMagma>]);
                // Autumn - Earth & Air
                    mods.thaumcraft.Infusion.registerRecipe("GGNbotaniaautumnrune", "", <ore:runeAutumnB>.firstItem, 2, 
                    [<aspect:terra> * 200, <aspect:ignis> * 200], 
                    <ore:runeBlank>, 
                    [<ore:runeEarthB>, <ore:runeFireB>, <gregtech:metal_casing:2>, <extrautils2:ironwood_sapling:1>]);
                // Winter - Water & Air
                    mods.thaumcraft.Infusion.registerRecipe("GGNbotaniawinterrune", "", <ore:runeWinterB>.firstItem, 2, 
                    [<aspect:aqua> * 200, <aspect:aer> * 200], 
                    <ore:runeBlank>, 
                    [<ore:runeWaterB>, <ore:runeAirB>, <gregtech:metal_casing:3>, <ore:dustIce>]);
            // ==== Grade 3 - Sins ==== //
                // Lust - Air & Summer
                    mods.thaumcraft.Infusion.registerRecipe("GGNbotanialustrune", "", <ore:runeLustB>.firstItem, 2,
                    [<aspect:desiderium> * 200, <aspect:victus> * 200],
                    <ore:runeManaB>,
                    [<ore:runeAirB>, <ore:runeSummerB>]);
                // Gluttony - Fire & Winter
                    mods.thaumcraft.Infusion.registerRecipe("GGNbotaniagluttonyrune", "", <ore:runeGluttonyB>.firstItem, 2,
                    [<aspect:desiderium> * 200, <aspect:bestia> * 200],
                    <ore:runeManaB>,
                    [<ore:runeFireB>, <ore:runeWinterB>]);
                // Greed - Spring & Air
                    mods.thaumcraft.Infusion.registerRecipe("GGNbotaniagreedrune", "", <ore:runeGreedB>.firstItem, 2,
                    [<aspect:desiderium> * 200, <aspect:humanus> * 200],
                    <ore:runeManaB>,
                    [<ore:runeSpringB>, <ore:runeAirB>]);
                // Sloth - Autumn & Air
                    mods.thaumcraft.Infusion.registerRecipe("GGNbotaniaslothrune", "", <ore:runeSlothB>.firstItem, 2,
                    [<aspect:desiderium> * 200, <aspect:terra> * 200],
                    <ore:runeManaB>,
                    [<ore:runeAutumnB>, <ore:runeAirB>]);
                // Wrath - Earth & Winter
                    mods.thaumcraft.Infusion.registerRecipe("GGNbotaniawrathrune", "", <ore:runeWrathB>.firstItem, 2,
                    [<aspect:desiderium> * 200, <aspect:exitium> * 200],
                    <ore:runeManaB>,
                    [<ore:runeEarthB>, <ore:runeWinterB>]);
                // Envy - Water & Winter
                    mods.thaumcraft.Infusion.registerRecipe("GGNbotaniaenvyrune", "", <ore:runeEnvyB>.firstItem, 2,
                    [<aspect:desiderium> * 200, <aspect:visum> * 200],
                    <ore:runeManaB>,
                    [<ore:runeWaterB>, <ore:runeWinterB>]);
                // Pride - Fire & Summer
                    mods.thaumcraft.Infusion.registerRecipe("GGNbotaniapriderune", "", <ore:runePrideB>.firstItem, 2,
                    [<aspect:desiderium> * 200, <aspect:imperium> * 200],
                    <ore:runeManaB>,
                    [<ore:runeFireB>, <ore:runeSummerB>]);


    // ======== Items ======== //
        // ==== Tools ==== //
            // Ring of the Mantle
            recipes.remove(<botania:miningring>);
            mods.botania.RuneAltar.addRecipe(<botania:miningring>, 
            [<ore:ringManasteel>, <ore:runeEarthB>, <ore:gemSugar>], 
            20000);  
    // ======== Misc ======== //
        // ==== Botania Mortar Replacement ==== //
            recipes.remove(<botania:pestleandmortar>);
            rh(<botania:pestleandmortar>);
            recipes.replaceAllOccurences(<botania:pestleandmortar>, <ore:gtMortar>);
        // ==== Extremely Important Recipe ==== //
            // Added to appease a bird of foul omen and wretched portent.
            // Probably has no actual gameplay use.
                mods.botania.Apothecary.addRecipe(<minecraft:red_mushroom> * 4, [<ore:egg>, <ore:egg>, <ore:egg>, <ore:egg>]);
                <minecraft:red_mushroom>.addTooltip(format.aqua("A seed of a greater being."));
                <minecraft:brown_mushroom>.addTooltip(format.aqua("A seed of a greater being."));
                <minecraft:egg>.addTooltip(format.aqua("A seed of a greater being."));

// ================ Script Name ================ //
 