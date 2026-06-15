package br.dev.andersongomes;

import br.dev.andersongomes.thirdframework.*;

import java.io.File;

public class VideoConverter {
    public File convert(String fileName, String format){
        File file = new File(fileName);
        CodecFactory sourceCodec = (new CodecFactory()).extract(file);
        Object destinationCodec;
        if(format.equalsIgnoreCase("mp4")){
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }
        Object buffer = BitrateReader.read(fileName, sourceCodec);
        Object result = BitrateReader.convert(buffer, destinationCodec);
        result = (new AudioMixer()).fix(result);
        return new File(result.toString());
    }
}
