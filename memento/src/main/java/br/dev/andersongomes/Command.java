package br.dev.andersongomes;

import java.util.Objects;

public class Command {
    private Snapshot backup;
    private Editor editor;

    public void makeBackup(){
        backup = editor.createSnapshot();
    }

    public void undo(){
        if(Objects.nonNull(backup)){
            backup.restore();
        }
    }
}
