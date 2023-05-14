import java.util.ArrayList;
    
public class RecipeList {

    private ArrayList<Recipe> recipeList;

    //constructor with no parameters, creates a new list of recipes
    public RecipeList() {
        this.recipeList = new ArrayList<>();
    }

    //add recipe to the list
    public void addRecipeToList(Recipe recipe) {
        this.recipeList.add(recipe);
    }

    //print all current recipes
    public void printAllRecipes() {
        for (Recipe recipe : this.recipeList) {
            printSingleRecipe(recipe);
        }
    }

    //print only one recipe received as argument
    public void printSingleRecipe(Recipe recipe) {
        System.out.println(recipe.getName() + ", cooking time: " + recipe.getTime());
    }

    //searches and print recipe by name passed
    public void findRecipeByName(String word) {
        for (Recipe recipe : this.recipeList) {
            if (recipe.getName().contains(word)) {
                printSingleRecipe(recipe);
            }
        }
    }

    //searches and print recipe by cooking time passed as argument
    public void findRecipeByTime(int cookingTime) {
        for (Recipe recipe : this.recipeList) {
            if (recipe.getTime() <= cookingTime) {
                printSingleRecipe(recipe);
            }
        }
    }

    //searches and print recipe by ingredient passed as argument
    public void findRecipeByIngredient(String ingredientSearch) {
        for (Recipe recipe : this.recipeList) {
            for (String ingredient : recipe.getIngredients()){
                if (ingredient.equals(ingredientSearch)) {
                    printSingleRecipe(recipe);
                }
            }
        }
    }
}
