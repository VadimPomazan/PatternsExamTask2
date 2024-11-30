package adapters.linuxAdapter;

import interfaces.UIInterfaces.Window;

public class LinuxWindow implements Window {
    @Override
    public void render() {
        System.out.println("Rendering Linux Window using Linux API.");
    }
}
