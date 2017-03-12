/**
 * Created by Михаил on 09.03.2017.
 */

public class Pets {
    public static void main(String[] args) {
        Pet[] myPets = {
                new Dog(12,4,"hkljno", Animal.Kind.natatorial,new Master("dsgs","ssefsef",584646)),
                new Cat(5,4,"Barsik", Animal.Kind.natatorial,new Master("esrsefs","gdggg",48446464)),
                new Parrot(2,2,"Kesha", Animal.Kind.flying,new Master("tdgdgd","gdgdgdg",544564))
        };

        for (Pet p : myPets) {
            System.out.printf("'%s'\n \t.weight = %d(kg)\n \t.legs = %d(лапы)\n \t.kind =%s(вид)\n \t.master phone number=%d %n", p.getName(), p.getWeight() ,p.getLegs(),p.getKind(),p.getPhoneNumber());

        }
    }


}










