package net.projectprimal.simple_sweets;

import net.projectprimal.simple_sweets.registries.SSItems;
import net.projectprimal.simple_sweets.registries.SSTabs;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(SimpleSweets.MOD_ID)
public class SimpleSweets {
    public static final String MOD_ID = "simple_sweets";
    public static final Logger LOGGER = LogUtils.getLogger();

    public SimpleSweets(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        NeoForge.EVENT_BUS.register(this);

        SSItems.register(modEventBus);
        SSTabs.register(modEventBus);

        modEventBus.addListener(this::addCreative);
    }
    private void commonSetup(FMLCommonSetupEvent event) {
    }
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
    }
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }
}
