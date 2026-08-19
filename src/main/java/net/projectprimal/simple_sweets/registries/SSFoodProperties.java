package net.projectprimal.simple_sweets.registries;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Items;

public class SSFoodProperties {
    public static final FoodProperties COTTON_CANDY = new FoodProperties.Builder().nutrition(1).saturationModifier(.25f).usingConvertsTo(Items.STICK).alwaysEdible().build();
}
