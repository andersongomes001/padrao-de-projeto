package br.dev.andersongomes.creational;

public class CarBuilder implements  Builder {
    private Car car;

    public CarBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int seats) {
        this.car.setSeats(seats);
    }

    @Override
    public void setEngine(Engine engine) {
        this.car.setEngine(engine);
    }

    @Override
    public void setTripComputer(boolean hasTrip) {
        this.car.setTripComputer(hasTrip);
    }

    @Override
    public void setGps(boolean hasGPS) {
        this.car.setGps(hasGPS);
    }

    public Car getProduct(){
        Car product = this.car;
        this.reset();
        return product;
    }
}
