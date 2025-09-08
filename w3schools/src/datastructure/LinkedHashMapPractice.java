import java.util.LinkedHashMap;

public class LinkedHashMapPractice {
	public static void main(String[] args) {
		LinkedHashMap<String, String> capitalCities = new LinkedHashMap<String, String>();
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		capitalCities.put("Norway", "Oslo");
		System.out.println(capitalCities);
	}
}