
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.simpleelectronicsalpha.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class SimpleElectronicsAlphaModTabs {
	public static CreativeModeTab TAB_SIMPLE_ELECTRONICS_TAB;

	public static void load() {
		TAB_SIMPLE_ELECTRONICS_TAB = new CreativeModeTab("tabsimple_electronics_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SimpleElectronicsAlphaModItems.LED_YELLOW.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
