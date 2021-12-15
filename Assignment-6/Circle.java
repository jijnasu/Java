
class Circle extends Point2D
{
    private double radius;
    private String color;
    
    Circle()
    {
        radius = 1.0;
        color = "red";
    }

    Circle(int x,int y,double r,String c)
    {
        setX(x);
        setY(y);
        radius = r;
        color = c;
    }

    double getRadius()
    {
        return radius;
    }

    void setRadius(double r)
    {
        radius = r;
    }

    String getColor()
    {
        return color;
    }

    void setColor(String c)
    {
        color = c;
    }

    double getArea()
    {
        return 3.14*radius*radius;
    }

    String ttoString()
    {
        return "Circle[Center=("+getX()+","+getY()+"), radius="+radius+", color="+color+"]";
    }
}


class Cylinder extends Circle
{
    private double height;

    Cylinder()
    {
        height = 1.0;
    }

    Cylinder(int x,int y, double r, String c, double h)
    {
        setX(x);
        setY(y);
        setRadius(r);
        setColor(c);
        height = h;
    }

    double getHeight()
    {
        return height;
    }

    void setHeight(double h)
    {
        height = h;
    }

    double getVolume()
    {
        return getArea()*height;
    }

    String ttoString()
    {
        return "Cylinder Base is a "+super.ttoString()+", Cylinder Height="+height;
    }
}

class circleDriver
{
    public static void main(String[] args) {
        Circle c = new Circle(4,5,1.0,"green");
        Cylinder cyl = new Cylinder(4,5,1.0,"green",10);
        System.out.println(c.ttoString());
        System.out.println(c.getArea());
        System.out.println(cyl.ttoString());
        System.out.println(cyl.getVolume());
    }
}