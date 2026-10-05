import java.util.HashSet;

public class StudentManagementSystem{
    public static void main(String[] args) {

        HashSet<String> students = new HashSet<>();

        students.add("Sude");
        students.add("Fatma");
        students.add("Seyma");
        students.add("Sude");

        for(String student : students){
            System.out.println(student);
        }

        System.out.println("Does the set contain Sude? : " + students.contains("Sude"));
        students.remove("Sude");

        

    }
}