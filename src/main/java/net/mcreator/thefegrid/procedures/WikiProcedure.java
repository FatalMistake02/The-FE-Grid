package net.mcreator.thefegrid.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.network.chat.Component;

public class WikiProcedure {
	public static void execute(LevelAccessor world) {
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Wiki: https://thefegrid.notion.site/Wiki-Home-1ecf9c81abac8020a1cec50fa3aa9a9c"), false);
	}
}
