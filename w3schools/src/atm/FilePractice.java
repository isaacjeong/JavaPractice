package atm;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class FilePractice {
    public static void main(String[] args) {
        try {
            File myObj = new File("filename.txt");
            if(myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }

            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Files in java might be tricky, but is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
