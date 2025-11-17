package library;

import java.util.List;

//Todo
//역할 책 도서관이 책 목록 조회
// 도서관을 통해 조회, 대여, 반납 기능 구현

public class Library {

    // 속
    private List<Book> bookList;

    //생
    public Library(List<Book> bookList) {
        this.bookList = bookList;
    }

    // 기

    //책 보관 및 생성
    public void addBooks(Book book) {
        bookList.add(book);
    }

    // 책 조회 기능
    public void bookSearch(Book book) {

        // 책 정보 (번호, 제목, 대여여부)
        int number = book.getNumber();
        String title = book.getTile();
        boolean rentalStatus = book.getRentalStatus();

        if (rentalStatus) { //true인 경우 대여가능
            System.out.println(number + "." + title + " | " + "대여 가능합니다.");
        } else {
            System.out.println(number + "." + title + " | " + "대여 불가능합니다.");
        }
    }

    //책 대여 기능
    public void bookRental(Book book) {

        //책 정보 (번호, 제목, 대여여부)
        int number = book.getNumber();
        String title = book.getTile();
        boolean rentalStatus = book.getRentalStatus();

        if (rentalStatus) { //true 상태인 경우 실행
            book.setRentalStatus(false); //true 실행 시 false로 변경
            System.out.println(number + ". " + title + " 대여 완료됐습니다.");
        } else {
            System.out.println("대여 불가능 합니다.");
        }
    }

    //책 반납 기능
    public void bookReturn(Book book) {
//      책 정보 (번호, 제목, 대여여부)
        int number = book.getNumber();
        String title = book.getTile();
        boolean rentalStatus = book.getRentalStatus();

        if (rentalStatus == false) { // false 상태인 경우 실행
            book.setRentalStatus(true); // 대여 완료 되면서 true로 변경해주는 코드
            System.out.println(number + ". " + title + " | " + "반납 기능합니다.");
        } else {
            System.out.println(number + ". " + title + " | " + "반납 불가능합니다.");
        }
    }
}






