
package net.mcreator.tartiflette.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import net.mcreator.tartiflette.init.TartifletteModFluids;

public class DeepwaterItem extends BucketItem {
	public DeepwaterItem() {
		super(TartifletteModFluids.DEEPWATER,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_MISC));
	}
}
