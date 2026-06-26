package br.dev.andersongomes;

public class CutCommand extends Command {

    public CutCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    boolean execute() {
        saveBackup();
        app.setClipboard(editor.getSelection());
        editor.deleteSelection();
        return true;
    }
}
