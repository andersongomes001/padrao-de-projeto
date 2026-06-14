package br.dev.andersongomes.creational;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);
        Car car = carBuilder.getProduct();
        System.out.println(car.toString());

        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.constructSportsCar(carManualBuilder);
        Manual manual = carManualBuilder.getProduct();
        System.out.println(manual.toString());
    }
}
