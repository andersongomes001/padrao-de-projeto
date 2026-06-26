package br.dev.andersongomes;

import java.io.File;
import java.io.FileWriter;

public class LoggingListener implements EventListener {
    private File log;
    private String message;

    public LoggingListener(String logFilename,String message) {
        this.log = new File(logFilename);
        this.message = message;
    }

    @Override
    public void update(String fileName) {
        try{
            log.createNewFile();
            try(FileWriter fw = new FileWriter(log)){
                fw.write(String.format(message, fileName));
            }

        }catch (Exception e){

        }
    }
}
