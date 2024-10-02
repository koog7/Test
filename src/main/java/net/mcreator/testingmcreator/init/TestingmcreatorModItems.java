
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testingmcreator.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.testingmcreator.item.SemenItem;
import net.mcreator.testingmcreator.item.PenisLandItem;
import net.mcreator.testingmcreator.TestingmcreatorMod;

public class TestingmcreatorModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TestingmcreatorMod.MODID);
	public static final RegistryObject<Item> SEMEN_BUCKET = REGISTRY.register("semen_bucket", () -> new SemenItem());
	public static final RegistryObject<Item> PENIS = block(TestingmcreatorModBlocks.PENIS);
	public static final RegistryObject<Item> PENIS_BLOCK_PORTAL = block(TestingmcreatorModBlocks.PENIS_BLOCK_PORTAL);
	public static final RegistryObject<Item> PENIS_LAND = REGISTRY.register("penis_land", () -> new PenisLandItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
