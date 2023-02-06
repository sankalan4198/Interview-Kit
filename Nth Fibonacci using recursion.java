public class Main
{
    
    static int fib(int n)
    {
        if(n<=1)
        {
            return n;
        }
        else
        {
            return fib(n-1)+fib(n-2);
        }
    }
	public static void main(String[] args) {
		int n=9;
		System.out.println(fib(n));
	}
}


//WITHOUT RECURSION
public class Main
{
	public static void main(String[] args) {
		 int i,a=0,b=1,c;
       
       int n=9;
        for(i=2;i<=n;i++)
        {
            //System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
        System.out.print(b+" ");
	}
}
