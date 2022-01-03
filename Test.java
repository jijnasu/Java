class MinimumBalanceException extends Exception
{ 
    public MinimumBalanceException(String s)
    {
        super(s);
    }
}
class Account{
	String name;
    int accNo;
    double balance;
    Account(String name,int accNo,double balance){
        this.name=name;
        this.accNo=accNo;
        this.balance=balance;
    }
	void deposit(int amt){
		balance+=amt;
	}
    void withdraw(int amt){
        if(amt>balance)System.out.println("Amount is more than balance.");
        try
		{
			if(balance-amt<=500){
				throw new MinimumBalanceException("operation cannot be done balance less than 500");
			   }
			else
				balance-=amt;

		}
		catch(MinimumBalanceException s)
		{
			System.out.println(s);
		}
	}
    void transfer(Acccount acc1,Acccount acc2,int amt){
		acc1.withdraw(amt);
        acc2.deposit(amt);
	}
}

class Test{
	public static void main(String args[]){
		Account acc=new Account("jk",3452627,1000);
		acc.withdraw(600);
	}
}