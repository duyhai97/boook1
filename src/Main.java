import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Book p1 = new ProgrammingBook("aa", "b1", 19, "hai1", "java", "Spring");
        Book p2 = new ProgrammingBook("aa", "b1", 11, "hai1", "java1", "Spring");
        Book p3 = new ProgrammingBook("aa", "b1", 12, "hai1", "java2", "Spring");
        Book p4 = new ProgrammingBook("aa", "b1", 13, "hai1", "java", "Spring");
        Book p5 = new ProgrammingBook("aa", "bb1", 29, "hai1", "java", "Spring");
        Book f1 = new FictionBook("aa", "b2", 15, "hai", "aa");
        Book f2 = new FictionBook("aa", "b2", 16, "hai", "aa");
        Book f3 = new FictionBook("aa", "b2", 17, "hai", "aa");
        Book f4 = new FictionBook("aa", "b2", 18, "hai", "aa");
        Book f5 = new FictionBook("aa", "b2", 15, "hai", "aa");
        Book g5 = new FictionBook("aa", "fdadada", 30, "qsS", "aa");
        List<Book> bookList = new ArrayList<Book>();
        bookList.add(p1);
        bookList.add(p2) ;
        bookList.add(p3);
        bookList.add(p4);bookList.add(p5);bookList.add(f1);bookList.add(f2);bookList.add(f3);bookList.add(f4);bookList.add(f5);

        bookList.add(g5);
        Collections.sort(bookList);

        ManagerBook managerBook = new ManagerBook(bookList);
        managerBook.getTotalPrice();
        System.out.println(managerBook.getTotalPrice());

        System.out.println(managerBook.countBookByLanguage());


        MyArrayBook myArrayBook =new MyArrayBook(bookList);
       myArrayBook.showBook(bookList);



//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            System.out.println("Mời nhập các lựa chọn sau");
//            System.out.println("1. addBook \n 2.editBook \n 3.deleteBook \n 4.showBooks \n 5.Exit");
//            int choose = sc.nextInt();
//            switch (choose) {
//                case 1:
//
//                    System.out.println("nhap vao vi tri muon them: ");
//                    int index = sc.nextInt();
//                    newBooks = MyArrayBook.addBook(books, book, index);
//                    break;
//                case 2:
//                    System.out.println("nhap vao vi tri muon sua: ");
//                    index = sc.nextInt();
//                    newBooks = MyArrayBook.editBook(books, book, index);
//                    break;
//                case 3:
//                    System.out.println("nhap vao vi tri muon xoa: ");
//                    index = sc.nextInt();
//                    newBooks = MyArrayBook.deleteBook(books, index);
//                    break;
//                case 4:
//                    MyArrayBook.showBooks(books);
//                    break;
//                case 5:
//                    System.exit(0);
//                    break;
//            }
        }
    }

