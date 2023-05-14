

import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {

        String file = "";
        
        try (Scanner inputReader = new Scanner(System.in)) {
            System.out.print("File to read: ");
            file = inputReader.nextLine();
            System.out.println("");
            
            RecipeGenerator recipeGenerator = new RecipeGenerator();

            RecipeList recipeList = recipeGenerator.generate(file);

            UserInterface ui = new UserInterface(inputReader, recipeList);

            ui.start();

        } catch (Exception e) {
            System.err.println("Erro de entrada/saída: " + e.getMessage());
        }
    }
}
