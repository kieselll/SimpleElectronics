package net.mcreator.simpleelectronicsalpha.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.item.ItemStack;

import net.mcreator.simpleelectronicsalpha.init.SimpleElectronicsAlphaModItems;

public class WatchItemBeingProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.getOrCreateTag().putDouble("Timer1", 0);
		itemstack.getOrCreateTag().putBoolean("Power", (false));
		{
			ItemStack _isc = itemstack;
			final ItemStack _setstack = new ItemStack(SimpleElectronicsAlphaModItems.SMD_BUTTON.get());
			final int _sltid = 0;
			_setstack.setCount(1);
			_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
				if (capability instanceof IItemHandlerModifiable) {
					((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
				}
			});
		}
	}
}
