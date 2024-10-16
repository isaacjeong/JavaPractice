//Attributes are basically just variables within a class
public class ClassAttributes {
    String first_name = "John";
    String last_name = "Doe";
    int age = 24;

    public static void main(String[] args) {
        ClassAttributes myObj = new ClassAttributes();
        System.out.println("Name: " + myObj.first_name + " " + myObj.last_name);
        System.out.println("Age: " + myObj.age);
    }
}
