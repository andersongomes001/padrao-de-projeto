package br.dev.andersongomes;

public class Dot implements Graphic {
    private double x;
    private double y;

    public Dot(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println(this.getClass().getSimpleName() + ": Drawing a dot at (" + x + ", " + y + ")");
    }
}
