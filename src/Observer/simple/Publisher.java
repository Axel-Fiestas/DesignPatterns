package Observer.simple;

import java.util.ArrayList;
import java.util.List;

public class Publisher {

    private List<Subscriber> subscribers;

    private String mainState;

    Publisher(){
        this.subscribers = new ArrayList<>();
    }

    public void subscribe(Subscriber subscriber){
        this.subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber){
        this.subscribers.remove(subscriber);
    }

    public void notifySubscribers(){
        subscribers.forEach(x->x.update());
    }

    public String mainBusinessLogic(){
        return this.mainState;
    }

    public void printSubscribers(){
        subscribers.forEach(x->System.out.println(x));
    }
}
