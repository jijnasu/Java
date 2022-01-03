import java.util.Scanner;
import shape.Circle;
import shape.Triangle;
import shape.Square;

public class CircleDriver {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        c.input();
        c.area();
        c.perimeter();

        Square s = new Square();
        s.input();
        s.area();
        s.perimeter();
    }
}
