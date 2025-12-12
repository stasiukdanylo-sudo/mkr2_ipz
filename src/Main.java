public class Main {
    public static void main(String[] args) {

        EventManager eventManager = EventManager.getInstance();

        // створення модулів
        AuthModule auth = new AuthModule();
        LoggingModule logger = new LoggingModule();
        UserInterfaceModule ui = new UserInterfaceModule();

        // підписуємо їх на менеджер подій
        eventManager.subscribe(auth);
        eventManager.subscribe(logger);
        eventManager.subscribe(ui);

        // генеруємо події
        auth.userLogin("Danylo");
        auth.userLogout("Danylo");

        // продемонструємо, що Singleton працює
        System.out.println("\nEventManager instance check: " +
                (eventManager == EventManager.getInstance()));
    }
}
