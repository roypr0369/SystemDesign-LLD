import java.util.List;

public class PhoneNotification extends notificationRegistration{
    public void notifyUsers(String item) {
        List<UserDetails> users = subscribers.get(item);
        for(UserDetails user : users){
            notify(user.phone_no);
        }
    }

    private void notify(String phone_no) {
        System.out.println("SMS Sent");
    }
}
