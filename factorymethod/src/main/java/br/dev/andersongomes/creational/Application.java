package br.dev.andersongomes.creational;

public class Application {
    private  Dialog dialog;

    public Application() throws Exception {
        initialize();
    }

    private void initialize() throws Exception {
        if(System.getProperty("os.name").contains("Windows")){
            dialog = new WindowsDialog();
        }else if(System.getProperty("os.name").contains("Web")){
            dialog = new WebDialog();
        } else {
            throw new Exception("Erro Unkonow operating system.");
        }
    }
}
