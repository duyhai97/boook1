import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[10];
        books[0] = new ProgrammingBook("aa", "b1", 10, "hai1", "java", "Spring");
        books[1] = new ProgrammingBook("aa", "b1", 11, "hai1", "java1", "Spring");
        books[2] = new ProgrammingBook("aa", "b1", 12, "hai1", "java2", "Spring");
        books[3] = new ProgrammingBook("aa", "b1", 13, "hai1", "java", "Spring");
        books[4] = new ProgrammingBook("aa", "bbbbbbbbbb1", 14, "hai1", "java", "Spring");
        books[5] = new FictionBook("aa", "b2", 15, "hai", "aa");
        books[6] = new FictionBook("aa", "b2", 16, "hai", "aa");
        books[7] = new FictionBook("aa", "b2", 17, "hai", "aa");
        books[8] = new FictionBook("aa", "b2", 18, "hai", "aa");
        books[9] = new FictionBook("aa", "b2", 15, "hai", "aa");
        ManagerBook hai = new ManagerBook(books);

        Book[] newBooks = books;
        Book book =  new FictionBook("aaa", "b2", 25, "hai121", "axax");
        Scanner sc = new Scanner(System.in);


//       newBook = MyArrayBook.addBook(books, new ProgrammingBook("aa", "khhhhhhhhhhhh", 15, "hai1", "java", "Spring"), index);
//        System.out.println(newBook[5].getName());
//        newBook = MyArrayBook.editBook(books, new FictionBook("aa", "fffgg", 15, "hai", "aa" ), index);
//        System.out.println(newBook[index].getName());


        while (true) {
            System.out.println("Mời nhập các lựa chọn sau");
            System.out.println("1. addBook \n 2.editBook \n 3.deleteBook \n 4.showBooks \n 5.Exit");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:

                    System.out.println("nhap vao vi tri muon them: ");
                    int index = sc.nextInt();
                    newBooks = MyArrayBook.addBook(books, book, index);
                    break;
                case 2:
                    System.out.println("nhap vao vi tri muon sua: ");
                    index = sc.nextInt();
                    newBooks = MyArrayBook.editBook(books, book, index);
                    break;
                case 3:
                    System.out.println("nhap vao vi tri muon xoa: ");
                    index = sc.nextInt();
                    newBooks = MyArrayBook.deleteBook(books, index);
                    break;
                case 4:
                    MyArrayBook.showBooks(books);
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}
