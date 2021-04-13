import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> inbox;

    public MessagingService() {
        this.inbox = new ArrayList<>();
    }

    public void add(Message message) {
        if(message.getContent().length() <= 280) {
            this.inbox.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        return this.inbox;
    }
}
