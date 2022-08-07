public class MyDate {
    //public int day;
    //public int month;
    //public int year; private로 선언

    private int day;
    private int month;
    private int year;

    private void setDay(int day){ //변수는 private로 바꾸고 public 메소드를 따로 제공
        if (month==2){
            if (day < 1|| day>28){ //2월인데 day가 1보다 작거나 28보다 크면 '오류입니다.' 출력
                System.out.println("오류입니다.");
            }
            else{
                this.day = day;//아니면 day에 매개변수 day 넣기
            }
        }
    }
}
/*
이렇게 클래스 내부에서 사용할 변수나 메소드는 private로 선언해서 외부에서 접근 못하게 막는걸 정보 은닉이라고 부름
정보 은닉은 객체지향의 특징중 하나이며, 자바에서는 접근제어자를 사용해서 정보은닉을 구현함.
모든 변수를 private로 선언할 필요는 없지만 필요할때는 private로 선언해서 오류를 막을 수 있음.

public : 외부 클래스 어디서나 접근 ㄱㄴ
protected : 같은 패키지 내부, 상속 관계 클래스만 접근 ㄱㄴ
아무것도 없음 : 같은 패키지 안에서만 접근 ㄱㄴ
private : 같은 클래스 만 접근 ㄱㄴ
 */