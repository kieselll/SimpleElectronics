
package net.mcreator.simpleelectronicsalpha.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.simpleelectronicsalpha.init.SimpleElectronicsAlphaModTabs;

public class LedRedItem extends Item {
	public LedRedItem() {
		super(new Item.Properties().tab(SimpleElectronicsAlphaModTabs.TAB_SIMPLE_ELECTRONICS_TAB).stacksTo(16).rarity(Rarity.COMMON));
	}
}
