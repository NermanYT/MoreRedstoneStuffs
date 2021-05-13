
package net.mredstones.item;

import net.mredstones.itemgroup.MoreRedstoneStuffsItemGroup;
import net.mredstones.MredstonesModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@MredstonesModElements.ModElement.Tag
public class RedstonePickaxeItem extends MredstonesModElements.ModElement {
	@ObjectHolder("mredstones:redstone_pickaxe")
	public static final Item block = null;
	public RedstonePickaxeItem(MredstonesModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 276;
			}

			public float getEfficiency() {
				return 4.5f;
			}

			public float getAttackDamage() {
				return 1f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.REDSTONE, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(MoreRedstoneStuffsItemGroup.tab)) {
		}.setRegistryName("redstone_pickaxe"));
	}
}
