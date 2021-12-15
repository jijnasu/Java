class myStack {
    int max,top;
    int stk[]=new int[20];
    void stklen(int n)
    {
        this.max=n;
        this.top = -1;
        // this.stk[]=new int[n];
    }
    
    void push(int v)
    {
        if(this.top<this.max-1)
            this.stk[++this.top]=v;
        else
            System.out.println("Stack overflow...");
    }
        
    void pop()
    {
        if(this.top<0)
            System.out.println("Stack underflow...");
            else
            System.out.println("Poped element is: "+this.stk[this.top--]);
    }
    
    void traverse()
    {
        if(this.top<0)
            System.out.println("Stack is empty...");
        else
        {
            System.out.print("Stack is : ");
            for(int i=0;i<=this.top;i++)
                System.out.print(this.stk[i]+", ");
            System.out.println();
        }
    }
}
    

class stkDriver
{
    public static void main(String[] args) {
        myStack s=new myStack();
        s.stklen(3);
        s.push(35);
        s.push(3);
        s.push(5);
        s.push(85);
        s.traverse();
        s.pop();
        s.traverse();
        s.pop();
        s.traverse();
        s.pop();
        s.traverse();
        s.pop();
        s.traverse();
    }
}