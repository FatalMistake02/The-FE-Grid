
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thefegrid.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.thefegrid.block.entity.SolarPanelOnFrameBlockEntity;
import net.mcreator.thefegrid.block.entity.SolarPanelFrameWithCableBlockEntity;
import net.mcreator.thefegrid.block.entity.SolarPanelBlockEntity;
import net.mcreator.thefegrid.block.entity.SmelterBlockEntity;
import net.mcreator.thefegrid.block.entity.QuarterOfAMillionStorageBlockBlockEntity;
import net.mcreator.thefegrid.block.entity.OneMillionStorageBlockBlockEntity;
import net.mcreator.thefegrid.block.entity.HalfAMillionStorageBlockBlockEntity;
import net.mcreator.thefegrid.block.entity.FETestBlockBlockEntity;
import net.mcreator.thefegrid.block.entity.ExtruderBlockEntity;
import net.mcreator.thefegrid.block.entity.EnergyBlockBlockEntity;
import net.mcreator.thefegrid.block.entity.CableXCBlockEntity;
import net.mcreator.thefegrid.block.entity.CableXBlockEntity;
import net.mcreator.thefegrid.block.entity.CableTXCCBlockEntity;
import net.mcreator.thefegrid.block.entity.CableTXCBlockEntity;
import net.mcreator.thefegrid.block.entity.CableTXBlockEntity;
import net.mcreator.thefegrid.block.entity.CableTCBlockEntity;
import net.mcreator.thefegrid.block.entity.CableTBlockEntity;
import net.mcreator.thefegrid.block.entity.CableSBlockEntity;
import net.mcreator.thefegrid.block.entity.CableNBlockEntity;
import net.mcreator.thefegrid.block.entity.CableLTCBlockEntity;
import net.mcreator.thefegrid.block.entity.CableLTBlockEntity;
import net.mcreator.thefegrid.block.entity.CableLCCBlockEntity;
import net.mcreator.thefegrid.block.entity.CableLCBlockEntity;
import net.mcreator.thefegrid.block.entity.CableLBlockEntity;
import net.mcreator.thefegrid.block.entity.CableIBlockEntity;
import net.mcreator.thefegrid.block.entity.CableFBlockEntity;
import net.mcreator.thefegrid.block.entity.CableEBlockEntity;
import net.mcreator.thefegrid.block.entity.AluminiumProcessorBlockEntity;
import net.mcreator.thefegrid.TheFeGridMod;

public class TheFeGridModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, TheFeGridMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> ENERGY_BLOCK = register("energy_block", TheFeGridModBlocks.ENERGY_BLOCK, EnergyBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SOLAR_PANEL = register("solar_panel", TheFeGridModBlocks.SOLAR_PANEL, SolarPanelBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SOLAR_PANEL_ON_FRAME = register("solar_panel_on_frame", TheFeGridModBlocks.SOLAR_PANEL_ON_FRAME, SolarPanelOnFrameBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SOLAR_PANEL_FRAME_WITH_CABLE = register("solar_panel_frame_with_cable", TheFeGridModBlocks.SOLAR_PANEL_FRAME_WITH_CABLE, SolarPanelFrameWithCableBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FE_TEST_BLOCK = register("fe_test_block", TheFeGridModBlocks.FE_TEST_BLOCK, FETestBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> HALF_A_MILLION_STORAGE_BLOCK = register("half_a_million_storage_block", TheFeGridModBlocks.HALF_A_MILLION_STORAGE_BLOCK, HalfAMillionStorageBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> QUARTER_OF_A_MILLION_STORAGE_BLOCK = register("quarter_of_a_million_storage_block", TheFeGridModBlocks.QUARTER_OF_A_MILLION_STORAGE_BLOCK, QuarterOfAMillionStorageBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ONE_MILLION_STORAGE_BLOCK = register("one_million_storage_block", TheFeGridModBlocks.ONE_MILLION_STORAGE_BLOCK, OneMillionStorageBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> EXTRUDER = register("extruder", TheFeGridModBlocks.EXTRUDER, ExtruderBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ALUMINIUM_PROCESSOR = register("aluminium_processor", TheFeGridModBlocks.ALUMINIUM_PROCESSOR, AluminiumProcessorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SMELTER = register("smelter", TheFeGridModBlocks.SMELTER, SmelterBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_N = register("cable_n", TheFeGridModBlocks.CABLE_N, CableNBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_E = register("cable_e", TheFeGridModBlocks.CABLE_E, CableEBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_I = register("cable_i", TheFeGridModBlocks.CABLE_I, CableIBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_L = register("cable_l", TheFeGridModBlocks.CABLE_L, CableLBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_LC = register("cable_lc", TheFeGridModBlocks.CABLE_LC, CableLCBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_LCC = register("cable_lcc", TheFeGridModBlocks.CABLE_LCC, CableLCCBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_LT = register("cable_lt", TheFeGridModBlocks.CABLE_LT, CableLTBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_LTC = register("cable_ltc", TheFeGridModBlocks.CABLE_LTC, CableLTCBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_T = register("cable_t", TheFeGridModBlocks.CABLE_T, CableTBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_TC = register("cable_tc", TheFeGridModBlocks.CABLE_TC, CableTCBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_TX = register("cable_tx", TheFeGridModBlocks.CABLE_TX, CableTXBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_TXC = register("cable_txc", TheFeGridModBlocks.CABLE_TXC, CableTXCBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_TXCC = register("cable_txcc", TheFeGridModBlocks.CABLE_TXCC, CableTXCCBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_X = register("cable_x", TheFeGridModBlocks.CABLE_X, CableXBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_XC = register("cable_xc", TheFeGridModBlocks.CABLE_XC, CableXCBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_F = register("cable_f", TheFeGridModBlocks.CABLE_F, CableFBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CABLE_S = register("cable_s", TheFeGridModBlocks.CABLE_S, CableSBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
