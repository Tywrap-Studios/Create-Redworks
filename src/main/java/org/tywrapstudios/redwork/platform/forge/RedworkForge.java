//? if forge {
/*package org.tywrapstudios.redwork.platform.forge;

import org.tywrapstudios.redwork.platform.ModPlatform;
import org.tywrapstudios.redwork.TemplateInit;

import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.jetbrains.annotations.NotNull;

@Mod(/^$ annotation_id^/"template")
public class RedworkForge {
    public RedworkForge() {
        TemplateInit.REGISTRATE.registerEventListeners(FMLJavaModLoadingContext.get().getModEventBus());
        TemplateInit.entrypoint(new ForgePlatform());
    }

    public static class ForgePlatform implements ModPlatform {
        @Override
        public @NotNull String getModLoader() {
            return "LexForge";
        }

        @Override
        public boolean isModLoaded(@NotNull String id) {
            return ModList.get().isLoaded(id);
        }
    }
}
*///?}