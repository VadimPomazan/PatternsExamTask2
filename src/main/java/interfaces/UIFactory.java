package interfaces;

import interfaces.UIInterfaces.Button;
import interfaces.UIInterfaces.Label;
import interfaces.UIInterfaces.Panel;
import interfaces.UIInterfaces.Window;

public interface UIFactory {
    Button createButton();
    Label createLabel();
    Window createWindow();
    Panel createPanel();
}
