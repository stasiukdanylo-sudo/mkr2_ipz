import java.util.ArrayList;
import java.util.List;

public class EventManager {

    private static EventManager instance;

    private List<Subscriber> subscribers = new ArrayList<>();

    private EventManager() {}

    public static synchronized EventManager getInstance() {
        if (instance == null) {
            instance = new EventManager();
        }
        return instance;
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notify(String eventMessage) {
        System.out.println("\n[EventManager] Broadcasting event: " + eventMessage);
        for (Subscriber subscriber : subscribers) {
            subscriber.update(eventMessage);
        }
    }
}
