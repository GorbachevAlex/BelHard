package HomeWork2.Work5;

import java.util.Arrays;
import java.util.Scanner;

/*5.	Создать и проинициализировать массив из 20 элементов. Ввести с клавиатуры число n и найти,
есть ли оно в массиве, и, если есть, вывести его индекс на экран. Использовать линейный поиск*/
public class LinearSearch {

    public static void main(String[] args) {

        boolean isThereANumber = false;
        int index = 0;
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 51);
        }

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                index = i;
                isThereANumber = true;
                break;
            }
        }

        if (isThereANumber) {
            System.out.println("Число " + number + " есть в массиве.\nЕго индекс " + index);
        } else {
            System.out.println("Число " + number + " в массиве нет.");
        }
    }
}
