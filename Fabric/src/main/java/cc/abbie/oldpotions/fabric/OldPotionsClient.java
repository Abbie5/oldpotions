package cc.abbie.oldpotions.fabric;

import cc.abbie.oldpotions.common.OldPotionsCommon;
import cc.abbie.oldpotions.common.OldPotionsConfig;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.loader.api.FabricLoader;

public class OldPotionsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        OldPotionsCommon.config = new OldPotionsConfig(FabricLoader.getInstance().getConfigDir());
    }
}
