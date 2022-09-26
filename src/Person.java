public class Person {
    private String name, surname, patronymic;
    private boolean isOnlyName;

    public Person(String name, String surname, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.isOnlyName = false;
    }

    public Person(String name) {
        this.name = name;
        this.isOnlyName = true;
    }
    @Override
    public String toString() {
        if (isOnlyName) return name;
        return surname + " " + name.charAt(0) + '.' + patronymic.charAt(0);
    }

}
