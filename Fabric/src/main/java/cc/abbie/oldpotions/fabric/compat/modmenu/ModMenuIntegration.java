package cc.abbie.oldpotions.fabric.compat.modmenu;

import cc.abbie.oldpotions.common.OldPotionsConfigScreen;
import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;

public class ModMenuIntegration implements ModMenuApi {
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return OldPotionsConfigScreen::new;
    }
}
