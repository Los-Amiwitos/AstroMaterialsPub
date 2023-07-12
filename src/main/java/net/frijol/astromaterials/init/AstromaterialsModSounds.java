
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.frijol.astromaterials.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.frijol.astromaterials.AstromaterialsMod;

public class AstromaterialsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, AstromaterialsMod.MODID);
	public static final RegistryObject<SoundEvent> SOUND_MENU_CLICK = REGISTRY.register("sound.menu.click", () -> new SoundEvent(new ResourceLocation("astromaterials", "sound.menu.click")));
	public static final RegistryObject<SoundEvent> SOUND_MENU_HOVER = REGISTRY.register("sound.menu.hover", () -> new SoundEvent(new ResourceLocation("astromaterials", "sound.menu.hover")));
	public static final RegistryObject<SoundEvent> SOUND_MENU_CLOSE = REGISTRY.register("sound.menu.close", () -> new SoundEvent(new ResourceLocation("astromaterials", "sound.menu.close")));
	public static final RegistryObject<SoundEvent> SOUND_MENU_OPEN = REGISTRY.register("sound.menu.open", () -> new SoundEvent(new ResourceLocation("astromaterials", "sound.menu.open")));
}
