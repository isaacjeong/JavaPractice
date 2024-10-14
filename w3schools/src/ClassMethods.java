//Static = can be accessed without creating an object of the class
//Public = can only be accessed by objects
public class ClassMethods {
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating an object");
    }
    public static void main(String[] args) {
        myStaticMethod();
        ClassMethods myObj = new ClassMethods();
        myObj.myPublicMethod();
    }
}
