package HomeWork2.Work2;

import java.util.Arrays;
import java.util.Scanner;

/*2.	Попросить пользователя ввести с клавиатуры сперва размер массива,
потом нижний диапазон значений и верхний. После чего создать массив размером,
который ввел пользователь и заполнить его случайными числами из диапазона, введенного пользователем.
Если пользователь ввел неверные значения (отрицательный размер массива,
нижняя граница диапазона больше верхнего и т.д.) попросить его ввести значение ещё раз и
перезаписать старое значение новым. Вывести массив на экран (Для этого удобнее пользоваться не println, а print)*/
public class InputArraySize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи размер массива");

        int sizeArray = sc.nextInt();

        while (sizeArray < 0) {
            System.out.println("Размер массива не может быть меньше 0\nВведи размер массива");
            sizeArray = sc.nextInt();
        }

        System.out.println("Введи нижний диапазон значения массива");
        int lowerValues = sc.nextInt();

        System.out.println("Введи верхний диапазон значения массива");
        int upperValues = sc.nextInt();

        while (lowerValues > upperValues) {
            System.out.println("Нижний диапазон не может быть больше верхнего\n" +
                    "Введи верхний диапазон значения массива");
            upperValues = sc.nextInt();
        }

        int [] array = new int[sizeArray];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (upperValues + 1 - lowerValues)) + lowerValues;
        }
        System.out.println(Arrays.toString(array));
    }
}
