package HomeWork6.Work3.com.company.vehicles;

import HomeWork6.Work3.com.company.details.Engine;
import HomeWork6.Work3.com.company.professions.Driver;

public class Car {
    private String carModel;
    private String carClass;
    private double weight;

    private Driver driver;
    private Engine engine;
    public Car(){

    }
    public Car(String carModel, String carClass, double weight, Driver driver, Engine engine) {
        this.carModel = carModel;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Автомобиль{" +
                "модель='" + carModel +
                ", класс='" + carClass +
                ", масса=" + weight + " тонн"+
                ", водитель: " + driver +
                ", двигатель=" + engine +
                '}';
    }
}
