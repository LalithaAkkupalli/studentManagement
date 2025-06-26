public class Student {
    private String name;
    private int age;
    private  int roll_no;

    public Student(String name, int age, int roll_no) {
        this.name = name;
        this.age = age;
        this.roll_no = roll_no;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getRoll_no() {
        return roll_no;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

}
