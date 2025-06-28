
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thefegrid.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.thefegrid.item.WireSpoolItem;
import net.mcreator.thefegrid.item.SteelIngotItem;
import net.mcreator.thefegrid.item.SolarPanelCircuitItem;
import net.mcreator.thefegrid.item.SolarCellItem;
import net.mcreator.thefegrid.item.SiliconWaferItem;
import net.mcreator.thefegrid.item.SiliconNuggetItem;
import net.mcreator.thefegrid.item.SiliconIngotItem;
import net.mcreator.thefegrid.item.LithiumIngotItem;
import net.mcreator.thefegrid.item.LithiumDustItem;
import net.mcreator.thefegrid.item.LithiumCellItem;
import net.mcreator.thefegrid.item.IronWireItem;
import net.mcreator.thefegrid.item.IronSheetItem;
import net.mcreator.thefegrid.item.IronCircuitItem;
import net.mcreator.thefegrid.item.GoldCircuitItem;
import net.mcreator.thefegrid.item.DiamondCircuitItem;
import net.mcreator.thefegrid.item.CopperWireItem;
import net.mcreator.thefegrid.item.CarbonItem;
import net.mcreator.thefegrid.item.CapacitorItem;
import net.mcreator.thefegrid.item.BauxiteDustItem;
import net.mcreator.thefegrid.item.BatteryItem;
import net.mcreator.thefegrid.item.AluminiumIngotItem;
import net.mcreator.thefegrid.item.AluminiumFrameItem;
import net.mcreator.thefegrid.item.AluminaItem;
import net.mcreator.thefegrid.TheFeGridMod;

public class TheFeGridModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TheFeGridMod.MODID);
	public static final RegistryObject<Item> ENERGY_BLOCK = block(TheFeGridModBlocks.ENERGY_BLOCK);
	public static final RegistryObject<Item> SOLAR_PANEL = block(TheFeGridModBlocks.SOLAR_PANEL);
	public static final RegistryObject<Item> SOLAR_PANEL_ON_FRAME = block(TheFeGridModBlocks.SOLAR_PANEL_ON_FRAME);
	public static final RegistryObject<Item> SOLAR_PANEL_FRAME = block(TheFeGridModBlocks.SOLAR_PANEL_FRAME);
	public static final RegistryObject<Item> SOLAR_PANEL_FRAME_WITH_CABLE = block(TheFeGridModBlocks.SOLAR_PANEL_FRAME_WITH_CABLE);
	public static final RegistryObject<Item> FE_TEST_BLOCK = block(TheFeGridModBlocks.FE_TEST_BLOCK);
	public static final RegistryObject<Item> HALF_A_MILLION_STORAGE_BLOCK = block(TheFeGridModBlocks.HALF_A_MILLION_STORAGE_BLOCK);
	public static final RegistryObject<Item> QUARTER_OF_A_MILLION_STORAGE_BLOCK = block(TheFeGridModBlocks.QUARTER_OF_A_MILLION_STORAGE_BLOCK);
	public static final RegistryObject<Item> ONE_MILLION_STORAGE_BLOCK = block(TheFeGridModBlocks.ONE_MILLION_STORAGE_BLOCK);
	public static final RegistryObject<Item> BAUXITE_ORE = block(TheFeGridModBlocks.BAUXITE_ORE);
	public static final RegistryObject<Item> BAUXITE_DUST = REGISTRY.register("bauxite_dust", () -> new BauxiteDustItem());
	public static final RegistryObject<Item> BAUXITE_BLOCK = block(TheFeGridModBlocks.BAUXITE_BLOCK);
	public static final RegistryObject<Item> CARBON = REGISTRY.register("carbon", () -> new CarbonItem());
	public static final RegistryObject<Item> SILICA_SAND = block(TheFeGridModBlocks.SILICA_SAND);
	public static final RegistryObject<Item> SILICON_NUGGET = REGISTRY.register("silicon_nugget", () -> new SiliconNuggetItem());
	public static final RegistryObject<Item> SILICON_INGOT = REGISTRY.register("silicon_ingot", () -> new SiliconIngotItem());
	public static final RegistryObject<Item> SILICON_WAFER = REGISTRY.register("silicon_wafer", () -> new SiliconWaferItem());
	public static final RegistryObject<Item> WIRE_SPOOL = REGISTRY.register("wire_spool", () -> new WireSpoolItem());
	public static final RegistryObject<Item> ALUMINIUM_FRAME = REGISTRY.register("aluminium_frame", () -> new AluminiumFrameItem());
	public static final RegistryObject<Item> IRON_SHEET = REGISTRY.register("iron_sheet", () -> new IronSheetItem());
	public static final RegistryObject<Item> IRON_WIRE = REGISTRY.register("iron_wire", () -> new IronWireItem());
	public static final RegistryObject<Item> COPPER_WIRE = REGISTRY.register("copper_wire", () -> new CopperWireItem());
	public static final RegistryObject<Item> CAPACITOR = REGISTRY.register("capacitor", () -> new CapacitorItem());
	public static final RegistryObject<Item> LITHIUM_CELL = REGISTRY.register("lithium_cell", () -> new LithiumCellItem());
	public static final RegistryObject<Item> BATTERY = REGISTRY.register("battery", () -> new BatteryItem());
	public static final RegistryObject<Item> GRANITE = block(TheFeGridModBlocks.GRANITE);
	public static final RegistryObject<Item> LITHIUM_DUST = REGISTRY.register("lithium_dust", () -> new LithiumDustItem());
	public static final RegistryObject<Item> LITHIUM_INGOT = REGISTRY.register("lithium_ingot", () -> new LithiumIngotItem());
	public static final RegistryObject<Item> EXTRUDER = block(TheFeGridModBlocks.EXTRUDER);
	public static final RegistryObject<Item> ALUMINIUM_PROCESSOR = block(TheFeGridModBlocks.ALUMINIUM_PROCESSOR);
	public static final RegistryObject<Item> ALUMINA = REGISTRY.register("alumina", () -> new AluminaItem());
	public static final RegistryObject<Item> ALUMINIUM_INGOT = REGISTRY.register("aluminium_ingot", () -> new AluminiumIngotItem());
	public static final RegistryObject<Item> ALUMINIUM_BLOCK = block(TheFeGridModBlocks.ALUMINIUM_BLOCK);
	public static final RegistryObject<Item> STEEL_INGOT = REGISTRY.register("steel_ingot", () -> new SteelIngotItem());
	public static final RegistryObject<Item> STEEL_BLOCK = block(TheFeGridModBlocks.STEEL_BLOCK);
	public static final RegistryObject<Item> DIAMOND_CIRCUIT = REGISTRY.register("diamond_circuit", () -> new DiamondCircuitItem());
	public static final RegistryObject<Item> GOLD_CIRCUIT = REGISTRY.register("gold_circuit", () -> new GoldCircuitItem());
	public static final RegistryObject<Item> IRON_CIRCUIT = REGISTRY.register("iron_circuit", () -> new IronCircuitItem());
	public static final RegistryObject<Item> SOLAR_PANEL_CIRCUIT = REGISTRY.register("solar_panel_circuit", () -> new SolarPanelCircuitItem());
	public static final RegistryObject<Item> SMELTER = block(TheFeGridModBlocks.SMELTER);
	public static final RegistryObject<Item> CABLE_N = block(TheFeGridModBlocks.CABLE_N);
	public static final RegistryObject<Item> CABLE_E = block(TheFeGridModBlocks.CABLE_E);
	public static final RegistryObject<Item> CABLE_I = block(TheFeGridModBlocks.CABLE_I);
	public static final RegistryObject<Item> CABLE_L = block(TheFeGridModBlocks.CABLE_L);
	public static final RegistryObject<Item> CABLE_LC = block(TheFeGridModBlocks.CABLE_LC);
	public static final RegistryObject<Item> CABLE_LCC = block(TheFeGridModBlocks.CABLE_LCC);
	public static final RegistryObject<Item> CABLE_LT = block(TheFeGridModBlocks.CABLE_LT);
	public static final RegistryObject<Item> CABLE_LTC = block(TheFeGridModBlocks.CABLE_LTC);
	public static final RegistryObject<Item> CABLE_T = block(TheFeGridModBlocks.CABLE_T);
	public static final RegistryObject<Item> CABLE_TC = block(TheFeGridModBlocks.CABLE_TC);
	public static final RegistryObject<Item> CABLE_TX = block(TheFeGridModBlocks.CABLE_TX);
	public static final RegistryObject<Item> CABLE_TXC = block(TheFeGridModBlocks.CABLE_TXC);
	public static final RegistryObject<Item> CABLE_TXCC = block(TheFeGridModBlocks.CABLE_TXCC);
	public static final RegistryObject<Item> CABLE_X = block(TheFeGridModBlocks.CABLE_X);
	public static final RegistryObject<Item> CABLE_XC = block(TheFeGridModBlocks.CABLE_XC);
	public static final RegistryObject<Item> CABLE_F = block(TheFeGridModBlocks.CABLE_F);
	public static final RegistryObject<Item> CABLE_S = block(TheFeGridModBlocks.CABLE_S);
	public static final RegistryObject<Item> SOLAR_CELL = REGISTRY.register("solar_cell", () -> new SolarCellItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
