package btech;
public class Student{
        int roll;
        String name;
        int m1,m2,m3;
        public Student(int roll,String name,int m1,int m2,int m3){
	        this.roll=roll;
	        this.name=name;
	        this.m1=m1;
			this.m2=m2;
			this.m3=m3;
        }
        public void display(){
	        System.out.println("Roll_no : "+roll);
	        System.out.println("Name : "+name);
	        System.out.println("-----MARKS-----");
	        int sum=m1+m2+m3;
	        System.out.println("Sub 1    : "+m1);
	        System.out.println("Sub 2    : "+m2);
			System.out.println("Sub 3    : "+m3);
	        // int per=sum/3;
	        System.out.println("percentage : "+sum/3);
        }
    }