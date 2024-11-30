import interfaces.UIFactory;
import interfaces.UIInterfaces.*;

public class Application {
    private UIFactory uiFactory;

    public Application(UIFactory factory){
        this.uiFactory = factory;
    }

    public void renderUI(){
        Button button = uiFactory.createButton();
        Label label = uiFactory.createLabel();
        Window window = uiFactory.createWindow();
        Panel panel = uiFactory.createPanel();

        button.render();
        label.render();
        window.render();
        panel.render();
    }

}
