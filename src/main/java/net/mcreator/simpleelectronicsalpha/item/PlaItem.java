
package net.mcreator.simpleelectronicsalpha.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.simpleelectronicsalpha.init.SimpleElectronicsAlphaModTabs;

public class PlaItem extends Item {
	public PlaItem() {
		super(new Item.Properties().tab(SimpleElectronicsAlphaModTabs.TAB_SIMPLE_ELECTRONICS_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}
}
