package cc.abbie.oldpotions.forge;

import cc.abbie.oldpotions.common.OldPotionsCommon;
import cc.abbie.oldpotions.common.OldPotionsConfig;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.Toml4jConfigSerializer;
import net.minecraftforge.client.ConfigScreenHandler;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;

@Mod("oldpotions")
public class OldPotions {
    public OldPotions() {
        AutoConfig.register(OldPotionsConfig.class, Toml4jConfigSerializer::new);
        OldPotionsCommon.config = AutoConfig.getConfigHolder(OldPotionsConfig.class).getConfig();
        ModLoadingContext.get().registerExtensionPoint(
                ConfigScreenHandler.ConfigScreenFactory.class,
                () -> new ConfigScreenHandler.ConfigScreenFactory(
                        (client, parent) -> AutoConfig.getConfigScreen(OldPotionsConfig.class, parent).get()
                )
        );
    }
}