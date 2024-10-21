import java.util.HashMap;

class Grade {
    public String languageArts;
    public String math;
    public String biology;
}

public class HashmapEx {
    public static void main(String[] args) {
        Grade grade = new Grade();
        grade.languageArts = "A";
        grade.math = "B";
        grade.biology = "C";

        HashMap<String, Grade> names = new HashMap<String, Grade>();
        names.put("s149997", grade);
        Grade isaacGrade = names.get("s149997");
        System.out.println("This is s149997's Grade Report");
        System.out.println("Language Arts: "+ grade.languageArts);
        System.out.println("Math: " + grade.math);
        System.out.println("Biology: " + grade.biology);


    }




}
