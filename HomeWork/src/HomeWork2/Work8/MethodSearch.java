package HomeWork2.Work8;

import java.util.Scanner;

/*1.	Написать программу, в которой вводятся с клавиатуры сперва строка, а потом символ.
После чего в консоль выводится количество вхождений символа в строку. Например, строка «Java 11»,
символ «a», результат: 2*/
public class MethodSearch {
    public static void main(String[] args) {

        int count = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введи строку");
        char[] arrayString = sc.nextLine().toCharArray();
        System.out.println("Введи искомый символ");
        char inputChar = sc.nextLine().charAt(0);

        for (int i = 0; i < arrayString.length; i++) {
            if (inputChar == arrayString[i]) {
                count++;
            }
        }

        System.out.println("Количество искомых символов: " + count);

    }
}
