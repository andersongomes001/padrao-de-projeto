package br.dev.andersongomes.creational;

public class WindowsButton implements Button {
    public WindowsButton(){}

    @Override
    public void render() {
        System.out.println("Windows Button rendered");
    }

    @Override
    public void onClick() {
       System.out.println("Windows Button clicked");
    }
}
