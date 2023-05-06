import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int currentTotalWeight = 0;
        for (Suitcase i : suitcases) {
            currentTotalWeight += i.totalWeight();
        }
        if (suitcase.totalWeight() + currentTotalWeight <= this.maxWeight) {
            this.suitcases.add(suitcase);
        }
    }

    @Override
    public String toString() {
        int currentTotalWeight = 0;
        for (Suitcase i : suitcases) {
            currentTotalWeight += i.totalWeight();
        }
        return this.suitcases.size() + " suitcases (" + currentTotalWeight + " kg)";
    }

    public void printItems() {
        for (Suitcase i : suitcases) {
            i.printItems();
        }
    }
}
