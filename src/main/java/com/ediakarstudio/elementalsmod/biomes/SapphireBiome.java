package com.ediakarstudio.elementalsmod.biomes;

import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class SapphireBiome extends Biome {

    protected static final SurfaceBuilderConfig AM_PLAINS_SURFACE = new SurfaceBuilderConfig(Blocks.PODZOL.getDefaultState(), Blocks.PODZOL.getDefaultState(), Blocks.CLAY.getDefaultState());

    public SapphireBiome() 
	{
		super((new Biome.Builder()).surfaceBuilder(new ConfiguredSurfaceBuilder<SurfaceBuilderConfig>(SurfaceBuilder.DEFAULT, AM_PLAINS_SURFACE)).precipitation(Biome.RainType.NONE).category(Biome.Category.DESERT).depth(0.125F).scale(0.05F).temperature(1000.8F).downfall(0.4F).waterColor(4159204).waterFogColor(329011).parent((String)null));
		DefaultBiomeFeatures.addStructures(this);
		DefaultBiomeFeatures.addCarvers(this);
	    DefaultBiomeFeatures.addStoneVariants(this);
	    DefaultBiomeFeatures.addOres(this);
	    this.addSpawn(EntityClassification.MONSTER, new Biome.SpawnListEntry(EntityType.ZOMBIE, 95, 4, 4));
	}
}