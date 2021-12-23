import btech.Student;
import java.util.Scanner;
class Test1{
    public static void main(String args[]){

        Scanner in = new Scanner (System.in);

        int[] arr = new int[3];
        int sum=0;


        System.out.println("Enter Marks out of 100: " );
        for(int i=0; i<3;i++){
            arr[i] = in.nextInt();
        }


        Student std1 = new Student("Ayush",11,arr);

        for(int i=0; i<3;i++){
            sum = sum + arr[i];
        }

        std1.displayDetails();
        System.out.println("Total Marks: "  +  sum);

        sum = (sum * 100)  / 300;
        System.out.println("Percentage: "  + sum);
        

    }
}