public class Person {
    private String getName() {
        return "Dummy";
    }
    public static void main(String[] args) {
        Person isaac = new Person();
        System.out.println(isaac.getName());

        Panda pubao = new Panda();
        System.out.println(pubao.getName());
    }
}

