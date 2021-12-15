import java.util.*;
class Swap
{
    public static void main(String[] args) 
    {
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Before Swapping: x = "+x+" and y = "+y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After Swapping: x = "+x+" and y = "+y);
        sc.close();
    }
}
