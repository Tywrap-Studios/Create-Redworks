package org.tywrapstudios.redwork

import com.tterrag.registrate.util.DataIngredient
import net.minecraft.world.level.ItemLike

fun ItemLike.dataIngredient(): DataIngredient {
    return DataIngredient.items(this)
}