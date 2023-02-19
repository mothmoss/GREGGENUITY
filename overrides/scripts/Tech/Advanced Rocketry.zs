//priority 1000
import mods.jei.JEI.removeAndHide as rh;
import crafttweaker.item.IItemStack;
import crafttweaker.item.IItemDefinition;
import crafttweaker.item.IIngredient;
import crafttweaker.oredict.IOreDict;
import crafttweaker.oredict.IOreDictEntry;
import mods.gregtech.recipe.RecipeMaps;
import mods.gregtech.recipe.RecipeMap;

// ================ Advanced Rocketry ================ //
    // ======== Defining Variables ======== //
        var oxidizertank = <advancedrocketry:oxidizerfueltank>;
        var fueltank = <advancedrocketry:bipropellantfueltank>;
        var rocketengine = <advancedrocketry:advbipropellantrocketmotor>;
        var doublestainlessplate = <ore:plateDoubleStainlessSteel>.firstItem;
        var doublealuminiumplate = <ore:plateDoubleAluminium>.firstItem;
        var lunaralloyplate = <ore:plateLunarAlloy>.firstItem;
        var arconcrete = <advancedrocketry:concrete>;
    // ======== Bulk Removal ======== //
        var ARBulk = [
            <libvulpes:hatch>, //multiblock components
            <libvulpes:hatch:1>,
            <libvulpes:hatch:2>,
            <libvulpes:hatch:3>,
            <libvulpes:structuremachine>,
            <libvulpes:creativepowerbattery>,
            <libvulpes:forgepoweroutput>,
            <libvulpes:coalgenerator>,
            <libvulpes:motor>,
            <libvulpes:advancedmotor>,
            <libvulpes:enhancedmotor>,
            <libvulpes:elitemotor>,
            <libvulpes:gtplug>,
            <libvulpes:coil0:2>,
            <libvulpes:coil0:4>,
            <libvulpes:coil0:7>,
            <libvulpes:coil0:9>,
            <libvulpes:coil0:10>,
            <libvulpes:productdust>, //dilithium
            <libvulpes:productgem>,
            <libvulpes:ore0>,
            <libvulpes:productboule:3>, //silicon boule
            <libvulpes:productfan:6>, //steelfan
            <libvulpes:productsheet:1>, //sheets
            <libvulpes:productsheet:4>,
            <libvulpes:productsheet:6>,
            <libvulpes:productsheet:7>,
            <libvulpes:productsheet:9>,
            <libvulpes:battery>, //batteries
            <libvulpes:battery:1>,
            <advancedrocketry:solarpanel>, //solarpanels
            <advancedrocketry:solararraypanel>,
            <advancedrocketry:solargenerator>,
            <advancedrocketry:sawblade>, //sawblade
            <advancedrocketry:platepress>, //platepress
            <advancedrocketry:arcfurnace>, //nonsense multis
            <advancedrocketry:rollingmachine>,
            <advancedrocketry:lathe>,
            <advancedrocketry:crystallizer>,
            <advancedrocketry:cuttingmachine>,
            <advancedrocketry:precisionassemblingmachine>,
            <advancedrocketry:electrolyser>,
            <advancedrocketry:chemicalreactor>,
            <advancedrocketry:precisionlaseretcher>,
            <advancedrocketry:observatory>,
            <advancedrocketry:railgun>,
            <advancedrocketry:nuclearcore>,
            <advancedrocketry:intake>,
            <advancedrocketry:spacelaser>,
            <advancedrocketry:loader>,
            <advancedrocketry:drill>,
            <advancedrocketry:productdust>, //more components
            <advancedrocketry:misc:1>,
            <advancedrocketry:productdust:1>,
            <advancedrocketry:productingot>,
            <advancedrocketry:productingot:1>,
            <advancedrocketry:productnugget>,
            <advancedrocketry:productnugget:1>,
            <advancedrocketry:productplate>,
            <advancedrocketry:productplate:1>,
            <advancedrocketry:productrod>,
            <advancedrocketry:productrod:1>,
            <advancedrocketry:productsheet>,
            <advancedrocketry:productsheet:1>,
            <advancedrocketry:productgear>,
            <advancedrocketry:productgear:1>,
            <advancedrocketry:metal0>,
            <advancedrocketry:metal0:1>,
            <advancedrocketry:wafer>,
            <advancedrocketry:itemcircuitplate>,
            <advancedrocketry:itemcircuitplate:1>,
            <advancedrocketry:ic>,
            <advancedrocketry:ic:3>,
            <advancedrocketry:ic:2>,
            <advancedrocketry:ic:4>,
            <advancedrocketry:ic:5>,
            <advancedrocketry:sawbladeiron>,
            <advancedrocketry:iquartzcrucible>,
            <advancedrocketry:thermite>,       
            <advancedrocketry:centrifuge>, //more multiblocks
            <advancedrocketry:blackholegenerator>,
            <advancedrocketry:microwavereciever>,
            <advancedrocketry:solararray>,
                 
        ] as IItemStack[];
                for item in ARBulk
                {
                    recipes.remove(item);
                    rh(item);
                }        

    // ======== Rocket Ship ======== //
        // ==== Removal ==== // 
            var ARRocketship = [
                <advancedrocketry:fueltank>, //mono
                <advancedrocketry:nuclearfueltank>, //nuclear thermal
                <advancedrocketry:rocketmotor>, //rocket engines
                <advancedrocketry:bipropellantrocketmotor>,
                <advancedrocketry:nuclearrocketmotor>,
                <advancedrocketry:advrocketmotor>
            ] as IItemStack[];
            for item in ARRocketship {
                rh(item);
                recipes.remove(item);
            }
        // ==== Misc ==== //
            // == Tooltips == //
                oxidizertank.addTooltip(format.blue("Uses Liquid Oxygen."));
                fueltank.addTooltip(format.darkBlue("Uses Hydrogen."));
                rocketengine.displayName = "Bipropellant Rocket Engine";
                arconcrete.displayName = "Porous Concrete";
        // ==== Lunar Chip ==== //
            mods.extendedcrafting.TableCrafting.addShaped(0, <contenttweaker:moon>, [
                [null, null, <ore:plateDenseLunarAlloy>, null, null], 
                [null, <metaitem:sensor.hv>, <ore:circuitIv>, <metaitem:sensor.hv>, null], 
                [null, <ore:plateDenseLunarAlloy>, <ore:plateDenseLunarAlloy>, <ore:plateDenseLunarAlloy>, null], 
                [null, <ore:plateDenseLunarAlloy>, <ore:plateDenseLunarAlloy>, <ore:plateDenseLunarAlloy>, null], 
                [null, <advancedrocketry:advbipropellantrocketmotor>, null, <advancedrocketry:advbipropellantrocketmotor>, null]
            ]);
            mods.extendedcrafting.TableCrafting.remove(<extendedcrafting:material:24>);
            <contenttweaker:moon>.addTooltip(format.bold(format.aqua(("Place in your Warp Core to unlock the moon."))));





// ================ Advanced Rocketry ================ //

