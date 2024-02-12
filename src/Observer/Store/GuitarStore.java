package Observer.Store;

import Observer.v2.DisplayElement;

import java.util.ArrayList;
import java.util.List;

public class GuitarStore implements Subject {

    private List<Guitar>Guitars;
    private List<Observer>observers;
    GuitarStore(){
        Guitars=new ArrayList<>();
        observers=new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {

    }
    //Cuando aparezca un nuevo tipo de guitarra al cual los observadores se han inscrito, entonces se debe avisar
}
