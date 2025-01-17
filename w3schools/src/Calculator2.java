
import java.util.Scanner;

import static java.lang.Float.parseFloat;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Put expression in: ");
        String expression = myObj.next();

        //Take that expression and split it from the operator
        String[] splitNumber = expression.split("[+/*-]");

        //Do the same steps as last time but instead make user input an expression
        if(expression.indexOf("+" ) > -1 ) {
            System.out.println(parseFloat(splitNumber[0]) + parseFloat(splitNumber[1]));
        } else if (expression.indexOf("-") > -1) {
            System.out.println(parseFloat(splitNumber[0]) - parseFloat(splitNumber[1]));
        } else if (expression.indexOf("*") > -1) {
            System.out.println(parseFloat(splitNumber[0]) * parseFloat(splitNumber[1]));
        } else if (expression.indexOf("/") > -1) {
            System.out.println(parseFloat(splitNumber[0]) / parseFloat(splitNumber[1]));
        }
        //Get the two numbers and the operator and print out the answer
    }
}