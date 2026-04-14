package org.tywrapstudios.redwork.registry

import com.tterrag.registrate.util.entry.ItemEntry
import com.tterrag.registrate.util.entry.RegistryEntry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.Item
import org.tywrapstudios.redwork.Redwork

object ItemRegistry {
    //? if neoforge {
    val CREATIVE_TAB: RegistryEntry<CreativeModeTab, CreativeModeTab> =
    //?} else {
    /*val CREATIVE_TAB: RegistryEntry<CreativeModeTab> =
    *///?}
        Redwork.REGISTRATE.defaultCreativeTab("create_redworks") { builder ->
                builder.build()
            }.register()

    val ADVANCED_TRANSCEIVER = item("advanced_transceiver", "Advanced Transceiver")

    private fun item(name: String, translation: String): ItemEntry<Item> {
        return Redwork.REGISTRATE
            .item(name, ::Item)
            .lang(translation)
            //? if fabric {
            /*.tab(BuiltInRegistries.CREATIVE_MODE_TAB.getResourceKey(CREATIVE_TAB.get()).get())
            *///?} else {
            .tab(CREATIVE_TAB.key!!)
            //?}
            .defaultModel()
            .register()
    }

    fun register() {}
}