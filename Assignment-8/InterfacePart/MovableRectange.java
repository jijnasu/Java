public class MovableRectange implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectange(int x1,int y1, int x2, int y2, int xsp, int ysp)
    {
        topLeft = new MovablePoint(x1,y1,xsp,ysp);
        bottomRight = new MovablePoint(x2,y2,xsp,ysp);
    }

    public String toString(){
        return "A movable rectangle with top left point= "+topLeft+" bottom right point="+bottomRight;
    }

    @Override
    public void MoveUp(){
        topLeft.MoveUp();
        bottomRight.MoveUp();
    }

    @Override
    public void MoveDown(){
        topLeft.MoveDown();
        bottomRight.MoveDown();
    }

    @Override
    public void MoveLeft(){
        topLeft.MoveLeft();
        bottomRight.MoveLeft();
    }

    @Override
    public void MoveRight(){
        topLeft.MoveRight();
        bottomRight.MoveRight();
    }

}
