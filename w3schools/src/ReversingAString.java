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
    }
}
