

import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeGenerator {

    public RecipeGenerator() {

    }

    public RecipeList generate(String file) {

        RecipeList recipeList = new RecipeList();
        
        try (Scanner scanner = new Scanner(Paths.get(file))) {

            while (scanner.hasNextLine()) {

                //variable with empty string
                String recipeString = "";

                //read next line until there's an empty line, add each line read to empty string,
                //the "\n" creates a line break to make it easier to split the string later
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    if (line.isEmpty()) {
                        break;
                    }
                    recipeString += line + "\n";
                }

                //declare new variables: an array of strings to store each line in a separate index
                //of the array returned by the split method                
                String[] recipeArray = recipeString.split("\n");
                //then we create the variables to pass to the recipe object later:
                //name: takes the first element of the array, which was the first line of the recipe
                String name = recipeArray[0];
                //time: takes the second element of the 
                int time = Integer.valueOf(recipeArray[1]);
                //ingredients: an array of strings to store the next lines of the recipe in it's own space
                ArrayList<String> ingredients = new ArrayList<>();
                for (int i = 2; i < recipeArray.length; i++) {
                    ingredients.add(recipeArray[i]);
                }

                //create new object of the class recipe, which uses the previously created variables as arguments
                Recipe recipe = new Recipe(name, time, ingredients);

                //create new object of the class recipeList, which will store the entire recipe that will be used later
                recipeList.addRecipeToList(recipe);
            }
        } catch (Exception e) {
            System.err.println("Erro de entrada/saída: " + e.getMessage());
        }
        return recipeList; 
    }
}