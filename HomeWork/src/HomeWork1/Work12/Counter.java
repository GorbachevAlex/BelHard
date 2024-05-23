package HomeWork1.Work12;

import java.util.Scanner;

/*4.	Даны два целых числа A и B (A < B). Вывести в порядке убывания все целые числа,
расположенные между A и B (не включая числа A и B), а также количество N этих чисел.*/
public class Counter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        while (numberB <= numberA) {
            System.out.println("Второе число должно быть больше первого\nВведи еще раз второе число");
            numberB = scanner.nextInt();
        }
        int count = 0;
        for (int i = numberB - 1; i > numberA; i--) {
            System.out.print(i + " ");
            count++;
        }
        System.out.println();
        System.out.println("количество чисел : " + count);
    }
}
