class Addcomplex{
	int img,real;
	void getComplex(int r,int i){
		img=i;
		real=r;
	}
    void addComplex(Addcomplex A2){
	    real=real+A2.real;
		img=img+A2.img;
	}
	void complex(){
		System.out.println("final complex no.: "+real+" + i"+img);
	}
}
class isumDriver{
 public static void main(String args[]){  
    Addcomplex A1=new Addcomplex();
    Addcomplex A2=new Addcomplex();	
	A1.getComplex(2,3);
	A2.getComplex(1,4);
	A1.addComplex(A2);
	A1.complex();
}
}