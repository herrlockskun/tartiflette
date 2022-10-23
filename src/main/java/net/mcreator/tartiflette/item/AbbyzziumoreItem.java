
package net.mcreator.tartiflette.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class AbbyzziumoreItem extends Item {
	public AbbyzziumoreItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.EPIC));
	}
}
