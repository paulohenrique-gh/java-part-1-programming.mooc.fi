
public class Main {

    public static void main(String[] args) {
        // Test your class here
        Room room = new Room();
        System.out.println("Empty: " + room.isEmpty());

        room.add(new Person("Luke", 189));
        room.add(new Person("Anakin", 198));
        room.add(new Person("Ahsoka", 150));
        System.out.println("Empty: " + room.isEmpty());

        System.out.println(room.getPersons());
        System.out.println("Shortest: " + room.shortest());

        while (!room.isEmpty()) {
            System.out.println("Removed: " + room.take());
        }
        System.out.println("Empty: " + room.isEmpty());
        
    }
}
