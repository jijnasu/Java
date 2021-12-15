class Person6 {
    private String name;
    private String address;

    Person6()
    {

    }

    Person6(String n, String a)
    {
        name = n;
        address = a;
    }

    String getName()
    {
        return address;
    }

    String getAddress()
    {
        return address;
    }

    void setName(String n)
    {
        name = n;
    }

    void setAddress(String a)
    {
        address = a;
    }

    String ttoString()
    {
        return name+"("+address+")";
    }
}


class Student6 extends Person6
{
    private int numCourses;
    private String courses[];
    private int grades[];

    Student6()
    {

    }

    Student6(String n, String a)
    {
        setName(n);
        setAddress(a);
    }
    
    void addCourseGrade(String c[], int g[])
    {
        numCourses = c.length;
        courses = c;
        grades = g;
    }

    void printGrades()
    {
        System.out.println("Number of courses = "+numCourses);
        for(int i=0;i<grades.length;i++)
            System.out.println((i+1)+":\t"+courses[i]+" :- "+grades[i]);
    }

    double getAverageGrade()
    {
        int sum = 0;
        for(int i=0;i<numCourses;i++)
            sum += grades[i];
        return 1.0*sum/numCourses;
    }

    String ttoString()
    {
        return "Student: "+super.ttoString();
    }
}


class Teacher6 extends Person6
{
    private int numCourses;
    private String courses[];

    Teacher6(String n,String a)
    {
        setName(n);
        setAddress(a);
    }

    boolean addCourse(String c)
    {
        for(int i=0;i<numCourses;i++)
            if(courses[i]==c)
                return false;

        numCourses += 1;
        String tcrs[] = new String[numCourses];
        for(int i=0;i<numCourses-1;i++)
            tcrs[i] = courses[i];
        tcrs[numCourses-1] = c;
        courses = tcrs;
        return true;
    }

    boolean removeCourse(String c)
    {
        for(int i=0;i<numCourses;i++)
            if(courses[i]==c)
            {
                int k=0;
                String tcrs[] = new String[numCourses-1];
                for(i=0;i<numCourses;i++)
                    if(courses[i]!=c)
                        tcrs[k++] = courses[i];
                
                return true;
            }

        return false;
    }

    String ttoString()
    {
        return "Teacher: "+super.ttoString();
    }
}

class personDriver
{
    public static void main(String[] args) {
        Student6 stu = new Student6("hemlo gmys","bbsr1");
        String c[] = {"crs A","crs B","crs C"};
        int g[] = {30,50,70};
        stu.addCourseGrade(c,g);
        stu.printGrades();
        System.out.println("Average : "+stu.getAverageGrade()+"\n"+stu.ttoString());


        Teacher6 th = new Teacher6("theacher one", "bbsr2");
        System.out.println(th.addCourse("course-1"));
        System.out.println(th.addCourse("course-2"));
        System.out.println(th.addCourse("course-1"));
        System.out.println(th.addCourse("course-3"));
        System.out.println(th.removeCourse("course-3"));
        System.out.println(th.removeCourse("course-5"));
        System.out.println(th.ttoString());
    }
}