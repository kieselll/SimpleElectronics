
package net.mcreator.simpleelectronicsalpha.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.simpleelectronicsalpha.world.inventory.TimedBombGuiMenu;
import net.mcreator.simpleelectronicsalpha.network.TimedBombGuiButtonMessage;
import net.mcreator.simpleelectronicsalpha.SimpleElectronicsAlphaMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class TimedBombGuiScreen extends AbstractContainerScreen<TimedBombGuiMenu> {
	private final static HashMap<String, Object> guistate = TimedBombGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;
	Button button_empty1;
	Button button_empty2;
	Button button_empty3;
	Button button_empty4;

	public TimedBombGuiScreen(TimedBombGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 180;
		this.imageHeight = 175;
	}

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		RenderSystem.setShaderTexture(0, new ResourceLocation("simple_electronics_alpha:textures/screens/gui_lol.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 180, 175, 180, 175);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, new TranslatableComponent("gui.simple_electronics_alpha.timed_bomb_gui.label_energy"), 101, 13, -65536);
		this.font.draw(poseStack, new TranslatableComponent("gui.simple_electronics_alpha.timed_bomb_gui.label_bnbtnumbertimer1"), 91, 40, -65536);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		button_empty = new Button(this.leftPos + 76, this.topPos + 61, 16, 20, new TranslatableComponent("gui.simple_electronics_alpha.timed_bomb_gui.button_empty"), e -> {
			if (true) {
				SimpleElectronicsAlphaMod.PACKET_HANDLER.sendToServer(new TimedBombGuiButtonMessage(0, x, y, z));
				TimedBombGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = new Button(this.leftPos + 93, this.topPos + 61, 16, 20, new TranslatableComponent("gui.simple_electronics_alpha.timed_bomb_gui.button_empty1"), e -> {
			if (true) {
				SimpleElectronicsAlphaMod.PACKET_HANDLER.sendToServer(new TimedBombGuiButtonMessage(1, x, y, z));
				TimedBombGuiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
		button_empty2 = new Button(this.leftPos + 110, this.topPos + 61, 16, 20, new TranslatableComponent("gui.simple_electronics_alpha.timed_bomb_gui.button_empty2"), e -> {
			if (true) {
				SimpleElectronicsAlphaMod.PACKET_HANDLER.sendToServer(new TimedBombGuiButtonMessage(2, x, y, z));
				TimedBombGuiButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:button_empty2", button_empty2);
		this.addRenderableWidget(button_empty2);
		button_empty3 = new Button(this.leftPos + 127, this.topPos + 61, 16, 20, new TranslatableComponent("gui.simple_electronics_alpha.timed_bomb_gui.button_empty3"), e -> {
			if (true) {
				SimpleElectronicsAlphaMod.PACKET_HANDLER.sendToServer(new TimedBombGuiButtonMessage(3, x, y, z));
				TimedBombGuiButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:button_empty3", button_empty3);
		this.addRenderableWidget(button_empty3);
		button_empty4 = new Button(this.leftPos + 156, this.topPos + 8, 13, 20, new TranslatableComponent("gui.simple_electronics_alpha.timed_bomb_gui.button_empty4"), e -> {
			if (true) {
				SimpleElectronicsAlphaMod.PACKET_HANDLER.sendToServer(new TimedBombGuiButtonMessage(4, x, y, z));
				TimedBombGuiButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:button_empty4", button_empty4);
		this.addRenderableWidget(button_empty4);
	}
}
