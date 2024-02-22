package net.splomfiers.tutorialmod.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffects;

public class HealingHerbsEffect extends StatusEffect {

    public HealingHerbsEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int pAmplifier) {
        if (!entity.getWorld().isClient()) {

            if (this == StatusEffects.REGENERATION) {
                if (entity.getHealth() < entity.getMaxHealth()) {
                    entity.heal(1.0f);
                }
            } } else if (this == StatusEffects.INSTANT_HEALTH && !entity.isUndead() || this == StatusEffects.INSTANT_DAMAGE && entity.isUndead()) {
            entity.heal(Math.max(4 << pAmplifier, 0));
        }

        super.applyUpdateEffect(entity, pAmplifier);
    }

    @Override
    public boolean canApplyUpdateEffect(int pDuration, int pAmplifier) {
        return true;
    }
}

