package net.mcreator.thefegrid.procedures;

import net.minecraft.world.level.LevelAccessor;

public class CableOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.isClientSide()) {
			CableModelUpdateProcedure.execute(world, x, y, z);
			CableUpdateTickEnergyProcedure.execute(world, x, y, z);
		}
	}
}
