package net.projectprimal.simple_sweets.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.projectprimal.simple_sweets.SimpleSweets;
import net.projectprimal.simple_sweets.registries.SSItems;

public class SSItemModelProvider extends ItemModelProvider {
    public SSItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SimpleSweets.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        handheldItem(SSItems.WHITE_COTTON_CANDY.get());
        handheldItem(SSItems.ORANGE_COTTON_CANDY.get());
        handheldItem(SSItems.MAGENTA_COTTON_CANDY.get());
        handheldItem(SSItems.LIGHT_BLUE_COTTON_CANDY.get());
        handheldItem(SSItems.YELLOW_COTTON_CANDY.get());
        handheldItem(SSItems.LIME_COTTON_CANDY.get());
        handheldItem(SSItems.PINK_COTTON_CANDY.get());
        handheldItem(SSItems.GRAY_COTTON_CANDY.get());
        handheldItem(SSItems.LIGHT_GRAY_COTTON_CANDY.get());
        handheldItem(SSItems.CYAN_COTTON_CANDY.get());
        handheldItem(SSItems.PURPLE_COTTON_CANDY.get());
        handheldItem(SSItems.BLUE_COTTON_CANDY.get());
        handheldItem(SSItems.BROWN_COTTON_CANDY.get());
        handheldItem(SSItems.GREEN_COTTON_CANDY.get());
        handheldItem(SSItems.RED_COTTON_CANDY.get());
        handheldItem(SSItems.BLACK_COTTON_CANDY.get());

        basicItem(SSItems.CANDY_CORN.get());

        basicItem(SSItems.SUGAR_COOKIE.get());
    }
}
