package br.dev.andersongomes.creational;

public class WebDialog extends Dialog {

    @Override
    Button createButton() {
        return new WebButton();
    }

}
