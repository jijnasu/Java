package shape;
import java.util.Scanner;

public class Circle {
    int radius;
    
    public Circle() {
    }
    
    public Circle(int radius) {
        this.radius = radius;
    }
    
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = sc.nextInt();
    }
    
    public void area()
    {
        System.out.println("Area of the circle = "+3.14*radius*radius);
    }
    
    public void perimeter()
    {
        System.out.println("Perimeter of the circle = "+3.14*radius*2);
    }
}