import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Try out your class here

        Stack stack = new Stack();

        System.out.println("Empty: " + stack.isEmpty());

        stack.add("A");
        System.out.println(stack.values());
        stack.add("B");
        stack.add("C");
        System.out.println(stack.values());
        System.out.println("Empty: " + stack.isEmpty());
        
        String remove = stack.take();
        System.out.println("Item removed: " + remove);
        System.out.println(stack.values());

    }
}
