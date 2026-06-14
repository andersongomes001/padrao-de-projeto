package br.dev.andersongomes.creational;

public interface Builder {
    void reset();
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTripComputer(boolean hasTrip);
    void setGps(boolean hasGps);
}
