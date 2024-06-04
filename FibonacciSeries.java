import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String args[])
    {
        int i,a=0,b=1,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n=sc.nextInt();
        for(i=0;i<=n;i++)
        {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}
//Using Recursion

public class FibinacciSeries_Recursion {

    public static void main(String args[])
    {
        int n=5;

        if(n==0)
        {
            System.out.println(0);
        }
        else
        {
            int fib[]=new int[n+1];
            fib[0]=0;
            fib[1]=1;

            for(int i=2;i<=n;i++)
            {
                fib[i]=fib[i-1] + fib[i-2];
            }
            System.out.println("The Fibonacci Series up to "+n+"th term:");
            for (int i = 0; i <= n; i++) {
                System.out.print(fib[i] + " ");
            }
        }

    }
}
