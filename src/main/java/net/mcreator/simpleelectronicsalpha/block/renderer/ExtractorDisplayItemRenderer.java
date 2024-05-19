package net.mcreator.simpleelectronicsalpha.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.simpleelectronicsalpha.block.model.ExtractorDisplayModel;
import net.mcreator.simpleelectronicsalpha.block.display.ExtractorDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ExtractorDisplayItemRenderer extends GeoItemRenderer<ExtractorDisplayItem> {
	public ExtractorDisplayItemRenderer() {
		super(new ExtractorDisplayModel());
	}

	@Override
	public RenderType getRenderType(ExtractorDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
