package net.penguinplay.celestialabyss.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.penguinplay.celestialabyss.CelestialAbyss;
import net.penguinplay.celestialabyss.block.ModBlocks;
import net.penguinplay.celestialabyss.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, CelestialAbyss.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.LUMENITE_BLOCK.get())
                .add(ModBlocks.DARKITE_BLOCK.get())
                .add(ModBlocks.LUMENITE_ORE.get())
                .add(ModBlocks.DARKITE_ORE.get());

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.LUMENITE_BLOCK.get())
                .add(ModBlocks.DARKITE_BLOCK.get())
                .add(ModBlocks.LUMENITE_ORE.get())
                .add(ModBlocks.DARKITE_ORE.get());


        tag(ModTags.Blocks.NEED_LUMENITE_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);
        tag(ModTags.Blocks.INCORRECT_LUMENITE_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .remove(ModTags.Blocks.NEED_LUMENITE_TOOL);


        tag(ModTags.Blocks.NEED_DARKITE_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);
        tag(ModTags.Blocks.INCORRECT_DARKITE_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .remove(ModTags.Blocks.NEED_DARKITE_TOOL);
    }
}
