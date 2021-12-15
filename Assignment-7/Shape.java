class Shape {
    private String color;
    private boolean filled;

    Shape()
    {
        color = "red";
        filled = true;
    }

    Shape(String c,boolean f)
    {
        color = c;
        filled = f;
    }

    String getColor()
    {
        return color;
    }

    void setColor(String c)
    {
        color = c;
    }

    boolean isFilled()
    {
        return filled;
    }

    void setFilled(boolean f)
    {
        filled = f;
    }

    String ttoString()
    {
        return "COLOR: "+color+", FILLED: "+filled;
    }
}



class Circle extends Shape
{
    private double radius;

    Circle()
    {
        radius = 1.0;
    }

    Circle(double r)
    {
        radius = r;
    }

    Circle(double r, String c, boolean f)
    {
        setColor(c);
        setFilled(f);
        radius = r;
    }

    double getRadius()
    {
        return radius;
    }

    void setRadius(double r)
    {
        radius = r;
    }

    double getArea()
    {
        return 3.14*radius*radius;
    }
    
    double getPerimeter()
    {
        return 2*3.14*radius;
    }

    String ttoString(){
		return "A Circle with radius = "+getRadius()+" which is a subclass of "+super.ttoString();
	}
}

class Rectangle extends Shape
{
	double width,length;
	
    Rectangle()
    {
		setWidth(1.0);
	    setLength(1.0);
	}

	Rectangle(double width1,double length1)
    {
	    setWidth(width1);
		setLength(length1);
	}

	double getWIDTH(){
		return width;
	}

	double getLENGTH(){
		return length;
	}

	void setWidth(double width1){
		width=width1;
	}
    void setLength(double length1){
		length=length1;
	}
    
	double getArea(){
		return width*length;
	}

	double getPerimeter(){
	    return 2*(width+length);
	}

	String ttoString(){
		return "A Rectangle with width = "+getWIDTH()+" and length = "+getLENGTH()+" which is a subclass of "+super.ttoString();
	}
}

class Square extends Rectangle
{
	Square()
    {
		super();
	}

    Square(double side)
    {
		super(side,side);
	}
    
	String ttoString()
    {
		return "A Square with side = "+getWIDTH()+" which is a subclass of "+super.ttoString();
	}

    void setLength(double l)
    {
        super.setLength(l);
    }

    void setWidth(double w)
    {
        super.setWidth(w);
    }
}

class ptDriver
{
    public static void main(String[] args) {
        
        // SHAPE
        Shape shp1 = new Shape();
        System.out.println(shp1.ttoString());
        Shape shp2 = new Shape("BLUE",false);
        System.out.println(shp2.ttoString());
        
        // CIRCLE
        Circle c1 = new Circle();
        System.out.println(c1.ttoString());
        Circle c2 = new Circle(5.5);
        System.out.println(c2.ttoString());

        // RECTANGLE
        Rectangle r1 = new Rectangle();
        System.out.println(r1.ttoString());
        Rectangle r2 = new Rectangle(2,3);
        System.out.println(r2.ttoString());
        
        // SQUARE
        Square s1 = new Square();
        System.out.println(s1.ttoString());
        Square s2 = new Square(5);
        System.out.println(s2.ttoString());
        
    }
}