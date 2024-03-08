package main;

import processors.*;

public class Main {
    public static void main(String[] args) {

        FileProcessor processor = new FileProcessor();
        processor.addCharacterHandler(new CharacterCounter());
        processor.addCharacterHandler(new LineCounter());
        processor.addCharacterHandler(new FileKopierer());
        processor.run("./resource/ReAgent.log");
    }
}