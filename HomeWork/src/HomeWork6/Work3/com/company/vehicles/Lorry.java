package HomeWork6.Work3.com.company.vehicles;

import HomeWork6.Work3.com.company.details.Engine;
import HomeWork6.Work3.com.company.professions.Driver;

public class Lorry extends Car{
    private int carrying;

    public Lorry(String carModel, String carClass, double weight, Driver driver, Engine engine, int carrying) {
        super(carModel, carClass, weight, driver, engine);
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return super.toString() +
                "грузоподъемность=" + carrying;
    }
}
