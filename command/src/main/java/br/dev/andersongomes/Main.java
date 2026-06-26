package br.dev.andersongomes;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        CommandHistory history = new CommandHistory();
        Application application = new Application(editor, history);
        application.createUI();
    }
}