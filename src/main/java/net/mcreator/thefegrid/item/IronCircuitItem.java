
package net.mcreator.thefegrid.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class IronCircuitItem extends Item {
	public IronCircuitItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
