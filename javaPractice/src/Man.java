public class Man {

    int age;
    String name;
    boolean isMarried;
    int children;

    public boolean getIsmarried(){
        return isMarried;
    }


    public static void main(String[] args) {
        Man nameMan = new Man();
        nameMan.name = "James";

        Man ageMan = new Man();
        ageMan.age = 40;

        Man isMarriedMan = new Man();
        isMarriedMan.isMarried = true;

        Man childrenMan = new Man();
        childrenMan.children = 3;

        System.out.println(nameMan.name);
        System.out.println(ageMan.age);
        System.out.println(isMarriedMan.getIsmarried());
        System.out.println(childrenMan.children);
    }
}
