//? if fabric {
package org.tywrapstudios.redwork.platform.fabric

import org.tywrapstudios.redwork.platform.ModPlatform
import net.fabricmc.api.ModInitializer
import net.fabricmc.loader.api.FabricLoader
import org.tywrapstudios.redwork.Redwork

class RedworkFabric : ModInitializer {
    override fun onInitialize() {
        Redwork.entrypoint(FabricPlatform())
    }

    class FabricPlatform : ModPlatform {
        override fun getModLoader(): String {
            return "Fabric"
        }

        override fun isModLoaded(id: String): Boolean {
            return FabricLoader.getInstance().isModLoaded(id)
        }
    }
}
//?}