
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tumodforforge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.tumodforforge.item.TrenzaloreItem;
import net.mcreator.tumodforforge.TuModForForgeMod;

public class TuModForForgeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TuModForForgeMod.MODID);
	public static final RegistryObject<Item> TRENZALORE = REGISTRY.register("trenzalore", () -> new TrenzaloreItem());
	// Start of user code block custom items
	// End of user code block custom items
}
