import java.util.HashSet;
import java.util.ArrayList;

public class HashSetPracticeObj {
	public static void main(String[] args) {
		HashSet<ArrayList> cars = new HashSet<ArrayList>();
		ArrayList<String> kia = new ArrayList<String>();
		ArrayList<String> toyota= new ArrayList<String>();
		ArrayList<String> chevy = new ArrayList<String>();
		ArrayList<String> kia2 = new ArrayList<String>();

		toyota.add("Camry");
		toyota.add("Corolla");
		toyota.add("Tundra");

		kia.add("Soul");
		kia.add("K5");
		kia.add("Carnival");

		kia2.add("Soul");
		kia2.add("K5");
		kia2.add("Carnival");

		chevy.add("Malibu");
		chevy.add("Equinox");
		chevy.add("Silverado");
			
		cars.add(toyota);
		cars.add(kia);
		cars.add(chevy);
		cars.add(kia2);

		System.out.println(cars);

	}
}