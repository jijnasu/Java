public class MovablePoint implements Movable {
    // instance variables
    int x, y, xSpeed, ySpeed; // package access
    
    // Constructor
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Implement abstract methods declared in the interface Movable
    @Override
    public void moveUp() {
        y -= ySpeed; 
    }

    @Override
    public void moveDown() {
        y += ySpeed; 
    }

    @Override
    public void moveLeft() {
        x -= xSpeed; 
    }

    @Override
    public void moveRight() {
        x += xSpeed; 
    }

    public String toString(){
        return "x coordinate = "+x+", y co-ordinate = "+y;
    }
    
}