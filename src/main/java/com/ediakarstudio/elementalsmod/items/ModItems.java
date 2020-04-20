package com.ediakarstudio.elementalsmod.items;

import com.ediakarstudio.elementalsmod.ElementalsMod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ElementalsMod.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", () -> new Item(new Item.Properties().maxStackSize(64).group(ItemGroup.MISC)));
    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz", () -> new Item(new Item.Properties().maxStackSize(64).group(ItemGroup.MISC)));
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties().maxStackSize(64).group(ItemGroup.MISC)));
}