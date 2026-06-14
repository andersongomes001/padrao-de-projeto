package br.dev.andersongomes;

public class FileDataSource implements DataSource {
    private final String fileName;
    private String data;

    public FileDataSource(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void writeData(String data) {
        System.out.println("Writing data in file " + fileName + "..." + data);
        this.data = data;
    }

    @Override
    public String readData() {
        return data;
    }
}
