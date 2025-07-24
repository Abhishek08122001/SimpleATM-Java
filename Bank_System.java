//Simple ATM / Bank System Project

/*
Start with some default balance (e.g., ₹5000).
Menu options:
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
Perform the action based on user input.
Use loops to keep showing the menu until Exit.
Validate conditions (like cannot withdraw more than balance).
 */
import java.util.*;
public class Bank_System{    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000;
        boolean bankOpen = true;
        System.out.println("!!!WELCOME TO OUR BANK!!!");

        while(bankOpen){
            System.out.println("How can we help you?");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Please enter your choice: ");
            int choice = sc.nextInt();

            switch(choice){
            case 1:
                System.out.println("Your Balance Amount is Rs."+balance);
                break;
            case 2:
                System.out.print("Deposit Amount? Please enter the amount: Rs.");
                double depositAmount = sc.nextDouble();
                if(depositAmount>0){
                    balance = balance + depositAmount;
                    System.out.println("Rs."+depositAmount+" is deposited to your account. Your current balance is "+balance);
                }
                else{
                    System.out.println("Invalid amount!!!");
                }
                break;
            case 3:
                System.out.print("Enter the amount to withdraw: ");
                double withdrawalAmount = sc.nextDouble();
                if(withdrawalAmount>balance){
                    System.out.println("No sufficient balance!!!");
                }
                else if(withdrawalAmount<=0){
                    System.out.println("Invalid amount!!!");
                }
                else{
                    balance = balance - withdrawalAmount;
                    System.out.println("Amount Rs."+withdrawalAmount+" is successfully withdrawn.Your current balance is Rs."+balance);                   
                }
                break;
            case 4:
                System.out.println("See you next time!Have a great day!!...");
                bankOpen = false;
                break;
            default:
                System.out.println("Invalid choice!Please try again");
        }       
    }
    sc.close();
    }
}
