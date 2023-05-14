import java.util.Scanner;

public class UserInterface {
    
    Scanner scanner;
    RecipeList recipeList;
    
    public UserInterface(Scanner scanner, RecipeList recipeList) {
        this.scanner = scanner;
        this.recipeList = recipeList;
    }

    //start the main menu
    public void start() {
        System.out.println("Comands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
        proccessCommand();
    }

    //handles user input and call other methods according to it
    public void proccessCommand() {
        while(true) {     
            System.out.print("Enter command: ");       
            String command = scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {
                optionList();
            }

            if (command.equals("find name")) {
                optionFindName();
            }

            if (command.equals("find cooking time")) {
                optionFindCookingTime();
            }

            if (command.equals("find ingredient")) {
                optionFindIngredient();
            }
        }
    }

    //handles command "list"
    private void optionList() {
        System.out.println("Recipes: ");

        recipeList.printAllRecipes();

        System.out.println("");
    }

    //handles command "find name"
    private void optionFindName() {
        System.out.print("Searched word: ");
        String word = scanner.nextLine();
        System.out.println("");
        System.out.println("Recipes: ");

        recipeList.findRecipeByName(word);

        System.out.println("");
    }
    
    //handles command "find cooking time"
    private void optionFindCookingTime() {
        System.out.print("Max cooking time: ");
        int cookingTime = Integer.valueOf(scanner.nextLine());
        System.out.println("");
        System.out.println("Recipes: ");

        recipeList.findRecipeByTime(cookingTime);

        System.out.println("");
    }

    //handles command "find ingredient"
    private void optionFindIngredient() {
        System.out.print("Ingredient: ");
        String ingredientSearch = scanner.nextLine();
        System.out.println("");
        System.out.println("Recipes: ");

        recipeList.findRecipeByIngredient(ingredientSearch);

        System.out.println("");
    }
}
