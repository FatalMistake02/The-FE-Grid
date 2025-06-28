
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thefegrid.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.thefegrid.block.SteelBlockBlock;
import net.mcreator.thefegrid.block.SolarPanelOnFrameBlock;
import net.mcreator.thefegrid.block.SolarPanelFrameWithCableBlock;
import net.mcreator.thefegrid.block.SolarPanelFrameBlock;
import net.mcreator.thefegrid.block.SolarPanelBlock;
import net.mcreator.thefegrid.block.SmelterBlock;
import net.mcreator.thefegrid.block.SilicaSandBlock;
import net.mcreator.thefegrid.block.QuarterOfAMillionStorageBlockBlock;
import net.mcreator.thefegrid.block.OneMillionStorageBlockBlock;
import net.mcreator.thefegrid.block.HalfAMillionStorageBlockBlock;
import net.mcreator.thefegrid.block.GraniteBlock;
import net.mcreator.thefegrid.block.FETestBlockBlock;
import net.mcreator.thefegrid.block.ExtruderBlock;
import net.mcreator.thefegrid.block.EnergyBlockBlock;
import net.mcreator.thefegrid.block.CableXCBlock;
import net.mcreator.thefegrid.block.CableXBlock;
import net.mcreator.thefegrid.block.CableTXCCBlock;
import net.mcreator.thefegrid.block.CableTXCBlock;
import net.mcreator.thefegrid.block.CableTXBlock;
import net.mcreator.thefegrid.block.CableTCBlock;
import net.mcreator.thefegrid.block.CableTBlock;
import net.mcreator.thefegrid.block.CableSBlock;
import net.mcreator.thefegrid.block.CableNBlock;
import net.mcreator.thefegrid.block.CableLTCBlock;
import net.mcreator.thefegrid.block.CableLTBlock;
import net.mcreator.thefegrid.block.CableLCCBlock;
import net.mcreator.thefegrid.block.CableLCBlock;
import net.mcreator.thefegrid.block.CableLBlock;
import net.mcreator.thefegrid.block.CableIBlock;
import net.mcreator.thefegrid.block.CableFBlock;
import net.mcreator.thefegrid.block.CableEBlock;
import net.mcreator.thefegrid.block.BauxiteOreBlock;
import net.mcreator.thefegrid.block.BauxiteBlockBlock;
import net.mcreator.thefegrid.block.AluminiumProcessorBlock;
import net.mcreator.thefegrid.block.AluminiumBlockBlock;
import net.mcreator.thefegrid.TheFeGridMod;

public class TheFeGridModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TheFeGridMod.MODID);
	public static final RegistryObject<Block> ENERGY_BLOCK = REGISTRY.register("energy_block", () -> new EnergyBlockBlock());
	public static final RegistryObject<Block> SOLAR_PANEL = REGISTRY.register("solar_panel", () -> new SolarPanelBlock());
	public static final RegistryObject<Block> SOLAR_PANEL_ON_FRAME = REGISTRY.register("solar_panel_on_frame", () -> new SolarPanelOnFrameBlock());
	public static final RegistryObject<Block> SOLAR_PANEL_FRAME = REGISTRY.register("solar_panel_frame", () -> new SolarPanelFrameBlock());
	public static final RegistryObject<Block> SOLAR_PANEL_FRAME_WITH_CABLE = REGISTRY.register("solar_panel_frame_with_cable", () -> new SolarPanelFrameWithCableBlock());
	public static final RegistryObject<Block> FE_TEST_BLOCK = REGISTRY.register("fe_test_block", () -> new FETestBlockBlock());
	public static final RegistryObject<Block> HALF_A_MILLION_STORAGE_BLOCK = REGISTRY.register("half_a_million_storage_block", () -> new HalfAMillionStorageBlockBlock());
	public static final RegistryObject<Block> QUARTER_OF_A_MILLION_STORAGE_BLOCK = REGISTRY.register("quarter_of_a_million_storage_block", () -> new QuarterOfAMillionStorageBlockBlock());
	public static final RegistryObject<Block> ONE_MILLION_STORAGE_BLOCK = REGISTRY.register("one_million_storage_block", () -> new OneMillionStorageBlockBlock());
	public static final RegistryObject<Block> BAUXITE_ORE = REGISTRY.register("bauxite_ore", () -> new BauxiteOreBlock());
	public static final RegistryObject<Block> BAUXITE_BLOCK = REGISTRY.register("bauxite_block", () -> new BauxiteBlockBlock());
	public static final RegistryObject<Block> SILICA_SAND = REGISTRY.register("silica_sand", () -> new SilicaSandBlock());
	public static final RegistryObject<Block> GRANITE = REGISTRY.register("granite", () -> new GraniteBlock());
	public static final RegistryObject<Block> EXTRUDER = REGISTRY.register("extruder", () -> new ExtruderBlock());
	public static final RegistryObject<Block> ALUMINIUM_PROCESSOR = REGISTRY.register("aluminium_processor", () -> new AluminiumProcessorBlock());
	public static final RegistryObject<Block> ALUMINIUM_BLOCK = REGISTRY.register("aluminium_block", () -> new AluminiumBlockBlock());
	public static final RegistryObject<Block> STEEL_BLOCK = REGISTRY.register("steel_block", () -> new SteelBlockBlock());
	public static final RegistryObject<Block> SMELTER = REGISTRY.register("smelter", () -> new SmelterBlock());
	public static final RegistryObject<Block> CABLE_N = REGISTRY.register("cable_n", () -> new CableNBlock());
	public static final RegistryObject<Block> CABLE_E = REGISTRY.register("cable_e", () -> new CableEBlock());
	public static final RegistryObject<Block> CABLE_I = REGISTRY.register("cable_i", () -> new CableIBlock());
	public static final RegistryObject<Block> CABLE_L = REGISTRY.register("cable_l", () -> new CableLBlock());
	public static final RegistryObject<Block> CABLE_LC = REGISTRY.register("cable_lc", () -> new CableLCBlock());
	public static final RegistryObject<Block> CABLE_LCC = REGISTRY.register("cable_lcc", () -> new CableLCCBlock());
	public static final RegistryObject<Block> CABLE_LT = REGISTRY.register("cable_lt", () -> new CableLTBlock());
	public static final RegistryObject<Block> CABLE_LTC = REGISTRY.register("cable_ltc", () -> new CableLTCBlock());
	public static final RegistryObject<Block> CABLE_T = REGISTRY.register("cable_t", () -> new CableTBlock());
	public static final RegistryObject<Block> CABLE_TC = REGISTRY.register("cable_tc", () -> new CableTCBlock());
	public static final RegistryObject<Block> CABLE_TX = REGISTRY.register("cable_tx", () -> new CableTXBlock());
	public static final RegistryObject<Block> CABLE_TXC = REGISTRY.register("cable_txc", () -> new CableTXCBlock());
	public static final RegistryObject<Block> CABLE_TXCC = REGISTRY.register("cable_txcc", () -> new CableTXCCBlock());
	public static final RegistryObject<Block> CABLE_X = REGISTRY.register("cable_x", () -> new CableXBlock());
	public static final RegistryObject<Block> CABLE_XC = REGISTRY.register("cable_xc", () -> new CableXCBlock());
	public static final RegistryObject<Block> CABLE_F = REGISTRY.register("cable_f", () -> new CableFBlock());
	public static final RegistryObject<Block> CABLE_S = REGISTRY.register("cable_s", () -> new CableSBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
