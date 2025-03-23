package net.penguinplay.celestialabyss.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.penguinplay.celestialabyss.CelestialAbyss;
import net.penguinplay.celestialabyss.item.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {

    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, CelestialAbyss.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        tag(ItemTags.SWORDS)
                .add(ModItems.LUMENITE_SWORD.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.LUMENITE_PICKAXE.get());
        tag(ItemTags.AXES)
                .add(ModItems.LUMENITE_AXE.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.LUMENITE_SHOVEL.get());
        tag(ItemTags.HOES)
                .add(ModItems.LUMENITE_HOE.get());

        tag(ItemTags.SWORDS)
                .add(ModItems.DARKITE_SWORD.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.DARKITE_PICKAXE.get());
        tag(ItemTags.AXES)
                .add(ModItems.DARKITE_AXE.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.DARKITE_SHOVEL.get());
        tag(ItemTags.HOES)
                .add(ModItems.DARKITE_HOE.get());

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.LUMENITE_HELMET.get())
                .add(ModItems.LUMENITE_CHESTPLATE.get())
                .add(ModItems.LUMENITE_LEGGINGS.get())
                .add(ModItems.LUMENITE_BOOTS.get())
                .add(ModItems.DARKITE_HELMET.get())
                .add(ModItems.DARKITE_CHESTPLATE.get())
                .add(ModItems.DARKITE_LEGGINGS.get())
                .add(ModItems.DARKITE_BOOTS.get());

    }
}
