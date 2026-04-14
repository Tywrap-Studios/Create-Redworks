//? if fabric {
/*package org.tywrapstudios.redwork.platform.fabric.data

import io.github.fabricators_of_create.porting_lib.data.ExistingFileHelper
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator
import org.tywrapstudios.redwork.Redwork


class FabricDatagen : DataGeneratorEntrypoint {
    override fun onInitializeDataGenerator(generator: FabricDataGenerator) {
        val pack = generator.createPack()
        val helper = ExistingFileHelper.withResourcesFromArg()
        Redwork.REGISTRATE.setupDatagen(pack, helper)
    }
}
*///?}