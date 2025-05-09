
package net.mcreator.thefegrid.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SiliconIngotItem extends Item {
	public SiliconIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
