package HomeWork4.Work1;

public class Phone {
    private String model;
    private int number;
    private int weight;

    Phone() {
    }

    Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }


    void printValues() {
        System.out.println("Модель: " + model + "\nНомер: " + number + "\nМасса: " + weight);
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }
    void receiveCall(String name, int number) {
        System.out.println("Звонит " + name + "\nНомер телефона " + number);
    }

    int getNumber() {
        return number;
    }
    void sendMessage (int ... numberPhone) {
        for (int number : numberPhone) {
            System.out.println("Сообщение отправлено на номер: " + number);
        }
    }
}
