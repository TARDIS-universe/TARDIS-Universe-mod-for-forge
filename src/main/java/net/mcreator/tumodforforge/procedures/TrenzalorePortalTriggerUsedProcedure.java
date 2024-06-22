package net.mcreator.tumodforforge.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.network.chat.Component;

public class TrenzalorePortalTriggerUsedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Oi fuck head its under construction for a update"), false);
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 15, Level.ExplosionInteraction.NONE);
	}
}
