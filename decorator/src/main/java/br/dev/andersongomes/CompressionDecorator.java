package br.dev.andersongomes;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.util.Base64;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(DataSource wrappee) {
        super(wrappee);
    }

    @Override
    public void writeData(String data) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (GZIPOutputStream gzip = new GZIPOutputStream(baos)) {
            gzip.write(data.getBytes());
        }catch (Exception e) {
            e.printStackTrace();
        }
        super.writeData(Base64.getEncoder().encodeToString(baos.toByteArray()));
    }

    @Override
    public String readData() {
        String data = super.readData();
        ByteArrayInputStream baos = new ByteArrayInputStream(Base64.getDecoder().decode(data));
        try (GZIPInputStream gzip = new GZIPInputStream(baos)) {
            InputStreamReader reader = new InputStreamReader(gzip);
            StringBuilder sb = new StringBuilder();
            int c;
            while ((c = reader.read()) != -1) {
                sb.append((char) c);
            }
            return sb.toString();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
