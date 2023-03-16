package cc.abbie.oldpotions.common;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = "oldpotions")
public class OldPotionsConfig implements ConfigData {
    public boolean enableGlint = true;
    public boolean oldColors = true;
}
