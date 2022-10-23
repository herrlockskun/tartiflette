
package net.mcreator.tartiflette.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.tartiflette.init.TartifletteModItems;

public class AbbyzzPickaxeItem extends PickaxeItem {
	public AbbyzzPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 5759;
			}

			public float getSpeed() {
				return 23f;
			}

			public float getAttackDamageBonus() {
				return 17f;
			}

			public int getLevel() {
				return 19;
			}

			public int getEnchantmentValue() {
				return 132;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TartifletteModItems.ABBYZZ.get()));
			}
		}, 1, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
