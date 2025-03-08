package person;

public class Person {
    String age;
    String name;

    void showMyInfo() {
        System.out.println("I am " + this.name + "and I am " + this.age + " years old.");
    }

    public static void main(String[] args) {
        Person alex = new Person();
        alex.age = "49";
        alex.name = "Alex J";
        alex.showMyInfo();
    }
}

