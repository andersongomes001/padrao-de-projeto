public class Main {
    public static void main(String[] args) throws Exception {
        System.setProperty("os.name", "Mac OS X");
        GuiFactory factory;
        if(System.getProperty("os.name").contains("Windows")){
            factory = new WinFactory();
        } else if(System.getProperty("os.name").contains("Mac")){
            factory = new MacFactory();
        }else{
            throw new Exception("Unknown OS");
        }
        ApplicationAbstractFactory app = new ApplicationAbstractFactory(factory);
        app.createUi();
        app.paint();
    }
}
