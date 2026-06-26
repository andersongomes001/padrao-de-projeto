package br.dev.andersongomes;

import java.util.ArrayList;
import java.util.List;

public class CommandHistory {
    private List<Command> history = new ArrayList<>();

    public void push(Command c){
        history.add(c);
    }

    public Command pop() {
        return history == null ? null : history.removeLast();
    }
}
