import java.util.ArrayList;

public class Recipe {
    private String name;
    private int time;
    private ArrayList<String> ingredients;

    //constructor which takes name, time and list of ingredients as parameters
    public Recipe(String name, int time, ArrayList<String> ingredients) {
        this.name = name;
        this.time = time;
        this.ingredients = ingredients;
    }

    //return name of recipe
    public String getName() {
        return this.name;
    }

    //return time
    public int getTime() {
        return this.time;
    }

    //return list of ingredients
    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }
}
