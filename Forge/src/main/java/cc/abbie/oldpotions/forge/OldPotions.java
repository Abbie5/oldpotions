package cc.abbie.oldpotions.forge;

import cc.abbie.oldpotions.common.OldPotionsCommon;
import cc.abbie.oldpotions.common.OldPotionsConfig;
import cc.abbie.oldpotions.common.OldPotionsConfigScreen;
import net.minecraftforge.client.ConfigScreenHandler;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLPaths;

@Mod(OldPotionsCommon.MOD_ID)
public class OldPotions {
    public OldPotions() {
        OldPotionsCommon.config = new OldPotionsConfig(FMLPaths.CONFIGDIR.get());
        ModLoadingContext.get().registerExtensionPoint(
                ConfigScreenHandler.ConfigScreenFactory.class,
                () -> new ConfigScreenHandler.ConfigScreenFactory(
                        (client, parent) -> new OldPotionsConfigScreen(parent)
                )
        );
    }
}