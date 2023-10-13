package cc.abbie.oldpotions.common;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OldPotionsCommon {
    public static final String MOD_ID = "oldpotions";
    public static OldPotionsConfig config;

    public static Map<MobEffect, Integer> oldPotionColors = Stream.of(new Object[][]{
            {MobEffects.MOVEMENT_SPEED, 8171462},
            {MobEffects.MOVEMENT_SLOWDOWN, 5926017},
            {MobEffects.DIG_SPEED, 14270531},
            {MobEffects.DIG_SLOWDOWN, 4866583},
            {MobEffects.DAMAGE_BOOST, 9643043},
            {MobEffects.HEAL, 16262179},
            {MobEffects.HARM, 4393481},
            {MobEffects.JUMP, 2293580},
            {MobEffects.CONFUSION, 5578058},
            {MobEffects.REGENERATION, 13458603},
            {MobEffects.DAMAGE_RESISTANCE, 10044730},
            {MobEffects.FIRE_RESISTANCE, 14981690},
            {MobEffects.WATER_BREATHING, 3035801},
            {MobEffects.INVISIBILITY, 8356754},
            {MobEffects.BLINDNESS, 2039587},
            {MobEffects.NIGHT_VISION, 2039713},
            {MobEffects.HUNGER, 5797459},
            {MobEffects.WEAKNESS, 4738376},
            {MobEffects.POISON, 5149489},
            {MobEffects.WITHER, 3484199},
            {MobEffects.HEALTH_BOOST, 16284963},
            {MobEffects.ABSORPTION, 2445989},
            {MobEffects.SATURATION, 16262179},
            {MobEffects.GLOWING, 9740385},
            {MobEffects.LEVITATION, 13565951},
            {MobEffects.LUCK, 3381504},
            {MobEffects.UNLUCK, 12624973},
            {MobEffects.SLOW_FALLING, 16773073},
            {MobEffects.CONDUIT_POWER, 1950417},
            {MobEffects.DOLPHINS_GRACE, 8954814},
            {MobEffects.BAD_OMEN, 745784},
            {MobEffects.HERO_OF_THE_VILLAGE, 4521796},
            {MobEffects.DARKNESS, 2696993},
    }).collect(Collectors.toMap(mapper -> (MobEffect) mapper[0],
            mapper -> (Integer) mapper[1]));
}
