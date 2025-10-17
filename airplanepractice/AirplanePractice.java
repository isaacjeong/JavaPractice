package airplanepractice;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
/*
SW 1001, SW 1002, SW 1003, SW 1004, SW 1005

AUS, CUN, AOU, DAK, MIA, ATL, LAX, SFO, JFK, PHL

Airport(Departure and destination), Airplane, User
*/

public class AirplanePractice{
    // Airport (String code) {
    //     this.planes.add(new Airplane("SW 1001"));
    //     this.planes.add(new Airplane("SW 1002"));
    //     this.planes.add(new Airplane("SW 1003"));
    //     this.planes.add(new Airplane("SW 1004"));
    //     this.planes.add(new Airplane("SW 1005"));
	// }

    // Airplane(String code) {
    //     this.airports.add(new Airport("AUS"));
    //     this.airports.add(new Airport("CUN"));
    //     this.airports.add(new Airport("HOU"));
    //     this.airports.add(new Airport("DAL"));
    //     this.airports.add(new Airport("MIA"));
    //     this.airports.add(new Airport("ATL"));
    //     this.airports.add(new Airport("LAX"));
    //     this.airports.add(new Airport("SFO"));
    //     this.airports.add(new Airport("JFK"));
    //     this.airports.add(new Airport("PHL"));
    // } 

   

    ArrayList<Airplane> airplanes = new ArrayList<Airplane>();
    ArrayList<Airport> airports = new ArrayList<Airport>();

    public static void main(String[] args) {

        HashMap<Airport, ArrayList<Airplane>> map = new HashMap<Airport, ArrayList<Airplane>>();

        AirplanePractice app = new AirplanePractice();
        Airplane sw1001 = new Airplane("Southwest 1001", "Sw1001");
        app.airplanes.add(sw1001);
        Airplane sw1002 = new Airplane("Southwest 1002", "Sw1002");
        app.airplanes.add(sw1002);
        Airplane sw1003 = new Airplane("Southwest 1003", "Sw1003");
        app.airplanes.add(sw1003);
        Airplane sw1004 = new Airplane("Southwest 1004", "Sw1004");
        app.airplanes.add(sw1004);
        Airplane sw1005 = new Airplane("Southwest 1005", "Sw1005");
        app.airplanes.add(sw1005);
        
        
        Airport aus = new Airport("Austin", "AUS");
        app.airports.add(aus);
        aus.airplanes.add(sw1001);
        aus.airplanes.add(sw1002);
        Airport cun = new Airport("Cancun", "CUN");
        app.airports.add(cun);
        cun.airplanes.add(sw1002);
        cun.airplanes.add(sw1003);
        Airport hou = new Airport("Houston", "HOU");
        app.airports.add(hou);
        hou.airplanes.add(sw1001);
        hou.airplanes.add(sw1002);
        hou.airplanes.add(sw1003);
        Airport dal = new Airport("Dallas", "DAL");
        app.airports.add(dal);
        dal.airplanes.add(sw1002);
        dal.airplanes.add(sw1003);
        dal.airplanes.add(sw1004);
        dal.airplanes.add(sw1005);
        Airport mia = new Airport("Miami", "MIA");
        app.airports.add(mia);
        mia.airplanes.add(sw1002);
        mia.airplanes.add(sw1004);
        mia.airplanes.add(sw1005);
        Airport atl = new Airport("Atlanta", "ATL");
        app.airports.add(atl);
        atl.airplanes.add(sw1003);
        atl.airplanes.add(sw1004);
        Airport lax = new Airport("Los Angeles", "LAX");
        app.airports.add(lax);
        lax.airplanes.add(sw1001);
        lax.airplanes.add(sw1005);
        Airport sfo = new Airport("San Fransisco","SFO");
        app.airports.add(sfo);
        sfo.airplanes.add(sw1004);
        sfo.airplanes.add(sw1005);
        Airport jfk = new Airport("New York", "JFK");
        app.airports.add(jfk);
        jfk.airplanes.add(sw1001);
        jfk.airplanes.add(sw1002);
        jfk.airplanes.add(sw1003);
        jfk.airplanes.add(sw1004);
        jfk.airplanes.add(sw1005);
        Airport phl = new Airport("Philadelphia", "PHL");
        app.airports.add(phl);
        phl.airplanes.add(sw1001);
        phl.airplanes.add(sw1004);
        
        
        map.put(aus, aus.airplanes);
        map.put(cun, cun.airplanes);
        map.put(hou, hou.airplanes);
        map.put(dal, dal.airplanes);
        map.put(mia, mia.airplanes);
        map.put(atl, atl.airplanes);
        map.put(lax, lax.airplanes);
        map.put(sfo, sfo.airplanes);
        map.put(jfk, jfk.airplanes);
        map.put(phl, phl.airplanes);
        // Airport ap1 = new Airport("Seattle", "SEA");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Where are you coming from today? ");
        for (int i = 0; i < app.airports.size(); i++) {
            System.out.println((i + 1) + ") " + app.airports.get(i).name);
        }
        Airport departureAirport = app.airports.get(scanner.nextInt() - 1);
        System.out.println("Where are you heading to today?: ");
        for (int i = 0; i < app.airports.size(); i++) {
            System.out.println((i + 1) + ") " + app.airports.get(i).name);
        }
        Airport arrivalAirport = app.airports.get(scanner.nextInt() - 1);
        
        System.out.println("You chose to come from " + departureAirport.name + " to " + arrivalAirport.name);



        
        scanner.close();
    }
}