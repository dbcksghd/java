
class BirthDay {
    int day;
    int month;
    int year;

    public void setYear(int year){
        this.year = year; //bDay.year = year이랑 같음
    }

    public void printThis(){
        System.out.println(this); //sout(bDay)와 같음
    }
}

public class ThisExample{
    public static void main(String[] args) {
        BirthDay b1 = new BirthDay();
        BirthDay b2 = new BirthDay();
        System.out.println(b1);
        b1.printThis();
        System.out.println(b2);
        b2.printThis(); 
    }
}
