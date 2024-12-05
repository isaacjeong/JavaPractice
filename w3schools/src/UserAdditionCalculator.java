import java.util.Scanner;
public class UserAdditionCalculator {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter 2 Numbers: ");
        int firstNum = myObj.nextInt();
        int secondNum = myObj.nextInt();
        System.out.println(firstNum + secondNum);

        System.out.println("Subtraction Now: ");
        int SubtractFirst = myObj.nextInt();
        int SubtractSecond = myObj.nextInt();
        System.out.println(SubtractFirst - SubtractSecond);
    }
}
