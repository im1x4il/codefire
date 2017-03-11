/**
 * Created by Михаил on 11.03.2017.
 */
class Cat extends Pet {
    public Cat(int weight, int legs, String name, Kind kind, String Master_Name, String Master_Surname, int Master_Phone_Number ) {
        super(weight,legs,name,kind,Master_Name,Master_Surname, Master_Phone_Number);
    }
    public void catchMouse() {
        System.out.println("Catching mice...");
    }
}

