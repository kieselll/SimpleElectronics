
package net.mcreator.simpleelectronicsalpha.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.simpleelectronicsalpha.world.inventory.TimedBombGuiMenu;
import net.mcreator.simpleelectronicsalpha.procedures.TimerPowerProcedure;
import net.mcreator.simpleelectronicsalpha.procedures.TimerForwardProcedure;
import net.mcreator.simpleelectronicsalpha.procedures.TimerForwardForwardProcedure;
import net.mcreator.simpleelectronicsalpha.procedures.TimerBackProcedure;
import net.mcreator.simpleelectronicsalpha.procedures.TimerBackBackProcedure;
import net.mcreator.simpleelectronicsalpha.SimpleElectronicsAlphaMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TimedBombGuiButtonMessage {
	private final int buttonID, x, y, z;

	public TimedBombGuiButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public TimedBombGuiButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(TimedBombGuiButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(TimedBombGuiButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = TimedBombGuiMenu.guistate;
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

			TimerPowerProcedure.execute(world, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		SimpleElectronicsAlphaMod.addNetworkMessage(TimedBombGuiButtonMessage.class, TimedBombGuiButtonMessage::buffer, TimedBombGuiButtonMessage::new, TimedBombGuiButtonMessage::handler);
	}
}
