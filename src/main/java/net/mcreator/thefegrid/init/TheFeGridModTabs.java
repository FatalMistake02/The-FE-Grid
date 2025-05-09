
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thefegrid.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.thefegrid.TheFeGridMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheFeGridModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheFeGridMod.MODID);
	public static final RegistryObject<CreativeModeTab> THE_FE_GRID = REGISTRY.register("the_fe_grid",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.the_fe_grid.the_fe_grid")).icon(() -> new ItemStack(TheFeGridModBlocks.ENERGY_BLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TheFeGridModBlocks.ENERGY_BLOCK.get().asItem());
				tabData.accept(TheFeGridModBlocks.SOLAR_PANEL.get().asItem());
				tabData.accept(TheFeGridModBlocks.SOLAR_PANEL_ON_FRAME.get().asItem());
				tabData.accept(TheFeGridModBlocks.SOLAR_PANEL_FRAME.get().asItem());
				tabData.accept(TheFeGridModBlocks.SOLAR_PANEL_FRAME_WITH_CABLE.get().asItem());
				tabData.accept(TheFeGridModBlocks.FE_TEST_BLOCK.get().asItem());
				tabData.accept(TheFeGridModBlocks.HALF_A_MILLION_STORAGE_BLOCK.get().asItem());
				tabData.accept(TheFeGridModBlocks.QUARTER_OF_A_MILLION_STORAGE_BLOCK.get().asItem());
				tabData.accept(TheFeGridModBlocks.ONE_MILLION_STORAGE_BLOCK.get().asItem());
				tabData.accept(TheFeGridModBlocks.BAUXITE_ORE.get().asItem());
				tabData.accept(TheFeGridModItems.BAUXITE_DUST.get());
				tabData.accept(TheFeGridModBlocks.BAUXITE_BLOCK.get().asItem());
				tabData.accept(TheFeGridModItems.CARBON.get());
				tabData.accept(TheFeGridModBlocks.SILICA_SAND.get().asItem());
				tabData.accept(TheFeGridModItems.SILICON_NUGGET.get());
				tabData.accept(TheFeGridModItems.SILICON_INGOT.get());
				tabData.accept(TheFeGridModItems.SILICON_WAFER.get());
				tabData.accept(TheFeGridModItems.WIRE_SPOOL.get());
				tabData.accept(TheFeGridModItems.ALUMINIUM_FRAME.get());
				tabData.accept(TheFeGridModItems.IRON_SHEET.get());
				tabData.accept(TheFeGridModItems.IRON_WIRE.get());
				tabData.accept(TheFeGridModItems.COPPER_WIRE.get());
				tabData.accept(TheFeGridModItems.CAPACITOR.get());
				tabData.accept(TheFeGridModItems.LITHIUM_CELL.get());
				tabData.accept(TheFeGridModItems.BATTERY.get());
				tabData.accept(TheFeGridModBlocks.GRANITE.get().asItem());
				tabData.accept(TheFeGridModItems.LITHIUM_DUST.get());
				tabData.accept(TheFeGridModItems.LITHIUM_INGOT.get());
				tabData.accept(TheFeGridModBlocks.EXTRUDER.get().asItem());
				tabData.accept(TheFeGridModBlocks.ALUMINIUM_PROCESSOR.get().asItem());
				tabData.accept(TheFeGridModItems.ALUMINA.get());
				tabData.accept(TheFeGridModItems.ALUMINIUM_INGOT.get());
				tabData.accept(TheFeGridModBlocks.ALUMINIUM_BLOCK.get().asItem());
				tabData.accept(TheFeGridModItems.STEEL_INGOT.get());
				tabData.accept(TheFeGridModBlocks.STEEL_BLOCK.get().asItem());
				tabData.accept(TheFeGridModItems.DIAMOND_CIRCUIT.get());
				tabData.accept(TheFeGridModItems.GOLD_CIRCUIT.get());
				tabData.accept(TheFeGridModItems.IRON_CIRCUIT.get());
				tabData.accept(TheFeGridModItems.SOLAR_PANEL_CIRCUIT.get());
				tabData.accept(TheFeGridModBlocks.SMELTER.get().asItem());
				tabData.accept(TheFeGridModBlocks.CABLE_N.get().asItem());
				tabData.accept(TheFeGridModItems.SOLAR_CELL.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(TheFeGridModBlocks.BAUXITE_BLOCK.get().asItem());
			tabData.accept(TheFeGridModBlocks.ALUMINIUM_BLOCK.get().asItem());
			tabData.accept(TheFeGridModBlocks.STEEL_BLOCK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(TheFeGridModBlocks.BAUXITE_ORE.get().asItem());
			tabData.accept(TheFeGridModBlocks.SILICA_SAND.get().asItem());
			tabData.accept(TheFeGridModBlocks.GRANITE.get().asItem());
		}
	}
}
