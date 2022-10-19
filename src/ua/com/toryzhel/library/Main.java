package ua.com.toryzhel.library;

/**
 * Little library
 *
 * @author Semenchenko V.
 */
public class Main {
    public static void main(String[] args) {

        Reader reader1 = new Reader("Terra Davidson", 1, "CIP", "15 April 1999", "+380997361230");
        Reader reader2 = new Reader("Rick Lincoln", 2, "E", "31 January 2001", "+1946284649");
        Reader reader3 = new Reader("Joe Bidden", 3, "KN", "13 March 2002", "+82475284620");
        Reader[] readers = {reader1, reader2, reader3};

        Book book1 = new Book("Harry Potter", "J. Rowling");
        Book book2 = new Book("The Lord of the Rings", "J. Tolkien");
        Book book3 = new Book("The Guardians", "J. Grisham");
        Book[] books = {book1, book2, book3};

        printReaders(readers);
        printBooks(books);

        reader1.takeBook(3);
        reader2.takeBook("Head First Java", "Programming", "Cat Language");
        reader3.takeBook(book1, book2);

        reader1.returnBook(2);
        reader2.returnBook("Head First Java", "Programming");
        reader3.returnBook(book1, book2);


    }

    private static void printBooks(Book[] books) {
        System.out.println("Books list: ");
        for (Book book : books) {
            System.out.println(book.getInfo());
        }
        System.out.println();
    }

    private static void printReaders(Reader[] readers) {
        System.out.println("Readers list: ");
        for (Reader reader : readers) {
            System.out.println(reader.getInfo());
        }
        System.out.println();
    }
}
