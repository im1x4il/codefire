/**
 * Created by Михаил on 11.03.2017.
 */
class Pets {
    public static void main(String[] args) {
        Pet[] myPets = {
                new Dog(12,4,"Sharik"),

                new Cat(5,4,"Barsik"),

                new Parrot(4,2,"Kesha")
        };

        for (Pet p : myPets) {
            System.out.printf("'%s'\n \t.weight = %d(kg)\n \t.legs = %d(лапы) %n", p.getName(), p.getWeight() ,p.getLegs());

        }
    }
}
class Animal {
    private int weight;
    private int legs;
    public Animal(int weight, int legs) {
        this.weight = weight;
        this.legs = legs;
    }
    public int getWeight(){
        return weight;}

    public int getLegs(){
        return legs;}
}
class Pet extends Animal {
    private String name;
    public Pet(int weight,int legs, String name) {
        super(weight,legs);
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class Cat extends Pet {
    public Cat(int weight,int legs, String name) {
        super(weight,legs,name);
    }
    public void catchMouse() {
        System.out.println("Catching mice...");
    }
}
class Dog extends Pet {
    public Dog(int weight,int legs, String name) {
        super(weight,legs,name);
    }
    public void executeCommand(String command) {
        System.out.println("Doing '" + command + "'");
    }
}
class Parrot extends Pet {
    public Parrot(int weight,int legs, String name) {
        super(weight,legs, name);
    }
    public void canfly() {
        System.out.println("Catching mice...");
    }
}
