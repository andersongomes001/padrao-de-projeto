package br.dev.andersongomes.creational;

public class WindowsDialog extends Dialog {

    @Override
    Button createButton() {
        return new WindowsButton();
    }
    
}
