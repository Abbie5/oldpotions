package cc.abbie.oldpotions.fabric;

import cc.abbie.oldpotions.common.OldPotionsCommon;
import cc.abbie.oldpotions.common.OldPotionsConfig;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.Toml4jConfigSerializer;
import net.fabricmc.api.ClientModInitializer;

public class OldPotionsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        AutoConfig.register(OldPotionsConfig.class, Toml4jConfigSerializer::new);
        OldPotionsCommon.config = AutoConfig.getConfigHolder(OldPotionsConfig.class).getConfig();
    }
}
