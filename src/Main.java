import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    sm.addStudent();
                    break;
                case 2:
                    sm.displayStudents();
                    break;
                case 3:
                    System.out.println("Exiting");
                    return;
            }
        }
    }
}