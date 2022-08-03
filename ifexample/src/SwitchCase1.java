public class SwitchCase1 {
    public static void main(String[] args) {
        int ranking = 1; //랭킹 값이 1
        char medalColor;



        switch(ranking){ //조건식
            case 1: // ranking 값이 1이라면
                medalColor = 'G'; //medalColor 값에 G를 넣는다
                break; // switch case문 종료
            case 2: //ranking 값이 2라면
                medalColor = 'S'; //S를 넣고
                break; //종료
            case 3:
                medalColor = 'B';
                break;
            default: // 다 아니라면
                medalColor = 'A'; //A를 넣는다
        }
        System.out.println(ranking + "등 메달의 색깔은 " + medalColor + "입니다.");

        //case문 실행문이 같으면 같이 쓸수 있다
        int month = 5;
        int day = 0;
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                day = 31;
                break;
            case 4: case 6: case 9: case 11:
                day = 30;
                break;
            case 2:
                day = 28;
                break;
        }
        System.out.println(month + "월은 최대 " + day +"일까지 있습니다.");
    }
}
