package com.christofmeg.exnihiloextras;

import com.christofmeg.exnihiloextras.init.ItemRegistration;
import net.fabricmc.api.ModInitializer;

public class ExNihiloExtras implements ModInitializer {

    public static final String MOD_ID = "exnihiloextras";

    @Override
    public void onInitialize() {
        ItemRegistration.registerItems();
    }

}