package com.ediakarstudio.elementalsmod.blocks;

import com.ediakarstudio.elementalsmod.ElementalsMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS,
            ElementalsMod.MOD_ID);

    public static final RegistryObject<Block> SAPPHIRE_ORE_BLOCK = BLOCKS.register("sapphire_ore_block",
            () -> new Block(Block.Properties.create(Material.ROCK)));
}