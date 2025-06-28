
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thefegrid.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.thefegrid.world.inventory.SmelterGUIMenu;
import net.mcreator.thefegrid.world.inventory.FETestBlockGUIMenu;
import net.mcreator.thefegrid.world.inventory.ExtruderGUIMenu;
import net.mcreator.thefegrid.world.inventory.AluminiumProcessorGUIMenu;
import net.mcreator.thefegrid.TheFeGridMod;

public class TheFeGridModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, TheFeGridMod.MODID);
	public static final RegistryObject<MenuType<FETestBlockGUIMenu>> FE_TEST_BLOCK_GUI = REGISTRY.register("fe_test_block_gui", () -> IForgeMenuType.create(FETestBlockGUIMenu::new));
	public static final RegistryObject<MenuType<ExtruderGUIMenu>> EXTRUDER_GUI = REGISTRY.register("extruder_gui", () -> IForgeMenuType.create(ExtruderGUIMenu::new));
	public static final RegistryObject<MenuType<AluminiumProcessorGUIMenu>> ALUMINIUM_PROCESSOR_GUI = REGISTRY.register("aluminium_processor_gui", () -> IForgeMenuType.create(AluminiumProcessorGUIMenu::new));
	public static final RegistryObject<MenuType<SmelterGUIMenu>> SMELTER_GUI = REGISTRY.register("smelter_gui", () -> IForgeMenuType.create(SmelterGUIMenu::new));
}
