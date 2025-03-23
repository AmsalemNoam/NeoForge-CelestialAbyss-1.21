package net.penguinplay.celestialabyss.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlag;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.penguinplay.celestialabyss.block.ModBlocks;
import net.penguinplay.celestialabyss.item.ModItems;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.LUMENITE_BLOCK.get());
        dropSelf(ModBlocks.DARKITE_BLOCK.get());
        add(ModBlocks.LUMENITE_ORE.get(), block -> createOreDrop(ModBlocks.LUMENITE_ORE.get(), ModItems.RAW_LUMENITE.get()));
        add(ModBlocks.DARKITE_ORE.get(), block -> createOreDrop(ModBlocks.DARKITE_ORE.get(), ModItems.RAW_DARKITE.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
