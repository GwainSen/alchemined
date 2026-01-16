package net.gs.alchemined.item;

import net.gs.alchemined.Alchemined;
import net.gs.alchemined.block.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;


public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Alchemined.MODID);

    public static final DeferredItem<Item> TEST_ITEM1 = ITEMS.registerItem("test_item1", Item::new);

    public static final DeferredItem<Item> I_SILVER = ITEMS.registerItem("silver", Item::new);

    public static final DeferredItem<Item> I_ELECTRUM= ITEMS.registerItem("electrum", Item::new);

    //block items
    public static final DeferredItem<BlockItem> I_SILVER_ORE= ITEMS.registerSimpleBlockItem("silver_ore", ModBlocks.B_SILVER_ORE);
    public static final DeferredItem<BlockItem> I_SILVER_BLOCK= ITEMS.registerSimpleBlockItem("silver_block", ModBlocks.B_SILVER_BLOCK);
    public static final DeferredItem<BlockItem> I_ELECTRUM_BLOCK= ITEMS.registerSimpleBlockItem("electrum_block", ModBlocks.B_ELECTRUM_BLOCK);   
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
