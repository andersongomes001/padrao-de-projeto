package br.dev.andersongomes;

public class Main {
    public static void main(String[] args) {
        DataSource source = new FileDataSource("somefile.dat");
        source.writeData("Hello, World! FileDataSource");
        source.readData();

        source = new CompressionDecorator(source);
        source.writeData("Hello, World! CompressionDecorator");
        source.readData();

        source = new EncryptionDecorator(source);
        source.writeData("Hello, World! EncryptionDecorator");
        source.readData();
    }
}
