public class ApplicationAbstractFactory {
    private GuiFactory factory;
    private Button button;
    private Checkbox checkbox;


    public ApplicationAbstractFactory(GuiFactory factory){
        this.factory = factory;
    }
    
    public void createUi() {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
