package net.gs.alchemined.item;

import net.gs.alchemined.Alchemined;
import net.gs.alchemined.block.ModBlocks;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;


public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Alchemined.MODID);

    public static final DeferredItem<Item> TEST_ITEM1 = ITEMS.registerItem("test_item1", Item::new, new Item.Properties());

    public static final DeferredItem<Item> I_SILVER = ITEMS.registerItem("silver", Item::new, new Item.Properties());

    public static final DeferredItem<Item> I_ELECTRUM= ITEMS.registerItem("electrum", Item::new, new Item.Properties());

    //block items
    public static final DeferredItem<BlockItem> I_SILVER_ORE= ITEMS.registerSimpleBlockItem("silver_ore", ModBlocks.B_SILVER_ORE, new Item.Properties());
    public static final DeferredItem<BlockItem> I_SILVER_BLOCK= ITEMS.registerSimpleBlockItem("silver_block", ModBlocks.B_SILVER_BLOCK, new Item.Properties());
    public static final DeferredItem<BlockItem> I_ELECTRUM_BLOCK= ITEMS.registerSimpleBlockItem("electrum_block", ModBlocks.B_ELECTRUM_BLOCK, new Item.Properties());   
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
