package btech.arithmetic;
public class MyMath{
	int a,b;
	public MyMath(int a,int b){
		this.a=a;
		this.b=b;
	}
	public int doSum(){
		return a+b;
	}
	public int dosub(){
		return a-b;
	}
	public int domul(){
		return a*b;
	}
	public int dodiv(){
		return a/b;
	}
	public int dorem(){
		return a%b;
	}
}