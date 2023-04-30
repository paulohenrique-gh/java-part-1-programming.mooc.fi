
public class MainProgram {

    public static void main(String[] args) {
        // Test your class here
        Product ductTape = new Product("Duct tape");
        Product usbCable = new Product("USB Cable", "Cables section");
        Product monitor = new Product("Monitor", 4);

        System.out.println(ductTape);
        System.out.println(usbCable);
        System.out.println(monitor);
    }
}
