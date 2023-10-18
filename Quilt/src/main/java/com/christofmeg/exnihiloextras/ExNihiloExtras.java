package com.christofmeg.exnihiloextras;

import com.christofmeg.exnihiloextras.init.ItemRegistration;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class ExNihiloExtras implements ModInitializer {

    public static final String MOD_ID = "exnihiloextras";

    public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder(
            new Identifier(MOD_ID, "general"))
            .icon(() -> new ItemStack(ItemRegistration.DOLL_FROG)).build();

    @Override
    public void onInitialize(ModContainer mod) {
        ItemRegistration.registerItems();
    }
}