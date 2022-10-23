
package net.mcreator.tartiflette.item;

import net.minecraft.sounds.SoundEvent;

public abstract class AbbyzzArmorItem extends ArmorItem {

	public AbbyzzArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 141;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{19, 56, 47, 19}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 85;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TartifletteModItems.ABBYZZ.get()));
			}

			@Override
			public String getName() {
				return "abbyzz_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends AbbyzzArmorItem {

		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "tartiflette:textures/models/armor/abbyzz_layer_1.png";
		}

	}

	public static class Chestplate extends AbbyzzArmorItem {

		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "tartiflette:textures/models/armor/abbyzz_layer_1.png";
		}

	}

	public static class Leggings extends AbbyzzArmorItem {

		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "tartiflette:textures/models/armor/abbyzz_layer_2.png";
		}

	}

	public static class Boots extends AbbyzzArmorItem {

		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "tartiflette:textures/models/armor/abbyzz_layer_1.png";
		}

	}

}
