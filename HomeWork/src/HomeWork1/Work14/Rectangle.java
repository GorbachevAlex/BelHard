package HomeWork1.Work14;

import java.util.Scanner;

/*6.	Даны положительные числа A, B, C. На прямоугольнике размера A × B
размещено максимально возможное количество квадратов со стороной C (без наложений).
Найти количество квадратов, размещенных на прямоугольнике.*/
public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sideA = scanner.nextInt();
        int sideB = scanner.nextInt();
        int sideC = scanner.nextInt();
        int result = (sideA * sideB) / (sideC * sideC);
        System.out.println(result);
    }
}
