package net.mcreator.simpleelectronicsalpha.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.Util;

import net.mcreator.simpleelectronicsalpha.init.SimpleElectronicsAlphaModItems;

import java.util.stream.Collectors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Comparator;

public class WatchItemItemInInventoryTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getDouble("Timer1") > 0) {
			itemstack.getOrCreateTag().putDouble("Timer1", (itemstack.getOrCreateTag().getDouble("Timer1") - 0.05));
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastMessage(new TextComponent(("" + itemstack.getOrCreateTag().getDouble("Timer1"))),
							ChatType.SYSTEM, Util.NIL_UUID);
			}
		} else {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream()
						.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					{
						AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
						entityiterator.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
								.ifPresent(capability -> _iitemhandlerref.set(capability));
						if (_iitemhandlerref.get() != null) {
							for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
								ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
								if (itemstackiterator.getItem() == SimpleElectronicsAlphaModItems.WATCH_ITEM.get()) {
									if ((new Object() {
										public ItemStack getItemStack(int sltid, ItemStack _isc) {
											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
											_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
												_retval.set(capability.getStackInSlot(sltid).copy());
											});
											return _retval.get();
										}
									}.getItemStack(1, itemstackiterator)).getItem() == Blocks.TNT.asItem()) {
										if (world instanceof Level _level && !_level.isClientSide())
											_level.explode(null, x, y, z, 4, Explosion.BlockInteraction.BREAK);
										{
											ItemStack _isc = itemstackiterator;
											final ItemStack _setstack = new ItemStack(Items.STICK);
											final int _sltid = 2;
											_setstack.setCount(1);
											_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
												if (capability instanceof IItemHandlerModifiable) {
													((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
												}
											});
										}
									} else if ((new Object() {
										public ItemStack getItemStack(int sltid, ItemStack _isc) {
											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
											_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
												_retval.set(capability.getStackInSlot(sltid).copy());
											});
											return _retval.get();
										}
									}.getItemStack(2, itemstackiterator)).getItem() == Blocks.TNT.asItem()) {
										{
											ItemStack _isc = itemstackiterator;
											final ItemStack _setstack = new ItemStack(Items.STICK);
											final int _sltid = 3;
											_setstack.setCount(1);
											_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
												if (capability instanceof IItemHandlerModifiable) {
													((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
												}
											});
										}
										if (world instanceof Level _level && !_level.isClientSide())
											_level.explode(null, x, y, z, 4, Explosion.BlockInteraction.BREAK);
									} else if ((new Object() {
										public ItemStack getItemStack(int sltid, ItemStack _isc) {
											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
											_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
												_retval.set(capability.getStackInSlot(sltid).copy());
											});
											return _retval.get();
										}
									}.getItemStack(3, itemstackiterator)).getItem() == Blocks.TNT.asItem()) {
										{
											ItemStack _isc = itemstackiterator;
											final ItemStack _setstack = new ItemStack(Items.STICK);
											final int _sltid = 4;
											_setstack.setCount(1);
											_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
												if (capability instanceof IItemHandlerModifiable) {
													((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
												}
											});
										}
										if (world instanceof Level _level && !_level.isClientSide())
											_level.explode(null, x, y, z, 4, Explosion.BlockInteraction.BREAK);
									} else {
										itemstackiterator.getOrCreateTag().putBoolean("Power", (false));
										itemstack.getOrCreateTag().putDouble("Timer1", 0);
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
