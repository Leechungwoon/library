package library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//역할 책 도서관이 책 목록 조회
// 도서관을 통해 조회, 대여, 반납 기능 구현
// 기능 -> 책이름을 통하여 조회, 대여, 반납 진행
// 키오스크 기능 일부 구현

public class Library {
    Scanner text = new Scanner(System.in);
    // 속
    // 도서관에서 관리하는 책 정리 코드
    private List<Book> bookList = new ArrayList<>();

    //생
    public Library() {
    }

    // 기
    public void start() {

        while (true) {

            // 메뉴판
            System.out.println("1. 전체 책 조회");
            System.out.println("2. 책 조회");
            System.out.println("3. 책 대여");
            System.out.println("4. 책 반납");
            System.out.println("0. 종료합니다.");

            //Scanner 생성
            int textInput = text.nextInt();
            text.nextLine(); // 엔터 제거 역할

            // 카테고리별 메뉴
            switch (textInput) {
                //종료
                case 0:
                    System.out.println("시스템을 종료합니다.");
                    return;

                case 1:
                    System.out.println("책을 조회합니다.");
                    allBookSearch();
                    break;

                // 조회
                case 2:
                    System.out.println("책을 조회합니다.");
                    String titleSearch = text.nextLine();
                    bookSearch(titleSearch);
                    break;

                //대여
                case 3:
                    System.out.println("대여할 책을 선택하세요.");
                    String RentBookTitle = text.nextLine();
                    bookRental(RentBookTitle);
                    break;

                //반납
                case 4:
                    System.out.println("반납할 책을 선택하세요.");
                    String ReturnBookTitle = text.nextLine();
                    bookReturn(ReturnBookTitle);
                    break;

                default:
                    System.out.println("잘 못 입력했습니다.");
            }
        }
    }

    //책 보관 및 생성(추가)
    public void addBooks(Book book) {
        bookList.add(book);
        System.out.println("책 등록 됐습니다.");
    }

    // 책 전체 목록 조회
    public Book allBookSearch() {

        //책 전체 리스트
        for (int i = 0; i < bookList.size(); i++) {
            Book books = bookList.get(i);
            System.out.println((i + 1) + ". " + "제목: " + books.getTile() + " | " + books.getRentalStatus());
        }
        //책을 찾을 수 없는 경우
        System.out.println();
        return null;
    }

    //책 단 건 조회
    public Book bookSearch(String title) {
        for (Book book : bookList) {
            if (book.getTile().equals(title)) {
                System.out.println(book.getNumber() + ". " + "제목: " + book.getTile() + " | " + "대여여부: " + book.getRentalStatus());
                return book;
            }
        }
        System.out.println("없는 제목입니다.");
        return null; // 못 찾으면 null
    }

    //책 대여 기능
    public void bookRental(String title) {
        Book book = bookSearch(title);

        if (book.getRentalStatus()) { //true인 경우 대여 가능
            book.setRentalStatus(false); // 대여 시 false로 바꿔줌
            System.out.println(book.getNumber() + "." + book.getTile() + " | " + "대여 완료 되셨습니다.");
        } else {
            System.out.println(book.getNumber() + "." + book.getTile() + " | " + "대여 불가합니다.");
        }
        System.out.println();
    }

    //책 반납 기능
    public void bookReturn(String title) {
        Book book = bookSearch(title);

        if (!book.getRentalStatus()) { // false 상태 = 반납 가능
            book.setRentalStatus(true); // 반납 후 대여 가능으로 변경
            System.out.println(book.getNumber() + ". " + book.getTile() + " | " + "반납 기능합니다.");
        } else {
            System.out.println(book.getNumber() + ". " + book.getTile() + " | " + "반납 불가능합니다.");
        }
        System.out.println();
    }
}





