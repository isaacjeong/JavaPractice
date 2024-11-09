package string;

public class Split {
    public static void main(String[] args) {
        String cr = "Spl, it, a, string by its spaces, an, d also, pu, nctuation";
        String comma = ",";
        String[] myArray = cr.split(comma);
        for(String s : myArray) {
            System.out.print(s);
        }
    }
}
