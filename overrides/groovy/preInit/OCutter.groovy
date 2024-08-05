/* - 2.9
import gregtech.api.recipes.RecipeMaps
// do in preinit
RecipeMaps.CUTTER_RECIPES.onRecipeBuild(resource("greggenuity", "cutter_fluid"), { builder ->
    if (builder.getFluidInputs().isEmpty()) return

    int duration = builder.getDuration()
    long eut = builder.getEUt()
    // we usually do max(someNumber1, min(someNumber2, duration * eut / someNumber3))
    long amount = max(1, (min(125, duration * eut / 1700)))

    // can keep repeating this for more lubricants
    builder.copy() // copy is VERY important
            .fluidInputs(fluid('superlube') * GTUtility.safeCastLongToInt(amount))
            .duration((int) (duration * 0.75)) // do some multiplier here
            .buildAndRegister()
})
*/