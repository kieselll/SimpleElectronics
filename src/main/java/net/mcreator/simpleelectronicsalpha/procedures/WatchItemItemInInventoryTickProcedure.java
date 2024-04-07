package net.mcreator.simpleelectronicsalpha.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.Util;

public class WatchItemItemInInventoryTickProcedure {
	public static void execute(LevelAccessor world, ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getDouble("Timer1") > 0) {
			itemstack.getOrCreateTag().putDouble("Timer1", (itemstack.getOrCreateTag().getDouble("Timer1") - 0.05));
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastMessage(new TextComponent(("" + itemstack.getOrCreateTag().getDouble("Timer1"))),
							ChatType.SYSTEM, Util.NIL_UUID);
			}
		}
	}
}
