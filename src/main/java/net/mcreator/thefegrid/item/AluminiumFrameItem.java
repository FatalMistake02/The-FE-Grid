
package net.mcreator.thefegrid.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AluminiumFrameItem extends Item {
	public AluminiumFrameItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
