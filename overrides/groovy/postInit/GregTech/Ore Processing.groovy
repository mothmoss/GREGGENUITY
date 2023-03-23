import gregtech.api.unification.material.properties.PropertyKey
import gregtech.api.unification.ore.OrePrefix

// ================ Ore Processing ================ //
    // ======== Definitions ======== //
        def petrodust = item('thermalfoundation:material', 1027)
    // ======== Chemical Production ======== //
        // Petrotheum
            //Mixing base dust
            mixer.recipeBuilder()
            .inputs(ore("dustObsidian"), ore("dustRedstone"), ore("dustTerraInfused"))
            .notConsumable(circuit1)
            .outputs(metaitem('dustPetrotheumBaseDust') * 3)
            .EUt(40)
            .duration(400)
            .buildAndRegister()

            //Refining base dust into dust
            chembath.recipeBuilder()
            .inputs(ore("dustPetrotheumBaseDust"))
            .fluidInputs(fluid("blaze") * 144)
            .outputs(petrodust * 2)
            .EUt(40)
            .duration(400)
            .buildAndRegister()

            //Extracting dust into fluid
            extractor.recipeBuilder()
            .inputs(petrodust * 1)
            .fluidOutputs(fluid("petrotheum") * 144)
            .EUt(40)
            .duration(40)
            .buildAndRegister()

            //Recycling dilute
            distillery.recipeBuilder()
            .notConsumable(circuit1)
            .EUt(30)
            .duration(25)
            .fluidInputs(fluid("dilute_petrotheum") * 144)
            .fluidOutputs(fluid("petrotheum") * 72)
            .buildAndRegister()


    // ======== Machine Maps ======== //
        // ==== Autoclave ==== //
            // Rationale
                // Uses 250 petrotheum for x2 ore
                // FLAGGED: Should output diluted petrotheum?metaitem("Diluted )Ea rthen Waste?"
            // Map
                def automap = [
                    [metaitem("crushedPurifiedAluminium")]            : [metaitem("crushedCentrifugedAluminium") * 2, metaitem("dustTinyBauxite") * 3],
                    [metaitem("crushedPurifiedBeryllium")]            : [metaitem("crushedCentrifugedBeryllium") * 2, metaitem("dustTinyEmerald") * 3],
                    [metaitem("crushedPurifiedCobalt")]               : [metaitem("crushedCentrifugedCobalt") * 2, metaitem("dustTinyCobaltOxide") * 3],
                    [metaitem("crushedPurifiedCopper")]               : [metaitem("crushedCentrifugedCopper") * 2, metaitem("dustTinyCobalt") * 3],
                    [metaitem("crushedPurifiedGold")]                 : [metaitem("crushedCentrifugedGold") * 2, metaitem("dustTinyCopper") * 3],
                    [metaitem("crushedPurifiedIron")]                 : [metaitem("crushedCentrifugedIron") * 2, metaitem("dustTinyNickel") * 3],
                    [metaitem("crushedPurifiedLead")]                 : [metaitem("crushedCentrifugedLead") * 2, metaitem("dustTinySilver") * 3],
                    [metaitem("crushedPurifiedLithium")]              : [metaitem("crushedCentrifugedLithium") * 2, metaitem("dustTinyLithium") * 3],
                    [metaitem("crushedPurifiedMolybdenum")]           : [metaitem("crushedCentrifugedMolybdenum") * 2, metaitem("dustTinyMolybdenum") * 3],
                    [metaitem("crushedPurifiedNeodymium")]            : [metaitem("crushedCentrifugedNeodymium") * 2, metaitem("dustTinyRareEarth") * 3],
                    [metaitem("crushedPurifiedNickel")]               : [metaitem("crushedCentrifugedNickel") * 2, metaitem("dustTinyCobalt") * 3],
                    [metaitem("crushedPurifiedPalladium")]            : [metaitem("crushedCentrifugedPalladium") * 2, metaitem("dustTinyPalladium") * 3],
                    [metaitem("crushedPurifiedPlatinum")]             : [metaitem("crushedCentrifugedPlatinum") * 2, metaitem("dustTinyNickel") * 3],
                    [metaitem("crushedPurifiedPlutonium")]            : [metaitem("crushedCentrifugedPlutonium") * 2, metaitem("dustTinyUraninite") * 3],
                    [metaitem("crushedPurifiedSilver")]               : [metaitem("crushedCentrifugedSilver") * 2, metaitem("dustTinyLead") * 3],
                    [metaitem("crushedPurifiedSulfur")]               : [metaitem("crushedCentrifugedSulfur") * 2, metaitem("dustTinySulfur") * 3],
                    [metaitem("crushedPurifiedThorium")]              : [metaitem("crushedCentrifugedThorium") * 2, metaitem("dustTinyUraninite") * 3],
                    [metaitem("crushedPurifiedTin")]                  : [metaitem("crushedCentrifugedTin") * 2, metaitem("dustTinyIron") * 3],
                    [metaitem("crushedPurifiedNaquadah")]             : [metaitem("crushedCentrifugedNaquadah") * 2, metaitem("dustTinySulfur") * 3],
                    [metaitem("crushedPurifiedCertusQuartz")]         : [metaitem("crushedCentrifugedCertusQuartz") * 2, metaitem("dustTinyNetherQuartz") * 3],
                    [metaitem("crushedPurifiedAlmandine")]            : [metaitem("crushedCentrifugedAlmandine") * 2, metaitem("dustTinyGarnetRed") * 3],
                    [metaitem("crushedPurifiedAsbestos")]             : [metaitem("crushedCentrifugedAsbestos") * 2, metaitem("dustTinyDiatomite") * 3],
                    [metaitem("crushedPurifiedBandedIron")]           : [metaitem("crushedCentrifugedBandedIron") * 2, metaitem("dustTinyMagnetite") * 3],
                    [metaitem("crushedPurifiedBlueTopaz")]            : [metaitem("crushedCentrifugedBlueTopaz") * 2, metaitem("dustTinyTopaz") * 3],
                    [metaitem("crushedPurifiedBrownLimonite")]        : [metaitem("crushedCentrifugedBrownLimonite") * 2, metaitem("dustTinyMalachite") * 3],
                    [metaitem("crushedPurifiedCalcite")]              : [metaitem("crushedCentrifugedCalcite") * 2, metaitem("dustTinyCalcium") * 3],
                    [metaitem("crushedPurifiedCassiterite")]          : [metaitem("crushedCentrifugedCassiterite") * 2, metaitem("dustTinyTin") * 3],
                    [metaitem("crushedPurifiedCassiteriteSand")]      : [metaitem("crushedCentrifugedCassiteriteSand") * 2, metaitem("dustTinyTin") * 3],
                    [metaitem("crushedPurifiedChalcopyrite")]         : [metaitem("crushedCentrifugedChalcopyrite") * 2, metaitem("dustTinyPyrite") * 3],
                    [metaitem("crushedPurifiedChromite")]             : [metaitem("crushedCentrifugedChromite") * 2, metaitem("dustTinyIron") * 3],
                    [metaitem("crushedPurifiedCinnabar")]             : [metaitem("crushedCentrifugedCinnabar") * 2, metaitem("dustTinyRedstone") * 3],
                    [metaitem("crushedPurifiedCoal")]                 : [metaitem("crushedCentrifugedCoal") * 2, metaitem("dustTinyCoal") * 3],
                    [metaitem("crushedPurifiedCobaltite")]            : [metaitem("crushedCentrifugedCobaltite") * 2, metaitem("dustTinySulfur") * 3],
                    [metaitem("crushedPurifiedCooperite")]            : [metaitem("crushedCentrifugedCooperite") * 2, metaitem("dustTinyNickel") * 3],
                    [metaitem("crushedPurifiedDiamond")]              : [metaitem("crushedCentrifugedDiamond") * 2, metaitem("dustTinyGraphite") * 3],
                    [metaitem("crushedPurifiedEmerald")]              : [metaitem("crushedCentrifugedEmerald") * 2, metaitem("dustTinyBeryllium") * 3],
                    [metaitem("crushedPurifiedGalena")]               : [metaitem("crushedCentrifugedGalena") * 2, metaitem("dustTinySulfur") * 3],
                    [metaitem("crushedPurifiedGarnierite")]           : [metaitem("crushedCentrifugedGarnierite") * 2, metaitem("dustTinyIron") * 3],
                    [metaitem("crushedPurifiedGreenSapphire")]        : [metaitem("crushedCentrifugedGreenSapphire") * 2, metaitem("dustTinyAluminium") * 3],
                    [metaitem("crushedPurifiedGrossular")]            : [metaitem("crushedCentrifugedGrossular") * 2, metaitem("dustTinyGarnetYellow") * 3],
                    [metaitem("crushedPurifiedIlmenite")]             : [metaitem("crushedCentrifugedIlmenite") * 2, metaitem("dustTinyIron") * 3],
                    [metaitem("crushedPurifiedBauxite")]              : [metaitem("crushedCentrifugedBauxite") * 2, metaitem("dustTinyGrossular") * 3],
                    [metaitem("crushedPurifiedLazurite")]             : [metaitem("crushedCentrifugedLazurite") * 2, metaitem("dustTinySodalite") * 3],
                    [metaitem("crushedPurifiedMagnesite")]            : [metaitem("crushedCentrifugedMagnesite") * 2, metaitem("dustTinyMagnesium") * 3],
                    [metaitem("crushedPurifiedMagnetite")]            : [metaitem("crushedCentrifugedMagnetite") * 2, metaitem("dustTinyIron") * 3],
                    [metaitem("crushedPurifiedMolybdenite")]          : [metaitem("crushedCentrifugedMolybdenite") * 2, metaitem("dustTinyMolybdenum") * 3],
                    [metaitem("crushedPurifiedPowellite")]            : [metaitem("crushedCentrifugedPowellite") * 2, metaitem("dustTinyIron") * 3],
                    [metaitem("crushedPurifiedPyrite")]               : [metaitem("crushedCentrifugedPyrite") * 2, metaitem("dustTinySulfur") * 3],
                    [metaitem("crushedPurifiedPyrolusite")]           : [metaitem("crushedCentrifugedPyrolusite") * 2, metaitem("dustTinyManganese") * 3],
                    [metaitem("crushedPurifiedPyrope")]               : [metaitem("crushedCentrifugedPyrope") * 2, metaitem("dustTinyGarnetRed") * 3],
                    [metaitem("crushedPurifiedRockSalt")]             : [metaitem("crushedCentrifugedRockSalt") * 2, metaitem("dustTinySalt") * 3],
                    [metaitem("crushedPurifiedRuby")]                 : [metaitem("crushedCentrifugedRuby") * 2, metaitem("dustTinyChrome") * 3],
                    [metaitem("crushedPurifiedSalt")]                 : [metaitem("crushedCentrifugedSalt") * 2, metaitem("dustTinyRockSalt") * 3],
                    [metaitem("crushedPurifiedSaltpeter")]            : [metaitem("crushedCentrifugedSaltpeter") * 2, metaitem("dustTinySaltpeter") * 3],
                    [metaitem("crushedPurifiedSapphire")]             : [metaitem("crushedCentrifugedSapphire") * 2, metaitem("dustTinyAluminium") * 3],
                    [metaitem("crushedPurifiedScheelite")]            : [metaitem("crushedCentrifugedScheelite") * 2, metaitem("dustTinyManganese") * 3],
                    [metaitem("crushedPurifiedSodalite")]             : [metaitem("crushedCentrifugedSodalite") * 2, metaitem("dustTinyLazurite") * 3],
                    [metaitem("crushedPurifiedTantalite")]            : [metaitem("crushedCentrifugedTantalite") * 2, metaitem("dustTinyManganese") * 3],
                    [metaitem("crushedPurifiedSpessartine")]          : [metaitem("crushedCentrifugedSpessartine") * 2, metaitem("dustTinyGarnetRed") * 3],
                    [metaitem("crushedPurifiedSphalerite")]           : [metaitem("crushedCentrifugedSphalerite") * 2, metaitem("dustTinyGarnetYellow") * 3],
                    [metaitem("crushedPurifiedStibnite")]             : [metaitem("crushedCentrifugedStibnite") * 2, metaitem("dustTinyAntimonyTrioxide") * 3],
                    [metaitem("crushedPurifiedTetrahedrite")]         : [metaitem("crushedCentrifugedTetrahedrite") * 2, metaitem("dustTinyAntimony") * 3],
                    [metaitem("crushedPurifiedTopaz")]                : [metaitem("crushedCentrifugedTopaz") * 2, metaitem("dustTinyBlueTopaz") * 3],
                    [metaitem("crushedPurifiedTungstate")]            : [metaitem("crushedCentrifugedTungstate") * 2, metaitem("dustTinyManganese") * 3],
                    [metaitem("crushedPurifiedUraninite")]            : [metaitem("crushedCentrifugedUraninite") * 2, metaitem("dustTinyUraninite") * 3],
                    [metaitem("crushedPurifiedWulfenite")]            : [metaitem("crushedCentrifugedWulfenite") * 2, metaitem("dustTinyIron") * 3],
                    [metaitem("crushedPurifiedYellowLimonite")]       : [metaitem("crushedCentrifugedYellowLimonite") * 2, metaitem("dustTinyNickel") * 3],
                    [metaitem("crushedPurifiedNetherQuartz")]         : [metaitem("crushedCentrifugedNetherQuartz") * 2, metaitem("dustTinyQuartzite") * 3],
                    [metaitem("crushedPurifiedQuartzite")]            : [metaitem("crushedCentrifugedQuartzite") * 2, metaitem("dustTinyCertusQuartz") * 3],
                    [metaitem("crushedPurifiedGraphite")]             : [metaitem("crushedCentrifugedGraphite") * 2, metaitem("dustTinyCarbon") * 3],
                    [metaitem("crushedPurifiedBornite")]              : [metaitem("crushedCentrifugedBornite") * 2, metaitem("dustTinyPyrite") * 3],
                    [metaitem("crushedPurifiedChalcocite")]           : [metaitem("crushedCentrifugedChalcocite") * 2, metaitem("dustTinySulfur") * 3],
                    [metaitem("crushedPurifiedRealgar")]              : [metaitem("crushedCentrifugedRealgar") * 2, metaitem("dustTinySulfur") * 3],
                    [metaitem("crushedPurifiedBastnasite")]           : [metaitem("crushedCentrifugedBastnasite") * 2, metaitem("dustTinyNeodymium") * 3],
                    [metaitem("crushedPurifiedPentlandite")]          : [metaitem("crushedCentrifugedPentlandite") * 2, metaitem("dustTinyIron") * 3],
                    [metaitem("crushedPurifiedSpodumene")]            : [metaitem("crushedCentrifugedSpodumene") * 2, metaitem("dustTinyAluminium") * 3],
                    [metaitem("crushedPurifiedLepidolite")]           : [metaitem("crushedCentrifugedLepidolite") * 2, metaitem("dustTinyLithium") * 3],
                    [metaitem("crushedPurifiedGlauconiteSand")]       : [metaitem("crushedCentrifugedGlauconiteSand") * 2, metaitem("dustTinySodium") * 3],
                    [metaitem("crushedPurifiedMalachite")]            : [metaitem("crushedCentrifugedMalachite") * 2, metaitem("dustTinyBrownLimonite") * 3],
                    [metaitem("crushedPurifiedMica")]                 : [metaitem("crushedCentrifugedMica") * 2, metaitem("dustTinyPotassium") * 3],
                    [metaitem("crushedPurifiedBarite")]               : [metaitem("crushedCentrifugedBarite") * 2, metaitem("dustTinyBarite") * 3],
                    [metaitem("crushedPurifiedAlunite")]              : [metaitem("crushedCentrifugedAlunite") * 2, metaitem("dustTinyAlunite") * 3],
                    [metaitem("crushedPurifiedTalc")]                 : [metaitem("crushedCentrifugedTalc") * 2, metaitem("dustTinyClay") * 3],
                    [metaitem("crushedPurifiedSoapstone")]            : [metaitem("crushedCentrifugedSoapstone") * 2, metaitem("dustTinySiliconDioxide") * 3],
                    [metaitem("crushedPurifiedKyanite")]              : [metaitem("crushedCentrifugedKyanite") * 2, metaitem("dustTinyTalc") * 3],
                    [metaitem("crushedPurifiedPyrochlore")]           : [metaitem("crushedCentrifugedPyrochlore") * 2, metaitem("dustTinyApatite") * 3],
                    [metaitem("crushedPurifiedOilsands")]             : [metaitem("crushedCentrifugedOilsands") * 2, metaitem("dustTinyOilsands") * 3],
                    [metaitem("crushedPurifiedOlivine")]              : [metaitem("crushedCentrifugedOlivine") * 2, metaitem("dustTinyPyrope") * 3],
                    [metaitem("crushedPurifiedOpal")]                 : [metaitem("crushedCentrifugedOpal") * 2, metaitem("dustTinyOpal") * 3],
                    [metaitem("crushedPurifiedAmethyst")]             : [metaitem("crushedCentrifugedAmethyst") * 2, metaitem("dustTinyAmethyst") * 3],
                    [metaitem("crushedPurifiedLapis")]                : [metaitem("crushedCentrifugedLapis") * 2, metaitem("dustTinyLazurite") * 3],
                    [metaitem("crushedPurifiedApatite")]              : [metaitem("crushedCentrifugedApatite") * 2, metaitem("dustTinyTricalciumPhosphate") * 3],
                    [metaitem("crushedPurifiedTricalciumPhosphate")]  : [metaitem("crushedCentrifugedTricalciumPhosphate") * 2, metaitem("dustTinyApatite") * 3],
                    [metaitem("crushedPurifiedGarnetRed")]            : [metaitem("crushedCentrifugedGarnetRed") * 2, metaitem("dustTinySpessartine") * 3],
                    [metaitem("crushedPurifiedGarnetYellow")]         : [metaitem("crushedCentrifugedGarnetYellow") * 2, metaitem("dustTinyAndradite") * 3],
                    [metaitem("crushedPurifiedVanadiumMagnetite")]    : [metaitem("crushedCentrifugedVanadiumMagnetite") * 2, metaitem("dustTinyMagnetite") * 3],
                    [metaitem("crushedPurifiedPollucite")]            : [metaitem("crushedCentrifugedPollucite") * 2, metaitem("dustTinyCaesium") * 3],
                    [metaitem("crushedPurifiedBentonite")]            : [metaitem("crushedCentrifugedBentonite") * 2, metaitem("dustTinyAluminium") * 3],
                    [metaitem("crushedPurifiedFullersEarth")]         : [metaitem("crushedCentrifugedFullersEarth") * 2, metaitem("dustTinyAluminium") * 3],
                    [metaitem("crushedPurifiedPitchblende")]          : [metaitem("crushedCentrifugedPitchblende") * 2, metaitem("dustTinyThorium") * 3],
                    [metaitem("crushedPurifiedMonazite")]             : [metaitem("crushedCentrifugedMonazite") * 2, metaitem("dustTinyThorium") * 3],
                    [metaitem("crushedPurifiedTrona")]                : [metaitem("crushedCentrifugedTrona") * 2, metaitem("dustTinySodium") * 3],
                    [metaitem("crushedPurifiedGypsum")]               : [metaitem("crushedCentrifugedGypsum") * 2, metaitem("dustTinySulfur") * 3],
                    [metaitem("crushedPurifiedZeolite")]              : [metaitem("crushedCentrifugedZeolite") * 2, metaitem("dustTinyCalcium") * 3],
                    [metaitem("crushedPurifiedRedstone")]             : [metaitem("crushedCentrifugedRedstone") * 2, metaitem("dustTinyCinnabar") * 3],
                    [metaitem("crushedPurifiedElectrotine")]          : [metaitem("crushedCentrifugedElectrotine") * 2, metaitem("dustTinyRedstone") * 3],
                    [metaitem("crushedPurifiedDiatomite")]            : [metaitem("crushedCentrifugedDiatomite") * 2, metaitem("dustTinyBandedIron") * 3],
                    [metaitem("crushedPurifiedGraniticMineralSand")]  : [metaitem("crushedCentrifugedGraniticMineralSand") * 2, metaitem("dustTinyGraniteBlack") * 3],
                    [metaitem("crushedPurifiedGarnetSand")]           : [metaitem("crushedCentrifugedGarnetSand") * 2, metaitem("dustTinyGarnetRed") * 3],
                    [metaitem("crushedPurifiedBasalticMineralSand")]  : [metaitem("crushedCentrifugedBasalticMineralSand") * 2, metaitem("dustTinyBasalt") * 3],
                    [metaitem("crushedPurifiedAerInfused")]           : [metaitem("crushedCentrifugedAerInfused") * 2, metaitem("dustTinyAerInfused") * 3],
                    [metaitem("crushedPurifiedAquaInfused")]          : [metaitem("crushedCentrifugedAquaInfused") * 2, metaitem("dustTinyAquaInfused") * 3],
                    [metaitem("crushedPurifiedEntropyInfused")]       : [metaitem("crushedCentrifugedEntropyInfused") * 2, metaitem("dustTinyEntropyInfused") * 3],
                    [metaitem("crushedPurifiedIgnisInfused")]         : [metaitem("crushedCentrifugedIgnisInfused") * 2, metaitem("dustTinyIgnisInfused") * 3],
                    [metaitem("crushedPurifiedOrdoInfused")]          : [metaitem("crushedCentrifugedOrdoInfused") * 2, metaitem("dustTinyOrdoInfused") * 3],
                    [metaitem("crushedPurifiedTerraInfused")]         : [metaitem("crushedCentrifugedTerraInfused") * 2, metaitem("dustTinyTerraInfused") * 3],    
                ]

                for (entry in automap) {
                    autoclave.recipeBuilder().EUt(60).duration(200)
                    .fluidInputs(fluid('petrotheum') * 288)
                    .inputs(entry.key)
                    .outputs(entry.value)
                    .fluidOutputs(fluid("dilute_petrotheum") * 144)
                    .buildAndRegister()
                }









// ================ Ore Processing ================ //
