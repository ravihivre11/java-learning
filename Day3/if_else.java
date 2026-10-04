package Day3;
import java.util.Scanner;
public class if_else {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter ur age:");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("Ur eligible for vote");
        }
        else if(age < 18){
            System.out.println("Ur not eligible for vote");
        }
        else{
            System.out.println("Invalid input");
        }
        sc.close();


    }
}
