import java.util.Scanner;
public class OneToTen {
    public static void main(String[] args) {

        Scanner myLowestNumber = new Scanner(System.in);
        System.out.println("What is your first number?: ");
        int myNumFirst = myLowestNumber.nextInt();

        Scanner myHighestNumber = new Scanner(System.in);
        System.out.println("What is your second number?: ");
        int myNumSecond = myHighestNumber.nextInt();

        int sum = 0;

        for (int i = myNumFirst; i <= myNumSecond; i ++ ){
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
        //        int sum = 0;
//        for (int i = 0; i <= 10; i++){
//            sum = sum + i;
//        }
//        System.out.println(sum);
    }
}
