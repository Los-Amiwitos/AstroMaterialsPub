
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.frijol.astromaterials.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class AstromaterialsModTabs {
	public static CreativeModeTab TAB_ASTRO_MATERIALS_TAB;

	public static void load() {
		TAB_ASTRO_MATERIALS_TAB = new CreativeModeTab("tabastro_materials_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AstromaterialsModItems.RESIN.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
