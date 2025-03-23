package net.penguinplay.celestialabyss.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.penguinplay.celestialabyss.CelestialAbyss;
import net.penguinplay.celestialabyss.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CelestialAbyss.MOD_ID);

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }

    public static final Supplier<CreativeModeTab> CELESTIAL_ABYSS_TAB = CREATIVE_MODE_TAB.register("celestialabyss_tab",
            ()-> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.LUMENITE.get()))
                    .title(Component.translatable("creativetab.celestialabyss.celestialabyss"))
                    .displayItems((itemDisplayParameters, output) ->  {

                        output.accept(ModItems.LUMENITE);
                        output.accept(ModItems.DARKITE);
                        output.accept(ModItems.RAW_LUMENITE);
                        output.accept(ModItems.RAW_DARKITE);
                        output.accept(ModItems.LUMENITE_NUGGET);

                        output.accept(ModBlocks.LUMENITE_BLOCK);
                        output.accept(ModBlocks.DARKITE_BLOCK);
                        output.accept(ModBlocks.LUMENITE_ORE);
                        output.accept(ModBlocks.DARKITE_ORE);

                        output.accept(ModItems.LUMENITE_SWORD);
                        output.accept(ModItems.LUMENITE_PICKAXE);
                        output.accept(ModItems.LUMENITE_AXE);
                        output.accept(ModItems.LUMENITE_SHOVEL);
                        output.accept(ModItems.LUMENITE_HOE);
                        output.accept(ModItems.DARKITE_SWORD);
                        output.accept(ModItems.DARKITE_PICKAXE);
                        output.accept(ModItems.DARKITE_AXE);
                        output.accept(ModItems.DARKITE_SHOVEL);
                        output.accept(ModItems.DARKITE_HOE);


                        output.accept(ModItems.LUMENITE_HELMET);
                        output.accept(ModItems.LUMENITE_CHESTPLATE);
                        output.accept(ModItems.LUMENITE_LEGGINGS);
                        output.accept(ModItems.LUMENITE_BOOTS);
                        output.accept(ModItems.DARKITE_HELMET);
                        output.accept(ModItems.DARKITE_CHESTPLATE);
                        output.accept(ModItems.DARKITE_LEGGINGS);
                        output.accept(ModItems.DARKITE_BOOTS);

                    }).build());

    /*IF NEED TO ADD ANOTHER TAB EXAMPLE FOR BLOCKS NEED TO ADD THE "withTabsBefore" COMMAND
    public static final Supplier<CreativeModeTab> CELESTIAL_ABYSS_TAB_BLOCKS = CREATIVE_MODE_TAB.register("celestialabyss_tab_blocks",
            ()-> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.LUMENITE_BLOCK.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(CelestialAbyss.MOD_ID, "celestialabyss_tab"))
                    .title(Component.translatable("creativetab.celestialabyss.celestialabyss_blocks"))
                    .displayItems((itemDisplayParameters, output) ->  {

                        output.accept(ModBlocks.LUMENITE_BLOCK);
                        output.accept(ModBlocks.DARKITE_BLOCK);
                        output.accept(ModBlocks.LUMENITE_ORE);
                        output.accept(ModBlocks.DARKITE_ORE);

                    }).build());

     */
}
