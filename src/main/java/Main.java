import factories.LinuxUIFactory;
import factories.WindowsUIFactory;
import interfaces.UIFactory;

public class Main {
    public static void main(String[] args){
        String os = System.getProperty("os.name").toLowerCase();
        UIFactory uiFactory;

        if (os.contains("win")){
            uiFactory = new WindowsUIFactory();
        }else {
            uiFactory = new LinuxUIFactory();
        }

        Application app = new Application(uiFactory);
        app.renderUI();
    }
}
