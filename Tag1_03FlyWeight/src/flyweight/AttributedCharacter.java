package flyweight;

import java.util.ArrayList;
import java.util.List;

public class AttributedCharacter {

    private static List<AttributedCharacter> characters = new ArrayList<>();

    private AttributedCharacter(final char c , final boolean bold) {
        this.c = c;
        this.bold = bold;
        characters.add(this);
    }

    public static AttributedCharacter getInstance(final char c , final boolean bold) {
       for(AttributedCharacter item: characters){
           if(item.bold == bold && item.c == c) {
               return item;
           }
       }
       return new AttributedCharacter(c, bold);
    }

    private final char c;
    private final boolean bold;

    public char getC() {
        return c;
    }

    public boolean isBold() {
        return bold;
    }
}
