import java.util.ArrayList;

public class ArrayListExamples {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add(0, "Mazda");
		cars.add(2, "Tesla");
		System.out.println(cars);
	}
}