package br.dev.andersongomes;

public class Component {
    public Mediator dialog;

    public Component(Mediator dialog) {
        this.dialog = dialog;
    }

    void click(){
        dialog.notify(this, "click");
    }

    void keypress(){
        dialog.notify(this, "keypress");
    }
}
