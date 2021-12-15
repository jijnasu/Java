class Item	
{
    int quantity;
	double price;
	String name;
	Item(int q,double p,String n){
		quantity=q;
		price=p;
		name=n;
	}	
	String getName(){
	   return name;
    }
    double getPrice(){
 
	   return price;
    }
    int getQuantity(){
		return quantity;
    }
    double getValue(){
        double value=price*quantity;
		return value;
    }		
	void showDetails(){
		System.out.println("\t"+name+"\t"+"$"+price+"\t"+quantity+"\t$"+getValue());
	}	
}	
class Inventory
{
	public static void main(String args[])
	{
		Item i1=new Item(15,2.25,"Stapler");
		Item i2=new Item(5,2.99,"Ereaser");
		Item i3=new Item(9,4.75,"Pensil");
		System.out.println("\t"+"Name"+"\t"+"Price"+"\t"+"Quantity"+"\t"+"Value");
		System.out.println("---------------------------------------------------");
		i1.showDetails();
		i2.showDetails();
		i3.showDetails();
		System.out.println("\nTotal Inventory is $"+(i1.getValue()+i2.getValue()+i3.getValue()));		
	}
}	
