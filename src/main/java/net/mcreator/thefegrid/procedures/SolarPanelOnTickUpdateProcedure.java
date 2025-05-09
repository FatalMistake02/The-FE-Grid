package net.mcreator.thefegrid.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicBoolean;

public class SolarPanelOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _lvl0 && _lvl0.isDay() && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z))) {
			if (world.getLevelData().isThundering() && world.getLevelData().isRaining()) {
				if (new Object() {
					public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
						AtomicBoolean _retval = new AtomicBoolean(false);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
						return _retval.get();
					}
				}.canReceiveEnergy(world, BlockPos.containing(x, y - 1, z))) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						int _amount = 50;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
					}
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 1, z));
						int _amount = 50;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
				}
				if (new Object() {
					public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
						AtomicBoolean _retval = new AtomicBoolean(false);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
						return _retval.get();
					}
				}.canReceiveEnergy(world, BlockPos.containing(x, y + 1, z))) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						int _amount = 50;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
					}
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y + 1, z));
						int _amount = 50;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
				}
				if (new Object() {
					public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
						AtomicBoolean _retval = new AtomicBoolean(false);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
						return _retval.get();
					}
				}.canReceiveEnergy(world, BlockPos.containing(x + 1, y, z))) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						int _amount = 50;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
					}
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x + 1, y, z));
						int _amount = 50;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
				}
				if (new Object() {
					public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
						AtomicBoolean _retval = new AtomicBoolean(false);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
						return _retval.get();
					}
				}.canReceiveEnergy(world, BlockPos.containing(x - 1, y, z))) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						int _amount = 50;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
					}
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x - 1, y, z));
						int _amount = 50;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
				}
				if (new Object() {
					public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
						AtomicBoolean _retval = new AtomicBoolean(false);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
						return _retval.get();
					}
				}.canReceiveEnergy(world, BlockPos.containing(x, y, z - 1))) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						int _amount = 50;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
					}
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z - 1));
						int _amount = 50;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
				}
				if (new Object() {
					public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
						AtomicBoolean _retval = new AtomicBoolean(false);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
						return _retval.get();
					}
				}.canReceiveEnergy(world, BlockPos.containing(x, y, z + 1))) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						int _amount = 50;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
					}
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z + 1));
						int _amount = 50;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
				}
			} else if (!world.getLevelData().isThundering() && world.getLevelData().isRaining() || world.getLevelData().isThundering() && !world.getLevelData().isRaining()) {
				if (new Object() {
					public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
						AtomicBoolean _retval = new AtomicBoolean(false);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
						return _retval.get();
					}
				}.canReceiveEnergy(world, BlockPos.containing(x, y - 1, z))) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						int _amount = 100;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
					}
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 1, z));
						int _amount = 100;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
				}
				if (new Object() {
					public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
						AtomicBoolean _retval = new AtomicBoolean(false);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
						return _retval.get();
					}
				}.canReceiveEnergy(world, BlockPos.containing(x, y + 1, z))) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						int _amount = 100;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
					}
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y + 1, z));
						int _amount = 100;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
				}
				if (new Object() {
					public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
						AtomicBoolean _retval = new AtomicBoolean(false);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
						return _retval.get();
					}
				}.canReceiveEnergy(world, BlockPos.containing(x + 1, y, z))) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						int _amount = 100;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
					}
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x + 1, y, z));
						int _amount = 100;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
				}
				if (new Object() {
					public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
						AtomicBoolean _retval = new AtomicBoolean(false);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
						return _retval.get();
					}
				}.canReceiveEnergy(world, BlockPos.containing(x - 1, y, z))) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						int _amount = 100;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
					}
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x - 1, y, z));
						int _amount = 100;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
				}
				if (new Object() {
					public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
						AtomicBoolean _retval = new AtomicBoolean(false);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
						return _retval.get();
					}
				}.canReceiveEnergy(world, BlockPos.containing(x, y, z - 1))) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						int _amount = 100;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
					}
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z - 1));
						int _amount = 100;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
				}
				if (new Object() {
					public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
						AtomicBoolean _retval = new AtomicBoolean(false);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
						return _retval.get();
					}
				}.canReceiveEnergy(world, BlockPos.containing(x, y, z + 1))) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						int _amount = 100;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
					}
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z + 1));
						int _amount = 100;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
				}
			} else {
				if (new Object() {
					public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
						AtomicBoolean _retval = new AtomicBoolean(false);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
						return _retval.get();
					}
				}.canReceiveEnergy(world, BlockPos.containing(x, y - 1, z))) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						int _amount = 200;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
					}
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 1, z));
						int _amount = 200;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
				}
				if (new Object() {
					public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
						AtomicBoolean _retval = new AtomicBoolean(false);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
						return _retval.get();
					}
				}.canReceiveEnergy(world, BlockPos.containing(x, y + 1, z))) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						int _amount = 200;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
					}
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y + 1, z));
						int _amount = 200;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
				}
				if (new Object() {
					public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
						AtomicBoolean _retval = new AtomicBoolean(false);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
						return _retval.get();
					}
				}.canReceiveEnergy(world, BlockPos.containing(x + 1, y, z))) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						int _amount = 200;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
					}
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x + 1, y, z));
						int _amount = 200;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
				}
				if (new Object() {
					public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
						AtomicBoolean _retval = new AtomicBoolean(false);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
						return _retval.get();
					}
				}.canReceiveEnergy(world, BlockPos.containing(x - 1, y, z))) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						int _amount = 200;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
					}
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x - 1, y, z));
						int _amount = 200;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
				}
				if (new Object() {
					public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
						AtomicBoolean _retval = new AtomicBoolean(false);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
						return _retval.get();
					}
				}.canReceiveEnergy(world, BlockPos.containing(x, y, z - 1))) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						int _amount = 200;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
					}
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z - 1));
						int _amount = 200;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
				}
				if (new Object() {
					public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
						AtomicBoolean _retval = new AtomicBoolean(false);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
						return _retval.get();
					}
				}.canReceiveEnergy(world, BlockPos.containing(x, y, z + 1))) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						int _amount = 200;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
					}
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z + 1));
						int _amount = 200;
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
				}
			}
		}
	}
}
