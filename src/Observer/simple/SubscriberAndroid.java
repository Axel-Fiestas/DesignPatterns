package Observer.simple;

import Observer.simple.Subscriber;

public class SubscriberAndroid implements Subscriber {

    private String name;

    SubscriberAndroid(String name){
        this.name=name;
    }

    public String getName(){
        return  this.name;
    }

    @Override
    public void update() {
        System.out.println("Felicitaciones, te has suscrito al canal de android");
    }
}
