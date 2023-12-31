package cc.abbie.oldpotions.common.mixin;

import cc.abbie.oldpotions.common.OldPotionsCommon;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static cc.abbie.oldpotions.common.OldPotionsCommon.config;

@Mixin(MobEffect.class)
public abstract class MobEffectMixin {
    @Shadow
    @Final
    private Holder.Reference<MobEffect> builtInRegistryHolder;

    @Inject(method = "getColor", at = @At("HEAD"), cancellable = true)
    private void oldpotions$modifyColor(CallbackInfoReturnable<Integer> cir) {
        if (config.oldColors) {
            MobEffect mobEffect = this.builtInRegistryHolder.value();
            Integer oldPotionColor = OldPotionsCommon.oldPotionColors.get(mobEffect);
            if (oldPotionColor != null) {
                cir.setReturnValue(oldPotionColor);
            }
        }
    }
}
