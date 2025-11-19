package library;

//Todo 책 3권 만들기
public class Book {
    //속성
    private int number;
    private String title;
    private boolean rentalStatus;

    // 생성자
    public Book(int number, String title, boolean rentalStatus) {
        this.number = number; //책 번호 저장
        this.title = title; // 제목 저장
        this.rentalStatus = rentalStatus; //대여 여부 저장
    }

    // 기능
    //책 번호 조회
    public int getNumber() {return number;}

    //책 제목 조회
    public String getTile() {
        return title;
    }

    //책 대여여부 조회
    public boolean getRentalStatus() {
        return rentalStatus;
    }

    //세터 - 대여여부
    public void setRentalStatus(boolean rentalStatus) {this.rentalStatus = rentalStatus;}
}
