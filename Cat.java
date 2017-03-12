/**
 * Created by Михаил on 11.03.2017.
 */
class Cat extends Pet {
    public Cat(int weight, int legs, String name, Kind kind, Master master ) {
        super(weight,legs,name,kind,master);
    }
    public void catchMouse() {
        System.out.println("Catching mice...");
    }
}

