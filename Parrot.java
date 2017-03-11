/**
 * Created by Михаил on 11.03.2017.
 */
class Parrot extends Pet {
    public Parrot(int weight, int legs, String name, Kind kind, String Master_Name, String Master_Surname, int Master_Phone_Number ) {
        super(weight,legs,name,kind,Master_Name,Master_Surname, Master_Phone_Number);
            }
    public void canfly() {
            System.out.println("Catching mice...");
    }
}