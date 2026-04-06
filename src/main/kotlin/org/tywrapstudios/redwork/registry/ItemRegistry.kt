package org.tywrapstudios.redwork.registry

import com.tterrag.registrate.util.entry.ItemEntry
import com.tterrag.registrate.util.entry.RegistryEntry
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.Item
import org.tywrapstudios.redwork.Redwork

object ItemRegistry {
    val CREATIVE_TAB: RegistryEntry<CreativeModeTab, CreativeModeTab> =
        Redwork.REGISTRATE.defaultCreativeTab("main") { builder ->
                builder.build()
            }.register()

    val ADVANCED_TRANSCEIVER = item("advanced_transceiver", "Advanced Transceiver")

    private fun item(name: String, translation: String): ItemEntry<Item> {
        return Redwork.REGISTRATE
            .item(name, ::Item)
            .lang(translation)
            .tab(CREATIVE_TAB.key!!)
            .defaultModel()
            .register()
    }

    fun register() {}
}