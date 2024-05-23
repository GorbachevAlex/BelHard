package HomeWork1.Work8;

import java.util.Scanner;

/*8.	Мастям игральных карт присвоены порядковые номера: 1 — пики, 2 — трефы, 3 — бубны, 4 — червы.
Достоинству карт, старших десятки, присвоены номера: 11 — валет, 12 — дама, 13 — король, 14 — туз.
Даны два целых числа: N — достоинство (6 ≤ N ≤ 14) и M — масть карты (1 ≤ M ≤ 4).
Вывести название соответствующей карты вида «шестерка бубен», «дама червей», «туз треф» и т. п.*/
public class PlayingCards {
    public static void main(String[] args) {
        String numberString;
        String suitString;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи номер карты от 6 до 14");
        int number = scanner.nextInt();
        System.out.println("Введи масть карты:\n1 - пики\n2 - трефы\n3 - бубны\n4 - червы");
        int suit = scanner.nextInt();
        switch (number) {
            case 6 -> numberString = "шестерка";
            case 7 -> numberString = "семерка";
            case 8 -> numberString = "восьмерка";
            case 9 -> numberString = "девятка";
            case 10 -> numberString = "десятка";
            case 11 -> numberString = "валет";
            case 12 -> numberString = "дама";
            case 13 -> numberString = "король";
            case 14 -> numberString = "туз";
            default -> numberString = "Нет такой карты";
        }

        switch (suit) {
            case 1 -> suitString = "пик";
            case 2 -> suitString = "треф";
            case 3 -> suitString = "бубен";
            case 4 -> suitString = "червей";
            default -> suitString = "Нет такой масти";
        }
        System.out.println(numberString + " " + suitString);
    }
}
