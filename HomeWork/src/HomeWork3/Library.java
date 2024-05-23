package HomeWork3;

import java.util.Scanner;

/*2.	Разработать цикличную программу, в которой в одном большом цикле будет предлагаться на выбор действия:
1 – Добавить нового читателя
2 – Читатель хочет взять книгу. Сперва создаётся и заполняется объект Book, потом вводится номер читательского билета.
Если такого читателя нет, пишем об этом и пропускаем итерацию (continue;). Если есть, то вызываем у него метод takeBook
3 – Читатель хочет вернуть книгу. Вводится название книги и номер билета, если такой пользователь есть, вызвать
у него метод returnBook
4 – Вывести статус читателя. Вводится номер билета, если такой есть, вызываем у него метод printStatus
5 – Вывести статусы всех читателей
6 – выйти из программы

*/
public class Library {
    public static void main(String[] args) {
        Reader[] readers = new Reader[10];
        Scanner scanner = new Scanner(System.in);
        int inputScanner;
        do {
            System.out.println("1 -- Добавить нового читателя");
            System.out.println("2 -- Читатель хочет взять книгу");
            System.out.println("3 -- Читатель хочет вернуть книгу");
            System.out.println("4 -- Вывести статус читателя");
            System.out.println("5 -- Вывести статусы всех читателей");
            System.out.println("6 -- Выйти из программы");
            inputScanner = scanner.nextInt();
            switch (inputScanner) {
                case 1 -> {
                    for (int i = 0; i < readers.length; i++) {
                        if (readers[i] == null) {
                            readers[i] = new Reader();
                            break;
                        }
                    }
                }
                case 2 -> {
                    boolean flag = false;
                    Book book = new Book();
                    System.out.println("Введи номер читательского билета");
                    int number = scanner.nextInt();
                    for (int i = 0; i < readers.length; i++) {
                        if (readers[i].getLibraryCardNumber() == number) {
                            readers[i].takeBook(book);
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        System.out.println("Нет такого читателя");
                    }
                }
                case 3 -> {
                    boolean flag = false;
                    System.out.println("Введи номер читательского билета");
                    int number = scanner.nextInt();
                    for (int i = 0; i < readers.length; i++) {
                        if (readers[i].getLibraryCardNumber() == number) {
                            readers[i].returnBook(new Book());
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        System.out.println("Нет такого читателя");
                    }
                }
                case 4 -> {
                    boolean flag = false;
                    System.out.println("Введи номер читательского билета");
                    int number = scanner.nextInt();
                    for (int i = 0; i < readers.length; i++) {
                        if (readers[i] == null) {
                            continue;
                        }
                        if (readers[i].getLibraryCardNumber() == number) {
                            readers[i].printStatus();
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        System.out.println("Нет такого читателя");
                    }
                }
                case 5 -> {
                    for (int i = 0; i < readers.length; i++) {
                        if (readers[i] != null) {
                            readers[i].printStatus();
                        }
                    }

                }
                case 6 -> {
                    System.out.println("Завершение программы . . .");
                }
                default -> {
                    System.out.println("Нет такой команды");
                }
            }

        } while (inputScanner != 6);
    }
}
