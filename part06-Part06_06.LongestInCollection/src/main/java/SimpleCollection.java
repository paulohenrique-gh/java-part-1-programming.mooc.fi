
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest() {
        
        //validate if array is empty, if true, return null
        if(this.elements.isEmpty()) {
            return null;
        }

        //create variable to store the first element of the array
        String longest = this.elements.get(0);

        //loop for checking every element of the array
        for (String element : this.elements) {
            //check if current element being iterated has greater length
            //than the one stored in longest, if true, longest is assigned
            //the new longest element
            if (element.length() > longest.length()) {
                longest = element;
            }
        }

        return longest;
    }
}
