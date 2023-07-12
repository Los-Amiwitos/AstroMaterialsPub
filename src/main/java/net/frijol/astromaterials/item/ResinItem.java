
package net.frijol.astromaterials.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.frijol.astromaterials.init.AstromaterialsModTabs;

public class ResinItem extends Item {
	public ResinItem() {
		super(new Item.Properties().tab(AstromaterialsModTabs.TAB_ASTRO_MATERIALS_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}
}
