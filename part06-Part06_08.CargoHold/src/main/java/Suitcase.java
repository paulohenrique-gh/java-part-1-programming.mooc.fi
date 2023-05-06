import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<Item>();
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item i : this.items) {
            totalWeight += i.getWeight();
        }
        return totalWeight;
    }

    public void addItem(Item item) {
        if (item.getWeight() + this.totalWeight() <= this.maxWeight) {
            this.items.add(item);
        }
    }

    @Override
    public String toString() {

        //string item/items stored in a variable to make it easier
        //to switch from plural to singular if the suitcase has only one item
        String items = "items";

        //if suitcase has only one item, variable items get the string "item" instead of "items"
        if (this.items.size() == 1) {
            items = "item";
        }

        //if it has no items, the return string is different from the default one
        if (this.items.size() == 0) {
            return "no " + items +  " (" + this.totalWeight() + " kg)";
        }

        return this.items.size() + " " + items + " (" + this.totalWeight() + " kg)";
    }

    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }

        int heaviestIndex = 0;
        for (Item item : this.items) {
            if (item.getWeight() > this.items.get(heaviestIndex).getWeight()) {
                heaviestIndex = this.items.indexOf(item);
            }
        }

        return this.items.get(heaviestIndex);
    }
}
