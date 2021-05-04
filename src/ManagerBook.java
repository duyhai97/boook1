import java.util.List;

public class ManagerBook {
    private List<Book> books ;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public ManagerBook(List<Book> books) {
        this.books = books;
    }
    public int getTotalPrice(){
        int sum = 0;
        for (int i = 0; i < books.size(); i++) {
            sum += books.get(i).getPrice();
        }
        return sum;
    }
    public int countBookByLanguage(){
        int count = 0;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i) instanceof ProgrammingBook) {
                ProgrammingBook b = (ProgrammingBook) books.get(i);
                if(b.getLanguage() == "java") count++;
            }
        }
        return count;
    }
    public void addBook(Book book){
        books.add(book);
    }

}
