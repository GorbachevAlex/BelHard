package HomeWork6.Work1;

/*
 * Создать программу, которая реализует работу поликлиники. В программе должна быть иерархия
 * классов для животных: абстрактный класс Animal в качестве родителя, классы Cat, Dog, Rat в качестве наследников.
 * В класс Animal добавить поля name (кличка питомца) и age (возраст питомца) и геттеры с сеттерами для них,
 * добавить абстрактный метод makeNoise(), который в последствии реализовать во всех наследниках и который
 * должен выводить на экран сообщения, подобающие каждому животному (у котов Мяу, у собак Гав и тд)
 */
abstract class Animal {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void makeNoise() {
        System.out.println("Животное делает шум");
    }
}
