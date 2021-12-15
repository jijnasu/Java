import java.util.Scanner;
class Account{
	int accNo,balance,timePeriod;
	static float rate=7.5f;
    
    Account(int ano,int p,int t){
        accNo = ano;
        balance = p;
        timePeriod = t;
    }

	float calculateIntrest()
    {
		return rate*balance/100;
	}

	void showAccDetails()
    {
		System.out.println("\nTHE ACC NO.: "+accNo+"\nBALANCE: "+balance+"\nAMOUNT OF INTREST: "+calculateIntrest());
	}

	static void changeIntRate(float newRate)
    {
		rate=newRate;
	}
}
class Driver{
	public static void main(String args[]){
		int n=3,ano,p,t;
        Scanner sc = new Scanner(System.in);
		Account ac[]=new Account[n];
		for(int i=0;i<n;i++)
        {
            System.out.println("\nEnter the ACCOUNT NO., BALANCE & TIME PERIOD : ");
            ano = sc.nextInt();
            p = sc.nextInt();
            t = sc.nextInt();
            ac[i]=new Account(ano,p,t);
        }
        
        System.out.println("\nAll account details with rate : "+Account.rate);
		for(int i=0;i<n;i++)
            ac[i].showAccDetails();
        
        Account.changeIntRate(9);
        
        System.out.println("\nAll account details with rate : "+Account.rate);
        for(int i=0;i<n;i++)
            ac[i].showAccDetails();
            
        sc.close();
    }
}