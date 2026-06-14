package br.dev.andersongomes.creational;

public class CarManualBuilder implements Builder{
    private Manual manual;
    @Override
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setSeats(int seats) {
        this.manual.setSeats(seats);
    }

    @Override
    public void setEngine(Engine engine) {
        this.manual.setEngine(engine);
    }

    @Override
    public void setTripComputer(boolean b) {
        this.manual.setTripComputer(b);
    }

    @Override
    public void setGps(boolean b) {
        this.manual.setGps(b);
    }

    public Manual getProduct(){
        Manual product = this.manual;
        this.reset();
        return product;
    }
}
