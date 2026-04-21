package org.tywrapstudios.redwork.registry

import com.simibubi.create.AllItems
import com.simibubi.create.foundation.data.CreateRegistrate
import com.tterrag.registrate.builders.ItemBuilder
import com.tterrag.registrate.providers.DataGenContext
import com.tterrag.registrate.providers.RegistrateRecipeProvider
import com.tterrag.registrate.util.entry.ItemEntry
import com.tterrag.registrate.util.entry.RegistryEntry
import com.tterrag.registrate.util.nullness.NonNullFunction
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.core.registries.Registries
import net.minecraft.data.recipes.RecipeBuilder
import net.minecraft.data.recipes.RecipeCategory
import net.minecraft.data.recipes.ShapedRecipeBuilder
import net.minecraft.resources.ResourceKey
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.Item
import net.minecraft.world.item.Items
import net.minecraft.world.level.ItemLike
import org.tywrapstudios.redwork.Redwork
import org.tywrapstudios.redwork.dataIngredient
//? if !neoforge
//import org.tywrapstudios.redwork.getCriterion

object ItemRegistry {
    const val TAB_ID = "create_redworks"

    //? if neoforge {
    val CREATIVE_TAB: RegistryEntry<CreativeModeTab, CreativeModeTab> =
    //?} else {
    /*val CREATIVE_TAB: RegistryEntry<CreativeModeTab> =
    *///?}
        Redwork.REGISTRATE.defaultCreativeTab(TAB_ID) { builder ->
                builder.build()
            }.register()

    val ANTENNA = simpleRecipe("antenna", "Antenna", Items.IRON_NUGGET) { context, _ ->
        val source = Items.IRON_NUGGET
        val redstone = Items.REDSTONE
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, context.get())
            .pattern("Y")
            .pattern("X")
            .pattern("X")
            .define('X', source)
            .define('Y', redstone)
    }
    val IO_BASE = simpleRecipe("io_base", "I/O Base", AllItems.IRON_SHEET) { context, _ ->
        val sheet = AllItems.IRON_SHEET
        val nugget = Items.IRON_NUGGET
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, context.get())
            .pattern("X X")
            .pattern("YYY")
            .define('X', nugget)
            .define('Y', sheet)
    }
    val NETWORK_INTERFACE = simpleRecipe("network_interface", "Network Interface", AllItems.POLISHED_ROSE_QUARTZ) { context, _ ->
        val io = IO_BASE
        val rose = AllItems.POLISHED_ROSE_QUARTZ
        val repeater = Items.REPEATER
        val comparator = Items.COMPARATOR
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, context.get())
            .pattern(" X ")
            .pattern("ZYA")
            .define('X', rose)
            .define('Y', io)
            .define('Z', repeater)
            .define('A', comparator)
    }
    val SUB_GHZ_RECEIVER = simpleRecipe("sub_ghz_receiver", "Sub-GHz Radio Receiver", ANTENNA) { context, _ ->
        val antenna = ANTENNA
        val copperSheet = AllItems.COPPER_SHEET
        val ironSheet = AllItems.IRON_SHEET
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, context.get())
            .pattern("  X")
            .pattern("YZY")
            .define('X', antenna)
            .define('Y', copperSheet)
            .define('Z', ironSheet)
    }
    val SUB_GHZ_TRANSMITTER = simpleRecipe("sub_ghz_transmitter", "Sub-GHz Radio Transmitter", ANTENNA) { context, _ ->
        val antenna = ANTENNA
        val copperSheet = AllItems.COPPER_SHEET
        val ironSheet = AllItems.IRON_SHEET
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, context.get())
            .pattern("  X")
            .pattern("ZYZ")
            .define('X', antenna)
            .define('Y', copperSheet)
            .define('Z', ironSheet)
    }
    val SUB_GHZ_TRANSCEIVER = simpleRecipe("sub_ghz_transceiver", "Sub-GHz Radio Transceiver", ANTENNA) { context, _ ->
        val transmitter = SUB_GHZ_TRANSMITTER
        val receiver = SUB_GHZ_RECEIVER
        val sheet = AllItems.COPPER_SHEET
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, context.get())
            .pattern("XYZ")
            .define('X', transmitter)
            .define('Y', sheet)
            .define('Z', receiver)
    }

    private fun simple(name: String, translation: String): ItemEntry<Item> {
        return simple(name, translation, ::Item)
    }

    private fun simple(name: String, translation: String, itemFactory: NonNullFunction<Item.Properties, Item>): ItemEntry<Item> {
        return simpleItemBuilder(name, translation, itemFactory).register()
    }

    private fun simpleRecipe(name: String, translation: String, criterion: ItemLike, recipe: (context: DataGenContext<Item, Item>, provider: RegistrateRecipeProvider) -> RecipeBuilder): ItemEntry<Item> {
        return simpleItemBuilder(name, translation, ::Item)
            .recipe { context, provider ->
                val criterion = criterion.dataIngredient()
                recipe(context, provider)
                    .unlockedBy("has_" + provider.safeName(criterion), criterion.getCriterion(provider))
                    .save(provider, provider.safeId(context.get()))
            }
            .register()
    }

    private fun simpleItemBuilder(name: String, translation: String, itemFactory: NonNullFunction<Item.Properties, Item>): ItemBuilder<Item, CreateRegistrate> {
        return Redwork.REGISTRATE
            .item(name, itemFactory)
            .lang(translation)
            //? if fabric {
            /*.tab(ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation("redwork", TAB_ID)))
            *///?} else {
            .tab(CREATIVE_TAB.key!!)
            //?}
            .defaultModel()
    }

    fun register() {}
}