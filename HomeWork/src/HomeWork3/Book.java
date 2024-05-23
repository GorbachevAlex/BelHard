package HomeWork3;

import java.util.Scanner;

public class Book {
    private String name;
    private String authorName;

    public Book() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи имя книги");
        this.name = sc.nextLine();
        System.out.println("Введи автора книги");
        this.authorName = sc.nextLine();
    }

    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return authorName;
    }
}
