import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    ArrayList<Student> students = new ArrayList<>();
    public void addStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the student");
        String name = sc.nextLine();
        System.out.println("Enter age of the student");
        int age = sc.nextInt();
        System.out.println("Enter your roll no");
        int roll_no = sc.nextInt();
        students.add(new Student(name,age,roll_no));

    }
    public void displayStudents(){
        if(students.isEmpty())
        {
            System.out.println("No students added yet");
        }
        else{
            for(Student s : students)
            {
                System.out.println(s.getName()+" "+s.getAge()+" "+s.getRoll_no());
            }
        }
    }

}
