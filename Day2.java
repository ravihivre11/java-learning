import java.util.Scanner;
public class Day2 {
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur name :");
        String name = sc.next();
        System.out.println("enter ur age:");
        int age = sc.nextInt();
        System.out.println("Ur name is "+ name + "ur age is:" + age );

        // sc.nextInt();     //int
        // sc.nextDouble();  //double
        // sc.next();        //word
        // sc.nextLine();    //one line 
        sc.close();
    }
}
