package org.tywrapstudios.redwork

import com.simibubi.create.foundation.data.CreateRegistrate
import com.tterrag.registrate.util.entry.ItemEntry
import net.minecraft.world.item.Item
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.tywrapstudios.redwork.platform.ModPlatform

object Redwork {
    const val MOD_ID: String = /*$ mod_id*/"template"
    @JvmField
    val LOGGER: Logger = LoggerFactory.getLogger("Template")
    lateinit var PLATFORM: ModPlatform
    @JvmField
    var REGISTRATE: CreateRegistrate = CreateRegistrate.create(MOD_ID)

    val ITEM: ItemEntry<Item?> = REGISTRATE
        .item<Item?>("item", ::Item)
        .defaultModel()
        .register()

    @JvmStatic
    fun entrypoint(platform: ModPlatform) {
        PLATFORM = platform

        //? if fabric
        //REGISTRATE.register();
    }
}