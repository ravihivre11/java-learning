package Day9;
 
class student{
    String name;
    int marks;
}


public class heap2 {
    public static void main(String[] args){

        student s1 = new student();
        s1.name = "ravi";
        s1.marks = 90;

        student s2 = new student();
        s2.name = "ravi";
        s2.marks = 90;

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
