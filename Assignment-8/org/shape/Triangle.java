package shape;
import java.util.Scanner;

public class Triangle {
    
    int base, height, left, right;
    
    
    public Triangle() {
    }
    
    public Triangle(int base, int height, int left, int right) {
        this.base = base;
        this.height = height;
        this.left = left;
        this.right = right;
    }
    
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base, height, side1 and side2 : ");
        base = sc.nextInt();
        height = sc.nextInt();
        left = sc.nextInt();
        right = sc.nextInt();
    }
    
    public void area()
    {
        System.out.println("Area of the triangle = "+0.5*base*height);
    }
    
    public void perimeter()
    {
        System.out.println("Perimeter of the triangle = "+base+left+right);
    }
}

