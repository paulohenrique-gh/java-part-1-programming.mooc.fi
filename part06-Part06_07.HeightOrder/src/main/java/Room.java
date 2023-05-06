import java.util.ArrayList;

public class Room {
    ArrayList<Person> persons;
    
    public Room() {
        this.persons = new ArrayList<Person>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        return this.persons.isEmpty(); 
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;
        }

        Person shortest = this.persons.get(0);

        for (Person person : this.persons) {
            if (person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }
        }

        return shortest;
    }

    public Person take() {
        if (this.persons.isEmpty()) {
            return null;
        }

        return this.persons.remove(this.persons.indexOf(shortest()));    
    }
}
