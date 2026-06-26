package br.dev.andersongomes;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private String clipboard;
    private List<Editor> editors = new ArrayList<>();
    private Editor activeEditor;
    private CommandHistory history;

    public Application(Editor activeEditor, CommandHistory history) {
        this.activeEditor = activeEditor;
        this.history = history;
    }

    public void createUI(){
        Button copyButton = new Button();
        Button cutButton = new Button();
        Button pasteButton = new Button();
        Button undoButton = new Button();

        Shortcuts shortcuts = new Shortcuts();

        Runnable copy = () -> {
            executeCommand(new CopyCommand(this, activeEditor));
        };
        copyButton.setCommand(copy);
        shortcuts.onKeyPress("Ctrl+C", copy);

        Runnable cut = () -> {
            executeCommand(new CutCommand(this, activeEditor));
        };
        cutButton.setCommand(cut);
        shortcuts.onKeyPress("Ctrl+X", cut);

        Runnable paste = () -> {
            executeCommand(new PasteCommand(this, activeEditor));
        };
        pasteButton.setCommand(paste);
        shortcuts.onKeyPress("Ctrl+V", paste);

        Runnable undo = () -> {
            executeCommand(new UndoCommand(this, activeEditor));
        };
        undoButton.setCommand(undo);
        shortcuts.onKeyPress("Ctrl+Z", undo);

    }

    void executeCommand(Command command){
        if(command.execute()){
            history.push(command);
        }
    }

    void undo(){
        Command command = history.pop();
        if(command != null){
            command.undo();
        }
    }

    public String getClipboard() {
        return clipboard;
    }

    public void setClipboard(String clipboard) {
        this.clipboard = clipboard;
    }

    public List<Editor> getEditors() {
        return editors;
    }

    public void setEditors(List<Editor> editors) {
        this.editors = editors;
    }

    public Editor getActiveEditor() {
        return activeEditor;
    }

    public void setActiveEditor(Editor activeEditor) {
        this.activeEditor = activeEditor;
    }

    public CommandHistory getHistory() {
        return history;
    }

    public void setHistory(CommandHistory history) {
        this.history = history;
    }
}
