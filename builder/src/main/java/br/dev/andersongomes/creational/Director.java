package br.dev.andersongomes.creational;

public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void constructSportsCar(Builder builder){
        builder.reset();
        builder.setSeats(2);
        builder.setEngine(new SportEngine());
        builder.setTripComputer(true);
        builder.setGps(true);
    }

    public void constructSUV(Builder builder){
        builder.reset();
        builder.setSeats(4);
        builder.setEngine(new AwdEngine());
        builder.setTripComputer(true);
        builder.setGps(true);
    }
}
