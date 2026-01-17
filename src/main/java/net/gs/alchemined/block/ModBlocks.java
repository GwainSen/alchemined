package net.gs.alchemined.block;

import net.gs.alchemined.Alchemined;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Alchemined.MODID);
    //maybe later better way
    public static final DeferredBlock<Block> B_SILVER_ORE = BLOCKS.register("silver_ore",
        BLOCKS -> new Block(BlockBehaviour.Properties.of()
        .setId(ResourceKey.create(Registries.BLOCK, BLOCKS))
    ));
    public static final DeferredBlock<Block> B_SILVER_BLOCK = BLOCKS.register("silver_block",
        BLOCKS -> new Block(BlockBehaviour.Properties.of()
        .setId(ResourceKey.create(Registries.BLOCK, BLOCKS))
    ));
    public static final DeferredBlock<Block> B_ELECTRUM_BLOCK = BLOCKS.register("electrum_block",
        BLOCKS -> new Block(BlockBehaviour.Properties.of()
        .setId(ResourceKey.create(Registries.BLOCK, BLOCKS))
    ));

    /* 
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        //registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> void registerBlockItem(String name, Supplier<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }*/

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    public static DeferredBlock<Block> getB_ELECTRUM_BLOCK() {
        return B_ELECTRUM_BLOCK;
    }
}
