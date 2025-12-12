public class Main {
    public static void main(String[] args) {

        EventManager eventManager = EventManager.getInstance();

        AuthModule auth = new AuthModule();
        LoggingModule logger = new LoggingModule();
        UserInterfaceModule ui = new UserInterfaceModule();

        eventManager.subscribe(auth);
        eventManager.subscribe(logger);
        eventManager.subscribe(ui);

        auth.userLogin("Danylo");
        auth.userLogout("Danylo");

        System.out.println("\nEventManager instance check: " +
                (eventManager == EventManager.getInstance()));
    }
}
