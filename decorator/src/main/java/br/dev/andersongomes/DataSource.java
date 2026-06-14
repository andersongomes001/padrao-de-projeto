package br.dev.andersongomes;

public interface DataSource {
    void writeData(String data);
    String readData();
}
