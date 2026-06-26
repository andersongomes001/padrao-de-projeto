package br.dev.andersongomes;

public abstract class Command {
    protected Application app;
    protected Editor editor;
    protected String backup;

    public Command(Application app, Editor editor) {
        this.app = app;
        this.editor = editor;
    }

    public void saveBackup() {
        this.backup = editor.getText();
    }

    public void undo(){
        editor.setText(backup);
    }

    abstract boolean execute();
}
