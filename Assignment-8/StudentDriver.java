import java.util.Scanner;
import btech.Student;
class StudentDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int roll;
		int m1,m2,m3;
        String name;
        System.out.print("Enter roll no : ");
        roll = sc.nextInt();
        System.out.print("Enter name: ");
		sc.nextLine();
        name = sc.nextLine();
        System.out.print("Enter the marks of 3 subjects: ");
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
        Student s1 = new Student(roll,name,m1,m2,m3);
        s1.display();
    }
}