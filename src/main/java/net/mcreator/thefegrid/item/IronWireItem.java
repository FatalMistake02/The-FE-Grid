
package net.mcreator.thefegrid.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class IronWireItem extends Item {
	public IronWireItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
