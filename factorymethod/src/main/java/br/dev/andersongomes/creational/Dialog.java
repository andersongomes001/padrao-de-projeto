package br.dev.andersongomes.creational;

public abstract class Dialog {
    abstract Button createButton();
    void render(){
        Button okButton = createButton();
        okButton.onClick();
        okButton.render();
    }
}
