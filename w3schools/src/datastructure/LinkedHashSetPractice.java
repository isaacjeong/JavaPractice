import java.util.LinkedHashSet;

public class LinkedHashSetPractice {
	public static void main(String[] args){
		LinkedHashSet <String> cars = new LinkedHashSet<>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("BMW");
		cars.add("Mazda");
		System.out.println(cars);
	}
}