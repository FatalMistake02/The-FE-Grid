
package net.mcreator.thefegrid.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class LithiumCellItem extends Item {
	public LithiumCellItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
