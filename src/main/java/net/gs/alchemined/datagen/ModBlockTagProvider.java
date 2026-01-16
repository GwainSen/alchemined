package net.gs.alchemined.datagen;

import java.util.concurrent.CompletableFuture;

import net.gs.alchemined.Alchemined;
import net.gs.alchemined.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

public class ModBlockTagProvider extends BlockTagsProvider{
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider){
         super(output, lookupProvider, Alchemined.MODID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider){
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .add(ModBlocks.B_SILVER_ORE.get())
            .add(ModBlocks.B_SILVER_BLOCK.get())
            .add(ModBlocks.B_ELECTRUM_BLOCK.get());
        //tag(BlockTags.NEEDS_IRON_TOOL) example if needed later
    }
}
