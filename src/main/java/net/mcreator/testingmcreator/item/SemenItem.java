
package net.mcreator.testingmcreator.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.testingmcreator.init.TestingmcreatorModFluids;

public class SemenItem extends BucketItem {
	public SemenItem() {
		super(TestingmcreatorModFluids.SEMEN, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
