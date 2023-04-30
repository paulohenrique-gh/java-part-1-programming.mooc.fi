
public class Main {

    public static void main(String[] args) {
        // write experimental main programs here

        /* PaymentCard card = new PaymentCard(2.40);
        PaymentTerminal terminal = new PaymentTerminal();

        System.out.println(card.balance());
        terminal.eatAffordably(card);
        System.out.println(card.balance());
        terminal.eatHeartily(card);
        System.out.println(card.balance());
        terminal.addMoneyToCard(card, 5);
        System.out.println(card.balance());
        terminal.eatAffordably(card);
        System.out.println(card.balance());
        System.out.println(terminal); */

        PaymentTerminal terminal = new PaymentTerminal();
        PaymentCard card = new PaymentCard(10);
        
        System.out.println(card.balance());
        terminal.eatAffordably(card);
        System.out.println(card.balance());
    }
}

