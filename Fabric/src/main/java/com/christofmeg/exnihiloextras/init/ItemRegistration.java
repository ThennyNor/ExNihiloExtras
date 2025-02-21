package com.christofmeg.exnihiloextras.init;

import com.christofmeg.exnihiloextras.ExNihiloExtras;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ItemRegistration {

    public static final Item DOLL_BEE = new Item(new FabricItemSettings().group(ExNihiloExtras.ITEM_GROUP)) {
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable(ExNihiloExtras.MOD_ID + ".tooltip.doll.bee"));
        }
    };

    public static final Item DOLL_FROG = new Item(new FabricItemSettings().group(ExNihiloExtras.ITEM_GROUP)) {
        @Override
        public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable(ExNihiloExtras.MOD_ID + "." + "tooltip.doll.frog"));

        }
    };

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(ExNihiloExtras.MOD_ID, "doll_bee"), DOLL_BEE);
        Registry.register(Registry.ITEM, new Identifier(ExNihiloExtras.MOD_ID, "doll_frog"), DOLL_FROG);
    }

}
