package net.mredstones.procedures;

import net.mredstones.MredstonesModElements;
import net.mredstones.MredstonesMod;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

@MredstonesModElements.ModElement.Tag
public class RedstonePigEntityDiesProcedure extends MredstonesModElements.ModElement {
	public RedstonePigEntityDiesProcedure(MredstonesModElements instance) {
		super(instance, 10);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MredstonesMod.LOGGER.warn("Failed to load dependency entity for procedure RedstonePigEntityDies!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).addExperienceLevel((int) 5);
	}
}
