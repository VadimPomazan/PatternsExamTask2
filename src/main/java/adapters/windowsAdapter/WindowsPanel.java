package adapters.windowsAdapter;

import interfaces.UIInterfaces.Panel;

public class WindowsPanel implements Panel {
    @Override
    public void render() {
        System.out.println("Rendering Windows Panel using Windows API.");
    }
}