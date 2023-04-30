
public class Main {

    public static void main(String[] args) {
        // write experimental code here to check how your program functions
        Person john = new Person("John", 25, 170, 70);

        HealthStation hospital = new HealthStation();

        System.out.println(hospital.weigh(john));

        hospital.feed(john);

        System.out.println(john.getWeight());
        hospital.feed(john);
        System.out.println(hospital.weigh(john));
        System.out.println("Weighings performed: " + hospital.weighings());
        hospital.feed(john);
        System.out.println(hospital.weigh(john));
        System.out.println("Weighings performed: " + hospital.weighings());

    }
}
