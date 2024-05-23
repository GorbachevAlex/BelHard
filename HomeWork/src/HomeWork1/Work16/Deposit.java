package HomeWork1.Work16;

import java.util.Scanner;

/*8.	Начальный вклад в банке равен 1000 руб. Через каждый месяц размер вклада увеличивается
на P процентов от имеющейся суммы (P — вещественное число, 0<P< 25).
По данному P определить, через сколько месяцев размер вклада превысит 1100 руб.,
и вывести найденное количество месяцев K (целое число) и итоговый размер вклада S (вещественное число).*/
public class Deposit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double initialDeposit = 1000;
        int month = 0;
        double percent  = sc.nextDouble();
        while (percent <= 0 || percent >= 25) {
            System.out.println("Процентная ставка не может быть меньше 0 или больше 25 %");
            System.out.println("Введи еще раз");
            percent = sc.nextDouble();
        }

        percent /= 100;

        while (initialDeposit < 1100) {
            initialDeposit = percent  * initialDeposit + initialDeposit;
            month++;
        }
        System.out.println("Через " + month + " месяца размер вклада превысит 1100 руб\n" +
                "Итоговый размер вклада составит " + initialDeposit);
    }
}
