package net.mcreator.thefegrid.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.network.chat.Component;

public class WikiProcedure {
	public static void execute(LevelAccessor world) {
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Wiki: https://github.com/FatalMistake02/The-FE-Grid/wiki/Workstations"), false);
	}
}
