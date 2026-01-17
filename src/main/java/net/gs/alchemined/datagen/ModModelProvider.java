package net.gs.alchemined.datagen;

import java.util.stream.Stream;

import net.gs.alchemined.Alchemined;
import net.gs.alchemined.block.ModBlocks;
import net.gs.alchemined.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.core.Holder;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModModelProvider extends ModelProvider{

    public ModModelProvider(PackOutput output) {
        super(output, Alchemined.MODID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        //Flat Items
        itemModels.generateFlatItem(ModItems.I_SILVER.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.I_ELECTRUM.get(), ModelTemplates.FLAT_ITEM);
            itemModels.generateFlatItem(ModItems.I_SILVER_VIAL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.I_ELECTRUM_VIAL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.I_VIAL.get(), ModelTemplates.FLAT_ITEM);   

        //Block Items
        blockModels.createTrivialCube(ModBlocks.B_SILVER_ORE.get());
        blockModels.createTrivialCube(ModBlocks.B_SILVER_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.B_ELECTRUM_BLOCK.get());

    }

    @Override
    protected Stream<? extends Holder<Block>> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream(); //.filter(); //special type blocks
    }

    @Override
    protected Stream<? extends Holder<Item>> getKnownItems() {
        return ModItems.ITEMS.getEntries().stream(); //.filter(); //special type items
    }
}
