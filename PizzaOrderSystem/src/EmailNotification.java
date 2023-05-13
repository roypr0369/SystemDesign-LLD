import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EmailNotification extends notificationRegistration{

    public void notifyUsers(String item) {
        List<UserDetails> users = subscribers.get(item);
        for(UserDetails user : users){
            notify(user.email);
        }
    }

    private void notify(String email) {
        System.out.println("Email Sent");
    }
}
