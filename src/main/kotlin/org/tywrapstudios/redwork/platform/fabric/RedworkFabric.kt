//? if fabric {
/*package org.tywrapstudios.redwork.platform.fabric

import org.tywrapstudios.redwork.platform.ModPlatform
import org.tywrapstudios.redwork.TemplateInit
import net.fabricmc.api.ModInitializer
import net.fabricmc.loader.api.FabricLoader

class RedworkFabric : ModInitializer {
    override fun onInitialize() {
        TemplateInit.entrypoint(FabricPlatform())
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
*///?}