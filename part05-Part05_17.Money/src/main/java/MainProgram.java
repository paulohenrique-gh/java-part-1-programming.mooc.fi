
public class MainProgram {

    public static void main(String[] args) {
        // test your class here
       Money money = new Money(14,69);
       System.out.println(money);
       Money money2 = new Money(14,68);
       System.out.println(money2);
       Money money3 = new Money(3,50);

       System.out.println(money.lessThan(money2));
       System.out.println(money.minus(money2));
       System.out.println(money.minus(money3));
    
    }
}
