package net.projectprimal.simple_sweets.registries;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Items;

public class SSFoodProperties {
    public static final FoodProperties COTTON_CANDY = new FoodProperties.Builder().nutrition(1).saturationModifier(.25f).usingConvertsTo(Items.STICK).alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100), 1).build();

    public static final FoodProperties HASTE_TREAT = new FoodProperties.Builder().nutrition(1).saturationModifier(.25f).alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 200), 1).build();

    public static final FoodProperties SPEED_TREAT = new FoodProperties.Builder().nutrition(1).saturationModifier(.25f).alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 1).build();
}