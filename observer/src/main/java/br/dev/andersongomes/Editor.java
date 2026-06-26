package br.dev.andersongomes;

import java.io.File;

public class Editor {
    public EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager();
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        events.notify("open", file.getName());
    }

    public void saveFile() {
        if (this.file != null) {
            try{
                file.createNewFile();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            events.notify("save", file.getName());
        }
    }

}
