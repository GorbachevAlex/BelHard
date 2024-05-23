package HomeWork6.Work3.com.company.professions;

public class Driver {
    private String name;
    private String lastName;
    private int experience;

    public Driver(String name, String lastName, int experience) {
        this.name = name;
        this.lastName = lastName;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Имя='" + name + '\'' +
                ", Фамилия='" + lastName + '\'' +
                ", стаж вождения=" + experience + " лет";
    }
}
