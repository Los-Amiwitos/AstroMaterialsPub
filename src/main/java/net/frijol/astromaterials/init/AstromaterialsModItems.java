
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.frijol.astromaterials.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.frijol.astromaterials.item.ResinItem;
import net.frijol.astromaterials.item.CompoundItem;
import net.frijol.astromaterials.AstromaterialsMod;

public class AstromaterialsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AstromaterialsMod.MODID);
	public static final RegistryObject<Item> RESIN = REGISTRY.register("resin", () -> new ResinItem());
	public static final RegistryObject<Item> COMPOUND = REGISTRY.register("compound", () -> new CompoundItem());
}
