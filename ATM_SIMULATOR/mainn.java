package ATM_SIMULATOR;
import java.util.Scanner;

public class mainn {
    public static void main(String[] args) {
        System.out.println("Welcome to ATM Simulator");
        Scanner sc = new Scanner(System.in);
        int pin = 1234;
        for(int i =0 ; i <= 5 ;i++){
            System.out.println("Enter your pin:");
            int enterPIN = sc.nextInt();
            

            if(enterPIN == pin){
                
                System.out.println("Welcome to your account");
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw Money");
                System.out.println("3. Deposit Money");
                System.out.println("4. Exit");
                int choice = sc.nextInt();
                switch(choice){
                    case 1:
                        System.out.println("Your balance is: $" + 1000);
                        break;
                    case 2:
                        System.out.println("Enter amount to withdraw:");
                        int withdrawAmount = sc.nextInt();
                        if(withdrawAmount > 1000){
                            System.out.println("Insufficient balance");
                        }
                        else{
                            System.out.println("You have withdrawn: $" + withdrawAmount);
                            System.out.println("Your new balance is: $" + (1000 - withdrawAmount));
                        }
                        break;
                    case 3:
                        System.out.println("Enter amount to deposit:");
                        int depositAmount = sc.nextInt();
                        System.out.println("You have deposited: $" + depositAmount);
                        System.out.println("Your new balance is: $" + (1000 + depositAmount));
                        break;
                    case 4:
                        System.out.println("Thank you for using ATM Simulator");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
                break;
            }
            else{
                System.out.println("Incorrect pin, try again.");
            }
        }
        }    
    }

