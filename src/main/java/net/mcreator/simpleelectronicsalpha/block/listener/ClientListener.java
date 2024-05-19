package net.mcreator.simpleelectronicsalpha.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.simpleelectronicsalpha.init.SimpleElectronicsAlphaModBlockEntities;
import net.mcreator.simpleelectronicsalpha.block.renderer.ExtractorTileRenderer;
import net.mcreator.simpleelectronicsalpha.SimpleElectronicsAlphaMod;

@Mod.EventBusSubscriber(modid = SimpleElectronicsAlphaMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(SimpleElectronicsAlphaModBlockEntities.EXTRACTOR.get(), ExtractorTileRenderer::new);
	}
}
