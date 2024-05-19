
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.simpleelectronicsalpha.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.simpleelectronicsalpha.block.TimerBombBlock;
import net.mcreator.simpleelectronicsalpha.block.TableBlock;
import net.mcreator.simpleelectronicsalpha.block.ExtractorBlock;
import net.mcreator.simpleelectronicsalpha.SimpleElectronicsAlphaMod;

public class SimpleElectronicsAlphaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SimpleElectronicsAlphaMod.MODID);
	public static final RegistryObject<Block> TIMER_BOMB = REGISTRY.register("timer_bomb", () -> new TimerBombBlock());
	public static final RegistryObject<Block> TABLE = REGISTRY.register("table", () -> new TableBlock());
	public static final RegistryObject<Block> EXTRACTOR = REGISTRY.register("extractor", () -> new ExtractorBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			TimerBombBlock.registerRenderLayer();
			TableBlock.registerRenderLayer();
		}
	}
}
