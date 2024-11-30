package adapters.linuxAdapter;

import interfaces.UIInterfaces.Panel;

public class LinuxPanel implements Panel {
    @Override
    public void render() {
        System.out.println("Rendering Linux Panel using Linux API.");
    }
}
