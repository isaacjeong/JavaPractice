import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class SortEvenFirst implements Comparator {
  public int compare(Object obj1, Object obj2) {
    Integer a = (Integer)obj1;
    Integer b = (Integer)obj2;

    boolean aIsEven = (a % 2) == 0;
    boolean bIsEven = (b % 2) == 0;
    
    if (aIsEven == bIsEven) {
      if (a < b) return -1;
      if (a > b) return 1;
      return 0;
      
    } else {

      if (aIsEven) {
      	return -1;
      } else {
        return 1;
      			}
   		 }
  	}
}

public class ComparatorsEvenToOdd {
  public static void main(String[] args) {
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(33);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(34);
    myNumbers.add(8);
    myNumbers.add(12);

    Comparator myComparator = new SortEvenFirst();
    Collections.sort(myNumbers, myComparator);

    for (int i : myNumbers) {
      System.out.println(i);
    		}
  	}
}