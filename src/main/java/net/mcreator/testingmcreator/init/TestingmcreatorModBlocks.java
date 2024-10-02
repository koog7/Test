
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testingmcreator.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.testingmcreator.block.SemenBlock;
import net.mcreator.testingmcreator.block.PenisLandPortalBlock;
import net.mcreator.testingmcreator.block.PenisBlockPortalBlock;
import net.mcreator.testingmcreator.block.PenisBlock;
import net.mcreator.testingmcreator.TestingmcreatorMod;

public class TestingmcreatorModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TestingmcreatorMod.MODID);
	public static final RegistryObject<Block> SEMEN = REGISTRY.register("semen", () -> new SemenBlock());
	public static final RegistryObject<Block> PENIS = REGISTRY.register("penis", () -> new PenisBlock());
	public static final RegistryObject<Block> PENIS_BLOCK_PORTAL = REGISTRY.register("penis_block_portal", () -> new PenisBlockPortalBlock());
	public static final RegistryObject<Block> PENIS_LAND_PORTAL = REGISTRY.register("penis_land_portal", () -> new PenisLandPortalBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
