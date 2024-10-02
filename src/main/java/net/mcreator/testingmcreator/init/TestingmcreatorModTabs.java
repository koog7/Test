
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testingmcreator.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.testingmcreator.TestingmcreatorMod;

public class TestingmcreatorModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TestingmcreatorMod.MODID);
	public static final RegistryObject<CreativeModeTab> TEST_ITEMS = REGISTRY.register("test_items",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.testingmcreator.test_items")).icon(() -> new ItemStack(TestingmcreatorModItems.SEMEN_BUCKET.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TestingmcreatorModItems.SEMEN_BUCKET.get());
				tabData.accept(TestingmcreatorModBlocks.PENIS.get().asItem());
				tabData.accept(TestingmcreatorModBlocks.PENIS_BLOCK_PORTAL.get().asItem());
				tabData.accept(TestingmcreatorModItems.PENIS_LAND.get());
			})

					.build());
}
