package br.dev.andersongomes;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private List<Shape> shapes = new ArrayList<>();

    public Application() {
        Circle circle = new Circle();
        circle.setX(10);
        circle.setY(10);
        circle.setRadius(20);
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(20);
        shapes.add(rectangle);
    }

    public void businessLogic() {
        List<Shape> shapesCopy = new ArrayList<>();
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }
        System.out.println(shapesCopy);
    }
}
