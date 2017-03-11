/**
 * Created by Михаил on 11.03.2017.
 */
class Animal {

    enum Kind { amphibia, natatorial, flying}

    private int weight;
    private int legs;
    private Kind kind;

    public Animal(int weight, int legs, Kind kind) {
        this.weight = weight;
        this.legs = legs;
        this.kind = kind;

    }
    public int getWeight(){
        return weight;}

    public int getLegs(){
        return legs;}

    public Kind getKind(){
        return kind;}
}