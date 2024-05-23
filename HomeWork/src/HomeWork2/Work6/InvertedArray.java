package HomeWork2.Work6;

import java.util.Arrays;
import java.util.Scanner;

/*6.	Создайте массив из N случайных целых чисел из отрезка [A;B], числа N, A и B вводятся с клавиатуры.
Выведите массив на экран, после чего инвертируйте его и выведите уже инвертрованный массив*/
public class InvertedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи размер массива");
        int arraySize = sc.nextInt();

        System.out.println("Введи нижний диапазон значения массива");
        int lowerValues = sc.nextInt();

        System.out.println("Введи верхний диапазон значения массива");
        int upperValues = sc.nextInt();

        int[] array = new int[arraySize];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (upperValues + 1 - lowerValues)) - lowerValues;
        }

        System.out.println("Заполненный массив");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("Инвертированный массив");

        for (int i = array.length - 1; i >= 0 ; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
