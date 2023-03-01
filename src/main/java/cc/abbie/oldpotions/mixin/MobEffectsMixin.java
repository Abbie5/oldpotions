package cc.abbie.oldpotions.mixin;

import net.minecraft.world.effect.*;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(MobEffects.class)
public abstract class MobEffectsMixin {
    @Shadow @Final public static final MobEffect MOVEMENT_SPEED = MobEffects.register(1, "speed", new MobEffect(MobEffectCategory.BENEFICIAL, 8171462).addAttributeModifier(Attributes.MOVEMENT_SPEED, "91AEAA56-376B-4498-935B-2F7F68070635", 0.2f, AttributeModifier.Operation.MULTIPLY_TOTAL));
    @Shadow @Final public static final MobEffect MOVEMENT_SLOWDOWN = MobEffects.register(2, "slowness", new MobEffect(MobEffectCategory.HARMFUL, 5926017).addAttributeModifier(Attributes.MOVEMENT_SPEED, "7107DE5E-7CE8-4030-940E-514C1F160890", -0.15f, AttributeModifier.Operation.MULTIPLY_TOTAL));
    @Shadow @Final public static final MobEffect DAMAGE_BOOST = MobEffects.register(5, "strength", new AttackDamageMobEffect(MobEffectCategory.BENEFICIAL, 9643043, 3.0).addAttributeModifier(Attributes.ATTACK_DAMAGE, "648D7064-6A60-4F59-8ABE-C2C23A6DD7A9", 0.0, AttributeModifier.Operation.ADDITION));
    @Shadow @Final public static final MobEffect HARM = MobEffects.register(7, "instant_damage", new InstantenousMobEffect(MobEffectCategory.HARMFUL, 4393481));
    @Shadow @Final public static final MobEffect JUMP = MobEffects.register(8, "jump_boost", new MobEffect(MobEffectCategory.BENEFICIAL, 2293580));
    @Shadow @Final public static final MobEffect DAMAGE_RESISTANCE = MobEffects.register(11, "resistance", new MobEffect(MobEffectCategory.BENEFICIAL, 10044730));
    @Shadow @Final public static final MobEffect FIRE_RESISTANCE = MobEffects.register(12, "fire_resistance", new MobEffect(MobEffectCategory.BENEFICIAL, 14981690));
    @Shadow @Final public static final MobEffect WATER_BREATHING = MobEffects.register(13, "water_breathing", new MobEffect(MobEffectCategory.BENEFICIAL, 3035801));
    @Shadow @Final public static final MobEffect INVISIBILITY = MobEffects.register(14, "invisibility", new MobEffect(MobEffectCategory.BENEFICIAL, 8356754));
    @Shadow @Final public static final MobEffect NIGHT_VISION = MobEffects.register(16, "night_vision", new MobEffect(MobEffectCategory.BENEFICIAL, 0x1F1FA1));
    @Shadow @Final public static final MobEffect POISON = MobEffects.register(19, "poison", new MobEffect(MobEffectCategory.HARMFUL, 5149489));
    @Shadow @Final public static final MobEffect LUCK = MobEffects.register(26, "luck", new MobEffect(MobEffectCategory.BENEFICIAL, 0x339900).addAttributeModifier(Attributes.LUCK, "03C3C89D-7037-4B42-869F-B146BCB64D2E", 1.0, AttributeModifier.Operation.ADDITION));
}
