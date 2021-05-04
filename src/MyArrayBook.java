import java.util.List;

public class MyArrayBook {
    private List<Book> bookList;

    public MyArrayBook(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
    public void addBook(int index, Book book){
        bookList.add(index, book);
    }
    public void deleteBook(int index){
        bookList.remove(index);
    }


    public List<Book> setBook(int index ,Book book){
            bookList.set(index, book);
            return bookList;
    }
    public void showBook(List<Book> bookList){
        for (Book aa: bookList) {
            System.out.println(aa.toString());
        }

    }
}

