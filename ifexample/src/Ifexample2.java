public class Ifexample2 {
    public static void main(String[] args) {
        int age = 9; //나이는 9살
        int charge; // 입장료 변수
        if(age < 8){ //나이가 8살보다 많으니까
            charge = 1000;
            System.out.println("취학 전 아동입니다.");
        } //이부분은 건너뜀
        else if (age < 14){ //나이가 14살보다 적으니까
            charge = 2000; //입장료는 2천원
            System.out.println("초등학생입니다."); //출력
        } //남은 if문들은 건너뜀
        else if (age < 20){
            charge = 2500;
            System.out.println("중, 고등학생입니다.");
        }
        else{
            charge = 3000;
            System.out.println("일반인입니다.");
        }
        System.out.println("입장료는" + charge + "원입니다."); //입장료는 2천원입니다 출력
    }
}
