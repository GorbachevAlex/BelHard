package HomeWork1.Work7;

import java.util.Scanner;

/*7.	Даны два целых числа: D (день) и M (месяц), определяющие правильную дату.
Вывести знак Зодиака, соответствующий этой дате: «Водолей» (20.1–18.2),
«Рыбы» (19.2–20.3), «Овен» (21.3–19.4), «Телец» (20.4–20.5), «Близнецы» (21.5–20.6), «Рак»(21.6-22.7),
«Лев» (23.7–22.8), «Дева» (23.8–22.9), «Весы» (23.9–22.10), «Скорпион» (23.10–21.11),
«Стрелец» (22.11–21.12), «Козерог» (22.12–19.1)*/
public class ZodiacSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи день своего рождения");
        int day = scanner.nextInt();
        while (day <= 0 || day >= 32) {
            System.out.println("Нет такого дня в месяце\nВведи день своего рождения");
            day = scanner.nextInt();
        }

        System.out.println("Введи месяц своего рождения");
        int month = scanner.nextInt();

        switch (month) {

            case 1 -> {
                if (day >= 1 && day <= 19) {
                    System.out.println("Козерог");
                }
                if (day >= 20 && day <= 31) {
                    System.out.println("Водолей");
                }
            }

            case 2 -> {
                if (day >= 1 && day <= 18) {
                    System.out.println("Водолей");
                }
                if (day >= 19 && day <= 29) {
                    System.out.println("Рыбы");
                }
            }

            case 3 -> {
                if (day >= 1 && day <= 20) {
                    System.out.println("Рыбы");
                }
                if (day >= 21 && day <= 31) {
                    System.out.println("Овен");
                }
            }

            case 4 -> {
                if (day >= 1 && day <= 19) {
                    System.out.println("Овен");
                }
                if (day >= 20 && day <= 30) {
                    System.out.println("Телец");
                }
            }

            case 5 -> {
                if (day >= 1 && day <= 20) {
                    System.out.println("Телец");
                }
                if (day >= 21 && day <= 31) {
                    System.out.println("Близнецы");
                }
            }

            case 6 -> {
                if (day >= 1 && day <= 20) {
                    System.out.println("Близнецы");
                }
                if (day >= 21 && day <= 30) {
                    System.out.println("Рак");
                }
            }

            case 7 -> {
                if (day >= 1 && day <= 22) {
                    System.out.println("Рак");
                }
                if (day >= 23 && day <= 31) {
                    System.out.println("Лев");
                }
            }

            case 8 -> {
                if (day >= 1 && day <= 22) {
                    System.out.println("Лев");
                }
                if (day >= 23 && day <= 31) {
                    System.out.println("Дева");
                }
            }

            case 9 -> {
                if (day >= 1 && day <= 22) {
                    System.out.println("Дева");
                }
                if (day >= 23 && day <= 30) {
                    System.out.println("Весы");
                }
            }

            case 10 -> {
                if (day >= 1 && day <= 22) {
                    System.out.println("Весы");
                }
                if (day >= 23 && day <= 31) {
                    System.out.println("Скорпион");
                }
            }

            case 11 -> {
                if (day >= 1 && day <= 21) {
                    System.out.println("Скорпион");
                }
                if (day >= 22 && day <= 30) {
                    System.out.println("Стрелец");
                }
            }

            case 12 -> {
                if (day >= 1 && day <= 21) {
                    System.out.println("Стрелец");
                }
                if (day >= 22 && day <= 31) {
                    System.out.println("Козерог");
                }
            }

            default -> System.out.println("Нет такого знака зодиака");
        }
    }
}
