package net.penguinplay.celestialabyss.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.penguinplay.celestialabyss.CelestialAbyss;
import net.penguinplay.celestialabyss.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, CelestialAbyss.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.LUMENITE_BLOCK);
        blockWithItem(ModBlocks.DARKITE_BLOCK);
        blockWithItem(ModBlocks.LUMENITE_ORE);
        blockWithItem(ModBlocks.DARKITE_ORE);
    }
/*HELPER METHOD FOR "NORMAL" BLOCKS*/
    private void blockWithItem(DeferredBlock<?> deferredBlock){
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
