package cc.abbie.oldpotions.common;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.CycleButton;
import net.minecraft.client.gui.layouts.FrameLayout;
import net.minecraft.client.gui.layouts.GridLayout;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;

import javax.annotation.Nonnull;

import static cc.abbie.oldpotions.common.OldPotionsCommon.config;

public class OldPotionsConfigScreen extends Screen {
    private final Screen parent;

    public OldPotionsConfigScreen(Screen parent) {
        super(Component.translatable("config.oldpotions.title"));
        this.parent = parent;
    }

    protected void init() {
        GridLayout grid = new GridLayout();

        grid.defaultCellSetting().paddingHorizontal(5).paddingBottom(4).alignHorizontallyCenter();

        GridLayout.RowHelper rows = grid.createRowHelper(2);

        rows.addChild(CycleButton.onOffBuilder(config.oldColors).create(
                0, 0, 150, 20,
                Component.translatable("config.oldpotions.option.old_colors"),
                (but, val) -> config.oldColors = val
        ));
        rows.addChild(CycleButton.onOffBuilder(config.enableGlint).create(
                0, 0, 150, 20,
                Component.translatable("config.oldpotions.option.enable_glint"),
                (but, val) -> config.enableGlint = val
        ));

        rows.addChild(Button.builder(CommonComponents.GUI_DONE, button -> onClose()).width(200).build(),
                2, grid.newCellSettings().paddingTop(6));

        grid.arrangeElements();
        FrameLayout.alignInRectangle(grid, 0, height / 6 - 12, width, height, 0.5f, 0f);
        grid.visitWidgets(this::addRenderableWidget);
    }

    @Override
    public void render(@Nonnull GuiGraphics gui, int x, int y, float delta) {
        renderBackground(gui, x, y, delta);
        gui.drawCenteredString(font, title, width / 2, 15, -1);
        super.render(gui, x, y, delta);
    }

    @Override
    public void onClose() {
        config.save();
        minecraft.setScreen(parent);
    }
}
