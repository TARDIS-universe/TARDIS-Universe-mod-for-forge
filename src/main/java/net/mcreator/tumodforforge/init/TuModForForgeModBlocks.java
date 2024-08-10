
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tumodforforge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.tumodforforge.block.TrenzalorePortalBlock;
import net.mcreator.tumodforforge.block.MeshblockbudsBlock;
import net.mcreator.tumodforforge.TuModForForgeMod;

public class TuModForForgeModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TuModForForgeMod.MODID);
	public static final RegistryObject<Block> TRENZALORE_PORTAL = REGISTRY.register("trenzalore_portal", () -> new TrenzalorePortalBlock());
	public static final RegistryObject<Block> MESHBLOCKBUDS = REGISTRY.register("meshblockbuds", () -> new MeshblockbudsBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
