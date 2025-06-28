package net.mcreator.thefegrid.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.thefegrid.world.inventory.FETestBlockGUIMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class FETestBlockGUIScreen extends AbstractContainerScreen<FETestBlockGUIMenu> {
	private final static HashMap<String, Object> guistate = FETestBlockGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public FETestBlockGUIScreen(FETestBlockGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("the_fe_grid:textures/screens/fe_test_block_gui.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.the_fe_grid.fe_test_block_gui.label_fe_test_block"), 5, 5, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.the_fe_grid.fe_test_block_gui.label_x1"), 27, 26, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.the_fe_grid.fe_test_block_gui.label_x11"), 45, 26, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.the_fe_grid.fe_test_block_gui.label_y1"), 63, 26, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.the_fe_grid.fe_test_block_gui.label_y11"), 83, 26, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.the_fe_grid.fe_test_block_gui.label_z1"), 99, 26, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.the_fe_grid.fe_test_block_gui.label_z11"), 116, 26, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
