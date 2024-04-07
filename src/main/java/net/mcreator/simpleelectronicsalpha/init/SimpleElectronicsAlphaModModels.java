
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.simpleelectronicsalpha.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.simpleelectronicsalpha.client.model.ModelCustomModel;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class SimpleElectronicsAlphaModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelCustomModel.LAYER_LOCATION, ModelCustomModel::createBodyLayer);
	}
}
