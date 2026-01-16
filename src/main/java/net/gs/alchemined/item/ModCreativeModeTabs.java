package net.gs.alchemined.item;

import net.gs.alchemined.Alchemined;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;



public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Alchemined.MODID);

    public static final DeferredHolder<CreativeModeTab,CreativeModeTab> ALCHEMINED_ITEMS = CREATIVE_MODE_TAB
        .register("alchemined_items_tab",
        () -> CreativeModeTab.builder()
        .title(Component.translatable("creativetab.alchemined_items"))
        .withTabsBefore(CreativeModeTabs.COMBAT)
        .icon(() -> ModItems.I_ELECTRUM.get().getDefaultInstance())
        .displayItems((parameters, output) -> {
            output.accept(ModItems.I_ELECTRUM);
            output.accept(ModItems.I_SILVER);
        }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}   
