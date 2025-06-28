
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thefegrid.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.thefegrid.client.gui.SmelterGUIScreen;
import net.mcreator.thefegrid.client.gui.FETestBlockGUIScreen;
import net.mcreator.thefegrid.client.gui.ExtruderGUIScreen;
import net.mcreator.thefegrid.client.gui.AluminiumProcessorGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TheFeGridModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(TheFeGridModMenus.FE_TEST_BLOCK_GUI.get(), FETestBlockGUIScreen::new);
			MenuScreens.register(TheFeGridModMenus.EXTRUDER_GUI.get(), ExtruderGUIScreen::new);
			MenuScreens.register(TheFeGridModMenus.ALUMINIUM_PROCESSOR_GUI.get(), AluminiumProcessorGUIScreen::new);
			MenuScreens.register(TheFeGridModMenus.SMELTER_GUI.get(), SmelterGUIScreen::new);
		});
	}
}
