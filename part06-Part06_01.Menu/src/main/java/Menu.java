
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here

    //addmeal method
    public void addMeal(String meal) {
        //for loop to check for duplicate items.
        //if argument is already part of the list, the method ends
        for (String item : this.meals) {
            if (item.equals(meal)) {
                return;
            }
        }

        this.meals.add(meal);
    }

    //print method
    public void printMeals() {
        //create for loop for printing every item on the list
        for (String item: this.meals) {
            System.out.println(item);
        }
    }

    //clear method
    public void clearMenu() {
        //use ArrayList method for clearing the entire list
        this.meals.clear();
    }

}




