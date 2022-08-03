public class Ifexample3 {
    public static void main(String[] args) {
        int age = 9; //나이는 9살
        int charge; // 입장료 변수
        if(age < 8){ //나이가 8살보다 많으니까
            charge = 1000;
            System.out.println("취학 전 아동입니다.");
        } //이부분은 건너뜀
        if (age < 14){ //나이가 14살보다 적으니까
            charge = 2000; //입장료는 2천원
            System.out.println("초등학생입니다."); //출력
        }
        if (age < 20){ //나이가 20살보다 적으니까
            charge = 2500; //입장료는 2천5백원
            System.out.println("중, 고등학생입니다."); //출력
        }
        else{
            charge = 3000;
            System.out.println("일반인입니다.");
        }
        System.out.println("입장료는" + charge + "원입니다."); //입장료는 2천5백원입니다 출력
    }
}

//이 경우는 조건만 맞으면 싹 다 나오기때문에 주의해서 if else문을 만들것

//팁 : 선택이 두가지인 경우에는 조건연산자(삼항연산자)를 쓰는 경우가 더 간편하다
/*
ex)
int max;
int a = 1;
int b = 2;
if (a>b) max = a;
else max = b;

ex)
max = (a>b) ? a : b;
 */