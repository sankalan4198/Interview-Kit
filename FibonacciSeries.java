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
