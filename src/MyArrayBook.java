
public class MyArrayBook {

    public static Book[] addBook(Book[] books, Book book, int index) {
        Book[] newBooks = new Book[books.length + 1];
        for (int i = 0; i < books.length; i++) {
            newBooks[i] = books[i];
            newBooks[index] = book;
        }
        for (int i = index + 1; i < newBooks.length; i++) {
            newBooks[i] = books[i - 1];
        }

        return newBooks;

    }

    public static Book[] editBook(Book[] books, Book book, int index) {
        books[index] = book;
        return books;
    }

    public static Book[] deleteBook(Book[] books, int index) {

        Book[] newBook = new Book[books.length - 1];
        System.arraycopy(books, 0, newBook, 0, index);
        System.arraycopy(books, index + 1, newBook, index, books.length - index - 1);
        return newBook;
    }

    public static void showBooks(Book[] newBooks) {
        for (int i = 0; i < newBooks.length; i++) {
            System.out.println(newBooks[i]);
        }
    }
}

