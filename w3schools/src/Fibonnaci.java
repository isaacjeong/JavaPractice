import java.util.Scanner;
public class Fibonnaci {
    public static void main(String[] args) {

        long startNumber = 1;
        long startNumberTwo = 1;

        Scanner firstFib = new Scanner(System.in);
        System.out.println("Enter your nth number: ");
        long fibScanner = firstFib.nextLong() - 2;

        long sum = 0;
        for(long i = 0; i < fibScanner; i++){
            sum = startNumber + startNumberTwo;
            startNumber = startNumberTwo;
            startNumberTwo = sum;
        }
        System.out.println(sum);
    }
}
