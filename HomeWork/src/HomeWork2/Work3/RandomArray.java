package HomeWork2.Work3;

import java.util.Arrays;
import java.util.Scanner;

/*3.	Создайте массив из N случайных целых чисел из отрезка [A;B], числа N, A и B
вводятся с клавиатуры. Определите какой элемент является в этом массиве максимальным и сообщите его индекс*/
public class RandomArray {
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

        int index = 0;
        int maxElement = array[0];

        for (int i = 1; i < array.length - 1; i++) {
            if (maxElement < array[i]) {
                maxElement = array[i];
                index = i;
            }
        }

        System.out.println("Массив " + Arrays.toString(array));
        System.out.println("Максимальный элемент массива: " + maxElement);
        System.out.println("Индекс максимального элемента " + index);
    }
}
