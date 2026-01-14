package net.gs.alchemined.item;

import net.gs.alchemined.Alchemined;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;


public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Alchemined.MODID);

    public static final DeferredItem<Item> TEST_ITEM1 = ITEMS.registerItem("test_item1", Item::new, new Item.Properties());

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
