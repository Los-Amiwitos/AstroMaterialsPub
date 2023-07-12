
package net.frijol.astromaterials.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.frijol.astromaterials.init.AstromaterialsModTabs;

public class CompoundItem extends Item {
	public CompoundItem() {
		super(new Item.Properties().tab(AstromaterialsModTabs.TAB_ASTRO_MATERIALS_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}
}
