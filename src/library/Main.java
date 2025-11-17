package library;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        List<Library> libraryList = new ArrayList<>();
        //책 3권
        Book book1 = new Book(1, "해리포터", false);
        Book book2 = new Book(2, "율리시스무어", true);
        Book book3 = new Book(3, "데일카네기", false);

        //도서관 인스턴스화
        Library library = new Library(bookList);

        // 도서관에 책 추가
        library.addBooks(book1);
        library.addBooks(book2);
        library.addBooks(book3);

        // 책 반납
        library.bookSearch(book1);
        // 책 대여
        library.bookRental(book2);
        //책 반납
        library.bookReturn(book3);
    }
}
