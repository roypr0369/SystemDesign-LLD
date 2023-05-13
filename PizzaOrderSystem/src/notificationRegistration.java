import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class notificationRegistration extends NotificationSystem{
    Map<String, List<UserDetails>> subscribers;
    @Override
    public void register(String item, UserDetails user) {
        if(!subscribers.containsKey(item)){
            subscribers.put(item, new ArrayList<>());
        }else{
            List<UserDetails> users = subscribers.get(item);
            users.add(user);
        }
    }

    @Override
    public void unregister(String item, UserDetails user) {
        if(subscribers.containsKey(item)){
            List<UserDetails> users = subscribers.get(item);
            users.remove(user);
        }
    }
}
