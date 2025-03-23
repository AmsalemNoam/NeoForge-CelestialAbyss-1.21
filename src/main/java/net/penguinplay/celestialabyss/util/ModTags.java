package net.penguinplay.celestialabyss.util;

import net.penguinplay.celestialabyss.CelestialAbyss;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;



/*CUSTOM TAGS FOR THE MOD*/


public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEED_LUMENITE_TOOL = createTag("needs_lumenite_tool");
        public static final TagKey<Block> INCORRECT_LUMENITE_TOOL = createTag("incorrect_lumenite_tool");

        public static final TagKey<Block> NEED_DARKITE_TOOL = createTag("needs_darkite_tool");
        public static final TagKey<Block> INCORRECT_DARKITE_TOOL = createTag("incorrect_darkite_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(CelestialAbyss.MOD_ID, name));
        }


    }

    public static class Items {
        public static final TagKey<Item> GOOD_ITEMS = createTag("good_items");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(CelestialAbyss.MOD_ID, name));
        }


    }
}