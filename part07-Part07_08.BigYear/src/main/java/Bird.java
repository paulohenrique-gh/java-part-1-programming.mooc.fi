
public class Bird {
    private String name;
    private String latinName;
    private int observationCount;

    //constructor
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }

    //getter for name
    public String getName() {
        return this.name;
    }

    //setter for name
    public void setName(String name) {
        this.name = name;
    }
    
    //getter for latinName
    public String getLatinName() {
        return this.latinName;
    }

    //setter for latinName
    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    //getter for observationCount
    public int getObservationCount() {
        return this.observationCount;
    }

    //setter for observationCount
    public void setObservationCount() {
        this.observationCount++;
    }

    //generate string
    @Override
    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.observationCount + " observations";
    }
}
