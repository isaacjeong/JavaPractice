package atm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Person {
    public String name;
    public String dob;
    public String id;
    public int pin;
    public int accountNo;
    public double balance;

    public void save() {
        try {
            File myObj = new File(this.id + ".txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }

            FileWriter myWriter = new FileWriter(this.id + ".txt");
            myWriter.write(this.name + "," + this.dob + "," + this.id + "," + this.pin + "," + this.accountNo + "," + this.balance);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void deposit(double amount) throws FileNotFoundException {
        File myObj = new File(this.id + ".txt");
        Scanner myReader = new Scanner(myObj);
        String line = myReader.nextLine();
        System.out.println(line);
        String currentBalance = line.split(",")[5];
        System.out.println("Current balance = " + currentBalance);
        this.balance = Double.parseDouble(currentBalance) + amount;
        this.save();
    }

    public void withdraw(double amount) {

    }

    public static void main(String[] args) throws FileNotFoundException {
        Person isaac = new Person();
        isaac.name = "Isaac Jeong";
        isaac.dob = "11/21/2009";
        isaac.id = "ijeong";
        isaac.pin = 1234;
        isaac.accountNo = 987654;
        isaac.balance = 192834.32;
        isaac.save();

        isaac.deposit(10.0);
    }
}



