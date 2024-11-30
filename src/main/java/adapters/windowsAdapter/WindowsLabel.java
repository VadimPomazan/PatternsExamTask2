package adapters.windowsAdapter;

import interfaces.UIInterfaces.Label;

public class WindowsLabel implements Label {
    @Override
    public void render() {
        System.out.println("Rendering Windows Label using Windows API.");
    }
}
