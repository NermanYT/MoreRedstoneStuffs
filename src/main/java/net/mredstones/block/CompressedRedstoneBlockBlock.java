
package net.mredstones.block;

import net.mredstones.itemgroup.MoreRedstoneStuffsItemGroup;
import net.mredstones.MredstonesModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import java.util.List;
import java.util.Collections;

@MredstonesModElements.ModElement.Tag
public class CompressedRedstoneBlockBlock extends MredstonesModElements.ModElement {
	@ObjectHolder("mredstones:compressed_redstone_block")
	public static final Block block = null;
	public CompressedRedstoneBlockBlock(MredstonesModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(
				() -> new BlockItem(block, new Item.Properties().group(MoreRedstoneStuffsItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.WEB).sound(SoundType.METAL).hardnessAndResistance(3f, 10f).setLightLevel(s -> 0));
			setRegistryName("compressed_redstone_block");
		}

		@Override
		public MaterialColor getMaterialColor() {
			return MaterialColor.TNT;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
