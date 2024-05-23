package HomeWork2.Work4;

import java.util.Arrays;
import java.util.Scanner;

/*4.	Создайте массив из N случайных целых чисел из отрезка [A;B], числа N, A и B вводятся с клавиатуры.
Выведите массив на экран, после чего отсортируйте его с помощью сортировки «пузырьком»
и выведите уже отсортированный массив*/
public class BubbleSort {
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
            array[i] = (int) (Math.random() * (upperValues + 1 - lowerValues)) + lowerValues;
        }

        System.out.println("Заполненный массив: " + Arrays.toString(array));

        boolean flag = false;
        int value = 0;
        while (!flag) {
            flag = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    flag = false;
                    value = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = value;
                }
            }
        }

        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }
}
