package net.gs.alchemined.datagen;

import java.util.concurrent.CompletableFuture;


import net.gs.alchemined.Alchemined;
import net.gs.alchemined.block.ModBlocks;
import net.gs.alchemined.item.ModItems;
//import net.gs.alchemined.util.ModTags; later important

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ItemTagsProvider;

public class ModItemTagProvider extends ItemTagsProvider{
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, Alchemined.MODID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

    }
}
