public class Constructors {
    int x;
    //Create a class constructor for the Constructor class
    //This examples shows parameters(Parameter is just more stuff)
    public Constructors(int y) {
        x = y;
    }
    public static void main(String[] args) {
        Constructors myObj = new Constructors(5);
        System.out.println(myObj.x);
    }
}
