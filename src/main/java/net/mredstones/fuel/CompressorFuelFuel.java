
package net.mredstones.fuel;

import net.mredstones.MredstonesModElements;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;
import net.minecraft.block.Blocks;

@MredstonesModElements.ModElement.Tag
public class CompressorFuelFuel extends MredstonesModElements.ModElement {
	public CompressorFuelFuel(MredstonesModElements instance) {
		super(instance, 21);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(Blocks.SLIME_BLOCK, (int) (1)).getItem())
			event.setBurnTime(300);
	}
}
