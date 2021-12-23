package btech;
import java.util.Scanner;
public class Student{
    String name;
    int roll;
    int marks[];

    public Student(){
        name = null;
        roll = 0;
        marks = new int[3];
    }

    
    public Student(String n,int r,int m[]){
        name = n;
        roll = r;
        marks = m;
    }

    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Marks: ");
        for(int i=0;i<marks.length;i++){
            System.out.print( marks[i] + "  ");
        }
        System.out.println();
    }
}

