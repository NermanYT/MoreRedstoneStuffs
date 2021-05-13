
package net.mredstones.item;

import net.mredstones.itemgroup.MoreRedstoneStuffsItemGroup;
import net.mredstones.MredstonesModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@MredstonesModElements.ModElement.Tag
public class DeactivatedRedstoneItem extends MredstonesModElements.ModElement {
	@ObjectHolder("mredstones:deactivated_redstone")
	public static final Item block = null;
	public DeactivatedRedstoneItem(MredstonesModElements instance) {
		super(instance, 28);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MoreRedstoneStuffsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("deactivated_redstone");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
