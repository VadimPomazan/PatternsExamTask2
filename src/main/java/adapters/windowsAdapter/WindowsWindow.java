package adapters.windowsAdapter;

import interfaces.UIInterfaces.Window;

public class WindowsWindow implements Window {
    @Override
    public void render() {
        System.out.println("Rendering Windows Window using Windows API.");
    }
}
