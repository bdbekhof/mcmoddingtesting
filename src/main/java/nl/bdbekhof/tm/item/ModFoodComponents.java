package nl.bdbekhof.tm.item;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;

import java.util.List;

import static net.minecraft.component.type.ConsumableComponents.food;

public class ModFoodComponents {
    public static final ConsumableComponent ROTTEN_APPLE = food().consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.POISON, 600, 1), 0.5f)).build();
}


// FOR MULTIPLE EFFECTS CREATE A LIST OF STATUS EFFECT INSTANCES
//  food().consumeEffect(new ApplyEffectsConsumeEffect(List.of(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 1),
//    new StatusEffectInstance(StatusEffects.RESISTANCE, 6000, 0),
//    new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 6000, 0),
//    new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 3)))).build();

// FOR A SINGLE STATUS EFFECT INSTANCE
//  food().consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 0), 0.3F)).build();