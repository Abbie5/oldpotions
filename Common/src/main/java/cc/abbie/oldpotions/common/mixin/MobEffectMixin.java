package cc.abbie.oldpotions.common.mixin;

import net.minecraft.world.effect.MobEffect;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static cc.abbie.oldpotions.common.OldPotionsCommon.config;

@Mixin(MobEffect.class)
public abstract class MobEffectMixin {
    // Taken from 1.19.3, array index corresponds to potion id - 1
    private static final int[] colors = {
            8171462,
            5926017,
            14270531,
            4866583,
            9643043,
            16262179,
            4393481,
            2293580,
            5578058,
            13458603,
            10044730,
            14981690,
            3035801,
            8356754,
            2039587,
            0x1F1FA1,
            5797459,
            0x484D48,
            5149489,
            3484199,
            16284963,
            0x2552A5,
            16262179,
            9740385,
            0xCEFFFF,
            0x339900,
            12624973,
            16773073,
            1950417,
            8954814,
            745784,
            0x44FF44,
            2696993
    };

    @Inject(method = "getColor", at = @At("HEAD"), cancellable = true)
    private void oldpotions$modifyColor(CallbackInfoReturnable<Integer> cir) {
        if (config.oldColors)
            cir.setReturnValue(colors[MobEffect.getId((MobEffect) (Object) this) - 1]);
    }
}
