
package net.mcreator.simpleelectronicsalpha.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.simpleelectronicsalpha.init.SimpleElectronicsAlphaModTabs;

import java.util.List;

public class SolderingIronItem extends Item {
	public SolderingIronItem() {
		super(new Item.Properties().tab(SimpleElectronicsAlphaModTabs.TAB_SIMPLE_ELECTRONICS_TAB).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("OUCH!"));
	}
}
