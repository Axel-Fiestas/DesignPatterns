package Observer.simple;

public class main {
    public static void main(String[] args) {

        //The publisher = SUBJECT
        //Subscribers= OBSERVERS

        Publisher publisher= new Publisher();

        Subscriber subscriberAndroid1= new SubscriberAndroid("Axel");
        Subscriber subscriberAndroid2= new SubscriberAndroid("Nicolás");

        publisher.subscribe(subscriberAndroid1);
        publisher.subscribe(subscriberAndroid2);

        publisher.printSubscribers();

    }
}