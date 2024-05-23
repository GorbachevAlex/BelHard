package HomeWork1.Work6;

import java.util.Scanner;

/*6.	Дано целое число, лежащее в диапазоне 0–999. Вывести строку-описание этого числа.
Строку-описание вида «четное двузначное число», «нечетное трехзначное число» и т. д.*/
public class DescriptionString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи число от 0 до 999");
        int number = scanner.nextInt();
        while (number < 0 || number > 999) {
            System.out.println("Введи число от 0 до 999");
            number = scanner.nextInt();
        }

        if (number <= 9 && number >= 0) {
            if (number % 2 == 0) {
                System.out.println("Четное однозначное число");
            } else {
                System.out.println("Нечетное однозначное число");
            }
        }

        if (number >= 10 && number <= 99) {
            if (number % 2 == 0) {
                System.out.println("Четное двузначное число");
            } else {
                System.out.println("Нечетное двузначное число");
            }
        }

        if (number >= 100 && number <= 999) {
            if (number % 2 == 0) {
                System.out.println("Четное трехзначное число");
            } else {
                System.out.println("Нечетное трехзначное число");
            }
        }
    }
}
