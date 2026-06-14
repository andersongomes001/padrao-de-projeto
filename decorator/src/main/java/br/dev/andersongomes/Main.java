package br.dev.andersongomes;

public class Main {
    public static void main(String[] args) {
        DataSource source = new FileDataSource("somefile.dat");
        source.writeData("Hello, World! FileDataSource");
        System.out.println("Reading data from file... " +  source.readData());

        CompressionDecorator compressionDecorator = new CompressionDecorator(source);
        compressionDecorator.writeData("Hello, World! CompressionDecorator");
        System.out.println("Reading data from file... " +  compressionDecorator.readData());

        EncryptionDecorator encryptionDecorator = new EncryptionDecorator(source);
        encryptionDecorator.writeData("Hello, World! EncryptionDecorator");
        System.out.println("Reading data from file... " +  encryptionDecorator.readData());
    }
}
