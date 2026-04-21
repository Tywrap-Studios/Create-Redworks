package org.tywrapstudios.redwork

import com.tterrag.registrate.providers.RegistrateRecipeProvider
import com.tterrag.registrate.util.DataIngredient
import net.minecraft.advancements.CriterionTriggerInstance
import net.minecraft.world.level.ItemLike

fun ItemLike.dataIngredient(): DataIngredient {
    return DataIngredient.items(this)
}

//? if !neoforge
//fun DataIngredient.getCriterion(provider: RegistrateRecipeProvider): CriterionTriggerInstance = this.getCritereon(provider)