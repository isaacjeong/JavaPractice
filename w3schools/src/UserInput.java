import java.util.Scanner;
class UserInput {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myObj.nextLine();//nextLine can be replaced with stuff like nextInt or nextDouble
        System.out.println("Username is: " + userName);
    }
}
