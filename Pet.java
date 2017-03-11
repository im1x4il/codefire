/**
 * Created by Михаил on 11.03.2017.
 */
class Pet extends Animal {
    private String name;
    private String Master_Name;
    private String Master_Surname;
    private int Master_Phone_Number;

    public Pet(int weight, int legs, String name, Kind kind, String Master_Name, String Master_Surname, int Master_Phone_Number) {
        super(weight, legs, kind);
        this.name = name;
        this.Master_Name = Master_Name;
        this.Master_Surname = Master_Surname;
        this.Master_Phone_Number = Master_Phone_Number;
    }
    public String getName() {
        return name;
    }
    public String getMaster_Name() {
        return Master_Name;
    }
    public String getMaster_Surname() {
        return Master_Surname;
    }
    public int getPhoneNumber() {
        return Master_Phone_Number;
    }

}