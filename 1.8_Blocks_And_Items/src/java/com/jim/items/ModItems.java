package com.jim.items;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.jim.blocks.BlocksAndItemsMain;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {

    public static Item prismarine_crystals;
    public static Item prismarine_shard;
    public static Item mutton_raw;
    public static Item mutton_cooked;
    public static Item door_spruce;
    public static Item door_birch;
    public static Item door_jungle;
    public static Item door_acacia;
    public static Item door_dark_oak;
    public static Item armor_stand;

    public static void init() {
        prismarine_crystals = new Item()
                .setUnlocalizedName("prismarine_crystals")
                .setTextureName(
                        BlocksAndItemsMain.MODID + ":prismarine_crystals")
                .setCreativeTab(CreativeTabs.tabMaterials);
        prismarine_shard = new Item().setUnlocalizedName("prismarine_shard")
                .setTextureName(BlocksAndItemsMain.MODID + ":prismarine_shard")
                .setCreativeTab(CreativeTabs.tabMaterials);
        mutton_raw = new ItemModFood("mutton_raw", 2, 1.2f, true);
        mutton_cooked = new ItemModFood("mutton_cooked", 6, 9.6f, true);
        door_spruce = new ItemDoorSpruce(Material.wood)
                .setUnlocalizedName("door_spruce")
                .setTextureName(BlocksAndItemsMain.MODID + ":door_spruce")
                .setCreativeTab(CreativeTabs.tabRedstone);
        door_birch = new ItemDoorBirch(Material.wood)
                .setUnlocalizedName("door_birch")
                .setTextureName(BlocksAndItemsMain.MODID + ":door_birch")
                .setCreativeTab(CreativeTabs.tabRedstone);
        door_jungle = new ItemDoorJungle(Material.wood)
                .setUnlocalizedName("door_jungle")
                .setTextureName(BlocksAndItemsMain.MODID + ":door_jungle")
                .setCreativeTab(CreativeTabs.tabRedstone);
        door_acacia = new ItemDoorAcacia(Material.wood)
                .setUnlocalizedName("door_acacia")
                .setTextureName(BlocksAndItemsMain.MODID + ":door_acacia")
                .setCreativeTab(CreativeTabs.tabRedstone);
        door_dark_oak = new ItemDoorDarkOak(Material.wood)
                .setUnlocalizedName("door_dark_oak")
                .setTextureName(BlocksAndItemsMain.MODID + ":door_dark_oak")
                .setCreativeTab(CreativeTabs.tabRedstone);
        armor_stand = new ItemArmourStand();
        GameRegistry.registerItem(prismarine_shard,
                prismarine_shard.getUnlocalizedName());
        GameRegistry.registerItem(prismarine_crystals,
                prismarine_crystals.getUnlocalizedName());
        GameRegistry.registerItem(mutton_raw, mutton_raw.getUnlocalizedName());
        GameRegistry.registerItem(mutton_cooked,
                mutton_cooked.getUnlocalizedName());
        GameRegistry
                .registerItem(door_spruce, door_spruce.getUnlocalizedName());
        GameRegistry.registerItem(door_birch, door_birch.getUnlocalizedName());
        GameRegistry
                .registerItem(door_jungle, door_jungle.getUnlocalizedName());
        GameRegistry
                .registerItem(door_acacia, door_acacia.getUnlocalizedName());
        GameRegistry.registerItem(door_dark_oak,
                door_dark_oak.getUnlocalizedName());
        GameRegistry
                .registerItem(armor_stand, armor_stand.getUnlocalizedName());
    }
}
