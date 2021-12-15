class Point2D {
    private int x,y;

    Point2D()
    {
        x = 0;
        y = 0;
    }

    Point2D(int x1,int y1)
    {
        x = x1;
        y = y1;
    }

    int getX()
    {
        return x;
    }

    int getY()
    {
        return y;
    }

    void setX(int x1)
    {
        x = x1;
    }

    void setY(int y1)
    {
        y = y1;
    }

    String ttoString()
    {
        return "("+String.valueOf(x)+","+String.valueOf(y)+")";
    }

}


class Point3D extends Point2D
{
    private int z;

    Point3D()
    {
        // x = 0;
        // y = 0;
        z = 0;
    }

    Point3D(int x1,int y1,int z1)
    {
        // x = x1;
        // y = y1;
        setX(x1);
        setY(y1);
        z = z1;
    }

    int getZ()
    {
        return z;
    }

    void setZ(int z1)
    {
        z = z1;
    }

    String ttoString()
    {
        return "("+String.valueOf(getX())+","+String.valueOf(getY())+","+String.valueOf(z)+")";
    }

}





class ptDriver
{
    public static void main(String[] args) {
        
        Point2D p21 = new Point2D(5,6);
        Point3D p31 = new Point3D(50,60,70);

        System.out.println(p21.ttoString());
        System.out.println(p21.getX());
        System.out.println(p21.getY());
        p21.setX(55);
        p21.setY(66);
        System.out.println(p21.getX());
        System.out.println(p21.getY());
        System.out.println(p21.ttoString());

        System.out.println("\n\n"+p31.ttoString());
        System.out.println(p31.getX());
        System.out.println(p31.getY());
        System.out.println(p31.getZ());
        p31.setX(555);
        p31.setY(666);
        p31.setZ(777);
        System.out.println(p31.getX());
        System.out.println(p31.getY());
        System.out.println(p31.getZ());
        System.out.println(p31.ttoString());
        
    }
}
