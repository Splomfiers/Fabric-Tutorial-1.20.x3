package net.splomfiers.tutorialmod.potion;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.splomfiers.tutorialmod.TutorialMod;
import net.splomfiers.tutorialmod.effect.ModEffects;


public class ModPotions {
    public static Potion HEALING_HERBS_POTION = registerPotion("healing_herbs_potion", new Potion(new StatusEffectInstance(StatusEffects.REGENERATION,300,2)));



    public static Potion registerPotion(String name, Potion potion) {
        return Registry.register(Registries.POTION, new Identifier(TutorialMod.MOD_ID, name), potion);
    }

    public static void registerPotions() {



    }
}
