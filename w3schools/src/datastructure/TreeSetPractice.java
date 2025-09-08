import java.util.TreeSet;

public class TreeSetPractice {
	public static void main(String[] args) {
		TreeSet<String> cars = new TreeSet<>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("BMW");
		cars.add("Mazda");
		System.out.println(cars);
	}
}