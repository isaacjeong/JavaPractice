public class MethodParameters {
    static void myMethod(String fname, int age) {
        System.out.println(fname + " is  " + age);
    }

    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");
        }else{
            System.out.println("Access granted - you are old enough!");
        }
    }

    static int myMethod2(int x) {
        return 5 + x;
    }
    public static void main(String[] args) {
        myMethod("Liam", 5);
        myMethod("Jenny", 8);
        myMethod("Anja", 31);

        checkAge(20);

        System.out.println(myMethod2(3));
    }

}