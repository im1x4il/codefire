/**
 * Created by Михаил on 11.03.2017.
 */
class Dog extends Pet {
    public Dog(int weight, int legs, String name, Kind kind, Master master ) {
        super(weight,legs,name,kind, master);}

    public void executeCommand(String command) {
        System.out.println("Doing '" + command + "'");
    }

}
