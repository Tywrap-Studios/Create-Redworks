//? if forge {
/*package org.tywrapstudios.redwork.platform.forge;

import org.tywrapstudios.redwork.Redwork;
import org.tywrapstudios.redwork.platform.ModPlatform;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.jetbrains.annotations.NotNull;import org.tywrapstudios.redwork.platform.forge.data.ForgeDatagen;

@Mod(/^$ annotation_id^/"redwork")
public class RedworkForge {
    public RedworkForge() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        Redwork.REGISTRATE.registerEventListeners(bus);
        bus.addListener(ForgeDatagen::onGatherData);
        Redwork.entrypoint(new ForgePlatform());
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