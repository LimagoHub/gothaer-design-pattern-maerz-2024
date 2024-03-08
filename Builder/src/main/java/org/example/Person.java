package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person {

    @Builder.Default
    private String vorname="Fritz";

    @Builder.Default
    private String nachname="Meier";


    @Builder.Default
    private int alter=65;
/*
    public Person(final String vorname, final String nachname, final int alter) {
        this.vorname = vorname;
        this.nachname = nachname;

        this.alter = alter;
    }

    public Person() {
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

    public void setNachname(final String nachname) {
        this.nachname = nachname;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(final int alter) {
        this.alter = alter;
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public static class PersonBuilder {
        private Person result = new Person();

        PersonBuilder vorname(String vorname) {
            result.setVorname(vorname);
            return this;
        }

        PersonBuilder nachname(String nachname) {
            result.setNachname(nachname);
            return this;
        }

        PersonBuilder alter(int alter) {
            result.setAlter(alter);
            return this;
        }

        Person build() {
            return result;
        }
    }

 */
}
