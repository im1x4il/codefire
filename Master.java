/**
 * Created by Михаил on 09.03.2017.
 */
public class Master {
    private String name;
    private String surname;
    private int phoneNumber;

    public Master(String name, String surname, int phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;}

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
}
