package Day3;
import java.util.Scanner;
public class operator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur age:");
        int age = sc.nextInt();

        System.out.println("Dou have ID?");
        boolean res = sc.nextBoolean();

        if(age >= 18 && res == true){
            System.out.println("Ur eligible for vote");
        }
        else if(age < 18 || res == false){
            System.out.println("Ur not eligible for vote");
        }
        else{
            System.out.println("Invalid input");
        }
        sc.close();

    }
}
