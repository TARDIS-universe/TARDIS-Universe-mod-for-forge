
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tumodforforge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.tumodforforge.TuModForForgeMod;

public class TuModForForgeModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TuModForForgeMod.MODID);
	public static final RegistryObject<SoundEvent> UNSTABLETARDISPORTALSOUNDS = REGISTRY.register("unstabletardisportalsounds", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("tu_mod_for_forge", "unstabletardisportalsounds")));
}
