import java.util.Scanner;
public class PrimeNumber {
    public static void main(String args[])
    {
        int count=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                count++;
        }
        if(count==2)
        {
            System.out.println(n+" is a prime number");
        }
        else
        {
            System.out.println(n+" is not a prime number");
        }

    }
}
