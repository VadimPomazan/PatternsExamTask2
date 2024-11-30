package factories;

import adapters.windowsAdapter.*;
import interfaces.*;
import interfaces.UIInterfaces.*;



public class WindowsUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Label createLabel() {
        return new WindowsLabel();
    }

    @Override
    public Window createWindow() {
        return new WindowsWindow();
    }

    @Override
    public Panel createPanel() {
        return new WindowsPanel();
    }
}
