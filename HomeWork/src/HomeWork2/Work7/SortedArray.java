package HomeWork2.Work7;

import java.util.Arrays;
import java.util.Scanner;

/*7.	Создайте массив из N случайных целых чисел из отрезка [A;B], числа N, A и B вводятся с клавиатуры.
Отсортировать массив любым алгоритмом. Вывести массив на экран, после чего ввести с клавиатуры число k,
найти индекс этого числа в массиве сперва линейным поиском, потом двоичным и вывести на экран этот индекс,
если число есть в массиве, и количество «шагов», которое каждый алгоритм потратил на выполнение задачи.
Например:
Введите размер массива
9
Введите нижний диапазон
0
Введите верхний диапазон
10
Массив: 1, 2, 2, 3, 5, 6, 7, 8, 8
Введите искомое значение
3
Индекс элемента: 3
Линейный поиск: 4 шаг(-а)(-ов)
Двоичный поиск: 3 шаг(-а)(-ов)
*/
public class SortedArray {
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

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        System.out.println("Введи искомое значение");
        int inputNumber = sc.nextInt();
        System.out.println("Индекс элемента " + inputNumber);

        int indexLineSearch = getIndexLineSearch(array, inputNumber);
        if (indexLineSearch == -1) {
            System.out.println("Линейный поиск: нет такого значения");
        } else {
            System.out.println("Линейный поиск: " + indexLineSearch + " шаг");
        }

        int indexDoubleSearch = getIndexDoubleSearch(array, inputNumber);
        if (indexDoubleSearch == -1) {
            System.out.println("Двоичный поиск: нет такого значения");
        } else {
            System.out.println("Двоичный поиск: " + indexDoubleSearch + " шаг");
        }
    }

    public static int getIndexLineSearch(int[] array, int inputNumber) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (inputNumber == array[i]) {
                return count;
            }
            count++;
        }
        return -1;
    }

    public static int getIndexDoubleSearch(int[] array, int inputNumber) {
        int count = 0;
        int firstIndex = 0;
        int lastIndex = array.length - 1;

        while (firstIndex <= lastIndex) {

            int middleIndex = (firstIndex + lastIndex) / 2;

            if (array[middleIndex] == inputNumber) {
                return count;
            } else if (array[middleIndex] < inputNumber)
                firstIndex = middleIndex + 1;
            else if (array[middleIndex] > inputNumber)
                lastIndex = middleIndex - 1;
            count++;
        }
        return -1;
    }
}
