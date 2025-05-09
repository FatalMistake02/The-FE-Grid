
package net.mcreator.thefegrid.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CarbonItem extends Item {
	public CarbonItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
