package tiere;



public class Schwein {



    private String name;
    private int gewicht;



    public SchweineMemento getMemento() {
        return new MySchweineMemento(name, gewicht);
    }

    public void setMemento(final SchweineMemento memento) {
        MySchweineMemento mySchweineMemento = (MySchweineMemento) memento;
        setName(mySchweineMemento.getName());
        setGewicht(mySchweineMemento.getGewicht());
    }

    public Schwein() {
        this("Nobody");
    }
    public Schwein(final String name) {
        this.name = name;
        this.gewicht = 10;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {

        this.name = name;

    }

    public int getGewicht() {
        return gewicht;
    }

    private void setGewicht(final int gewicht) {

        this.gewicht = gewicht;

    }

    public void fressen() {
        setGewicht(getGewicht() + 1);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Schwein{");
        sb.append("name='").append(name).append('\'');
        sb.append(", gewicht=").append(gewicht);
        sb.append('}');
        return sb.toString();
    }

    private  static class MySchweineMemento implements SchweineMemento {

       private final String name;
       private final int gewicht;

        public MySchweineMemento(final String name, final int gewicht) {
            this.name = name;
            this.gewicht = gewicht;
        }

        public String getName() {
            return name;
        }

        public int getGewicht() {
            return gewicht;
        }
    }
}
