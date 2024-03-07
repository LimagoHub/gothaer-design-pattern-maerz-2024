package bean;

public class Person {

    private String vorname;
    private String nachname;

    private String Ort = "";

    public Person() {
        vorname = "John";
        nachname = "Doe";
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(final String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getOrt() {
        return Ort;
    }

    public void setOrt(final String ort) {
        Ort = ort;
    }

    public void setNachname(final String nachname) {
        this.nachname = nachname;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("vorname='").append(vorname).append('\'');
        sb.append(", nachname='").append(nachname).append('\'');
        sb.append(", Ort='").append(Ort).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

