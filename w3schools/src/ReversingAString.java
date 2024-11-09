public class ReversingAString {
    public static void main(String[] args) {
        String originalStr = "Hello";
        String reversedStr = "";
        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }
        System.out.println("Reversed string: " + reversedStr);

        String org = "Hello";
        String str = "";
        for (int j = org.length() - 1; j >= 0; j--) {
            str = str + org.charAt(j);
        }
        System.out.println(str);



        org = "Hello";
        str = "";
        String str2 = "";
        for (int k = 0; k < org.length(); k++) {
            str = str + org.charAt(k);
            str2 = org.charAt(k) + str2;
        }
        System.out.println(str);
        System.out.println(str2);



    }
}
