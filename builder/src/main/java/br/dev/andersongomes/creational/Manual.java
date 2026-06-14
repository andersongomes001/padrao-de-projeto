package br.dev.andersongomes.creational;

public class Manual {
    private int seats;
    private Engine engine;
    private boolean tripComputer;
    private boolean gps;

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public boolean isTripComputer() {
        return tripComputer;
    }

    public void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "Manual{" +
                "seats=" + seats +
                ", engine=" + engine.getEngineType() +
                ", tripComputer=" + tripComputer +
                ", gps=" + gps +
                '}';
    }
}
