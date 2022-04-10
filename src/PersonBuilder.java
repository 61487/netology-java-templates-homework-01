public class PersonBuilder {

    private String name;
    private String surname;
    private int age;
    private String city;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public Person build() {
        if (name == null || surname == null) throw new IllegalStateException("Отсутствует имя и\\или фамилия");
        if (age < 0 || age > 150) throw new IllegalArgumentException("Неверно указан возраст");
        return new Person(name, surname, age, city);
    }
}
