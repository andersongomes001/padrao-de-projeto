package br.dev.andersongomes;

public class CopyCommand extends Command {

    public CopyCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    boolean execute() {
        app.setClipboard(editor.getSelection());
        return false;
    }
}
