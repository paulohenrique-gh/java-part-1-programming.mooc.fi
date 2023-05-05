
public class Main {

    public static void main(String[] args) {


        // use this main method to try out your classes!
        Gift gift = new Gift("FFXVI", 2);
        Gift gift2 = new Gift("Monster Hunter", 3);
        Package pack = new Package();

        System.out.println("Name: " + gift.getName());
        System.out.println("Weight: " + gift.getWeight());
        System.out.println(gift);
        System.out.println();

        pack.addGift(gift);
        pack.addGift(gift2);
        System.out.println("Name: " + gift2.getName());
        System.out.println("Weight: " + gift2.getWeight());
        System.out.println(gift2);
        System.out.println();

        
        System.out.println(pack.totalWeight());

    }
}
