class StudentDetails {
    String name;
    int age;
    void student(String n, int a) {
        name = n;
        age = a;
    }
    void display() {
        System.out.println(name + " " + age);
    }
}
public class Student {
    public static void main(String[] args) {
        StudentDetails s1 = new StudentDetails();
        StudentDetails s2 = new StudentDetails();
        s1.student("Lilly", 19);
        s2.student("Alice", 18);
        s1.display();
        s2.display();
    }
}