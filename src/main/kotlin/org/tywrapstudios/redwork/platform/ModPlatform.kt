package org.tywrapstudios.redwork.platform

/**
 * This interface allows you to define platform specific code, and call it in
 */
interface ModPlatform {
    fun getModLoader(): String
    fun isModLoaded(id: String): Boolean
}