public class FindPositiveOrNegative {
    public static void main(String[] args) {
       int myNum = 10;

        if (myNum > 0) {
            System.out.println("Your number is positive");
        } else if (myNum < 0 ) {
            System.out.println("Your number is negative");
        } else if (myNum == 0) {
            System.out.println("Your number i 0");
        }
        else  {
            System.out.print("Your number is not an integer");
        }
    }
}
