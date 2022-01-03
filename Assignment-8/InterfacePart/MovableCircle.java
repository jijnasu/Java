public class MovableCircle implements Movable { // saved as "MovableCircle.java"
    // instance variables
    private int radius;
    private MovablePoint center;


    // Constructor
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) 
    {
        this.radius = radius;
        center = new MovablePoint(x, y, xSpeed, ySpeed);
    }
    

    // Implement abstract methods declared in the interface Movable
    @Override
    public void moveUp() { 
        center.y -= center.ySpeed; 
    }
    
    @Override
    public void moveDown(){
        center.y += center.ySpeed;
    }

    @Override
    public void moveRight(){
        center.x -= center.xSpeed;
    }

    @Override
    public void moveLeft(){
        center.x += center.xSpeed;
    }
    
    public String toString(){
        return "A movable circle: radius = "+radius+" center is a point = "+center;
    }

}