package HomeWork6.Work3.com.company;

import HomeWork6.Work3.com.company.details.Engine;
import HomeWork6.Work3.com.company.professions.Driver;
import HomeWork6.Work3.com.company.vehicles.Car;
import HomeWork6.Work3.com.company.vehicles.Lorry;
import HomeWork6.Work3.com.company.vehicles.SportCar;

/*
 * 1.	Создать класс Car в пакете com.company.vehicles, Engine в пакете com.company.details и Driver в
 * пакете com.company.professions.
 * 2.	Класс Driver содержит поля - ФИО, стаж вождения.
 * 3.	Класс Engine содержит поля - мощность, производитель.
 * 4.	Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа Driver,
 * мотор типа Engine. Методы start(), stop(), turnRight(), turnLeft(), которые выводят на печать: "Поехали",
 * "Останавливаемся", "Поворот направо" или "Поворот налево". А также метод toString(), который выводит полную
 * информацию об автомобиле, ее водителе и моторе.
 * 5.	Создать производный от Car класс - Lorry (грузовик), характеризуемый также грузоподъемностью кузова.
 * 6.	Создать производный от Car класс - SportCar, характеризуемый также предельной скоростью
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Nissan", "легковой", 3,
                new Driver("Alex","Gorbachev", 5),
                new Engine(200, "Germany"));
        Car lorry = new Lorry("Toyota", "грузовик", 10,
                new Driver("Misha", "Rich", 1),
                new Engine(120, "Belarus"), 200);
        Car sportCar = new SportCar("Lamborghini", "Спорт", 2.4,
                new Driver("Alena", "Sokolovskaya", 3),
                new Engine(400, "Italy"), 500);
        System.out.println(car.toString());
        System.out.println(lorry.toString());
        System.out.println(sportCar.toString());
        sportCar.start();
        sportCar.turnRight();
        sportCar.turnLeft();
        sportCar.stop();
    }
}
