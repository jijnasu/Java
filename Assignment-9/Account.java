class MinimumBalanceException extends Exception
{
    MinimumBalanceException(String s)
    {
        super(s);
    }
}

public class Account {
    // account(){}
    String name;
    int acc_no;
    double balance;

    Account(String n,int accno,double bal)
    {
        name = n;
        acc_no = accno;
        balance = bal;
        check_exception(balance);
    }

    boolean check_exception(double bal)
    {
        try
        {
            if(bal<500.0)
                throw new MinimumBalanceException("ERROR!!! Account balance cannot be less than 500...");
        }
        catch(MinimumBalanceException s)
        {
            System.out.println("\n"+s);
            return false;
        }
        return true;
    }
    
    void deposit(double amt)
    {
        balance += amt;
    }

    void withdraw(double amt)
    {
        if(check_exception(balance-amt))
            balance -= amt;

    }

    public static void transfer(Account ac1,Account ac2,double amt)
    {
        double temp = ac1.balance;
        ac1.withdraw(amt);
        if(temp!=ac1.balance)
            ac2.deposit(amt);
    }

    void display()
    {
        System.out.println("\nNAME: "+name);
        System.out.println("ACCOUNT NO.: "+acc_no);
        System.out.println("BALANCE: "+balance);
    }
}


class AccountDriver
{
    public static void main(String[] args) {
        Account ac1 = new Account("jijnasu", 3578, 600);
        Account ac2 = new Account("kumar", 5050, 1000);
        
        // it works
        Account.transfer(ac2,ac1,300);
        ac1.display();
        ac2.display();
        
        // it throws error
        Account.transfer(ac1,ac2,600);
        ac1.display();
        ac2.display();
        
        
    }
}