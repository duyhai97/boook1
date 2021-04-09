public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[10];
       books[0] = new ProgrammingBook("aa", "b1", 10, "hai1", "java", "Spring");
       books[1] = new ProgrammingBook("aa", "b1", 11, "hai1", "java1", "Spring");
       books[2] = new ProgrammingBook("aa", "b1", 12, "hai1", "java2", "Spring");
       books[3] = new ProgrammingBook("aa", "b1", 13, "hai1", "java", "Spring");
       books[4] = new ProgrammingBook("aa", "b1", 14, "hai1", "java", "Spring");
       books[5] = new FictionBook("aa", "b2", 15, "hai", "aa" );
       books[6] = new FictionBook("aa", "b2", 16, "hai", "aa" );
       books[7] = new FictionBook("aa", "b2", 17, "hai", "aa" );
       books[8] = new FictionBook("aa", "b2", 18, "hai", "aa" );
       books[9] = new FictionBook("aa", "b2", 15, "hai", "aa" );
       ManagerBook hai = new ManagerBook(books);
        System.out.println(hai.getTotalPrice());

        System.out.println(hai.countBookByLanguage());



    }
}
