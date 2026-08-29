package net.projectprimal.simple_sweets.registries;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModList;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.projectprimal.simple_sweets.SimpleSweets;

import java.util.function.Supplier;

public class SSTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SimpleSweets.MOD_ID);

    public static final Supplier<CreativeModeTab> SIMPLE_SWEETS_TAB = CREATIVE_MODE_TAB.register("simple_sweets_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(SSItems.PINK_COTTON_CANDY.get()))
            .title(Component.translatable("creativetab.simple_sweets.simple_sweets_tab"))
            .displayItems((itemDisplayParameters, output) -> {
                // Release
                output.accept(SSItems.WHITE_COTTON_CANDY);
                output.accept(SSItems.LIGHT_GRAY_COTTON_CANDY);
                output.accept(SSItems.GRAY_COTTON_CANDY);
                output.accept(SSItems.BLACK_COTTON_CANDY);
                output.accept(SSItems.BROWN_COTTON_CANDY);
                output.accept(SSItems.RED_COTTON_CANDY);
                output.accept(SSItems.ORANGE_COTTON_CANDY);
                output.accept(SSItems.YELLOW_COTTON_CANDY);
                output.accept(SSItems.LIME_COTTON_CANDY);
                output.accept(SSItems.GREEN_COTTON_CANDY);
                output.accept(SSItems.CYAN_COTTON_CANDY);
                output.accept(SSItems.LIGHT_BLUE_COTTON_CANDY);
                output.accept(SSItems.BLUE_COTTON_CANDY);
                output.accept(SSItems.PURPLE_COTTON_CANDY);
                output.accept(SSItems.MAGENTA_COTTON_CANDY);
                output.accept(SSItems.PINK_COTTON_CANDY);

                output.accept(SSItems.CANDY_CORN);

                output.accept(SSItems.SUGAR_COOKIE);
            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}