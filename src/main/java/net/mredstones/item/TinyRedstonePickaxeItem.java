
package net.mredstones.item;

import net.mredstones.itemgroup.MoreRedstoneStuffsItemGroup;
import net.mredstones.MredstonesModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@MredstonesModElements.ModElement.Tag
public class TinyRedstonePickaxeItem extends MredstonesModElements.ModElement {
	@ObjectHolder("mredstones:tiny_redstone_pickaxe")
	public static final Item block = null;
	public TinyRedstonePickaxeItem(MredstonesModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 75;
			}

			public float getEfficiency() {
				return 2.4f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(TinyRedstonePieceItem.block, (int) (1)));
			}
		}, 1, 0f, new Item.Properties().group(MoreRedstoneStuffsItemGroup.tab)) {
		}.setRegistryName("tiny_redstone_pickaxe"));
	}
}
