
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here

        Counter counter = new Counter();
        System.out.println(counter.value());
        counter.increase();
        counter.increase();
        counter.increase();
        counter.increase();
        counter.decrease();
        counter.increase(30);
        counter.decrease(21);
        System.out.println(counter.value());
    }
}
