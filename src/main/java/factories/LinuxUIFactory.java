package factories;

import interfaces.*;
import adapters.linuxAdapter.*;
import interfaces.UIInterfaces.*;


public class LinuxUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Label createLabel() {
        return new LinuxLabel();
    }

    @Override
    public Window createWindow() {
        return new LinuxWindow();
    }

    @Override
    public Panel createPanel() {
        return new LinuxPanel();
    }
}
