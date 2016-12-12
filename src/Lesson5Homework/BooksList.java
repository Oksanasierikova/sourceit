package Lesson5Homework;


public class BooksList {


    public static void main(String[] args) {

        Book[] descrBooks = initBook();
        //initBook();
        //System.out.println("The oldest book with auhor " + findOldestBook(initBook()).author);
        System.out.println("The oldest book with auhor " + findOldestBook(descrBooks).author);

    }

    public static Book[] initBook() {
        Book[] descrBooks = new Book[3];

        descrBooks[0] = new Book("Title1", "Author1", 2011);
        descrBooks[1] = new Book("Title2", "Author2", 2012);
        descrBooks[2] = new Book("Title3", "Author3", 2013);
        return descrBooks;
    }

    public static Book findOldestBook(Book[] books) {

        Book oldestBook = books[0];

        for (int i = 0; i > books.length; i++) {
            if (books[i].year < oldestBook.year) {
                oldestBook = books[i];
            }
        }
        return oldestBook;
        //

    }
}
