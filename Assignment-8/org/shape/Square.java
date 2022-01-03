package shape;
import java.util.Scanner;
public class Square
{
    int side;
    
    public Square() {
    }
    
    public Square(int side) {
        this.side = side;
    }
    
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side : ");
        side = sc.nextInt();
    }
    
    public void area()
    {
        System.out.println("Area of the square = "+side*side);
    }
    
    public void perimeter()
    {
        System.out.println("Perimeter of the square = "+4*side);
    }
    
}