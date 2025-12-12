public class AuthModule implements Subscriber {

    public void userLogin(String username) {
        EventManager.getInstance().notify("AuthModule: Користувач '" + username + "' авторизувався");
    }

    public void userLogout(String username) {
        EventManager.getInstance().notify("AuthModule: Користувач '" + username + "' вийшов із системи");
    }

    @Override
    public void update(String eventMessage) {
        System.out.println("[AuthModule отримав]: " + eventMessage);
    }
}
