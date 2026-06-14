package br.dev.andersongomes.creational;

public class WebButton implements Button {

    @Override
    public void render() {
        System.out.println("Web Button rendered");
    }

    @Override
    public void onClick() {
        System.out.println("Web Button clicked");
    }

}
