import java.util.*;

public class ATMProject {
    public static void main(String[] args) {
        System.out.println("Welcome to the ATM.");

        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter pin: ");
        Integer userPin = myObj.nextInt();

        Scanner balanceMoney = new Scanner(System.in);
        System.out.println("How much money do you currently own: ");
        int myBalance = balanceMoney.nextInt();

        Scanner userChoice = new Scanner(System.in);
        System.out.println("Welcome, please type in which option you would like");
        System.out.println("Deposit: 1");
        System.out.println("Withdrawal: 2");
        System.out.println("Changing Your Pin: 3");
        System.out.println("Bills: 4");
        System.out.println("Leave: 5");
        int choiceUser = userChoice.nextInt();

        if(choiceUser == 1){
            System.out.println("You have picked Deposit");

            Scanner depositMoney = new Scanner(System.in);
            System.out.println("Enter how much you want to deposit: ");
            int depositMyMoney = depositMoney.nextInt();
            System.out.println("You have chosen to deposit $" + depositMyMoney);
            System.out.println("You now have $" + (myBalance + depositMyMoney));

        } else if(choiceUser == 2) {
            System.out.println("You have picked Withdrawal");

            Scanner withDrawl = new Scanner(System.in);
            System.out.println("Enter how much you want to Withdraw: ");
            int withdrawMoney = withDrawl.nextInt();

            if(myBalance > withdrawMoney) {
                System.out.println("You now have $" + (myBalance - withdrawMoney) + " in your account");
            } else if(myBalance < withdrawMoney) {
                System.out.println("You cannot withdraw that much because you do not have enough money!");
            }

        } else if(choiceUser == 3) {
            System.out.println("You have picked Changing Your Pin");

            Scanner pinChange = new Scanner(System.in);
            System.out.println("What do you want your new pin to be?: ");
            String myPinChange = pinChange.nextLine();
            System.out.println("Double check by re-entering the pin: ");

        }
//         else if(choiceUser == 4) {
//            System.out.println("You have chosen Bills");
//        } else if(choiceUser == 5) {
//            System.out.println("You have chosen to leave. Thank you");
//        } else {
//            System.out.println("Not a valid Choice");
//        }
    }
}
