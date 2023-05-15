package cc.abbie.oldpotions.common;

import com.electronwill.nightconfig.core.file.FileConfig;

import java.nio.file.Path;

public class OldPotionsConfig {
    private final FileConfig config;

    public boolean enableGlint;
    public boolean oldColors;

    public OldPotionsConfig(Path configDir) {
        config = FileConfig.of(configDir.resolve(OldPotionsCommon.MOD_ID + ".toml"));
        load();
    }

    public void save() {
        config.set("enable_glint", enableGlint);
        config.set("old_colors", oldColors);
        config.save();
    }

    public void load() {
        config.load();
        enableGlint = config.getOrElse("enable_glint", true);
        oldColors = config.getOrElse("old_colors", true);
    }
}
