
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {

        //create scanner for user input
        Scanner scan = new Scanner(System.in);

        //ask user for file name and store in the variable "file"
        System.out.println("File:");
        String file = scan.nextLine();

        //ask user for team name and store it in the variable "team"
        System.out.println("Team:");
        String team = scan.nextLine();

        //create new scanner for reading files, passing the previous
        //input of the user that was stored in the variable "file"
        //as an argument
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            
            //variables for counting games, wins and losses
            int games = 0;
            int wins = 0;
            int losses = 0;

            //loop for iterating through each line of the csv file
            while (fileReader.hasNextLine()) {

                //create variable "row" to store the content of each line of the document
                String row = fileReader.nextLine();
              
                //create array to split the data in each line of the CSV
                //and store the pieces of data in a separate index of the array.
                //they're going to be used for comparison next
                String[] data = row.split(",");
                String homeTeam = data[0];
                String visitingTeam = data[1];
                int homeScore = Integer.valueOf(data[2]);
                int visitingScore = Integer.valueOf(data[3]);

                //check if the row being iterated has the name of the team.
                //if it does, the variable "games" is incremented by 1.
                if (row.contains(team)) {
                    games++;
                }

                //if the team informed by the user is the same as the one
                //store in the variable "homeTeam", then the program checks whether
                //their score was greater or less than the other team's,
                //and increments the variables "wins" or "losses" accordingly
                if (homeTeam.equals(team)) {
                    if (homeScore > visitingScore) {
                        wins++;
                    } else {
                        losses++;
                    }
                }

                //same process as the one above, but in this case the team
                //informed by the user is the same as the one stored in "visitingTeam"
                if (visitingTeam.equals(team)) {
                    if (visitingScore > homeScore) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }

            //print the result
            System.out.println("Games: " + games);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
