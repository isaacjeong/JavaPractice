import java.util.HashMap;

public class HashMapPractice {
	public static void main(String[] args) {
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		capitalCities.put("Norway", "Oslo2");
		System.out.println(capitalCities);
	}
}