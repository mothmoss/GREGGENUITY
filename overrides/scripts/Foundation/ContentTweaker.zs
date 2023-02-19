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

var moon = VanillaFactory.createItem("moon");
moon.maxStackSize = 64;
moon.register();

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

var darkbrick = VanillaFactory.createBlock("darkbrick", <blockmaterial:rock>);
darkbrick.blockSoundType = <soundtype:stone>;
darkbrick.toolClass = "pickaxe";
darkbrick.toolLevel = 1;
darkbrick.blockHardness = 2;
darkbrick.blockResistance = 3;
darkbrick.register();

var mars = VanillaFactory.createBlock("mars", <blockmaterial:rock>);
mars.blockSoundType = <soundtype:stone>;
mars.toolClass = "pickaxe";
mars.toolLevel = 1;
mars.blockHardness = 2;
mars.blockResistance = 3;
mars.register();

var mooncrete = VanillaFactory.createBlock("mooncrete", <blockmaterial:rock>);
mooncrete.blockSoundType = <soundtype:stone>;
mooncrete.toolClass = "pickaxe";
mooncrete.toolLevel = 1;
mooncrete.blockHardness = 2;
mooncrete.blockResistance = 3;
mooncrete.register();

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