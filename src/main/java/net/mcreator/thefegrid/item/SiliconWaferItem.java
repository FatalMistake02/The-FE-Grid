
package net.mcreator.thefegrid.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SiliconWaferItem extends Item {
	public SiliconWaferItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
