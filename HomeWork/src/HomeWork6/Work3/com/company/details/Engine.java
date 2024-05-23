package HomeWork6.Work3.com.company.details;

public class Engine {
   private int power;
    private  String manufacturer;

    public Engine(int power, String manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "мощность=" + power +
                ",производитель='" + manufacturer;
    }
}
