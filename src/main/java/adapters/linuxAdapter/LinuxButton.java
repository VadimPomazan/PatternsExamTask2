package adapters.linuxAdapter;

import interfaces.UIInterfaces.Button;

public class LinuxButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Linux Button using Linux API.");
    }
}