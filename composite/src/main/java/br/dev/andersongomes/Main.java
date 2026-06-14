package br.dev.andersongomes;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();
        editor.load();
        editor.groupSelected(List.of(new Dot(2, 4), new Circle(10, 6, 20)));
    }
}
