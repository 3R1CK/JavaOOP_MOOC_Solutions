
public class Reformatory {

    // private int personWeight;
    private int counter=0;

    public int weight(Person person) {
        // return the weight of the person
        int personWeight = person.getWeight();
        this.counter++;
        return personWeight;
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);        
    }

    public int totalWeightsMeasured() {

     
        return counter;
    }
}
