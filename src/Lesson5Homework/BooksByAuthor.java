package Lesson5Homework;

import java.util.Scanner;

public class BooksByAuthor {

    public static void main(String[] args) {
        BooksList.initBook();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Author: ");
        String author = scan.nextLine();

        System.out.println(author + " wrote the book " + returnTitle(author));
    }

    public static String returnTitle(String author) {
        Book[] books = BooksList.initBook();
        String rTitle = "";
        for (int i = 0; i < books.length; i++) {
            if (author.equals(books[i].author)) {
                rTitle = books[i].title;
            }
        }
        return rTitle;
    }


}
