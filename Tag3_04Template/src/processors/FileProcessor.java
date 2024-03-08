package processors;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileProcessor {

    private List<CharacterHandler> handlers = new ArrayList<>();

    public void addCharacterHandler(CharacterHandler handler) {
        handlers.add(handler);
    }

    public void removeCharacterHandler(CharacterHandler handler) {
        handlers.remove(handler);
    }

    public final void run(String filename) { // Kann nicht ueberschrieben
        try (FileReader reader= new FileReader(filename)) {
           init();
           int zeichen;
            while((zeichen = reader.read()) != -1){
                process((char) zeichen);
            }
           dispose();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    private void init(){
        handlers.forEach(h->h.init());
    }

    private void process(char c) {
        handlers.forEach(h->h.process(c));
    }

    private void dispose() {
        handlers.forEach(h->h.dispose());
    }
}
