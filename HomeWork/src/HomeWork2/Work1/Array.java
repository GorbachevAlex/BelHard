package HomeWork2.Work1;

import java.util.Arrays;

/*1.	Создайте массив из 4 случайных целых чисел из отрезка [10;99],
выведите его на экран в строку. Определить и вывести на экран сообщение о том,
является ли массив строго возрастающей последовательностью*/
public class Array {
    public static void main(String[] args) {
        String result = "Масси в строго возрастающей последовательности";
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 90 + 10);
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                result = "Массив не в строго возрастающей последовательности";
                break;
            }
        }
        System.out.println(result);
    }
}
