package HomeWork1.Work13;

import java.util.Scanner;

/*5.	Даны положительные числа A и B (A > B). На отрезке длины A размещено максимально
возможное количество отрезков длины B (без наложений). Не используя операции умножения и деления,
найти длину незанятой части отрезка A.*/
public class LengthSegment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        int result = numberA % numberB;
        System.out.println(result);
    }
}
