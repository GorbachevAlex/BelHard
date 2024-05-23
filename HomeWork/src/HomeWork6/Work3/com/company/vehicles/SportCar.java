package HomeWork6.Work3.com.company.vehicles;

import HomeWork6.Work3.com.company.details.Engine;
import HomeWork6.Work3.com.company.professions.Driver;

public class SportCar extends Car {
   private int maxSpeed;

    public SportCar(String carModel, String carClass, double weight, Driver driver, Engine engine, int maxSpeed) {
        super(carModel, carClass, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return super.toString() +
                "максимальная скорость=" + maxSpeed;
    }
}
