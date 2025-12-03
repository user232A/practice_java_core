package clean_code.patterns.homework.task_6;

public class MacFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Window createWindow() {
        return new MacOSWindow();
    }

    @Override
    public Menu createMenu() {
        return new MacOSMenu();
    }
}
