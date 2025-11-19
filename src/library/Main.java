package library;

public class Main {
    public static void main(String[] args) {

        //책 3권
        Library library = new Library();
        library.addBooks(new Book(1, "해리포터", false));
        library.addBooks(new Book(2, "율리시스무어", true));
        library.addBooks(new Book(3, "데일카네기", false));

        //library 프로그램 실행
        library.start();
    }
}
