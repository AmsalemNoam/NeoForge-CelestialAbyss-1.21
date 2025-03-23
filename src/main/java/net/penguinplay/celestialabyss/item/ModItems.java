package net.penguinplay.celestialabyss.item;

import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.penguinplay.celestialabyss.CelestialAbyss;
import net.penguinplay.celestialabyss.item.custom.ModArmorItem;


public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CelestialAbyss.MOD_ID);

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

    public static final DeferredItem<Item> LUMENITE = ITEMS.register("lumenite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_LUMENITE = ITEMS.register("raw_lumenite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DARKITE = ITEMS.register("darkite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_DARKITE = ITEMS.register("raw_darkite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LUMENITE_NUGGET = ITEMS.register("lumenite_nugget", () -> new Item(new Item.Properties()));



    public static final DeferredItem<SwordItem> LUMENITE_SWORD = ITEMS.register("lumenite_sword",
            () -> new SwordItem(ModToolTiers.LUMENITE, new Item.Properties().fireResistant()
                    .attributes(SwordItem.createAttributes(ModToolTiers.LUMENITE, 5, -2f))));
    public static final DeferredItem<PickaxeItem> LUMENITE_PICKAXE = ITEMS.register("lumenite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.LUMENITE, new Item.Properties().fireResistant()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.LUMENITE, 1.0F, -2.5f))));
    public static final DeferredItem<ShovelItem> LUMENITE_SHOVEL = ITEMS.register("lumenite_shovel",
            () -> new ShovelItem(ModToolTiers.LUMENITE, new Item.Properties().fireResistant()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.LUMENITE, 1.0F, -2.5f))));
    public static final DeferredItem<AxeItem> LUMENITE_AXE = ITEMS.register("lumenite_axe",
            () -> new AxeItem(ModToolTiers.LUMENITE, new Item.Properties().fireResistant()
                    .attributes(AxeItem.createAttributes(ModToolTiers.LUMENITE, 5.0F, -2.5f))));
    public static final DeferredItem<HoeItem> LUMENITE_HOE = ITEMS.register("lumenite_hoe",
            () -> new HoeItem(ModToolTiers.LUMENITE, new Item.Properties().fireResistant()
                    .attributes(HoeItem.createAttributes(ModToolTiers.LUMENITE, -3.0F, -1.0f))));

    public static final DeferredItem<SwordItem> DARKITE_SWORD = ITEMS.register("darkite_sword",
            () -> new SwordItem(ModToolTiers.DARKITE, new Item.Properties().fireResistant()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DARKITE, 6, -2.5f))));
    public static final DeferredItem<PickaxeItem> DARKITE_PICKAXE = ITEMS.register("darkite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.DARKITE, new Item.Properties().fireResistant()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.DARKITE, 1.0F, -2.5f))));
    public static final DeferredItem<ShovelItem> DARKITE_SHOVEL = ITEMS.register("darkite_shovel",
            () -> new ShovelItem(ModToolTiers.DARKITE, new Item.Properties().fireResistant()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.DARKITE, 1.0F, -2.5f))));
    public static final DeferredItem<AxeItem> DARKITE_AXE = ITEMS.register("darkite_axe",
            () -> new AxeItem(ModToolTiers.DARKITE, new Item.Properties().fireResistant()
                    .attributes(AxeItem.createAttributes(ModToolTiers.DARKITE, 6.0F, -3f))));
    public static final DeferredItem<HoeItem> DARKITE_HOE = ITEMS.register("darkite_hoe",
            () -> new HoeItem(ModToolTiers.DARKITE, new Item.Properties().fireResistant()
                    .attributes(HoeItem.createAttributes(ModToolTiers.DARKITE, -3.0F, -1.0f))));




    public static final DeferredItem<ArmorItem> LUMENITE_HELMET = ITEMS.register("lumenite_helmet",
            () -> new ModArmorItem(ModArmorMaterials.LUMENITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.HELMET.getDurability(40))));

    public static final DeferredItem<ArmorItem> LUMENITE_CHESTPLATE = ITEMS.register("lumenite_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.LUMENITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(40))));

    public static final DeferredItem<ArmorItem> LUMENITE_LEGGINGS = ITEMS.register("lumenite_leggings",
            () -> new ModArmorItem(ModArmorMaterials.LUMENITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(40))));

    public static final DeferredItem<ArmorItem> LUMENITE_BOOTS = ITEMS.register("lumenite_boots",
            () -> new ModArmorItem(ModArmorMaterials.LUMENITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(40))));



    public static final DeferredItem<ArmorItem> DARKITE_HELMET = ITEMS.register("darkite_helmet",
            () -> new ModArmorItem(ModArmorMaterials.DARKITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.HELMET.getDurability(45))));

    public static final DeferredItem<ArmorItem> DARKITE_CHESTPLATE = ITEMS.register("darkite_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.DARKITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(45))));

    public static final DeferredItem<ArmorItem> DARKITE_LEGGINGS = ITEMS.register("darkite_leggings",
            () -> new ModArmorItem(ModArmorMaterials.DARKITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(45))));

    public static final DeferredItem<ArmorItem> DARKITE_BOOTS = ITEMS.register("darkite_boots",
            () -> new ModArmorItem(ModArmorMaterials.DARKITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(45))));



}
