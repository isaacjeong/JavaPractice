import java.util.ArrayList;
public class Airport {
	

	Airport(String name, String code) {
		this.name = name;
		this.code = code;
	}
	String name;
	String code;
	String address;
	ArrayList<Airplane> airplanes = new ArrayList<Airplane>();
	
	void depart(Airplane airplane) {

	}

	void arrive(Airplane airplane) {

    }
}
