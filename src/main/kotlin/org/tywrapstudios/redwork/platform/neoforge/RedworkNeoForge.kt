//? if neoforge {
package org.tywrapstudios.redwork.platform.neoforge

import org.tywrapstudios.redwork.platform.ModPlatform
import org.tywrapstudios.redwork.Redwork
import dev.nyon.klf.KotlinModContainer
import net.neoforged.api.distmarker.Dist
import net.neoforged.bus.api.IEventBus
import net.neoforged.fml.ModContainer
import net.neoforged.fml.ModList
import net.neoforged.fml.common.Mod
import org.tywrapstudios.redwork.platform.neoforge.data.NeoForgeDatagen

@Mod(/*$ annotation_id*/"redwork")
class RedworkNeoForge(bus: IEventBus, container: ModContainer, kotlinModContainer: KotlinModContainer, dist: Dist) {
    init {
        Redwork.REGISTRATE.registerEventListeners(bus)
        bus.addListener(NeoForgeDatagen::onGatherData)
        Redwork.entrypoint(NeoForgePlatform())
    }

    class NeoForgePlatform : ModPlatform {
        override fun getModLoader(): String {
            return "NeoForge"
        }

        override fun isModLoaded(id: String): Boolean {
            return ModList.get().isLoaded(id)
        }
    }
} //?}