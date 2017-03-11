/**
 * Created by Михаил on 11.03.2017.
 */
class Dog extends Pet {
    public Dog(int weight, int legs, String name, Kind kind, String Master_Name, String Master_Surname, int Master_Phone_Number ) {
        super(weight,legs,name,kind,Master_Name,Master_Surname, Master_Phone_Number);}

    public void executeCommand(String command) {
        System.out.println("Doing '" + command + "'");
    }

}
