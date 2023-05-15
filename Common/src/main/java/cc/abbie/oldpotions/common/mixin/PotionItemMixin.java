package cc.abbie.oldpotions.common.mixin;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PotionItem;
import net.minecraft.world.item.alchemy.PotionUtils;
import org.spongepowered.asm.mixin.Mixin;

import javax.annotation.Nonnull;

import static cc.abbie.oldpotions.common.OldPotionsCommon.config;

@Mixin(PotionItem.class)
public abstract class PotionItemMixin extends Item {
    public PotionItemMixin(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isFoil(@Nonnull ItemStack itemStack) {
        return super.isFoil(itemStack) || (config.enableGlint && !PotionUtils.getMobEffects(itemStack).isEmpty());
    }
}
