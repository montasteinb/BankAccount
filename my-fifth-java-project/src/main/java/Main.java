import controller.Bank;
import entity.User;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username: ");
        String name = myObj.nextLine();
        System.out.println("Hello " + name);

        Scanner myAccountNumber = new Scanner(System.in);
        System.out.println("Enter account number: ");
        String accountNumber = myAccountNumber.nextLine();
        System.out.println("Account number - " + accountNumber + " is correct!");

        User user = new User("3141 5926 5358 9793", "thelora", 0.00, "Lora", "Female");

        Bank bank = new Bank();
        bank.setActiveUser(user);
        System.out.println("Welcome to bank " + user.name);
        System.out.println("Current balance " + bank.getUserBalance());
        String response = bank.creditUser(245.30);
        System.out.println(response);
        String debitResponse = bank.debitUser(15.00);
        System.out.println(debitResponse);

        Scanner myDebit = new Scanner(System.in);
        System.out.println("Enter the amount for withdrawal: ");
        float debit = myDebit.nextFloat();

        if (debit <= 350) {
            System.out.println(debit + "You can withdraw your money!");
            Scanner tookOut = new Scanner(System.in);
            String out = tookOut.nextLine();
            System.out.println("Username " + out + " is correct!");
            System.out.println(debit + " euros withdraw from your account.");
        } else {
            System.out.println("Insufficient funds");
        }
        //New user
        Scanner myObj1 = new Scanner(System.in);
        System.out.println("Enter username: ");
        String userName1 = myObj1.nextLine();
        System.out.println("Hello " + userName1);

        Scanner myAccountNumber1 = new Scanner(System.in);
        System.out.println("Enter account number: ");
        String accountNumber1 = myAccountNumber1.nextLine();
        System.out.println("Account number - " + accountNumber1 + "is correct");

        User user1 = new User("565465478568", "sassy124", 150.00, "Alekss", "male");
        Bank bank1 = new Bank();
        bank1.setActiveUser(user1);
        System.out.println("Welcome to bank " + user1.name);
        System.out.println("Current balance " + bank1.getUserBalance());
        String response1 = bank1.creditUser(2000.00);
        System.out.println(response1);

        String debitResponse1 = bank.debitUser(40.00);
        System.out.println(debitResponse1);

        Scanner myDebit1 = new Scanner(System.in);
        System.out.println("Enter the amount for withdrawal: ");
        float debit1 = myDebit1.nextFloat();

        if(debit1 <= 2000) {
            System.out.println(debit1 + " you can withdraw your money");
            Scanner tookOut1 = new Scanner(System.in);
            String out1 = tookOut1.nextLine();
            System.out.println("Username " + out1 + " is correct!");
            System.out.println(debit1 + " euros withdraw from your account");
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}
