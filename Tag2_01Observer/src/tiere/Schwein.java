package tiere;

import commonevents.PropertyChangedEvent;
import commonevents.PropertyChangedListener;

import java.util.ArrayList;
import java.util.List;

public class Schwein extends Tier{

    private static final int MAX_WEIGHT = 20;

    private List<PigTooFatListener> pigTooFatListeners = new ArrayList<>();
    private List<PropertyChangedListener> propertyChangedListeners = new ArrayList<>();


    public void addPigTooFatListener(final PigTooFatListener pigTooFatListener) {
        pigTooFatListeners.add(pigTooFatListener);
    }

    public boolean removePigTooFatListener(final PigTooFatListener pigTooFatListener) {
        return pigTooFatListeners.remove(pigTooFatListener);
    }

    public boolean removePropertyChangedListener(final PropertyChangedListener propertyChangedListener) {
        return propertyChangedListeners.remove(propertyChangedListener);
    }

    public void addPropertyChangedListener(final PropertyChangedListener propertyChangedListener) {
        propertyChangedListeners.add(propertyChangedListener);
    }



    private void firePigTooFatEvent() {
        pigTooFatListeners.forEach(listener->listener.pigTooFat(this));
    }
    private void fireProperChangedEvent(PropertyChangedEvent event) {
        propertyChangedListeners.forEach(listerner->listerner.propertyChanged(event));
    }

    private String name;
    private int gewicht;

    public Schwein(final String name) {
        this.name = name;
        this.gewicht = 10;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        PropertyChangedEvent event = new PropertyChangedEvent(this, "name", this.name, name);
        this.name = name;
        fireProperChangedEvent(event);
    }

    public int getGewicht() {
        return gewicht;
    }

    private void setGewicht(final int gewicht) {
        PropertyChangedEvent event = new PropertyChangedEvent(this, "gewicht", this.gewicht, gewicht);
        this.gewicht = gewicht;
        fireProperChangedEvent(event);
        if(gewicht > MAX_WEIGHT) firePigTooFatEvent();
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
}
