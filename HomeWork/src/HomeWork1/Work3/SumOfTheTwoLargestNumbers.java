package HomeWork1.Work3;

import java.util.Scanner;

/*3.	Даны три числа, каждое в своей переменной. Найти сумму двух наибольших из них*/
public class SumOfTheTwoLargestNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();
        int result = 0;
        if (numberOne >= numberTwo && numberTwo >= numberThree) {
            result = numberOne + numberTwo;
        }
        if (numberOne <= numberTwo && numberTwo <= numberThree) {
            result = numberTwo + numberThree;
        }
        if (numberOne >= numberTwo && numberTwo <=numberThree) {
            result = numberOne + numberThree;
        }
        if (numberOne <=numberTwo && numberTwo >= numberThree) {
            result = numberTwo + (numberOne > numberThree ? numberOne : numberThree);
        }
        System.out.println(result);
    }
}
