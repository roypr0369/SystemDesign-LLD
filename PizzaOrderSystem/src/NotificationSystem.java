public abstract class NotificationSystem {
    public abstract void register(String item, UserDetails user);
    public abstract void unregister(String item, UserDetails user);
    public abstract void notifyUsers(String item);
}
