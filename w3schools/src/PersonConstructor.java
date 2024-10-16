public class PersonConstructor {
    String name;
    PersonConstructor(String fName, String lName) {
        name = fName + "/" + lName;
    }
    public static void main(String[] args) {
        PersonConstructor isaac = new PersonConstructor("Isaac", "Jeong");
        System.out.println(isaac.name);
    }
}
