class Student {
    int roll,mark[]=new int[3];
    String name;
    Character sex;
    void GetInfo(int r, String n, int p, int q, int t, Character s)
    {
        roll = r;
        name = n;
        mark[0] = p;
        mark[1] = q;
        mark[2] = t;
        sex = s;
    }

    float CalMark(int m[])
    {
        int av=0;
        for(int i=0;i<m.length;i++)
            av+=m[i];
        return (float)av/m.length;
    }

    void ShowDetails()
    {
        System.out.println("NAME : "+name);
        System.out.println("ROLL NO. : "+roll);
        System.out.print("MARKS : ");
        for(int i=0;i<mark.length;i++)
            System.out.print(mark[i]+", ");
        System.out.println("\nAVERAGE MARK : "+CalMark(mark));
        System.out.println("SEX : "+sex);
    }
}



class Driver
{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.GetInfo(23, "Manas Das", 10, 20, 30, 'M');
        s1.ShowDetails();
        Student s2 = new Student();
        s2.GetInfo(24, "RPD", 10, 20, 30, 'M');
        s2.ShowDetails();
        Student s3 = new Student();
        s3.GetInfo(25, "Hades", 10, 20, 30, 'F');
        s3.ShowDetails();
        Student s4 = new Student();
        s4.GetInfo(26, "Locus", 10, 20, 30, 'F');
        s4.ShowDetails();
        Student s5 = new Student();
        s5.GetInfo(27, "Bizon", 10, 20, 30, 'M');
        s5.ShowDetails();
        
    }
}