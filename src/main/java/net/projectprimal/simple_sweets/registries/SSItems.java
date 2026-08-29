package net.projectprimal.simple_sweets.registries;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.projectprimal.simple_sweets.SimpleSweets;

public class SSItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SimpleSweets.MOD_ID);

// Release
    public static final DeferredItem<Item> WHITE_COTTON_CANDY = ITEMS.register("white_cotton_candy", () -> new Item(new Item.Properties().food(SSFoodProperties.COTTON_CANDY).stacksTo(16)));
    public static final DeferredItem<Item> ORANGE_COTTON_CANDY = ITEMS.register("orange_cotton_candy", () -> new Item(new Item.Properties().food(SSFoodProperties.COTTON_CANDY).stacksTo(16)));
    public static final DeferredItem<Item> MAGENTA_COTTON_CANDY = ITEMS.register("magenta_cotton_candy", () -> new Item(new Item.Properties().food(SSFoodProperties.COTTON_CANDY).stacksTo(16)));
    public static final DeferredItem<Item> LIGHT_BLUE_COTTON_CANDY = ITEMS.register("light_blue_cotton_candy", () -> new Item(new Item.Properties().food(SSFoodProperties.COTTON_CANDY).stacksTo(16)));
    public static final DeferredItem<Item> YELLOW_COTTON_CANDY = ITEMS.register("yellow_cotton_candy", () -> new Item(new Item.Properties().food(SSFoodProperties.COTTON_CANDY).stacksTo(16)));
    public static final DeferredItem<Item> LIME_COTTON_CANDY = ITEMS.register("lime_cotton_candy", () -> new Item(new Item.Properties().food(SSFoodProperties.COTTON_CANDY).stacksTo(16)));
    public static final DeferredItem<Item> PINK_COTTON_CANDY = ITEMS.register("pink_cotton_candy", () -> new Item(new Item.Properties().food(SSFoodProperties.COTTON_CANDY).stacksTo(16)));
    public static final DeferredItem<Item> GRAY_COTTON_CANDY = ITEMS.register("gray_cotton_candy", () -> new Item(new Item.Properties().food(SSFoodProperties.COTTON_CANDY).stacksTo(16)));
    public static final DeferredItem<Item> LIGHT_GRAY_COTTON_CANDY = ITEMS.register("light_gray_cotton_candy", () -> new Item(new Item.Properties().food(SSFoodProperties.COTTON_CANDY).stacksTo(16)));
    public static final DeferredItem<Item> CYAN_COTTON_CANDY = ITEMS.register("cyan_cotton_candy", () -> new Item(new Item.Properties().food(SSFoodProperties.COTTON_CANDY).stacksTo(16)));
    public static final DeferredItem<Item> PURPLE_COTTON_CANDY = ITEMS.register("purple_cotton_candy", () -> new Item(new Item.Properties().food(SSFoodProperties.COTTON_CANDY).stacksTo(16)));
    public static final DeferredItem<Item> BLUE_COTTON_CANDY = ITEMS.register("blue_cotton_candy", () -> new Item(new Item.Properties().food(SSFoodProperties.COTTON_CANDY).stacksTo(16)));
    public static final DeferredItem<Item> BROWN_COTTON_CANDY = ITEMS.register("brown_cotton_candy", () -> new Item(new Item.Properties().food(SSFoodProperties.COTTON_CANDY).stacksTo(16)));
    public static final DeferredItem<Item> GREEN_COTTON_CANDY = ITEMS.register("green_cotton_candy", () -> new Item(new Item.Properties().food(SSFoodProperties.COTTON_CANDY).stacksTo(16)));
    public static final DeferredItem<Item> RED_COTTON_CANDY = ITEMS.register("red_cotton_candy", () -> new Item(new Item.Properties().food(SSFoodProperties.COTTON_CANDY).stacksTo(16)));
    public static final DeferredItem<Item> BLACK_COTTON_CANDY = ITEMS.register("black_cotton_candy", () -> new Item(new Item.Properties().food(SSFoodProperties.COTTON_CANDY).stacksTo(16)));

    public static final DeferredItem<Item> CANDY_CORN = ITEMS.register("candy_corn", () -> new Item(new Item.Properties().food(SSFoodProperties.HASTE_TREAT).stacksTo(16)));

    public static final DeferredItem<Item> SUGAR_COOKIE = ITEMS.register("sugar_cookie", () -> new Item(new Item.Properties().food(SSFoodProperties.SPEED_TREAT).stacksTo(16)));

    public static void register(IEventBus eventBus) {ITEMS.register(eventBus);
    }
}