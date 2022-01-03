// import java.util.function.DoubleUnaryOperator;

abstract class absShape{
	protected String color;
	protected boolean filled;
	absShape(){
		setColor("green");
		setFilled(true);
	}
	absShape(String color1,boolean filled1){
	    setColor(color1);
		setFilled(filled1);
	}
	String getColor(){
		return color;
	}
	void setColor(String color1){
		color=color1;
	}
	boolean isFilled(){
		return filled;
	}
	void setFilled(boolean filled1){
		filled=filled1;
	}
	abstract String tostring();
	abstract double getArea();
	abstract double getPerimeter();
    // abstract double getRadius();
		
}
class Circle extends absShape{
	protected double radius;
	Circle(){setRadius(0.0);}
	Circle(double radius1){
	    setRadius(radius1);
	}
	Circle(double radius1,String color1,boolean filled1){
	    setRadius(radius1);
		setColor(color1);
		setFilled(filled1);
	}
	double getRadius(){
		return radius;
	}
	void setRadius(double radius1){
		radius=radius1;
	}
	double getArea(){
		return 3.14*radius*radius;
	}
	double getPerimeter(){
	    return 2*3.14*radius;
	}
	String tostring(){
		return "A Circle with radius ="+getRadius()+" which is a subclass of "+tostring();
	}
}
class Rectangle extends absShape{
	protected double width,length;
	Rectangle(){
		setWidth(0.0);
	    setLength(0.0);
	}
	Rectangle(double width1,double length1){
	    setWidth(width1);
		setLength(length1);
	}
	Rectangle(double width1,double length1,String color1,boolean filled1){
	    setWidth(width1);
		setLength(length1);
		setColor(color1);
		setFilled(filled1);
	}
	double getWidth(){
		return width;
	}
	double getLength(){
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
	String tostring(){
		return "A Rectangle with width ="+getWidth()+" and length"+getLength()+" which is a subclass of "+tostring();
	}
}
class Square extends Rectangle{
	double side;
	Square(){}
	Square(double side){
		setSide(side);
	}
	Square(double side1,String color1,boolean filled1){
		setSide(side1);
		setColor(color1);
		setFilled(filled1);
	}
	double getSide(){
		return side;
	}
	void setSide(double side1){
		side=side1;
	}
	String tostring(){
		return "A Square with side ="+getSide()+" which is a subclass of "+tostring();
	}
	void setLength(double side)
    {
        super.setLength(side);
    }

    void setWidth(double side)
    {
        super.setWidth(side);
    }
}
	
class ptDriver1
{
    public static void main(String[] args) {
        
        
        absShape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1); // which version?
        System.out.println(s1.getArea()); // which version?
        System.out.println(s1.getPerimeter()); // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        // System.out.println(s1.getRadius());

        Circle c1 = (Circle)s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        // absShape s2 = new absShape();
        absShape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        // System.out.println(s3.getLength());

        Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        absShape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        // System.out.println(s4.getSide());
        // Take note that we downcast Shape s4 to Rectangle,
        // which is a superclass of Square, instead of Square

        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        // System.out.println(r2.getSide());
        System.out.println(r2.getLength());

    }
}