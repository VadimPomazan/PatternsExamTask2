package adapters.windowsAdapter;

import interfaces.UIInterfaces.Button;

public class WindowsButton implements Button {
    @Override
    public void render(){
        System.out.println("Rendering Windows Button using Windows API");
    }
}
