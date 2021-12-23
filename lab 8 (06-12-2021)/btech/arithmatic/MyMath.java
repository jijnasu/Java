package btech.arithmatic;
public class MyMath{
	double a;
	double b;
	public MyMath(){
		a=0.0;
		b=0.0;
	}
	
	public MyMath(double a,double b){
		this.a=a;
		this.b=b;
	}
		
	public double add(){
		return this.a+this.b;
	}
	
	public double sub(){
		return this.a-this.b;
	}
	
	public double mul(){
		return this.a*this.b;
	}
	
	public double div(){
		return this.a/this.b;
	}
	public double mod(){
		return this.a%this.b;
	}
}