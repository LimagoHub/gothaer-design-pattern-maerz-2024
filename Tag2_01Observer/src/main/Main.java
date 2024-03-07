package main;

import tiere.PigTooFatListener;
import tiere.Schwein;
import tiere.Tier;

public class Main {

    private Metzger metzger = new Metzger();
    private Spediteur spediteur = new Spediteur();

    public static void main(String[] args) {

        new Main().run();
    }

    private void run() {

        Schwein piggy = new Schwein("Miss Piggy");
        piggy.addPigTooFatListener(new SchweineMetzgerAdapter());
        piggy.addPigTooFatListener(new PigTooFatListener() {
            @Override
            public void pigTooFat(final Schwein source) {
                metzger.schlachten(source);
            }
        });
        piggy.addPigTooFatListener(schwein->spediteur.fahren(schwein));
        piggy.addPigTooFatListener(spediteur::fahren);
        for (int i = 0; i < 11; i++) {
            piggy.fressen();
        }
    }

    class SchweineMetzgerAdapter implements PigTooFatListener{

        @Override
        public void pigTooFat(final Schwein source) {
            metzger.schlachten(source);
        }
    }
}

class Metzger  {


    public void schlachten(final Tier source) {
        System.out.println("Messer wetz!");
    }
}
class Spediteur {


    public void fahren(final Object source) {
        System.out.println("Wir fahren auf der Autobahn");
    }
}