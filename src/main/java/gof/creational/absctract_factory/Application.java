package gof.creational.absctract_factory;

public class Application {

    private GUIFactory guiFactory;
    private Checkbox checkbox;
    private Button button;

    public Application(GUIFactory guiFactory) {
        System.out.println("Start application...");
        System.out.println(guiFactory.showName());
        this.guiFactory = guiFactory;
    }

    public void createUI() {
        this.button = guiFactory.createButton();
        this.checkbox = guiFactory.createCheckbox();
    }

    public void render() {
        this.button.render();
        this.checkbox.render();
    }
}
