//? if fabric {
/*package org.tywrapstudios.redwork.platform.fabric.data

import io.github.fabricators_of_create.porting_lib.data.ExistingFileHelper
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator
import org.tywrapstudios.redwork.Redwork
import kotlin.io.path.Path


class FabricDatagen : DataGeneratorEntrypoint {
    override fun onInitializeDataGenerator(generator: FabricDataGenerator) {
        val pack = generator.createPack()
        val helper = ExistingFileHelper.withResources(generator.modContainer.findPath("./").get())
        Redwork.REGISTRATE.setupDatagen(pack, helper)
    }
}
*///?}