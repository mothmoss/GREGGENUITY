#loader contenttweaker
import mods.contenttweaker.VanillaFactory;
import mods.contenttweaker.Item;
import mods.contenttweaker.Block;
import mods.contenttweaker.Color;
import mods.contenttweaker.Fluid;

var blankrune = VanillaFactory.createItem("blankrune");
blankrune.maxStackSize = 64;
blankrune.register();

var balanceshard = VanillaFactory.createItem("balanceshard");
balanceshard.maxStackSize = 64;
balanceshard.register();

var vibrant_casing = VanillaFactory.createBlock("vibrant_casing", <blockmaterial:iron>);
vibrant_casing.blockSoundType = <soundtype:metal>;
vibrant_casing.toolClass = "pickaxe";
vibrant_casing.toolLevel = 1;
vibrant_casing.blockHardness = 2;
vibrant_casing.blockResistance = 3;
vibrant_casing.gravity = false;
vibrant_casing.register();

var concrete = VanillaFactory.createBlock("concrete", <blockmaterial:rock>);
concrete.blockSoundType = <soundtype:stone>;
concrete.toolClass = "pickaxe";
concrete.toolLevel = 1;
concrete.blockHardness = 2;
concrete.blockResistance = 3;
concrete.register();

var purplebrick = VanillaFactory.createBlock("purplebrick", <blockmaterial:rock>);
purplebrick.blockSoundType = <soundtype:stone>;
purplebrick.toolClass = "pickaxe";
purplebrick.toolLevel = 1;
purplebrick.blockHardness = 2;
purplebrick.blockResistance = 3;
purplebrick.register();

var darkcrete = VanillaFactory.createBlock("darkcrete", <blockmaterial:rock>);
darkcrete.blockSoundType = <soundtype:stone>;
darkcrete.toolClass = "pickaxe";
darkcrete.toolLevel = 1;
darkcrete.blockHardness = 2;
darkcrete.blockResistance = 3;
darkcrete.register();

var blackstone = VanillaFactory.createBlock("blackstone", <blockmaterial:rock>);
blackstone.blockSoundType = <soundtype:stone>;
blackstone.toolClass = "pickaxe";
blackstone.toolLevel = 1;
blackstone.blockHardness = 2;
blackstone.blockResistance = 3;
blackstone.register();

var quartz = VanillaFactory.createBlock("quartz", <blockmaterial:rock>);
quartz.blockSoundType = <soundtype:stone>;
quartz.toolClass = "pickaxe";
quartz.toolLevel = 1;
quartz.blockHardness = 2;
quartz.blockResistance = 3;
quartz.register();

var purplequartz = VanillaFactory.createBlock("purplequartz", <blockmaterial:rock>);
purplequartz.blockSoundType = <soundtype:stone>;
purplequartz.toolClass = "pickaxe";
purplequartz.toolLevel = 1;
purplequartz.blockHardness = 2;
purplequartz.blockResistance = 3;
purplequartz.register();

var blackquartz = VanillaFactory.createBlock("blackquartz", <blockmaterial:rock>);
blackquartz.blockSoundType = <soundtype:stone>;
blackquartz.toolClass = "pickaxe";
blackquartz.toolLevel = 1;
blackquartz.blockHardness = 2;
blackquartz.blockResistance = 3;
blackquartz.register();

var reinforced_stone = VanillaFactory.createBlock("reinforced_stone", <blockmaterial:rock>);
reinforced_stone.blockSoundType = <soundtype:stone>;
reinforced_stone.toolClass = "pickaxe";
reinforced_stone.toolLevel = 1;
reinforced_stone.blockHardness = 2;
reinforced_stone.blockResistance = 3;
reinforced_stone.register();

var petrified_foam = VanillaFactory.createBlock("petrified_foam", <blockmaterial:rock>);
petrified_foam.blockSoundType = <soundtype:stone>;
petrified_foam.toolClass = "pickaxe";
petrified_foam.toolLevel = 1;
petrified_foam.blockHardness = 2;
petrified_foam.blockResistance = 3;
petrified_foam.register();

var wheel = VanillaFactory.createItem("wheel");
wheel.maxStackSize = 64;
wheel.register();

var moonrover = VanillaFactory.createItem("t1_rover");
moonrover.maxStackSize = 64;
moonrover.register();

var roverchassis1 = VanillaFactory.createItem("t1_chassis");
roverchassis1.maxStackSize = 64;
roverchassis1.register();