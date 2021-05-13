
package net.mredstones.itemgroup;

import net.mredstones.item.TinyRedstonePieceItem;
import net.mredstones.MredstonesModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@MredstonesModElements.ModElement.Tag
public class MoreRedstoneStuffsItemGroup extends MredstonesModElements.ModElement {
	public MoreRedstoneStuffsItemGroup(MredstonesModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmore_redstone_stuffs") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(TinyRedstonePieceItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
