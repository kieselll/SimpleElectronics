
package net.mcreator.simpleelectronicsalpha.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.simpleelectronicsalpha.init.SimpleElectronicsAlphaModTabs;

public class CordItem extends Item {
	public CordItem() {
		super(new Item.Properties().tab(SimpleElectronicsAlphaModTabs.TAB_SIMPLE_ELECTRONICS_TAB).stacksTo(1).rarity(Rarity.COMMON));
	}
}