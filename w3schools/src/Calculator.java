import java.util.Objects;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Pick two numbers: ");
        int firstNum = myObj.nextInt();
        int secondNum = myObj.nextInt();
        System.out.println("Enter Desired Method: ");
        String operator = myObj.next();
        System.out.println("Operator: " + operator);
        if (Objects.equals(operator, "+")) {
            System.out.println("You have selected Addition");
            System.out.println(firstNum + secondNum);
        } else if (Objects.equals(operator, "-")) {
            System.out.println("You have selected Subtraction");
            System.out.println(firstNum - secondNum);
        } else if (Objects.equals(operator,"*")) {
            System.out.println("You have selected Multiplication");
            System.out.println(firstNum * secondNum);
        } else if (Objects.equals(operator, "/")) {
            System.out.println("You have selected Division");
            System.out.println(firstNum / secondNum);
        }
    }
}
