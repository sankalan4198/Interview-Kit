import java.util.Scanner;
public class PrimeNumberUnderLimit {
    public static void main(String args[])
    {
        int i;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the upper limit: ");
        int u= sc.nextInt();
        System.out.println("The Prime numbers till "+u+" are: ");

        for(int x=0;x<=u;x++)
        {
            for( i=2;i<x;i++)
            {
                if(x%i==0)
                    break;
            }
            if(i==x)
                System.out.println(x);
        }

    }
}
