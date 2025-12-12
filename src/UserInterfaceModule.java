public class UserInterfaceModule implements Subscriber {

    @Override
    public void update(String eventMessage) {
        System.out.println("[UserInterface UI]: " + eventMessage);
    }
}
