import java.util.Scanner;
import java.util.ArrayList;

public class FibonnaciUsingArray {
    public static void main(String[] args) {

        ArrayList<Integer> myArrayList = new ArrayList<>();

        System.out.println("Enter nth number: ");
        Scanner fibSequence = new Scanner(System.in);
        int myFib = fibSequence.nextInt();

        int i = 0;

        while (i < myFib) {
            if (i > 1) {
                int previousNum = myArrayList.get(i - 1);
                int prevPrevNum = myArrayList.get(i - 2);
                myArrayList.add(previousNum + prevPrevNum);
            } else if (i < 1) {
                myArrayList.add(1);
            }
//            System.out.println(myArrayList.getLast());
            i++;
        }
        System.out.println(myArrayList.get(myArrayList.size() - 1));
    }
}
