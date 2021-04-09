public class ManagerBook {
    private Book [] books ;

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public ManagerBook(Book[] books) {
        this.books = books;
    }
    public int getTotalPrice(){
        int sum = 0;
        for (int i = 0; i < books.length; i++) {
            sum += books[i].getPrice();
        }
        return sum;
    }
    public int countBookByLanguage(){
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] instanceof ProgrammingBook) {
                ProgrammingBook b = (ProgrammingBook)books[i];
                if(b.getLanguage() == "java") count++;
            }
        }
        return count;
    }

}
