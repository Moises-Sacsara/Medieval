package medieval;

import java.util.ArrayList;
import java.util.List;

public class Sujeto {
    private List<Observer> observers = new ArrayList<>();
    private String season;

    public void subscribirse(Observer observer) {
        observers.add(observer);
    }


    public void cabiotemporada(String newSeason) {
        this.season = newSeason;
        notificaObservers();
    }

    private void notificaObservers() {
        for (Observer observer : observers) {
            observer.update(season);
        }
    }
}
