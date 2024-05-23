package HomeWork3;

import java.util.Scanner;


public class Reader {
    Scanner sc = new Scanner(System.in);
    private int countBook = 0;
    private String name;
    private String surname;
    private String lastName;
    private int libraryCardNumber;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;
    private Book[] arrayBook;

    public Reader() {

        System.out.println("Введи имя читателя");
        name = sc.nextLine();

        System.out.println("Введи фамилию читателя");
        surname = sc.nextLine();

        System.out.println("Введи отчество читателя");
        lastName = sc.nextLine();

        System.out.println("Присвой номер читательского билета");
        libraryCardNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("Введи факультет читателя");
        faculty = sc.nextLine();

        System.out.println("Введи день рождения читателя");
        dateOfBirth = sc.nextLine();

        System.out.println("Введи номер телефона читателя");
        phoneNumber = sc.nextLine();

        arrayBook = new Book[10];
    }

    public Book[] getArrayBook() {
        return arrayBook;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public void takeBook(Book book) {
        for (int i = 0; i < arrayBook.length; i++) {
            if (arrayBook[i] == null) {
                arrayBook[i] = book;
                System.out.println(surname + " " + name.charAt(0) + "." + lastName.charAt(0) + "." +
                        " взял книгу " + book.getName());
                countBook++;
                break;
            }
        }
    }

    public void returnBook(Book book) {
        boolean flag = false;
        for (int i = 0; i < arrayBook.length; i++) {
            if (arrayBook[i] == null) {
                continue;
            }
            if (arrayBook[i].getName().equals(book.getName())) {
                System.out.println(surname + " " + name.charAt(0) + "." + lastName.charAt(0) + "." +
                        " вернул книгу " + book.getName());
                arrayBook[i] = null;
                countBook--;
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println(surname + " " + name.charAt(0) + "." + lastName.charAt(0) + "." +
                    " не хранит книгу " + book.getName());
        }
    }

    public void printStatus() {
        System.out.println(surname + " " + name.charAt(0) + "." + lastName.charAt(0) + "." +
                " взял " + countBook + " книги: ");
        for (Book book : arrayBook) {
            if (book != null)
                System.out.printf("%s,", book.getName());
        }
        System.out.println();
    }
}
