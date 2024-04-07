package net.mcreator.simpleelectronicsalpha.procedures;

import net.minecraft.world.item.ItemStack;

public class WatchItemBeingProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.getOrCreateTag().putDouble("Timer1", 0);
		itemstack.getOrCreateTag().putBoolean("Power", (false));
	}
}
