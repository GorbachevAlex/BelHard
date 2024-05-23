package HomeWork1.Work5;

import java.util.Scanner;

/*5.	Арифметические действия над числами пронумерованы следующим образом:
1 — сложение, 2 — вычитание, 3 — умножение, 4 — деление. Дан номер действия N -(целое число в диапазоне 1–4)
и вещественные числа A и B (В не равно 0). Выполнить над числами указанное действие и вывести результат.*/
public class ArithmeticOperations {
    public static void main(String[] args) {
        double result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выбери операцию:\n1 — сложение\n2 — вычитание\n3 — умножение\n4 — деление");
        int numberN = scanner.nextInt();

        while (numberN < 1 || numberN > 4) {
            System.out.println("Попробуй еще раз");
            numberN = scanner.nextInt();
        }

        System.out.println("Теперь введи 2 числа");
        double numberA = scanner.nextDouble();
        double numberB = scanner.nextDouble();
        while (numberB == 0) {
            System.out.println("Второе число не может быть 0\nВводи еще раз");
            numberB = scanner.nextDouble();
        }

        switch (numberN) {
            case 1 -> result = numberA + numberB;
            case 2 -> result = numberA - numberB;
            case 3 -> result = numberA * numberB;
            case 4 -> result = (double) numberA / numberB;
        }
        System.out.println(result);
    }
}
