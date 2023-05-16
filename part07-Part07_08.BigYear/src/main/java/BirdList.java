import java.util.ArrayList;

public class BirdList {
    
    private ArrayList<Bird> birdList;

    //constructor
    public BirdList() {
        this.birdList = new ArrayList<>();
    }

    //add bird to the list
    public void addBird(Bird bird) {
        this.birdList.add(bird);
    }

    //get bird in the list according to index used as argument
    public Bird getBird(int index) {
        return this.birdList.get(index);
    }

    //checks whether the name of the bird passed is in the list or not
    public boolean contains(String observedBird) {
        for (Bird bird : this.birdList) {
            if (bird.getName().equals(observedBird)) {
                return true;
            }
        }
              
        return false;
    }

    //get index of a bird based on its name
    public int getIndex(String observedBird) {
        for (int i = 0; i < this.birdList.size(); i++) {
            if (this.birdList.get(i).getName().equals(observedBird)) {
                return i;
            }
        }
        
        return -1;
    }

    //generate string with all the birds
    @Override
    public String toString() {
        String allBirds = "";

        for (Bird bird : this.birdList) {
            allBirds += bird + "\n";
        }

        return allBirds;
    }
}
