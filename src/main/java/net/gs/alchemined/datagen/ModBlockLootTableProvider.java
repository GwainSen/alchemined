package net.gs.alchemined.datagen;

import java.util.Set;

import net.gs.alchemined.block.ModBlocks;
import net.gs.alchemined.item.ModItems;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

public class ModBlockLootTableProvider extends BlockLootSubProvider{

    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate(){
        //here go the drops of the blocks
        this.dropSelf(ModBlocks.B_SILVER_ORE.get());
        this.dropSelf(ModBlocks.B_SILVER_BLOCK.get());
        this.dropSelf(ModBlocks.B_ELECTRUM_BLOCK.get());

        this.add(ModBlocks.B_SILVER_ORE.get(),
            block -> createOreDrop(ModBlocks.B_SILVER_ORE.get(), ModItems.I_SILVER.get()));
    }

    @Override
    protected  Iterable<Block> getKnownBlocks(){
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
