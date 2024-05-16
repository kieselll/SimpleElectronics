
package net.mcreator.simpleelectronicsalpha.client.gui;

import net.minecraftforge.energy.CapabilityEnergy;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.simpleelectronicsalpha.world.inventory.TimedBombGuiMenu;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class TimedBombGuiScreen extends AbstractContainerScreen<TimedBombGuiMenu> {
	private final static HashMap<String, Object> guistate = TimedBombGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("simple_electronics_alpha:textures/gui_lol.png"));
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
		this.font.draw(poseStack, "" + (new Object() {
			public int getEnergyStored(BlockPos pos) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
				return _retval.get();
			}
		}.getEnergyStored(new BlockPos((int) x, (int) y, (int) z))) + "", 87, 13, -65536);
		this.font.draw(poseStack,
				"" + ((int) entity.getPersistentData().getDouble("tagName")) + ":" + ((int) entity.getPersistentData().getDouble("tagName")) + "", 74,
				40, -1);
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
		this.addRenderableWidget(new Button(this.leftPos + 76, this.topPos + 61, 16, 20, new TextComponent(" "), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 93, this.topPos + 61, 16, 20, new TextComponent(" "), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 110, this.topPos + 61, 16, 20, new TextComponent(" "), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 127, this.topPos + 61, 16, 20, new TextComponent(" "), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 155, this.topPos + 8, 13, 20, new TextComponent(" "), e -> {
		}));
	}
}
