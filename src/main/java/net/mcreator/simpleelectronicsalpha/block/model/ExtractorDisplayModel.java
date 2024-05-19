package net.mcreator.simpleelectronicsalpha.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.simpleelectronicsalpha.block.display.ExtractorDisplayItem;

public class ExtractorDisplayModel extends AnimatedGeoModel<ExtractorDisplayItem> {
	@Override
	public ResourceLocation getAnimationFileLocation(ExtractorDisplayItem animatable) {
		return new ResourceLocation("simple_electronics_alpha", "animations/extractor_-_converted.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(ExtractorDisplayItem animatable) {
		return new ResourceLocation("simple_electronics_alpha", "geo/extractor_-_converted.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(ExtractorDisplayItem entity) {
		return new ResourceLocation("simple_electronics_alpha", "textures/blocks/texture-1.png");
	}
}
