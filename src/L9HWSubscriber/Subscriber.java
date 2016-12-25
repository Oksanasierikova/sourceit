package L9HWSubscriber;

/**
 * Created by P-C on 25.12.2016.
 */
public class Subscriber {
    String  phoneNumber;
    String surname;
    String name;
    String patronymic;
    String address;

    public Subscriber(String phoneNumber, String surname, String name, String patronymic, String address) {
        this.phoneNumber = phoneNumber;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "phoneNumber=" + phoneNumber +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
