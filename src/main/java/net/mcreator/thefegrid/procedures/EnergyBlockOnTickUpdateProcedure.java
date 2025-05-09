package net.mcreator.thefegrid.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class EnergyBlockOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x - 1, y, z));
			int _amount = 500000;
			if (_ent != null)
				_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
		}
		{
			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x + 1, y, z));
			int _amount = 500000;
			if (_ent != null)
				_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
		}
		{
			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 1, z));
			int _amount = 500000;
			if (_ent != null)
				_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
		}
		{
			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y + 1, z));
			int _amount = 500000;
			if (_ent != null)
				_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
		}
		{
			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z - 1));
			int _amount = 500000;
			if (_ent != null)
				_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
		}
		{
			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z + 1));
			int _amount = 500000;
			if (_ent != null)
				_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
		}
	}
}
