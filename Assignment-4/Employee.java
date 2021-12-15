class Employee	
{
    int empNo,basicSal,da,hra;
    double grossSAl;
	String empName;
    void getDetails(String name,int no,int sal,int da,int hra)
    {
        empName = name;
        empNo = no;
        basicSal = sal;
        this.da = da;
        this.hra = hra;
        calGrossSal();
    }

	void calGrossSal()
    {
        grossSAl = 0.2*basicSal + da + 0.1*hra;
    } 
	void showEmpDetails()
    {
        System.out.println(empName+"\t"+empNo+"\t"+basicSal+"\t"+da+"\t"+hra+"\t"+grossSAl);
	}
}



class empDriver
{
	public static void main(String args[])
	{
		Employee emp1=new Employee();
		emp1.getDetails("Ram",1,50000,10000,5000);
	    Employee emp2=new Employee();
		emp2.getDetails("Jkhunme",2,30000,30000,4000);	
        System.out.println("NAME\tEMPNO\tBASIC\tDA\tHRA\tGROSS");
        emp1.showEmpDetails();
        emp2.showEmpDetails();		
	}
}