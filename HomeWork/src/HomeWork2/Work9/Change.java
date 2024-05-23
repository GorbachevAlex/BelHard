package HomeWork2.Work9;

import java.util.Scanner;

/*2.	С клавиатуры вводится любая строка. Если она пустая, выводится сообщение с просьбой повторить ввод.
Далее с клавиатуры вводятся два символа (a и b), после чего нужно вывести строку, в которой все символы a
нужно заменить на символы b. Пример: срока – «Java 11», символы «1» и «H», результат «Java HH»*/
public class Change {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введи строку");
        String inputStr = sc.nextLine();

        while (inputStr.isEmpty()) {
            System.out.println("Повтори ввод");
            inputStr = sc.nextLine();
        }

        System.out.println("Введи символ, который меняем");
        char inputA = sc.nextLine().charAt(0);
        System.out.println("Введи символ, на который меняем");
        char inputB = sc.nextLine().charAt(0);
        System.out.println(inputStr.replace(inputA, inputB));

    }
}
