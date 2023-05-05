import java.util.ArrayList;

public class Stack {

    private ArrayList<String> stack;

    //constructor
    public Stack() {
        this.stack = new ArrayList<>();
    }

    //checks if list is empty
    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

    //add items to the list
    public void add(String value) {
        this.stack.add(value);
    }

    //returns the values ​​contained in the stack as a list
    public ArrayList<String> values() {
        return this.stack;
    }

    //remove items from top of the stack
    public String take() {
        //store copy last item on the list in a new variable
        String removed = this.stack.get(this.stack.size() - 1);
        //remove last item on the list
        this.stack.remove(this.stack.size() - 1);
        //return the name of the item removed
        return removed;
    }
 
}
