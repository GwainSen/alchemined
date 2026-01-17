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

    //ores
    public static final DeferredItem<Item> I_SILVER = ITEMS.registerItem("silver", Item::new);
    public static final DeferredItem<Item> I_ELECTRUM= ITEMS.registerItem("electrum", Item::new);

    //vials
    public static final DeferredItem<Item> I_VIAL = ITEMS.registerItem("vial", (properties) -> new Item( properties.stacksTo(16)));
    public static final DeferredItem<Item> I_SILVER_VIAL = ITEMS.registerItem("silver_vial", (properties) -> new Item( properties.stacksTo(16)));
    public static final DeferredItem<Item> I_ELECTRUM_VIAL= ITEMS.registerItem("electrum_vial", (properties) -> new Item( properties.stacksTo(16)));

    //block items
    public static final DeferredItem<BlockItem> I_SILVER_ORE= ITEMS.registerSimpleBlockItem("silver_ore", ModBlocks.B_SILVER_ORE);
    public static final DeferredItem<BlockItem> I_SILVER_BLOCK= ITEMS.registerSimpleBlockItem("silver_block", ModBlocks.B_SILVER_BLOCK);
    public static final DeferredItem<BlockItem> I_ELECTRUM_BLOCK= ITEMS.registerSimpleBlockItem("electrum_block", ModBlocks.B_ELECTRUM_BLOCK);   

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
