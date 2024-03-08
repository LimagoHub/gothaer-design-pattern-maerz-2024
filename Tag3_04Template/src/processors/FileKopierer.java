package processors;

import java.io.FileWriter;
import java.io.IOException;

public class FileKopierer implements CharacterHandler{

    private FileWriter writer;

    @Override
    public void init() {
        try {
            writer = new FileWriter("./resource/ausgabe.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void process(final char c) {
        try {
            writer.write(c);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void dispose() {
        try {
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
