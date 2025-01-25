package atm;

import java.util.*;

public class ATMProject {
    public static void main(String[] args) {
        System.out.println("Welcome to the ATM.");

        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter pin: ");
        int userPin = myObj.nextInt();

        Scanner balanceMoney = new Scanner(System.in);
        System.out.println("How much money do you currently own: ");
        double myBalance = balanceMoney.nextInt();
        while (true) {
            Scanner userChoice = new Scanner(System.in);
            System.out.println("Welcome, please type in which option you would like");
            System.out.println("Deposit: 1");
            System.out.println("Withdrawal: 2");
            System.out.println("Changing Your Pin: 3");
            System.out.println("Leave: 4");
            int choiceUser = userChoice.nextInt();

            if (choiceUser == 1) {
                System.out.println("You have picked Deposit");

                Scanner depositMoney = new Scanner(System.in);
                System.out.println("Enter how much you want to deposit: ");
                int depositMyMoney = depositMoney.nextInt();
                System.out.println("You have chosen to deposit $" + depositMyMoney);
                System.out.println("You now have $" + (myBalance + depositMyMoney));
                myBalance = myBalance + depositMyMoney;

            } else if (choiceUser == 2) {
                System.out.println("You have picked Withdrawal");

                Scanner withDrawl = new Scanner(System.in);
                System.out.println("Enter how much you want to Withdraw: ");
                int withdrawMoney = withDrawl.nextInt();

                if (myBalance > withdrawMoney) {
                    System.out.println("You now have $" + (myBalance - withdrawMoney) + " in your account");
                    myBalance = myBalance - withdrawMoney;
                } else if (myBalance < withdrawMoney) {
                    System.out.println("You cannot withdraw that much because you do not have enough money!");
                }

            } else if (choiceUser == 3) {
                System.out.println("You have picked Changing Your Pin");

                Scanner pinChange = new Scanner(System.in);
                System.out.println("What do you want your new pin to be?: ");
                String myPinChange = pinChange.nextLine();

                Scanner doubleCheck = new Scanner(System.in);
                System.out.println("Double check your pin: ");
                String doubleCheckPin = doubleCheck.nextLine();

                if (myPinChange.equals(doubleCheckPin)) {
                    System.out.println("Your pin has been changed");
                } else {
                    System.out.println("Wrong, Try again!");
                }

            } else if (choiceUser == 4) {
                System.out.println("You have chosen to leave. Thank you!");
                break;
            } else {
                System.out.println("Not a valid Choice");
            }
        }
    }
}
