public class LoggingModule implements Subscriber {

    @Override
    public void update(String eventMessage) {
        System.out.println("[LoggingModule LOG]: " + eventMessage);
    }
}
