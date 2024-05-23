package HomeWork1.Work2;

import java.util.Scanner;

/*2.	Создать программу, в которой проинициализировать переменную типа int,
после чего вывести на экран день недели, соответствующий этому числу
(1 – понедельник, 3 – среда и тд), если такого дня нет, вывести надпись, что такого дня нет.
Сделать реализацию через if-else и через switch*/
public class DayOfTheWeek {
    public static void main(String[] args) {
        System.out.println("Enter the day of the week");

        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("There is no such day of the week");
        }
    }
}
