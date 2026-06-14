package br.dev.andersongomes;

public class Circle extends Dot{
    private double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(this.getClass().getSimpleName() + ": Drawing a circle with radius " + radius);
    }

}
