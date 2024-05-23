package HomeWork1.Work15;

import java.sql.SQLOutput;
import java.util.Scanner;

/*7.	Дано целое число N (> 0). С помощью операций деления нацело и взятия остатка от деления:
определить имеется ли в записи числа N цифра «2»; найти число, полученное при прочтении числа N
справа налево; найти количество и сумму его цифр. Использовать можно любое количество циклов,
но чем меньше, тем лучше*/
public class CountAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        int x = inputNumber;
        int y = inputNumber;
        int number2 = 0;
        int count = 0;
        int sum = 0;
        String result = "В числе нет цифры 2";
        while (x % 10 != 0) {
            x /= 10;
            count++;
        }
        for (int i = 0; i < count; i++) {
            number2 *= 10;
            number2 += inputNumber % 10;
            inputNumber /= 10;

        }
        for (int i = 0; i < count; i++) {
            if (y %10 == 2) {
                result = "В числе есть цифра 2";
            }
            sum += y % 10;
            y /= 10;

        }
        System.out.println("Число справа налево: " + number2);
        System.out.println("Количество цифр: " + count);
        System.out.println("Сумма цифр числа: " + sum);
        System.out.println(result);
    }
}
