
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Message message = new Message("PH", "Hi");
        MessagingService messages = new MessagingService();

        messages.add(message);

        System.out.println(message);
        System.out.println(messages.getMessages());
    }
}
