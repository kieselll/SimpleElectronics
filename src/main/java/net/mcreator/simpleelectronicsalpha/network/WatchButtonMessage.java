
package net.mcreator.simpleelectronicsalpha.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.simpleelectronicsalpha.world.inventory.WatchMenu;
import net.mcreator.simpleelectronicsalpha.procedures.TimerPowerProcedure;
import net.mcreator.simpleelectronicsalpha.procedures.TimerForwardProcedure;
import net.mcreator.simpleelectronicsalpha.procedures.TimerForwardForwardProcedure;
import net.mcreator.simpleelectronicsalpha.procedures.TimerBackProcedure;
import net.mcreator.simpleelectronicsalpha.procedures.TimerBackBackProcedure;
import net.mcreator.simpleelectronicsalpha.SimpleElectronicsAlphaMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WatchButtonMessage {
	private final int buttonID, x, y, z;

	public WatchButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public WatchButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(WatchButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(WatchButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = WatchMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			TimerBackBackProcedure.execute(world, entity);
		}
		if (buttonID == 1) {

			TimerBackProcedure.execute(world, entity);
		}
		if (buttonID == 2) {

			TimerForwardProcedure.execute(world, entity);
		}
		if (buttonID == 3) {

			TimerForwardForwardProcedure.execute(world, entity);
		}
		if (buttonID == 4) {

			TimerPowerProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		SimpleElectronicsAlphaMod.addNetworkMessage(WatchButtonMessage.class, WatchButtonMessage::buffer, WatchButtonMessage::new,
				WatchButtonMessage::handler);
	}
}
