import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,r,c,sum=0,temp;
        System.out.println("Enter a number: ");
        n=sc.nextInt();
        temp=n;
        while(n>0)
        {
            r=n%10;
            c=r*r*r;
            sum=sum+c;
            n=n/10;
        }
        n=temp;
        if(n==sum)
        {
            System.out.println(n+" is an Armstrong number.");
        }
        else
        {
            System.out.println(n+" is not an Armstrong number.");

        }
    }
}
