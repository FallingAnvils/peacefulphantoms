package me.fallinganvils.peacefulphantoms.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;


@Mixin(targets = { "net.minecraft.entity.mob.PhantomEntity.StartAttackGoal" })
public class PeacefulPhantomsMixin {
	@Overwrite
	public boolean canStart() {
		return false;
	}
}
