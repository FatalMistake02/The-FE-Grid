package net.mcreator.thefegrid.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.thefegrid.world.inventory.ExtruderGUIMenu;
import net.mcreator.thefegrid.network.ExtruderGUIButtonMessage;
import net.mcreator.thefegrid.TheFeGridMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ExtruderGUIScreen extends AbstractContainerScreen<ExtruderGUIMenu> {
	private final static HashMap<String, Object> guistate = ExtruderGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_wiki;

	public ExtruderGUIScreen(ExtruderGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("the_fe_grid:textures/screens/extruder_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
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
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.the_fe_grid.extruder_gui.label_extruder"), 5, 5, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_wiki = Button.builder(Component.translatable("gui.the_fe_grid.extruder_gui.button_wiki"), e -> {
			if (true) {
				TheFeGridMod.PACKET_HANDLER.sendToServer(new ExtruderGUIButtonMessage(0, x, y, z));
				ExtruderGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 134, this.topPos + 5, 36, 20).build();
		guistate.put("button:button_wiki", button_wiki);
		this.addRenderableWidget(button_wiki);
	}
}
