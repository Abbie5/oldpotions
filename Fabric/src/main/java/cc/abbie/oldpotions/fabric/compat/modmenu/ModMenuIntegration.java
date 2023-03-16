package cc.abbie.oldpotions.fabric.compat.modmenu;

import cc.abbie.oldpotions.common.OldPotionsConfig;
import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import me.shedaniel.autoconfig.AutoConfig;

public class ModMenuIntegration implements ModMenuApi {
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return parent -> AutoConfig.getConfigScreen(OldPotionsConfig.class, parent).get();
    }
}
