package org.tywrapstudios.redwork

import com.simibubi.create.foundation.data.CreateRegistrate
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.tywrapstudios.redwork.platform.ModPlatform
import org.tywrapstudios.redwork.registry.ItemRegistry

object Redwork {
    const val MOD_ID: String = /*$ mod_id*/"redwork"
    @JvmField
    val LOGGER: Logger = LoggerFactory.getLogger("Redworks")
    lateinit var PLATFORM: ModPlatform
    @JvmField
    var REGISTRATE: CreateRegistrate = CreateRegistrate.create(MOD_ID)

    @JvmStatic
    fun entrypoint(platform: ModPlatform) {
        PLATFORM = platform

        ItemRegistry.register()

        //? if fabric
        //REGISTRATE.register()
    }
}