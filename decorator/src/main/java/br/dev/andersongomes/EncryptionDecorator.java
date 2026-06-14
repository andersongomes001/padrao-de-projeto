package br.dev.andersongomes;

import java.util.Base64;

public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource source){
        super(source);
    }

    @Override
    public void writeData(String data) {
        data = Base64.getEncoder().encodeToString(data.getBytes());
        super.writeData(data);
    }

    @Override
    public String readData() {
        String data = super.readData();
        return new String(Base64.getDecoder().decode(data));
    }
}
