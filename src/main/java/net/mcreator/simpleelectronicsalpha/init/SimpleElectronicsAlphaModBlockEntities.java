
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.simpleelectronicsalpha.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.simpleelectronicsalpha.block.entity.TimerBombBlockEntity;
import net.mcreator.simpleelectronicsalpha.block.entity.ExtractorTileEntity;
import net.mcreator.simpleelectronicsalpha.SimpleElectronicsAlphaMod;

public class SimpleElectronicsAlphaModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, SimpleElectronicsAlphaMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> TIMER_BOMB = register("timer_bomb", SimpleElectronicsAlphaModBlocks.TIMER_BOMB, TimerBombBlockEntity::new);
	public static final RegistryObject<BlockEntityType<ExtractorTileEntity>> EXTRACTOR = REGISTRY.register("extractor", () -> BlockEntityType.Builder.of(ExtractorTileEntity::new, SimpleElectronicsAlphaModBlocks.EXTRACTOR.get()).build(null));

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
