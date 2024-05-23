package HomeWork1.Work9;
/*1.	Распечатать произвольное количество строк: “Task1”. “Task2”. …. Используем цикл while*/
import java.util.Scanner;

public class PrintString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        int i = 1;
        while ( i <= quantity) {
            System.out.print("Task" + i+".");
            i++;
        }
    }
}
