import gregtech.common.metatileentities.MetaTileEntities

import classes.MetaTileEntityAirCompressor

if (isReloading()) return

MetaTileEntities.registerMetaTileEntity(32000, new MetaTileEntityAirCompressor(new ResourceLocation("greggenuity", "air_compressor")))