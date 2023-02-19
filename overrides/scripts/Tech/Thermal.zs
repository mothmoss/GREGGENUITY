#priority 1000
import mods.jei.JEI.removeAndHide as rh;
import crafttweaker.item.IItemStack;
import crafttweaker.item.IItemDefinition;
import crafttweaker.item.IIngredient;
import crafttweaker.oredict.IOreDict;
import crafttweaker.oredict.IOreDictEntry;
import mods.gregtech.recipe.RecipeMaps;
import mods.gregtech.recipe.RecipeMap;

# ================ Thermal ================ #
    # ======== Hiding ======== #
        val CryogenicDissolution = [   
                <thermalexpansion:machine>,
                <thermalexpansion:machine:1>,
                <thermalexpansion:machine:2>,
                <thermalexpansion:machine:3>,
                <thermalexpansion:machine:5>,
                <thermalexpansion:machine:6>,
                <thermalexpansion:machine:7>,
                <thermalexpansion:machine:8>,
                <thermalexpansion:machine:9>,
                <thermalexpansion:machine:10>,
                <thermalexpansion:machine:11>,
                <thermalexpansion:machine:12>,
                <thermalexpansion:machine:14>,
                <thermalexpansion:machine:15>,
                <thermalexpansion:device:1>,
                <thermalexpansion:device:2>,
                <thermalexpansion:device:3>,
                <thermalexpansion:device:4>,
                <thermalexpansion:device:7>,
                <thermalexpansion:device:8>,
                <thermalexpansion:device:9>,
                <thermalexpansion:device:10>,
                <thermalexpansion:device:11>,
                <thermalexpansion:device:12>,
                <thermalexpansion:dynamo>,
                <thermalexpansion:dynamo:1>,
                <thermalexpansion:dynamo:2>,
                <thermalexpansion:dynamo:3>,
                <thermalexpansion:dynamo:4>,
                <thermalexpansion:dynamo:5>,
                <thermalexpansion:cell>,
                <thermalexpansion:frame>,
                <thermalexpansion:frame:64>,
                <thermalexpansion:frame:128>,
                <thermalexpansion:frame:129>,
                <thermalexpansion:frame:130>,
                <thermalexpansion:frame:131>,
                <thermalexpansion:frame:132>,
                <thermalexpansion:frame:146>,
                <thermalexpansion:frame:147>,
                <thermalexpansion:frame:148>,
                <thermalexpansion:augment:128>,
                <thermalexpansion:augment:129>,
                <thermalexpansion:augment:130>,
                <thermalexpansion:augment:256>,
                <thermalexpansion:augment:257>,
                <thermalexpansion:augment:258>,
                <thermalexpansion:augment:273>,
                <thermalexpansion:augment:288>,
                <thermalexpansion:augment:303>,
                <thermalexpansion:augment:304>,
                <thermalexpansion:augment:336>,
                <thermalexpansion:augment:337>,
                <thermalexpansion:augment:352>,
                <thermalexpansion:augment:368>,
                <thermalexpansion:augment:369>,
                <thermalexpansion:augment:400>,
                <thermalexpansion:augment:401>,
                <thermalexpansion:augment:402>,
                <thermalexpansion:augment:416>,
                <thermalexpansion:augment:432>,
                <thermalexpansion:augment:433>,
                <thermalexpansion:augment:448>,
                <thermalexpansion:augment:496>,
                <thermalexpansion:augment:497>,
                <thermalexpansion:augment:512>,
                <thermalexpansion:augment:513>,
                <thermalexpansion:augment:514>,
                <thermalexpansion:augment:515>,
                <thermalexpansion:augment:576>,
                <thermalexpansion:augment:640>,
                <thermalexpansion:augment:656>,
                <thermalexpansion:augment:672>,
                <thermalexpansion:augment:673>,
                <thermalexpansion:augment:674>,
                <thermalexpansion:augment:688>,
                <thermalexpansion:augment:704>,
                <thermalexpansion:augment:720>,
                <thermalfoundation:coin>,
                <thermalfoundation:coin:1>,
                <thermalfoundation:coin:64>,
                <thermalfoundation:coin:65>,
                <thermalfoundation:coin:66>,
                <thermalfoundation:coin:67>,
                <thermalfoundation:coin:68>,
                <thermalfoundation:coin:69>,
                <thermalfoundation:coin:70>,
                <thermalfoundation:coin:71>,
                <thermalfoundation:coin:72>,
                <thermalfoundation:coin:96>,
                <thermalfoundation:coin:97>,
                <thermalfoundation:coin:98>,
                <thermalfoundation:coin:99>,
                <thermalfoundation:coin:100>,
                <thermalfoundation:coin:101>,
                <thermalfoundation:coin:102>,
                <thermalfoundation:coin:103>,
                <thermalfoundation:bait>,
                <thermalfoundation:bait:1>,
                <thermalfoundation:bait:2>,

                <thermalfoundation:dye>,
                <thermalfoundation:dye:1>,
                <thermalfoundation:dye:2>,
                <thermalfoundation:dye:3>,
                <thermalfoundation:dye:4>,
                <thermalfoundation:dye:5>,
                <thermalfoundation:dye:6>,
                <thermalfoundation:dye:7>,
                <thermalfoundation:dye:8>,
                <thermalfoundation:dye:9>,
                <thermalfoundation:dye:10>,
                <thermalfoundation:dye:11>,
                <thermalfoundation:dye:12>,
                <thermalfoundation:dye:13>,
                <thermalfoundation:dye:14>,
                <thermalfoundation:dye:15>,     
                <thermalfoundation:material:640>, #tool casing
            ] as IItemStack[];
                for item in CryogenicDissolution
                {
                    recipes.remove(item);
                    rh(item);
                }

    # ======== Components ======== #
        # ==== Hard Glass ==== #
            alloy.recipeBuilder()
            .inputs(<ore:dustSteel>, <ore:dustGlass>)
            .outputs(<thermalfoundation:glass_alloy> * 2)
            .EUt(4)
            .duration(400)
            .buildAndRegister();
        # ==== Redstone Servo ==== #
            recipes.remove(<thermalfoundation:material:512>);
            assembler.recipeBuilder()
            .inputs(<ore:foilRedAlloy> * 8, <ore:stickLongIron>)
            .fluidInputs(<liquid:soldering_alloy> * 72)
            .EUt(16)
            .duration(80)
            .outputs(<thermalfoundation:material:512>)
            .buildAndRegister();
        # ==== Charcoal & Sawdust ==== #
            furnace.remove(<minecraft:coal:1>);
            recipes.remove(<thermalfoundation:material:801>);
            rh(<thermalfoundation:material:801>);
        # ==== Liquid Ender ==== #
            extractor.recipeBuilder()
            .EUt(16)
            .duration(100)
            .inputs(<ore:gemEnderPearl>)
            .fluidOutputs(<liquid:ender> * 144)
            .buildAndRegister();
        # ==== Upgrades ==== #
            # Hardened 
                recipes.remove(<thermalfoundation:upgrade>);
                recipes.addShaped("GGN_thermal_upgradehardened", <thermalfoundation:upgrade>,
                [
                    [<ore:screwInvar>, <ore:gearInvar>, <ore:screwInvar>],
                    [<thermalfoundation:material:512>, <ore:plateInvar>, <thermalfoundation:material:512>],
                    [<ore:screwInvar>, <ore:gearInvar>, <ore:screwInvar>]
                ]);
            # Reinforced 
                recipes.remove(<thermalfoundation:upgrade:1>);
                recipes.addShaped("GGN_thermal_upgradereinforced", <thermalfoundation:upgrade:1>,
                [
                    [<ore:screwElectrum>, <ore:gearElectrum>, <ore:screwElectrum>],
                    [<thermalfoundation:material:512>, <thermalfoundation:upgrade>, <thermalfoundation:material:512>],
                    [<ore:screwElectrum>, <ore:gearElectrum>, <ore:screwElectrum>]
                ]);
            # Signalum
                recipes.remove(<thermalfoundation:upgrade:2>);
                recipes.addShaped("GGN_thermal_upgradesignalum", <thermalfoundation:upgrade:2>,
                [
                    [<ore:screwRedAlloy>, <ore:plateDoubleRedAlloy>, <ore:screwRedAlloy>],
                    [<thermalfoundation:material:512>, <thermalfoundation:upgrade>, <thermalfoundation:material:512>],
                    [<ore:screwRedAlloy>, <ore:plateDoubleRedAlloy>, <ore:screwRedAlloy>]
                ]);
            # Resonant
                recipes.remove(<thermalfoundation:upgrade:3>);
        # ==== Alloys ==== #
    # ======== Utilities ======== #
        # ==== Portable Tanks ==== # 
            recipes.remove(<thermalexpansion:tank>);
            recipes.addShaped("GGN_thermal_tank", <thermalexpansion:tank>.withTag({}),
            [
                [<ore:glassHard>, <thermalfoundation:material:512>, <ore:glassHard>],
                [<ore:glassHard>, <metaitem:drum.bronze>, <ore:glassHard>],
                [<ore:glassHard>, <metaitem:drum.bronze>, <ore:glassHard>]
            ]);
        # ==== Reservoirs ==== # 
            recipes.remove(<thermalexpansion:reservoir>);
            recipes.addShaped("GGN_thermal_reservoir", <thermalexpansion:reservoir>.withTag({}),
            [
                [<ore:glassHard>, <thermalfoundation:material:512>, <ore:glassHard>],
                [<ore:glassHard>, <metaitem:drum.bronze>, <ore:glassHard>],
                [<ore:glassHard>, <thermalfoundation:material:512>, <ore:glassHard>]
            ]);
        # ==== Caches ==== # 
            recipes.remove(<thermalexpansion:cache>);
            recipes.addShaped("GGN_thermal_cache", <thermalexpansion:cache>,
            [
                [<ore:screwSteel>, <ore:plateBlackSteel>, <ore:screwSteel>],
                [<storagedrawers:customdrawers>, <storagedrawers:customdrawers>, <storagedrawers:customdrawers>],
                [<ore:screwSteel>, <ore:plateBlackSteel>, <ore:screwSteel>]
            ]);
        # ==== Fluxbore ==== # 
            recipes.remove(<thermalinnovation:drill>);
            recipes.addShaped("GGN_thermal_drillbasic", <thermalinnovation:drill>,
            [
                [<metaitem:toolHeadDrillSteel>, <ore:screwSteel>, <ore:plateWroughtIron>],
                [<ore:screwSteel>, <metaitem:power_unit.lv>, <ore:gtScrewdriver>],
                [<ore:plateWroughtIron>, <ore:plateSteel>, <ore:gtFile>]
            ]);
# ================ Thermal ================ #




