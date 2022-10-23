
package net.mcreator.tartiflette.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class AbbyzzHoeItem extends HoeItem {
	public AbbyzzHoeItem() {
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
		},

				0, -3f,

				new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}

}
