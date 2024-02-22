package net.splomfiers.tutorialmod.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.splomfiers.tutorialmod.TutorialMod;

public class ModEffects {




        public static StatusEffect registerStatusEffect(String name, StatusEffect effect) {
            return Registry.register(Registries.STATUS_EFFECT, new Identifier(TutorialMod.MOD_ID, name), effect);

        }

        public static void registerEffects() {


        }
}
