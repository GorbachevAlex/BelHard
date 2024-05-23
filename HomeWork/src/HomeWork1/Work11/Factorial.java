package HomeWork1.Work11;

import java.util.Scanner;

/*3.	Реализовать подсчет факториала используя цикл for. Результат вывести на экран
* факториал числа 5 = 1*2*3*4*5 = 120*/
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}
