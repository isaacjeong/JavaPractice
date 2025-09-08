import java.util.TreeMap;

public class TreeMapPractice {
	public static void main(String[] args) {
		TreeMap<String, String> capitalCities = new TreeMap<String, String>();
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		capitalCities.put("Norway", "Oslo");
		System.out.println(capitalCities);
	}
}