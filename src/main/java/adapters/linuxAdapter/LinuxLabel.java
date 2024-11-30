package adapters.linuxAdapter;

import interfaces.UIInterfaces.Label;

public class LinuxLabel implements Label {
    @Override
    public void render() {
        System.out.println("Rendering Linux Label using Linux API.");
    }
}
