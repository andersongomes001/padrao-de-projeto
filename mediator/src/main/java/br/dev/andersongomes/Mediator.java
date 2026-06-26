package br.dev.andersongomes;

public interface Mediator {
    void notify(Component sender, String event);
}
