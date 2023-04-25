
import java.util.Scanner;
	 
	public class Main {
	 
	    public static void main(String[] args) {
	        // Test your Film class here
	 
	        Film saw = new Film("Saw", 18);
	 
	        Scanner reader = new Scanner(System.in);
	 
	        System.out.println("How old are you");
	        int age = Integer.valueOf(reader.nextLine());
	 
	        System.out.println();
	        if (age >= saw.ageRating()) {
	            System.out.println("You may watch the film " + saw.name());
	        } else {
	            System.out.println("You may not watch the film " + saw.name());
	        }
	    }
	}
