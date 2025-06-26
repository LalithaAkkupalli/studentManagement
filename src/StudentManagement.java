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
    public void deletebyRollno(int roll_no){
        for(Student s : students){
            if(s.getRoll_no()==roll_no){
                students.remove(s);
                break;
            }
        }
    }
    public void deletebyName(String name)
    {
        for(Student s : students)
        {
            if(s.getName().equals(name))
            {
                students.remove(s);
                break;
            }
        }
    }
    public void deletebyAge(int age)
    {
        for(Student s : students)
        {
            if(s.getAge()==age)
            {
                students.remove(s);
            }
        }
    }
    public void deleteAll()
    {
        students.clear();
    }
    public void displayAll()
    {
        for(Student s : students)
        {
            System.out.println(s.getName()+" "+s.getAge()+" "+s.getRoll_no());
        }
    }
    public void updatebyName(String name, String newname)
    {

        for(Student s : students)
        {
            if(s.getName().equals(name))
            {
                s.setName(newname);
                break;
            }
                
        }
    }
    public void searchbyRollno(int roll_no)
    {
        for(Student s : students )
        {
            if(s.getRoll_no()==roll_no)
            {
              System.out.println("Name: "+s.getName()+" Age: "+s.getAge()+" Roll no: "+s.getRoll_no());
            }
        }
    }

}
