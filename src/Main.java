import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");
            System.out.println("4. Delete All Students");
            System.out.println("5. Delete by Name");
            System.out.println("6. Delete by Age");
            System.out.println("7. Delete by Roll No");
            System.out.println("8. Update Student Name");
            System.out.println("9. Search by Roll No");
            System.out.println("Enter your choice:");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sm.addStudent();
                    break;
                case 2:
                    sm.displayStudents();
                    break;
                case 3:
                    System.out.println("Exiting");
                    return;
                case 4:
                    sm.deleteAll();
                    break;
                case 5:
                    System.out.println("Enter the name to be deleted");
                    String name = sc.next();
                    sm.deletebyName(name);
                    break;
                case 6:
                    System.out.println("Enter the age to be deleted");
                    int age = sc.nextInt();
                    sm.deletebyAge(age);
                    break;
                case 7:
                    System.out.println("Enter the roll no to be deleted");
                    int roll_no = sc.nextInt();
                    sm.deletebyRollno(roll_no);
                    break;
                case 8:
                    System.out.println("Enter the name to be updated");
                    String name1 = sc.next();
                    System.out.println("Enter the new name");
                    String newname = sc.next();
                    sm.updatebyName(name1, newname);
                    break;
                case 9:
                    System.out.println("Enter the roll no to be searched");
                    int roll_no1 = sc.nextInt();
                    sm.searchbyRollno(roll_no1);
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
