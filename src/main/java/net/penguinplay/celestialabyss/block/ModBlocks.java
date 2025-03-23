package net.penguinplay.celestialabyss.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.penguinplay.celestialabyss.CelestialAbyss;
import net.penguinplay.celestialabyss.item.ModItems;

import java.util.function.Supplier;

/*"noLootTable" Method if wants nothing to drop from the block*/

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(CelestialAbyss.MOD_ID);

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static <T extends  Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block){
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static final DeferredBlock<Block> LUMENITE_BLOCK = registerBlock("lumenite_block", () -> new Block((BlockBehaviour.Properties.of()
            .strength(50f, 1000f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST_CLUSTER).lightLevel(state -> 10))));

    public static final DeferredBlock<Block> DARKITE_BLOCK = registerBlock("darkite_block", () -> new Block((BlockBehaviour.Properties.of()
            .strength(50f, 1000f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES))));

    public static final DeferredBlock<Block> LUMENITE_ORE = registerBlock("lumenite_ore", () -> new Block((BlockBehaviour.Properties.of()
            .strength(40f, 1000f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST).lightLevel(state -> 4))));

    public static final DeferredBlock<Block> DARKITE_ORE = registerBlock("darkite_ore", () -> new Block((BlockBehaviour.Properties.of()
            .strength(40f, 1000f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS))));
}
