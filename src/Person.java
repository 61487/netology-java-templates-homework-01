import java.util.Objects;

public class Person {

    private final String name;
    private final String surname;
    private int age;
    private boolean ageSet;
    private String city;
    private boolean citySet;


    Person(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;

        if (age != 0) {
            this.age = age;
            ageSet = true;
        }
        if (city != null) {
            this.city = city;
            citySet = true;
        }
    }

    public void happyBirthday() {
        if (ageSet) age++;
    }

    public boolean hasAge() {
        return ageSet;
    }

    public boolean hasCity() {
        return citySet;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(this.surname)
                .setAge(0)
                .setCity(this.city);
    }
}
